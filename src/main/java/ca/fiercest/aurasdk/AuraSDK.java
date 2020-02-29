package ca.fiercest.aurasdk;

import ca.fiercest.aurasdk.com4j.ClassFactory;
import ca.fiercest.aurasdk.com4j.IAuraDeviceCollection;
import ca.fiercest.aurasdk.com4j.IAuraSdk2;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AuraSDK
{
    @Getter private IAuraSdk2 sdk;
    private boolean isControlled = false;

    /**
     * Creates the main AuraSDKObject.
     * @param takeControl Whether to invoke {@link AuraSDK#GainControl()} on instantiation.
     */
    public AuraSDK(boolean takeControl)
    {
        sdk = ClassFactory.createAuraSdk();
        if(takeControl)
            GainControl();

        Runtime.getRuntime().addShutdownHook(new Thread(this::ReleaseControl));
    }

    /**
     * Creates the main AuraSDKObject. and calls {@link AuraSDK#AuraSDK(boolean)} as true.
     * Taking control of the SDK on instantiation.
     */
    public AuraSDK()
    {
        this(true);
    }

    private Map<AuraDeviceType, List<AuraSDKDevice>> deviceCache = new HashMap<>();
    private Map<AuraDeviceType, List<AuraRGBLight>> lightCache = new HashMap<>();

    /**
     * Gets a List of lighting zones from the devices with {@link AuraDeviceType} {@link AuraDeviceType#All}.
     * @return A list of available lighting zones.
     */
    public List<AuraRGBLight> getAllLights()
    {
        return getAllLights(AuraDeviceType.All);
    }

    /**
     * Gets a list of lighting zones from devices with specified {@link AuraDeviceType}.
     * @param deviceType The {@link AuraDeviceType} to filter the resultant lighting zones by.
     * @return List of available available lighting zones from devices matching deviceType.
     */
    public List<AuraRGBLight> getAllLights(AuraDeviceType deviceType)
    {
        return getDevices(deviceType).stream().flatMap(m -> m.getLightZones().stream()).collect(Collectors.toList());
    }

    /**
     * Gets a List of devices of {@link AuraDeviceType} {@link AuraDeviceType#All}.
     * @return A list of available devices.
     */
    public List<AuraSDKDevice> getDevices()
    {
        return getDevices(AuraDeviceType.All);
    }

    /**
     * Gets a list of devices with specified {@link AuraDeviceType}.
     * @param deviceType The {@link AuraDeviceType} to filter the resultant devices by.
     * @return List of available available devices matching deviceType.
     */
    public List<AuraSDKDevice> getDevices(AuraDeviceType deviceType)
    {
        if(deviceCache.containsKey(deviceType))
            return deviceCache.get(deviceType);

        IAuraDeviceCollection devices = sdk.enumerate(deviceType.getId());
        List<AuraSDKDevice> returnDevices = new ArrayList<>();
        for(int i = 0; i < devices.count(); i++)
            returnDevices.add(new AuraSDKDevice(devices.item(i)));

        deviceCache.put(deviceType, returnDevices);

        return returnDevices;
    }

    /**
     * Gets a Mapping of all available devices and a list of their {@link AuraRGBLight}.
     * @return Map of available devices and their {@link AuraRGBLight} list.
     */
    public Map<AuraSDKDevice, List<AuraRGBLight>> getLightsWithDevice()
    {
        Map<AuraSDKDevice, List<AuraRGBLight>> map = new HashMap<>();
        getDevices().forEach(d -> map.put(d, d.getLightZones()));
        return map;
    }

    /**
     * Sets the color of all devices associated with this SDK instance.
     * @param color Desired Color.
     */
    public void setAllColors(Color color)
    {
        getDevices().forEach(d -> d.setColor(color));
    }

    /**
     * Releases control of the SDK.
     * Runs automatically on shutdown.
     * Must be run on shutdown.
     */
    public void ReleaseControl()
    {
        if(!isControlled)
            return;
        sdk.releaseControl(0);
        isControlled = false;
    }

    /**
     * Takes control of the SDK.
     * Can only be run if the SDK is released or has not been taken control of.
     */
    public void GainControl()
    {
        if(isControlled)
            return;
        sdk.switchMode();
        isControlled = true;
    }

    /**
     * Restarts SDK control if it is currently running. Otherwise, it will only invoke {@link AuraSDK#GainControl()}. Effectively starting the SDK.
     */
    public void RestartControl()
    {
        ReleaseControl();
        GainControl();
    }
}

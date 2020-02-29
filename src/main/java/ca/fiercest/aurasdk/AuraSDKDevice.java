package ca.fiercest.aurasdk;

import ca.fiercest.aurasdk.com4j.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class AuraSDKDevice
{
    @Getter private AuraDeviceType type;
    @Getter private String name;
    @Getter private long width;
    @Getter private long height;

    IAuraDevice rawDevice;

    /**
     * Creates an AuraSDKDevice, depicting a lighting capable device from the SDK.
     * @param rawDevice The raw {@link IAuraDevice} connecting to the SDK's COM library.
     */
    public AuraSDKDevice(IAuraDevice rawDevice)
    {
        this.rawDevice = rawDevice;
        type = AuraDeviceType.byInt(rawDevice.type());
        name = rawDevice.name();
        width = rawDevice.width();
        height = rawDevice.height();
        getLightZones();
    }

    List<AuraRGBLight> rgbLightCache = new ArrayList<>();

    /**
     * Gets a list of all available lighting zones.
     * @return List of lighting zones for this device.
     */
    public List<AuraRGBLight> getLightZones()
    {
        if(!rgbLightCache.isEmpty())
            return rgbLightCache;

        IAuraRgbLightCollection lights = rawDevice.lights();
        int count = lights.count();
        for(int i = 0; i < count; i++)
            rgbLightCache.add(new AuraRGBLight(this, lights.item(i)));

        return rgbLightCache;
    }

    /**
     * Sets the color of the specified light.
     * @param light Specified light.
     * @param color Desired color.
     */
    public void setColor(AuraRGBLight light, Color color)
    {
        light.setColor(color);
    }

    /**
     * Sets the color of a group of light.
     * @param lights The group of keys.
     * @param color Desired Color.
     */
    public void setColor(List<AuraRGBLight> lights, Color color)
    {
        lights.forEach(l -> l.setColor(color, false));
        apply();
    }

    /**
     * Sets all device lights to a certain color.
     * @param color Desired Color.
     */
    public void setColor(Color color)
    {
        setColor(getLightZones(), color);
    }

    /**
     * Method to apply lighting effects to the device.
     * Done automatically in {@link AuraSDKDevice#setColor(Color)}, {@link AuraSDKDevice#setColor(AuraRGBLight, Color)}, {@link AuraSDKDevice#setColor(List, Color)}
     */
    public void apply()
    {
        new Thread(() -> rawDevice.apply()).start();
    }
}

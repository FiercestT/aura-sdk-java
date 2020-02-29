import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;
import ca.fiercest.aurasdk.Color;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestAuraSDK
{
    public static AuraSDK sdk;

    private static final Color WHITE = new Color(255, 255, 255);
    private static final Color RED = new Color(255, 0, 0);
    private static final Color GREEN = new Color(0, 255, 0);
    private static final Color BLUE = new Color(0, 0, 255);
    private static final Color PINK = new Color(255, 0, 255);
    private static final Color ORANGE = new Color(255, 165, 0);

    public static void Print(String TAG, Object message)
    {
        System.out.printf("[%s] %s\n", TAG, message);
    }

    @BeforeClass
    public static void setUp()
    {
        sdk = new AuraSDK();
    }

    @AfterClass
    public static void Release()
    {
        sdk.ReleaseControl();
    }

    @Test
    public void ColorTests()
    {
        Assert.assertEquals(0xFFFFFF, WHITE.asIntBGR());
        Assert.assertEquals(0x0000FF, RED.asIntBGR());
        Assert.assertEquals(0x00FF00, GREEN.asIntBGR());
        Assert.assertEquals(0xFF0000, BLUE.asIntBGR());
        Assert.assertEquals(0xFF00FF, PINK.asIntBGR());
        Assert.assertEquals(0x00A5FF, ORANGE.asIntBGR());
    }

    @Test
    public void GetDevices()
    {
        Print("GetDevices", "Printing Devices");
        sdk.getDevices().forEach(d -> Print("GetDevices", "Name: " + d.getName() + ". Light Zones: " + d.getLightZones().size()));
        Print("GetDevices", "Total Lighting Zones: "  + sdk.getAllLights().size());
    }

    @Test
    public void MapTest() throws Exception
    {
        Print("MapTest", "Mapping Test: Orange");
        Map<AuraSDKDevice, List<AuraRGBLight>> map = sdk.getLightsWithDevice();
        map.entrySet().iterator().forEachRemaining(m -> Print("MapTest", "Device: " + m.getKey().getName() + " - Size: " + m.getValue().size()));
        AuraSDKDevice device = sdk.getDevices().get(0);
        Print("MapTest", "Got: " + map.get(device).size() + " LEDs for" + device.getName());
        Thread.sleep(2500);
    }

    @Test
    public void ColorTest() throws Exception
    {
        String TAG = "ColorTest";
        Print(TAG, "Begin " + TAG);
        Print(TAG, "White");
        sdk.setAllColors(WHITE);
        Thread.sleep(500);
        Print(TAG, "Red");
        sdk.setAllColors(RED);
        Thread.sleep(500);
        Print(TAG, "Blue");
        sdk.setAllColors(BLUE);
        Thread.sleep(500);
        Print(TAG, "Green");
        sdk.setAllColors(GREEN);
        Thread.sleep(500);
    }

    @Test
    public void ColorMethodTest() throws Exception
    {
        String TAG = "ColorMethodTest";
        Print(TAG, "Begin " + TAG);
        Print(TAG, "Stage 1: White");
        sdk.setAllColors(WHITE);
        Thread.sleep(500);
        Print(TAG, "Stage 2: Red");
        sdk.getDevices().forEach(d -> d.setColor(RED));
        Thread.sleep(500);
        Print(TAG, "Stage 3: Green");
        sdk.getDevices().forEach(d -> d.setColor(d.getLightZones().get(0), GREEN));
        Thread.sleep(500);
        Print(TAG, "Stage 4: Blue");
        sdk.getDevices().forEach(d -> {
            List<AuraRGBLight> changeZones = d.getLightZones().stream().filter(z -> (z.getName().charAt(z.getName().length()-1)) % 2 == 0).collect(Collectors.toList());
            Print(TAG, "Stage 4: Blue - Setting Following Zones: " + d.getName() + " - " + changeZones.size() + "/" + d.getLightZones().size());
            d.setColor(changeZones, BLUE);
        });
        Thread.sleep(500);
    }

    @Test
    public void QuickStartTest() throws Exception
    {
        //Create the Aura SDK Object
        AuraSDK sdk = new AuraSDK();

        //Create a custom Color (using ca.fiercest.aurasdk.Color)
        Color myRedColor = new Color(255, 0, 0);

        //Set all device Colors
        sdk.setAllColors(myRedColor);

        for(AuraSDKDevice device : sdk.getDevices())
        {
            //Get the name of the device.
            String deviceName = device.getName();
            //Get all of the light zones for this device.
            List<AuraRGBLight> deviceLightZones = device.getLightZones();
            //Get the amount of light zones from the list size.
            int lightCount = deviceLightZones.size();
            //Print the device info.
            System.out.println("Found Device Name: " + deviceName + ", Light Zones: " + lightCount);

            //Get the first light zone from this device
            AuraRGBLight deviceFirstLight = deviceLightZones.get(0);
            //Set its color
            deviceFirstLight.setColor(new Color(0, 255, 0)); //Green
            //Print the zone name and its color
            System.out.println("Light Zone Name: " + deviceFirstLight.getName() + ", Zone Color: " + deviceFirstLight.getColor());
        }

        //Wait so we can see the effects.
        Thread.sleep(2500);

        //Manually Release Control of the SDK (recommended, but should automatically invoke on shutdown if not done manually).
        sdk.ReleaseControl();
    }
}

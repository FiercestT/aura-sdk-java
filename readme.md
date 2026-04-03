> **Note:** This project is no longer maintained. It might still work, but there are no guarantees.

# Asus Aura SDK Wrapper for Java

A Java wrapper for the Asus Aura SDK that allows you to control RGB lighting on GPUs, motherboards, RGB headers, and other Asus devices.

**Note:** This will only work on a 32-bit JVM.

Documentation
---

[See the wiki.](https://github.com/FiercestT/aura-sdk-java/wiki)

### Installation

Add the JAR from the [releases](https://github.com/FiercestT/aura-sdk-java/releases) to your classpath. A Com4j DLL will be created in the directory where the program is executed. This is required to interact with the Aura COM Library.

### Does it Actually Work?

Yes! The Aura SDK provided on the official Asus website (version 2.0) does not work. Instead, the Asus Aura SDK was ported to a COM Type Library, which this wrapper interfaces with.

### Building

The project uses Lombok. Follow [this guide](https://www.baeldung.com/lombok-ide) to configure it with your IDE.

### Quick Start Example

```java
import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;
import ca.fiercest.aurasdk.Color;

public class Quickstart
{
    public static void main(String... args) throws Exception
    {
        // Create the Aura SDK object
        AuraSDK sdk = new AuraSDK();

        // Create a custom color
        Color myRedColor = new Color(255, 0, 0);

        // Set all device colors
        sdk.setAllColors(myRedColor);

        for (AuraSDKDevice device : sdk.getDevices())
        {
            // Get the name of the device
            String deviceName = device.getName();
            // Get all of the light zones for this device
            List<AuraRGBLight> deviceLightZones = device.getLightZones();
            // Get the amount of light zones from the list size
            int lightCount = deviceLightZones.size();
            // Print the device info
            System.out.println("Found Device Name: " + deviceName + ", Light Zones: " + lightCount);

            // Get the first light zone from this device
            AuraRGBLight deviceFirstLight = deviceLightZones.get(0);
            // Set its color
            deviceFirstLight.setColor(new Color(0, 255, 0)); // Green
            // Print the zone name and its color
            System.out.println("Light Zone Name: " + deviceFirstLight.getName() + ", Zone Color: " + deviceFirstLight.getColor());
        }

        // Wait so we can see the effects
        Thread.sleep(2500);

        // Manually release control of the SDK (recommended, but should automatically invoke on shutdown if not done manually)
        sdk.ReleaseControl();
    }
}

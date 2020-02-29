Asus Aura SDK Wrapper for Java
===
### What is It?

A Java Wrapper for the Asus Aura SDK that allows you to control your lights (GPU, Motherboard, RGB Headers, Asus Device, etc).

### Does it Actually Work (Unlike others)?

YES! <br>
The provided Aura SDK on the website (version 2.0) does not work.
Instead, the Asus Aura SDK was ported to a COM Type Library which this wrapper is interfacing... AND WORKS. Note: This wrapper was compiled for a 32 bit jvm.

### Installation
Currently, you can add the jar manually to the classpath from the [releases](https://github.com/FiercestT/aura-sdk-java/releases). I will be making a maven repo for it soon.
Please note, that a Com4j dll will be created in the directory that the program is executed. This is required to interact with the Aura COM Library.

### Building
The project now uses Lombok, follow this [this](https://www.baeldung.com/lombok-ide) guide to configure it with your IDE.

### Documentation

[See the wiki.](https://github.com/FiercestT/aura-sdk-java/wiki)

Some objects from the package `ca.fiercest.aurasdk.com4j` are public to be accessed by the frontend wrapper. These are all denoted by `I{name}`
and I do not recommend using them unless you are creating a PR or adding functionality.

### Quick Start Example
```java
import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;
import ca.fiercest.aurasdk.Color;

public class Quickstart
{
    public static void main(String... args)
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
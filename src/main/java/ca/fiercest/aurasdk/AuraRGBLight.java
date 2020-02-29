package ca.fiercest.aurasdk;

import ca.fiercest.aurasdk.com4j.IAuraRgbLight;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class AuraRGBLight
{
    @Getter String name;
    Color color;

    @Getter(AccessLevel.PRIVATE) private IAuraRgbLight rawLight;
    @Getter private AuraSDKDevice $parent;

    /**
     * Creates an AuraRGBLight, depicting a lighting zone attached to a {@link AuraSDKDevice}.
     * @param parent The Parent device that this lighting zone belongs to.
     * @param rawLight The raw interface of the COM object of this light.
     */
    public AuraRGBLight(AuraSDKDevice parent, IAuraRgbLight rawLight)
    {
        this.rawLight = rawLight;
        this.$parent = parent;
        name = rawLight.name();
        color = new Color(rawLight.red(), rawLight.green(), rawLight.blue());
    }

    /**
     * Sets the color of the key and automatically applies it.
     * @param color Desired Color.
     */
    public void setColor(Color color)
    {
        setColor(color, true);
    }

    /**
     * Sets the color of the key.
     * @param color Desired Color.
     * @param apply Whether to automatically apply the change or not. Calls {@link AuraSDKDevice#apply()} on this zone's {@link AuraRGBLight#$parent}.
     */
    public void setColor(Color color, boolean apply)
    {
        getRawLight().color(color.asIntBGR());
        this.color = color;
        if(apply)
            $parent.apply();
    }

    /**
     * Gets the color of the lighting zone.
     * @return The Color of this lighting zone.
     */
    public Color getColor()
    {
        return new Color(rawLight.color());
    }
}

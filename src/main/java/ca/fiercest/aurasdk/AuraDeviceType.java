package ca.fiercest.aurasdk;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum AuraDeviceType
{
    All(0x00000000),
    Motherboard(0x00010000),
    Motherboard_LED_Strip(0x00011000),
    All_In_One_Pc(0x00012000),
    VGA(0x00020000),
    Display(0x00030000),
    Headset(0x00040000),
    Microphone(0x00050000),
    External_HDD(0x00060000),
    External_BD_Drive(0x00061000),
    DRAM(0x00070000),
    Keyboard(0x00080000),
    Notebook_Keyboard(0x00081000),
    Notebook_Keyboard_4_Zone_Type(0x00081001),
    Mouse(0x00090000),
    Chassis(0x000B0000),
    Projector(0x000C0000);

    private final int id;

    /**
     * Gets a value from the {@link AuraDeviceType} enum based on its int id value.
     * @param id The id to search for.
     * @return The enum of that ID. If it is not found, {@link AuraDeviceType#All} will be returneds.
     */
    public static AuraDeviceType byInt(int id)
    {
        return Arrays.stream(values()).filter(v -> v.getId() == id).findFirst().orElse(All);
    }
}
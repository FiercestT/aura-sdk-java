package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraDeviceWithTemperature
 */
@IID("{155F9E43-F16F-4DE8-A126-267EFE1B297C}")
interface IAuraDeviceThermal extends IAuraDevice {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(28)
  int getTemperature();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(29)
  String getTemperatureName();


  /**
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(30)
  void reset();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(31)
  int isResetSupported();


  // Properties:
}

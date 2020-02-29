package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraMbHal
 */
@IID("{9791CAFE-7576-41FF-9DDA-93A9619CF413}")
interface IAuraMbHal extends IAuraHal {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(8)
  int getBiosOnOff();


  /**
   * @param value Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(9)
  void setBiosOnOff(
          int value);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(10)
  int getBiosStandbyOnOff();


  /**
   * @param value Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(11)
  void setBiosStandbyOnOff(
          int value);


  // Properties:
}

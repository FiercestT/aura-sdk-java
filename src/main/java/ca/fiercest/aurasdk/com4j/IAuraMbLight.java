package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraMbLight
 */
@IID("{EBC2ECDC-1B1B-4613-8972-19C0ECEEB5BF}")
interface IAuraMbLight extends ca.fiercest.aurasdk.com4j.IAuraRgbLight {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Speed"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  int speed();


  /**
   * <p>
   * Setter method for the COM property "Speed"
   * </p>
   * @param pVal Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void speed(
          int pVal);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  int direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param pVal Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void direction(
          int pVal);


  /**
   * <p>
   * Getter method for the COM property "LocationId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  int locationId();


  // Properties:
}

package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraRgbKey
 */
@IID("{95E6C828-6DE4-441E-873A-C44AE850F3A2}")
interface IAuraRgbKey extends ca.fiercest.aurasdk.com4j.IAuraRgbLight {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Code"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  short code();


  /**
   * <p>
   * Getter method for the COM property "X"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  int x();


  /**
   * <p>
   * Getter method for the COM property "Y"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  int y();


  // Properties:
}

package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraRgbKeyState
 */
@IID("{1B527A31-8A3E-4477-964B-4681BBC02BDD}")
interface IAuraRgbKeyState extends IAuraRgbKey {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  int state();


  // Properties:
}

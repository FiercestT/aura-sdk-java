package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraRgbKeyStateCollection Interface
 */
@IID("{935057FF-DDBE-4104-9795-F5566DCADE33}")
interface IAuraRgbKeyStateCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * property _NewEnum
   * </p>
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * property Count
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * property Item
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbKeyState
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  IAuraRgbKeyState item(
          int index);


  // Properties:
}

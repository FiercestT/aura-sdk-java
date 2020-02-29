package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraEffect
 */
@IID("{A9657187-6D1A-4387-AA54-98FE83D65B5C}")
interface IAuraEffect extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int id();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Synchronized"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int _synchronized();


  // Properties:
}

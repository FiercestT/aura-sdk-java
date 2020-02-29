package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraHalInfo
 */
@IID("{BA174006-7901-4396-8A8D-BA5327E45FC6}")
interface IAuraHalInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Guid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  String guid();


  /**
   * <p>
   * Getter method for the COM property "Pluging"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(8)
  int pluging();


  /**
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraHal
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(9)
  IAuraHal createHal();


  // Properties:
}

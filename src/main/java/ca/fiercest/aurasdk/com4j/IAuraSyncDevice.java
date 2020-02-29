package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraSyncDevice Interface
 */
@IID("{6A30D789-F5DA-4F26-BF09-6DFB9DEDF91E}")
interface IAuraSyncDevice extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Lights"
   * </p>
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbLightCollection
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(7)
  IAuraRgbLightCollection lights();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={IAuraRgbLightCollection.class})
  IAuraRgbLight lights(
          int index);

  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(8)
  int type();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(9)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(10)
  int width();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(11)
  int height();


  /**
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  void apply();


  // Properties:
}

package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraRgbLight
 */
@IID("{9AF6260E-4311-417D-B3EF-B85A34CF3244}")
public interface IAuraRgbLight extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Red"
   * </p>
   * @return  Returns a value of type byte
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  byte red();


  /**
   * <p>
   * Setter method for the COM property "Red"
   * </p>
   * @param pVal Mandatory byte parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void red(
          byte pVal);


  /**
   * <p>
   * Getter method for the COM property "Green"
   * </p>
   * @return  Returns a value of type byte
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  byte green();


  /**
   * <p>
   * Setter method for the COM property "Green"
   * </p>
   * @param pVal Mandatory byte parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void green(
          byte pVal);


  /**
   * <p>
   * Getter method for the COM property "Blue"
   * </p>
   * @return  Returns a value of type byte
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  byte blue();


  /**
   * <p>
   * Setter method for the COM property "Blue"
   * </p>
   * @param pVal Mandatory byte parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void blue(
          byte pVal);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  int color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param pVal Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void color(
          int pVal);


  // Properties:
}

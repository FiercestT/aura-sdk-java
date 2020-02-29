package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraSyncKeyboard Interface
 */
@IID("{87B03DD6-59E6-44F5-8772-56A7494F9900}")
interface IAuraSyncKeyboard extends IAuraSyncDevice {
  // Methods:
  /**
   * <p>
   * Get Light From Key
   * </p>
   * <p>
   * Getter method for the COM property "Key"
   * </p>
   * @param keyCode Mandatory short parameter.
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbLight
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(13)
  IAuraRgbLight key(
          short keyCode);


  /**
   * <p>
   * Getter method for the COM property "Keys"
   * </p>
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbKeyCollection
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(14)
  IAuraRgbKeyCollection keys();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={IAuraRgbKeyCollection.class})
  IAuraRgbKey keys(
          int index);

  // Properties:
}

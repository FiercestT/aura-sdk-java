package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraKeyboard
 */
@IID("{89871453-003C-474F-8AE3-177ED6BF2C37}")
interface IAuraKeyboard extends IAuraDevice {
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
  @VTID(28)
  ca.fiercest.aurasdk.com4j.IAuraRgbLight key(
          short keyCode);


  /**
   * <p>
   * Getter method for the COM property "Keys"
   * </p>
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbKeyCollection
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(29)
  ca.fiercest.aurasdk.com4j.IAuraRgbKeyCollection keys();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraRgbKeyCollection.class})
  ca.fiercest.aurasdk.com4j.IAuraRgbKey keys(
          int index);

  /**
   * <p>
   * Wait the keyinput and get all of the key states
   * </p>
   * @param event Mandatory java.nio.Buffer parameter.
   * @param timeout Mandatory int parameter.
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbKeyStateCollection
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(30)
  ca.fiercest.aurasdk.com4j.IAuraRgbKeyStateCollection waitKeyInput(
          java.nio.Buffer event,
          int timeout);


  // Properties:
}

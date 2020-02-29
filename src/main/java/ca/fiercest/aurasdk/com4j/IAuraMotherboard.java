package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraStandbyDevice
 */
@IID("{51D73501-4480-4AC7-8E6A-748358D32872}")
interface IAuraMotherboard extends IAuraDeviceThermal {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(32)
  void setStandbyMode(
          int index);


  /**
   * @param index Mandatory int parameter.
   * @param color Mandatory int parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(33)
  void setStandbyLightColor(
          int index,
          int color);


  /**
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(34)
  void applyStandby();


  /**
   * <p>
   * Getter method for the COM property "StandbyLights"
   * </p>
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbLightCollection
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(35)
  ca.fiercest.aurasdk.com4j.IAuraRgbLightCollection standbyLights();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraRgbLightCollection.class})
  ca.fiercest.aurasdk.com4j.IAuraRgbLight standbyLights(
          int index);

  /**
   * @param pVal Mandatory int parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(36)
  void put_StandbyDirection(
          int pVal);


  /**
   * @param pVal Mandatory int parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(37)
  void put_StandbySpeed(
          int pVal);


  /**
   * <p>
   * Getter method for the COM property "StandbyMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(38)
  int standbyMode();


  /**
   * <p>
   * Setter method for the COM property "StandbyMode"
   * </p>
   * @param pVal Mandatory int parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(39)
  void standbyMode(
          int pVal);


  /**
   * <p>
   * Getter method for the COM property "mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(40)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "mode"
   * </p>
   * @param pVal Mandatory int parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(41)
  void mode(
          int pVal);


  /**
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(42)
  void refreshStandbyStatus();


  /**
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(43)
  void refreshStatus();


  /**
   * @param pVal Mandatory int parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(44)
  void setEnabled(
          int pVal);


  // Properties:
}

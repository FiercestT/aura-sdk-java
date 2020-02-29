package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraHotPlugHal
 */
@IID("{F9718389-F460-45B4-9CC7-B546A7DFB7B1}")
interface IAuraHotPlugHal extends IAuraHal {
  // Methods:
  /**
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraHPHalIIDCollection
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(8)
  ca.fiercest.aurasdk.com4j.IAuraHPHalIIDCollection getAllInterfaceGuids();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraHPHalIIDCollection.class})
  String getAllInterfaceGuids(
          int index);

  /**
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraHPHalDIDCollection
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(9)
  ca.fiercest.aurasdk.com4j.IAuraHPHalDIDCollection getAllDeviceIds();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraHPHalDIDCollection.class})
  int getAllDeviceIds(
          int index);

  // Properties:
}

package ca.fiercest.aurasdk.com4j;

import com4j.*;

@IID("{3CED2297-27BD-492C-9934-D1D153B0FAC1}")
interface IAuraSdk extends Com4jObject {
  // Methods:
  /**
   * @param devType Mandatory int parameter.
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraSyncDeviceCollection
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  ca.fiercest.aurasdk.com4j.IAuraDeviceCollection enumerate(
          int devType);


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void switchMode();


  // Properties:
}

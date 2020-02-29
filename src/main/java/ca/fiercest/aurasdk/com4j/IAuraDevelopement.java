package ca.fiercest.aurasdk.com4j;

import com4j.*;

@IID("{9FCF439B-F9ED-4F93-B775-13305BE23E55}")
interface IAuraDevelopement extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraDeviceCollection
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  ca.fiercest.aurasdk.com4j.IAuraDeviceCollection getAllDevices();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraDeviceCollection.class})
  ca.fiercest.aurasdk.com4j.IAuraDevice getAllDevices(
          int index);

  /**
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraHalInfoCollection
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  ca.fiercest.aurasdk.com4j.IAuraHalInfoCollection eumerateHalInfo();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraHalInfoCollection.class})
  ca.fiercest.aurasdk.com4j.IAuraHalInfo eumerateHalInfo(
          int index);

  /**
   * @param guids Mandatory GUID parameter.
   * @param count Mandatory int parameter.
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraDeviceCollection
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  ca.fiercest.aurasdk.com4j.IAuraDeviceCollection eumerateDevicesFromHal(
          GUID guids,
          int count);


  /**
   * @param token Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void auraRequireToken(
          int token);


  // Properties:
}

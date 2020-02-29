package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraHal
 */
@IID("{86B5127B-4B88-4F02-8A59-7B7FF7BB53EF}")
interface IAuraHal extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraDeviceCollection
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IAuraDeviceCollection eumerateDevices();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={IAuraDeviceCollection.class})
  IAuraDevice eumerateDevices(
          int index);

  // Properties:
}

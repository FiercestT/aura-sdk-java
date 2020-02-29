package ca.fiercest.aurasdk.com4j;

import com4j.*;

@IID("{EE69DBAE-33FF-4E45-B378-01797A59852D}")
public interface IAuraSdk2 extends IAuraSdk {
  // Methods:
  /**
   * @param reserve Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void releaseControl(
          int reserve);


  // Properties:
}

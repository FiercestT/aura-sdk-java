package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * IAuraDevice
 */
@IID("{9331BEA3-2062-4E22-9297-1B3C065E909E}")
public interface IAuraDevice extends ca.fiercest.aurasdk.com4j.IAuraSyncDevice {
  // Methods:
  /**
   * @param mode Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void setMode(
          int mode);


  /**
   * @param index Mandatory int parameter.
   * @param color Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void setLightColor(
          int index,
          int color);


  /**
   * <p>
   * Getter method for the COM property "LightCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  int lightCount();


  /**
   * <p>
   * Setter method for the COM property "LightCount"
   * </p>
   * @param pVal Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  void lightCount(
          int pVal);


  /**
   * <p>
   * Getter method for the COM property "Effects"
   * </p>
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraEffectCollection
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  ca.fiercest.aurasdk.com4j.IAuraEffectCollection effects();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraEffectCollection.class})
  ca.fiercest.aurasdk.com4j.IAuraEffect effects(
          int index);

  /**
   * <p>
   * Getter method for the COM property "StandbyEffects"
   * </p>
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraEffectCollection
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  ca.fiercest.aurasdk.com4j.IAuraEffectCollection standbyEffects();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraEffectCollection.class})
  ca.fiercest.aurasdk.com4j.IAuraEffect standbyEffects(
          int index);

  /**
   * @param width Mandatory Holder<Integer> parameter.
   * @param height Mandatory Holder<Integer> parameter.
   * @param depth Mandatory Holder<Integer> parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  void getLayout(
          Holder<Integer> width,
          Holder<Integer> height,
          Holder<Integer> depth);


  /**
   * @param effectIndex Mandatory int parameter.
   * @param tickcount Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  void synchronize(
          int effectIndex,
          int tickcount);


  /**
   * <p>
   * Getter method for the COM property "DefaultLightCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(21)
  int defaultLightCount();


  /**
   * <p>
   * Getter method for the COM property "MaxLightCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(22)
  int maxLightCount();


  /**
   * <p>
   * Getter method for the COM property "LightCountVariable"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(23)
  int lightCountVariable();


  /**
   * <p>
   * Getter method for the COM property "Manufacture"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(24)
  String manufacture();


  /**
   * <p>
   * Getter method for the COM property "Model"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(25)
  String model();


  /**
   * <p>
   * Getter method for the COM property "Groups"
   * </p>
   * @return  Returns a value of type ca.fiercest.aurasdk.com4j.IAuraRgbLightGroupCollection
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(26)
  ca.fiercest.aurasdk.com4j.IAuraRgbLightGroupCollection groups();


  @VTID(26)
  @ReturnValue(defaultPropertyThrough={ca.fiercest.aurasdk.com4j.IAuraRgbLightGroupCollection.class})
  ca.fiercest.aurasdk.com4j.IAuraRgbLightGroup groups(
          int index);

  /**
   * <p>
   * Getter method for the COM property "KeyboardKeyZone"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(27)
  int keyboardKeyZone();


  // Properties:
}

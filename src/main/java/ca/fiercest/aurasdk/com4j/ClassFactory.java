package ca.fiercest.aurasdk.com4j;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory
{
  private ClassFactory() {} // instanciation is not allowed


  private static ca.fiercest.aurasdk.com4j.IAuraDevelopement createAuraDevelopement() {
    return COM4J.createInstance( ca.fiercest.aurasdk.com4j.IAuraDevelopement.class, "{34B707DC-1133-4EBC-B380-21387A50A89D}" );
  }

  public static ca.fiercest.aurasdk.com4j.IAuraSdk2 createAuraSdk() {
    return COM4J.createInstance( ca.fiercest.aurasdk.com4j.IAuraSdk2.class, "{05921124-5057-483E-A037-E9497B523590}" );
  }
}

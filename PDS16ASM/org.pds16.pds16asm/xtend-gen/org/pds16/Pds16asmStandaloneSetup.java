/**
 * generated by Xtext 2.9.2
 */
package org.pds16;

import org.pds16.Pds16asmStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class Pds16asmStandaloneSetup extends Pds16asmStandaloneSetupGenerated {
  public static void doSetup() {
    Pds16asmStandaloneSetup _pds16asmStandaloneSetup = new Pds16asmStandaloneSetup();
    _pds16asmStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
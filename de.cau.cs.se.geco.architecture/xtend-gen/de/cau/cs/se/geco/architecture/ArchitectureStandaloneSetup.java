/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.se.geco.architecture;

import de.cau.cs.se.geco.architecture.ArchitectureStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ArchitectureStandaloneSetup extends ArchitectureStandaloneSetupGenerated {
  public static void doSetup() {
    ArchitectureStandaloneSetup _architectureStandaloneSetup = new ArchitectureStandaloneSetup();
    _architectureStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}

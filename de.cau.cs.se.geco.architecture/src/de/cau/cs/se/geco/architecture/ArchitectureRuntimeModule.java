/*
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture;

import org.eclipse.xtext.naming.IQualifiedNameConverter;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ArchitectureRuntimeModule extends de.cau.cs.se.geco.architecture.AbstractArchitectureRuntimeModule {

	
	/**
	 * Use the XtextQualifiedNameConverter to support URIs??
	 * @return
	 */
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return IQualifiedNameConverter.DefaultImpl.class;
	}
	
	
	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return de.cau.cs.se.geco.architecture.scoping.ArchitectureScopeProvider.class;
	}
}
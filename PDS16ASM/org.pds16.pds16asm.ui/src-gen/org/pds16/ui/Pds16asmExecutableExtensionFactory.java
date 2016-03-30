/*
 * generated by Xtext 2.9.2
 */
package org.pds16.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.pds16.pds16asm.ui.internal.Pds16asmActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Pds16asmExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Pds16asmActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Pds16asmActivator.getInstance().getInjector(Pds16asmActivator.ORG_PDS16_PDS16ASM);
	}
	
}

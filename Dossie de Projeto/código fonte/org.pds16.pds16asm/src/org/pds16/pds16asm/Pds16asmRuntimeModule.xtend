/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm

import org.eclipse.xtext.conversion.IValueConverterService
import org.pds16.pds16asm.converter.Pds16asmValueConverter

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class Pds16asmRuntimeModule extends AbstractPds16asmRuntimeModule {
	
	override Class<? extends IValueConverterService> bindIValueConverterService() {
	    return  Pds16asmValueConverter
	}
}
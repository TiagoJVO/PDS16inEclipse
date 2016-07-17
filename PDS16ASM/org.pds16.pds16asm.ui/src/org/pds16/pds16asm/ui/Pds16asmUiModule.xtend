/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class Pds16asmUiModule extends AbstractPds16asmUiModule {

	 def Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration () {
 		return Pds16asmHighlightingConfiguration
 	 }
	 
     def Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenAtributeIdMapper() {
		 return Pds16asmTokenAtributeIdMapper
	 }

}

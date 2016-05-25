package org.pds16.pds16asm.ui

import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.AbstractRule
import org.eclipse.xtext.Assignment

class Pds16asmHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator arg2) {
		  // It gets a node model.
        var INode root = resource.getParseResult().getRootNode();
        for(INode node : root.getAsTreeIterable()) {   
            var EObject grammarElement = node.getGrammarElement(); 
            if(grammarElement instanceof RuleCall) {
                var RuleCall rc = (RuleCall)grammarElement;
                var AbstractRule r = rc.getRule();
                var EObject c = grammarElement.eContainer();

                // It tests whether the node represents a name of an element (class, method, parameter).
                if(r.getName().equals("ID") && c instanceof Assignment && ((Assignment)c).getFeature().equals("name")) {
                    var INode p = node.getParent();
                    if (p != null && p.getGrammarElement() instanceof RuleCall) {
                        rc = (RuleCall)p.getGrammarElement();
                        var AbstractRule r = rc.getRule();

                        // It tests whether the parent node represents a method.                        
                        if(r.getName().equals("Method")) {
                            acceptor.addPosition(node.getOffset(), node.getLength(), ExampleHighlightingConfiguration.METHOD_ID);
                        }
                    }
                }
            }
        }
	}
	
}
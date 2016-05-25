package org.pds16.pds16asm.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class Pds16asmHighlightingCalculator implements ISemanticHighlightingCalculator {
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator arg2) {
    throw new Error("Unresolved compilation problems:"
      + "\nextraneous input \'c\' expecting \')\'"
      + "\nThe method getFeature() is undefined for the type Class<Assignment>"
      + "\nThe method or field ExampleHighlightingConfiguration is undefined"
      + "\nDuplicate local variable r"
      + "\nType mismatch: cannot convert from Class<RuleCall> to RuleCall"
      + "\nType mismatch: cannot convert from Class<RuleCall> to RuleCall"
      + "\nUse \'as\' keyword for type casting."
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects."
      + "\nUse \'as\' keyword for type casting."
      + "\nequals cannot be resolved"
      + "\nMETHOD_ID cannot be resolved");
  }
}

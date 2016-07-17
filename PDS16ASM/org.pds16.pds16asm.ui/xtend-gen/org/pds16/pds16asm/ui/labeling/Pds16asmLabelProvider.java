/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.pds16.pds16asm.pds16asm.Equ;
import org.pds16.pds16asm.pds16asm.Label;
import org.pds16.pds16asm.pds16asm.Org;
import org.pds16.pds16asm.pds16asm.Section;
import org.pds16.pds16asm.pds16asm.Set;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class Pds16asmLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public Pds16asmLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  /**
   * Returns the name of the label
   * to show on the outline
   * 
   * @param label represents the Label token of the grammar
   */
  public String text(final Label label) {
    String _labelName = label.getLabelName();
    String _labelName_1 = label.getLabelName();
    int _length = _labelName_1.length();
    int _minus = (_length - 1);
    String _substring = _labelName.substring(0, _minus);
    return ("Label: " + _substring);
  }
  
  /**
   * Returns the name of the label
   * to show on the outline
   * 
   * @param equ represents the Equ token of the grammar
   */
  public String text(final Equ equ) {
    String _id = equ.getId();
    return ("Equ: " + _id);
  }
  
  /**
   * Returns the name of the label
   * to show on the outline
   * 
   * @param org represents the Org token of the grammar
   */
  public String text(final Org org) {
    return "Org ";
  }
  
  /**
   * Returns the name of the label
   * to show on the outline
   * 
   * @param section represents the Section token of the grammar
   */
  public String text(final Section section) {
    String _id = section.getId();
    return ("Section: " + _id);
  }
  
  /**
   * Returns the name of the label
   * to show on the outline
   * 
   * @param set represents the Set token of the grammar
   */
  public String text(final Set set) {
    String _id = set.getId();
    return ("Set: " + _id);
  }
}

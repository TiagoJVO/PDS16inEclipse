/*
 * generated by Xtext 2.9.2
 */
package org.pds16.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPds16asmValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.pds16.pds16asm.Pds16asmPackage.eINSTANCE);
		return result;
	}
	
}

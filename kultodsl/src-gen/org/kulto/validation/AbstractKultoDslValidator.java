/*
 * generated by Xtext 2.10.0
 */
package org.kulto.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractKultoDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.kulto.kultoDsl.KultoDslPackage.eINSTANCE);
		return result;
	}
	
}
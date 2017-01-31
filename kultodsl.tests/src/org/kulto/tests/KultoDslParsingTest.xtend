/*
 * generated by Xtext 2.10.0
 */
package org.kulto.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.kulto.kultoDsl.KultoModel

@RunWith(XtextRunner)
@InjectWith(KultoDslInjectorProvider)
class KultoDslParsingTest{

	@Inject
	ParseHelper<KultoModel> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
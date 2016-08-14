/*
 * generated by Xtext 2.10.0
 */
package de.cau.cs.se.geco.architecture.tests

import com.google.inject.Inject
import de.cau.cs.se.geco.architecture.architecture.GecoModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(ArchitectureInjectorProvider)
class ArchitectureParsingTest{

	@Inject
	ParseHelper<GecoModel> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}

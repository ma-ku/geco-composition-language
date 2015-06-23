/*
* generated by Xtext
*/
package de.cau.cs.se.geco.architecture.ui.labeling

import com.google.inject.Inject
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.se.geco.architecture.architecture.Generator
import de.cau.cs.se.geco.architecture.architecture.Weaver

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class ArchitectureLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(MetamodelSequence sequence) {
		sequence.type.resolveType.simpleName
	}
	
	def text(Generator generator) {
		"generator " + generator.reference.simpleName
	}
	
	def text(Weaver weaver) {
		"weaver " + weaver.reference.simpleName
	}

//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}

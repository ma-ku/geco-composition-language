/*
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.cau.cs.se.geco.architecture.architecture.Model
import java.util.Iterator
import org.eclipse.emf.common.util.EList
import de.cau.cs.se.geco.architecture.architecture.Import
import de.cau.cs.se.geco.architecture.architecture.Weaver
import de.cau.cs.se.geco.architecture.architecture.Connection
import de.cau.cs.se.geco.architecture.architecture.Generator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ArchitectureGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val targetUri = resource.URI.trimFileExtension.appendFileExtension("xtend")
		fsa.generateFile(targetUri.toFileString, 
			'''''' /*createGenerator(resource.allContents.filter(Model).next, 
				resource.URI.lastSegment.split('\\.').get(0))*/
		)
	}
	
	private def CharSequence createGenerator(Model model, String className) '''
		package de.menges.nexgen

		import java.util.ArrayList
		import java.util.Collection
		import java.util.List
		import org.eclipse.emf.common.util.URI
		
		«model.imports.map[it.createImport].join»
		
		«model.connections.map[it.createField].join»

		class «model.name».«className» {
			
			new(URI uri) {
				this.uri = uri
			}
			
			def void execute(Collection<EObject> models) {
				
			}
		}
	'''
	
	private def dispatch CharSequence createField(Weaver connection) {
		val name = connection.weaver.importedNamespace.split('\\.').last
		'''val «name» = new «name.toFirstLower»()'''
	}
	
	private def dispatch CharSequence createField(Generator connection) {
		val name = connection.generator.importedNamespace.split('\\.').last
		'''val «name» = new «name.toFirstLower»()'''
	}
	
	private def CharSequence createImport(Import node) '''import «node.importedNamespace»'''
	
	
}

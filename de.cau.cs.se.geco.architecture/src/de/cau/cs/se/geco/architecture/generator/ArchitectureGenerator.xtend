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
import java.io.File
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ArchitectureGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val fileName = resource.URI.trimFileExtension.lastSegment
		fsa.generateFile('''«resource.allContents.filter(Model).last.name.replace('.', File.separator)»«File.separator»«fileName».xtend''', 
			createGenerator(resource.allContents.filter(Model).last, fileName)
		)
	}
	
	private def CharSequence createGenerator(Model model, String className) '''
		package de.menges.nexgen

		import java.util.ArrayList
		import java.util.Collection
		import java.util.List
		import org.eclipse.emf.common.util.URI
		
		«model.imports.map[it.createImport].join»
		
		«model.registeredPackages.map[it.createRegisterImport].join»
		
		class «model.name».«className» {
		
			«model.connections.map[it.createField].join»
			
			new(URI uri) {
				this.uri = uri
			}
			
			def void execute(Collection<EObject> models) {
				«model.connections.map[it.createExecution].join»
			}
		}
	'''
	

	private def CharSequence createRegisterImport(RegisteredPackage node) '''
		import «node.importedNamespace.qualifiedName»
	'''
		
	private def CharSequence createImport(Import node) '''
		import «node.importedNamespace.qualifiedName»
	'''
	
	private def CharSequence createField(Connection connection) '''
		val «connection.reference.simpleName.toFirstLower» = new «connection.reference.simpleName»()
	''' 
	
	private def dispatch CharSequence createExecution(Generator generator) {
		if (generator.sourceModel.reference == null) '''
			val «generator.targetModel.reference.name» = «generator.reference.simpleName.toFirstLower».generate(null)'''
		
	} 
		
	private def dispatch CharSequence createExecution(Weaver weaver) {
		
	}
}

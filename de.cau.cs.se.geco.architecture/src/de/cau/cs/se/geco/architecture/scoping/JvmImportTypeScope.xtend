package de.cau.cs.se.geco.architecture.scoping

import de.cau.cs.se.geco.architecture.architecture.Import
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope

/**
 * This scope defines a set of names based on the imported generators or
 * weavers.
 */
class JvmImportTypeScope implements IScope {
	
	val Map<JvmType, IEObjectDescription> imports = new HashMap<JvmType, IEObjectDescription>
	
	new(Iterable<Import> list) {
		list.forEach[imports.put(it.importedNamespace,
			EObjectDescription.create(it.importedNamespace.simpleName, it.importedNamespace))]
	}
	
	override getAllElements() {
		imports.values
	}
	
	override getElements(QualifiedName name) {
		imports.filter[type, description | type.simpleName.equals(name.toString)].values
	}
	
	override getElements(EObject object) {
		imports.filter[type, description | type.equals(object)].values
	}
	
	override getSingleElement(QualifiedName name) {
		return this.getElements(name).last
	}
	
	override getSingleElement(EObject object) {
		return this.getElements(object).last
	}
	
}
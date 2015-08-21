/*
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.validation

import org.eclipse.xtext.validation.Check
import de.cau.cs.se.geco.architecture.architecture.Weaver
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference

import static extension de.cau.cs.se.geco.architecture.typing.ArchitectureTyping.*
import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ArchitectureValidator extends AbstractArchitectureValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkWeaverSourceModelType(Weaver weaver) {
		val match = (weaver.reference as JvmGenericType).superTypes.filter[it.type.simpleName.equals("IWeaver")]
		if (match.size > 0) {
			if (match.get(0) instanceof JvmParameterizedTypeReference) {
				val iface = match.get(0) as JvmParameterizedTypeReference
				val sourceReference = iface.arguments.get(0)
				val aspectReference = iface.arguments.get(1)
				val declaredSourceType = weaver.resolveWeaverSourceModel.resolveType
				if (!(declaredSourceType as JvmGenericType).isSubTypeOf(sourceReference.type)) {
					error('Wrong source model type ' + declaredSourceType.simpleName + ' for ' + 
						weaver.reference.simpleName + ' expected ' + sourceReference.type.simpleName, 
						ArchitecturePackage.Literals.PROCESSOR__SOURCE_MODEL)
				}
		
			}
				
		
		}
			
	}
}

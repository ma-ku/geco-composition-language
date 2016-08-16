/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.se.geco.architecture.scoping;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.cau.cs.se.geco.architecture.scoping.JvmMemberTypeScope;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ArchitectureScopeProvider implements /* AbstractArchitectureScopeProvider */IDelegatingScopeProvider {
  @Inject
  private IJvmTypeProvider.Factory typeProviderFactory;
  
  @Inject
  @Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
  private IScopeProvider delegate;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nNodeProperty cannot be resolved to a type."
      + "\nGenerator cannot be resolved to a type."
      + "\nWeaver cannot be resolved to a type."
      + "\nNodeType cannot be resolved to a type."
      + "\nInstanceOf cannot be resolved to a type."
      + "\nGenerator cannot be resolved to a type."
      + "\nTraceModelReference cannot be resolved to a type."
      + "\nImport cannot be resolved to a type."
      + "\nModelType cannot be resolved to a type."
      + "\nRegisteredRootClass cannot be resolved to a type."
      + "\nSourceModelSelector cannot be resolved to a type."
      + "\nTargetModel cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method createGeneratorReferenceScope(Generator, EReference) from the type ArchitectureScopeProvider refers to the missing type Generator"
      + "\nThe method createWeaverReferenceScope(Weaver, EReference) from the type ArchitectureScopeProvider refers to the missing type Weaver"
      + "\nThe method createNodeTypeScope(NodeType, EReference) from the type ArchitectureScopeProvider refers to the missing type NodeType"
      + "\nThe method createInstanceOfScope(InstanceOf, EReference) from the type ArchitectureScopeProvider refers to the missing type InstanceOf");
  }
  
  @Override
  public IScopeProvider getDelegate() {
    return this.delegate;
  }
  
  /**
   * Create scope for property.
   */
  private IScope createPropertyScope(final EObject container, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nModelType cannot be resolved to a type."
      + "\nNodeProperty cannot be resolved to a type."
      + "\nSourceModelSelector cannot be resolved to a type."
      + "\nModelSequence cannot be resolved to a type."
      + "\nInstanceOf cannot be resolved to a type."
      + "\nInstanceOf cannot be resolved to a type."
      + "\nThe method or field target is undefined for the type EObject"
      + "\nThe method or field property is undefined for the type EObject"
      + "\nThe method or field reference is undefined for the type EObject"
      + "\nThe method or field constraint is undefined for the type EObject"
      + "\nThe method or field constraint is undefined for the type EObject"
      + "\nThe method or field constraint is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nimportedNamespace cannot be resolved"
      + "\ncreateJvmDeclaredTypeScope cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreateJvmDeclaredTypeScope cannot be resolved"
      + "\ncreateJvmDeclaredTypeScope cannot be resolved");
  }
  
  /**
   * Create scope of JvmDeclareType for its member (getters for features).
   */
  private IScope createJvmDeclaredTypeScope(final JvmType type, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (type instanceof JvmDeclaredType) {
      _matched=true;
      _switchResult = new JvmMemberTypeScope(((JvmDeclaredType)type));
    }
    if (!_matched) {
      _switchResult = IScope.NULLSCOPE;
    }
    return _switchResult;
  }
  
  /**
   * Scope for generators.
   */
  private IScope createGeneratorReferenceScope(final /* Generator */Object context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field importedNamespace is undefined for the type Object"
      + "\nThe constructor JvmImportTypeScope(Iterable<Import>) refers to the missing type Import"
      + "\nmodelRoot cannot be resolved"
      + "\nimports cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nimplementsInterface cannot be resolved");
  }
  
  /**
   * Scope for weavers.
   */
  private IScope createWeaverReferenceScope(final /* Weaver */Object context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field importedNamespace is undefined for the type Object"
      + "\nThe method or field importedNamespace is undefined for the type Object"
      + "\nThe constructor JvmImportTypeScope(Iterable<Import>) refers to the missing type Import"
      + "\nmodelRoot cannot be resolved"
      + "\nimports cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nimplementsInterface cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nimplementsInterface cannot be resolved");
  }
  
  /**
   * Scope for the trace model scope.
   */
  private IScope createNodeTypeScope(final /* NodeType */Object nodeType, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nNodeSetRelation cannot be resolved to a type."
      + "\nWeaver cannot be resolved to a type."
      + "\nWeaver cannot be resolved to a type."
      + "\ngeneratorContextNode cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nsourceNodes cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nsourceModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nsourceModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved"
      + "\nmodelRoot cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ngetResourceSet cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\n== cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nresolveWeaverSourceModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved"
      + "\nmodelRoot cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ngetResourceSet cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved"
      + "\nmodelRoot cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ngetResourceSet cannot be resolved");
  }
  
  /**
   * Scope for the type of call.
   */
  private IScope createInstanceOfScope(final /* InstanceOf */Object type, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nmetaModelContextNode cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nmodelRoot cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ngetResourceSet cannot be resolved");
  }
  
  private /* GecoModel */Object getModelRoot(final EObject object) {
    throw new Error("Unresolved compilation problems:"
      + "\nGecoModel cannot be resolved to a type."
      + "\nThe method getModelRoot(EObject) from the type ArchitectureScopeProvider refers to the missing type GecoModel");
  }
  
  private JvmType getMetaModelContextNode(final EObject type) {
    throw new Error("Unresolved compilation problems:"
      + "\nNodeProperty cannot be resolved to a type."
      + "\nSourceModelSelector cannot be resolved to a type."
      + "\nThe method or field property is undefined for the type EObject"
      + "\nThe method or field reference is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved");
  }
  
  private /* Generator */Object getGeneratorContextNode(final EObject type) {
    throw new Error("Unresolved compilation problems:"
      + "\nGenerator cannot be resolved to a type."
      + "\nThe method getGeneratorContextNode(EObject) from the type ArchitectureScopeProvider refers to the missing type Generator");
  }
  
  /**
   * Check if the given JvmType implements the interface specified by typeName.
   */
  private Boolean implementsInterface(final JvmType type, final EObject object, final String typeName) {
    boolean _xblockexpression = false;
    {
      Resource _eResource = object.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      IJvmTypeProvider _createTypeProvider = this.typeProviderFactory.createTypeProvider(_resourceSet);
      final JvmType matchingType = _createTypeProvider.findTypeByName(typeName);
      boolean _switchResult = false;
      boolean _matched = false;
      if (type instanceof JvmGenericType) {
        _matched=true;
        _switchResult = ArchitectureTyping.isSubTypeOf(((JvmGenericType)type), matchingType);
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return Boolean.valueOf(_xblockexpression);
  }
}

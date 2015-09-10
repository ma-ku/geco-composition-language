/**
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.validation;

import com.google.common.base.Objects;
import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import de.cau.cs.se.geco.architecture.validation.AbstractArchitectureValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class ArchitectureValidator extends AbstractArchitectureValidator {
  @Check
  public void checkWeaverSourceModelType(final Weaver weaver) {
    final JvmType weaverJvmType = weaver.getReference();
    boolean _matched = false;
    if (!_matched) {
      if (weaverJvmType instanceof JvmGenericType) {
        _matched=true;
        EList<JvmTypeReference> _superTypes = ((JvmGenericType)weaverJvmType).getSuperTypes();
        final Function1<JvmTypeReference, Boolean> _function = (JvmTypeReference it) -> {
          JvmType _type = it.getType();
          String _simpleName = _type.getSimpleName();
          return Boolean.valueOf(_simpleName.equals("IWeaver"));
        };
        final Iterable<JvmTypeReference> match = IterableExtensions.<JvmTypeReference>filter(_superTypes, _function);
        int _size = IterableExtensions.size(match);
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          Object _get = ((Object[])Conversions.unwrapArray(match, Object.class))[0];
          if ((_get instanceof JvmParameterizedTypeReference)) {
            JvmTypeReference _get_1 = ((JvmTypeReference[])Conversions.unwrapArray(match, JvmTypeReference.class))[0];
            final JvmParameterizedTypeReference iface = ((JvmParameterizedTypeReference) _get_1);
            EList<JvmTypeReference> _arguments = iface.getArguments();
            final JvmTypeReference baseTypeReference = _arguments.get(0);
            EList<JvmTypeReference> _arguments_1 = iface.getArguments();
            final JvmTypeReference aspectTypeReference = _arguments_1.get(1);
            SourceModelNodeSelector _resolveWeaverSourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
            final JvmTypeReference sourceModelTypeReference = ArchitectureTyping.resolveType(_resolveWeaverSourceModel);
            boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(sourceModelTypeReference, baseTypeReference);
            boolean _not = (!_isSubTypeOf);
            if (_not) {
              JvmType _determineElementType = ArchitectureTyping.determineElementType(sourceModelTypeReference);
              JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_determineElementType);
              boolean _isSubTypeOf_1 = ArchitectureTyping.isSubTypeOf(_resolveType, baseTypeReference);
              boolean _not_1 = (!_isSubTypeOf_1);
              if (_not_1) {
                String _qualifiedName = sourceModelTypeReference.getQualifiedName();
                String _plus = ("Source model type " + _qualifiedName);
                String _plus_1 = (_plus + 
                  " does not match weaver base type ");
                String _qualifiedName_1 = baseTypeReference.getQualifiedName();
                String _plus_2 = (_plus_1 + _qualifiedName_1);
                this.error(_plus_2, 
                  ArchitecturePackage.Literals.PROCESSOR__SOURCE_MODEL);
              }
            }
          }
        } else {
          String _qualifiedName_2 = ((JvmGenericType)weaverJvmType).getQualifiedName();
          String _plus_3 = ("Weaver expected, but " + _qualifiedName_2);
          String _plus_4 = (_plus_3 + " found.");
          this.error(_plus_4, 
            ArchitecturePackage.Literals.PROCESSOR__REFERENCE);
        }
      }
    }
    if (!_matched) {
      this.error("Weaver expected, but illegal type found. Please check for build failures.", 
        ArchitecturePackage.Literals.PROCESSOR__REFERENCE);
    }
  }
  
  @Check
  public void checkGeneratorSourceModelType(final Generator generator) {
    final JvmType generatorJvmType = generator.getReference();
    boolean _matched = false;
    if (!_matched) {
      if (generatorJvmType instanceof JvmGenericType) {
        _matched=true;
        EList<JvmTypeReference> _superTypes = ((JvmGenericType)generatorJvmType).getSuperTypes();
        final Function1<JvmTypeReference, Boolean> _function = (JvmTypeReference it) -> {
          JvmType _type = it.getType();
          String _simpleName = _type.getSimpleName();
          return Boolean.valueOf(_simpleName.equals("IGenerator"));
        };
        final Iterable<JvmTypeReference> match = IterableExtensions.<JvmTypeReference>filter(_superTypes, _function);
        int _size = IterableExtensions.size(match);
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          Object _get = ((Object[])Conversions.unwrapArray(match, Object.class))[0];
          if ((_get instanceof JvmParameterizedTypeReference)) {
            final JvmTypeReference inputTypeReference = ArchitectureTyping.determineGeneratorInputType(((JvmGenericType)generatorJvmType));
            SourceModelNodeSelector _sourceModel = generator.getSourceModel();
            final JvmTypeReference sourceModelTypeReference = ArchitectureTyping.resolveType(_sourceModel);
            boolean _notEquals = (!Objects.equal(sourceModelTypeReference, null));
            if (_notEquals) {
              boolean _isSubTypeOf = ArchitectureTyping.isSubTypeOf(sourceModelTypeReference, inputTypeReference);
              boolean _not = (!_isSubTypeOf);
              if (_not) {
                JvmType _determineElementType = ArchitectureTyping.determineElementType(sourceModelTypeReference);
                JvmTypeReference _resolveType = ArchitectureTyping.resolveType(_determineElementType);
                boolean _isSubTypeOf_1 = ArchitectureTyping.isSubTypeOf(_resolveType, inputTypeReference);
                boolean _not_1 = (!_isSubTypeOf_1);
                if (_not_1) {
                  JvmType _determineElementType_1 = ArchitectureTyping.determineElementType(sourceModelTypeReference);
                  String _qualifiedName = _determineElementType_1.getQualifiedName();
                  String _plus = ("Source model type " + _qualifiedName);
                  String _plus_1 = (_plus + 
                    " does not match generator source type ");
                  String _qualifiedName_1 = inputTypeReference.getQualifiedName();
                  String _plus_2 = (_plus_1 + _qualifiedName_1);
                  this.error(_plus_2, 
                    ArchitecturePackage.Literals.PROCESSOR__SOURCE_MODEL);
                }
              }
            }
            final JvmTypeReference outputTypeReference = ArchitectureTyping.determineGeneratorOutputType(((JvmGenericType)generatorJvmType));
            TargetModelNodeType _targetModel = generator.getTargetModel();
            boolean _notEquals_1 = (!Objects.equal(_targetModel, null));
            if (_notEquals_1) {
              TargetModelNodeType _targetModel_1 = generator.getTargetModel();
              final JvmTypeReference targetModelTypeReference = ArchitectureTyping.resolveType(_targetModel_1);
              boolean _isSubTypeOf_2 = ArchitectureTyping.isSubTypeOf(outputTypeReference, targetModelTypeReference);
              boolean _not_2 = (!_isSubTypeOf_2);
              if (_not_2) {
                String _qualifiedName_2 = sourceModelTypeReference.getQualifiedName();
                String _plus_3 = ("Target model type " + _qualifiedName_2);
                String _plus_4 = (_plus_3 + 
                  " does not match generator target type ");
                String _qualifiedName_3 = inputTypeReference.getQualifiedName();
                String _plus_5 = (_plus_4 + _qualifiedName_3);
                this.error(_plus_5, 
                  ArchitecturePackage.Literals.PROCESSOR__TARGET_MODEL);
              }
            }
          } else {
            this.error("Generator expected, but illegal type found. Please check for build failures.", 
              ArchitecturePackage.Literals.PROCESSOR__REFERENCE);
          }
        } else {
          this.error("Generator expected, but illegal type found. Please check for build failures.", 
            ArchitecturePackage.Literals.PROCESSOR__REFERENCE);
        }
      }
    }
    if (!_matched) {
      this.error("Generator expected, but illegal type found. Please check for build failures.", 
        ArchitecturePackage.Literals.PROCESSOR__REFERENCE);
    }
  }
}
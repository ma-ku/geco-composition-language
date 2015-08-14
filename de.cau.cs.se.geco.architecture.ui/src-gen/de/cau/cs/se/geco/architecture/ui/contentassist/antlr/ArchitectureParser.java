/*
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.cau.cs.se.geco.architecture.services.ArchitectureGrammarAccess;

public class ArchitectureParser extends AbstractContentAssistParser {
	
	@Inject
	private ArchitectureGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.cau.cs.se.geco.architecture.ui.contentassist.antlr.internal.InternalArchitectureParser createParser() {
		de.cau.cs.se.geco.architecture.ui.contentassist.antlr.internal.InternalArchitectureParser result = new de.cau.cs.se.geco.architecture.ui.contentassist.antlr.internal.InternalArchitectureParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRegisteredPackageAccess().getAlternatives_2(), "rule__RegisteredPackage__Alternatives_2");
					put(grammarAccess.getProcessorAccess().getAlternatives(), "rule__Processor__Alternatives");
					put(grammarAccess.getWeaverAccess().getAlternatives_2(), "rule__Weaver__Alternatives_2");
					put(grammarAccess.getAspectModelAccess().getAlternatives(), "rule__AspectModel__Alternatives");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getAlternatives(), "rule__SourceModelNodeSelector__Alternatives");
					put(grammarAccess.getBasicConstraintAccess().getAlternatives(), "rule__BasicConstraint__Alternatives");
					put(grammarAccess.getOperandAccess().getAlternatives(), "rule__Operand__Alternatives");
					put(grammarAccess.getWriteTraceModelAccess().getAlternatives(), "rule__WriteTraceModel__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getMetamodelModifierAccess().getAlternatives(), "rule__MetamodelModifier__Alternatives");
					put(grammarAccess.getLogicOperatorAccess().getAlternatives(), "rule__LogicOperator__Alternatives");
					put(grammarAccess.getComparatorAccess().getAlternatives(), "rule__Comparator__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getMetamodelSequenceAccess().getGroup(), "rule__MetamodelSequence__Group__0");
					put(grammarAccess.getMetamodelSequenceAccess().getGroup_4(), "rule__MetamodelSequence__Group_4__0");
					put(grammarAccess.getRegisteredPackageAccess().getGroup(), "rule__RegisteredPackage__Group__0");
					put(grammarAccess.getRegisteredPackageAccess().getGroup_2_1(), "rule__RegisteredPackage__Group_2_1__0");
					put(grammarAccess.getWeaverAccess().getGroup(), "rule__Weaver__Group__0");
					put(grammarAccess.getWeaverAccess().getGroup_4(), "rule__Weaver__Group_4__0");
					put(grammarAccess.getAspectModelAccess().getGroup_0(), "rule__AspectModel__Group_0__0");
					put(grammarAccess.getGeneratorAccess().getGroup(), "rule__Generator__Group__0");
					put(grammarAccess.getGeneratorAccess().getGroup_4(), "rule__Generator__Group_4__0");
					put(grammarAccess.getGeneratorAccess().getGroup_5(), "rule__Generator__Group_5__0");
					put(grammarAccess.getGeneratorAccess().getGroup_5_2(), "rule__Generator__Group_5_2__0");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0(), "rule__SourceModelNodeSelector__Group_0__0");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_1(), "rule__SourceModelNodeSelector__Group_0_1__0");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_2(), "rule__SourceModelNodeSelector__Group_0_2__0");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_1(), "rule__SourceModelNodeSelector__Group_1__0");
					put(grammarAccess.getTargetModelNodeTypeAccess().getGroup(), "rule__TargetModelNodeType__Group__0");
					put(grammarAccess.getModelNodeTypeAccess().getGroup(), "rule__ModelNodeType__Group__0");
					put(grammarAccess.getModelNodeTypeAccess().getGroup_1(), "rule__ModelNodeType__Group_1__0");
					put(grammarAccess.getNodePropertyAccess().getGroup(), "rule__NodeProperty__Group__0");
					put(grammarAccess.getNodePropertyAccess().getGroup_1(), "rule__NodeProperty__Group_1__0");
					put(grammarAccess.getNodePropertyAccess().getGroup_2(), "rule__NodeProperty__Group_2__0");
					put(grammarAccess.getConstraintExpressionAccess().getGroup(), "rule__ConstraintExpression__Group__0");
					put(grammarAccess.getConstraintExpressionAccess().getGroup_1(), "rule__ConstraintExpression__Group_1__0");
					put(grammarAccess.getConstraintExpressionAccess().getGroup_1_0(), "rule__ConstraintExpression__Group_1_0__0");
					put(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0(), "rule__ConstraintExpression__Group_1_0_0__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup(), "rule__CompareExpression__Group__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup_1(), "rule__CompareExpression__Group_1__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup_1_0(), "rule__CompareExpression__Group_1_0__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0(), "rule__CompareExpression__Group_1_0_0__0");
					put(grammarAccess.getNegationAccess().getGroup(), "rule__Negation__Group__0");
					put(grammarAccess.getParenthesisConstraintAccess().getGroup(), "rule__ParenthesisConstraint__Group__0");
					put(grammarAccess.getTypeofAccess().getGroup(), "rule__Typeof__Group__0");
					put(grammarAccess.getWriteTraceModelAccess().getGroup_1(), "rule__WriteTraceModel__Group_1__0");
					put(grammarAccess.getTraceModelAccess().getGroup(), "rule__TraceModel__Group__0");
					put(grammarAccess.getNodeSetRelationAccess().getGroup(), "rule__NodeSetRelation__Group__0");
					put(grammarAccess.getNodeSetRelationAccess().getGroup_2(), "rule__NodeSetRelation__Group_2__0");
					put(grammarAccess.getNodeSetRelationAccess().getGroup_5(), "rule__NodeSetRelation__Group_5__0");
					put(grammarAccess.getArrayLiteralAccess().getGroup(), "rule__ArrayLiteral__Group__0");
					put(grammarAccess.getArrayLiteralAccess().getGroup_2(), "rule__ArrayLiteral__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1(), "rule__QualifiedNameWithWildcard__Group_1__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getImportsAssignment_2(), "rule__Model__ImportsAssignment_2");
					put(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_3(), "rule__Model__RegisteredPackagesAssignment_3");
					put(grammarAccess.getModelAccess().getMetamodelsAssignment_4(), "rule__Model__MetamodelsAssignment_4");
					put(grammarAccess.getModelAccess().getProcessorsAssignment_5(), "rule__Model__ProcessorsAssignment_5");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getMetamodelSequenceAccess().getModifierAssignment_1(), "rule__MetamodelSequence__ModifierAssignment_1");
					put(grammarAccess.getMetamodelSequenceAccess().getTypeAssignment_2(), "rule__MetamodelSequence__TypeAssignment_2");
					put(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_3(), "rule__MetamodelSequence__MetamodelsAssignment_3");
					put(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_4_1(), "rule__MetamodelSequence__MetamodelsAssignment_4_1");
					put(grammarAccess.getMetamodelAccess().getNameAssignment(), "rule__Metamodel__NameAssignment");
					put(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1(), "rule__RegisteredPackage__NameAssignment_1");
					put(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceAssignment_2_0(), "rule__RegisteredPackage__ImportedNamespaceAssignment_2_0");
					put(grammarAccess.getRegisteredPackageAccess().getIsTextAssignment_2_1_0(), "rule__RegisteredPackage__IsTextAssignment_2_1_0");
					put(grammarAccess.getRegisteredPackageAccess().getExtensionAssignment_2_1_1(), "rule__RegisteredPackage__ExtensionAssignment_2_1_1");
					put(grammarAccess.getWeaverAccess().getReferenceAssignment_1(), "rule__Weaver__ReferenceAssignment_1");
					put(grammarAccess.getWeaverAccess().getSourceModelAssignment_2_0(), "rule__Weaver__SourceModelAssignment_2_0");
					put(grammarAccess.getWeaverAccess().getAspectModelAssignment_3(), "rule__Weaver__AspectModelAssignment_3");
					put(grammarAccess.getWeaverAccess().getTargetModelAssignment_4_1(), "rule__Weaver__TargetModelAssignment_4_1");
					put(grammarAccess.getGeneratorAccess().getReferenceAssignment_1(), "rule__Generator__ReferenceAssignment_1");
					put(grammarAccess.getGeneratorAccess().getSourceModelAssignment_2(), "rule__Generator__SourceModelAssignment_2");
					put(grammarAccess.getGeneratorAccess().getTargetModelAssignment_3(), "rule__Generator__TargetModelAssignment_3");
					put(grammarAccess.getGeneratorAccess().getWriteTraceModelAssignment_4_1(), "rule__Generator__WriteTraceModelAssignment_4_1");
					put(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_1(), "rule__Generator__ReadTraceModelsAssignment_5_1");
					put(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_2_1(), "rule__Generator__ReadTraceModelsAssignment_5_2_1");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceAssignment_0_0(), "rule__SourceModelNodeSelector__ReferenceAssignment_0_0");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintAssignment_0_1_1(), "rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1");
					put(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyAssignment_0_2_1(), "rule__SourceModelNodeSelector__PropertyAssignment_0_2_1");
					put(grammarAccess.getTargetModelNodeTypeAccess().getReferenceAssignment_1(), "rule__TargetModelNodeType__ReferenceAssignment_1");
					put(grammarAccess.getModelNodeTypeAccess().getTargetAssignment_0(), "rule__ModelNodeType__TargetAssignment_0");
					put(grammarAccess.getModelNodeTypeAccess().getPropertyAssignment_1_1(), "rule__ModelNodeType__PropertyAssignment_1_1");
					put(grammarAccess.getNodePropertyAccess().getPropertyAssignment_0(), "rule__NodeProperty__PropertyAssignment_0");
					put(grammarAccess.getNodePropertyAccess().getConstraintAssignment_1_1(), "rule__NodeProperty__ConstraintAssignment_1_1");
					put(grammarAccess.getNodePropertyAccess().getSubPropertyAssignment_2_1(), "rule__NodeProperty__SubPropertyAssignment_2_1");
					put(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__ConstraintExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1(), "rule__ConstraintExpression__RightAssignment_1_1");
					put(grammarAccess.getCompareExpressionAccess().getComparatorAssignment_1_0_0_1(), "rule__CompareExpression__ComparatorAssignment_1_0_0_1");
					put(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1(), "rule__CompareExpression__RightAssignment_1_1");
					put(grammarAccess.getNegationAccess().getConstraintAssignment_1(), "rule__Negation__ConstraintAssignment_1");
					put(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1(), "rule__ParenthesisConstraint__ConstraintAssignment_1");
					put(grammarAccess.getTypeofAccess().getTypeAssignment_1(), "rule__Typeof__TypeAssignment_1");
					put(grammarAccess.getTraceModelReferenceAccess().getTraceModelAssignment(), "rule__TraceModelReference__TraceModelAssignment");
					put(grammarAccess.getTraceModelAccess().getNameAssignment_0(), "rule__TraceModel__NameAssignment_0");
					put(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2(), "rule__TraceModel__NodeSetRelationsAssignment_2");
					put(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_1(), "rule__NodeSetRelation__SourceNodesAssignment_1");
					put(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_2_1(), "rule__NodeSetRelation__SourceNodesAssignment_2_1");
					put(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_4(), "rule__NodeSetRelation__TargetNodesAssignment_4");
					put(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_5_1(), "rule__NodeSetRelation__TargetNodesAssignment_5_1");
					put(grammarAccess.getNodeTypeAccess().getTypeAssignment(), "rule__NodeType__TypeAssignment");
					put(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1(), "rule__ArrayLiteral__LiteralsAssignment_1");
					put(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1(), "rule__ArrayLiteral__LiteralsAssignment_2_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getIntLiteralAccess().getValueAssignment(), "rule__IntLiteral__ValueAssignment");
					put(grammarAccess.getFloatLiteralAccess().getValueAssignment(), "rule__FloatLiteral__ValueAssignment");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(), "rule__BooleanLiteral__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.cau.cs.se.geco.architecture.ui.contentassist.antlr.internal.InternalArchitectureParser typedParser = (de.cau.cs.se.geco.architecture.ui.contentassist.antlr.internal.InternalArchitectureParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ArchitectureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ArchitectureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

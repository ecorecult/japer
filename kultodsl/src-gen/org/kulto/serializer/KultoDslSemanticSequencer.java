/*
 * generated by Xtext 2.10.0
 */
package org.kulto.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.kulto.kultoDsl.Application;
import org.kulto.kultoDsl.Attribute;
import org.kulto.kultoDsl.Domain;
import org.kulto.kultoDsl.DomainPackage;
import org.kulto.kultoDsl.Ennum;
import org.kulto.kultoDsl.EnnumLiteral;
import org.kulto.kultoDsl.Entity;
import org.kulto.kultoDsl.Import;
import org.kulto.kultoDsl.KultoDslPackage;
import org.kulto.kultoDsl.KultoModel;
import org.kulto.kultoDsl.Popis;
import org.kulto.kultoDsl.Primitive;
import org.kulto.services.KultoDslGrammarAccess;

@SuppressWarnings("all")
public class KultoDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KultoDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == KultoDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case KultoDslPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case KultoDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case KultoDslPackage.DOMAIN:
				sequence_Domain(context, (Domain) semanticObject); 
				return; 
			case KultoDslPackage.DOMAIN_PACKAGE:
				sequence_DomainPackage(context, (DomainPackage) semanticObject); 
				return; 
			case KultoDslPackage.ENNUM:
				sequence_Ennum(context, (Ennum) semanticObject); 
				return; 
			case KultoDslPackage.ENNUM_LITERAL:
				sequence_EnnumLiteral(context, (EnnumLiteral) semanticObject); 
				return; 
			case KultoDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case KultoDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case KultoDslPackage.KULTO_MODEL:
				sequence_KultoModel(context, (KultoModel) semanticObject); 
				return; 
			case KultoDslPackage.POPIS:
				sequence_Popis(context, (Popis) semanticObject); 
				return; 
			case KultoDslPackage.PRIMITIVE:
				sequence_Primitive(context, (Primitive) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     RootElement returns Application
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (name=ID domains+=[Domain|ID] domains+=[Domain|ID]*)
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=[Type|QualifiedName] many?='*'? popis=Popis?)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootElement returns DomainPackage
	 *     DomainPackage returns DomainPackage
	 *     DomainChild returns DomainPackage
	 *
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* types+=DomainType*)
	 */
	protected void sequence_DomainPackage(ISerializationContext context, DomainPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootElement returns Domain
	 *     Domain returns Domain
	 *
	 * Constraint:
	 *     (name=ID popis=Popis? children+=DomainChild*)
	 */
	protected void sequence_Domain(ISerializationContext context, Domain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnnumLiteral returns EnnumLiteral
	 *
	 * Constraint:
	 *     (name=ID popis=Popis?)
	 */
	protected void sequence_EnnumLiteral(ISerializationContext context, EnnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootElement returns Ennum
	 *     Type returns Ennum
	 *     DomainType returns Ennum
	 *     Ennum returns Ennum
	 *     DomainChild returns Ennum
	 *
	 * Constraint:
	 *     (name=ID popis=Popis? literals+=EnnumLiteral*)
	 */
	protected void sequence_Ennum(ISerializationContext context, Ennum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootElement returns Entity
	 *     Type returns Entity
	 *     DomainType returns Entity
	 *     Entity returns Entity
	 *     DomainChild returns Entity
	 *
	 * Constraint:
	 *     (name=ID superType=[Entity|QualifiedName]? popis=Popis? attributes+=Attribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, KultoDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KultoDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KultoModel returns KultoModel
	 *
	 * Constraint:
	 *     elements+=RootElement+
	 */
	protected void sequence_KultoModel(ISerializationContext context, KultoModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Popis returns Popis
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Popis(ISerializationContext context, Popis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, KultoDslPackage.Literals.POPIS__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KultoDslPackage.Literals.POPIS__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPopisAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RootElement returns Primitive
	 *     Type returns Primitive
	 *     Primitive returns Primitive
	 *
	 * Constraint:
	 *     (name=ID javaType=STRING)
	 */
	protected void sequence_Primitive(ISerializationContext context, Primitive semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, KultoDslPackage.Literals.ROOT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KultoDslPackage.Literals.ROOT_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, KultoDslPackage.Literals.PRIMITIVE__JAVA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KultoDslPackage.Literals.PRIMITIVE__JAVA_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPrimitiveAccess().getJavaTypeSTRINGTerminalRuleCall_3_0(), semanticObject.getJavaType());
		feeder.finish();
	}
	
	
}

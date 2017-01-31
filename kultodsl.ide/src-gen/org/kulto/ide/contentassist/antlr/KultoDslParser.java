/*
 * generated by Xtext 2.10.0
 */
package org.kulto.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.kulto.ide.contentassist.antlr.internal.InternalKultoDslParser;
import org.kulto.services.KultoDslGrammarAccess;

public class KultoDslParser extends AbstractContentAssistParser {

	@Inject
	private KultoDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalKultoDslParser createParser() {
		InternalKultoDslParser result = new InternalKultoDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRootElementAccess().getAlternatives(), "rule__RootElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getDomainTypeAccess().getAlternatives(), "rule__DomainType__Alternatives");
					put(grammarAccess.getDomainChildAccess().getAlternatives(), "rule__DomainChild__Alternatives");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getPrimitiveAccess().getGroup(), "rule__Primitive__Group__0");
					put(grammarAccess.getEnnumAccess().getGroup(), "rule__Ennum__Group__0");
					put(grammarAccess.getEnnumLiteralAccess().getGroup(), "rule__EnnumLiteral__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getDomainPackageAccess().getGroup(), "rule__DomainPackage__Group__0");
					put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup_4(), "rule__Application__Group_4__0");
					put(grammarAccess.getPopisAccess().getGroup(), "rule__Popis__Group__0");
					put(grammarAccess.getKultoModelAccess().getElementsAssignment(), "rule__KultoModel__ElementsAssignment");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getPrimitiveAccess().getNameAssignment_1(), "rule__Primitive__NameAssignment_1");
					put(grammarAccess.getPrimitiveAccess().getJavaTypeAssignment_3(), "rule__Primitive__JavaTypeAssignment_3");
					put(grammarAccess.getEnnumAccess().getNameAssignment_1(), "rule__Ennum__NameAssignment_1");
					put(grammarAccess.getEnnumAccess().getPopisAssignment_3(), "rule__Ennum__PopisAssignment_3");
					put(grammarAccess.getEnnumAccess().getLiteralsAssignment_4(), "rule__Ennum__LiteralsAssignment_4");
					put(grammarAccess.getEnnumLiteralAccess().getNameAssignment_0(), "rule__EnnumLiteral__NameAssignment_0");
					put(grammarAccess.getEnnumLiteralAccess().getPopisAssignment_1(), "rule__EnnumLiteral__PopisAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
					put(grammarAccess.getEntityAccess().getPopisAssignment_4(), "rule__Entity__PopisAssignment_4");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_5(), "rule__Entity__AttributesAssignment_5");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_2(), "rule__Attribute__TypeAssignment_2");
					put(grammarAccess.getAttributeAccess().getManyAssignment_3(), "rule__Attribute__ManyAssignment_3");
					put(grammarAccess.getAttributeAccess().getPopisAssignment_4(), "rule__Attribute__PopisAssignment_4");
					put(grammarAccess.getDomainPackageAccess().getNameAssignment_1(), "rule__DomainPackage__NameAssignment_1");
					put(grammarAccess.getDomainPackageAccess().getImportsAssignment_3(), "rule__DomainPackage__ImportsAssignment_3");
					put(grammarAccess.getDomainPackageAccess().getTypesAssignment_4(), "rule__DomainPackage__TypesAssignment_4");
					put(grammarAccess.getDomainAccess().getNameAssignment_1(), "rule__Domain__NameAssignment_1");
					put(grammarAccess.getDomainAccess().getPopisAssignment_3(), "rule__Domain__PopisAssignment_3");
					put(grammarAccess.getDomainAccess().getChildrenAssignment_4(), "rule__Domain__ChildrenAssignment_4");
					put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
					put(grammarAccess.getApplicationAccess().getDomainsAssignment_3(), "rule__Application__DomainsAssignment_3");
					put(grammarAccess.getApplicationAccess().getDomainsAssignment_4_1(), "rule__Application__DomainsAssignment_4_1");
					put(grammarAccess.getPopisAccess().getTextAssignment_1(), "rule__Popis__TextAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalKultoDslParser typedParser = (InternalKultoDslParser) parser;
			typedParser.entryRuleKultoModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public KultoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KultoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
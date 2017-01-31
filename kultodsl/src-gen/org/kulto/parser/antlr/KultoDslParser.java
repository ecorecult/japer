/*
 * generated by Xtext 2.10.0
 */
package org.kulto.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.kulto.parser.antlr.internal.InternalKultoDslParser;
import org.kulto.services.KultoDslGrammarAccess;

public class KultoDslParser extends AbstractAntlrParser {

	@Inject
	private KultoDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalKultoDslParser createParser(XtextTokenStream stream) {
		return new InternalKultoDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "KultoModel";
	}

	public KultoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KultoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

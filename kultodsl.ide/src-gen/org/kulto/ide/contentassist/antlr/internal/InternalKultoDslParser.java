package org.kulto.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.kulto.services.KultoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKultoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'*'", "'import'", "'primitive:'", "'java:'", "'enum:'", "'{'", "'}'", "'entity:'", "'extends>'", "'atr:'", "'package:'", "'domain:'", "'application:'", "','", "'popis:'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKultoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKultoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKultoDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKultoDsl.g"; }


    	private KultoDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(KultoDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleKultoModel"
    // InternalKultoDsl.g:53:1: entryRuleKultoModel : ruleKultoModel EOF ;
    public final void entryRuleKultoModel() throws RecognitionException {
        try {
            // InternalKultoDsl.g:54:1: ( ruleKultoModel EOF )
            // InternalKultoDsl.g:55:1: ruleKultoModel EOF
            {
             before(grammarAccess.getKultoModelRule()); 
            pushFollow(FOLLOW_1);
            ruleKultoModel();

            state._fsp--;

             after(grammarAccess.getKultoModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKultoModel"


    // $ANTLR start "ruleKultoModel"
    // InternalKultoDsl.g:62:1: ruleKultoModel : ( ( rule__KultoModel__ElementsAssignment )* ) ;
    public final void ruleKultoModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:66:2: ( ( ( rule__KultoModel__ElementsAssignment )* ) )
            // InternalKultoDsl.g:67:2: ( ( rule__KultoModel__ElementsAssignment )* )
            {
            // InternalKultoDsl.g:67:2: ( ( rule__KultoModel__ElementsAssignment )* )
            // InternalKultoDsl.g:68:3: ( rule__KultoModel__ElementsAssignment )*
            {
             before(grammarAccess.getKultoModelAccess().getElementsAssignment()); 
            // InternalKultoDsl.g:69:3: ( rule__KultoModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==16||LA1_0==19||(LA1_0>=22 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKultoDsl.g:69:4: rule__KultoModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__KultoModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getKultoModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKultoModel"


    // $ANTLR start "entryRuleRootElement"
    // InternalKultoDsl.g:78:1: entryRuleRootElement : ruleRootElement EOF ;
    public final void entryRuleRootElement() throws RecognitionException {
        try {
            // InternalKultoDsl.g:79:1: ( ruleRootElement EOF )
            // InternalKultoDsl.g:80:1: ruleRootElement EOF
            {
             before(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRootElement();

            state._fsp--;

             after(grammarAccess.getRootElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // InternalKultoDsl.g:87:1: ruleRootElement : ( ( rule__RootElement__Alternatives ) ) ;
    public final void ruleRootElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:91:2: ( ( ( rule__RootElement__Alternatives ) ) )
            // InternalKultoDsl.g:92:2: ( ( rule__RootElement__Alternatives ) )
            {
            // InternalKultoDsl.g:92:2: ( ( rule__RootElement__Alternatives ) )
            // InternalKultoDsl.g:93:3: ( rule__RootElement__Alternatives )
            {
             before(grammarAccess.getRootElementAccess().getAlternatives()); 
            // InternalKultoDsl.g:94:3: ( rule__RootElement__Alternatives )
            // InternalKultoDsl.g:94:4: rule__RootElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RootElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRootElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKultoDsl.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalKultoDsl.g:104:1: ( ruleQualifiedName EOF )
            // InternalKultoDsl.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalKultoDsl.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalKultoDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalKultoDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalKultoDsl.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalKultoDsl.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalKultoDsl.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalKultoDsl.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalKultoDsl.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalKultoDsl.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalKultoDsl.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalKultoDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalKultoDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalKultoDsl.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalKultoDsl.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalKultoDsl.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalKultoDsl.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalKultoDsl.g:154:1: ( ruleImport EOF )
            // InternalKultoDsl.g:155:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalKultoDsl.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalKultoDsl.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalKultoDsl.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalKultoDsl.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalKultoDsl.g:169:3: ( rule__Import__Group__0 )
            // InternalKultoDsl.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // InternalKultoDsl.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalKultoDsl.g:179:1: ( ruleType EOF )
            // InternalKultoDsl.g:180:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalKultoDsl.g:187:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:191:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalKultoDsl.g:192:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalKultoDsl.g:192:2: ( ( rule__Type__Alternatives ) )
            // InternalKultoDsl.g:193:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalKultoDsl.g:194:3: ( rule__Type__Alternatives )
            // InternalKultoDsl.g:194:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDomainType"
    // InternalKultoDsl.g:203:1: entryRuleDomainType : ruleDomainType EOF ;
    public final void entryRuleDomainType() throws RecognitionException {
        try {
            // InternalKultoDsl.g:204:1: ( ruleDomainType EOF )
            // InternalKultoDsl.g:205:1: ruleDomainType EOF
            {
             before(grammarAccess.getDomainTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainType();

            state._fsp--;

             after(grammarAccess.getDomainTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainType"


    // $ANTLR start "ruleDomainType"
    // InternalKultoDsl.g:212:1: ruleDomainType : ( ( rule__DomainType__Alternatives ) ) ;
    public final void ruleDomainType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:216:2: ( ( ( rule__DomainType__Alternatives ) ) )
            // InternalKultoDsl.g:217:2: ( ( rule__DomainType__Alternatives ) )
            {
            // InternalKultoDsl.g:217:2: ( ( rule__DomainType__Alternatives ) )
            // InternalKultoDsl.g:218:3: ( rule__DomainType__Alternatives )
            {
             before(grammarAccess.getDomainTypeAccess().getAlternatives()); 
            // InternalKultoDsl.g:219:3: ( rule__DomainType__Alternatives )
            // InternalKultoDsl.g:219:4: rule__DomainType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DomainType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomainTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainType"


    // $ANTLR start "entryRulePrimitive"
    // InternalKultoDsl.g:228:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalKultoDsl.g:229:1: ( rulePrimitive EOF )
            // InternalKultoDsl.g:230:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalKultoDsl.g:237:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:241:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // InternalKultoDsl.g:242:2: ( ( rule__Primitive__Group__0 ) )
            {
            // InternalKultoDsl.g:242:2: ( ( rule__Primitive__Group__0 ) )
            // InternalKultoDsl.g:243:3: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // InternalKultoDsl.g:244:3: ( rule__Primitive__Group__0 )
            // InternalKultoDsl.g:244:4: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleEnnum"
    // InternalKultoDsl.g:253:1: entryRuleEnnum : ruleEnnum EOF ;
    public final void entryRuleEnnum() throws RecognitionException {
        try {
            // InternalKultoDsl.g:254:1: ( ruleEnnum EOF )
            // InternalKultoDsl.g:255:1: ruleEnnum EOF
            {
             before(grammarAccess.getEnnumRule()); 
            pushFollow(FOLLOW_1);
            ruleEnnum();

            state._fsp--;

             after(grammarAccess.getEnnumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnnum"


    // $ANTLR start "ruleEnnum"
    // InternalKultoDsl.g:262:1: ruleEnnum : ( ( rule__Ennum__Group__0 ) ) ;
    public final void ruleEnnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:266:2: ( ( ( rule__Ennum__Group__0 ) ) )
            // InternalKultoDsl.g:267:2: ( ( rule__Ennum__Group__0 ) )
            {
            // InternalKultoDsl.g:267:2: ( ( rule__Ennum__Group__0 ) )
            // InternalKultoDsl.g:268:3: ( rule__Ennum__Group__0 )
            {
             before(grammarAccess.getEnnumAccess().getGroup()); 
            // InternalKultoDsl.g:269:3: ( rule__Ennum__Group__0 )
            // InternalKultoDsl.g:269:4: rule__Ennum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ennum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnnum"


    // $ANTLR start "entryRuleEnnumLiteral"
    // InternalKultoDsl.g:278:1: entryRuleEnnumLiteral : ruleEnnumLiteral EOF ;
    public final void entryRuleEnnumLiteral() throws RecognitionException {
        try {
            // InternalKultoDsl.g:279:1: ( ruleEnnumLiteral EOF )
            // InternalKultoDsl.g:280:1: ruleEnnumLiteral EOF
            {
             before(grammarAccess.getEnnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnnumLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnnumLiteral"


    // $ANTLR start "ruleEnnumLiteral"
    // InternalKultoDsl.g:287:1: ruleEnnumLiteral : ( ( rule__EnnumLiteral__Group__0 ) ) ;
    public final void ruleEnnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:291:2: ( ( ( rule__EnnumLiteral__Group__0 ) ) )
            // InternalKultoDsl.g:292:2: ( ( rule__EnnumLiteral__Group__0 ) )
            {
            // InternalKultoDsl.g:292:2: ( ( rule__EnnumLiteral__Group__0 ) )
            // InternalKultoDsl.g:293:3: ( rule__EnnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnnumLiteralAccess().getGroup()); 
            // InternalKultoDsl.g:294:3: ( rule__EnnumLiteral__Group__0 )
            // InternalKultoDsl.g:294:4: rule__EnnumLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnnumLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnnumLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnnumLiteral"


    // $ANTLR start "entryRuleEntity"
    // InternalKultoDsl.g:303:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalKultoDsl.g:304:1: ( ruleEntity EOF )
            // InternalKultoDsl.g:305:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalKultoDsl.g:312:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:316:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalKultoDsl.g:317:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalKultoDsl.g:317:2: ( ( rule__Entity__Group__0 ) )
            // InternalKultoDsl.g:318:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalKultoDsl.g:319:3: ( rule__Entity__Group__0 )
            // InternalKultoDsl.g:319:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalKultoDsl.g:328:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalKultoDsl.g:329:1: ( ruleAttribute EOF )
            // InternalKultoDsl.g:330:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalKultoDsl.g:337:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:341:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalKultoDsl.g:342:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalKultoDsl.g:342:2: ( ( rule__Attribute__Group__0 ) )
            // InternalKultoDsl.g:343:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalKultoDsl.g:344:3: ( rule__Attribute__Group__0 )
            // InternalKultoDsl.g:344:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDomainPackage"
    // InternalKultoDsl.g:353:1: entryRuleDomainPackage : ruleDomainPackage EOF ;
    public final void entryRuleDomainPackage() throws RecognitionException {
        try {
            // InternalKultoDsl.g:354:1: ( ruleDomainPackage EOF )
            // InternalKultoDsl.g:355:1: ruleDomainPackage EOF
            {
             before(grammarAccess.getDomainPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainPackage();

            state._fsp--;

             after(grammarAccess.getDomainPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainPackage"


    // $ANTLR start "ruleDomainPackage"
    // InternalKultoDsl.g:362:1: ruleDomainPackage : ( ( rule__DomainPackage__Group__0 ) ) ;
    public final void ruleDomainPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:366:2: ( ( ( rule__DomainPackage__Group__0 ) ) )
            // InternalKultoDsl.g:367:2: ( ( rule__DomainPackage__Group__0 ) )
            {
            // InternalKultoDsl.g:367:2: ( ( rule__DomainPackage__Group__0 ) )
            // InternalKultoDsl.g:368:3: ( rule__DomainPackage__Group__0 )
            {
             before(grammarAccess.getDomainPackageAccess().getGroup()); 
            // InternalKultoDsl.g:369:3: ( rule__DomainPackage__Group__0 )
            // InternalKultoDsl.g:369:4: rule__DomainPackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainPackage"


    // $ANTLR start "entryRuleDomain"
    // InternalKultoDsl.g:378:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalKultoDsl.g:379:1: ( ruleDomain EOF )
            // InternalKultoDsl.g:380:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalKultoDsl.g:387:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:391:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalKultoDsl.g:392:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalKultoDsl.g:392:2: ( ( rule__Domain__Group__0 ) )
            // InternalKultoDsl.g:393:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalKultoDsl.g:394:3: ( rule__Domain__Group__0 )
            // InternalKultoDsl.g:394:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleDomainChild"
    // InternalKultoDsl.g:403:1: entryRuleDomainChild : ruleDomainChild EOF ;
    public final void entryRuleDomainChild() throws RecognitionException {
        try {
            // InternalKultoDsl.g:404:1: ( ruleDomainChild EOF )
            // InternalKultoDsl.g:405:1: ruleDomainChild EOF
            {
             before(grammarAccess.getDomainChildRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainChild();

            state._fsp--;

             after(grammarAccess.getDomainChildRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainChild"


    // $ANTLR start "ruleDomainChild"
    // InternalKultoDsl.g:412:1: ruleDomainChild : ( ( rule__DomainChild__Alternatives ) ) ;
    public final void ruleDomainChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:416:2: ( ( ( rule__DomainChild__Alternatives ) ) )
            // InternalKultoDsl.g:417:2: ( ( rule__DomainChild__Alternatives ) )
            {
            // InternalKultoDsl.g:417:2: ( ( rule__DomainChild__Alternatives ) )
            // InternalKultoDsl.g:418:3: ( rule__DomainChild__Alternatives )
            {
             before(grammarAccess.getDomainChildAccess().getAlternatives()); 
            // InternalKultoDsl.g:419:3: ( rule__DomainChild__Alternatives )
            // InternalKultoDsl.g:419:4: rule__DomainChild__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DomainChild__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomainChildAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainChild"


    // $ANTLR start "entryRuleApplication"
    // InternalKultoDsl.g:428:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalKultoDsl.g:429:1: ( ruleApplication EOF )
            // InternalKultoDsl.g:430:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalKultoDsl.g:437:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:441:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalKultoDsl.g:442:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalKultoDsl.g:442:2: ( ( rule__Application__Group__0 ) )
            // InternalKultoDsl.g:443:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalKultoDsl.g:444:3: ( rule__Application__Group__0 )
            // InternalKultoDsl.g:444:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRulePopis"
    // InternalKultoDsl.g:453:1: entryRulePopis : rulePopis EOF ;
    public final void entryRulePopis() throws RecognitionException {
        try {
            // InternalKultoDsl.g:454:1: ( rulePopis EOF )
            // InternalKultoDsl.g:455:1: rulePopis EOF
            {
             before(grammarAccess.getPopisRule()); 
            pushFollow(FOLLOW_1);
            rulePopis();

            state._fsp--;

             after(grammarAccess.getPopisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePopis"


    // $ANTLR start "rulePopis"
    // InternalKultoDsl.g:462:1: rulePopis : ( ( rule__Popis__Group__0 ) ) ;
    public final void rulePopis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:466:2: ( ( ( rule__Popis__Group__0 ) ) )
            // InternalKultoDsl.g:467:2: ( ( rule__Popis__Group__0 ) )
            {
            // InternalKultoDsl.g:467:2: ( ( rule__Popis__Group__0 ) )
            // InternalKultoDsl.g:468:3: ( rule__Popis__Group__0 )
            {
             before(grammarAccess.getPopisAccess().getGroup()); 
            // InternalKultoDsl.g:469:3: ( rule__Popis__Group__0 )
            // InternalKultoDsl.g:469:4: rule__Popis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Popis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPopisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePopis"


    // $ANTLR start "rule__RootElement__Alternatives"
    // InternalKultoDsl.g:477:1: rule__RootElement__Alternatives : ( ( ruleType ) | ( ruleDomainPackage ) | ( ruleDomain ) | ( ruleApplication ) );
    public final void rule__RootElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:481:1: ( ( ruleType ) | ( ruleDomainPackage ) | ( ruleDomain ) | ( ruleApplication ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
            case 16:
            case 19:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKultoDsl.g:482:2: ( ruleType )
                    {
                    // InternalKultoDsl.g:482:2: ( ruleType )
                    // InternalKultoDsl.g:483:3: ruleType
                    {
                     before(grammarAccess.getRootElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:488:2: ( ruleDomainPackage )
                    {
                    // InternalKultoDsl.g:488:2: ( ruleDomainPackage )
                    // InternalKultoDsl.g:489:3: ruleDomainPackage
                    {
                     before(grammarAccess.getRootElementAccess().getDomainPackageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDomainPackage();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getDomainPackageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKultoDsl.g:494:2: ( ruleDomain )
                    {
                    // InternalKultoDsl.g:494:2: ( ruleDomain )
                    // InternalKultoDsl.g:495:3: ruleDomain
                    {
                     before(grammarAccess.getRootElementAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getDomainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKultoDsl.g:500:2: ( ruleApplication )
                    {
                    // InternalKultoDsl.g:500:2: ( ruleApplication )
                    // InternalKultoDsl.g:501:3: ruleApplication
                    {
                     before(grammarAccess.getRootElementAccess().getApplicationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleApplication();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getApplicationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalKultoDsl.g:510:1: rule__Type__Alternatives : ( ( rulePrimitive ) | ( ruleDomainType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:514:1: ( ( rulePrimitive ) | ( ruleDomainType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==16||LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKultoDsl.g:515:2: ( rulePrimitive )
                    {
                    // InternalKultoDsl.g:515:2: ( rulePrimitive )
                    // InternalKultoDsl.g:516:3: rulePrimitive
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitive();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:521:2: ( ruleDomainType )
                    {
                    // InternalKultoDsl.g:521:2: ( ruleDomainType )
                    // InternalKultoDsl.g:522:3: ruleDomainType
                    {
                     before(grammarAccess.getTypeAccess().getDomainTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDomainType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDomainTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DomainType__Alternatives"
    // InternalKultoDsl.g:531:1: rule__DomainType__Alternatives : ( ( ruleEnnum ) | ( ruleEntity ) );
    public final void rule__DomainType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:535:1: ( ( ruleEnnum ) | ( ruleEntity ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKultoDsl.g:536:2: ( ruleEnnum )
                    {
                    // InternalKultoDsl.g:536:2: ( ruleEnnum )
                    // InternalKultoDsl.g:537:3: ruleEnnum
                    {
                     before(grammarAccess.getDomainTypeAccess().getEnnumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnnum();

                    state._fsp--;

                     after(grammarAccess.getDomainTypeAccess().getEnnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:542:2: ( ruleEntity )
                    {
                    // InternalKultoDsl.g:542:2: ( ruleEntity )
                    // InternalKultoDsl.g:543:3: ruleEntity
                    {
                     before(grammarAccess.getDomainTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDomainTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainType__Alternatives"


    // $ANTLR start "rule__DomainChild__Alternatives"
    // InternalKultoDsl.g:552:1: rule__DomainChild__Alternatives : ( ( ruleDomainPackage ) | ( ruleDomainType ) );
    public final void rule__DomainChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:556:1: ( ( ruleDomainPackage ) | ( ruleDomainType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==16||LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKultoDsl.g:557:2: ( ruleDomainPackage )
                    {
                    // InternalKultoDsl.g:557:2: ( ruleDomainPackage )
                    // InternalKultoDsl.g:558:3: ruleDomainPackage
                    {
                     before(grammarAccess.getDomainChildAccess().getDomainPackageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDomainPackage();

                    state._fsp--;

                     after(grammarAccess.getDomainChildAccess().getDomainPackageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:563:2: ( ruleDomainType )
                    {
                    // InternalKultoDsl.g:563:2: ( ruleDomainType )
                    // InternalKultoDsl.g:564:3: ruleDomainType
                    {
                     before(grammarAccess.getDomainChildAccess().getDomainTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDomainType();

                    state._fsp--;

                     after(grammarAccess.getDomainChildAccess().getDomainTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainChild__Alternatives"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalKultoDsl.g:573:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:577:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalKultoDsl.g:578:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalKultoDsl.g:585:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:589:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:590:1: ( RULE_ID )
            {
            // InternalKultoDsl.g:590:1: ( RULE_ID )
            // InternalKultoDsl.g:591:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalKultoDsl.g:600:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:604:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalKultoDsl.g:605:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalKultoDsl.g:611:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:615:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalKultoDsl.g:616:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalKultoDsl.g:616:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalKultoDsl.g:617:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalKultoDsl.g:618:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalKultoDsl.g:618:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalKultoDsl.g:627:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:631:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalKultoDsl.g:632:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalKultoDsl.g:639:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:643:1: ( ( '.' ) )
            // InternalKultoDsl.g:644:1: ( '.' )
            {
            // InternalKultoDsl.g:644:1: ( '.' )
            // InternalKultoDsl.g:645:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalKultoDsl.g:654:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:658:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalKultoDsl.g:659:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalKultoDsl.g:665:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:669:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:670:1: ( RULE_ID )
            {
            // InternalKultoDsl.g:670:1: ( RULE_ID )
            // InternalKultoDsl.g:671:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalKultoDsl.g:681:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:685:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalKultoDsl.g:686:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalKultoDsl.g:693:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:697:1: ( ( ruleQualifiedName ) )
            // InternalKultoDsl.g:698:1: ( ruleQualifiedName )
            {
            // InternalKultoDsl.g:698:1: ( ruleQualifiedName )
            // InternalKultoDsl.g:699:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalKultoDsl.g:708:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:712:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // InternalKultoDsl.g:713:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalKultoDsl.g:720:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:724:1: ( ( '.' ) )
            // InternalKultoDsl.g:725:1: ( '.' )
            {
            // InternalKultoDsl.g:725:1: ( '.' )
            // InternalKultoDsl.g:726:2: '.'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2"
    // InternalKultoDsl.g:735:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:739:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // InternalKultoDsl.g:740:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2__Impl"
    // InternalKultoDsl.g:746:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:750:1: ( ( '*' ) )
            // InternalKultoDsl.g:751:1: ( '*' )
            {
            // InternalKultoDsl.g:751:1: ( '*' )
            // InternalKultoDsl.g:752:2: '*'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalKultoDsl.g:762:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:766:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalKultoDsl.g:767:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalKultoDsl.g:774:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:778:1: ( ( 'import' ) )
            // InternalKultoDsl.g:779:1: ( 'import' )
            {
            // InternalKultoDsl.g:779:1: ( 'import' )
            // InternalKultoDsl.g:780:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalKultoDsl.g:789:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:793:1: ( rule__Import__Group__1__Impl )
            // InternalKultoDsl.g:794:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalKultoDsl.g:800:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:804:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalKultoDsl.g:805:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalKultoDsl.g:805:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalKultoDsl.g:806:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalKultoDsl.g:807:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalKultoDsl.g:807:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // InternalKultoDsl.g:816:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:820:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // InternalKultoDsl.g:821:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0"


    // $ANTLR start "rule__Primitive__Group__0__Impl"
    // InternalKultoDsl.g:828:1: rule__Primitive__Group__0__Impl : ( 'primitive:' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:832:1: ( ( 'primitive:' ) )
            // InternalKultoDsl.g:833:1: ( 'primitive:' )
            {
            // InternalKultoDsl.g:833:1: ( 'primitive:' )
            // InternalKultoDsl.g:834:2: 'primitive:'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getPrimitiveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0__Impl"


    // $ANTLR start "rule__Primitive__Group__1"
    // InternalKultoDsl.g:843:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:847:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // InternalKultoDsl.g:848:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1"


    // $ANTLR start "rule__Primitive__Group__1__Impl"
    // InternalKultoDsl.g:855:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:859:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // InternalKultoDsl.g:860:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // InternalKultoDsl.g:860:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // InternalKultoDsl.g:861:2: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // InternalKultoDsl.g:862:2: ( rule__Primitive__NameAssignment_1 )
            // InternalKultoDsl.g:862:3: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__2"
    // InternalKultoDsl.g:870:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl rule__Primitive__Group__3 ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:874:1: ( rule__Primitive__Group__2__Impl rule__Primitive__Group__3 )
            // InternalKultoDsl.g:875:2: rule__Primitive__Group__2__Impl rule__Primitive__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Primitive__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__2"


    // $ANTLR start "rule__Primitive__Group__2__Impl"
    // InternalKultoDsl.g:882:1: rule__Primitive__Group__2__Impl : ( 'java:' ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:886:1: ( ( 'java:' ) )
            // InternalKultoDsl.g:887:1: ( 'java:' )
            {
            // InternalKultoDsl.g:887:1: ( 'java:' )
            // InternalKultoDsl.g:888:2: 'java:'
            {
             before(grammarAccess.getPrimitiveAccess().getJavaKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getJavaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__2__Impl"


    // $ANTLR start "rule__Primitive__Group__3"
    // InternalKultoDsl.g:897:1: rule__Primitive__Group__3 : rule__Primitive__Group__3__Impl ;
    public final void rule__Primitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:901:1: ( rule__Primitive__Group__3__Impl )
            // InternalKultoDsl.g:902:2: rule__Primitive__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__3"


    // $ANTLR start "rule__Primitive__Group__3__Impl"
    // InternalKultoDsl.g:908:1: rule__Primitive__Group__3__Impl : ( ( rule__Primitive__JavaTypeAssignment_3 ) ) ;
    public final void rule__Primitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:912:1: ( ( ( rule__Primitive__JavaTypeAssignment_3 ) ) )
            // InternalKultoDsl.g:913:1: ( ( rule__Primitive__JavaTypeAssignment_3 ) )
            {
            // InternalKultoDsl.g:913:1: ( ( rule__Primitive__JavaTypeAssignment_3 ) )
            // InternalKultoDsl.g:914:2: ( rule__Primitive__JavaTypeAssignment_3 )
            {
             before(grammarAccess.getPrimitiveAccess().getJavaTypeAssignment_3()); 
            // InternalKultoDsl.g:915:2: ( rule__Primitive__JavaTypeAssignment_3 )
            // InternalKultoDsl.g:915:3: rule__Primitive__JavaTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__JavaTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getJavaTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__3__Impl"


    // $ANTLR start "rule__Ennum__Group__0"
    // InternalKultoDsl.g:924:1: rule__Ennum__Group__0 : rule__Ennum__Group__0__Impl rule__Ennum__Group__1 ;
    public final void rule__Ennum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:928:1: ( rule__Ennum__Group__0__Impl rule__Ennum__Group__1 )
            // InternalKultoDsl.g:929:2: rule__Ennum__Group__0__Impl rule__Ennum__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Ennum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ennum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__0"


    // $ANTLR start "rule__Ennum__Group__0__Impl"
    // InternalKultoDsl.g:936:1: rule__Ennum__Group__0__Impl : ( 'enum:' ) ;
    public final void rule__Ennum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:940:1: ( ( 'enum:' ) )
            // InternalKultoDsl.g:941:1: ( 'enum:' )
            {
            // InternalKultoDsl.g:941:1: ( 'enum:' )
            // InternalKultoDsl.g:942:2: 'enum:'
            {
             before(grammarAccess.getEnnumAccess().getEnumKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__0__Impl"


    // $ANTLR start "rule__Ennum__Group__1"
    // InternalKultoDsl.g:951:1: rule__Ennum__Group__1 : rule__Ennum__Group__1__Impl rule__Ennum__Group__2 ;
    public final void rule__Ennum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:955:1: ( rule__Ennum__Group__1__Impl rule__Ennum__Group__2 )
            // InternalKultoDsl.g:956:2: rule__Ennum__Group__1__Impl rule__Ennum__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Ennum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ennum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__1"


    // $ANTLR start "rule__Ennum__Group__1__Impl"
    // InternalKultoDsl.g:963:1: rule__Ennum__Group__1__Impl : ( ( rule__Ennum__NameAssignment_1 ) ) ;
    public final void rule__Ennum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:967:1: ( ( ( rule__Ennum__NameAssignment_1 ) ) )
            // InternalKultoDsl.g:968:1: ( ( rule__Ennum__NameAssignment_1 ) )
            {
            // InternalKultoDsl.g:968:1: ( ( rule__Ennum__NameAssignment_1 ) )
            // InternalKultoDsl.g:969:2: ( rule__Ennum__NameAssignment_1 )
            {
             before(grammarAccess.getEnnumAccess().getNameAssignment_1()); 
            // InternalKultoDsl.g:970:2: ( rule__Ennum__NameAssignment_1 )
            // InternalKultoDsl.g:970:3: rule__Ennum__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ennum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__1__Impl"


    // $ANTLR start "rule__Ennum__Group__2"
    // InternalKultoDsl.g:978:1: rule__Ennum__Group__2 : rule__Ennum__Group__2__Impl rule__Ennum__Group__3 ;
    public final void rule__Ennum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:982:1: ( rule__Ennum__Group__2__Impl rule__Ennum__Group__3 )
            // InternalKultoDsl.g:983:2: rule__Ennum__Group__2__Impl rule__Ennum__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Ennum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ennum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__2"


    // $ANTLR start "rule__Ennum__Group__2__Impl"
    // InternalKultoDsl.g:990:1: rule__Ennum__Group__2__Impl : ( '{' ) ;
    public final void rule__Ennum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:994:1: ( ( '{' ) )
            // InternalKultoDsl.g:995:1: ( '{' )
            {
            // InternalKultoDsl.g:995:1: ( '{' )
            // InternalKultoDsl.g:996:2: '{'
            {
             before(grammarAccess.getEnnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEnnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__2__Impl"


    // $ANTLR start "rule__Ennum__Group__3"
    // InternalKultoDsl.g:1005:1: rule__Ennum__Group__3 : rule__Ennum__Group__3__Impl rule__Ennum__Group__4 ;
    public final void rule__Ennum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1009:1: ( rule__Ennum__Group__3__Impl rule__Ennum__Group__4 )
            // InternalKultoDsl.g:1010:2: rule__Ennum__Group__3__Impl rule__Ennum__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Ennum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ennum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__3"


    // $ANTLR start "rule__Ennum__Group__3__Impl"
    // InternalKultoDsl.g:1017:1: rule__Ennum__Group__3__Impl : ( ( rule__Ennum__PopisAssignment_3 )? ) ;
    public final void rule__Ennum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1021:1: ( ( ( rule__Ennum__PopisAssignment_3 )? ) )
            // InternalKultoDsl.g:1022:1: ( ( rule__Ennum__PopisAssignment_3 )? )
            {
            // InternalKultoDsl.g:1022:1: ( ( rule__Ennum__PopisAssignment_3 )? )
            // InternalKultoDsl.g:1023:2: ( rule__Ennum__PopisAssignment_3 )?
            {
             before(grammarAccess.getEnnumAccess().getPopisAssignment_3()); 
            // InternalKultoDsl.g:1024:2: ( rule__Ennum__PopisAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKultoDsl.g:1024:3: rule__Ennum__PopisAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ennum__PopisAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnnumAccess().getPopisAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__3__Impl"


    // $ANTLR start "rule__Ennum__Group__4"
    // InternalKultoDsl.g:1032:1: rule__Ennum__Group__4 : rule__Ennum__Group__4__Impl rule__Ennum__Group__5 ;
    public final void rule__Ennum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1036:1: ( rule__Ennum__Group__4__Impl rule__Ennum__Group__5 )
            // InternalKultoDsl.g:1037:2: rule__Ennum__Group__4__Impl rule__Ennum__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Ennum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ennum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__4"


    // $ANTLR start "rule__Ennum__Group__4__Impl"
    // InternalKultoDsl.g:1044:1: rule__Ennum__Group__4__Impl : ( ( rule__Ennum__LiteralsAssignment_4 )* ) ;
    public final void rule__Ennum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1048:1: ( ( ( rule__Ennum__LiteralsAssignment_4 )* ) )
            // InternalKultoDsl.g:1049:1: ( ( rule__Ennum__LiteralsAssignment_4 )* )
            {
            // InternalKultoDsl.g:1049:1: ( ( rule__Ennum__LiteralsAssignment_4 )* )
            // InternalKultoDsl.g:1050:2: ( rule__Ennum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnnumAccess().getLiteralsAssignment_4()); 
            // InternalKultoDsl.g:1051:2: ( rule__Ennum__LiteralsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKultoDsl.g:1051:3: rule__Ennum__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Ennum__LiteralsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEnnumAccess().getLiteralsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__4__Impl"


    // $ANTLR start "rule__Ennum__Group__5"
    // InternalKultoDsl.g:1059:1: rule__Ennum__Group__5 : rule__Ennum__Group__5__Impl ;
    public final void rule__Ennum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1063:1: ( rule__Ennum__Group__5__Impl )
            // InternalKultoDsl.g:1064:2: rule__Ennum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ennum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__5"


    // $ANTLR start "rule__Ennum__Group__5__Impl"
    // InternalKultoDsl.g:1070:1: rule__Ennum__Group__5__Impl : ( '}' ) ;
    public final void rule__Ennum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1074:1: ( ( '}' ) )
            // InternalKultoDsl.g:1075:1: ( '}' )
            {
            // InternalKultoDsl.g:1075:1: ( '}' )
            // InternalKultoDsl.g:1076:2: '}'
            {
             before(grammarAccess.getEnnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__Group__5__Impl"


    // $ANTLR start "rule__EnnumLiteral__Group__0"
    // InternalKultoDsl.g:1086:1: rule__EnnumLiteral__Group__0 : rule__EnnumLiteral__Group__0__Impl rule__EnnumLiteral__Group__1 ;
    public final void rule__EnnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1090:1: ( rule__EnnumLiteral__Group__0__Impl rule__EnnumLiteral__Group__1 )
            // InternalKultoDsl.g:1091:2: rule__EnnumLiteral__Group__0__Impl rule__EnnumLiteral__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EnnumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnnumLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnnumLiteral__Group__0"


    // $ANTLR start "rule__EnnumLiteral__Group__0__Impl"
    // InternalKultoDsl.g:1098:1: rule__EnnumLiteral__Group__0__Impl : ( ( rule__EnnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1102:1: ( ( ( rule__EnnumLiteral__NameAssignment_0 ) ) )
            // InternalKultoDsl.g:1103:1: ( ( rule__EnnumLiteral__NameAssignment_0 ) )
            {
            // InternalKultoDsl.g:1103:1: ( ( rule__EnnumLiteral__NameAssignment_0 ) )
            // InternalKultoDsl.g:1104:2: ( rule__EnnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnnumLiteralAccess().getNameAssignment_0()); 
            // InternalKultoDsl.g:1105:2: ( rule__EnnumLiteral__NameAssignment_0 )
            // InternalKultoDsl.g:1105:3: rule__EnnumLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnnumLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnnumLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnnumLiteral__Group__1"
    // InternalKultoDsl.g:1113:1: rule__EnnumLiteral__Group__1 : rule__EnnumLiteral__Group__1__Impl ;
    public final void rule__EnnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1117:1: ( rule__EnnumLiteral__Group__1__Impl )
            // InternalKultoDsl.g:1118:2: rule__EnnumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnnumLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnnumLiteral__Group__1"


    // $ANTLR start "rule__EnnumLiteral__Group__1__Impl"
    // InternalKultoDsl.g:1124:1: rule__EnnumLiteral__Group__1__Impl : ( ( rule__EnnumLiteral__PopisAssignment_1 )? ) ;
    public final void rule__EnnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1128:1: ( ( ( rule__EnnumLiteral__PopisAssignment_1 )? ) )
            // InternalKultoDsl.g:1129:1: ( ( rule__EnnumLiteral__PopisAssignment_1 )? )
            {
            // InternalKultoDsl.g:1129:1: ( ( rule__EnnumLiteral__PopisAssignment_1 )? )
            // InternalKultoDsl.g:1130:2: ( rule__EnnumLiteral__PopisAssignment_1 )?
            {
             before(grammarAccess.getEnnumLiteralAccess().getPopisAssignment_1()); 
            // InternalKultoDsl.g:1131:2: ( rule__EnnumLiteral__PopisAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKultoDsl.g:1131:3: rule__EnnumLiteral__PopisAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnnumLiteral__PopisAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnnumLiteralAccess().getPopisAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalKultoDsl.g:1140:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1144:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalKultoDsl.g:1145:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalKultoDsl.g:1152:1: rule__Entity__Group__0__Impl : ( 'entity:' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1156:1: ( ( 'entity:' ) )
            // InternalKultoDsl.g:1157:1: ( 'entity:' )
            {
            // InternalKultoDsl.g:1157:1: ( 'entity:' )
            // InternalKultoDsl.g:1158:2: 'entity:'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalKultoDsl.g:1167:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1171:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalKultoDsl.g:1172:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalKultoDsl.g:1179:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1183:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalKultoDsl.g:1184:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalKultoDsl.g:1184:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalKultoDsl.g:1185:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalKultoDsl.g:1186:2: ( rule__Entity__NameAssignment_1 )
            // InternalKultoDsl.g:1186:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalKultoDsl.g:1194:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1198:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalKultoDsl.g:1199:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalKultoDsl.g:1206:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1210:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalKultoDsl.g:1211:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalKultoDsl.g:1211:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalKultoDsl.g:1212:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalKultoDsl.g:1213:2: ( rule__Entity__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKultoDsl.g:1213:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalKultoDsl.g:1221:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1225:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalKultoDsl.g:1226:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalKultoDsl.g:1233:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1237:1: ( ( '{' ) )
            // InternalKultoDsl.g:1238:1: ( '{' )
            {
            // InternalKultoDsl.g:1238:1: ( '{' )
            // InternalKultoDsl.g:1239:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalKultoDsl.g:1248:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1252:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalKultoDsl.g:1253:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalKultoDsl.g:1260:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__PopisAssignment_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1264:1: ( ( ( rule__Entity__PopisAssignment_4 )? ) )
            // InternalKultoDsl.g:1265:1: ( ( rule__Entity__PopisAssignment_4 )? )
            {
            // InternalKultoDsl.g:1265:1: ( ( rule__Entity__PopisAssignment_4 )? )
            // InternalKultoDsl.g:1266:2: ( rule__Entity__PopisAssignment_4 )?
            {
             before(grammarAccess.getEntityAccess().getPopisAssignment_4()); 
            // InternalKultoDsl.g:1267:2: ( rule__Entity__PopisAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKultoDsl.g:1267:3: rule__Entity__PopisAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__PopisAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getPopisAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalKultoDsl.g:1275:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1279:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalKultoDsl.g:1280:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalKultoDsl.g:1287:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1291:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // InternalKultoDsl.g:1292:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // InternalKultoDsl.g:1292:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // InternalKultoDsl.g:1293:2: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // InternalKultoDsl.g:1294:2: ( rule__Entity__AttributesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKultoDsl.g:1294:3: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalKultoDsl.g:1302:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1306:1: ( rule__Entity__Group__6__Impl )
            // InternalKultoDsl.g:1307:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalKultoDsl.g:1313:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1317:1: ( ( '}' ) )
            // InternalKultoDsl.g:1318:1: ( '}' )
            {
            // InternalKultoDsl.g:1318:1: ( '}' )
            // InternalKultoDsl.g:1319:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalKultoDsl.g:1329:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1333:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalKultoDsl.g:1334:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalKultoDsl.g:1341:1: rule__Entity__Group_2__0__Impl : ( 'extends>' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1345:1: ( ( 'extends>' ) )
            // InternalKultoDsl.g:1346:1: ( 'extends>' )
            {
            // InternalKultoDsl.g:1346:1: ( 'extends>' )
            // InternalKultoDsl.g:1347:2: 'extends>'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalKultoDsl.g:1356:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1360:1: ( rule__Entity__Group_2__1__Impl )
            // InternalKultoDsl.g:1361:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalKultoDsl.g:1367:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1371:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalKultoDsl.g:1372:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalKultoDsl.g:1372:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalKultoDsl.g:1373:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalKultoDsl.g:1374:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalKultoDsl.g:1374:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalKultoDsl.g:1383:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1387:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalKultoDsl.g:1388:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalKultoDsl.g:1395:1: rule__Attribute__Group__0__Impl : ( 'atr:' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1399:1: ( ( 'atr:' ) )
            // InternalKultoDsl.g:1400:1: ( 'atr:' )
            {
            // InternalKultoDsl.g:1400:1: ( 'atr:' )
            // InternalKultoDsl.g:1401:2: 'atr:'
            {
             before(grammarAccess.getAttributeAccess().getAtrKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAtrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalKultoDsl.g:1410:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1414:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalKultoDsl.g:1415:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalKultoDsl.g:1422:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1426:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalKultoDsl.g:1427:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalKultoDsl.g:1427:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalKultoDsl.g:1428:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalKultoDsl.g:1429:2: ( rule__Attribute__NameAssignment_1 )
            // InternalKultoDsl.g:1429:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalKultoDsl.g:1437:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1441:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalKultoDsl.g:1442:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalKultoDsl.g:1449:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1453:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalKultoDsl.g:1454:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalKultoDsl.g:1454:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalKultoDsl.g:1455:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalKultoDsl.g:1456:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalKultoDsl.g:1456:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalKultoDsl.g:1464:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1468:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalKultoDsl.g:1469:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalKultoDsl.g:1476:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ManyAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1480:1: ( ( ( rule__Attribute__ManyAssignment_3 )? ) )
            // InternalKultoDsl.g:1481:1: ( ( rule__Attribute__ManyAssignment_3 )? )
            {
            // InternalKultoDsl.g:1481:1: ( ( rule__Attribute__ManyAssignment_3 )? )
            // InternalKultoDsl.g:1482:2: ( rule__Attribute__ManyAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_3()); 
            // InternalKultoDsl.g:1483:2: ( rule__Attribute__ManyAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKultoDsl.g:1483:3: rule__Attribute__ManyAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ManyAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalKultoDsl.g:1491:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1495:1: ( rule__Attribute__Group__4__Impl )
            // InternalKultoDsl.g:1496:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalKultoDsl.g:1502:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__PopisAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1506:1: ( ( ( rule__Attribute__PopisAssignment_4 )? ) )
            // InternalKultoDsl.g:1507:1: ( ( rule__Attribute__PopisAssignment_4 )? )
            {
            // InternalKultoDsl.g:1507:1: ( ( rule__Attribute__PopisAssignment_4 )? )
            // InternalKultoDsl.g:1508:2: ( rule__Attribute__PopisAssignment_4 )?
            {
             before(grammarAccess.getAttributeAccess().getPopisAssignment_4()); 
            // InternalKultoDsl.g:1509:2: ( rule__Attribute__PopisAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKultoDsl.g:1509:3: rule__Attribute__PopisAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__PopisAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getPopisAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__DomainPackage__Group__0"
    // InternalKultoDsl.g:1518:1: rule__DomainPackage__Group__0 : rule__DomainPackage__Group__0__Impl rule__DomainPackage__Group__1 ;
    public final void rule__DomainPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1522:1: ( rule__DomainPackage__Group__0__Impl rule__DomainPackage__Group__1 )
            // InternalKultoDsl.g:1523:2: rule__DomainPackage__Group__0__Impl rule__DomainPackage__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DomainPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__0"


    // $ANTLR start "rule__DomainPackage__Group__0__Impl"
    // InternalKultoDsl.g:1530:1: rule__DomainPackage__Group__0__Impl : ( 'package:' ) ;
    public final void rule__DomainPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1534:1: ( ( 'package:' ) )
            // InternalKultoDsl.g:1535:1: ( 'package:' )
            {
            // InternalKultoDsl.g:1535:1: ( 'package:' )
            // InternalKultoDsl.g:1536:2: 'package:'
            {
             before(grammarAccess.getDomainPackageAccess().getPackageKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDomainPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__0__Impl"


    // $ANTLR start "rule__DomainPackage__Group__1"
    // InternalKultoDsl.g:1545:1: rule__DomainPackage__Group__1 : rule__DomainPackage__Group__1__Impl rule__DomainPackage__Group__2 ;
    public final void rule__DomainPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1549:1: ( rule__DomainPackage__Group__1__Impl rule__DomainPackage__Group__2 )
            // InternalKultoDsl.g:1550:2: rule__DomainPackage__Group__1__Impl rule__DomainPackage__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DomainPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__1"


    // $ANTLR start "rule__DomainPackage__Group__1__Impl"
    // InternalKultoDsl.g:1557:1: rule__DomainPackage__Group__1__Impl : ( ( rule__DomainPackage__NameAssignment_1 ) ) ;
    public final void rule__DomainPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1561:1: ( ( ( rule__DomainPackage__NameAssignment_1 ) ) )
            // InternalKultoDsl.g:1562:1: ( ( rule__DomainPackage__NameAssignment_1 ) )
            {
            // InternalKultoDsl.g:1562:1: ( ( rule__DomainPackage__NameAssignment_1 ) )
            // InternalKultoDsl.g:1563:2: ( rule__DomainPackage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainPackageAccess().getNameAssignment_1()); 
            // InternalKultoDsl.g:1564:2: ( rule__DomainPackage__NameAssignment_1 )
            // InternalKultoDsl.g:1564:3: rule__DomainPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainPackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__1__Impl"


    // $ANTLR start "rule__DomainPackage__Group__2"
    // InternalKultoDsl.g:1572:1: rule__DomainPackage__Group__2 : rule__DomainPackage__Group__2__Impl rule__DomainPackage__Group__3 ;
    public final void rule__DomainPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1576:1: ( rule__DomainPackage__Group__2__Impl rule__DomainPackage__Group__3 )
            // InternalKultoDsl.g:1577:2: rule__DomainPackage__Group__2__Impl rule__DomainPackage__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__DomainPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__2"


    // $ANTLR start "rule__DomainPackage__Group__2__Impl"
    // InternalKultoDsl.g:1584:1: rule__DomainPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1588:1: ( ( '{' ) )
            // InternalKultoDsl.g:1589:1: ( '{' )
            {
            // InternalKultoDsl.g:1589:1: ( '{' )
            // InternalKultoDsl.g:1590:2: '{'
            {
             before(grammarAccess.getDomainPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__2__Impl"


    // $ANTLR start "rule__DomainPackage__Group__3"
    // InternalKultoDsl.g:1599:1: rule__DomainPackage__Group__3 : rule__DomainPackage__Group__3__Impl rule__DomainPackage__Group__4 ;
    public final void rule__DomainPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1603:1: ( rule__DomainPackage__Group__3__Impl rule__DomainPackage__Group__4 )
            // InternalKultoDsl.g:1604:2: rule__DomainPackage__Group__3__Impl rule__DomainPackage__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__DomainPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainPackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__3"


    // $ANTLR start "rule__DomainPackage__Group__3__Impl"
    // InternalKultoDsl.g:1611:1: rule__DomainPackage__Group__3__Impl : ( ( rule__DomainPackage__ImportsAssignment_3 )* ) ;
    public final void rule__DomainPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1615:1: ( ( ( rule__DomainPackage__ImportsAssignment_3 )* ) )
            // InternalKultoDsl.g:1616:1: ( ( rule__DomainPackage__ImportsAssignment_3 )* )
            {
            // InternalKultoDsl.g:1616:1: ( ( rule__DomainPackage__ImportsAssignment_3 )* )
            // InternalKultoDsl.g:1617:2: ( rule__DomainPackage__ImportsAssignment_3 )*
            {
             before(grammarAccess.getDomainPackageAccess().getImportsAssignment_3()); 
            // InternalKultoDsl.g:1618:2: ( rule__DomainPackage__ImportsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKultoDsl.g:1618:3: rule__DomainPackage__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__DomainPackage__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDomainPackageAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__3__Impl"


    // $ANTLR start "rule__DomainPackage__Group__4"
    // InternalKultoDsl.g:1626:1: rule__DomainPackage__Group__4 : rule__DomainPackage__Group__4__Impl rule__DomainPackage__Group__5 ;
    public final void rule__DomainPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1630:1: ( rule__DomainPackage__Group__4__Impl rule__DomainPackage__Group__5 )
            // InternalKultoDsl.g:1631:2: rule__DomainPackage__Group__4__Impl rule__DomainPackage__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__DomainPackage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainPackage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__4"


    // $ANTLR start "rule__DomainPackage__Group__4__Impl"
    // InternalKultoDsl.g:1638:1: rule__DomainPackage__Group__4__Impl : ( ( rule__DomainPackage__TypesAssignment_4 )* ) ;
    public final void rule__DomainPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1642:1: ( ( ( rule__DomainPackage__TypesAssignment_4 )* ) )
            // InternalKultoDsl.g:1643:1: ( ( rule__DomainPackage__TypesAssignment_4 )* )
            {
            // InternalKultoDsl.g:1643:1: ( ( rule__DomainPackage__TypesAssignment_4 )* )
            // InternalKultoDsl.g:1644:2: ( rule__DomainPackage__TypesAssignment_4 )*
            {
             before(grammarAccess.getDomainPackageAccess().getTypesAssignment_4()); 
            // InternalKultoDsl.g:1645:2: ( rule__DomainPackage__TypesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16||LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKultoDsl.g:1645:3: rule__DomainPackage__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DomainPackage__TypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDomainPackageAccess().getTypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__4__Impl"


    // $ANTLR start "rule__DomainPackage__Group__5"
    // InternalKultoDsl.g:1653:1: rule__DomainPackage__Group__5 : rule__DomainPackage__Group__5__Impl ;
    public final void rule__DomainPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1657:1: ( rule__DomainPackage__Group__5__Impl )
            // InternalKultoDsl.g:1658:2: rule__DomainPackage__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainPackage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__5"


    // $ANTLR start "rule__DomainPackage__Group__5__Impl"
    // InternalKultoDsl.g:1664:1: rule__DomainPackage__Group__5__Impl : ( '}' ) ;
    public final void rule__DomainPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1668:1: ( ( '}' ) )
            // InternalKultoDsl.g:1669:1: ( '}' )
            {
            // InternalKultoDsl.g:1669:1: ( '}' )
            // InternalKultoDsl.g:1670:2: '}'
            {
             before(grammarAccess.getDomainPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalKultoDsl.g:1680:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1684:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalKultoDsl.g:1685:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalKultoDsl.g:1692:1: rule__Domain__Group__0__Impl : ( 'domain:' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1696:1: ( ( 'domain:' ) )
            // InternalKultoDsl.g:1697:1: ( 'domain:' )
            {
            // InternalKultoDsl.g:1697:1: ( 'domain:' )
            // InternalKultoDsl.g:1698:2: 'domain:'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalKultoDsl.g:1707:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1711:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalKultoDsl.g:1712:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalKultoDsl.g:1719:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1723:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalKultoDsl.g:1724:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalKultoDsl.g:1724:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalKultoDsl.g:1725:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalKultoDsl.g:1726:2: ( rule__Domain__NameAssignment_1 )
            // InternalKultoDsl.g:1726:3: rule__Domain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalKultoDsl.g:1734:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1738:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalKultoDsl.g:1739:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalKultoDsl.g:1746:1: rule__Domain__Group__2__Impl : ( '{' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1750:1: ( ( '{' ) )
            // InternalKultoDsl.g:1751:1: ( '{' )
            {
            // InternalKultoDsl.g:1751:1: ( '{' )
            // InternalKultoDsl.g:1752:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // InternalKultoDsl.g:1761:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1765:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalKultoDsl.g:1766:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // InternalKultoDsl.g:1773:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__PopisAssignment_3 )? ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1777:1: ( ( ( rule__Domain__PopisAssignment_3 )? ) )
            // InternalKultoDsl.g:1778:1: ( ( rule__Domain__PopisAssignment_3 )? )
            {
            // InternalKultoDsl.g:1778:1: ( ( rule__Domain__PopisAssignment_3 )? )
            // InternalKultoDsl.g:1779:2: ( rule__Domain__PopisAssignment_3 )?
            {
             before(grammarAccess.getDomainAccess().getPopisAssignment_3()); 
            // InternalKultoDsl.g:1780:2: ( rule__Domain__PopisAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKultoDsl.g:1780:3: rule__Domain__PopisAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__PopisAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainAccess().getPopisAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // InternalKultoDsl.g:1788:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1792:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalKultoDsl.g:1793:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // InternalKultoDsl.g:1800:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ChildrenAssignment_4 )* ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1804:1: ( ( ( rule__Domain__ChildrenAssignment_4 )* ) )
            // InternalKultoDsl.g:1805:1: ( ( rule__Domain__ChildrenAssignment_4 )* )
            {
            // InternalKultoDsl.g:1805:1: ( ( rule__Domain__ChildrenAssignment_4 )* )
            // InternalKultoDsl.g:1806:2: ( rule__Domain__ChildrenAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getChildrenAssignment_4()); 
            // InternalKultoDsl.g:1807:2: ( rule__Domain__ChildrenAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16||LA18_0==19||LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKultoDsl.g:1807:3: rule__Domain__ChildrenAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Domain__ChildrenAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getChildrenAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // InternalKultoDsl.g:1815:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1819:1: ( rule__Domain__Group__5__Impl )
            // InternalKultoDsl.g:1820:2: rule__Domain__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // InternalKultoDsl.g:1826:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1830:1: ( ( '}' ) )
            // InternalKultoDsl.g:1831:1: ( '}' )
            {
            // InternalKultoDsl.g:1831:1: ( '}' )
            // InternalKultoDsl.g:1832:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalKultoDsl.g:1842:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1846:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalKultoDsl.g:1847:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalKultoDsl.g:1854:1: rule__Application__Group__0__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1858:1: ( ( 'application:' ) )
            // InternalKultoDsl.g:1859:1: ( 'application:' )
            {
            // InternalKultoDsl.g:1859:1: ( 'application:' )
            // InternalKultoDsl.g:1860:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalKultoDsl.g:1869:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1873:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalKultoDsl.g:1874:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalKultoDsl.g:1881:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1885:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalKultoDsl.g:1886:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalKultoDsl.g:1886:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalKultoDsl.g:1887:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalKultoDsl.g:1888:2: ( rule__Application__NameAssignment_1 )
            // InternalKultoDsl.g:1888:3: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalKultoDsl.g:1896:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1900:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalKultoDsl.g:1901:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalKultoDsl.g:1908:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1912:1: ( ( '{' ) )
            // InternalKultoDsl.g:1913:1: ( '{' )
            {
            // InternalKultoDsl.g:1913:1: ( '{' )
            // InternalKultoDsl.g:1914:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalKultoDsl.g:1923:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1927:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalKultoDsl.g:1928:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalKultoDsl.g:1935:1: rule__Application__Group__3__Impl : ( ( rule__Application__DomainsAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1939:1: ( ( ( rule__Application__DomainsAssignment_3 ) ) )
            // InternalKultoDsl.g:1940:1: ( ( rule__Application__DomainsAssignment_3 ) )
            {
            // InternalKultoDsl.g:1940:1: ( ( rule__Application__DomainsAssignment_3 ) )
            // InternalKultoDsl.g:1941:2: ( rule__Application__DomainsAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getDomainsAssignment_3()); 
            // InternalKultoDsl.g:1942:2: ( rule__Application__DomainsAssignment_3 )
            // InternalKultoDsl.g:1942:3: rule__Application__DomainsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__DomainsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getDomainsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalKultoDsl.g:1950:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1954:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalKultoDsl.g:1955:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalKultoDsl.g:1962:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )* ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1966:1: ( ( ( rule__Application__Group_4__0 )* ) )
            // InternalKultoDsl.g:1967:1: ( ( rule__Application__Group_4__0 )* )
            {
            // InternalKultoDsl.g:1967:1: ( ( rule__Application__Group_4__0 )* )
            // InternalKultoDsl.g:1968:2: ( rule__Application__Group_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // InternalKultoDsl.g:1969:2: ( rule__Application__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKultoDsl.g:1969:3: rule__Application__Group_4__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Application__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalKultoDsl.g:1977:1: rule__Application__Group__5 : rule__Application__Group__5__Impl ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1981:1: ( rule__Application__Group__5__Impl )
            // InternalKultoDsl.g:1982:2: rule__Application__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalKultoDsl.g:1988:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:1992:1: ( ( '}' ) )
            // InternalKultoDsl.g:1993:1: ( '}' )
            {
            // InternalKultoDsl.g:1993:1: ( '}' )
            // InternalKultoDsl.g:1994:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group_4__0"
    // InternalKultoDsl.g:2004:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2008:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // InternalKultoDsl.g:2009:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__0"


    // $ANTLR start "rule__Application__Group_4__0__Impl"
    // InternalKultoDsl.g:2016:1: rule__Application__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2020:1: ( ( ',' ) )
            // InternalKultoDsl.g:2021:1: ( ',' )
            {
            // InternalKultoDsl.g:2021:1: ( ',' )
            // InternalKultoDsl.g:2022:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__0__Impl"


    // $ANTLR start "rule__Application__Group_4__1"
    // InternalKultoDsl.g:2031:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2035:1: ( rule__Application__Group_4__1__Impl )
            // InternalKultoDsl.g:2036:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__1"


    // $ANTLR start "rule__Application__Group_4__1__Impl"
    // InternalKultoDsl.g:2042:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__DomainsAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2046:1: ( ( ( rule__Application__DomainsAssignment_4_1 ) ) )
            // InternalKultoDsl.g:2047:1: ( ( rule__Application__DomainsAssignment_4_1 ) )
            {
            // InternalKultoDsl.g:2047:1: ( ( rule__Application__DomainsAssignment_4_1 ) )
            // InternalKultoDsl.g:2048:2: ( rule__Application__DomainsAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getDomainsAssignment_4_1()); 
            // InternalKultoDsl.g:2049:2: ( rule__Application__DomainsAssignment_4_1 )
            // InternalKultoDsl.g:2049:3: rule__Application__DomainsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__DomainsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getDomainsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_4__1__Impl"


    // $ANTLR start "rule__Popis__Group__0"
    // InternalKultoDsl.g:2058:1: rule__Popis__Group__0 : rule__Popis__Group__0__Impl rule__Popis__Group__1 ;
    public final void rule__Popis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2062:1: ( rule__Popis__Group__0__Impl rule__Popis__Group__1 )
            // InternalKultoDsl.g:2063:2: rule__Popis__Group__0__Impl rule__Popis__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Popis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Popis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Popis__Group__0"


    // $ANTLR start "rule__Popis__Group__0__Impl"
    // InternalKultoDsl.g:2070:1: rule__Popis__Group__0__Impl : ( 'popis:' ) ;
    public final void rule__Popis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2074:1: ( ( 'popis:' ) )
            // InternalKultoDsl.g:2075:1: ( 'popis:' )
            {
            // InternalKultoDsl.g:2075:1: ( 'popis:' )
            // InternalKultoDsl.g:2076:2: 'popis:'
            {
             before(grammarAccess.getPopisAccess().getPopisKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPopisAccess().getPopisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Popis__Group__0__Impl"


    // $ANTLR start "rule__Popis__Group__1"
    // InternalKultoDsl.g:2085:1: rule__Popis__Group__1 : rule__Popis__Group__1__Impl ;
    public final void rule__Popis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2089:1: ( rule__Popis__Group__1__Impl )
            // InternalKultoDsl.g:2090:2: rule__Popis__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Popis__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Popis__Group__1"


    // $ANTLR start "rule__Popis__Group__1__Impl"
    // InternalKultoDsl.g:2096:1: rule__Popis__Group__1__Impl : ( ( rule__Popis__TextAssignment_1 ) ) ;
    public final void rule__Popis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2100:1: ( ( ( rule__Popis__TextAssignment_1 ) ) )
            // InternalKultoDsl.g:2101:1: ( ( rule__Popis__TextAssignment_1 ) )
            {
            // InternalKultoDsl.g:2101:1: ( ( rule__Popis__TextAssignment_1 ) )
            // InternalKultoDsl.g:2102:2: ( rule__Popis__TextAssignment_1 )
            {
             before(grammarAccess.getPopisAccess().getTextAssignment_1()); 
            // InternalKultoDsl.g:2103:2: ( rule__Popis__TextAssignment_1 )
            // InternalKultoDsl.g:2103:3: rule__Popis__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Popis__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPopisAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Popis__Group__1__Impl"


    // $ANTLR start "rule__KultoModel__ElementsAssignment"
    // InternalKultoDsl.g:2112:1: rule__KultoModel__ElementsAssignment : ( ruleRootElement ) ;
    public final void rule__KultoModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2116:1: ( ( ruleRootElement ) )
            // InternalKultoDsl.g:2117:2: ( ruleRootElement )
            {
            // InternalKultoDsl.g:2117:2: ( ruleRootElement )
            // InternalKultoDsl.g:2118:3: ruleRootElement
            {
             before(grammarAccess.getKultoModelAccess().getElementsRootElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRootElement();

            state._fsp--;

             after(grammarAccess.getKultoModelAccess().getElementsRootElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KultoModel__ElementsAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalKultoDsl.g:2127:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2131:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalKultoDsl.g:2132:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalKultoDsl.g:2132:2: ( ruleQualifiedNameWithWildcard )
            // InternalKultoDsl.g:2133:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // InternalKultoDsl.g:2142:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2146:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2147:2: ( RULE_ID )
            {
            // InternalKultoDsl.g:2147:2: ( RULE_ID )
            // InternalKultoDsl.g:2148:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__NameAssignment_1"


    // $ANTLR start "rule__Primitive__JavaTypeAssignment_3"
    // InternalKultoDsl.g:2157:1: rule__Primitive__JavaTypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Primitive__JavaTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2161:1: ( ( RULE_STRING ) )
            // InternalKultoDsl.g:2162:2: ( RULE_STRING )
            {
            // InternalKultoDsl.g:2162:2: ( RULE_STRING )
            // InternalKultoDsl.g:2163:3: RULE_STRING
            {
             before(grammarAccess.getPrimitiveAccess().getJavaTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getJavaTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__JavaTypeAssignment_3"


    // $ANTLR start "rule__Ennum__NameAssignment_1"
    // InternalKultoDsl.g:2172:1: rule__Ennum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ennum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2176:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2177:2: ( RULE_ID )
            {
            // InternalKultoDsl.g:2177:2: ( RULE_ID )
            // InternalKultoDsl.g:2178:3: RULE_ID
            {
             before(grammarAccess.getEnnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__NameAssignment_1"


    // $ANTLR start "rule__Ennum__PopisAssignment_3"
    // InternalKultoDsl.g:2187:1: rule__Ennum__PopisAssignment_3 : ( rulePopis ) ;
    public final void rule__Ennum__PopisAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2191:1: ( ( rulePopis ) )
            // InternalKultoDsl.g:2192:2: ( rulePopis )
            {
            // InternalKultoDsl.g:2192:2: ( rulePopis )
            // InternalKultoDsl.g:2193:3: rulePopis
            {
             before(grammarAccess.getEnnumAccess().getPopisPopisParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePopis();

            state._fsp--;

             after(grammarAccess.getEnnumAccess().getPopisPopisParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__PopisAssignment_3"


    // $ANTLR start "rule__Ennum__LiteralsAssignment_4"
    // InternalKultoDsl.g:2202:1: rule__Ennum__LiteralsAssignment_4 : ( ruleEnnumLiteral ) ;
    public final void rule__Ennum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2206:1: ( ( ruleEnnumLiteral ) )
            // InternalKultoDsl.g:2207:2: ( ruleEnnumLiteral )
            {
            // InternalKultoDsl.g:2207:2: ( ruleEnnumLiteral )
            // InternalKultoDsl.g:2208:3: ruleEnnumLiteral
            {
             before(grammarAccess.getEnnumAccess().getLiteralsEnnumLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnnumAccess().getLiteralsEnnumLiteralParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ennum__LiteralsAssignment_4"


    // $ANTLR start "rule__EnnumLiteral__NameAssignment_0"
    // InternalKultoDsl.g:2217:1: rule__EnnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2221:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2222:2: ( RULE_ID )
            {
            // InternalKultoDsl.g:2222:2: ( RULE_ID )
            // InternalKultoDsl.g:2223:3: RULE_ID
            {
             before(grammarAccess.getEnnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnnumLiteral__NameAssignment_0"


    // $ANTLR start "rule__EnnumLiteral__PopisAssignment_1"
    // InternalKultoDsl.g:2232:1: rule__EnnumLiteral__PopisAssignment_1 : ( rulePopis ) ;
    public final void rule__EnnumLiteral__PopisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2236:1: ( ( rulePopis ) )
            // InternalKultoDsl.g:2237:2: ( rulePopis )
            {
            // InternalKultoDsl.g:2237:2: ( rulePopis )
            // InternalKultoDsl.g:2238:3: rulePopis
            {
             before(grammarAccess.getEnnumLiteralAccess().getPopisPopisParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePopis();

            state._fsp--;

             after(grammarAccess.getEnnumLiteralAccess().getPopisPopisParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnnumLiteral__PopisAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalKultoDsl.g:2247:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2251:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2252:2: ( RULE_ID )
            {
            // InternalKultoDsl.g:2252:2: ( RULE_ID )
            // InternalKultoDsl.g:2253:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalKultoDsl.g:2262:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2266:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKultoDsl.g:2267:2: ( ( ruleQualifiedName ) )
            {
            // InternalKultoDsl.g:2267:2: ( ( ruleQualifiedName ) )
            // InternalKultoDsl.g:2268:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalKultoDsl.g:2269:3: ( ruleQualifiedName )
            // InternalKultoDsl.g:2270:4: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__PopisAssignment_4"
    // InternalKultoDsl.g:2281:1: rule__Entity__PopisAssignment_4 : ( rulePopis ) ;
    public final void rule__Entity__PopisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2285:1: ( ( rulePopis ) )
            // InternalKultoDsl.g:2286:2: ( rulePopis )
            {
            // InternalKultoDsl.g:2286:2: ( rulePopis )
            // InternalKultoDsl.g:2287:3: rulePopis
            {
             before(grammarAccess.getEntityAccess().getPopisPopisParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePopis();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPopisPopisParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PopisAssignment_4"


    // $ANTLR start "rule__Entity__AttributesAssignment_5"
    // InternalKultoDsl.g:2296:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2300:1: ( ( ruleAttribute ) )
            // InternalKultoDsl.g:2301:2: ( ruleAttribute )
            {
            // InternalKultoDsl.g:2301:2: ( ruleAttribute )
            // InternalKultoDsl.g:2302:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalKultoDsl.g:2311:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2315:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2316:2: ( RULE_ID )
            {
            // InternalKultoDsl.g:2316:2: ( RULE_ID )
            // InternalKultoDsl.g:2317:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalKultoDsl.g:2326:1: rule__Attribute__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2330:1: ( ( ( ruleQualifiedName ) ) )
            // InternalKultoDsl.g:2331:2: ( ( ruleQualifiedName ) )
            {
            // InternalKultoDsl.g:2331:2: ( ( ruleQualifiedName ) )
            // InternalKultoDsl.g:2332:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            // InternalKultoDsl.g:2333:3: ( ruleQualifiedName )
            // InternalKultoDsl.g:2334:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__ManyAssignment_3"
    // InternalKultoDsl.g:2345:1: rule__Attribute__ManyAssignment_3 : ( ( '*' ) ) ;
    public final void rule__Attribute__ManyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2349:1: ( ( ( '*' ) ) )
            // InternalKultoDsl.g:2350:2: ( ( '*' ) )
            {
            // InternalKultoDsl.g:2350:2: ( ( '*' ) )
            // InternalKultoDsl.g:2351:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_3_0()); 
            // InternalKultoDsl.g:2352:3: ( '*' )
            // InternalKultoDsl.g:2353:4: '*'
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ManyAssignment_3"


    // $ANTLR start "rule__Attribute__PopisAssignment_4"
    // InternalKultoDsl.g:2364:1: rule__Attribute__PopisAssignment_4 : ( rulePopis ) ;
    public final void rule__Attribute__PopisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2368:1: ( ( rulePopis ) )
            // InternalKultoDsl.g:2369:2: ( rulePopis )
            {
            // InternalKultoDsl.g:2369:2: ( rulePopis )
            // InternalKultoDsl.g:2370:3: rulePopis
            {
             before(grammarAccess.getAttributeAccess().getPopisPopisParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePopis();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getPopisPopisParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__PopisAssignment_4"


    // $ANTLR start "rule__DomainPackage__NameAssignment_1"
    // InternalKultoDsl.g:2379:1: rule__DomainPackage__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2383:1: ( ( ruleQualifiedName ) )
            // InternalKultoDsl.g:2384:2: ( ruleQualifiedName )
            {
            // InternalKultoDsl.g:2384:2: ( ruleQualifiedName )
            // InternalKultoDsl.g:2385:3: ruleQualifiedName
            {
             before(grammarAccess.getDomainPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDomainPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__NameAssignment_1"


    // $ANTLR start "rule__DomainPackage__ImportsAssignment_3"
    // InternalKultoDsl.g:2394:1: rule__DomainPackage__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__DomainPackage__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2398:1: ( ( ruleImport ) )
            // InternalKultoDsl.g:2399:2: ( ruleImport )
            {
            // InternalKultoDsl.g:2399:2: ( ruleImport )
            // InternalKultoDsl.g:2400:3: ruleImport
            {
             before(grammarAccess.getDomainPackageAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDomainPackageAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__ImportsAssignment_3"


    // $ANTLR start "rule__DomainPackage__TypesAssignment_4"
    // InternalKultoDsl.g:2409:1: rule__DomainPackage__TypesAssignment_4 : ( ruleDomainType ) ;
    public final void rule__DomainPackage__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2413:1: ( ( ruleDomainType ) )
            // InternalKultoDsl.g:2414:2: ( ruleDomainType )
            {
            // InternalKultoDsl.g:2414:2: ( ruleDomainType )
            // InternalKultoDsl.g:2415:3: ruleDomainType
            {
             before(grammarAccess.getDomainPackageAccess().getTypesDomainTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainType();

            state._fsp--;

             after(grammarAccess.getDomainPackageAccess().getTypesDomainTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainPackage__TypesAssignment_4"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalKultoDsl.g:2424:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2428:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2429:2: ( RULE_ID )
            {
            // InternalKultoDsl.g:2429:2: ( RULE_ID )
            // InternalKultoDsl.g:2430:3: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_1"


    // $ANTLR start "rule__Domain__PopisAssignment_3"
    // InternalKultoDsl.g:2439:1: rule__Domain__PopisAssignment_3 : ( rulePopis ) ;
    public final void rule__Domain__PopisAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2443:1: ( ( rulePopis ) )
            // InternalKultoDsl.g:2444:2: ( rulePopis )
            {
            // InternalKultoDsl.g:2444:2: ( rulePopis )
            // InternalKultoDsl.g:2445:3: rulePopis
            {
             before(grammarAccess.getDomainAccess().getPopisPopisParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePopis();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getPopisPopisParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__PopisAssignment_3"


    // $ANTLR start "rule__Domain__ChildrenAssignment_4"
    // InternalKultoDsl.g:2454:1: rule__Domain__ChildrenAssignment_4 : ( ruleDomainChild ) ;
    public final void rule__Domain__ChildrenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2458:1: ( ( ruleDomainChild ) )
            // InternalKultoDsl.g:2459:2: ( ruleDomainChild )
            {
            // InternalKultoDsl.g:2459:2: ( ruleDomainChild )
            // InternalKultoDsl.g:2460:3: ruleDomainChild
            {
             before(grammarAccess.getDomainAccess().getChildrenDomainChildParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainChild();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getChildrenDomainChildParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ChildrenAssignment_4"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // InternalKultoDsl.g:2469:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2473:1: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2474:2: ( RULE_ID )
            {
            // InternalKultoDsl.g:2474:2: ( RULE_ID )
            // InternalKultoDsl.g:2475:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__DomainsAssignment_3"
    // InternalKultoDsl.g:2484:1: rule__Application__DomainsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Application__DomainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2488:1: ( ( ( RULE_ID ) ) )
            // InternalKultoDsl.g:2489:2: ( ( RULE_ID ) )
            {
            // InternalKultoDsl.g:2489:2: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2490:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getDomainsDomainCrossReference_3_0()); 
            // InternalKultoDsl.g:2491:3: ( RULE_ID )
            // InternalKultoDsl.g:2492:4: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getDomainsDomainIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDomainsDomainIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getDomainsDomainCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__DomainsAssignment_3"


    // $ANTLR start "rule__Application__DomainsAssignment_4_1"
    // InternalKultoDsl.g:2503:1: rule__Application__DomainsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Application__DomainsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2507:1: ( ( ( RULE_ID ) ) )
            // InternalKultoDsl.g:2508:2: ( ( RULE_ID ) )
            {
            // InternalKultoDsl.g:2508:2: ( ( RULE_ID ) )
            // InternalKultoDsl.g:2509:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getDomainsDomainCrossReference_4_1_0()); 
            // InternalKultoDsl.g:2510:3: ( RULE_ID )
            // InternalKultoDsl.g:2511:4: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getDomainsDomainIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getDomainsDomainIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getDomainsDomainCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__DomainsAssignment_4_1"


    // $ANTLR start "rule__Popis__TextAssignment_1"
    // InternalKultoDsl.g:2522:1: rule__Popis__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Popis__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKultoDsl.g:2526:1: ( ( RULE_STRING ) )
            // InternalKultoDsl.g:2527:2: ( RULE_STRING )
            {
            // InternalKultoDsl.g:2527:2: ( RULE_STRING )
            // InternalKultoDsl.g:2528:3: RULE_STRING
            {
             before(grammarAccess.getPopisAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPopisAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Popis__TextAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001C94002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000D6000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000094002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000044D4000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000494002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});

}
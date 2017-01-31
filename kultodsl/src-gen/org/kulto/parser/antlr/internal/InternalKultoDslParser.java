package org.kulto.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.kulto.services.KultoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKultoDslParser extends AbstractInternalAntlrParser {
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

        public InternalKultoDslParser(TokenStream input, KultoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "KultoModel";
       	}

       	@Override
       	protected KultoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleKultoModel"
    // InternalKultoDsl.g:64:1: entryRuleKultoModel returns [EObject current=null] : iv_ruleKultoModel= ruleKultoModel EOF ;
    public final EObject entryRuleKultoModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKultoModel = null;


        try {
            // InternalKultoDsl.g:64:51: (iv_ruleKultoModel= ruleKultoModel EOF )
            // InternalKultoDsl.g:65:2: iv_ruleKultoModel= ruleKultoModel EOF
            {
             newCompositeNode(grammarAccess.getKultoModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKultoModel=ruleKultoModel();

            state._fsp--;

             current =iv_ruleKultoModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKultoModel"


    // $ANTLR start "ruleKultoModel"
    // InternalKultoDsl.g:71:1: ruleKultoModel returns [EObject current=null] : ( (lv_elements_0_0= ruleRootElement ) )* ;
    public final EObject ruleKultoModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:77:2: ( ( (lv_elements_0_0= ruleRootElement ) )* )
            // InternalKultoDsl.g:78:2: ( (lv_elements_0_0= ruleRootElement ) )*
            {
            // InternalKultoDsl.g:78:2: ( (lv_elements_0_0= ruleRootElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==16||LA1_0==19||(LA1_0>=22 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKultoDsl.g:79:3: (lv_elements_0_0= ruleRootElement )
            	    {
            	    // InternalKultoDsl.g:79:3: (lv_elements_0_0= ruleRootElement )
            	    // InternalKultoDsl.g:80:4: lv_elements_0_0= ruleRootElement
            	    {

            	    				newCompositeNode(grammarAccess.getKultoModelAccess().getElementsRootElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleRootElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getKultoModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.kulto.KultoDsl.RootElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKultoModel"


    // $ANTLR start "entryRuleRootElement"
    // InternalKultoDsl.g:100:1: entryRuleRootElement returns [EObject current=null] : iv_ruleRootElement= ruleRootElement EOF ;
    public final EObject entryRuleRootElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElement = null;


        try {
            // InternalKultoDsl.g:100:52: (iv_ruleRootElement= ruleRootElement EOF )
            // InternalKultoDsl.g:101:2: iv_ruleRootElement= ruleRootElement EOF
            {
             newCompositeNode(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootElement=ruleRootElement();

            state._fsp--;

             current =iv_ruleRootElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // InternalKultoDsl.g:107:1: ruleRootElement returns [EObject current=null] : (this_Type_0= ruleType | this_DomainPackage_1= ruleDomainPackage | this_Domain_2= ruleDomain | this_Application_3= ruleApplication ) ;
    public final EObject ruleRootElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_DomainPackage_1 = null;

        EObject this_Domain_2 = null;

        EObject this_Application_3 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:113:2: ( (this_Type_0= ruleType | this_DomainPackage_1= ruleDomainPackage | this_Domain_2= ruleDomain | this_Application_3= ruleApplication ) )
            // InternalKultoDsl.g:114:2: (this_Type_0= ruleType | this_DomainPackage_1= ruleDomainPackage | this_Domain_2= ruleDomain | this_Application_3= ruleApplication )
            {
            // InternalKultoDsl.g:114:2: (this_Type_0= ruleType | this_DomainPackage_1= ruleDomainPackage | this_Domain_2= ruleDomain | this_Application_3= ruleApplication )
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
                    // InternalKultoDsl.g:115:3: this_Type_0= ruleType
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_0=ruleType();

                    state._fsp--;


                    			current = this_Type_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:124:3: this_DomainPackage_1= ruleDomainPackage
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getDomainPackageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainPackage_1=ruleDomainPackage();

                    state._fsp--;


                    			current = this_DomainPackage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKultoDsl.g:133:3: this_Domain_2= ruleDomain
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getDomainParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Domain_2=ruleDomain();

                    state._fsp--;


                    			current = this_Domain_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKultoDsl.g:142:3: this_Application_3= ruleApplication
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getApplicationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Application_3=ruleApplication();

                    state._fsp--;


                    			current = this_Application_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKultoDsl.g:154:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKultoDsl.g:154:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKultoDsl.g:155:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalKultoDsl.g:161:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalKultoDsl.g:167:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalKultoDsl.g:168:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalKultoDsl.g:168:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalKultoDsl.g:169:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalKultoDsl.g:176:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalKultoDsl.g:177:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalKultoDsl.g:194:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalKultoDsl.g:194:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalKultoDsl.g:195:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalKultoDsl.g:201:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:207:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalKultoDsl.g:208:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalKultoDsl.g:208:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalKultoDsl.g:209:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,11,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
            		
            kw=(Token)match(input,12,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalKultoDsl.g:233:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalKultoDsl.g:233:47: (iv_ruleImport= ruleImport EOF )
            // InternalKultoDsl.g:234:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalKultoDsl.g:240:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:246:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalKultoDsl.g:247:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalKultoDsl.g:247:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalKultoDsl.g:248:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalKultoDsl.g:252:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalKultoDsl.g:253:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalKultoDsl.g:253:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalKultoDsl.g:254:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.kulto.KultoDsl.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // InternalKultoDsl.g:275:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalKultoDsl.g:275:45: (iv_ruleType= ruleType EOF )
            // InternalKultoDsl.g:276:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalKultoDsl.g:282:1: ruleType returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_DomainType_1= ruleDomainType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_DomainType_1 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:288:2: ( (this_Primitive_0= rulePrimitive | this_DomainType_1= ruleDomainType ) )
            // InternalKultoDsl.g:289:2: (this_Primitive_0= rulePrimitive | this_DomainType_1= ruleDomainType )
            {
            // InternalKultoDsl.g:289:2: (this_Primitive_0= rulePrimitive | this_DomainType_1= ruleDomainType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==16||LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKultoDsl.g:290:3: this_Primitive_0= rulePrimitive
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primitive_0=rulePrimitive();

                    state._fsp--;


                    			current = this_Primitive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:299:3: this_DomainType_1= ruleDomainType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDomainTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainType_1=ruleDomainType();

                    state._fsp--;


                    			current = this_DomainType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDomainType"
    // InternalKultoDsl.g:311:1: entryRuleDomainType returns [EObject current=null] : iv_ruleDomainType= ruleDomainType EOF ;
    public final EObject entryRuleDomainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainType = null;


        try {
            // InternalKultoDsl.g:311:51: (iv_ruleDomainType= ruleDomainType EOF )
            // InternalKultoDsl.g:312:2: iv_ruleDomainType= ruleDomainType EOF
            {
             newCompositeNode(grammarAccess.getDomainTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainType=ruleDomainType();

            state._fsp--;

             current =iv_ruleDomainType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainType"


    // $ANTLR start "ruleDomainType"
    // InternalKultoDsl.g:318:1: ruleDomainType returns [EObject current=null] : (this_Ennum_0= ruleEnnum | this_Entity_1= ruleEntity ) ;
    public final EObject ruleDomainType() throws RecognitionException {
        EObject current = null;

        EObject this_Ennum_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:324:2: ( (this_Ennum_0= ruleEnnum | this_Entity_1= ruleEntity ) )
            // InternalKultoDsl.g:325:2: (this_Ennum_0= ruleEnnum | this_Entity_1= ruleEntity )
            {
            // InternalKultoDsl.g:325:2: (this_Ennum_0= ruleEnnum | this_Entity_1= ruleEntity )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKultoDsl.g:326:3: this_Ennum_0= ruleEnnum
                    {

                    			newCompositeNode(grammarAccess.getDomainTypeAccess().getEnnumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ennum_0=ruleEnnum();

                    state._fsp--;


                    			current = this_Ennum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:335:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getDomainTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainType"


    // $ANTLR start "entryRulePrimitive"
    // InternalKultoDsl.g:347:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalKultoDsl.g:347:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalKultoDsl.g:348:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalKultoDsl.g:354:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java:' ( (lv_javaType_3_0= RULE_STRING ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_javaType_3_0=null;


        	enterRule();

        try {
            // InternalKultoDsl.g:360:2: ( (otherlv_0= 'primitive:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java:' ( (lv_javaType_3_0= RULE_STRING ) ) ) )
            // InternalKultoDsl.g:361:2: (otherlv_0= 'primitive:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java:' ( (lv_javaType_3_0= RULE_STRING ) ) )
            {
            // InternalKultoDsl.g:361:2: (otherlv_0= 'primitive:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java:' ( (lv_javaType_3_0= RULE_STRING ) ) )
            // InternalKultoDsl.g:362:3: otherlv_0= 'primitive:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java:' ( (lv_javaType_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveKeyword_0());
            		
            // InternalKultoDsl.g:366:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKultoDsl.g:367:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKultoDsl.g:367:4: (lv_name_1_0= RULE_ID )
            // InternalKultoDsl.g:368:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getJavaKeyword_2());
            		
            // InternalKultoDsl.g:388:3: ( (lv_javaType_3_0= RULE_STRING ) )
            // InternalKultoDsl.g:389:4: (lv_javaType_3_0= RULE_STRING )
            {
            // InternalKultoDsl.g:389:4: (lv_javaType_3_0= RULE_STRING )
            // InternalKultoDsl.g:390:5: lv_javaType_3_0= RULE_STRING
            {
            lv_javaType_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_javaType_3_0, grammarAccess.getPrimitiveAccess().getJavaTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"javaType",
            						lv_javaType_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleEnnum"
    // InternalKultoDsl.g:410:1: entryRuleEnnum returns [EObject current=null] : iv_ruleEnnum= ruleEnnum EOF ;
    public final EObject entryRuleEnnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnnum = null;


        try {
            // InternalKultoDsl.g:410:46: (iv_ruleEnnum= ruleEnnum EOF )
            // InternalKultoDsl.g:411:2: iv_ruleEnnum= ruleEnnum EOF
            {
             newCompositeNode(grammarAccess.getEnnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnnum=ruleEnnum();

            state._fsp--;

             current =iv_ruleEnnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnnum"


    // $ANTLR start "ruleEnnum"
    // InternalKultoDsl.g:417:1: ruleEnnum returns [EObject current=null] : (otherlv_0= 'enum:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_literals_4_0= ruleEnnumLiteral ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_popis_3_0 = null;

        EObject lv_literals_4_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:423:2: ( (otherlv_0= 'enum:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_literals_4_0= ruleEnnumLiteral ) )* otherlv_5= '}' ) )
            // InternalKultoDsl.g:424:2: (otherlv_0= 'enum:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_literals_4_0= ruleEnnumLiteral ) )* otherlv_5= '}' )
            {
            // InternalKultoDsl.g:424:2: (otherlv_0= 'enum:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_literals_4_0= ruleEnnumLiteral ) )* otherlv_5= '}' )
            // InternalKultoDsl.g:425:3: otherlv_0= 'enum:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_literals_4_0= ruleEnnumLiteral ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnnumAccess().getEnumKeyword_0());
            		
            // InternalKultoDsl.g:429:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKultoDsl.g:430:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKultoDsl.g:430:4: (lv_name_1_0= RULE_ID )
            // InternalKultoDsl.g:431:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEnnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKultoDsl.g:451:3: ( (lv_popis_3_0= rulePopis ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKultoDsl.g:452:4: (lv_popis_3_0= rulePopis )
                    {
                    // InternalKultoDsl.g:452:4: (lv_popis_3_0= rulePopis )
                    // InternalKultoDsl.g:453:5: lv_popis_3_0= rulePopis
                    {

                    					newCompositeNode(grammarAccess.getEnnumAccess().getPopisPopisParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_popis_3_0=rulePopis();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnnumRule());
                    					}
                    					set(
                    						current,
                    						"popis",
                    						lv_popis_3_0,
                    						"org.kulto.KultoDsl.Popis");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalKultoDsl.g:470:3: ( (lv_literals_4_0= ruleEnnumLiteral ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKultoDsl.g:471:4: (lv_literals_4_0= ruleEnnumLiteral )
            	    {
            	    // InternalKultoDsl.g:471:4: (lv_literals_4_0= ruleEnnumLiteral )
            	    // InternalKultoDsl.g:472:5: lv_literals_4_0= ruleEnnumLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getEnnumAccess().getLiteralsEnnumLiteralParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_literals_4_0=ruleEnnumLiteral();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnnumRule());
            	    					}
            	    					add(
            	    						current,
            	    						"literals",
            	    						lv_literals_4_0,
            	    						"org.kulto.KultoDsl.EnnumLiteral");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnnumAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnnum"


    // $ANTLR start "entryRuleEnnumLiteral"
    // InternalKultoDsl.g:497:1: entryRuleEnnumLiteral returns [EObject current=null] : iv_ruleEnnumLiteral= ruleEnnumLiteral EOF ;
    public final EObject entryRuleEnnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnnumLiteral = null;


        try {
            // InternalKultoDsl.g:497:53: (iv_ruleEnnumLiteral= ruleEnnumLiteral EOF )
            // InternalKultoDsl.g:498:2: iv_ruleEnnumLiteral= ruleEnnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnnumLiteral=ruleEnnumLiteral();

            state._fsp--;

             current =iv_ruleEnnumLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnnumLiteral"


    // $ANTLR start "ruleEnnumLiteral"
    // InternalKultoDsl.g:504:1: ruleEnnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_popis_1_0= rulePopis ) )? ) ;
    public final EObject ruleEnnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_popis_1_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:510:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_popis_1_0= rulePopis ) )? ) )
            // InternalKultoDsl.g:511:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_popis_1_0= rulePopis ) )? )
            {
            // InternalKultoDsl.g:511:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_popis_1_0= rulePopis ) )? )
            // InternalKultoDsl.g:512:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_popis_1_0= rulePopis ) )?
            {
            // InternalKultoDsl.g:512:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKultoDsl.g:513:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKultoDsl.g:513:4: (lv_name_0_0= RULE_ID )
            // InternalKultoDsl.g:514:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnnumLiteralAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKultoDsl.g:530:3: ( (lv_popis_1_0= rulePopis ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKultoDsl.g:531:4: (lv_popis_1_0= rulePopis )
                    {
                    // InternalKultoDsl.g:531:4: (lv_popis_1_0= rulePopis )
                    // InternalKultoDsl.g:532:5: lv_popis_1_0= rulePopis
                    {

                    					newCompositeNode(grammarAccess.getEnnumLiteralAccess().getPopisPopisParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_popis_1_0=rulePopis();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnnumLiteralRule());
                    					}
                    					set(
                    						current,
                    						"popis",
                    						lv_popis_1_0,
                    						"org.kulto.KultoDsl.Popis");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnnumLiteral"


    // $ANTLR start "entryRuleEntity"
    // InternalKultoDsl.g:553:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalKultoDsl.g:553:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalKultoDsl.g:554:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalKultoDsl.g:560:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends>' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_popis_5_0= rulePopis ) )? ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_popis_5_0 = null;

        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:566:2: ( (otherlv_0= 'entity:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends>' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_popis_5_0= rulePopis ) )? ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) )
            // InternalKultoDsl.g:567:2: (otherlv_0= 'entity:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends>' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_popis_5_0= rulePopis ) )? ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            {
            // InternalKultoDsl.g:567:2: (otherlv_0= 'entity:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends>' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_popis_5_0= rulePopis ) )? ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            // InternalKultoDsl.g:568:3: otherlv_0= 'entity:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends>' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_popis_5_0= rulePopis ) )? ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalKultoDsl.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKultoDsl.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKultoDsl.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalKultoDsl.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKultoDsl.g:590:3: (otherlv_2= 'extends>' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKultoDsl.g:591:4: otherlv_2= 'extends>' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalKultoDsl.g:595:4: ( ( ruleQualifiedName ) )
                    // InternalKultoDsl.g:596:5: ( ruleQualifiedName )
                    {
                    // InternalKultoDsl.g:596:5: ( ruleQualifiedName )
                    // InternalKultoDsl.g:597:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalKultoDsl.g:616:3: ( (lv_popis_5_0= rulePopis ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKultoDsl.g:617:4: (lv_popis_5_0= rulePopis )
                    {
                    // InternalKultoDsl.g:617:4: (lv_popis_5_0= rulePopis )
                    // InternalKultoDsl.g:618:5: lv_popis_5_0= rulePopis
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getPopisPopisParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_popis_5_0=rulePopis();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"popis",
                    						lv_popis_5_0,
                    						"org.kulto.KultoDsl.Popis");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalKultoDsl.g:635:3: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKultoDsl.g:636:4: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalKultoDsl.g:636:4: (lv_attributes_6_0= ruleAttribute )
            	    // InternalKultoDsl.g:637:5: lv_attributes_6_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_6_0,
            	    						"org.kulto.KultoDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalKultoDsl.g:662:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalKultoDsl.g:662:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalKultoDsl.g:663:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalKultoDsl.g:669:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'atr:' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_many_3_0= '*' ) )? ( (lv_popis_4_0= rulePopis ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_many_3_0=null;
        EObject lv_popis_4_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:675:2: ( (otherlv_0= 'atr:' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_many_3_0= '*' ) )? ( (lv_popis_4_0= rulePopis ) )? ) )
            // InternalKultoDsl.g:676:2: (otherlv_0= 'atr:' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_many_3_0= '*' ) )? ( (lv_popis_4_0= rulePopis ) )? )
            {
            // InternalKultoDsl.g:676:2: (otherlv_0= 'atr:' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_many_3_0= '*' ) )? ( (lv_popis_4_0= rulePopis ) )? )
            // InternalKultoDsl.g:677:3: otherlv_0= 'atr:' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_many_3_0= '*' ) )? ( (lv_popis_4_0= rulePopis ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAtrKeyword_0());
            		
            // InternalKultoDsl.g:681:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKultoDsl.g:682:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKultoDsl.g:682:4: (lv_name_1_0= RULE_ID )
            // InternalKultoDsl.g:683:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKultoDsl.g:699:3: ( ( ruleQualifiedName ) )
            // InternalKultoDsl.g:700:4: ( ruleQualifiedName )
            {
            // InternalKultoDsl.g:700:4: ( ruleQualifiedName )
            // InternalKultoDsl.g:701:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKultoDsl.g:715:3: ( (lv_many_3_0= '*' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKultoDsl.g:716:4: (lv_many_3_0= '*' )
                    {
                    // InternalKultoDsl.g:716:4: (lv_many_3_0= '*' )
                    // InternalKultoDsl.g:717:5: lv_many_3_0= '*'
                    {
                    lv_many_3_0=(Token)match(input,12,FOLLOW_13); 

                    					newLeafNode(lv_many_3_0, grammarAccess.getAttributeAccess().getManyAsteriskKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalKultoDsl.g:729:3: ( (lv_popis_4_0= rulePopis ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKultoDsl.g:730:4: (lv_popis_4_0= rulePopis )
                    {
                    // InternalKultoDsl.g:730:4: (lv_popis_4_0= rulePopis )
                    // InternalKultoDsl.g:731:5: lv_popis_4_0= rulePopis
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getPopisPopisParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_popis_4_0=rulePopis();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"popis",
                    						lv_popis_4_0,
                    						"org.kulto.KultoDsl.Popis");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDomainPackage"
    // InternalKultoDsl.g:752:1: entryRuleDomainPackage returns [EObject current=null] : iv_ruleDomainPackage= ruleDomainPackage EOF ;
    public final EObject entryRuleDomainPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainPackage = null;


        try {
            // InternalKultoDsl.g:752:54: (iv_ruleDomainPackage= ruleDomainPackage EOF )
            // InternalKultoDsl.g:753:2: iv_ruleDomainPackage= ruleDomainPackage EOF
            {
             newCompositeNode(grammarAccess.getDomainPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainPackage=ruleDomainPackage();

            state._fsp--;

             current =iv_ruleDomainPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainPackage"


    // $ANTLR start "ruleDomainPackage"
    // InternalKultoDsl.g:759:1: ruleDomainPackage returns [EObject current=null] : (otherlv_0= 'package:' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleDomainType ) )* otherlv_5= '}' ) ;
    public final EObject ruleDomainPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:765:2: ( (otherlv_0= 'package:' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleDomainType ) )* otherlv_5= '}' ) )
            // InternalKultoDsl.g:766:2: (otherlv_0= 'package:' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleDomainType ) )* otherlv_5= '}' )
            {
            // InternalKultoDsl.g:766:2: (otherlv_0= 'package:' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleDomainType ) )* otherlv_5= '}' )
            // InternalKultoDsl.g:767:3: otherlv_0= 'package:' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleDomainType ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainPackageAccess().getPackageKeyword_0());
            		
            // InternalKultoDsl.g:771:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalKultoDsl.g:772:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalKultoDsl.g:772:4: (lv_name_1_0= ruleQualifiedName )
            // InternalKultoDsl.g:773:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDomainPackageAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.kulto.KultoDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKultoDsl.g:794:3: ( (lv_imports_3_0= ruleImport ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKultoDsl.g:795:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalKultoDsl.g:795:4: (lv_imports_3_0= ruleImport )
            	    // InternalKultoDsl.g:796:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getDomainPackageAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"org.kulto.KultoDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalKultoDsl.g:813:3: ( (lv_types_4_0= ruleDomainType ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16||LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKultoDsl.g:814:4: (lv_types_4_0= ruleDomainType )
            	    {
            	    // InternalKultoDsl.g:814:4: (lv_types_4_0= ruleDomainType )
            	    // InternalKultoDsl.g:815:5: lv_types_4_0= ruleDomainType
            	    {

            	    					newCompositeNode(grammarAccess.getDomainPackageAccess().getTypesDomainTypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_types_4_0=ruleDomainType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_4_0,
            	    						"org.kulto.KultoDsl.DomainType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainPackageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainPackage"


    // $ANTLR start "entryRuleDomain"
    // InternalKultoDsl.g:840:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalKultoDsl.g:840:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalKultoDsl.g:841:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalKultoDsl.g:847:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_children_4_0= ruleDomainChild ) )* otherlv_5= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_popis_3_0 = null;

        EObject lv_children_4_0 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:853:2: ( (otherlv_0= 'domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_children_4_0= ruleDomainChild ) )* otherlv_5= '}' ) )
            // InternalKultoDsl.g:854:2: (otherlv_0= 'domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_children_4_0= ruleDomainChild ) )* otherlv_5= '}' )
            {
            // InternalKultoDsl.g:854:2: (otherlv_0= 'domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_children_4_0= ruleDomainChild ) )* otherlv_5= '}' )
            // InternalKultoDsl.g:855:3: otherlv_0= 'domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_popis_3_0= rulePopis ) )? ( (lv_children_4_0= ruleDomainChild ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalKultoDsl.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKultoDsl.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKultoDsl.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalKultoDsl.g:861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKultoDsl.g:881:3: ( (lv_popis_3_0= rulePopis ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKultoDsl.g:882:4: (lv_popis_3_0= rulePopis )
                    {
                    // InternalKultoDsl.g:882:4: (lv_popis_3_0= rulePopis )
                    // InternalKultoDsl.g:883:5: lv_popis_3_0= rulePopis
                    {

                    					newCompositeNode(grammarAccess.getDomainAccess().getPopisPopisParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_popis_3_0=rulePopis();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainRule());
                    					}
                    					set(
                    						current,
                    						"popis",
                    						lv_popis_3_0,
                    						"org.kulto.KultoDsl.Popis");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalKultoDsl.g:900:3: ( (lv_children_4_0= ruleDomainChild ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16||LA17_0==19||LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKultoDsl.g:901:4: (lv_children_4_0= ruleDomainChild )
            	    {
            	    // InternalKultoDsl.g:901:4: (lv_children_4_0= ruleDomainChild )
            	    // InternalKultoDsl.g:902:5: lv_children_4_0= ruleDomainChild
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getChildrenDomainChildParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_children_4_0=ruleDomainChild();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_4_0,
            	    						"org.kulto.KultoDsl.DomainChild");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleDomainChild"
    // InternalKultoDsl.g:927:1: entryRuleDomainChild returns [EObject current=null] : iv_ruleDomainChild= ruleDomainChild EOF ;
    public final EObject entryRuleDomainChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainChild = null;


        try {
            // InternalKultoDsl.g:927:52: (iv_ruleDomainChild= ruleDomainChild EOF )
            // InternalKultoDsl.g:928:2: iv_ruleDomainChild= ruleDomainChild EOF
            {
             newCompositeNode(grammarAccess.getDomainChildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainChild=ruleDomainChild();

            state._fsp--;

             current =iv_ruleDomainChild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainChild"


    // $ANTLR start "ruleDomainChild"
    // InternalKultoDsl.g:934:1: ruleDomainChild returns [EObject current=null] : (this_DomainPackage_0= ruleDomainPackage | this_DomainType_1= ruleDomainType ) ;
    public final EObject ruleDomainChild() throws RecognitionException {
        EObject current = null;

        EObject this_DomainPackage_0 = null;

        EObject this_DomainType_1 = null;



        	enterRule();

        try {
            // InternalKultoDsl.g:940:2: ( (this_DomainPackage_0= ruleDomainPackage | this_DomainType_1= ruleDomainType ) )
            // InternalKultoDsl.g:941:2: (this_DomainPackage_0= ruleDomainPackage | this_DomainType_1= ruleDomainType )
            {
            // InternalKultoDsl.g:941:2: (this_DomainPackage_0= ruleDomainPackage | this_DomainType_1= ruleDomainType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            else if ( (LA18_0==16||LA18_0==19) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalKultoDsl.g:942:3: this_DomainPackage_0= ruleDomainPackage
                    {

                    			newCompositeNode(grammarAccess.getDomainChildAccess().getDomainPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainPackage_0=ruleDomainPackage();

                    state._fsp--;


                    			current = this_DomainPackage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKultoDsl.g:951:3: this_DomainType_1= ruleDomainType
                    {

                    			newCompositeNode(grammarAccess.getDomainChildAccess().getDomainTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainType_1=ruleDomainType();

                    state._fsp--;


                    			current = this_DomainType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainChild"


    // $ANTLR start "entryRuleApplication"
    // InternalKultoDsl.g:963:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalKultoDsl.g:963:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalKultoDsl.g:964:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalKultoDsl.g:970:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalKultoDsl.g:976:2: ( (otherlv_0= 'application:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalKultoDsl.g:977:2: (otherlv_0= 'application:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalKultoDsl.g:977:2: (otherlv_0= 'application:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalKultoDsl.g:978:3: otherlv_0= 'application:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalKultoDsl.g:982:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKultoDsl.g:983:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKultoDsl.g:983:4: (lv_name_1_0= RULE_ID )
            // InternalKultoDsl.g:984:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKultoDsl.g:1004:3: ( (otherlv_3= RULE_ID ) )
            // InternalKultoDsl.g:1005:4: (otherlv_3= RULE_ID )
            {
            // InternalKultoDsl.g:1005:4: (otherlv_3= RULE_ID )
            // InternalKultoDsl.g:1006:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getDomainsDomainCrossReference_3_0());
            				

            }


            }

            // InternalKultoDsl.g:1017:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKultoDsl.g:1018:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalKultoDsl.g:1022:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalKultoDsl.g:1023:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalKultoDsl.g:1023:5: (otherlv_5= RULE_ID )
            	    // InternalKultoDsl.g:1024:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getApplicationRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getDomainsDomainCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRulePopis"
    // InternalKultoDsl.g:1044:1: entryRulePopis returns [EObject current=null] : iv_rulePopis= rulePopis EOF ;
    public final EObject entryRulePopis() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopis = null;


        try {
            // InternalKultoDsl.g:1044:46: (iv_rulePopis= rulePopis EOF )
            // InternalKultoDsl.g:1045:2: iv_rulePopis= rulePopis EOF
            {
             newCompositeNode(grammarAccess.getPopisRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePopis=rulePopis();

            state._fsp--;

             current =iv_rulePopis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePopis"


    // $ANTLR start "rulePopis"
    // InternalKultoDsl.g:1051:1: rulePopis returns [EObject current=null] : (otherlv_0= 'popis:' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePopis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalKultoDsl.g:1057:2: ( (otherlv_0= 'popis:' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalKultoDsl.g:1058:2: (otherlv_0= 'popis:' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalKultoDsl.g:1058:2: (otherlv_0= 'popis:' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalKultoDsl.g:1059:3: otherlv_0= 'popis:' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPopisAccess().getPopisKeyword_0());
            		
            // InternalKultoDsl.g:1063:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalKultoDsl.g:1064:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalKultoDsl.g:1064:4: (lv_text_1_0= RULE_STRING )
            // InternalKultoDsl.g:1065:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getPopisAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPopisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePopis"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001C94002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000D6000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000D4000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000044D4000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000004D4000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002040000L});

}
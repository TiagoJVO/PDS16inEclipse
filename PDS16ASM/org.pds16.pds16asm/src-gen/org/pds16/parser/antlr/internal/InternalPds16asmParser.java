package org.pds16.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.pds16.services.Pds16asmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPds16asmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LDI'", "','", "';'", "'LD'", "'['", "']'", "'#'", "'R1'", "'R2'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalPds16asmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPds16asmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPds16asmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPds16asm.g"; }



     	private Pds16asmGrammarAccess grammarAccess;

        public InternalPds16asmParser(TokenStream input, Pds16asmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Pds16asmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPds16asm.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPds16asm.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPds16asm.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPds16asm.g:71:1: ruleModel returns [EObject current=null] : ( (lv_operations_0_0= ruleOperations ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:77:2: ( ( (lv_operations_0_0= ruleOperations ) )* )
            // InternalPds16asm.g:78:2: ( (lv_operations_0_0= ruleOperations ) )*
            {
            // InternalPds16asm.g:78:2: ( (lv_operations_0_0= ruleOperations ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPds16asm.g:79:3: (lv_operations_0_0= ruleOperations )
            	    {
            	    // InternalPds16asm.g:79:3: (lv_operations_0_0= ruleOperations )
            	    // InternalPds16asm.g:80:4: lv_operations_0_0= ruleOperations
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_operations_0_0=ruleOperations();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"operations",
            	    					lv_operations_0_0,
            	    					"org.pds16.Pds16asm.Operations");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOperations"
    // InternalPds16asm.g:100:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalPds16asm.g:100:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalPds16asm.g:101:2: iv_ruleOperations= ruleOperations EOF
            {
             newCompositeNode(grammarAccess.getOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;

             current =iv_ruleOperations; 
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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalPds16asm.g:107:1: ruleOperations returns [EObject current=null] : (this_OperationLDI_0= ruleOperationLDI | this_OperationLD2_1= ruleOperationLD2 ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject this_OperationLDI_0 = null;

        EObject this_OperationLD2_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:113:2: ( (this_OperationLDI_0= ruleOperationLDI | this_OperationLD2_1= ruleOperationLD2 ) )
            // InternalPds16asm.g:114:2: (this_OperationLDI_0= ruleOperationLDI | this_OperationLD2_1= ruleOperationLD2 )
            {
            // InternalPds16asm.g:114:2: (this_OperationLDI_0= ruleOperationLDI | this_OperationLD2_1= ruleOperationLD2 )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPds16asm.g:115:3: this_OperationLDI_0= ruleOperationLDI
                    {

                    			newCompositeNode(grammarAccess.getOperationsAccess().getOperationLDIParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationLDI_0=ruleOperationLDI();

                    state._fsp--;


                    			current = this_OperationLDI_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:124:3: this_OperationLD2_1= ruleOperationLD2
                    {

                    			newCompositeNode(grammarAccess.getOperationsAccess().getOperationLD2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationLD2_1=ruleOperationLD2();

                    state._fsp--;


                    			current = this_OperationLD2_1;
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleOperationLDI"
    // InternalPds16asm.g:136:1: entryRuleOperationLDI returns [EObject current=null] : iv_ruleOperationLDI= ruleOperationLDI EOF ;
    public final EObject entryRuleOperationLDI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationLDI = null;


        try {
            // InternalPds16asm.g:136:53: (iv_ruleOperationLDI= ruleOperationLDI EOF )
            // InternalPds16asm.g:137:2: iv_ruleOperationLDI= ruleOperationLDI EOF
            {
             newCompositeNode(grammarAccess.getOperationLDIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationLDI=ruleOperationLDI();

            state._fsp--;

             current =iv_ruleOperationLDI; 
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
    // $ANTLR end "entryRuleOperationLDI"


    // $ANTLR start "ruleOperationLDI"
    // InternalPds16asm.g:143:1: ruleOperationLDI returns [EObject current=null] : (otherlv_0= 'LDI' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_immediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ';' ) ;
    public final EObject ruleOperationLDI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_register_1_0 = null;

        EObject lv_immediate8_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:149:2: ( (otherlv_0= 'LDI' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_immediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ';' ) )
            // InternalPds16asm.g:150:2: (otherlv_0= 'LDI' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_immediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ';' )
            {
            // InternalPds16asm.g:150:2: (otherlv_0= 'LDI' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_immediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ';' )
            // InternalPds16asm.g:151:3: otherlv_0= 'LDI' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_immediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationLDIAccess().getLDIKeyword_0());
            		
            // InternalPds16asm.g:155:3: ( (lv_register_1_0= ruleRegisters ) )
            // InternalPds16asm.g:156:4: (lv_register_1_0= ruleRegisters )
            {
            // InternalPds16asm.g:156:4: (lv_register_1_0= ruleRegisters )
            // InternalPds16asm.g:157:5: lv_register_1_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationLDIAccess().getRegisterRegistersParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_register_1_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationLDIRule());
            					}
            					set(
            						current,
            						"register",
            						lv_register_1_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationLDIAccess().getCommaKeyword_2());
            		
            // InternalPds16asm.g:178:3: ( (lv_immediate8_3_0= ruleHexaDecimal ) )
            // InternalPds16asm.g:179:4: (lv_immediate8_3_0= ruleHexaDecimal )
            {
            // InternalPds16asm.g:179:4: (lv_immediate8_3_0= ruleHexaDecimal )
            // InternalPds16asm.g:180:5: lv_immediate8_3_0= ruleHexaDecimal
            {

            					newCompositeNode(grammarAccess.getOperationLDIAccess().getImmediate8HexaDecimalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_immediate8_3_0=ruleHexaDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationLDIRule());
            					}
            					set(
            						current,
            						"immediate8",
            						lv_immediate8_3_0,
            						"org.pds16.Pds16asm.HexaDecimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationLDIAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleOperationLDI"


    // $ANTLR start "entryRuleOperationLD2"
    // InternalPds16asm.g:205:1: entryRuleOperationLD2 returns [EObject current=null] : iv_ruleOperationLD2= ruleOperationLD2 EOF ;
    public final EObject entryRuleOperationLD2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationLD2 = null;


        try {
            // InternalPds16asm.g:205:53: (iv_ruleOperationLD2= ruleOperationLD2 EOF )
            // InternalPds16asm.g:206:2: iv_ruleOperationLD2= ruleOperationLD2 EOF
            {
             newCompositeNode(grammarAccess.getOperationLD2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationLD2=ruleOperationLD2();

            state._fsp--;

             current =iv_ruleOperationLD2; 
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
    // $ANTLR end "entryRuleOperationLD2"


    // $ANTLR start "ruleOperationLD2"
    // InternalPds16asm.g:212:1: ruleOperationLD2 returns [EObject current=null] : (otherlv_0= 'LD' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_indexed_3_0= ruleIndexed ) ) otherlv_4= ';' ) ;
    public final EObject ruleOperationLD2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_register_1_0 = null;

        EObject lv_indexed_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:218:2: ( (otherlv_0= 'LD' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_indexed_3_0= ruleIndexed ) ) otherlv_4= ';' ) )
            // InternalPds16asm.g:219:2: (otherlv_0= 'LD' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_indexed_3_0= ruleIndexed ) ) otherlv_4= ';' )
            {
            // InternalPds16asm.g:219:2: (otherlv_0= 'LD' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_indexed_3_0= ruleIndexed ) ) otherlv_4= ';' )
            // InternalPds16asm.g:220:3: otherlv_0= 'LD' ( (lv_register_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_indexed_3_0= ruleIndexed ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationLD2Access().getLDKeyword_0());
            		
            // InternalPds16asm.g:224:3: ( (lv_register_1_0= ruleRegisters ) )
            // InternalPds16asm.g:225:4: (lv_register_1_0= ruleRegisters )
            {
            // InternalPds16asm.g:225:4: (lv_register_1_0= ruleRegisters )
            // InternalPds16asm.g:226:5: lv_register_1_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationLD2Access().getRegisterRegistersParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_register_1_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationLD2Rule());
            					}
            					set(
            						current,
            						"register",
            						lv_register_1_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationLD2Access().getCommaKeyword_2());
            		
            // InternalPds16asm.g:247:3: ( (lv_indexed_3_0= ruleIndexed ) )
            // InternalPds16asm.g:248:4: (lv_indexed_3_0= ruleIndexed )
            {
            // InternalPds16asm.g:248:4: (lv_indexed_3_0= ruleIndexed )
            // InternalPds16asm.g:249:5: lv_indexed_3_0= ruleIndexed
            {

            					newCompositeNode(grammarAccess.getOperationLD2Access().getIndexedIndexedParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_indexed_3_0=ruleIndexed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationLD2Rule());
            					}
            					set(
            						current,
            						"indexed",
            						lv_indexed_3_0,
            						"org.pds16.Pds16asm.Indexed");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationLD2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleOperationLD2"


    // $ANTLR start "entryRuleIndexed"
    // InternalPds16asm.g:274:1: entryRuleIndexed returns [EObject current=null] : iv_ruleIndexed= ruleIndexed EOF ;
    public final EObject entryRuleIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexed = null;


        try {
            // InternalPds16asm.g:274:48: (iv_ruleIndexed= ruleIndexed EOF )
            // InternalPds16asm.g:275:2: iv_ruleIndexed= ruleIndexed EOF
            {
             newCompositeNode(grammarAccess.getIndexedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexed=ruleIndexed();

            state._fsp--;

             current =iv_ruleIndexed; 
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
    // $ANTLR end "entryRuleIndexed"


    // $ANTLR start "ruleIndexed"
    // InternalPds16asm.g:281:1: ruleIndexed returns [EObject current=null] : (otherlv_0= '[' ( (lv_reg_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_imediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ']' ) ;
    public final EObject ruleIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reg_1_0 = null;

        EObject lv_imediate8_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:287:2: ( (otherlv_0= '[' ( (lv_reg_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_imediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ']' ) )
            // InternalPds16asm.g:288:2: (otherlv_0= '[' ( (lv_reg_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_imediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ']' )
            {
            // InternalPds16asm.g:288:2: (otherlv_0= '[' ( (lv_reg_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_imediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ']' )
            // InternalPds16asm.g:289:3: otherlv_0= '[' ( (lv_reg_1_0= ruleRegisters ) ) otherlv_2= ',' ( (lv_imediate8_3_0= ruleHexaDecimal ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPds16asm.g:293:3: ( (lv_reg_1_0= ruleRegisters ) )
            // InternalPds16asm.g:294:4: (lv_reg_1_0= ruleRegisters )
            {
            // InternalPds16asm.g:294:4: (lv_reg_1_0= ruleRegisters )
            // InternalPds16asm.g:295:5: lv_reg_1_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getRegRegistersParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_reg_1_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"reg",
            						lv_reg_1_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexedAccess().getCommaKeyword_2());
            		
            // InternalPds16asm.g:316:3: ( (lv_imediate8_3_0= ruleHexaDecimal ) )
            // InternalPds16asm.g:317:4: (lv_imediate8_3_0= ruleHexaDecimal )
            {
            // InternalPds16asm.g:317:4: (lv_imediate8_3_0= ruleHexaDecimal )
            // InternalPds16asm.g:318:5: lv_imediate8_3_0= ruleHexaDecimal
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getImediate8HexaDecimalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_imediate8_3_0=ruleHexaDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"imediate8",
            						lv_imediate8_3_0,
            						"org.pds16.Pds16asm.HexaDecimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexedAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleIndexed"


    // $ANTLR start "entryRuleHexaDecimal"
    // InternalPds16asm.g:343:1: entryRuleHexaDecimal returns [EObject current=null] : iv_ruleHexaDecimal= ruleHexaDecimal EOF ;
    public final EObject entryRuleHexaDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexaDecimal = null;


        try {
            // InternalPds16asm.g:343:52: (iv_ruleHexaDecimal= ruleHexaDecimal EOF )
            // InternalPds16asm.g:344:2: iv_ruleHexaDecimal= ruleHexaDecimal EOF
            {
             newCompositeNode(grammarAccess.getHexaDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHexaDecimal=ruleHexaDecimal();

            state._fsp--;

             current =iv_ruleHexaDecimal; 
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
    // $ANTLR end "entryRuleHexaDecimal"


    // $ANTLR start "ruleHexaDecimal"
    // InternalPds16asm.g:350:1: ruleHexaDecimal returns [EObject current=null] : (otherlv_0= '#' ( (lv_number_1_0= RULE_ID ) ) ) ;
    public final EObject ruleHexaDecimal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:356:2: ( (otherlv_0= '#' ( (lv_number_1_0= RULE_ID ) ) ) )
            // InternalPds16asm.g:357:2: (otherlv_0= '#' ( (lv_number_1_0= RULE_ID ) ) )
            {
            // InternalPds16asm.g:357:2: (otherlv_0= '#' ( (lv_number_1_0= RULE_ID ) ) )
            // InternalPds16asm.g:358:3: otherlv_0= '#' ( (lv_number_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHexaDecimalAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:362:3: ( (lv_number_1_0= RULE_ID ) )
            // InternalPds16asm.g:363:4: (lv_number_1_0= RULE_ID )
            {
            // InternalPds16asm.g:363:4: (lv_number_1_0= RULE_ID )
            // InternalPds16asm.g:364:5: lv_number_1_0= RULE_ID
            {
            lv_number_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_number_1_0, grammarAccess.getHexaDecimalAccess().getNumberIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHexaDecimalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.pds16.Pds16asm.ID");
            				

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
    // $ANTLR end "ruleHexaDecimal"


    // $ANTLR start "entryRuleRegisters"
    // InternalPds16asm.g:384:1: entryRuleRegisters returns [EObject current=null] : iv_ruleRegisters= ruleRegisters EOF ;
    public final EObject entryRuleRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisters = null;


        try {
            // InternalPds16asm.g:384:50: (iv_ruleRegisters= ruleRegisters EOF )
            // InternalPds16asm.g:385:2: iv_ruleRegisters= ruleRegisters EOF
            {
             newCompositeNode(grammarAccess.getRegistersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegisters=ruleRegisters();

            state._fsp--;

             current =iv_ruleRegisters; 
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
    // $ANTLR end "entryRuleRegisters"


    // $ANTLR start "ruleRegisters"
    // InternalPds16asm.g:391:1: ruleRegisters returns [EObject current=null] : (this_R1_0= ruleR1 | this_R2_1= ruleR2 ) ;
    public final EObject ruleRegisters() throws RecognitionException {
        EObject current = null;

        EObject this_R1_0 = null;

        EObject this_R2_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:397:2: ( (this_R1_0= ruleR1 | this_R2_1= ruleR2 ) )
            // InternalPds16asm.g:398:2: (this_R1_0= ruleR1 | this_R2_1= ruleR2 )
            {
            // InternalPds16asm.g:398:2: (this_R1_0= ruleR1 | this_R2_1= ruleR2 )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPds16asm.g:399:3: this_R1_0= ruleR1
                    {

                    			newCompositeNode(grammarAccess.getRegistersAccess().getR1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_R1_0=ruleR1();

                    state._fsp--;


                    			current = this_R1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:408:3: this_R2_1= ruleR2
                    {

                    			newCompositeNode(grammarAccess.getRegistersAccess().getR2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_R2_1=ruleR2();

                    state._fsp--;


                    			current = this_R2_1;
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
    // $ANTLR end "ruleRegisters"


    // $ANTLR start "entryRuleR1"
    // InternalPds16asm.g:420:1: entryRuleR1 returns [EObject current=null] : iv_ruleR1= ruleR1 EOF ;
    public final EObject entryRuleR1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleR1 = null;


        try {
            // InternalPds16asm.g:420:43: (iv_ruleR1= ruleR1 EOF )
            // InternalPds16asm.g:421:2: iv_ruleR1= ruleR1 EOF
            {
             newCompositeNode(grammarAccess.getR1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleR1=ruleR1();

            state._fsp--;

             current =iv_ruleR1; 
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
    // $ANTLR end "entryRuleR1"


    // $ANTLR start "ruleR1"
    // InternalPds16asm.g:427:1: ruleR1 returns [EObject current=null] : ( (lv_value_0_0= 'R1' ) ) ;
    public final EObject ruleR1() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:433:2: ( ( (lv_value_0_0= 'R1' ) ) )
            // InternalPds16asm.g:434:2: ( (lv_value_0_0= 'R1' ) )
            {
            // InternalPds16asm.g:434:2: ( (lv_value_0_0= 'R1' ) )
            // InternalPds16asm.g:435:3: (lv_value_0_0= 'R1' )
            {
            // InternalPds16asm.g:435:3: (lv_value_0_0= 'R1' )
            // InternalPds16asm.g:436:4: lv_value_0_0= 'R1'
            {
            lv_value_0_0=(Token)match(input,18,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getR1Access().getValueR1Keyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getR1Rule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "R1");
            			

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
    // $ANTLR end "ruleR1"


    // $ANTLR start "entryRuleR2"
    // InternalPds16asm.g:451:1: entryRuleR2 returns [EObject current=null] : iv_ruleR2= ruleR2 EOF ;
    public final EObject entryRuleR2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleR2 = null;


        try {
            // InternalPds16asm.g:451:43: (iv_ruleR2= ruleR2 EOF )
            // InternalPds16asm.g:452:2: iv_ruleR2= ruleR2 EOF
            {
             newCompositeNode(grammarAccess.getR2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleR2=ruleR2();

            state._fsp--;

             current =iv_ruleR2; 
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
    // $ANTLR end "entryRuleR2"


    // $ANTLR start "ruleR2"
    // InternalPds16asm.g:458:1: ruleR2 returns [EObject current=null] : ( (lv_value_0_0= 'R2' ) ) ;
    public final EObject ruleR2() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:464:2: ( ( (lv_value_0_0= 'R2' ) ) )
            // InternalPds16asm.g:465:2: ( (lv_value_0_0= 'R2' ) )
            {
            // InternalPds16asm.g:465:2: ( (lv_value_0_0= 'R2' ) )
            // InternalPds16asm.g:466:3: (lv_value_0_0= 'R2' )
            {
            // InternalPds16asm.g:466:3: (lv_value_0_0= 'R2' )
            // InternalPds16asm.g:467:4: lv_value_0_0= 'R2'
            {
            lv_value_0_0=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getR2Access().getValueR2Keyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getR2Rule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "R2");
            			

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
    // $ANTLR end "ruleR2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}
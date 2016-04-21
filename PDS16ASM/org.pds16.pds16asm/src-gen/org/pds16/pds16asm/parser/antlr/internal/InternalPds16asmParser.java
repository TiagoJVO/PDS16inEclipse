package org.pds16.pds16asm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.pds16.pds16asm.services.Pds16asmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPds16asmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HEX", "RULE_OCT", "RULE_BIN", "RULE_CHAR", "RULE_SIGN", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "':'", "'.bss'", "'.data'", "'.end'", "'.text'", "'.ascii'", "','", "'.asciiz'", "'.byte'", "'.word'", "'.space'", "'.set'", "'.section'", "'.org'", "'.equ'", "'ldi'", "'ldih'", "'ld'", "'ldb'", "'st'", "'stb'", "'add'", "'addf'", "'adc'", "'adcf'", "'inc'", "'incf'", "'sub'", "'subf'", "'sbb'", "'sbbf'", "'subr'", "'dec'", "'decf'", "'anl'", "'anlf'", "'orl'", "'orlf'", "'mov'", "'movf'", "'xrl'", "'xrlf'", "'not'", "'notf'", "'shl'", "'shr'", "'rrl'", "'rrm'", "'rcr'", "'rcl'", "'jz'", "'je'", "'jnz'", "'jne'", "'jc'", "'jbl'", "'jnc'", "'jae'", "'jmp'", "'jmpl'", "'$'", "'nop'", "'ret'", "'iret'", "'['", "']'", "'#'", "'low'", "'high'", "'('", "')'", "'r0'", "'r1'", "'r2'", "'r3'", "'r4'", "'r5'", "'r6'", "'r7'", "'PSW'"
    };
    public static final int RULE_HEX=7;
    public static final int T__50=50;
    public static final int RULE_OCT=8;
    public static final int RULE_SIGN=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_BIN=9;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_CHAR=10;
    public static final int T__95=95;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
        	return "PDS16ASM";
       	}

       	@Override
       	protected Pds16asmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePDS16ASM"
    // InternalPds16asm.g:64:1: entryRulePDS16ASM returns [EObject current=null] : iv_rulePDS16ASM= rulePDS16ASM EOF ;
    public final EObject entryRulePDS16ASM() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDS16ASM = null;


        try {
            // InternalPds16asm.g:64:49: (iv_rulePDS16ASM= rulePDS16ASM EOF )
            // InternalPds16asm.g:65:2: iv_rulePDS16ASM= rulePDS16ASM EOF
            {
             newCompositeNode(grammarAccess.getPDS16ASMRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePDS16ASM=rulePDS16ASM();

            state._fsp--;

             current =iv_rulePDS16ASM; 
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
    // $ANTLR end "entryRulePDS16ASM"


    // $ANTLR start "rulePDS16ASM"
    // InternalPds16asm.g:71:1: rulePDS16ASM returns [EObject current=null] : ( (lv_instuctions_0_0= ruleStatement ) )* ;
    public final EObject rulePDS16ASM() throws RecognitionException {
        EObject current = null;

        EObject lv_instuctions_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:77:2: ( ( (lv_instuctions_0_0= ruleStatement ) )* )
            // InternalPds16asm.g:78:2: ( (lv_instuctions_0_0= ruleStatement ) )*
            {
            // InternalPds16asm.g:78:2: ( (lv_instuctions_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=17 && LA1_0<=21)||(LA1_0>=23 && LA1_0<=75)||(LA1_0>=77 && LA1_0<=79)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPds16asm.g:79:3: (lv_instuctions_0_0= ruleStatement )
            	    {
            	    // InternalPds16asm.g:79:3: (lv_instuctions_0_0= ruleStatement )
            	    // InternalPds16asm.g:80:4: lv_instuctions_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getPDS16ASMAccess().getInstuctionsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instuctions_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPDS16ASMRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instuctions",
            	    					lv_instuctions_0_0,
            	    					"org.pds16.pds16asm.Pds16asm.Statement");
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
    // $ANTLR end "rulePDS16ASM"


    // $ANTLR start "entryRuleStatement"
    // InternalPds16asm.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPds16asm.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPds16asm.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalPds16asm.g:107:1: ruleStatement returns [EObject current=null] : (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Instructions_0 = null;

        EObject this_Label_1 = null;

        EObject this_Directive_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:113:2: ( (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective ) )
            // InternalPds16asm.g:114:2: (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective )
            {
            // InternalPds16asm.g:114:2: (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 77:
            case 78:
            case 79:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPds16asm.g:115:3: this_Instructions_0= ruleInstructions
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInstructionsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instructions_0=ruleInstructions();

                    state._fsp--;


                    			current = this_Instructions_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:124:3: this_Label_1= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_1=ruleLabel();

                    state._fsp--;


                    			current = this_Label_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:133:3: this_Directive_2= ruleDirective
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDirectiveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Directive_2=ruleDirective();

                    state._fsp--;


                    			current = this_Directive_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLabel"
    // InternalPds16asm.g:145:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalPds16asm.g:145:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalPds16asm.g:146:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalPds16asm.g:152:1: ruleLabel returns [EObject current=null] : ( ( (lv_labelName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_labelName_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_1 = null;

        EObject lv_value_2_2 = null;

        EObject lv_value_2_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:158:2: ( ( ( (lv_labelName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) ) ) ) )
            // InternalPds16asm.g:159:2: ( ( (lv_labelName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) ) ) )
            {
            // InternalPds16asm.g:159:2: ( ( (lv_labelName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) ) ) )
            // InternalPds16asm.g:160:3: ( (lv_labelName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) ) )
            {
            // InternalPds16asm.g:160:3: ( (lv_labelName_0_0= RULE_ID ) )
            // InternalPds16asm.g:161:4: (lv_labelName_0_0= RULE_ID )
            {
            // InternalPds16asm.g:161:4: (lv_labelName_0_0= RULE_ID )
            // InternalPds16asm.g:162:5: lv_labelName_0_0= RULE_ID
            {
            lv_labelName_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_labelName_0_0, grammarAccess.getLabelAccess().getLabelNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"labelName",
            						lv_labelName_0_0,
            						"org.pds16.pds16asm.Pds16asm.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalPds16asm.g:182:3: ( ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) ) )
            // InternalPds16asm.g:183:4: ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) )
            {
            // InternalPds16asm.g:183:4: ( (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions ) )
            // InternalPds16asm.g:184:5: (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions )
            {
            // InternalPds16asm.g:184:5: (lv_value_2_1= ruleLabel | lv_value_2_2= ruleLabelDirective | lv_value_2_3= ruleInstructions )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt3=2;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 77:
            case 78:
            case 79:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPds16asm.g:185:6: lv_value_2_1= ruleLabel
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getValueLabelParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_1=ruleLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"org.pds16.pds16asm.Pds16asm.Label");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:201:6: lv_value_2_2= ruleLabelDirective
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getValueLabelDirectiveParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_2=ruleLabelDirective();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"org.pds16.pds16asm.Pds16asm.LabelDirective");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:217:6: lv_value_2_3= ruleInstructions
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getValueInstructionsParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_3=ruleInstructions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_3,
                    							"org.pds16.pds16asm.Pds16asm.Instructions");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleDirective"
    // InternalPds16asm.g:239:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalPds16asm.g:239:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalPds16asm.g:240:2: iv_ruleDirective= ruleDirective EOF
            {
             newCompositeNode(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirective=ruleDirective();

            state._fsp--;

             current =iv_ruleDirective; 
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
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalPds16asm.g:246:1: ruleDirective returns [EObject current=null] : (otherlv_0= '.bss' | otherlv_1= '.data' | otherlv_2= '.end' | otherlv_3= '.text' | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Equ_4 = null;

        EObject this_Org_5 = null;

        EObject this_Section_6 = null;

        EObject this_Set_7 = null;

        EObject this_LabelDirective_8 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:252:2: ( (otherlv_0= '.bss' | otherlv_1= '.data' | otherlv_2= '.end' | otherlv_3= '.text' | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective ) )
            // InternalPds16asm.g:253:2: (otherlv_0= '.bss' | otherlv_1= '.data' | otherlv_2= '.end' | otherlv_3= '.text' | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective )
            {
            // InternalPds16asm.g:253:2: (otherlv_0= '.bss' | otherlv_1= '.data' | otherlv_2= '.end' | otherlv_3= '.text' | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 30:
                {
                alt4=5;
                }
                break;
            case 29:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            case 27:
                {
                alt4=8;
                }
                break;
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPds16asm.g:254:3: otherlv_0= '.bss'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getDirectiveAccess().getBssKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:259:3: otherlv_1= '.data'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getDirectiveAccess().getDataKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:264:3: otherlv_2= '.end'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getDirectiveAccess().getEndKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:269:3: otherlv_3= '.text'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getDirectiveAccess().getTextKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:274:3: this_Equ_4= ruleEqu
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getEquParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equ_4=ruleEqu();

                    state._fsp--;


                    			current = this_Equ_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:283:3: this_Org_5= ruleOrg
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getOrgParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Org_5=ruleOrg();

                    state._fsp--;


                    			current = this_Org_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:292:3: this_Section_6= ruleSection
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getSectionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Section_6=ruleSection();

                    state._fsp--;


                    			current = this_Section_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:301:3: this_Set_7= ruleSet
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getSetParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Set_7=ruleSet();

                    state._fsp--;


                    			current = this_Set_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPds16asm.g:310:3: this_LabelDirective_8= ruleLabelDirective
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getLabelDirectiveParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_LabelDirective_8=ruleLabelDirective();

                    state._fsp--;


                    			current = this_LabelDirective_8;
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
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleLabelDirective"
    // InternalPds16asm.g:322:1: entryRuleLabelDirective returns [EObject current=null] : iv_ruleLabelDirective= ruleLabelDirective EOF ;
    public final EObject entryRuleLabelDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDirective = null;


        try {
            // InternalPds16asm.g:322:55: (iv_ruleLabelDirective= ruleLabelDirective EOF )
            // InternalPds16asm.g:323:2: iv_ruleLabelDirective= ruleLabelDirective EOF
            {
             newCompositeNode(grammarAccess.getLabelDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelDirective=ruleLabelDirective();

            state._fsp--;

             current =iv_ruleLabelDirective; 
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
    // $ANTLR end "entryRuleLabelDirective"


    // $ANTLR start "ruleLabelDirective"
    // InternalPds16asm.g:329:1: ruleLabelDirective returns [EObject current=null] : (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace ) ;
    public final EObject ruleLabelDirective() throws RecognitionException {
        EObject current = null;

        EObject this_Ascii_0 = null;

        EObject this_Asciiz_1 = null;

        EObject this_Byte_2 = null;

        EObject this_Word_3 = null;

        EObject this_Space_4 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:335:2: ( (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace ) )
            // InternalPds16asm.g:336:2: (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace )
            {
            // InternalPds16asm.g:336:2: (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPds16asm.g:337:3: this_Ascii_0= ruleAscii
                    {

                    			newCompositeNode(grammarAccess.getLabelDirectiveAccess().getAsciiParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ascii_0=ruleAscii();

                    state._fsp--;


                    			current = this_Ascii_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:346:3: this_Asciiz_1= ruleAsciiz
                    {

                    			newCompositeNode(grammarAccess.getLabelDirectiveAccess().getAsciizParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Asciiz_1=ruleAsciiz();

                    state._fsp--;


                    			current = this_Asciiz_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:355:3: this_Byte_2= ruleByte
                    {

                    			newCompositeNode(grammarAccess.getLabelDirectiveAccess().getByteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Byte_2=ruleByte();

                    state._fsp--;


                    			current = this_Byte_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:364:3: this_Word_3= ruleWord
                    {

                    			newCompositeNode(grammarAccess.getLabelDirectiveAccess().getWordParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Word_3=ruleWord();

                    state._fsp--;


                    			current = this_Word_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:373:3: this_Space_4= ruleSpace
                    {

                    			newCompositeNode(grammarAccess.getLabelDirectiveAccess().getSpaceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Space_4=ruleSpace();

                    state._fsp--;


                    			current = this_Space_4;
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
    // $ANTLR end "ruleLabelDirective"


    // $ANTLR start "entryRuleAscii"
    // InternalPds16asm.g:385:1: entryRuleAscii returns [EObject current=null] : iv_ruleAscii= ruleAscii EOF ;
    public final EObject entryRuleAscii() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAscii = null;


        try {
            // InternalPds16asm.g:385:46: (iv_ruleAscii= ruleAscii EOF )
            // InternalPds16asm.g:386:2: iv_ruleAscii= ruleAscii EOF
            {
             newCompositeNode(grammarAccess.getAsciiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAscii=ruleAscii();

            state._fsp--;

             current =iv_ruleAscii; 
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
    // $ANTLR end "entryRuleAscii"


    // $ANTLR start "ruleAscii"
    // InternalPds16asm.g:392:1: ruleAscii returns [EObject current=null] : (otherlv_0= '.ascii' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* ) ;
    public final EObject ruleAscii() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalPds16asm.g:398:2: ( (otherlv_0= '.ascii' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* ) )
            // InternalPds16asm.g:399:2: (otherlv_0= '.ascii' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* )
            {
            // InternalPds16asm.g:399:2: (otherlv_0= '.ascii' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* )
            // InternalPds16asm.g:400:3: otherlv_0= '.ascii' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAsciiAccess().getAsciiKeyword_0());
            		
            // InternalPds16asm.g:404:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalPds16asm.g:405:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalPds16asm.g:405:4: (lv_value_1_0= RULE_STRING )
            // InternalPds16asm.g:406:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_value_1_0, grammarAccess.getAsciiAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsciiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.pds16.pds16asm.Pds16asm.STRING");
            				

            }


            }

            // InternalPds16asm.g:422:3: (otherlv_2= ',' this_STRING_3= RULE_STRING )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPds16asm.g:423:4: otherlv_2= ',' this_STRING_3= RULE_STRING
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAsciiAccess().getCommaKeyword_2_0());
            	    			
            	    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    				newLeafNode(this_STRING_3, grammarAccess.getAsciiAccess().getSTRINGTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleAscii"


    // $ANTLR start "entryRuleAsciiz"
    // InternalPds16asm.g:436:1: entryRuleAsciiz returns [EObject current=null] : iv_ruleAsciiz= ruleAsciiz EOF ;
    public final EObject entryRuleAsciiz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsciiz = null;


        try {
            // InternalPds16asm.g:436:47: (iv_ruleAsciiz= ruleAsciiz EOF )
            // InternalPds16asm.g:437:2: iv_ruleAsciiz= ruleAsciiz EOF
            {
             newCompositeNode(grammarAccess.getAsciizRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsciiz=ruleAsciiz();

            state._fsp--;

             current =iv_ruleAsciiz; 
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
    // $ANTLR end "entryRuleAsciiz"


    // $ANTLR start "ruleAsciiz"
    // InternalPds16asm.g:443:1: ruleAsciiz returns [EObject current=null] : (otherlv_0= '.asciiz' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* ) ;
    public final EObject ruleAsciiz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalPds16asm.g:449:2: ( (otherlv_0= '.asciiz' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* ) )
            // InternalPds16asm.g:450:2: (otherlv_0= '.asciiz' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* )
            {
            // InternalPds16asm.g:450:2: (otherlv_0= '.asciiz' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )* )
            // InternalPds16asm.g:451:3: otherlv_0= '.asciiz' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' this_STRING_3= RULE_STRING )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAsciizAccess().getAsciizKeyword_0());
            		
            // InternalPds16asm.g:455:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalPds16asm.g:456:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalPds16asm.g:456:4: (lv_value_1_0= RULE_STRING )
            // InternalPds16asm.g:457:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_value_1_0, grammarAccess.getAsciizAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsciizRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.pds16.pds16asm.Pds16asm.STRING");
            				

            }


            }

            // InternalPds16asm.g:473:3: (otherlv_2= ',' this_STRING_3= RULE_STRING )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPds16asm.g:474:4: otherlv_2= ',' this_STRING_3= RULE_STRING
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAsciizAccess().getCommaKeyword_2_0());
            	    			
            	    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    				newLeafNode(this_STRING_3, grammarAccess.getAsciizAccess().getSTRINGTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleAsciiz"


    // $ANTLR start "entryRuleByte"
    // InternalPds16asm.g:487:1: entryRuleByte returns [EObject current=null] : iv_ruleByte= ruleByte EOF ;
    public final EObject entryRuleByte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByte = null;


        try {
            // InternalPds16asm.g:487:45: (iv_ruleByte= ruleByte EOF )
            // InternalPds16asm.g:488:2: iv_ruleByte= ruleByte EOF
            {
             newCompositeNode(grammarAccess.getByteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleByte=ruleByte();

            state._fsp--;

             current =iv_ruleByte; 
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
    // $ANTLR end "entryRuleByte"


    // $ANTLR start "ruleByte"
    // InternalPds16asm.g:494:1: ruleByte returns [EObject current=null] : (otherlv_0= '.byte' ( ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) ) )* ) ;
    public final EObject ruleByte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_1=null;
        Token lv_number_1_2=null;
        Token lv_number_1_3=null;
        Token lv_number_1_4=null;
        Token lv_number_1_5=null;
        Token otherlv_2=null;
        Token lv_number_3_1=null;
        Token lv_number_3_2=null;
        Token lv_number_3_3=null;
        Token lv_number_3_4=null;
        Token lv_number_3_5=null;


        	enterRule();

        try {
            // InternalPds16asm.g:500:2: ( (otherlv_0= '.byte' ( ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) ) )* ) )
            // InternalPds16asm.g:501:2: (otherlv_0= '.byte' ( ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) ) )* )
            {
            // InternalPds16asm.g:501:2: (otherlv_0= '.byte' ( ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) ) )* )
            // InternalPds16asm.g:502:3: otherlv_0= '.byte' ( ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getByteAccess().getByteKeyword_0());
            		
            // InternalPds16asm.g:506:3: ( ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) ) )
            // InternalPds16asm.g:507:4: ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) )
            {
            // InternalPds16asm.g:507:4: ( (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR ) )
            // InternalPds16asm.g:508:5: (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR )
            {
            // InternalPds16asm.g:508:5: (lv_number_1_1= RULE_INT | lv_number_1_2= RULE_HEX | lv_number_1_3= RULE_OCT | lv_number_1_4= RULE_BIN | lv_number_1_5= RULE_CHAR )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_HEX:
                {
                alt8=2;
                }
                break;
            case RULE_OCT:
                {
                alt8=3;
                }
                break;
            case RULE_BIN:
                {
                alt8=4;
                }
                break;
            case RULE_CHAR:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPds16asm.g:509:6: lv_number_1_1= RULE_INT
                    {
                    lv_number_1_1=(Token)match(input,RULE_INT,FOLLOW_7); 

                    						newLeafNode(lv_number_1_1, grammarAccess.getByteAccess().getNumberINTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getByteRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_1_1,
                    							"org.pds16.pds16asm.Pds16asm.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:524:6: lv_number_1_2= RULE_HEX
                    {
                    lv_number_1_2=(Token)match(input,RULE_HEX,FOLLOW_7); 

                    						newLeafNode(lv_number_1_2, grammarAccess.getByteAccess().getNumberHEXTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getByteRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_1_2,
                    							"org.pds16.pds16asm.Pds16asm.HEX");
                    					

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:539:6: lv_number_1_3= RULE_OCT
                    {
                    lv_number_1_3=(Token)match(input,RULE_OCT,FOLLOW_7); 

                    						newLeafNode(lv_number_1_3, grammarAccess.getByteAccess().getNumberOCTTerminalRuleCall_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getByteRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_1_3,
                    							"org.pds16.pds16asm.Pds16asm.OCT");
                    					

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:554:6: lv_number_1_4= RULE_BIN
                    {
                    lv_number_1_4=(Token)match(input,RULE_BIN,FOLLOW_7); 

                    						newLeafNode(lv_number_1_4, grammarAccess.getByteAccess().getNumberBINTerminalRuleCall_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getByteRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_1_4,
                    							"org.pds16.pds16asm.Pds16asm.BIN");
                    					

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:569:6: lv_number_1_5= RULE_CHAR
                    {
                    lv_number_1_5=(Token)match(input,RULE_CHAR,FOLLOW_7); 

                    						newLeafNode(lv_number_1_5, grammarAccess.getByteAccess().getNumberCHARTerminalRuleCall_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getByteRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_1_5,
                    							"org.pds16.pds16asm.Pds16asm.CHAR");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPds16asm.g:586:3: (otherlv_2= ',' ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPds16asm.g:587:4: otherlv_2= ',' ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getByteAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPds16asm.g:591:4: ( ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) ) )
            	    // InternalPds16asm.g:592:5: ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) )
            	    {
            	    // InternalPds16asm.g:592:5: ( (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR ) )
            	    // InternalPds16asm.g:593:6: (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR )
            	    {
            	    // InternalPds16asm.g:593:6: (lv_number_3_1= RULE_INT | lv_number_3_2= RULE_HEX | lv_number_3_3= RULE_OCT | lv_number_3_4= RULE_BIN | lv_number_3_5= RULE_CHAR )
            	    int alt9=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_INT:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case RULE_HEX:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case RULE_OCT:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case RULE_BIN:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    case RULE_CHAR:
            	        {
            	        alt9=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // InternalPds16asm.g:594:7: lv_number_3_1= RULE_INT
            	            {
            	            lv_number_3_1=(Token)match(input,RULE_INT,FOLLOW_7); 

            	            							newLeafNode(lv_number_3_1, grammarAccess.getByteAccess().getNumberINTTerminalRuleCall_2_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getByteRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"number",
            	            								lv_number_3_1,
            	            								"org.pds16.pds16asm.Pds16asm.INT");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalPds16asm.g:609:7: lv_number_3_2= RULE_HEX
            	            {
            	            lv_number_3_2=(Token)match(input,RULE_HEX,FOLLOW_7); 

            	            							newLeafNode(lv_number_3_2, grammarAccess.getByteAccess().getNumberHEXTerminalRuleCall_2_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getByteRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"number",
            	            								lv_number_3_2,
            	            								"org.pds16.pds16asm.Pds16asm.HEX");
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalPds16asm.g:624:7: lv_number_3_3= RULE_OCT
            	            {
            	            lv_number_3_3=(Token)match(input,RULE_OCT,FOLLOW_7); 

            	            							newLeafNode(lv_number_3_3, grammarAccess.getByteAccess().getNumberOCTTerminalRuleCall_2_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getByteRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"number",
            	            								lv_number_3_3,
            	            								"org.pds16.pds16asm.Pds16asm.OCT");
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalPds16asm.g:639:7: lv_number_3_4= RULE_BIN
            	            {
            	            lv_number_3_4=(Token)match(input,RULE_BIN,FOLLOW_7); 

            	            							newLeafNode(lv_number_3_4, grammarAccess.getByteAccess().getNumberBINTerminalRuleCall_2_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getByteRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"number",
            	            								lv_number_3_4,
            	            								"org.pds16.pds16asm.Pds16asm.BIN");
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalPds16asm.g:654:7: lv_number_3_5= RULE_CHAR
            	            {
            	            lv_number_3_5=(Token)match(input,RULE_CHAR,FOLLOW_7); 

            	            							newLeafNode(lv_number_3_5, grammarAccess.getByteAccess().getNumberCHARTerminalRuleCall_2_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getByteRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"number",
            	            								lv_number_3_5,
            	            								"org.pds16.pds16asm.Pds16asm.CHAR");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleByte"


    // $ANTLR start "entryRuleWord"
    // InternalPds16asm.g:676:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalPds16asm.g:676:45: (iv_ruleWord= ruleWord EOF )
            // InternalPds16asm.g:677:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
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
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // InternalPds16asm.g:683:1: ruleWord returns [EObject current=null] : (otherlv_0= '.word' ( ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) ) ) (otherlv_3= ',' ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) ) )* ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_number_2_1=null;
        Token lv_number_2_2=null;
        Token lv_number_2_3=null;
        Token lv_number_2_4=null;
        Token lv_number_2_5=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token lv_number_5_1=null;
        Token lv_number_5_2=null;
        Token lv_number_5_3=null;
        Token lv_number_5_4=null;
        Token lv_number_5_5=null;


        	enterRule();

        try {
            // InternalPds16asm.g:689:2: ( (otherlv_0= '.word' ( ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) ) ) (otherlv_3= ',' ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) ) )* ) )
            // InternalPds16asm.g:690:2: (otherlv_0= '.word' ( ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) ) ) (otherlv_3= ',' ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) ) )* )
            {
            // InternalPds16asm.g:690:2: (otherlv_0= '.word' ( ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) ) ) (otherlv_3= ',' ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) ) )* )
            // InternalPds16asm.g:691:3: otherlv_0= '.word' ( ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) ) ) (otherlv_3= ',' ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWordAccess().getWordKeyword_0());
            		
            // InternalPds16asm.g:695:3: ( ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_CHAR)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPds16asm.g:696:4: ( (lv_value_1_0= RULE_ID ) )
                    {
                    // InternalPds16asm.g:696:4: ( (lv_value_1_0= RULE_ID ) )
                    // InternalPds16asm.g:697:5: (lv_value_1_0= RULE_ID )
                    {
                    // InternalPds16asm.g:697:5: (lv_value_1_0= RULE_ID )
                    // InternalPds16asm.g:698:6: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getWordAccess().getValueIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.pds16.pds16asm.Pds16asm.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:715:4: ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) )
                    {
                    // InternalPds16asm.g:715:4: ( ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) ) )
                    // InternalPds16asm.g:716:5: ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) )
                    {
                    // InternalPds16asm.g:716:5: ( (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR ) )
                    // InternalPds16asm.g:717:6: (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR )
                    {
                    // InternalPds16asm.g:717:6: (lv_number_2_1= RULE_INT | lv_number_2_2= RULE_HEX | lv_number_2_3= RULE_OCT | lv_number_2_4= RULE_BIN | lv_number_2_5= RULE_CHAR )
                    int alt11=5;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_HEX:
                        {
                        alt11=2;
                        }
                        break;
                    case RULE_OCT:
                        {
                        alt11=3;
                        }
                        break;
                    case RULE_BIN:
                        {
                        alt11=4;
                        }
                        break;
                    case RULE_CHAR:
                        {
                        alt11=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // InternalPds16asm.g:718:7: lv_number_2_1= RULE_INT
                            {
                            lv_number_2_1=(Token)match(input,RULE_INT,FOLLOW_7); 

                            							newLeafNode(lv_number_2_1, grammarAccess.getWordAccess().getNumberINTTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getWordRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"number",
                            								lv_number_2_1,
                            								"org.pds16.pds16asm.Pds16asm.INT");
                            						

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:733:7: lv_number_2_2= RULE_HEX
                            {
                            lv_number_2_2=(Token)match(input,RULE_HEX,FOLLOW_7); 

                            							newLeafNode(lv_number_2_2, grammarAccess.getWordAccess().getNumberHEXTerminalRuleCall_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getWordRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"number",
                            								lv_number_2_2,
                            								"org.pds16.pds16asm.Pds16asm.HEX");
                            						

                            }
                            break;
                        case 3 :
                            // InternalPds16asm.g:748:7: lv_number_2_3= RULE_OCT
                            {
                            lv_number_2_3=(Token)match(input,RULE_OCT,FOLLOW_7); 

                            							newLeafNode(lv_number_2_3, grammarAccess.getWordAccess().getNumberOCTTerminalRuleCall_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getWordRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"number",
                            								lv_number_2_3,
                            								"org.pds16.pds16asm.Pds16asm.OCT");
                            						

                            }
                            break;
                        case 4 :
                            // InternalPds16asm.g:763:7: lv_number_2_4= RULE_BIN
                            {
                            lv_number_2_4=(Token)match(input,RULE_BIN,FOLLOW_7); 

                            							newLeafNode(lv_number_2_4, grammarAccess.getWordAccess().getNumberBINTerminalRuleCall_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getWordRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"number",
                            								lv_number_2_4,
                            								"org.pds16.pds16asm.Pds16asm.BIN");
                            						

                            }
                            break;
                        case 5 :
                            // InternalPds16asm.g:778:7: lv_number_2_5= RULE_CHAR
                            {
                            lv_number_2_5=(Token)match(input,RULE_CHAR,FOLLOW_7); 

                            							newLeafNode(lv_number_2_5, grammarAccess.getWordAccess().getNumberCHARTerminalRuleCall_1_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getWordRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"number",
                            								lv_number_2_5,
                            								"org.pds16.pds16asm.Pds16asm.CHAR");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPds16asm.g:796:3: (otherlv_3= ',' ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPds16asm.g:797:4: otherlv_3= ',' ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWordAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPds16asm.g:801:4: ( ( (lv_value_4_0= RULE_ID ) ) | ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_ID) ) {
            	        alt14=1;
            	    }
            	    else if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_CHAR)) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalPds16asm.g:802:5: ( (lv_value_4_0= RULE_ID ) )
            	            {
            	            // InternalPds16asm.g:802:5: ( (lv_value_4_0= RULE_ID ) )
            	            // InternalPds16asm.g:803:6: (lv_value_4_0= RULE_ID )
            	            {
            	            // InternalPds16asm.g:803:6: (lv_value_4_0= RULE_ID )
            	            // InternalPds16asm.g:804:7: lv_value_4_0= RULE_ID
            	            {
            	            lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	            							newLeafNode(lv_value_4_0, grammarAccess.getWordAccess().getValueIDTerminalRuleCall_2_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getWordRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"value",
            	            								lv_value_4_0,
            	            								"org.pds16.pds16asm.Pds16asm.ID");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPds16asm.g:821:5: ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) )
            	            {
            	            // InternalPds16asm.g:821:5: ( ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) ) )
            	            // InternalPds16asm.g:822:6: ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) )
            	            {
            	            // InternalPds16asm.g:822:6: ( (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR ) )
            	            // InternalPds16asm.g:823:7: (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR )
            	            {
            	            // InternalPds16asm.g:823:7: (lv_number_5_1= RULE_INT | lv_number_5_2= RULE_HEX | lv_number_5_3= RULE_OCT | lv_number_5_4= RULE_BIN | lv_number_5_5= RULE_CHAR )
            	            int alt13=5;
            	            switch ( input.LA(1) ) {
            	            case RULE_INT:
            	                {
            	                alt13=1;
            	                }
            	                break;
            	            case RULE_HEX:
            	                {
            	                alt13=2;
            	                }
            	                break;
            	            case RULE_OCT:
            	                {
            	                alt13=3;
            	                }
            	                break;
            	            case RULE_BIN:
            	                {
            	                alt13=4;
            	                }
            	                break;
            	            case RULE_CHAR:
            	                {
            	                alt13=5;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 13, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt13) {
            	                case 1 :
            	                    // InternalPds16asm.g:824:8: lv_number_5_1= RULE_INT
            	                    {
            	                    lv_number_5_1=(Token)match(input,RULE_INT,FOLLOW_7); 

            	                    								newLeafNode(lv_number_5_1, grammarAccess.getWordAccess().getNumberINTTerminalRuleCall_2_1_1_0_0());
            	                    							

            	                    								if (current==null) {
            	                    									current = createModelElement(grammarAccess.getWordRule());
            	                    								}
            	                    								addWithLastConsumed(
            	                    									current,
            	                    									"number",
            	                    									lv_number_5_1,
            	                    									"org.pds16.pds16asm.Pds16asm.INT");
            	                    							

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPds16asm.g:839:8: lv_number_5_2= RULE_HEX
            	                    {
            	                    lv_number_5_2=(Token)match(input,RULE_HEX,FOLLOW_7); 

            	                    								newLeafNode(lv_number_5_2, grammarAccess.getWordAccess().getNumberHEXTerminalRuleCall_2_1_1_0_1());
            	                    							

            	                    								if (current==null) {
            	                    									current = createModelElement(grammarAccess.getWordRule());
            	                    								}
            	                    								addWithLastConsumed(
            	                    									current,
            	                    									"number",
            	                    									lv_number_5_2,
            	                    									"org.pds16.pds16asm.Pds16asm.HEX");
            	                    							

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalPds16asm.g:854:8: lv_number_5_3= RULE_OCT
            	                    {
            	                    lv_number_5_3=(Token)match(input,RULE_OCT,FOLLOW_7); 

            	                    								newLeafNode(lv_number_5_3, grammarAccess.getWordAccess().getNumberOCTTerminalRuleCall_2_1_1_0_2());
            	                    							

            	                    								if (current==null) {
            	                    									current = createModelElement(grammarAccess.getWordRule());
            	                    								}
            	                    								addWithLastConsumed(
            	                    									current,
            	                    									"number",
            	                    									lv_number_5_3,
            	                    									"org.pds16.pds16asm.Pds16asm.OCT");
            	                    							

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalPds16asm.g:869:8: lv_number_5_4= RULE_BIN
            	                    {
            	                    lv_number_5_4=(Token)match(input,RULE_BIN,FOLLOW_7); 

            	                    								newLeafNode(lv_number_5_4, grammarAccess.getWordAccess().getNumberBINTerminalRuleCall_2_1_1_0_3());
            	                    							

            	                    								if (current==null) {
            	                    									current = createModelElement(grammarAccess.getWordRule());
            	                    								}
            	                    								addWithLastConsumed(
            	                    									current,
            	                    									"number",
            	                    									lv_number_5_4,
            	                    									"org.pds16.pds16asm.Pds16asm.BIN");
            	                    							

            	                    }
            	                    break;
            	                case 5 :
            	                    // InternalPds16asm.g:884:8: lv_number_5_5= RULE_CHAR
            	                    {
            	                    lv_number_5_5=(Token)match(input,RULE_CHAR,FOLLOW_7); 

            	                    								newLeafNode(lv_number_5_5, grammarAccess.getWordAccess().getNumberCHARTerminalRuleCall_2_1_1_0_4());
            	                    							

            	                    								if (current==null) {
            	                    									current = createModelElement(grammarAccess.getWordRule());
            	                    								}
            	                    								addWithLastConsumed(
            	                    									current,
            	                    									"number",
            	                    									lv_number_5_5,
            	                    									"org.pds16.pds16asm.Pds16asm.CHAR");
            	                    							

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleSpace"
    // InternalPds16asm.g:907:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalPds16asm.g:907:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalPds16asm.g:908:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
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
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalPds16asm.g:914:1: ruleSpace returns [EObject current=null] : (otherlv_0= '.space' ( ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) ) )? ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_1=null;
        Token lv_size_1_2=null;
        Token lv_size_1_3=null;
        Token lv_size_1_4=null;
        Token lv_size_1_5=null;
        Token otherlv_2=null;
        Token lv_byteValeu_3_1=null;
        Token lv_byteValeu_3_2=null;
        Token lv_byteValeu_3_3=null;
        Token lv_byteValeu_3_4=null;
        Token lv_byteValeu_3_5=null;


        	enterRule();

        try {
            // InternalPds16asm.g:920:2: ( (otherlv_0= '.space' ( ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) ) )? ) )
            // InternalPds16asm.g:921:2: (otherlv_0= '.space' ( ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) ) )? )
            {
            // InternalPds16asm.g:921:2: (otherlv_0= '.space' ( ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) ) )? )
            // InternalPds16asm.g:922:3: otherlv_0= '.space' ( ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) ) ) (otherlv_2= ',' ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSpaceAccess().getSpaceKeyword_0());
            		
            // InternalPds16asm.g:926:3: ( ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) ) )
            // InternalPds16asm.g:927:4: ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) )
            {
            // InternalPds16asm.g:927:4: ( (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR ) )
            // InternalPds16asm.g:928:5: (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR )
            {
            // InternalPds16asm.g:928:5: (lv_size_1_1= RULE_INT | lv_size_1_2= RULE_HEX | lv_size_1_3= RULE_OCT | lv_size_1_4= RULE_BIN | lv_size_1_5= RULE_CHAR )
            int alt16=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_HEX:
                {
                alt16=2;
                }
                break;
            case RULE_OCT:
                {
                alt16=3;
                }
                break;
            case RULE_BIN:
                {
                alt16=4;
                }
                break;
            case RULE_CHAR:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPds16asm.g:929:6: lv_size_1_1= RULE_INT
                    {
                    lv_size_1_1=(Token)match(input,RULE_INT,FOLLOW_7); 

                    						newLeafNode(lv_size_1_1, grammarAccess.getSpaceAccess().getSizeINTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_1_1,
                    							"org.pds16.pds16asm.Pds16asm.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:944:6: lv_size_1_2= RULE_HEX
                    {
                    lv_size_1_2=(Token)match(input,RULE_HEX,FOLLOW_7); 

                    						newLeafNode(lv_size_1_2, grammarAccess.getSpaceAccess().getSizeHEXTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_1_2,
                    							"org.pds16.pds16asm.Pds16asm.HEX");
                    					

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:959:6: lv_size_1_3= RULE_OCT
                    {
                    lv_size_1_3=(Token)match(input,RULE_OCT,FOLLOW_7); 

                    						newLeafNode(lv_size_1_3, grammarAccess.getSpaceAccess().getSizeOCTTerminalRuleCall_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_1_3,
                    							"org.pds16.pds16asm.Pds16asm.OCT");
                    					

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:974:6: lv_size_1_4= RULE_BIN
                    {
                    lv_size_1_4=(Token)match(input,RULE_BIN,FOLLOW_7); 

                    						newLeafNode(lv_size_1_4, grammarAccess.getSpaceAccess().getSizeBINTerminalRuleCall_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_1_4,
                    							"org.pds16.pds16asm.Pds16asm.BIN");
                    					

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:989:6: lv_size_1_5= RULE_CHAR
                    {
                    lv_size_1_5=(Token)match(input,RULE_CHAR,FOLLOW_7); 

                    						newLeafNode(lv_size_1_5, grammarAccess.getSpaceAccess().getSizeCHARTerminalRuleCall_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_1_5,
                    							"org.pds16.pds16asm.Pds16asm.CHAR");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPds16asm.g:1006:3: (otherlv_2= ',' ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPds16asm.g:1007:4: otherlv_2= ',' ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getSpaceAccess().getCommaKeyword_2_0());
                    			
                    // InternalPds16asm.g:1011:4: ( ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) ) )
                    // InternalPds16asm.g:1012:5: ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) )
                    {
                    // InternalPds16asm.g:1012:5: ( (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR ) )
                    // InternalPds16asm.g:1013:6: (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR )
                    {
                    // InternalPds16asm.g:1013:6: (lv_byteValeu_3_1= RULE_INT | lv_byteValeu_3_2= RULE_HEX | lv_byteValeu_3_3= RULE_OCT | lv_byteValeu_3_4= RULE_BIN | lv_byteValeu_3_5= RULE_CHAR )
                    int alt17=5;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                        {
                        alt17=1;
                        }
                        break;
                    case RULE_HEX:
                        {
                        alt17=2;
                        }
                        break;
                    case RULE_OCT:
                        {
                        alt17=3;
                        }
                        break;
                    case RULE_BIN:
                        {
                        alt17=4;
                        }
                        break;
                    case RULE_CHAR:
                        {
                        alt17=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // InternalPds16asm.g:1014:7: lv_byteValeu_3_1= RULE_INT
                            {
                            lv_byteValeu_3_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_byteValeu_3_1, grammarAccess.getSpaceAccess().getByteValeuINTTerminalRuleCall_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSpaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"byteValeu",
                            								lv_byteValeu_3_1,
                            								"org.pds16.pds16asm.Pds16asm.INT");
                            						

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:1029:7: lv_byteValeu_3_2= RULE_HEX
                            {
                            lv_byteValeu_3_2=(Token)match(input,RULE_HEX,FOLLOW_2); 

                            							newLeafNode(lv_byteValeu_3_2, grammarAccess.getSpaceAccess().getByteValeuHEXTerminalRuleCall_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSpaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"byteValeu",
                            								lv_byteValeu_3_2,
                            								"org.pds16.pds16asm.Pds16asm.HEX");
                            						

                            }
                            break;
                        case 3 :
                            // InternalPds16asm.g:1044:7: lv_byteValeu_3_3= RULE_OCT
                            {
                            lv_byteValeu_3_3=(Token)match(input,RULE_OCT,FOLLOW_2); 

                            							newLeafNode(lv_byteValeu_3_3, grammarAccess.getSpaceAccess().getByteValeuOCTTerminalRuleCall_2_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSpaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"byteValeu",
                            								lv_byteValeu_3_3,
                            								"org.pds16.pds16asm.Pds16asm.OCT");
                            						

                            }
                            break;
                        case 4 :
                            // InternalPds16asm.g:1059:7: lv_byteValeu_3_4= RULE_BIN
                            {
                            lv_byteValeu_3_4=(Token)match(input,RULE_BIN,FOLLOW_2); 

                            							newLeafNode(lv_byteValeu_3_4, grammarAccess.getSpaceAccess().getByteValeuBINTerminalRuleCall_2_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSpaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"byteValeu",
                            								lv_byteValeu_3_4,
                            								"org.pds16.pds16asm.Pds16asm.BIN");
                            						

                            }
                            break;
                        case 5 :
                            // InternalPds16asm.g:1074:7: lv_byteValeu_3_5= RULE_CHAR
                            {
                            lv_byteValeu_3_5=(Token)match(input,RULE_CHAR,FOLLOW_2); 

                            							newLeafNode(lv_byteValeu_3_5, grammarAccess.getSpaceAccess().getByteValeuCHARTerminalRuleCall_2_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSpaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"byteValeu",
                            								lv_byteValeu_3_5,
                            								"org.pds16.pds16asm.Pds16asm.CHAR");
                            						

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleSet"
    // InternalPds16asm.g:1096:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalPds16asm.g:1096:44: (iv_ruleSet= ruleSet EOF )
            // InternalPds16asm.g:1097:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalPds16asm.g:1103:1: ruleSet returns [EObject current=null] : (otherlv_0= '.set' ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value2_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value1_1_0=null;
        Token otherlv_2=null;
        EObject lv_value2_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1109:2: ( (otherlv_0= '.set' ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value2_3_0= ruleExpression ) ) ) )
            // InternalPds16asm.g:1110:2: (otherlv_0= '.set' ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value2_3_0= ruleExpression ) ) )
            {
            // InternalPds16asm.g:1110:2: (otherlv_0= '.set' ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value2_3_0= ruleExpression ) ) )
            // InternalPds16asm.g:1111:3: otherlv_0= '.set' ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_value2_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSetKeyword_0());
            		
            // InternalPds16asm.g:1115:3: ( (lv_value1_1_0= RULE_ID ) )
            // InternalPds16asm.g:1116:4: (lv_value1_1_0= RULE_ID )
            {
            // InternalPds16asm.g:1116:4: (lv_value1_1_0= RULE_ID )
            // InternalPds16asm.g:1117:5: lv_value1_1_0= RULE_ID
            {
            lv_value1_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_value1_1_0, grammarAccess.getSetAccess().getValue1IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value1",
            						lv_value1_1_0,
            						"org.pds16.pds16asm.Pds16asm.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSetAccess().getCommaKeyword_2());
            		
            // InternalPds16asm.g:1137:3: ( (lv_value2_3_0= ruleExpression ) )
            // InternalPds16asm.g:1138:4: (lv_value2_3_0= ruleExpression )
            {
            // InternalPds16asm.g:1138:4: (lv_value2_3_0= ruleExpression )
            // InternalPds16asm.g:1139:5: lv_value2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSetAccess().getValue2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value2_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRule());
            					}
            					set(
            						current,
            						"value2",
            						lv_value2_3_0,
            						"org.pds16.pds16asm.Pds16asm.Expression");
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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleSection"
    // InternalPds16asm.g:1160:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalPds16asm.g:1160:48: (iv_ruleSection= ruleSection EOF )
            // InternalPds16asm.g:1161:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalPds16asm.g:1167:1: ruleSection returns [EObject current=null] : (otherlv_0= '.section' ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:1173:2: ( (otherlv_0= '.section' ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalPds16asm.g:1174:2: (otherlv_0= '.section' ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalPds16asm.g:1174:2: (otherlv_0= '.section' ( (lv_value_1_0= RULE_ID ) ) )
            // InternalPds16asm.g:1175:3: otherlv_0= '.section' ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalPds16asm.g:1179:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalPds16asm.g:1180:4: (lv_value_1_0= RULE_ID )
            {
            // InternalPds16asm.g:1180:4: (lv_value_1_0= RULE_ID )
            // InternalPds16asm.g:1181:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSectionAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.pds16.pds16asm.Pds16asm.ID");
            				

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleOrg"
    // InternalPds16asm.g:1201:1: entryRuleOrg returns [EObject current=null] : iv_ruleOrg= ruleOrg EOF ;
    public final EObject entryRuleOrg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrg = null;


        try {
            // InternalPds16asm.g:1201:44: (iv_ruleOrg= ruleOrg EOF )
            // InternalPds16asm.g:1202:2: iv_ruleOrg= ruleOrg EOF
            {
             newCompositeNode(grammarAccess.getOrgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrg=ruleOrg();

            state._fsp--;

             current =iv_ruleOrg; 
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
    // $ANTLR end "entryRuleOrg"


    // $ANTLR start "ruleOrg"
    // InternalPds16asm.g:1208:1: ruleOrg returns [EObject current=null] : (otherlv_0= '.org' this_Expression_1= ruleExpression ) ;
    public final EObject ruleOrg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1214:2: ( (otherlv_0= '.org' this_Expression_1= ruleExpression ) )
            // InternalPds16asm.g:1215:2: (otherlv_0= '.org' this_Expression_1= ruleExpression )
            {
            // InternalPds16asm.g:1215:2: (otherlv_0= '.org' this_Expression_1= ruleExpression )
            // InternalPds16asm.g:1216:3: otherlv_0= '.org' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOrgAccess().getOrgKeyword_0());
            		

            			newCompositeNode(grammarAccess.getOrgAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleOrg"


    // $ANTLR start "entryRuleEqu"
    // InternalPds16asm.g:1232:1: entryRuleEqu returns [EObject current=null] : iv_ruleEqu= ruleEqu EOF ;
    public final EObject entryRuleEqu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqu = null;


        try {
            // InternalPds16asm.g:1232:44: (iv_ruleEqu= ruleEqu EOF )
            // InternalPds16asm.g:1233:2: iv_ruleEqu= ruleEqu EOF
            {
             newCompositeNode(grammarAccess.getEquRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqu=ruleEqu();

            state._fsp--;

             current =iv_ruleEqu; 
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
    // $ANTLR end "entryRuleEqu"


    // $ANTLR start "ruleEqu"
    // InternalPds16asm.g:1239:1: ruleEqu returns [EObject current=null] : (otherlv_0= '.equ' this_ID_1= RULE_ID otherlv_2= ',' this_Expression_3= ruleExpression ) ;
    public final EObject ruleEqu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1245:2: ( (otherlv_0= '.equ' this_ID_1= RULE_ID otherlv_2= ',' this_Expression_3= ruleExpression ) )
            // InternalPds16asm.g:1246:2: (otherlv_0= '.equ' this_ID_1= RULE_ID otherlv_2= ',' this_Expression_3= ruleExpression )
            {
            // InternalPds16asm.g:1246:2: (otherlv_0= '.equ' this_ID_1= RULE_ID otherlv_2= ',' this_Expression_3= ruleExpression )
            // InternalPds16asm.g:1247:3: otherlv_0= '.equ' this_ID_1= RULE_ID otherlv_2= ',' this_Expression_3= ruleExpression
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEquAccess().getEquKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(this_ID_1, grammarAccess.getEquAccess().getIDTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEquAccess().getCommaKeyword_2());
            		

            			newCompositeNode(grammarAccess.getEquAccess().getExpressionParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_Expression_3=ruleExpression();

            state._fsp--;


            			current = this_Expression_3;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleEqu"


    // $ANTLR start "entryRuleInstructions"
    // InternalPds16asm.g:1271:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalPds16asm.g:1271:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalPds16asm.g:1272:2: iv_ruleInstructions= ruleInstructions EOF
            {
             newCompositeNode(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructions=ruleInstructions();

            state._fsp--;

             current =iv_ruleInstructions; 
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
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalPds16asm.g:1278:1: ruleInstructions returns [EObject current=null] : (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Store_1 = null;

        EObject this_Aritmetica_2 = null;

        EObject this_Logica_3 = null;

        EObject this_Jump_4 = null;

        EObject this_Nop_5 = null;

        EObject this_Ret_6 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1284:2: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet ) )
            // InternalPds16asm.g:1285:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet )
            {
            // InternalPds16asm.g:1285:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt19=3;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt19=4;
                }
                break;
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt19=5;
                }
                break;
            case 77:
                {
                alt19=6;
                }
                break;
            case 78:
            case 79:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPds16asm.g:1286:3: this_Load_0= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getLoadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_0=ruleLoad();

                    state._fsp--;


                    			current = this_Load_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1295:3: this_Store_1= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getStoreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_1=ruleStore();

                    state._fsp--;


                    			current = this_Store_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:1304:3: this_Aritmetica_2= ruleAritmetica
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getAritmeticaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aritmetica_2=ruleAritmetica();

                    state._fsp--;


                    			current = this_Aritmetica_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:1313:3: this_Logica_3= ruleLogica
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getLogicaParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Logica_3=ruleLogica();

                    state._fsp--;


                    			current = this_Logica_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:1322:3: this_Jump_4= ruleJump
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getJumpParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Jump_4=ruleJump();

                    state._fsp--;


                    			current = this_Jump_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:1331:3: this_Nop_5= ruleNop
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getNopParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nop_5=ruleNop();

                    state._fsp--;


                    			current = this_Nop_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:1340:3: this_Ret_6= ruleRet
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getRetParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ret_6=ruleRet();

                    state._fsp--;


                    			current = this_Ret_6;
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
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleLoad"
    // InternalPds16asm.g:1352:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalPds16asm.g:1352:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalPds16asm.g:1353:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalPds16asm.g:1359:1: ruleLoad returns [EObject current=null] : (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        EObject this_LdImmediate_0 = null;

        EObject this_LdDirect_1 = null;

        EObject this_LdIndexed_2 = null;

        EObject this_LdBasedIndexed_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1365:2: ( (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) )
            // InternalPds16asm.g:1366:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            {
            // InternalPds16asm.g:1366:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalPds16asm.g:1367:3: this_LdImmediate_0= ruleLdImmediate
                    {

                    			newCompositeNode(grammarAccess.getLoadAccess().getLdImmediateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LdImmediate_0=ruleLdImmediate();

                    state._fsp--;


                    			current = this_LdImmediate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1376:3: this_LdDirect_1= ruleLdDirect
                    {

                    			newCompositeNode(grammarAccess.getLoadAccess().getLdDirectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LdDirect_1=ruleLdDirect();

                    state._fsp--;


                    			current = this_LdDirect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:1385:3: this_LdIndexed_2= ruleLdIndexed
                    {

                    			newCompositeNode(grammarAccess.getLoadAccess().getLdIndexedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LdIndexed_2=ruleLdIndexed();

                    state._fsp--;


                    			current = this_LdIndexed_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:1394:3: this_LdBasedIndexed_3= ruleLdBasedIndexed
                    {

                    			newCompositeNode(grammarAccess.getLoadAccess().getLdBasedIndexedParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LdBasedIndexed_3=ruleLdBasedIndexed();

                    state._fsp--;


                    			current = this_LdBasedIndexed_3;
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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleStore"
    // InternalPds16asm.g:1406:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalPds16asm.g:1406:46: (iv_ruleStore= ruleStore EOF )
            // InternalPds16asm.g:1407:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalPds16asm.g:1413:1: ruleStore returns [EObject current=null] : (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        EObject this_StDirect_0 = null;

        EObject this_StIndexed_1 = null;

        EObject this_StBasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1419:2: ( (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) )
            // InternalPds16asm.g:1420:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            {
            // InternalPds16asm.g:1420:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalPds16asm.g:1421:3: this_StDirect_0= ruleStDirect
                    {

                    			newCompositeNode(grammarAccess.getStoreAccess().getStDirectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StDirect_0=ruleStDirect();

                    state._fsp--;


                    			current = this_StDirect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1430:3: this_StIndexed_1= ruleStIndexed
                    {

                    			newCompositeNode(grammarAccess.getStoreAccess().getStIndexedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StIndexed_1=ruleStIndexed();

                    state._fsp--;


                    			current = this_StIndexed_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:1439:3: this_StBasedIndexed_2= ruleStBasedIndexed
                    {

                    			newCompositeNode(grammarAccess.getStoreAccess().getStBasedIndexedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StBasedIndexed_2=ruleStBasedIndexed();

                    state._fsp--;


                    			current = this_StBasedIndexed_2;
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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleAritmetica"
    // InternalPds16asm.g:1451:1: entryRuleAritmetica returns [EObject current=null] : iv_ruleAritmetica= ruleAritmetica EOF ;
    public final EObject entryRuleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAritmetica = null;


        try {
            // InternalPds16asm.g:1451:51: (iv_ruleAritmetica= ruleAritmetica EOF )
            // InternalPds16asm.g:1452:2: iv_ruleAritmetica= ruleAritmetica EOF
            {
             newCompositeNode(grammarAccess.getAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAritmetica=ruleAritmetica();

            state._fsp--;

             current =iv_ruleAritmetica; 
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
    // $ANTLR end "entryRuleAritmetica"


    // $ANTLR start "ruleAritmetica"
    // InternalPds16asm.g:1458:1: ruleAritmetica returns [EObject current=null] : (this_Add_0= ruleAdd | this_Sub_1= ruleSub ) ;
    public final EObject ruleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Sub_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1464:2: ( (this_Add_0= ruleAdd | this_Sub_1= ruleSub ) )
            // InternalPds16asm.g:1465:2: (this_Add_0= ruleAdd | this_Sub_1= ruleSub )
            {
            // InternalPds16asm.g:1465:2: (this_Add_0= ruleAdd | this_Sub_1= ruleSub )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=37 && LA22_0<=42)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=43 && LA22_0<=49)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPds16asm.g:1466:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getAritmeticaAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1475:3: this_Sub_1= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getAritmeticaAccess().getSubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sub_1=ruleSub();

                    state._fsp--;


                    			current = this_Sub_1;
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
    // $ANTLR end "ruleAritmetica"


    // $ANTLR start "entryRuleLogica"
    // InternalPds16asm.g:1487:1: entryRuleLogica returns [EObject current=null] : iv_ruleLogica= ruleLogica EOF ;
    public final EObject entryRuleLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogica = null;


        try {
            // InternalPds16asm.g:1487:47: (iv_ruleLogica= ruleLogica EOF )
            // InternalPds16asm.g:1488:2: iv_ruleLogica= ruleLogica EOF
            {
             newCompositeNode(grammarAccess.getLogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogica=ruleLogica();

            state._fsp--;

             current =iv_ruleLogica; 
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
    // $ANTLR end "entryRuleLogica"


    // $ANTLR start "ruleLogica"
    // InternalPds16asm.g:1494:1: ruleLogica returns [EObject current=null] : (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc ) ;
    public final EObject ruleLogica() throws RecognitionException {
        EObject current = null;

        EObject this_Anl_0 = null;

        EObject this_Orl_1 = null;

        EObject this_Xrl_2 = null;

        EObject this_Not_3 = null;

        EObject this_Shl_4 = null;

        EObject this_Shr_5 = null;

        EObject this_Rr_6 = null;

        EObject this_Rc_7 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1500:2: ( (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc ) )
            // InternalPds16asm.g:1501:2: (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc )
            {
            // InternalPds16asm.g:1501:2: (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
                {
                alt23=1;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt23=2;
                }
                break;
            case 56:
            case 57:
                {
                alt23=3;
                }
                break;
            case 58:
            case 59:
                {
                alt23=4;
                }
                break;
            case 60:
                {
                alt23=5;
                }
                break;
            case 61:
                {
                alt23=6;
                }
                break;
            case 62:
            case 63:
                {
                alt23=7;
                }
                break;
            case 64:
            case 65:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPds16asm.g:1502:3: this_Anl_0= ruleAnl
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getAnlParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Anl_0=ruleAnl();

                    state._fsp--;


                    			current = this_Anl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1511:3: this_Orl_1= ruleOrl
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getOrlParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Orl_1=ruleOrl();

                    state._fsp--;


                    			current = this_Orl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:1520:3: this_Xrl_2= ruleXrl
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getXrlParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Xrl_2=ruleXrl();

                    state._fsp--;


                    			current = this_Xrl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:1529:3: this_Not_3= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getNotParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_3=ruleNot();

                    state._fsp--;


                    			current = this_Not_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:1538:3: this_Shl_4= ruleShl
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getShlParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shl_4=ruleShl();

                    state._fsp--;


                    			current = this_Shl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:1547:3: this_Shr_5= ruleShr
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getShrParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shr_5=ruleShr();

                    state._fsp--;


                    			current = this_Shr_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:1556:3: this_Rr_6= ruleRr
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getRrParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rr_6=ruleRr();

                    state._fsp--;


                    			current = this_Rr_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:1565:3: this_Rc_7= ruleRc
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getRcParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rc_7=ruleRc();

                    state._fsp--;


                    			current = this_Rc_7;
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
    // $ANTLR end "ruleLogica"


    // $ANTLR start "entryRuleJump"
    // InternalPds16asm.g:1577:1: entryRuleJump returns [EObject current=null] : iv_ruleJump= ruleJump EOF ;
    public final EObject entryRuleJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJump = null;


        try {
            // InternalPds16asm.g:1577:45: (iv_ruleJump= ruleJump EOF )
            // InternalPds16asm.g:1578:2: iv_ruleJump= ruleJump EOF
            {
             newCompositeNode(grammarAccess.getJumpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJump=ruleJump();

            state._fsp--;

             current =iv_ruleJump; 
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
    // $ANTLR end "entryRuleJump"


    // $ANTLR start "ruleJump"
    // InternalPds16asm.g:1584:1: ruleJump returns [EObject current=null] : this_JumpOp_0= ruleJumpOp ;
    public final EObject ruleJump() throws RecognitionException {
        EObject current = null;

        EObject this_JumpOp_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1590:2: (this_JumpOp_0= ruleJumpOp )
            // InternalPds16asm.g:1591:2: this_JumpOp_0= ruleJumpOp
            {

            		newCompositeNode(grammarAccess.getJumpAccess().getJumpOpParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_JumpOp_0=ruleJumpOp();

            state._fsp--;


            		current = this_JumpOp_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleJump"


    // $ANTLR start "entryRuleLdImmediate"
    // InternalPds16asm.g:1602:1: entryRuleLdImmediate returns [EObject current=null] : iv_ruleLdImmediate= ruleLdImmediate EOF ;
    public final EObject entryRuleLdImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdImmediate = null;


        try {
            // InternalPds16asm.g:1602:52: (iv_ruleLdImmediate= ruleLdImmediate EOF )
            // InternalPds16asm.g:1603:2: iv_ruleLdImmediate= ruleLdImmediate EOF
            {
             newCompositeNode(grammarAccess.getLdImmediateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLdImmediate=ruleLdImmediate();

            state._fsp--;

             current =iv_ruleLdImmediate; 
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
    // $ANTLR end "entryRuleLdImmediate"


    // $ANTLR start "ruleLdImmediate"
    // InternalPds16asm.g:1609:1: ruleLdImmediate returns [EObject current=null] : ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate ) ;
    public final EObject ruleLdImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Immediate_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1615:2: ( ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate ) )
            // InternalPds16asm.g:1616:2: ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate )
            {
            // InternalPds16asm.g:1616:2: ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate )
            // InternalPds16asm.g:1617:3: (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate
            {
            // InternalPds16asm.g:1617:3: (otherlv_0= 'ldi' | otherlv_1= 'ldih' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPds16asm.g:1618:4: otherlv_0= 'ldi'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdImmediateAccess().getLdiKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1623:4: otherlv_1= 'ldih'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getLdImmediateAccess().getLdihKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getLdImmediateAccess().getImmediateParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Immediate_2=ruleImmediate();

            state._fsp--;


            			current = this_Immediate_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleLdImmediate"


    // $ANTLR start "entryRuleLdDirect"
    // InternalPds16asm.g:1640:1: entryRuleLdDirect returns [EObject current=null] : iv_ruleLdDirect= ruleLdDirect EOF ;
    public final EObject entryRuleLdDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdDirect = null;


        try {
            // InternalPds16asm.g:1640:49: (iv_ruleLdDirect= ruleLdDirect EOF )
            // InternalPds16asm.g:1641:2: iv_ruleLdDirect= ruleLdDirect EOF
            {
             newCompositeNode(grammarAccess.getLdDirectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLdDirect=ruleLdDirect();

            state._fsp--;

             current =iv_ruleLdDirect; 
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
    // $ANTLR end "entryRuleLdDirect"


    // $ANTLR start "ruleLdDirect"
    // InternalPds16asm.g:1647:1: ruleLdDirect returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleLdDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1653:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect ) )
            // InternalPds16asm.g:1654:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asm.g:1654:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect )
            // InternalPds16asm.g:1655:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect
            {
            // InternalPds16asm.g:1655:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            else if ( (LA25_0==34) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPds16asm.g:1656:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdDirectAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1661:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getLdDirectAccess().getLdbKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getLdDirectAccess().getDirectParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Direct_2=ruleDirect();

            state._fsp--;


            			current = this_Direct_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleLdDirect"


    // $ANTLR start "entryRuleLdIndexed"
    // InternalPds16asm.g:1678:1: entryRuleLdIndexed returns [EObject current=null] : iv_ruleLdIndexed= ruleLdIndexed EOF ;
    public final EObject entryRuleLdIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdIndexed = null;


        try {
            // InternalPds16asm.g:1678:50: (iv_ruleLdIndexed= ruleLdIndexed EOF )
            // InternalPds16asm.g:1679:2: iv_ruleLdIndexed= ruleLdIndexed EOF
            {
             newCompositeNode(grammarAccess.getLdIndexedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLdIndexed=ruleLdIndexed();

            state._fsp--;

             current =iv_ruleLdIndexed; 
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
    // $ANTLR end "entryRuleLdIndexed"


    // $ANTLR start "ruleLdIndexed"
    // InternalPds16asm.g:1685:1: ruleLdIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleLdIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1691:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asm.g:1692:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asm.g:1692:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed )
            // InternalPds16asm.g:1693:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asm.g:1693:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            else if ( (LA26_0==34) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPds16asm.g:1694:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1699:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getLdIndexedAccess().getLdbKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getLdIndexedAccess().getIndexedParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Indexed_2=ruleIndexed();

            state._fsp--;


            			current = this_Indexed_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleLdIndexed"


    // $ANTLR start "entryRuleLdBasedIndexed"
    // InternalPds16asm.g:1716:1: entryRuleLdBasedIndexed returns [EObject current=null] : iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF ;
    public final EObject entryRuleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdBasedIndexed = null;


        try {
            // InternalPds16asm.g:1716:55: (iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF )
            // InternalPds16asm.g:1717:2: iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF
            {
             newCompositeNode(grammarAccess.getLdBasedIndexedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLdBasedIndexed=ruleLdBasedIndexed();

            state._fsp--;

             current =iv_ruleLdBasedIndexed; 
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
    // $ANTLR end "entryRuleLdBasedIndexed"


    // $ANTLR start "ruleLdBasedIndexed"
    // InternalPds16asm.g:1723:1: ruleLdBasedIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1729:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asm.g:1730:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asm.g:1730:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asm.g:1731:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asm.g:1731:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            else if ( (LA27_0==34) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPds16asm.g:1732:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdBasedIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1737:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getLdBasedIndexedAccess().getLdbKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getLdBasedIndexedAccess().getBasedIndexedParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_BasedIndexed_2=ruleBasedIndexed();

            state._fsp--;


            			current = this_BasedIndexed_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleLdBasedIndexed"


    // $ANTLR start "entryRuleStDirect"
    // InternalPds16asm.g:1754:1: entryRuleStDirect returns [EObject current=null] : iv_ruleStDirect= ruleStDirect EOF ;
    public final EObject entryRuleStDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStDirect = null;


        try {
            // InternalPds16asm.g:1754:49: (iv_ruleStDirect= ruleStDirect EOF )
            // InternalPds16asm.g:1755:2: iv_ruleStDirect= ruleStDirect EOF
            {
             newCompositeNode(grammarAccess.getStDirectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStDirect=ruleStDirect();

            state._fsp--;

             current =iv_ruleStDirect; 
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
    // $ANTLR end "entryRuleStDirect"


    // $ANTLR start "ruleStDirect"
    // InternalPds16asm.g:1761:1: ruleStDirect returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleStDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1767:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect ) )
            // InternalPds16asm.g:1768:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asm.g:1768:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect )
            // InternalPds16asm.g:1769:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect
            {
            // InternalPds16asm.g:1769:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            else if ( (LA28_0==36) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPds16asm.g:1770:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getStDirectAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1775:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getStDirectAccess().getStbKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getStDirectAccess().getDirectParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Direct_2=ruleDirect();

            state._fsp--;


            			current = this_Direct_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleStDirect"


    // $ANTLR start "entryRuleStIndexed"
    // InternalPds16asm.g:1792:1: entryRuleStIndexed returns [EObject current=null] : iv_ruleStIndexed= ruleStIndexed EOF ;
    public final EObject entryRuleStIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStIndexed = null;


        try {
            // InternalPds16asm.g:1792:50: (iv_ruleStIndexed= ruleStIndexed EOF )
            // InternalPds16asm.g:1793:2: iv_ruleStIndexed= ruleStIndexed EOF
            {
             newCompositeNode(grammarAccess.getStIndexedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStIndexed=ruleStIndexed();

            state._fsp--;

             current =iv_ruleStIndexed; 
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
    // $ANTLR end "entryRuleStIndexed"


    // $ANTLR start "ruleStIndexed"
    // InternalPds16asm.g:1799:1: ruleStIndexed returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleStIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1805:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asm.g:1806:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asm.g:1806:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed )
            // InternalPds16asm.g:1807:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asm.g:1807:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            else if ( (LA29_0==36) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPds16asm.g:1808:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getStIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1813:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getStIndexedAccess().getStbKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getStIndexedAccess().getIndexedParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Indexed_2=ruleIndexed();

            state._fsp--;


            			current = this_Indexed_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleStIndexed"


    // $ANTLR start "entryRuleStBasedIndexed"
    // InternalPds16asm.g:1830:1: entryRuleStBasedIndexed returns [EObject current=null] : iv_ruleStBasedIndexed= ruleStBasedIndexed EOF ;
    public final EObject entryRuleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStBasedIndexed = null;


        try {
            // InternalPds16asm.g:1830:55: (iv_ruleStBasedIndexed= ruleStBasedIndexed EOF )
            // InternalPds16asm.g:1831:2: iv_ruleStBasedIndexed= ruleStBasedIndexed EOF
            {
             newCompositeNode(grammarAccess.getStBasedIndexedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStBasedIndexed=ruleStBasedIndexed();

            state._fsp--;

             current =iv_ruleStBasedIndexed; 
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
    // $ANTLR end "entryRuleStBasedIndexed"


    // $ANTLR start "ruleStBasedIndexed"
    // InternalPds16asm.g:1837:1: ruleStBasedIndexed returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1843:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asm.g:1844:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asm.g:1844:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asm.g:1845:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asm.g:1845:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            else if ( (LA30_0==36) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPds16asm.g:1846:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getStBasedIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1851:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getStBasedIndexedAccess().getStbKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getStBasedIndexedAccess().getBasedIndexedParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_BasedIndexed_2=ruleBasedIndexed();

            state._fsp--;


            			current = this_BasedIndexed_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleStBasedIndexed"


    // $ANTLR start "entryRuleAdd"
    // InternalPds16asm.g:1868:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalPds16asm.g:1868:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalPds16asm.g:1869:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalPds16asm.g:1875:1: ruleAdd returns [EObject current=null] : ( ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= 'inc' | otherlv_7= 'incf' ) this_Registers_8= ruleRegisters ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_OperationsWithConstant_4 = null;

        EObject this_OperationsWithTreeRegisters_5 = null;

        EObject this_Registers_8 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1881:2: ( ( ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= 'inc' | otherlv_7= 'incf' ) this_Registers_8= ruleRegisters ) ) )
            // InternalPds16asm.g:1882:2: ( ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= 'inc' | otherlv_7= 'incf' ) this_Registers_8= ruleRegisters ) )
            {
            // InternalPds16asm.g:1882:2: ( ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= 'inc' | otherlv_7= 'incf' ) this_Registers_8= ruleRegisters ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=37 && LA34_0<=40)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=41 && LA34_0<=42)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPds16asm.g:1883:3: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    {
                    // InternalPds16asm.g:1883:3: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    // InternalPds16asm.g:1884:4: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asm.g:1884:4: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' )
                    int alt31=4;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt31=1;
                        }
                        break;
                    case 38:
                        {
                        alt31=2;
                        }
                        break;
                    case 39:
                        {
                        alt31=3;
                        }
                        break;
                    case 40:
                        {
                        alt31=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // InternalPds16asm.g:1885:5: otherlv_0= 'add'
                            {
                            otherlv_0=(Token)match(input,37,FOLLOW_12); 

                            					newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:1890:5: otherlv_1= 'addf'
                            {
                            otherlv_1=(Token)match(input,38,FOLLOW_12); 

                            					newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddfKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalPds16asm.g:1895:5: otherlv_2= 'adc'
                            {
                            otherlv_2=(Token)match(input,39,FOLLOW_12); 

                            					newLeafNode(otherlv_2, grammarAccess.getAddAccess().getAdcKeyword_0_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalPds16asm.g:1900:5: otherlv_3= 'adcf'
                            {
                            otherlv_3=(Token)match(input,40,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getAddAccess().getAdcfKeyword_0_0_3());
                            				

                            }
                            break;

                    }

                    // InternalPds16asm.g:1905:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    int alt32=2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // InternalPds16asm.g:1906:5: this_OperationsWithConstant_4= ruleOperationsWithConstant
                            {

                            					newCompositeNode(grammarAccess.getAddAccess().getOperationsWithConstantParserRuleCall_0_1_0());
                            				
                            pushFollow(FOLLOW_2);
                            this_OperationsWithConstant_4=ruleOperationsWithConstant();

                            state._fsp--;


                            					current = this_OperationsWithConstant_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:1915:5: this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters
                            {

                            					newCompositeNode(grammarAccess.getAddAccess().getOperationsWithTreeRegistersParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_2);
                            this_OperationsWithTreeRegisters_5=ruleOperationsWithTreeRegisters();

                            state._fsp--;


                            					current = this_OperationsWithTreeRegisters_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1926:3: ( (otherlv_6= 'inc' | otherlv_7= 'incf' ) this_Registers_8= ruleRegisters )
                    {
                    // InternalPds16asm.g:1926:3: ( (otherlv_6= 'inc' | otherlv_7= 'incf' ) this_Registers_8= ruleRegisters )
                    // InternalPds16asm.g:1927:4: (otherlv_6= 'inc' | otherlv_7= 'incf' ) this_Registers_8= ruleRegisters
                    {
                    // InternalPds16asm.g:1927:4: (otherlv_6= 'inc' | otherlv_7= 'incf' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==41) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==42) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalPds16asm.g:1928:5: otherlv_6= 'inc'
                            {
                            otherlv_6=(Token)match(input,41,FOLLOW_12); 

                            					newLeafNode(otherlv_6, grammarAccess.getAddAccess().getIncKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:1933:5: otherlv_7= 'incf'
                            {
                            otherlv_7=(Token)match(input,42,FOLLOW_12); 

                            					newLeafNode(otherlv_7, grammarAccess.getAddAccess().getIncfKeyword_1_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getAddAccess().getRegistersParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Registers_8=ruleRegisters();

                    state._fsp--;


                    				current = this_Registers_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleSub"
    // InternalPds16asm.g:1951:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalPds16asm.g:1951:44: (iv_ruleSub= ruleSub EOF )
            // InternalPds16asm.g:1952:2: iv_ruleSub= ruleSub EOF
            {
             newCompositeNode(grammarAccess.getSubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSub=ruleSub();

            state._fsp--;

             current =iv_ruleSub; 
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
    // $ANTLR end "entryRuleSub"


    // $ANTLR start "ruleSub"
    // InternalPds16asm.g:1958:1: ruleSub returns [EObject current=null] : ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= 'dec' | otherlv_9= 'decf' ) this_Registers_10= ruleRegisters ) ) ;
    public final EObject ruleSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject this_OperationsWithConstant_4 = null;

        EObject this_OperationsWithTreeRegisters_5 = null;

        EObject this_OperationsWithTreeRegisters_7 = null;

        EObject this_Registers_10 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1964:2: ( ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= 'dec' | otherlv_9= 'decf' ) this_Registers_10= ruleRegisters ) ) )
            // InternalPds16asm.g:1965:2: ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= 'dec' | otherlv_9= 'decf' ) this_Registers_10= ruleRegisters ) )
            {
            // InternalPds16asm.g:1965:2: ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= 'dec' | otherlv_9= 'decf' ) this_Registers_10= ruleRegisters ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt38=1;
                }
                break;
            case 47:
                {
                alt38=2;
                }
                break;
            case 48:
            case 49:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPds16asm.g:1966:3: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    {
                    // InternalPds16asm.g:1966:3: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    // InternalPds16asm.g:1967:4: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asm.g:1967:4: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' )
                    int alt35=4;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt35=1;
                        }
                        break;
                    case 44:
                        {
                        alt35=2;
                        }
                        break;
                    case 45:
                        {
                        alt35=3;
                        }
                        break;
                    case 46:
                        {
                        alt35=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // InternalPds16asm.g:1968:5: otherlv_0= 'sub'
                            {
                            otherlv_0=(Token)match(input,43,FOLLOW_12); 

                            					newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:1973:5: otherlv_1= 'subf'
                            {
                            otherlv_1=(Token)match(input,44,FOLLOW_12); 

                            					newLeafNode(otherlv_1, grammarAccess.getSubAccess().getSubfKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalPds16asm.g:1978:5: otherlv_2= 'sbb'
                            {
                            otherlv_2=(Token)match(input,45,FOLLOW_12); 

                            					newLeafNode(otherlv_2, grammarAccess.getSubAccess().getSbbKeyword_0_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalPds16asm.g:1983:5: otherlv_3= 'sbbf'
                            {
                            otherlv_3=(Token)match(input,46,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getSubAccess().getSbbfKeyword_0_0_3());
                            				

                            }
                            break;

                    }

                    // InternalPds16asm.g:1988:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    int alt36=2;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // InternalPds16asm.g:1989:5: this_OperationsWithConstant_4= ruleOperationsWithConstant
                            {

                            					newCompositeNode(grammarAccess.getSubAccess().getOperationsWithConstantParserRuleCall_0_1_0());
                            				
                            pushFollow(FOLLOW_2);
                            this_OperationsWithConstant_4=ruleOperationsWithConstant();

                            state._fsp--;


                            					current = this_OperationsWithConstant_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:1998:5: this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters
                            {

                            					newCompositeNode(grammarAccess.getSubAccess().getOperationsWithTreeRegistersParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_2);
                            this_OperationsWithTreeRegisters_5=ruleOperationsWithTreeRegisters();

                            state._fsp--;


                            					current = this_OperationsWithTreeRegisters_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2009:3: (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asm.g:2009:3: (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters )
                    // InternalPds16asm.g:2010:4: otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubAccess().getSubrKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getSubAccess().getOperationsWithTreeRegistersParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_OperationsWithTreeRegisters_7=ruleOperationsWithTreeRegisters();

                    state._fsp--;


                    				current = this_OperationsWithTreeRegisters_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:2024:3: ( (otherlv_8= 'dec' | otherlv_9= 'decf' ) this_Registers_10= ruleRegisters )
                    {
                    // InternalPds16asm.g:2024:3: ( (otherlv_8= 'dec' | otherlv_9= 'decf' ) this_Registers_10= ruleRegisters )
                    // InternalPds16asm.g:2025:4: (otherlv_8= 'dec' | otherlv_9= 'decf' ) this_Registers_10= ruleRegisters
                    {
                    // InternalPds16asm.g:2025:4: (otherlv_8= 'dec' | otherlv_9= 'decf' )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==48) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==49) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalPds16asm.g:2026:5: otherlv_8= 'dec'
                            {
                            otherlv_8=(Token)match(input,48,FOLLOW_12); 

                            					newLeafNode(otherlv_8, grammarAccess.getSubAccess().getDecKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:2031:5: otherlv_9= 'decf'
                            {
                            otherlv_9=(Token)match(input,49,FOLLOW_12); 

                            					newLeafNode(otherlv_9, grammarAccess.getSubAccess().getDecfKeyword_2_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getSubAccess().getRegistersParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Registers_10=ruleRegisters();

                    state._fsp--;


                    				current = this_Registers_10;
                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // $ANTLR end "ruleSub"


    // $ANTLR start "entryRuleAnl"
    // InternalPds16asm.g:2049:1: entryRuleAnl returns [EObject current=null] : iv_ruleAnl= ruleAnl EOF ;
    public final EObject entryRuleAnl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnl = null;


        try {
            // InternalPds16asm.g:2049:44: (iv_ruleAnl= ruleAnl EOF )
            // InternalPds16asm.g:2050:2: iv_ruleAnl= ruleAnl EOF
            {
             newCompositeNode(grammarAccess.getAnlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnl=ruleAnl();

            state._fsp--;

             current =iv_ruleAnl; 
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
    // $ANTLR end "entryRuleAnl"


    // $ANTLR start "ruleAnl"
    // InternalPds16asm.g:2056:1: ruleAnl returns [EObject current=null] : ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) ;
    public final EObject ruleAnl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2062:2: ( ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asm.g:2063:2: ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:2063:2: ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            // InternalPds16asm.g:2064:3: (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
            {
            // InternalPds16asm.g:2064:3: (otherlv_0= 'anl' | otherlv_1= 'anlf' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            else if ( (LA39_0==51) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPds16asm.g:2065:4: otherlv_0= 'anl'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getAnlAccess().getAnlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2070:4: otherlv_1= 'anlf'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getAnlAccess().getAnlfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getAnlAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationsWithTreeRegisters_2=ruleOperationsWithTreeRegisters();

            state._fsp--;


            			current = this_OperationsWithTreeRegisters_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleAnl"


    // $ANTLR start "entryRuleOrl"
    // InternalPds16asm.g:2087:1: entryRuleOrl returns [EObject current=null] : iv_ruleOrl= ruleOrl EOF ;
    public final EObject entryRuleOrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrl = null;


        try {
            // InternalPds16asm.g:2087:44: (iv_ruleOrl= ruleOrl EOF )
            // InternalPds16asm.g:2088:2: iv_ruleOrl= ruleOrl EOF
            {
             newCompositeNode(grammarAccess.getOrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrl=ruleOrl();

            state._fsp--;

             current =iv_ruleOrl; 
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
    // $ANTLR end "entryRuleOrl"


    // $ANTLR start "ruleOrl"
    // InternalPds16asm.g:2094:1: ruleOrl returns [EObject current=null] : ( ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= 'mov' | otherlv_4= 'movf' ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) ) ;
    public final EObject ruleOrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_OperationsWithTreeRegisters_2 = null;

        EObject this_OperationWithTwoRegisters_5 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2100:2: ( ( ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= 'mov' | otherlv_4= 'movf' ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) ) )
            // InternalPds16asm.g:2101:2: ( ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= 'mov' | otherlv_4= 'movf' ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) )
            {
            // InternalPds16asm.g:2101:2: ( ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= 'mov' | otherlv_4= 'movf' ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=52 && LA42_0<=53)) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=54 && LA42_0<=55)) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPds16asm.g:2102:3: ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asm.g:2102:3: ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
                    // InternalPds16asm.g:2103:4: (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
                    {
                    // InternalPds16asm.g:2103:4: (otherlv_0= 'orl' | otherlv_1= 'orlf' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==52) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==53) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalPds16asm.g:2104:5: otherlv_0= 'orl'
                            {
                            otherlv_0=(Token)match(input,52,FOLLOW_12); 

                            					newLeafNode(otherlv_0, grammarAccess.getOrlAccess().getOrlKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:2109:5: otherlv_1= 'orlf'
                            {
                            otherlv_1=(Token)match(input,53,FOLLOW_12); 

                            					newLeafNode(otherlv_1, grammarAccess.getOrlAccess().getOrlfKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getOrlAccess().getOperationsWithTreeRegistersParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_OperationsWithTreeRegisters_2=ruleOperationsWithTreeRegisters();

                    state._fsp--;


                    				current = this_OperationsWithTreeRegisters_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2124:3: ( (otherlv_3= 'mov' | otherlv_4= 'movf' ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters )
                    {
                    // InternalPds16asm.g:2124:3: ( (otherlv_3= 'mov' | otherlv_4= 'movf' ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters )
                    // InternalPds16asm.g:2125:4: (otherlv_3= 'mov' | otherlv_4= 'movf' ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters
                    {
                    // InternalPds16asm.g:2125:4: (otherlv_3= 'mov' | otherlv_4= 'movf' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==54) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==55) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalPds16asm.g:2126:5: otherlv_3= 'mov'
                            {
                            otherlv_3=(Token)match(input,54,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getOrlAccess().getMovKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:2131:5: otherlv_4= 'movf'
                            {
                            otherlv_4=(Token)match(input,55,FOLLOW_12); 

                            					newLeafNode(otherlv_4, grammarAccess.getOrlAccess().getMovfKeyword_1_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getOrlAccess().getOperationWithTwoRegistersParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_OperationWithTwoRegisters_5=ruleOperationWithTwoRegisters();

                    state._fsp--;


                    				current = this_OperationWithTwoRegisters_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // $ANTLR end "ruleOrl"


    // $ANTLR start "entryRuleXrl"
    // InternalPds16asm.g:2149:1: entryRuleXrl returns [EObject current=null] : iv_ruleXrl= ruleXrl EOF ;
    public final EObject entryRuleXrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXrl = null;


        try {
            // InternalPds16asm.g:2149:44: (iv_ruleXrl= ruleXrl EOF )
            // InternalPds16asm.g:2150:2: iv_ruleXrl= ruleXrl EOF
            {
             newCompositeNode(grammarAccess.getXrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXrl=ruleXrl();

            state._fsp--;

             current =iv_ruleXrl; 
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
    // $ANTLR end "entryRuleXrl"


    // $ANTLR start "ruleXrl"
    // InternalPds16asm.g:2156:1: ruleXrl returns [EObject current=null] : ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) ;
    public final EObject ruleXrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2162:2: ( ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asm.g:2163:2: ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:2163:2: ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            // InternalPds16asm.g:2164:3: (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
            {
            // InternalPds16asm.g:2164:3: (otherlv_0= 'xrl' | otherlv_1= 'xrlf' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            else if ( (LA43_0==57) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalPds16asm.g:2165:4: otherlv_0= 'xrl'
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getXrlAccess().getXrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2170:4: otherlv_1= 'xrlf'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getXrlAccess().getXrlfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getXrlAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationsWithTreeRegisters_2=ruleOperationsWithTreeRegisters();

            state._fsp--;


            			current = this_OperationsWithTreeRegisters_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleXrl"


    // $ANTLR start "entryRuleNot"
    // InternalPds16asm.g:2187:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalPds16asm.g:2187:44: (iv_ruleNot= ruleNot EOF )
            // InternalPds16asm.g:2188:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalPds16asm.g:2194:1: ruleNot returns [EObject current=null] : ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2200:2: ( ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) )
            // InternalPds16asm.g:2201:2: ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            {
            // InternalPds16asm.g:2201:2: ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            // InternalPds16asm.g:2202:3: (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters
            {
            // InternalPds16asm.g:2202:3: (otherlv_0= 'not' | otherlv_1= 'notf' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==58) ) {
                alt44=1;
            }
            else if ( (LA44_0==59) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalPds16asm.g:2203:4: otherlv_0= 'not'
                    {
                    otherlv_0=(Token)match(input,58,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2208:4: otherlv_1= 'notf'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getNotAccess().getOperationWithTwoRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationWithTwoRegisters_2=ruleOperationWithTwoRegisters();

            state._fsp--;


            			current = this_OperationWithTwoRegisters_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleShl"
    // InternalPds16asm.g:2225:1: entryRuleShl returns [EObject current=null] : iv_ruleShl= ruleShl EOF ;
    public final EObject entryRuleShl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShl = null;


        try {
            // InternalPds16asm.g:2225:44: (iv_ruleShl= ruleShl EOF )
            // InternalPds16asm.g:2226:2: iv_ruleShl= ruleShl EOF
            {
             newCompositeNode(grammarAccess.getShlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShl=ruleShl();

            state._fsp--;

             current =iv_ruleShl; 
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
    // $ANTLR end "entryRuleShl"


    // $ANTLR start "ruleShl"
    // InternalPds16asm.g:2232:1: ruleShl returns [EObject current=null] : (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift ) ;
    public final EObject ruleShl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OperationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2238:2: ( (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift ) )
            // InternalPds16asm.g:2239:2: (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift )
            {
            // InternalPds16asm.g:2239:2: (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift )
            // InternalPds16asm.g:2240:3: otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift
            {
            otherlv_0=(Token)match(input,60,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getShlAccess().getShlKeyword_0());
            		

            			newCompositeNode(grammarAccess.getShlAccess().getOperationShiftParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationShift_1=ruleOperationShift();

            state._fsp--;


            			current = this_OperationShift_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleShl"


    // $ANTLR start "entryRuleShr"
    // InternalPds16asm.g:2256:1: entryRuleShr returns [EObject current=null] : iv_ruleShr= ruleShr EOF ;
    public final EObject entryRuleShr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShr = null;


        try {
            // InternalPds16asm.g:2256:44: (iv_ruleShr= ruleShr EOF )
            // InternalPds16asm.g:2257:2: iv_ruleShr= ruleShr EOF
            {
             newCompositeNode(grammarAccess.getShrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShr=ruleShr();

            state._fsp--;

             current =iv_ruleShr; 
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
    // $ANTLR end "entryRuleShr"


    // $ANTLR start "ruleShr"
    // InternalPds16asm.g:2263:1: ruleShr returns [EObject current=null] : (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift ) ;
    public final EObject ruleShr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OperationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2269:2: ( (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift ) )
            // InternalPds16asm.g:2270:2: (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift )
            {
            // InternalPds16asm.g:2270:2: (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift )
            // InternalPds16asm.g:2271:3: otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift
            {
            otherlv_0=(Token)match(input,61,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getShrAccess().getShrKeyword_0());
            		

            			newCompositeNode(grammarAccess.getShrAccess().getOperationShiftParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationShift_1=ruleOperationShift();

            state._fsp--;


            			current = this_OperationShift_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleShr"


    // $ANTLR start "entryRuleRr"
    // InternalPds16asm.g:2287:1: entryRuleRr returns [EObject current=null] : iv_ruleRr= ruleRr EOF ;
    public final EObject entryRuleRr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRr = null;


        try {
            // InternalPds16asm.g:2287:43: (iv_ruleRr= ruleRr EOF )
            // InternalPds16asm.g:2288:2: iv_ruleRr= ruleRr EOF
            {
             newCompositeNode(grammarAccess.getRrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRr=ruleRr();

            state._fsp--;

             current =iv_ruleRr; 
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
    // $ANTLR end "entryRuleRr"


    // $ANTLR start "ruleRr"
    // InternalPds16asm.g:2294:1: ruleRr returns [EObject current=null] : ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant ) ;
    public final EObject ruleRr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithConstant_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2300:2: ( ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant ) )
            // InternalPds16asm.g:2301:2: ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant )
            {
            // InternalPds16asm.g:2301:2: ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant )
            // InternalPds16asm.g:2302:3: (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant
            {
            // InternalPds16asm.g:2302:3: (otherlv_0= 'rrl' | otherlv_1= 'rrm' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            else if ( (LA45_0==63) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalPds16asm.g:2303:4: otherlv_0= 'rrl'
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getRrAccess().getRrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2308:4: otherlv_1= 'rrm'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getRrAccess().getRrmKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getRrAccess().getOperationsWithConstantParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationsWithConstant_2=ruleOperationsWithConstant();

            state._fsp--;


            			current = this_OperationsWithConstant_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleRr"


    // $ANTLR start "entryRuleRc"
    // InternalPds16asm.g:2325:1: entryRuleRc returns [EObject current=null] : iv_ruleRc= ruleRc EOF ;
    public final EObject entryRuleRc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRc = null;


        try {
            // InternalPds16asm.g:2325:43: (iv_ruleRc= ruleRc EOF )
            // InternalPds16asm.g:2326:2: iv_ruleRc= ruleRc EOF
            {
             newCompositeNode(grammarAccess.getRcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRc=ruleRc();

            state._fsp--;

             current =iv_ruleRc; 
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
    // $ANTLR end "entryRuleRc"


    // $ANTLR start "ruleRc"
    // InternalPds16asm.g:2332:1: ruleRc returns [EObject current=null] : ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) ;
    public final EObject ruleRc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2338:2: ( ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) )
            // InternalPds16asm.g:2339:2: ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            {
            // InternalPds16asm.g:2339:2: ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            // InternalPds16asm.g:2340:3: (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters
            {
            // InternalPds16asm.g:2340:3: (otherlv_0= 'rcr' | otherlv_1= 'rcl' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==64) ) {
                alt46=1;
            }
            else if ( (LA46_0==65) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalPds16asm.g:2341:4: otherlv_0= 'rcr'
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getRcAccess().getRcrKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2346:4: otherlv_1= 'rcl'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getRcAccess().getRclKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getRcAccess().getOperationWithTwoRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationWithTwoRegisters_2=ruleOperationWithTwoRegisters();

            state._fsp--;


            			current = this_OperationWithTwoRegisters_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleRc"


    // $ANTLR start "entryRuleJumpOp"
    // InternalPds16asm.g:2363:1: entryRuleJumpOp returns [EObject current=null] : iv_ruleJumpOp= ruleJumpOp EOF ;
    public final EObject entryRuleJumpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpOp = null;


        try {
            // InternalPds16asm.g:2363:47: (iv_ruleJumpOp= ruleJumpOp EOF )
            // InternalPds16asm.g:2364:2: iv_ruleJumpOp= ruleJumpOp EOF
            {
             newCompositeNode(grammarAccess.getJumpOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJumpOp=ruleJumpOp();

            state._fsp--;

             current =iv_ruleJumpOp; 
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
    // $ANTLR end "entryRuleJumpOp"


    // $ANTLR start "ruleJumpOp"
    // InternalPds16asm.g:2370:1: ruleJumpOp returns [EObject current=null] : ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_OperationWithOffset_10= ruleOperationWithOffset | ( (lv_op_11_0= RULE_ID ) ) | otherlv_12= '$' ) ) ;
    public final EObject ruleJumpOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_op_11_0=null;
        Token otherlv_12=null;
        EObject this_OperationWithOffset_10 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2376:2: ( ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_OperationWithOffset_10= ruleOperationWithOffset | ( (lv_op_11_0= RULE_ID ) ) | otherlv_12= '$' ) ) )
            // InternalPds16asm.g:2377:2: ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_OperationWithOffset_10= ruleOperationWithOffset | ( (lv_op_11_0= RULE_ID ) ) | otherlv_12= '$' ) )
            {
            // InternalPds16asm.g:2377:2: ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_OperationWithOffset_10= ruleOperationWithOffset | ( (lv_op_11_0= RULE_ID ) ) | otherlv_12= '$' ) )
            // InternalPds16asm.g:2378:3: (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_OperationWithOffset_10= ruleOperationWithOffset | ( (lv_op_11_0= RULE_ID ) ) | otherlv_12= '$' )
            {
            // InternalPds16asm.g:2378:3: (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' )
            int alt47=10;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt47=1;
                }
                break;
            case 67:
                {
                alt47=2;
                }
                break;
            case 68:
                {
                alt47=3;
                }
                break;
            case 69:
                {
                alt47=4;
                }
                break;
            case 70:
                {
                alt47=5;
                }
                break;
            case 71:
                {
                alt47=6;
                }
                break;
            case 72:
                {
                alt47=7;
                }
                break;
            case 73:
                {
                alt47=8;
                }
                break;
            case 74:
                {
                alt47=9;
                }
                break;
            case 75:
                {
                alt47=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalPds16asm.g:2379:4: otherlv_0= 'jz'
                    {
                    otherlv_0=(Token)match(input,66,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getJumpOpAccess().getJzKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2384:4: otherlv_1= 'je'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getJumpOpAccess().getJeKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:2389:4: otherlv_2= 'jnz'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getJumpOpAccess().getJnzKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:2394:4: otherlv_3= 'jne'
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getJumpOpAccess().getJneKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:2399:4: otherlv_4= 'jc'
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getJumpOpAccess().getJcKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:2404:4: otherlv_5= 'jbl'
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getJumpOpAccess().getJblKeyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:2409:4: otherlv_6= 'jnc'
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getJumpOpAccess().getJncKeyword_0_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:2414:4: otherlv_7= 'jae'
                    {
                    otherlv_7=(Token)match(input,73,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getJumpOpAccess().getJaeKeyword_0_7());
                    			

                    }
                    break;
                case 9 :
                    // InternalPds16asm.g:2419:4: otherlv_8= 'jmp'
                    {
                    otherlv_8=(Token)match(input,74,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getJumpOpAccess().getJmpKeyword_0_8());
                    			

                    }
                    break;
                case 10 :
                    // InternalPds16asm.g:2424:4: otherlv_9= 'jmpl'
                    {
                    otherlv_9=(Token)match(input,75,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getJumpOpAccess().getJmplKeyword_0_9());
                    			

                    }
                    break;

            }

            // InternalPds16asm.g:2429:3: (this_OperationWithOffset_10= ruleOperationWithOffset | ( (lv_op_11_0= RULE_ID ) ) | otherlv_12= '$' )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt48=1;
                }
                break;
            case RULE_ID:
                {
                alt48=2;
                }
                break;
            case 76:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPds16asm.g:2430:4: this_OperationWithOffset_10= ruleOperationWithOffset
                    {

                    				newCompositeNode(grammarAccess.getJumpOpAccess().getOperationWithOffsetParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_OperationWithOffset_10=ruleOperationWithOffset();

                    state._fsp--;


                    				current = this_OperationWithOffset_10;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2439:4: ( (lv_op_11_0= RULE_ID ) )
                    {
                    // InternalPds16asm.g:2439:4: ( (lv_op_11_0= RULE_ID ) )
                    // InternalPds16asm.g:2440:5: (lv_op_11_0= RULE_ID )
                    {
                    // InternalPds16asm.g:2440:5: (lv_op_11_0= RULE_ID )
                    // InternalPds16asm.g:2441:6: lv_op_11_0= RULE_ID
                    {
                    lv_op_11_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_op_11_0, grammarAccess.getJumpOpAccess().getOpIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"op",
                    							lv_op_11_0,
                    							"org.pds16.pds16asm.Pds16asm.ID");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:2458:4: otherlv_12= '$'
                    {
                    otherlv_12=(Token)match(input,76,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getJumpOpAccess().getDollarSignKeyword_1_2());
                    			

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
    // $ANTLR end "ruleJumpOp"


    // $ANTLR start "entryRuleNop"
    // InternalPds16asm.g:2467:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalPds16asm.g:2467:44: (iv_ruleNop= ruleNop EOF )
            // InternalPds16asm.g:2468:2: iv_ruleNop= ruleNop EOF
            {
             newCompositeNode(grammarAccess.getNopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;

             current =iv_ruleNop; 
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
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalPds16asm.g:2474:1: ruleNop returns [EObject current=null] : ( (lv_instruction_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_instruction_0_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:2480:2: ( ( (lv_instruction_0_0= 'nop' ) ) )
            // InternalPds16asm.g:2481:2: ( (lv_instruction_0_0= 'nop' ) )
            {
            // InternalPds16asm.g:2481:2: ( (lv_instruction_0_0= 'nop' ) )
            // InternalPds16asm.g:2482:3: (lv_instruction_0_0= 'nop' )
            {
            // InternalPds16asm.g:2482:3: (lv_instruction_0_0= 'nop' )
            // InternalPds16asm.g:2483:4: lv_instruction_0_0= 'nop'
            {
            lv_instruction_0_0=(Token)match(input,77,FOLLOW_2); 

            				newLeafNode(lv_instruction_0_0, grammarAccess.getNopAccess().getInstructionNopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNopRule());
            				}
            				setWithLastConsumed(current, "instruction", lv_instruction_0_0, "nop");
            			

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
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleRet"
    // InternalPds16asm.g:2498:1: entryRuleRet returns [EObject current=null] : iv_ruleRet= ruleRet EOF ;
    public final EObject entryRuleRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRet = null;


        try {
            // InternalPds16asm.g:2498:44: (iv_ruleRet= ruleRet EOF )
            // InternalPds16asm.g:2499:2: iv_ruleRet= ruleRet EOF
            {
             newCompositeNode(grammarAccess.getRetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRet=ruleRet();

            state._fsp--;

             current =iv_ruleRet; 
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
    // $ANTLR end "entryRuleRet"


    // $ANTLR start "ruleRet"
    // InternalPds16asm.g:2505:1: ruleRet returns [EObject current=null] : ( ( (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' ) ) ) ;
    public final EObject ruleRet() throws RecognitionException {
        EObject current = null;

        Token lv_instruction_0_1=null;
        Token lv_instruction_0_2=null;


        	enterRule();

        try {
            // InternalPds16asm.g:2511:2: ( ( ( (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' ) ) ) )
            // InternalPds16asm.g:2512:2: ( ( (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' ) ) )
            {
            // InternalPds16asm.g:2512:2: ( ( (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' ) ) )
            // InternalPds16asm.g:2513:3: ( (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' ) )
            {
            // InternalPds16asm.g:2513:3: ( (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' ) )
            // InternalPds16asm.g:2514:4: (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' )
            {
            // InternalPds16asm.g:2514:4: (lv_instruction_0_1= 'ret' | lv_instruction_0_2= 'iret' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==78) ) {
                alt49=1;
            }
            else if ( (LA49_0==79) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalPds16asm.g:2515:5: lv_instruction_0_1= 'ret'
                    {
                    lv_instruction_0_1=(Token)match(input,78,FOLLOW_2); 

                    					newLeafNode(lv_instruction_0_1, grammarAccess.getRetAccess().getInstructionRetKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRetRule());
                    					}
                    					setWithLastConsumed(current, "instruction", lv_instruction_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2526:5: lv_instruction_0_2= 'iret'
                    {
                    lv_instruction_0_2=(Token)match(input,79,FOLLOW_2); 

                    					newLeafNode(lv_instruction_0_2, grammarAccess.getRetAccess().getInstructionIretKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRetRule());
                    					}
                    					setWithLastConsumed(current, "instruction", lv_instruction_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleRet"


    // $ANTLR start "entryRuleImmediate"
    // InternalPds16asm.g:2542:1: entryRuleImmediate returns [EObject current=null] : iv_ruleImmediate= ruleImmediate EOF ;
    public final EObject entryRuleImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate = null;


        try {
            // InternalPds16asm.g:2542:50: (iv_ruleImmediate= ruleImmediate EOF )
            // InternalPds16asm.g:2543:2: iv_ruleImmediate= ruleImmediate EOF
            {
             newCompositeNode(grammarAccess.getImmediateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImmediate=ruleImmediate();

            state._fsp--;

             current =iv_ruleImmediate; 
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
    // $ANTLR end "entryRuleImmediate"


    // $ANTLR start "ruleImmediate"
    // InternalPds16asm.g:2549:1: ruleImmediate returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) ) ;
    public final EObject ruleImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_register_0_0 = null;

        EObject lv_immediate8_2_0 = null;

        EObject lv_lowORhigh_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2555:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) ) )
            // InternalPds16asm.g:2556:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) )
            {
            // InternalPds16asm.g:2556:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) )
            // InternalPds16asm.g:2557:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) )
            {
            // InternalPds16asm.g:2557:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:2558:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:2558:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:2559:5: lv_register_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getImmediateAccess().getRegisterRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_register_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImmediateRule());
            					}
            					set(
            						current,
            						"register",
            						lv_register_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getImmediateAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:2580:3: ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==82) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==RULE_ID||(LA50_1>=RULE_INT && LA50_1<=RULE_CHAR)) ) {
                    alt50=1;
                }
                else if ( ((LA50_1>=83 && LA50_1<=84)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalPds16asm.g:2581:4: ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) )
                    {
                    // InternalPds16asm.g:2581:4: ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) )
                    // InternalPds16asm.g:2582:5: (lv_immediate8_2_0= ruleImmediate8OrLabel )
                    {
                    // InternalPds16asm.g:2582:5: (lv_immediate8_2_0= ruleImmediate8OrLabel )
                    // InternalPds16asm.g:2583:6: lv_immediate8_2_0= ruleImmediate8OrLabel
                    {

                    						newCompositeNode(grammarAccess.getImmediateAccess().getImmediate8Immediate8OrLabelParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_immediate8_2_0=ruleImmediate8OrLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImmediateRule());
                    						}
                    						set(
                    							current,
                    							"immediate8",
                    							lv_immediate8_2_0,
                    							"org.pds16.pds16asm.Pds16asm.Immediate8OrLabel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2601:4: ( (lv_lowORhigh_3_0= ruleLowOrHight ) )
                    {
                    // InternalPds16asm.g:2601:4: ( (lv_lowORhigh_3_0= ruleLowOrHight ) )
                    // InternalPds16asm.g:2602:5: (lv_lowORhigh_3_0= ruleLowOrHight )
                    {
                    // InternalPds16asm.g:2602:5: (lv_lowORhigh_3_0= ruleLowOrHight )
                    // InternalPds16asm.g:2603:6: lv_lowORhigh_3_0= ruleLowOrHight
                    {

                    						newCompositeNode(grammarAccess.getImmediateAccess().getLowORhighLowOrHightParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lowORhigh_3_0=ruleLowOrHight();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImmediateRule());
                    						}
                    						set(
                    							current,
                    							"lowORhigh",
                    							lv_lowORhigh_3_0,
                    							"org.pds16.pds16asm.Pds16asm.LowOrHight");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleImmediate"


    // $ANTLR start "entryRuleDirect"
    // InternalPds16asm.g:2625:1: entryRuleDirect returns [EObject current=null] : iv_ruleDirect= ruleDirect EOF ;
    public final EObject entryRuleDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirect = null;


        try {
            // InternalPds16asm.g:2625:47: (iv_ruleDirect= ruleDirect EOF )
            // InternalPds16asm.g:2626:2: iv_ruleDirect= ruleDirect EOF
            {
             newCompositeNode(grammarAccess.getDirectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirect=ruleDirect();

            state._fsp--;

             current =iv_ruleDirect; 
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
    // $ANTLR end "entryRuleDirect"


    // $ANTLR start "ruleDirect"
    // InternalPds16asm.g:2632:1: ruleDirect returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= ruleDirectOrLabel ) ) ) ;
    public final EObject ruleDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_register_0_0 = null;

        EObject lv_direct7_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2638:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= ruleDirectOrLabel ) ) ) )
            // InternalPds16asm.g:2639:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= ruleDirectOrLabel ) ) )
            {
            // InternalPds16asm.g:2639:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= ruleDirectOrLabel ) ) )
            // InternalPds16asm.g:2640:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= ruleDirectOrLabel ) )
            {
            // InternalPds16asm.g:2640:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:2641:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:2641:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:2642:5: lv_register_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getDirectAccess().getRegisterRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_register_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectRule());
            					}
            					set(
            						current,
            						"register",
            						lv_register_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:2663:3: ( (lv_direct7_2_0= ruleDirectOrLabel ) )
            // InternalPds16asm.g:2664:4: (lv_direct7_2_0= ruleDirectOrLabel )
            {
            // InternalPds16asm.g:2664:4: (lv_direct7_2_0= ruleDirectOrLabel )
            // InternalPds16asm.g:2665:5: lv_direct7_2_0= ruleDirectOrLabel
            {

            					newCompositeNode(grammarAccess.getDirectAccess().getDirect7DirectOrLabelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_direct7_2_0=ruleDirectOrLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectRule());
            					}
            					set(
            						current,
            						"direct7",
            						lv_direct7_2_0,
            						"org.pds16.pds16asm.Pds16asm.DirectOrLabel");
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
    // $ANTLR end "ruleDirect"


    // $ANTLR start "entryRuleIndexed"
    // InternalPds16asm.g:2686:1: entryRuleIndexed returns [EObject current=null] : iv_ruleIndexed= ruleIndexed EOF ;
    public final EObject entryRuleIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexed = null;


        try {
            // InternalPds16asm.g:2686:48: (iv_ruleIndexed= ruleIndexed EOF )
            // InternalPds16asm.g:2687:2: iv_ruleIndexed= ruleIndexed EOF
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
    // InternalPds16asm.g:2693:1: ruleIndexed returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= ']' ) ;
    public final EObject ruleIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rbx_3_0 = null;

        EObject lv_idx3_5_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2699:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= ']' ) )
            // InternalPds16asm.g:2700:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= ']' )
            {
            // InternalPds16asm.g:2700:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= ']' )
            // InternalPds16asm.g:2701:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= ']'
            {
            // InternalPds16asm.g:2701:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:2702:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:2702:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:2703:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:2728:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:2729:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:2729:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:2730:5: lv_rbx_3_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getRbxRegistersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_rbx_3_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"rbx",
            						lv_rbx_3_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:2751:3: ( (lv_idx3_5_0= ruleIdx3OrLabel ) )
            // InternalPds16asm.g:2752:4: (lv_idx3_5_0= ruleIdx3OrLabel )
            {
            // InternalPds16asm.g:2752:4: (lv_idx3_5_0= ruleIdx3OrLabel )
            // InternalPds16asm.g:2753:5: lv_idx3_5_0= ruleIdx3OrLabel
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getIdx3Idx3OrLabelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_idx3_5_0=ruleIdx3OrLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"idx3",
            						lv_idx3_5_0,
            						"org.pds16.pds16asm.Pds16asm.Idx3OrLabel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,81,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIndexedAccess().getRightSquareBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleBasedIndexed"
    // InternalPds16asm.g:2778:1: entryRuleBasedIndexed returns [EObject current=null] : iv_ruleBasedIndexed= ruleBasedIndexed EOF ;
    public final EObject entryRuleBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasedIndexed = null;


        try {
            // InternalPds16asm.g:2778:53: (iv_ruleBasedIndexed= ruleBasedIndexed EOF )
            // InternalPds16asm.g:2779:2: iv_ruleBasedIndexed= ruleBasedIndexed EOF
            {
             newCompositeNode(grammarAccess.getBasedIndexedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasedIndexed=ruleBasedIndexed();

            state._fsp--;

             current =iv_ruleBasedIndexed; 
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
    // $ANTLR end "entryRuleBasedIndexed"


    // $ANTLR start "ruleBasedIndexed"
    // InternalPds16asm.g:2785:1: ruleBasedIndexed returns [EObject current=null] : (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) ;
    public final EObject ruleBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Registers_0 = null;

        EObject lv_rbx_3_0 = null;

        EObject lv_rix_5_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2791:2: ( (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) )
            // InternalPds16asm.g:2792:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            {
            // InternalPds16asm.g:2792:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            // InternalPds16asm.g:2793:3: this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']'
            {

            			newCompositeNode(grammarAccess.getBasedIndexedAccess().getRegistersParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Registers_0=ruleRegisters();

            state._fsp--;


            			current = this_Registers_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getBasedIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getBasedIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:2809:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:2810:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:2810:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:2811:5: lv_rbx_3_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getBasedIndexedAccess().getRbxRegistersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_rbx_3_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasedIndexedRule());
            					}
            					set(
            						current,
            						"rbx",
            						lv_rbx_3_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getBasedIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:2832:3: ( (lv_rix_5_0= ruleRegisters ) )
            // InternalPds16asm.g:2833:4: (lv_rix_5_0= ruleRegisters )
            {
            // InternalPds16asm.g:2833:4: (lv_rix_5_0= ruleRegisters )
            // InternalPds16asm.g:2834:5: lv_rix_5_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getBasedIndexedAccess().getRixRegistersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_rix_5_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasedIndexedRule());
            					}
            					set(
            						current,
            						"rix",
            						lv_rix_5_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,81,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBasedIndexedAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBasedIndexed"


    // $ANTLR start "entryRuleDirectOrLabel"
    // InternalPds16asm.g:2859:1: entryRuleDirectOrLabel returns [EObject current=null] : iv_ruleDirectOrLabel= ruleDirectOrLabel EOF ;
    public final EObject entryRuleDirectOrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectOrLabel = null;


        try {
            // InternalPds16asm.g:2859:54: (iv_ruleDirectOrLabel= ruleDirectOrLabel EOF )
            // InternalPds16asm.g:2860:2: iv_ruleDirectOrLabel= ruleDirectOrLabel EOF
            {
             newCompositeNode(grammarAccess.getDirectOrLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectOrLabel=ruleDirectOrLabel();

            state._fsp--;

             current =iv_ruleDirectOrLabel; 
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
    // $ANTLR end "entryRuleDirectOrLabel"


    // $ANTLR start "ruleDirectOrLabel"
    // InternalPds16asm.g:2866:1: ruleDirectOrLabel returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDirectOrLabel() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2872:2: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) ) )
            // InternalPds16asm.g:2873:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) )
            {
            // InternalPds16asm.g:2873:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_CHAR)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalPds16asm.g:2874:3: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // InternalPds16asm.g:2874:3: ( (lv_number_0_0= ruleNumber ) )
                    // InternalPds16asm.g:2875:4: (lv_number_0_0= ruleNumber )
                    {
                    // InternalPds16asm.g:2875:4: (lv_number_0_0= ruleNumber )
                    // InternalPds16asm.g:2876:5: lv_number_0_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getDirectOrLabelAccess().getNumberNumberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectOrLabelRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.pds16.pds16asm.Pds16asm.Number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2894:3: ( (lv_label_1_0= RULE_ID ) )
                    {
                    // InternalPds16asm.g:2894:3: ( (lv_label_1_0= RULE_ID ) )
                    // InternalPds16asm.g:2895:4: (lv_label_1_0= RULE_ID )
                    {
                    // InternalPds16asm.g:2895:4: (lv_label_1_0= RULE_ID )
                    // InternalPds16asm.g:2896:5: lv_label_1_0= RULE_ID
                    {
                    lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_label_1_0, grammarAccess.getDirectOrLabelAccess().getLabelIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectOrLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_1_0,
                    						"org.pds16.pds16asm.Pds16asm.ID");
                    				

                    }


                    }


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
    // $ANTLR end "ruleDirectOrLabel"


    // $ANTLR start "entryRuleImmediate8OrLabel"
    // InternalPds16asm.g:2916:1: entryRuleImmediate8OrLabel returns [EObject current=null] : iv_ruleImmediate8OrLabel= ruleImmediate8OrLabel EOF ;
    public final EObject entryRuleImmediate8OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate8OrLabel = null;


        try {
            // InternalPds16asm.g:2916:58: (iv_ruleImmediate8OrLabel= ruleImmediate8OrLabel EOF )
            // InternalPds16asm.g:2917:2: iv_ruleImmediate8OrLabel= ruleImmediate8OrLabel EOF
            {
             newCompositeNode(grammarAccess.getImmediate8OrLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImmediate8OrLabel=ruleImmediate8OrLabel();

            state._fsp--;

             current =iv_ruleImmediate8OrLabel; 
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
    // $ANTLR end "entryRuleImmediate8OrLabel"


    // $ANTLR start "ruleImmediate8OrLabel"
    // InternalPds16asm.g:2923:1: ruleImmediate8OrLabel returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleImmediate8OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2929:2: ( (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asm.g:2930:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asm.g:2930:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asm.g:2931:3: otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImmediate8OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:2935:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_INT && LA52_0<=RULE_CHAR)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalPds16asm.g:2936:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asm.g:2936:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asm.g:2937:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asm.g:2937:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asm.g:2938:6: lv_number_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getImmediate8OrLabelAccess().getNumberNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImmediate8OrLabelRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_1_0,
                    							"org.pds16.pds16asm.Pds16asm.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2956:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asm.g:2956:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asm.g:2957:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asm.g:2957:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asm.g:2958:6: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_label_2_0, grammarAccess.getImmediate8OrLabelAccess().getLabelIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImmediate8OrLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_2_0,
                    							"org.pds16.pds16asm.Pds16asm.ID");
                    					

                    }


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
    // $ANTLR end "ruleImmediate8OrLabel"


    // $ANTLR start "entryRuleIdx3OrLabel"
    // InternalPds16asm.g:2979:1: entryRuleIdx3OrLabel returns [EObject current=null] : iv_ruleIdx3OrLabel= ruleIdx3OrLabel EOF ;
    public final EObject entryRuleIdx3OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdx3OrLabel = null;


        try {
            // InternalPds16asm.g:2979:52: (iv_ruleIdx3OrLabel= ruleIdx3OrLabel EOF )
            // InternalPds16asm.g:2980:2: iv_ruleIdx3OrLabel= ruleIdx3OrLabel EOF
            {
             newCompositeNode(grammarAccess.getIdx3OrLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdx3OrLabel=ruleIdx3OrLabel();

            state._fsp--;

             current =iv_ruleIdx3OrLabel; 
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
    // $ANTLR end "entryRuleIdx3OrLabel"


    // $ANTLR start "ruleIdx3OrLabel"
    // InternalPds16asm.g:2986:1: ruleIdx3OrLabel returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleIdx3OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:2992:2: ( (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asm.g:2993:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asm.g:2993:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asm.g:2994:3: otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIdx3OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:2998:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_INT && LA53_0<=RULE_CHAR)) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ID) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalPds16asm.g:2999:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asm.g:2999:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asm.g:3000:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asm.g:3000:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asm.g:3001:6: lv_number_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getIdx3OrLabelAccess().getNumberNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIdx3OrLabelRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_1_0,
                    							"org.pds16.pds16asm.Pds16asm.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:3019:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asm.g:3019:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asm.g:3020:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asm.g:3020:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asm.g:3021:6: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_label_2_0, grammarAccess.getIdx3OrLabelAccess().getLabelIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdx3OrLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_2_0,
                    							"org.pds16.pds16asm.Pds16asm.ID");
                    					

                    }


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
    // $ANTLR end "ruleIdx3OrLabel"


    // $ANTLR start "entryRuleConst4OrLabel"
    // InternalPds16asm.g:3042:1: entryRuleConst4OrLabel returns [EObject current=null] : iv_ruleConst4OrLabel= ruleConst4OrLabel EOF ;
    public final EObject entryRuleConst4OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst4OrLabel = null;


        try {
            // InternalPds16asm.g:3042:54: (iv_ruleConst4OrLabel= ruleConst4OrLabel EOF )
            // InternalPds16asm.g:3043:2: iv_ruleConst4OrLabel= ruleConst4OrLabel EOF
            {
             newCompositeNode(grammarAccess.getConst4OrLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConst4OrLabel=ruleConst4OrLabel();

            state._fsp--;

             current =iv_ruleConst4OrLabel; 
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
    // $ANTLR end "entryRuleConst4OrLabel"


    // $ANTLR start "ruleConst4OrLabel"
    // InternalPds16asm.g:3049:1: ruleConst4OrLabel returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleConst4OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3055:2: ( (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asm.g:3056:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asm.g:3056:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asm.g:3057:3: otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConst4OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:3061:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_CHAR)) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalPds16asm.g:3062:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asm.g:3062:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asm.g:3063:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asm.g:3063:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asm.g:3064:6: lv_number_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getConst4OrLabelAccess().getNumberNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConst4OrLabelRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_1_0,
                    							"org.pds16.pds16asm.Pds16asm.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:3082:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asm.g:3082:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asm.g:3083:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asm.g:3083:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asm.g:3084:6: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_label_2_0, grammarAccess.getConst4OrLabelAccess().getLabelIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConst4OrLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_2_0,
                    							"org.pds16.pds16asm.Pds16asm.ID");
                    					

                    }


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
    // $ANTLR end "ruleConst4OrLabel"


    // $ANTLR start "entryRuleOffset8OrLabel"
    // InternalPds16asm.g:3105:1: entryRuleOffset8OrLabel returns [EObject current=null] : iv_ruleOffset8OrLabel= ruleOffset8OrLabel EOF ;
    public final EObject entryRuleOffset8OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset8OrLabel = null;


        try {
            // InternalPds16asm.g:3105:55: (iv_ruleOffset8OrLabel= ruleOffset8OrLabel EOF )
            // InternalPds16asm.g:3106:2: iv_ruleOffset8OrLabel= ruleOffset8OrLabel EOF
            {
             newCompositeNode(grammarAccess.getOffset8OrLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOffset8OrLabel=ruleOffset8OrLabel();

            state._fsp--;

             current =iv_ruleOffset8OrLabel; 
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
    // $ANTLR end "entryRuleOffset8OrLabel"


    // $ANTLR start "ruleOffset8OrLabel"
    // InternalPds16asm.g:3112:1: ruleOffset8OrLabel returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleOffset8OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3118:2: ( (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asm.g:3119:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asm.g:3119:2: (otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asm.g:3120:3: otherlv_0= '#' ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOffset8OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:3124:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_INT && LA55_0<=RULE_CHAR)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ID) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalPds16asm.g:3125:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asm.g:3125:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asm.g:3126:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asm.g:3126:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asm.g:3127:6: lv_number_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getOffset8OrLabelAccess().getNumberNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOffset8OrLabelRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_1_0,
                    							"org.pds16.pds16asm.Pds16asm.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:3145:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asm.g:3145:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asm.g:3146:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asm.g:3146:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asm.g:3147:6: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_label_2_0, grammarAccess.getOffset8OrLabelAccess().getLabelIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOffset8OrLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_2_0,
                    							"org.pds16.pds16asm.Pds16asm.ID");
                    					

                    }


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
    // $ANTLR end "ruleOffset8OrLabel"


    // $ANTLR start "entryRuleOperationWithTwoRegisters"
    // InternalPds16asm.g:3168:1: entryRuleOperationWithTwoRegisters returns [EObject current=null] : iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF ;
    public final EObject entryRuleOperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationWithTwoRegisters = null;


        try {
            // InternalPds16asm.g:3168:66: (iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF )
            // InternalPds16asm.g:3169:2: iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF
            {
             newCompositeNode(grammarAccess.getOperationWithTwoRegistersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationWithTwoRegisters=ruleOperationWithTwoRegisters();

            state._fsp--;

             current =iv_ruleOperationWithTwoRegisters; 
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
    // $ANTLR end "entryRuleOperationWithTwoRegisters"


    // $ANTLR start "ruleOperationWithTwoRegisters"
    // InternalPds16asm.g:3175:1: ruleOperationWithTwoRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) ) ;
    public final EObject ruleOperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3181:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) ) )
            // InternalPds16asm.g:3182:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) )
            {
            // InternalPds16asm.g:3182:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) )
            // InternalPds16asm.g:3183:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) )
            {
            // InternalPds16asm.g:3183:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:3184:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:3184:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:3185:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationWithTwoRegistersAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithTwoRegistersRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithTwoRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:3206:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:3207:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:3207:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:3208:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationWithTwoRegistersAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rm_2_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithTwoRegistersRule());
            					}
            					set(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
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
    // $ANTLR end "ruleOperationWithTwoRegisters"


    // $ANTLR start "entryRuleOperationsWithTreeRegisters"
    // InternalPds16asm.g:3229:1: entryRuleOperationsWithTreeRegisters returns [EObject current=null] : iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF ;
    public final EObject entryRuleOperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsWithTreeRegisters = null;


        try {
            // InternalPds16asm.g:3229:68: (iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF )
            // InternalPds16asm.g:3230:2: iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF
            {
             newCompositeNode(grammarAccess.getOperationsWithTreeRegistersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationsWithTreeRegisters=ruleOperationsWithTreeRegisters();

            state._fsp--;

             current =iv_ruleOperationsWithTreeRegisters; 
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
    // $ANTLR end "entryRuleOperationsWithTreeRegisters"


    // $ANTLR start "ruleOperationsWithTreeRegisters"
    // InternalPds16asm.g:3236:1: ruleOperationsWithTreeRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) ) ;
    public final EObject ruleOperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;

        EObject lv_rn_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3242:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) ) )
            // InternalPds16asm.g:3243:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) )
            {
            // InternalPds16asm.g:3243:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) )
            // InternalPds16asm.g:3244:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) )
            {
            // InternalPds16asm.g:3244:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:3245:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:3245:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:3246:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithTreeRegistersAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:3267:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:3268:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:3268:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:3269:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithTreeRegistersAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_rm_2_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					set(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_3());
            		
            // InternalPds16asm.g:3290:3: ( (lv_rn_4_0= ruleRegisters ) )
            // InternalPds16asm.g:3291:4: (lv_rn_4_0= ruleRegisters )
            {
            // InternalPds16asm.g:3291:4: (lv_rn_4_0= ruleRegisters )
            // InternalPds16asm.g:3292:5: lv_rn_4_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithTreeRegistersAccess().getRnRegistersParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_rn_4_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					set(
            						current,
            						"rn",
            						lv_rn_4_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
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
    // $ANTLR end "ruleOperationsWithTreeRegisters"


    // $ANTLR start "entryRuleOperationsWithConstant"
    // InternalPds16asm.g:3313:1: entryRuleOperationsWithConstant returns [EObject current=null] : iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF ;
    public final EObject entryRuleOperationsWithConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsWithConstant = null;


        try {
            // InternalPds16asm.g:3313:63: (iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF )
            // InternalPds16asm.g:3314:2: iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF
            {
             newCompositeNode(grammarAccess.getOperationsWithConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationsWithConstant=ruleOperationsWithConstant();

            state._fsp--;

             current =iv_ruleOperationsWithConstant; 
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
    // $ANTLR end "entryRuleOperationsWithConstant"


    // $ANTLR start "ruleOperationsWithConstant"
    // InternalPds16asm.g:3320:1: ruleOperationsWithConstant returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) ) ;
    public final EObject ruleOperationsWithConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;

        EObject lv_const4_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3326:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) ) )
            // InternalPds16asm.g:3327:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) )
            {
            // InternalPds16asm.g:3327:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) )
            // InternalPds16asm.g:3328:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) )
            {
            // InternalPds16asm.g:3328:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:3329:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:3329:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:3330:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithConstantRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:3351:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:3352:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:3352:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:3353:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_rm_2_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithConstantRule());
            					}
            					set(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_3());
            		
            // InternalPds16asm.g:3374:3: ( (lv_const4_4_0= ruleConst4OrLabel ) )
            // InternalPds16asm.g:3375:4: (lv_const4_4_0= ruleConst4OrLabel )
            {
            // InternalPds16asm.g:3375:4: (lv_const4_4_0= ruleConst4OrLabel )
            // InternalPds16asm.g:3376:5: lv_const4_4_0= ruleConst4OrLabel
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getConst4Const4OrLabelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_const4_4_0=ruleConst4OrLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithConstantRule());
            					}
            					set(
            						current,
            						"const4",
            						lv_const4_4_0,
            						"org.pds16.pds16asm.Pds16asm.Const4OrLabel");
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
    // $ANTLR end "ruleOperationsWithConstant"


    // $ANTLR start "entryRuleOperationShift"
    // InternalPds16asm.g:3397:1: entryRuleOperationShift returns [EObject current=null] : iv_ruleOperationShift= ruleOperationShift EOF ;
    public final EObject entryRuleOperationShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationShift = null;


        try {
            // InternalPds16asm.g:3397:55: (iv_ruleOperationShift= ruleOperationShift EOF )
            // InternalPds16asm.g:3398:2: iv_ruleOperationShift= ruleOperationShift EOF
            {
             newCompositeNode(grammarAccess.getOperationShiftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationShift=ruleOperationShift();

            state._fsp--;

             current =iv_ruleOperationShift; 
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
    // $ANTLR end "entryRuleOperationShift"


    // $ANTLR start "ruleOperationShift"
    // InternalPds16asm.g:3404:1: ruleOperationShift returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= ',' ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) ) ;
    public final EObject ruleOperationShift() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_sin_6_1=null;
        Token lv_sin_6_2=null;
        Token lv_sin_6_3=null;
        Token lv_sin_6_4=null;
        Token lv_sin_6_5=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;

        EObject lv_const4_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3410:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= ',' ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) ) )
            // InternalPds16asm.g:3411:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= ',' ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) )
            {
            // InternalPds16asm.g:3411:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= ',' ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) )
            // InternalPds16asm.g:3412:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= ',' ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) )
            {
            // InternalPds16asm.g:3412:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:3413:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:3413:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:3414:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationShiftRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationShiftAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:3435:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:3436:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:3436:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:3437:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_rm_2_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationShiftRule());
            					}
            					set(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationShiftAccess().getCommaKeyword_3());
            		
            // InternalPds16asm.g:3458:3: ( (lv_const4_4_0= ruleConst4OrLabel ) )
            // InternalPds16asm.g:3459:4: (lv_const4_4_0= ruleConst4OrLabel )
            {
            // InternalPds16asm.g:3459:4: (lv_const4_4_0= ruleConst4OrLabel )
            // InternalPds16asm.g:3460:5: lv_const4_4_0= ruleConst4OrLabel
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getConst4Const4OrLabelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_const4_4_0=ruleConst4OrLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationShiftRule());
            					}
            					set(
            						current,
            						"const4",
            						lv_const4_4_0,
            						"org.pds16.pds16asm.Pds16asm.Const4OrLabel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationShiftAccess().getCommaKeyword_5());
            		
            // InternalPds16asm.g:3481:3: ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) )
            // InternalPds16asm.g:3482:4: ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) )
            {
            // InternalPds16asm.g:3482:4: ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) )
            // InternalPds16asm.g:3483:5: (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR )
            {
            // InternalPds16asm.g:3483:5: (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR )
            int alt56=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt56=1;
                }
                break;
            case RULE_HEX:
                {
                alt56=2;
                }
                break;
            case RULE_OCT:
                {
                alt56=3;
                }
                break;
            case RULE_BIN:
                {
                alt56=4;
                }
                break;
            case RULE_CHAR:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalPds16asm.g:3484:6: lv_sin_6_1= RULE_INT
                    {
                    lv_sin_6_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_sin_6_1, grammarAccess.getOperationShiftAccess().getSinINTTerminalRuleCall_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationShiftRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sin",
                    							lv_sin_6_1,
                    							"org.pds16.pds16asm.Pds16asm.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:3499:6: lv_sin_6_2= RULE_HEX
                    {
                    lv_sin_6_2=(Token)match(input,RULE_HEX,FOLLOW_2); 

                    						newLeafNode(lv_sin_6_2, grammarAccess.getOperationShiftAccess().getSinHEXTerminalRuleCall_6_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationShiftRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sin",
                    							lv_sin_6_2,
                    							"org.pds16.pds16asm.Pds16asm.HEX");
                    					

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:3514:6: lv_sin_6_3= RULE_OCT
                    {
                    lv_sin_6_3=(Token)match(input,RULE_OCT,FOLLOW_2); 

                    						newLeafNode(lv_sin_6_3, grammarAccess.getOperationShiftAccess().getSinOCTTerminalRuleCall_6_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationShiftRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sin",
                    							lv_sin_6_3,
                    							"org.pds16.pds16asm.Pds16asm.OCT");
                    					

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:3529:6: lv_sin_6_4= RULE_BIN
                    {
                    lv_sin_6_4=(Token)match(input,RULE_BIN,FOLLOW_2); 

                    						newLeafNode(lv_sin_6_4, grammarAccess.getOperationShiftAccess().getSinBINTerminalRuleCall_6_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationShiftRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sin",
                    							lv_sin_6_4,
                    							"org.pds16.pds16asm.Pds16asm.BIN");
                    					

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:3544:6: lv_sin_6_5= RULE_CHAR
                    {
                    lv_sin_6_5=(Token)match(input,RULE_CHAR,FOLLOW_2); 

                    						newLeafNode(lv_sin_6_5, grammarAccess.getOperationShiftAccess().getSinCHARTerminalRuleCall_6_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationShiftRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sin",
                    							lv_sin_6_5,
                    							"org.pds16.pds16asm.Pds16asm.CHAR");
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleOperationShift"


    // $ANTLR start "entryRuleOperationWithOffset"
    // InternalPds16asm.g:3565:1: entryRuleOperationWithOffset returns [EObject current=null] : iv_ruleOperationWithOffset= ruleOperationWithOffset EOF ;
    public final EObject entryRuleOperationWithOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationWithOffset = null;


        try {
            // InternalPds16asm.g:3565:60: (iv_ruleOperationWithOffset= ruleOperationWithOffset EOF )
            // InternalPds16asm.g:3566:2: iv_ruleOperationWithOffset= ruleOperationWithOffset EOF
            {
             newCompositeNode(grammarAccess.getOperationWithOffsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationWithOffset=ruleOperationWithOffset();

            state._fsp--;

             current =iv_ruleOperationWithOffset; 
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
    // $ANTLR end "entryRuleOperationWithOffset"


    // $ANTLR start "ruleOperationWithOffset"
    // InternalPds16asm.g:3572:1: ruleOperationWithOffset returns [EObject current=null] : ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) ) ;
    public final EObject ruleOperationWithOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rbx_0_0 = null;

        EObject lv_offset8_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3578:2: ( ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) ) )
            // InternalPds16asm.g:3579:2: ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) )
            {
            // InternalPds16asm.g:3579:2: ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) )
            // InternalPds16asm.g:3580:3: ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleOffset8OrLabel ) )
            {
            // InternalPds16asm.g:3580:3: ( (lv_rbx_0_0= ruleRegisters ) )
            // InternalPds16asm.g:3581:4: (lv_rbx_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:3581:4: (lv_rbx_0_0= ruleRegisters )
            // InternalPds16asm.g:3582:5: lv_rbx_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationWithOffsetAccess().getRbxRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_rbx_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithOffsetRule());
            					}
            					set(
            						current,
            						"rbx",
            						lv_rbx_0_0,
            						"org.pds16.pds16asm.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithOffsetAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:3603:3: ( (lv_offset8_2_0= ruleOffset8OrLabel ) )
            // InternalPds16asm.g:3604:4: (lv_offset8_2_0= ruleOffset8OrLabel )
            {
            // InternalPds16asm.g:3604:4: (lv_offset8_2_0= ruleOffset8OrLabel )
            // InternalPds16asm.g:3605:5: lv_offset8_2_0= ruleOffset8OrLabel
            {

            					newCompositeNode(grammarAccess.getOperationWithOffsetAccess().getOffset8Offset8OrLabelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_offset8_2_0=ruleOffset8OrLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithOffsetRule());
            					}
            					set(
            						current,
            						"offset8",
            						lv_offset8_2_0,
            						"org.pds16.pds16asm.Pds16asm.Offset8OrLabel");
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
    // $ANTLR end "ruleOperationWithOffset"


    // $ANTLR start "entryRuleExpression"
    // InternalPds16asm.g:3626:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPds16asm.g:3626:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPds16asm.g:3627:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPds16asm.g:3633:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+ ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_numericValue_0_1=null;
        Token lv_numericValue_0_2=null;
        Token lv_numericValue_0_3=null;
        Token lv_numericValue_0_4=null;
        Token lv_numericValue_0_5=null;
        Token lv_idValue_1_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:3639:2: ( ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+ )
            // InternalPds16asm.g:3640:2: ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+
            {
            // InternalPds16asm.g:3640:2: ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=3;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==EOF||LA58_2==RULE_ID||(LA58_2>=RULE_INT && LA58_2<=RULE_CHAR)||(LA58_2>=17 && LA58_2<=21)||(LA58_2>=23 && LA58_2<=75)||(LA58_2>=77 && LA58_2<=79)||LA58_2==86) ) {
                        alt58=2;
                    }


                }
                else if ( ((LA58_0>=RULE_INT && LA58_0<=RULE_CHAR)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalPds16asm.g:3641:3: ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) )
            	    {
            	    // InternalPds16asm.g:3641:3: ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) )
            	    // InternalPds16asm.g:3642:4: ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) )
            	    {
            	    // InternalPds16asm.g:3642:4: ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) )
            	    // InternalPds16asm.g:3643:5: (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR )
            	    {
            	    // InternalPds16asm.g:3643:5: (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR )
            	    int alt57=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_INT:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case RULE_HEX:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case RULE_OCT:
            	        {
            	        alt57=3;
            	        }
            	        break;
            	    case RULE_BIN:
            	        {
            	        alt57=4;
            	        }
            	        break;
            	    case RULE_CHAR:
            	        {
            	        alt57=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt57) {
            	        case 1 :
            	            // InternalPds16asm.g:3644:6: lv_numericValue_0_1= RULE_INT
            	            {
            	            lv_numericValue_0_1=(Token)match(input,RULE_INT,FOLLOW_17); 

            	            						newLeafNode(lv_numericValue_0_1, grammarAccess.getExpressionAccess().getNumericValueINTTerminalRuleCall_0_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getExpressionRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"numericValue",
            	            							lv_numericValue_0_1,
            	            							"org.pds16.pds16asm.Pds16asm.INT");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalPds16asm.g:3659:6: lv_numericValue_0_2= RULE_HEX
            	            {
            	            lv_numericValue_0_2=(Token)match(input,RULE_HEX,FOLLOW_17); 

            	            						newLeafNode(lv_numericValue_0_2, grammarAccess.getExpressionAccess().getNumericValueHEXTerminalRuleCall_0_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getExpressionRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"numericValue",
            	            							lv_numericValue_0_2,
            	            							"org.pds16.pds16asm.Pds16asm.HEX");
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalPds16asm.g:3674:6: lv_numericValue_0_3= RULE_OCT
            	            {
            	            lv_numericValue_0_3=(Token)match(input,RULE_OCT,FOLLOW_17); 

            	            						newLeafNode(lv_numericValue_0_3, grammarAccess.getExpressionAccess().getNumericValueOCTTerminalRuleCall_0_0_2());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getExpressionRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"numericValue",
            	            							lv_numericValue_0_3,
            	            							"org.pds16.pds16asm.Pds16asm.OCT");
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalPds16asm.g:3689:6: lv_numericValue_0_4= RULE_BIN
            	            {
            	            lv_numericValue_0_4=(Token)match(input,RULE_BIN,FOLLOW_17); 

            	            						newLeafNode(lv_numericValue_0_4, grammarAccess.getExpressionAccess().getNumericValueBINTerminalRuleCall_0_0_3());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getExpressionRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"numericValue",
            	            							lv_numericValue_0_4,
            	            							"org.pds16.pds16asm.Pds16asm.BIN");
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalPds16asm.g:3704:6: lv_numericValue_0_5= RULE_CHAR
            	            {
            	            lv_numericValue_0_5=(Token)match(input,RULE_CHAR,FOLLOW_17); 

            	            						newLeafNode(lv_numericValue_0_5, grammarAccess.getExpressionAccess().getNumericValueCHARTerminalRuleCall_0_0_4());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getExpressionRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"numericValue",
            	            							lv_numericValue_0_5,
            	            							"org.pds16.pds16asm.Pds16asm.CHAR");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPds16asm.g:3722:3: ( (lv_idValue_1_0= RULE_ID ) )
            	    {
            	    // InternalPds16asm.g:3722:3: ( (lv_idValue_1_0= RULE_ID ) )
            	    // InternalPds16asm.g:3723:4: (lv_idValue_1_0= RULE_ID )
            	    {
            	    // InternalPds16asm.g:3723:4: (lv_idValue_1_0= RULE_ID )
            	    // InternalPds16asm.g:3724:5: lv_idValue_1_0= RULE_ID
            	    {
            	    lv_idValue_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    					newLeafNode(lv_idValue_1_0, grammarAccess.getExpressionAccess().getIdValueIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExpressionRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"idValue",
            	    						lv_idValue_1_0,
            	    						"org.pds16.pds16asm.Pds16asm.ID");
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLowOrHight"
    // InternalPds16asm.g:3744:1: entryRuleLowOrHight returns [EObject current=null] : iv_ruleLowOrHight= ruleLowOrHight EOF ;
    public final EObject entryRuleLowOrHight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowOrHight = null;


        try {
            // InternalPds16asm.g:3744:51: (iv_ruleLowOrHight= ruleLowOrHight EOF )
            // InternalPds16asm.g:3745:2: iv_ruleLowOrHight= ruleLowOrHight EOF
            {
             newCompositeNode(grammarAccess.getLowOrHightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowOrHight=ruleLowOrHight();

            state._fsp--;

             current =iv_ruleLowOrHight; 
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
    // $ANTLR end "entryRuleLowOrHight"


    // $ANTLR start "ruleLowOrHight"
    // InternalPds16asm.g:3751:1: ruleLowOrHight returns [EObject current=null] : (otherlv_0= '#' (otherlv_1= 'low' | otherlv_2= 'high' ) otherlv_3= '(' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleLowOrHight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:3757:2: ( (otherlv_0= '#' (otherlv_1= 'low' | otherlv_2= 'high' ) otherlv_3= '(' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalPds16asm.g:3758:2: (otherlv_0= '#' (otherlv_1= 'low' | otherlv_2= 'high' ) otherlv_3= '(' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalPds16asm.g:3758:2: (otherlv_0= '#' (otherlv_1= 'low' | otherlv_2= 'high' ) otherlv_3= '(' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalPds16asm.g:3759:3: otherlv_0= '#' (otherlv_1= 'low' | otherlv_2= 'high' ) otherlv_3= '(' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getLowOrHightAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:3763:3: (otherlv_1= 'low' | otherlv_2= 'high' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==83) ) {
                alt59=1;
            }
            else if ( (LA59_0==84) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalPds16asm.g:3764:4: otherlv_1= 'low'
                    {
                    otherlv_1=(Token)match(input,83,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getLowOrHightAccess().getLowKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:3769:4: otherlv_2= 'high'
                    {
                    otherlv_2=(Token)match(input,84,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getLowOrHightAccess().getHighKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,85,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getLowOrHightAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPds16asm.g:3778:3: ( (lv_value_4_0= ruleExpression ) )
            // InternalPds16asm.g:3779:4: (lv_value_4_0= ruleExpression )
            {
            // InternalPds16asm.g:3779:4: (lv_value_4_0= ruleExpression )
            // InternalPds16asm.g:3780:5: lv_value_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLowOrHightAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_value_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowOrHightRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.pds16.pds16asm.Pds16asm.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,86,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLowOrHightAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLowOrHight"


    // $ANTLR start "entryRuleRegisters"
    // InternalPds16asm.g:3805:1: entryRuleRegisters returns [EObject current=null] : iv_ruleRegisters= ruleRegisters EOF ;
    public final EObject entryRuleRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisters = null;


        try {
            // InternalPds16asm.g:3805:50: (iv_ruleRegisters= ruleRegisters EOF )
            // InternalPds16asm.g:3806:2: iv_ruleRegisters= ruleRegisters EOF
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
    // InternalPds16asm.g:3812:1: ruleRegisters returns [EObject current=null] : ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) ) ;
    public final EObject ruleRegisters() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;
        Token lv_value_0_8=null;
        Token lv_value_0_9=null;


        	enterRule();

        try {
            // InternalPds16asm.g:3818:2: ( ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) ) )
            // InternalPds16asm.g:3819:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) )
            {
            // InternalPds16asm.g:3819:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) )
            // InternalPds16asm.g:3820:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) )
            {
            // InternalPds16asm.g:3820:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) )
            // InternalPds16asm.g:3821:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' )
            {
            // InternalPds16asm.g:3821:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' )
            int alt60=9;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt60=1;
                }
                break;
            case 88:
                {
                alt60=2;
                }
                break;
            case 89:
                {
                alt60=3;
                }
                break;
            case 90:
                {
                alt60=4;
                }
                break;
            case 91:
                {
                alt60=5;
                }
                break;
            case 92:
                {
                alt60=6;
                }
                break;
            case 93:
                {
                alt60=7;
                }
                break;
            case 94:
                {
                alt60=8;
                }
                break;
            case 95:
                {
                alt60=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalPds16asm.g:3822:5: lv_value_0_1= 'r0'
                    {
                    lv_value_0_1=(Token)match(input,87,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getRegistersAccess().getValueR0Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:3833:5: lv_value_0_2= 'r1'
                    {
                    lv_value_0_2=(Token)match(input,88,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getRegistersAccess().getValueR1Keyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:3844:5: lv_value_0_3= 'r2'
                    {
                    lv_value_0_3=(Token)match(input,89,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getRegistersAccess().getValueR2Keyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:3855:5: lv_value_0_4= 'r3'
                    {
                    lv_value_0_4=(Token)match(input,90,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getRegistersAccess().getValueR3Keyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:3866:5: lv_value_0_5= 'r4'
                    {
                    lv_value_0_5=(Token)match(input,91,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getRegistersAccess().getValueR4Keyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:3877:5: lv_value_0_6= 'r5'
                    {
                    lv_value_0_6=(Token)match(input,92,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getRegistersAccess().getValueR5Keyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:3888:5: lv_value_0_7= 'r6'
                    {
                    lv_value_0_7=(Token)match(input,93,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getRegistersAccess().getValueR6Keyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:3899:5: lv_value_0_8= 'r7'
                    {
                    lv_value_0_8=(Token)match(input,94,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getRegistersAccess().getValueR7Keyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalPds16asm.g:3910:5: lv_value_0_9= 'PSW'
                    {
                    lv_value_0_9=(Token)match(input,95,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getRegistersAccess().getValuePSWKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleRegisters"


    // $ANTLR start "entryRuleNumber"
    // InternalPds16asm.g:3926:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalPds16asm.g:3926:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalPds16asm.g:3927:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalPds16asm.g:3933:1: ruleNumber returns [EObject current=null] : ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;


        	enterRule();

        try {
            // InternalPds16asm.g:3939:2: ( ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) ) )
            // InternalPds16asm.g:3940:2: ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) )
            {
            // InternalPds16asm.g:3940:2: ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) )
            // InternalPds16asm.g:3941:3: ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) )
            {
            // InternalPds16asm.g:3941:3: ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) )
            // InternalPds16asm.g:3942:4: (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR )
            {
            // InternalPds16asm.g:3942:4: (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt61=1;
                }
                break;
            case RULE_HEX:
                {
                alt61=2;
                }
                break;
            case RULE_OCT:
                {
                alt61=3;
                }
                break;
            case RULE_BIN:
                {
                alt61=4;
                }
                break;
            case RULE_CHAR:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalPds16asm.g:3943:5: lv_value_0_1= RULE_INT
                    {
                    lv_value_0_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.pds16.pds16asm.Pds16asm.INT");
                    				

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:3958:5: lv_value_0_2= RULE_HEX
                    {
                    lv_value_0_2=(Token)match(input,RULE_HEX,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getNumberAccess().getValueHEXTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.pds16.pds16asm.Pds16asm.HEX");
                    				

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:3973:5: lv_value_0_3= RULE_OCT
                    {
                    lv_value_0_3=(Token)match(input,RULE_OCT,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getNumberAccess().getValueOCTTerminalRuleCall_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_3,
                    						"org.pds16.pds16asm.Pds16asm.OCT");
                    				

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:3988:5: lv_value_0_4= RULE_BIN
                    {
                    lv_value_0_4=(Token)match(input,RULE_BIN,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getNumberAccess().getValueBINTerminalRuleCall_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_4,
                    						"org.pds16.pds16asm.Pds16asm.BIN");
                    				

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:4003:5: lv_value_0_5= RULE_CHAR
                    {
                    lv_value_0_5=(Token)match(input,RULE_CHAR,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getNumberAccess().getValueCHARTerminalRuleCall_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_5,
                    						"org.pds16.pds16asm.Pds16asm.CHAR");
                    				

                    }
                    break;

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\37\1\uffff\2\127\11\26\1\4\1\127\1\uffff\11\26\1\122\2\uffff";
    static final String dfa_3s = "\1\42\1\uffff\2\137\11\26\1\120\1\137\1\uffff\11\26\1\137\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\15\uffff\1\2\12\uffff\1\4\1\3";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\2\1\1\2\1\3",
            "",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\17\1\uffff\5\17\105\uffff\1\16",
            "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\33\4\uffff\11\32",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1366:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )";
        }
    }
    static final String dfa_7s = "\33\uffff";
    static final String dfa_8s = "\1\43\2\127\11\26\1\4\1\127\1\uffff\11\26\1\122\2\uffff";
    static final String dfa_9s = "\1\44\2\137\11\26\1\120\1\137\1\uffff\11\26\1\137\2\uffff";
    static final String dfa_10s = "\16\uffff\1\1\12\uffff\1\3\1\2";
    static final String dfa_11s = "\33\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\16\1\uffff\5\16\105\uffff\1\15",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\32\4\uffff\11\31",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1420:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )";
        }
    }
    static final String dfa_13s = "\27\uffff";
    static final String dfa_14s = "\1\127\11\26\1\127\11\26\1\122\2\uffff";
    static final String dfa_15s = "\1\137\11\26\1\137\11\26\1\137\2\uffff";
    static final String dfa_16s = "\25\uffff\1\2\1\1";
    static final String dfa_17s = "\27\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\26\4\uffff\11\25",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1905:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )";
        }
    }
    static final String dfa_19s = "\25\uffff\1\1\1\2";
    static final String[] dfa_20s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\25\4\uffff\11\26",
            "",
            ""
    };
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_19;
            this.special = dfa_17;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1988:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFBE0012L,0x000000000000EFFFL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xFFFFFFFFFFBE0010L,0x000000000000EFFFL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000007D0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x00000000FF800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x00000000FF801000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000007D2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});

}
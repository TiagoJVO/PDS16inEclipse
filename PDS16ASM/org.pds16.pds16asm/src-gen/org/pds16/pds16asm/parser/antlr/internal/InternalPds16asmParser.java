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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Section", "Asciiz", "Ascii", "Space", "Byte", "Data", "Text", "Word", "Bss", "End", "Equ", "Org", "Set", "Adcf", "Addf", "Anlf", "Decf", "High", "Incf", "Iret", "Jmpl", "Ldih", "Movf", "Notf", "Orlf", "Sbbf", "Subf", "Subr", "Xrlf", "Adc", "Add", "Anl", "Dec", "Inc", "Jae", "Jbl", "Jmp", "Jnc", "Jne", "Jnz", "Ldb", "Ldi", "Low", "Mov", "Nop", "Not", "Orl", "Rcl", "Rcr", "Ret", "Rrl", "Rrm", "Sbb", "Shl", "Shr", "Stb", "Sub", "Xrl", "Jc", "Je", "Jz", "Ld", "St", "NumberSign", "DollarSign", "LeftParenthesis", "RightParenthesis", "Comma", "LeftSquareBracket", "RightSquareBracket", "RULE_REGISTERS", "RULE_SIGN", "RULE_HEX", "RULE_OCT", "RULE_BIN", "RULE_ANY_OTHER", "RULE_CHAR", "RULE_ID", "RULE_IDLABEL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int Add=34;
    public static final int Jne=42;
    public static final int Ret=53;
    public static final int Stb=59;
    public static final int Adc=33;
    public static final int St=66;
    public static final int RULE_HEX=76;
    public static final int Word=11;
    public static final int RULE_OCT=77;
    public static final int Asciiz=5;
    public static final int RULE_SIGN=75;
    public static final int Rrm=55;
    public static final int Rrl=54;
    public static final int Ldih=25;
    public static final int Xrl=61;
    public static final int LeftParenthesis=69;
    public static final int Jbl=39;
    public static final int Shl=57;
    public static final int Jnz=43;
    public static final int Anlf=19;
    public static final int Orlf=28;
    public static final int Ld=65;
    public static final int RULE_CHAR=80;
    public static final int Addf=18;
    public static final int Iret=23;
    public static final int Shr=58;
    public static final int RightSquareBracket=73;
    public static final int RULE_BIN=78;
    public static final int Space=7;
    public static final int Sub=60;
    public static final int Bss=12;
    public static final int RULE_ID=81;
    public static final int Equ=14;
    public static final int RightParenthesis=70;
    public static final int Nop=48;
    public static final int Not=49;
    public static final int Low=46;
    public static final int Notf=27;
    public static final int RULE_INT=83;
    public static final int Byte=8;
    public static final int NumberSign=67;
    public static final int RULE_ML_COMMENT=85;
    public static final int End=13;
    public static final int Rcl=51;
    public static final int LeftSquareBracket=72;
    public static final int Jmpl=24;
    public static final int Xrlf=32;
    public static final int Anl=35;
    public static final int Inc=37;
    public static final int Rcr=52;
    public static final int Set=16;
    public static final int Org=15;
    public static final int Orl=50;
    public static final int Incf=22;
    public static final int RULE_STRING=84;
    public static final int Ldb=44;
    public static final int RULE_SL_COMMENT=86;
    public static final int Ldi=45;
    public static final int Comma=71;
    public static final int Sbb=56;
    public static final int Sbbf=29;
    public static final int Movf=26;
    public static final int Jc=62;
    public static final int Je=63;
    public static final int EOF=-1;
    public static final int High=21;
    public static final int Subf=30;
    public static final int RULE_REGISTERS=74;
    public static final int Dec=36;
    public static final int Decf=20;
    public static final int RULE_WS=87;
    public static final int Data=9;
    public static final int Text=10;
    public static final int RULE_ANY_OTHER=79;
    public static final int Jmp=40;
    public static final int Section=4;
    public static final int Jae=38;
    public static final int Jz=64;
    public static final int Subr=31;
    public static final int Mov=47;
    public static final int RULE_IDLABEL=82;
    public static final int Ascii=6;
    public static final int DollarSign=68;
    public static final int Adcf=17;
    public static final int Jnc=41;

    // delegates
    // delegators


        public InternalPds16asmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPds16asmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPds16asmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPds16asmParser.g"; }



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
    // InternalPds16asmParser.g:57:1: entryRulePDS16ASM returns [EObject current=null] : iv_rulePDS16ASM= rulePDS16ASM EOF ;
    public final EObject entryRulePDS16ASM() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDS16ASM = null;


        try {
            // InternalPds16asmParser.g:57:49: (iv_rulePDS16ASM= rulePDS16ASM EOF )
            // InternalPds16asmParser.g:58:2: iv_rulePDS16ASM= rulePDS16ASM EOF
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
    // InternalPds16asmParser.g:64:1: rulePDS16ASM returns [EObject current=null] : ( (lv_instuctions_0_0= ruleStatement ) )* ;
    public final EObject rulePDS16ASM() throws RecognitionException {
        EObject current = null;

        EObject lv_instuctions_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:70:2: ( ( (lv_instuctions_0_0= ruleStatement ) )* )
            // InternalPds16asmParser.g:71:2: ( (lv_instuctions_0_0= ruleStatement ) )*
            {
            // InternalPds16asmParser.g:71:2: ( (lv_instuctions_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Section && LA1_0<=Decf)||(LA1_0>=Incf && LA1_0<=Ldi)||(LA1_0>=Mov && LA1_0<=St)||LA1_0==RULE_IDLABEL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPds16asmParser.g:72:3: (lv_instuctions_0_0= ruleStatement )
            	    {
            	    // InternalPds16asmParser.g:72:3: (lv_instuctions_0_0= ruleStatement )
            	    // InternalPds16asmParser.g:73:4: lv_instuctions_0_0= ruleStatement
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
    // InternalPds16asmParser.g:93:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPds16asmParser.g:93:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPds16asmParser.g:94:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalPds16asmParser.g:100:1: ruleStatement returns [EObject current=null] : (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Instructions_0 = null;

        EObject this_Label_1 = null;

        EObject this_Directive_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:106:2: ( (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective ) )
            // InternalPds16asmParser.g:107:2: (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective )
            {
            // InternalPds16asmParser.g:107:2: (this_Instructions_0= ruleInstructions | this_Label_1= ruleLabel | this_Directive_2= ruleDirective )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Adcf:
            case Addf:
            case Anlf:
            case Decf:
            case Incf:
            case Iret:
            case Jmpl:
            case Ldih:
            case Movf:
            case Notf:
            case Orlf:
            case Sbbf:
            case Subf:
            case Subr:
            case Xrlf:
            case Adc:
            case Add:
            case Anl:
            case Dec:
            case Inc:
            case Jae:
            case Jbl:
            case Jmp:
            case Jnc:
            case Jne:
            case Jnz:
            case Ldb:
            case Ldi:
            case Mov:
            case Nop:
            case Not:
            case Orl:
            case Rcl:
            case Rcr:
            case Ret:
            case Rrl:
            case Rrm:
            case Sbb:
            case Shl:
            case Shr:
            case Stb:
            case Sub:
            case Xrl:
            case Jc:
            case Je:
            case Jz:
            case Ld:
            case St:
                {
                alt2=1;
                }
                break;
            case RULE_IDLABEL:
                {
                alt2=2;
                }
                break;
            case Section:
            case Asciiz:
            case Ascii:
            case Space:
            case Byte:
            case Data:
            case Text:
            case Word:
            case Bss:
            case End:
            case Equ:
            case Org:
            case Set:
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
                    // InternalPds16asmParser.g:108:3: this_Instructions_0= ruleInstructions
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
                    // InternalPds16asmParser.g:117:3: this_Label_1= ruleLabel
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
                    // InternalPds16asmParser.g:126:3: this_Directive_2= ruleDirective
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
    // InternalPds16asmParser.g:138:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalPds16asmParser.g:138:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalPds16asmParser.g:139:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalPds16asmParser.g:145:1: ruleLabel returns [EObject current=null] : ( ( (lv_labelName_0_0= RULE_IDLABEL ) ) ( ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_labelName_0_0=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_1_3 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:151:2: ( ( ( (lv_labelName_0_0= RULE_IDLABEL ) ) ( ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) ) ) ) )
            // InternalPds16asmParser.g:152:2: ( ( (lv_labelName_0_0= RULE_IDLABEL ) ) ( ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) ) ) )
            {
            // InternalPds16asmParser.g:152:2: ( ( (lv_labelName_0_0= RULE_IDLABEL ) ) ( ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) ) ) )
            // InternalPds16asmParser.g:153:3: ( (lv_labelName_0_0= RULE_IDLABEL ) ) ( ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) ) )
            {
            // InternalPds16asmParser.g:153:3: ( (lv_labelName_0_0= RULE_IDLABEL ) )
            // InternalPds16asmParser.g:154:4: (lv_labelName_0_0= RULE_IDLABEL )
            {
            // InternalPds16asmParser.g:154:4: (lv_labelName_0_0= RULE_IDLABEL )
            // InternalPds16asmParser.g:155:5: lv_labelName_0_0= RULE_IDLABEL
            {
            lv_labelName_0_0=(Token)match(input,RULE_IDLABEL,FOLLOW_4); 

            					newLeafNode(lv_labelName_0_0, grammarAccess.getLabelAccess().getLabelNameIDLABELTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"labelName",
            						lv_labelName_0_0,
            						"org.pds16.pds16asm.Pds16asm.IDLABEL");
            				

            }


            }

            // InternalPds16asmParser.g:171:3: ( ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) ) )
            // InternalPds16asmParser.g:172:4: ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) )
            {
            // InternalPds16asmParser.g:172:4: ( (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions ) )
            // InternalPds16asmParser.g:173:5: (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions )
            {
            // InternalPds16asmParser.g:173:5: (lv_value_1_1= ruleLabel | lv_value_1_2= ruleLabelDirective | lv_value_1_3= ruleInstructions )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_IDLABEL:
                {
                alt3=1;
                }
                break;
            case Asciiz:
            case Ascii:
            case Space:
            case Byte:
            case Word:
                {
                alt3=2;
                }
                break;
            case Adcf:
            case Addf:
            case Anlf:
            case Decf:
            case Incf:
            case Iret:
            case Jmpl:
            case Ldih:
            case Movf:
            case Notf:
            case Orlf:
            case Sbbf:
            case Subf:
            case Subr:
            case Xrlf:
            case Adc:
            case Add:
            case Anl:
            case Dec:
            case Inc:
            case Jae:
            case Jbl:
            case Jmp:
            case Jnc:
            case Jne:
            case Jnz:
            case Ldb:
            case Ldi:
            case Mov:
            case Nop:
            case Not:
            case Orl:
            case Rcl:
            case Rcr:
            case Ret:
            case Rrl:
            case Rrm:
            case Sbb:
            case Shl:
            case Shr:
            case Stb:
            case Sub:
            case Xrl:
            case Jc:
            case Je:
            case Jz:
            case Ld:
            case St:
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
                    // InternalPds16asmParser.g:174:6: lv_value_1_1= ruleLabel
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getValueLabelParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_1=ruleLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_1,
                    							"org.pds16.pds16asm.Pds16asm.Label");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:190:6: lv_value_1_2= ruleLabelDirective
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getValueLabelDirectiveParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_2=ruleLabelDirective();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_2,
                    							"org.pds16.pds16asm.Pds16asm.LabelDirective");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalPds16asmParser.g:206:6: lv_value_1_3= ruleInstructions
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getValueInstructionsParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_3=ruleInstructions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_3,
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
    // InternalPds16asmParser.g:228:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalPds16asmParser.g:228:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalPds16asmParser.g:229:2: iv_ruleDirective= ruleDirective EOF
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
    // InternalPds16asmParser.g:235:1: ruleDirective returns [EObject current=null] : (this_Bss_0= ruleBss | this_Data_1= ruleData | this_End_2= ruleEnd | this_Text_3= ruleText | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        EObject this_Bss_0 = null;

        EObject this_Data_1 = null;

        EObject this_End_2 = null;

        EObject this_Text_3 = null;

        EObject this_Equ_4 = null;

        EObject this_Org_5 = null;

        EObject this_Section_6 = null;

        EObject this_Set_7 = null;

        EObject this_LabelDirective_8 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:241:2: ( (this_Bss_0= ruleBss | this_Data_1= ruleData | this_End_2= ruleEnd | this_Text_3= ruleText | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective ) )
            // InternalPds16asmParser.g:242:2: (this_Bss_0= ruleBss | this_Data_1= ruleData | this_End_2= ruleEnd | this_Text_3= ruleText | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective )
            {
            // InternalPds16asmParser.g:242:2: (this_Bss_0= ruleBss | this_Data_1= ruleData | this_End_2= ruleEnd | this_Text_3= ruleText | this_Equ_4= ruleEqu | this_Org_5= ruleOrg | this_Section_6= ruleSection | this_Set_7= ruleSet | this_LabelDirective_8= ruleLabelDirective )
            int alt4=9;
            switch ( input.LA(1) ) {
            case Bss:
                {
                alt4=1;
                }
                break;
            case Data:
                {
                alt4=2;
                }
                break;
            case End:
                {
                alt4=3;
                }
                break;
            case Text:
                {
                alt4=4;
                }
                break;
            case Equ:
                {
                alt4=5;
                }
                break;
            case Org:
                {
                alt4=6;
                }
                break;
            case Section:
                {
                alt4=7;
                }
                break;
            case Set:
                {
                alt4=8;
                }
                break;
            case Asciiz:
            case Ascii:
            case Space:
            case Byte:
            case Word:
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
                    // InternalPds16asmParser.g:243:3: this_Bss_0= ruleBss
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getBssParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bss_0=ruleBss();

                    state._fsp--;


                    			current = this_Bss_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:252:3: this_Data_1= ruleData
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getDataParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Data_1=ruleData();

                    state._fsp--;


                    			current = this_Data_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asmParser.g:261:3: this_End_2= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getEndParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_2=ruleEnd();

                    state._fsp--;


                    			current = this_End_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asmParser.g:270:3: this_Text_3= ruleText
                    {

                    			newCompositeNode(grammarAccess.getDirectiveAccess().getTextParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_3=ruleText();

                    state._fsp--;


                    			current = this_Text_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPds16asmParser.g:279:3: this_Equ_4= ruleEqu
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
                    // InternalPds16asmParser.g:288:3: this_Org_5= ruleOrg
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
                    // InternalPds16asmParser.g:297:3: this_Section_6= ruleSection
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
                    // InternalPds16asmParser.g:306:3: this_Set_7= ruleSet
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
                    // InternalPds16asmParser.g:315:3: this_LabelDirective_8= ruleLabelDirective
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
    // InternalPds16asmParser.g:327:1: entryRuleLabelDirective returns [EObject current=null] : iv_ruleLabelDirective= ruleLabelDirective EOF ;
    public final EObject entryRuleLabelDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelDirective = null;


        try {
            // InternalPds16asmParser.g:327:55: (iv_ruleLabelDirective= ruleLabelDirective EOF )
            // InternalPds16asmParser.g:328:2: iv_ruleLabelDirective= ruleLabelDirective EOF
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
    // InternalPds16asmParser.g:334:1: ruleLabelDirective returns [EObject current=null] : (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace ) ;
    public final EObject ruleLabelDirective() throws RecognitionException {
        EObject current = null;

        EObject this_Ascii_0 = null;

        EObject this_Asciiz_1 = null;

        EObject this_Byte_2 = null;

        EObject this_Word_3 = null;

        EObject this_Space_4 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:340:2: ( (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace ) )
            // InternalPds16asmParser.g:341:2: (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace )
            {
            // InternalPds16asmParser.g:341:2: (this_Ascii_0= ruleAscii | this_Asciiz_1= ruleAsciiz | this_Byte_2= ruleByte | this_Word_3= ruleWord | this_Space_4= ruleSpace )
            int alt5=5;
            switch ( input.LA(1) ) {
            case Ascii:
                {
                alt5=1;
                }
                break;
            case Asciiz:
                {
                alt5=2;
                }
                break;
            case Byte:
                {
                alt5=3;
                }
                break;
            case Word:
                {
                alt5=4;
                }
                break;
            case Space:
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
                    // InternalPds16asmParser.g:342:3: this_Ascii_0= ruleAscii
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
                    // InternalPds16asmParser.g:351:3: this_Asciiz_1= ruleAsciiz
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
                    // InternalPds16asmParser.g:360:3: this_Byte_2= ruleByte
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
                    // InternalPds16asmParser.g:369:3: this_Word_3= ruleWord
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
                    // InternalPds16asmParser.g:378:3: this_Space_4= ruleSpace
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


    // $ANTLR start "entryRuleBss"
    // InternalPds16asmParser.g:390:1: entryRuleBss returns [EObject current=null] : iv_ruleBss= ruleBss EOF ;
    public final EObject entryRuleBss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBss = null;


        try {
            // InternalPds16asmParser.g:390:44: (iv_ruleBss= ruleBss EOF )
            // InternalPds16asmParser.g:391:2: iv_ruleBss= ruleBss EOF
            {
             newCompositeNode(grammarAccess.getBssRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBss=ruleBss();

            state._fsp--;

             current =iv_ruleBss; 
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
    // $ANTLR end "entryRuleBss"


    // $ANTLR start "ruleBss"
    // InternalPds16asmParser.g:397:1: ruleBss returns [EObject current=null] : ( (lv_value_0_0= Bss ) ) ;
    public final EObject ruleBss() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:403:2: ( ( (lv_value_0_0= Bss ) ) )
            // InternalPds16asmParser.g:404:2: ( (lv_value_0_0= Bss ) )
            {
            // InternalPds16asmParser.g:404:2: ( (lv_value_0_0= Bss ) )
            // InternalPds16asmParser.g:405:3: (lv_value_0_0= Bss )
            {
            // InternalPds16asmParser.g:405:3: (lv_value_0_0= Bss )
            // InternalPds16asmParser.g:406:4: lv_value_0_0= Bss
            {
            lv_value_0_0=(Token)match(input,Bss,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBssAccess().getValueBssKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBssRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, ".bss");
            			

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
    // $ANTLR end "ruleBss"


    // $ANTLR start "entryRuleData"
    // InternalPds16asmParser.g:421:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalPds16asmParser.g:421:45: (iv_ruleData= ruleData EOF )
            // InternalPds16asmParser.g:422:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalPds16asmParser.g:428:1: ruleData returns [EObject current=null] : ( (lv_value_0_0= Data ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:434:2: ( ( (lv_value_0_0= Data ) ) )
            // InternalPds16asmParser.g:435:2: ( (lv_value_0_0= Data ) )
            {
            // InternalPds16asmParser.g:435:2: ( (lv_value_0_0= Data ) )
            // InternalPds16asmParser.g:436:3: (lv_value_0_0= Data )
            {
            // InternalPds16asmParser.g:436:3: (lv_value_0_0= Data )
            // InternalPds16asmParser.g:437:4: lv_value_0_0= Data
            {
            lv_value_0_0=(Token)match(input,Data,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDataAccess().getValueDataKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDataRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, ".data");
            			

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleEnd"
    // InternalPds16asmParser.g:452:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalPds16asmParser.g:452:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalPds16asmParser.g:453:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalPds16asmParser.g:459:1: ruleEnd returns [EObject current=null] : ( (lv_value_0_0= End ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:465:2: ( ( (lv_value_0_0= End ) ) )
            // InternalPds16asmParser.g:466:2: ( (lv_value_0_0= End ) )
            {
            // InternalPds16asmParser.g:466:2: ( (lv_value_0_0= End ) )
            // InternalPds16asmParser.g:467:3: (lv_value_0_0= End )
            {
            // InternalPds16asmParser.g:467:3: (lv_value_0_0= End )
            // InternalPds16asmParser.g:468:4: lv_value_0_0= End
            {
            lv_value_0_0=(Token)match(input,End,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getEndAccess().getValueEndKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEndRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, ".end");
            			

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
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleText"
    // InternalPds16asmParser.g:483:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalPds16asmParser.g:483:45: (iv_ruleText= ruleText EOF )
            // InternalPds16asmParser.g:484:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalPds16asmParser.g:490:1: ruleText returns [EObject current=null] : ( (lv_value_0_0= Text ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:496:2: ( ( (lv_value_0_0= Text ) ) )
            // InternalPds16asmParser.g:497:2: ( (lv_value_0_0= Text ) )
            {
            // InternalPds16asmParser.g:497:2: ( (lv_value_0_0= Text ) )
            // InternalPds16asmParser.g:498:3: (lv_value_0_0= Text )
            {
            // InternalPds16asmParser.g:498:3: (lv_value_0_0= Text )
            // InternalPds16asmParser.g:499:4: lv_value_0_0= Text
            {
            lv_value_0_0=(Token)match(input,Text,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getTextAccess().getValueTextKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, ".text");
            			

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleAscii"
    // InternalPds16asmParser.g:514:1: entryRuleAscii returns [EObject current=null] : iv_ruleAscii= ruleAscii EOF ;
    public final EObject entryRuleAscii() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAscii = null;


        try {
            // InternalPds16asmParser.g:514:46: (iv_ruleAscii= ruleAscii EOF )
            // InternalPds16asmParser.g:515:2: iv_ruleAscii= ruleAscii EOF
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
    // InternalPds16asmParser.g:521:1: ruleAscii returns [EObject current=null] : ( ( (lv_tag_0_0= Ascii ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? ) ;
    public final EObject ruleAscii() throws RecognitionException {
        EObject current = null;

        Token lv_tag_0_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:527:2: ( ( ( (lv_tag_0_0= Ascii ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? ) )
            // InternalPds16asmParser.g:528:2: ( ( (lv_tag_0_0= Ascii ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? )
            {
            // InternalPds16asmParser.g:528:2: ( ( (lv_tag_0_0= Ascii ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? )
            // InternalPds16asmParser.g:529:3: ( (lv_tag_0_0= Ascii ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )?
            {
            // InternalPds16asmParser.g:529:3: ( (lv_tag_0_0= Ascii ) )
            // InternalPds16asmParser.g:530:4: (lv_tag_0_0= Ascii )
            {
            // InternalPds16asmParser.g:530:4: (lv_tag_0_0= Ascii )
            // InternalPds16asmParser.g:531:5: lv_tag_0_0= Ascii
            {
            lv_tag_0_0=(Token)match(input,Ascii,FOLLOW_5); 

            					newLeafNode(lv_tag_0_0, grammarAccess.getAsciiAccess().getTagAsciiKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsciiRule());
            					}
            					setWithLastConsumed(current, "tag", lv_tag_0_0, ".ascii");
            				

            }


            }

            // InternalPds16asmParser.g:543:3: ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPds16asmParser.g:544:4: ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )*
                    {
                    // InternalPds16asmParser.g:544:4: ( (lv_values_1_0= RULE_STRING ) )
                    // InternalPds16asmParser.g:545:5: (lv_values_1_0= RULE_STRING )
                    {
                    // InternalPds16asmParser.g:545:5: (lv_values_1_0= RULE_STRING )
                    // InternalPds16asmParser.g:546:6: lv_values_1_0= RULE_STRING
                    {
                    lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_values_1_0, grammarAccess.getAsciiAccess().getValuesSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAsciiRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_1_0,
                    							"org.pds16.pds16asm.Pds16asm.STRING");
                    					

                    }


                    }

                    // InternalPds16asmParser.g:562:4: (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPds16asmParser.g:563:5: otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAsciiAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPds16asmParser.g:567:5: ( (lv_values_3_0= RULE_STRING ) )
                    	    // InternalPds16asmParser.g:568:6: (lv_values_3_0= RULE_STRING )
                    	    {
                    	    // InternalPds16asmParser.g:568:6: (lv_values_3_0= RULE_STRING )
                    	    // InternalPds16asmParser.g:569:7: lv_values_3_0= RULE_STRING
                    	    {
                    	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    	    							newLeafNode(lv_values_3_0, grammarAccess.getAsciiAccess().getValuesSTRINGTerminalRuleCall_1_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAsciiRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"values",
                    	    								lv_values_3_0,
                    	    								"org.pds16.pds16asm.Pds16asm.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAscii"


    // $ANTLR start "entryRuleAsciiz"
    // InternalPds16asmParser.g:591:1: entryRuleAsciiz returns [EObject current=null] : iv_ruleAsciiz= ruleAsciiz EOF ;
    public final EObject entryRuleAsciiz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsciiz = null;


        try {
            // InternalPds16asmParser.g:591:47: (iv_ruleAsciiz= ruleAsciiz EOF )
            // InternalPds16asmParser.g:592:2: iv_ruleAsciiz= ruleAsciiz EOF
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
    // InternalPds16asmParser.g:598:1: ruleAsciiz returns [EObject current=null] : ( ( (lv_tag_0_0= Asciiz ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? ) ;
    public final EObject ruleAsciiz() throws RecognitionException {
        EObject current = null;

        Token lv_tag_0_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:604:2: ( ( ( (lv_tag_0_0= Asciiz ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? ) )
            // InternalPds16asmParser.g:605:2: ( ( (lv_tag_0_0= Asciiz ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? )
            {
            // InternalPds16asmParser.g:605:2: ( ( (lv_tag_0_0= Asciiz ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )? )
            // InternalPds16asmParser.g:606:3: ( (lv_tag_0_0= Asciiz ) ) ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )?
            {
            // InternalPds16asmParser.g:606:3: ( (lv_tag_0_0= Asciiz ) )
            // InternalPds16asmParser.g:607:4: (lv_tag_0_0= Asciiz )
            {
            // InternalPds16asmParser.g:607:4: (lv_tag_0_0= Asciiz )
            // InternalPds16asmParser.g:608:5: lv_tag_0_0= Asciiz
            {
            lv_tag_0_0=(Token)match(input,Asciiz,FOLLOW_5); 

            					newLeafNode(lv_tag_0_0, grammarAccess.getAsciizAccess().getTagAsciizKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsciizRule());
            					}
            					setWithLastConsumed(current, "tag", lv_tag_0_0, ".asciiz");
            				

            }


            }

            // InternalPds16asmParser.g:620:3: ( ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPds16asmParser.g:621:4: ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )*
                    {
                    // InternalPds16asmParser.g:621:4: ( (lv_values_1_0= RULE_STRING ) )
                    // InternalPds16asmParser.g:622:5: (lv_values_1_0= RULE_STRING )
                    {
                    // InternalPds16asmParser.g:622:5: (lv_values_1_0= RULE_STRING )
                    // InternalPds16asmParser.g:623:6: lv_values_1_0= RULE_STRING
                    {
                    lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_values_1_0, grammarAccess.getAsciizAccess().getValuesSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAsciizRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_1_0,
                    							"org.pds16.pds16asm.Pds16asm.STRING");
                    					

                    }


                    }

                    // InternalPds16asmParser.g:639:4: (otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPds16asmParser.g:640:5: otherlv_2= Comma ( (lv_values_3_0= RULE_STRING ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAsciizAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPds16asmParser.g:644:5: ( (lv_values_3_0= RULE_STRING ) )
                    	    // InternalPds16asmParser.g:645:6: (lv_values_3_0= RULE_STRING )
                    	    {
                    	    // InternalPds16asmParser.g:645:6: (lv_values_3_0= RULE_STRING )
                    	    // InternalPds16asmParser.g:646:7: lv_values_3_0= RULE_STRING
                    	    {
                    	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    	    							newLeafNode(lv_values_3_0, grammarAccess.getAsciizAccess().getValuesSTRINGTerminalRuleCall_1_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAsciizRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"values",
                    	    								lv_values_3_0,
                    	    								"org.pds16.pds16asm.Pds16asm.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAsciiz"


    // $ANTLR start "entryRuleByte"
    // InternalPds16asmParser.g:668:1: entryRuleByte returns [EObject current=null] : iv_ruleByte= ruleByte EOF ;
    public final EObject entryRuleByte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByte = null;


        try {
            // InternalPds16asmParser.g:668:45: (iv_ruleByte= ruleByte EOF )
            // InternalPds16asmParser.g:669:2: iv_ruleByte= ruleByte EOF
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
    // InternalPds16asmParser.g:675:1: ruleByte returns [EObject current=null] : ( ( (lv_tag_0_0= Byte ) ) ( ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) ) (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )* )? ) ;
    public final EObject ruleByte() throws RecognitionException {
        EObject current = null;

        Token lv_tag_0_0=null;
        Token lv_s_2_0=null;
        Token otherlv_3=null;
        Token lv_s_5_0=null;
        EObject lv_numbers_1_0 = null;

        EObject lv_numbers_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:681:2: ( ( ( (lv_tag_0_0= Byte ) ) ( ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) ) (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )* )? ) )
            // InternalPds16asmParser.g:682:2: ( ( (lv_tag_0_0= Byte ) ) ( ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) ) (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )* )? )
            {
            // InternalPds16asmParser.g:682:2: ( ( (lv_tag_0_0= Byte ) ) ( ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) ) (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )* )? )
            // InternalPds16asmParser.g:683:3: ( (lv_tag_0_0= Byte ) ) ( ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) ) (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )* )?
            {
            // InternalPds16asmParser.g:683:3: ( (lv_tag_0_0= Byte ) )
            // InternalPds16asmParser.g:684:4: (lv_tag_0_0= Byte )
            {
            // InternalPds16asmParser.g:684:4: (lv_tag_0_0= Byte )
            // InternalPds16asmParser.g:685:5: lv_tag_0_0= Byte
            {
            lv_tag_0_0=(Token)match(input,Byte,FOLLOW_8); 

            					newLeafNode(lv_tag_0_0, grammarAccess.getByteAccess().getTagByteKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getByteRule());
            					}
            					setWithLastConsumed(current, "tag", lv_tag_0_0, ".byte");
            				

            }


            }

            // InternalPds16asmParser.g:697:3: ( ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) ) (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_HEX && LA13_0<=RULE_BIN)||LA13_0==RULE_CHAR||(LA13_0>=RULE_INT && LA13_0<=RULE_STRING)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPds16asmParser.g:698:4: ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) ) (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )*
                    {
                    // InternalPds16asmParser.g:698:4: ( ( (lv_numbers_1_0= ruleNumber ) ) | ( (lv_s_2_0= RULE_STRING ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=RULE_HEX && LA10_0<=RULE_BIN)||LA10_0==RULE_CHAR||LA10_0==RULE_INT) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_STRING) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPds16asmParser.g:699:5: ( (lv_numbers_1_0= ruleNumber ) )
                            {
                            // InternalPds16asmParser.g:699:5: ( (lv_numbers_1_0= ruleNumber ) )
                            // InternalPds16asmParser.g:700:6: (lv_numbers_1_0= ruleNumber )
                            {
                            // InternalPds16asmParser.g:700:6: (lv_numbers_1_0= ruleNumber )
                            // InternalPds16asmParser.g:701:7: lv_numbers_1_0= ruleNumber
                            {

                            							newCompositeNode(grammarAccess.getByteAccess().getNumbersNumberParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_numbers_1_0=ruleNumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getByteRule());
                            							}
                            							add(
                            								current,
                            								"numbers",
                            								lv_numbers_1_0,
                            								"org.pds16.pds16asm.Pds16asm.Number");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:719:5: ( (lv_s_2_0= RULE_STRING ) )
                            {
                            // InternalPds16asmParser.g:719:5: ( (lv_s_2_0= RULE_STRING ) )
                            // InternalPds16asmParser.g:720:6: (lv_s_2_0= RULE_STRING )
                            {
                            // InternalPds16asmParser.g:720:6: (lv_s_2_0= RULE_STRING )
                            // InternalPds16asmParser.g:721:7: lv_s_2_0= RULE_STRING
                            {
                            lv_s_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                            							newLeafNode(lv_s_2_0, grammarAccess.getByteAccess().getSSTRINGTerminalRuleCall_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getByteRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"s",
                            								lv_s_2_0,
                            								"org.pds16.pds16asm.Pds16asm.STRING");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPds16asmParser.g:738:4: (otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPds16asmParser.g:739:5: otherlv_3= Comma ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getByteAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPds16asmParser.g:743:5: ( ( (lv_numbers_4_0= ruleNumber ) ) | ( (lv_s_5_0= RULE_STRING ) ) )
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( ((LA11_0>=RULE_HEX && LA11_0<=RULE_BIN)||LA11_0==RULE_CHAR||LA11_0==RULE_INT) ) {
                    	        alt11=1;
                    	    }
                    	    else if ( (LA11_0==RULE_STRING) ) {
                    	        alt11=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 11, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // InternalPds16asmParser.g:744:6: ( (lv_numbers_4_0= ruleNumber ) )
                    	            {
                    	            // InternalPds16asmParser.g:744:6: ( (lv_numbers_4_0= ruleNumber ) )
                    	            // InternalPds16asmParser.g:745:7: (lv_numbers_4_0= ruleNumber )
                    	            {
                    	            // InternalPds16asmParser.g:745:7: (lv_numbers_4_0= ruleNumber )
                    	            // InternalPds16asmParser.g:746:8: lv_numbers_4_0= ruleNumber
                    	            {

                    	            								newCompositeNode(grammarAccess.getByteAccess().getNumbersNumberParserRuleCall_1_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_6);
                    	            lv_numbers_4_0=ruleNumber();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getByteRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"numbers",
                    	            									lv_numbers_4_0,
                    	            									"org.pds16.pds16asm.Pds16asm.Number");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPds16asmParser.g:764:6: ( (lv_s_5_0= RULE_STRING ) )
                    	            {
                    	            // InternalPds16asmParser.g:764:6: ( (lv_s_5_0= RULE_STRING ) )
                    	            // InternalPds16asmParser.g:765:7: (lv_s_5_0= RULE_STRING )
                    	            {
                    	            // InternalPds16asmParser.g:765:7: (lv_s_5_0= RULE_STRING )
                    	            // InternalPds16asmParser.g:766:8: lv_s_5_0= RULE_STRING
                    	            {
                    	            lv_s_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    	            								newLeafNode(lv_s_5_0, grammarAccess.getByteAccess().getSSTRINGTerminalRuleCall_1_1_1_1_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getByteRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"s",
                    	            									lv_s_5_0,
                    	            									"org.pds16.pds16asm.Pds16asm.STRING");
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


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
    // $ANTLR end "ruleByte"


    // $ANTLR start "entryRuleWord"
    // InternalPds16asmParser.g:789:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalPds16asmParser.g:789:45: (iv_ruleWord= ruleWord EOF )
            // InternalPds16asmParser.g:790:2: iv_ruleWord= ruleWord EOF
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
    // InternalPds16asmParser.g:796:1: ruleWord returns [EObject current=null] : ( ( (lv_tag_0_0= Word ) ) ( ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) ) (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )* )? ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_tag_0_0=null;
        Token lv_values_1_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        EObject lv_numbers_2_0 = null;

        EObject lv_numbers_5_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:802:2: ( ( ( (lv_tag_0_0= Word ) ) ( ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) ) (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )* )? ) )
            // InternalPds16asmParser.g:803:2: ( ( (lv_tag_0_0= Word ) ) ( ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) ) (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )* )? )
            {
            // InternalPds16asmParser.g:803:2: ( ( (lv_tag_0_0= Word ) ) ( ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) ) (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )* )? )
            // InternalPds16asmParser.g:804:3: ( (lv_tag_0_0= Word ) ) ( ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) ) (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )* )?
            {
            // InternalPds16asmParser.g:804:3: ( (lv_tag_0_0= Word ) )
            // InternalPds16asmParser.g:805:4: (lv_tag_0_0= Word )
            {
            // InternalPds16asmParser.g:805:4: (lv_tag_0_0= Word )
            // InternalPds16asmParser.g:806:5: lv_tag_0_0= Word
            {
            lv_tag_0_0=(Token)match(input,Word,FOLLOW_10); 

            					newLeafNode(lv_tag_0_0, grammarAccess.getWordAccess().getTagWordKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWordRule());
            					}
            					setWithLastConsumed(current, "tag", lv_tag_0_0, ".word");
            				

            }


            }

            // InternalPds16asmParser.g:818:3: ( ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) ) (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_HEX && LA17_0<=RULE_BIN)||(LA17_0>=RULE_CHAR && LA17_0<=RULE_ID)||LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPds16asmParser.g:819:4: ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) ) (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )*
                    {
                    // InternalPds16asmParser.g:819:4: ( ( (lv_values_1_0= RULE_ID ) ) | ( (lv_numbers_2_0= ruleNumber ) ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        alt14=1;
                    }
                    else if ( ((LA14_0>=RULE_HEX && LA14_0<=RULE_BIN)||LA14_0==RULE_CHAR||LA14_0==RULE_INT) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPds16asmParser.g:820:5: ( (lv_values_1_0= RULE_ID ) )
                            {
                            // InternalPds16asmParser.g:820:5: ( (lv_values_1_0= RULE_ID ) )
                            // InternalPds16asmParser.g:821:6: (lv_values_1_0= RULE_ID )
                            {
                            // InternalPds16asmParser.g:821:6: (lv_values_1_0= RULE_ID )
                            // InternalPds16asmParser.g:822:7: lv_values_1_0= RULE_ID
                            {
                            lv_values_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                            							newLeafNode(lv_values_1_0, grammarAccess.getWordAccess().getValuesIDTerminalRuleCall_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getWordRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"values",
                            								lv_values_1_0,
                            								"org.pds16.pds16asm.Pds16asm.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:839:5: ( (lv_numbers_2_0= ruleNumber ) )
                            {
                            // InternalPds16asmParser.g:839:5: ( (lv_numbers_2_0= ruleNumber ) )
                            // InternalPds16asmParser.g:840:6: (lv_numbers_2_0= ruleNumber )
                            {
                            // InternalPds16asmParser.g:840:6: (lv_numbers_2_0= ruleNumber )
                            // InternalPds16asmParser.g:841:7: lv_numbers_2_0= ruleNumber
                            {

                            							newCompositeNode(grammarAccess.getWordAccess().getNumbersNumberParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_numbers_2_0=ruleNumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getWordRule());
                            							}
                            							add(
                            								current,
                            								"numbers",
                            								lv_numbers_2_0,
                            								"org.pds16.pds16asm.Pds16asm.Number");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPds16asmParser.g:859:4: (otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPds16asmParser.g:860:5: otherlv_3= Comma ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getWordAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPds16asmParser.g:864:5: ( ( (lv_values_4_0= RULE_ID ) ) | ( (lv_numbers_5_0= ruleNumber ) ) )
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==RULE_ID) ) {
                    	        alt15=1;
                    	    }
                    	    else if ( ((LA15_0>=RULE_HEX && LA15_0<=RULE_BIN)||LA15_0==RULE_CHAR||LA15_0==RULE_INT) ) {
                    	        alt15=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalPds16asmParser.g:865:6: ( (lv_values_4_0= RULE_ID ) )
                    	            {
                    	            // InternalPds16asmParser.g:865:6: ( (lv_values_4_0= RULE_ID ) )
                    	            // InternalPds16asmParser.g:866:7: (lv_values_4_0= RULE_ID )
                    	            {
                    	            // InternalPds16asmParser.g:866:7: (lv_values_4_0= RULE_ID )
                    	            // InternalPds16asmParser.g:867:8: lv_values_4_0= RULE_ID
                    	            {
                    	            lv_values_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	            								newLeafNode(lv_values_4_0, grammarAccess.getWordAccess().getValuesIDTerminalRuleCall_1_1_1_0_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getWordRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"values",
                    	            									lv_values_4_0,
                    	            									"org.pds16.pds16asm.Pds16asm.ID");
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPds16asmParser.g:884:6: ( (lv_numbers_5_0= ruleNumber ) )
                    	            {
                    	            // InternalPds16asmParser.g:884:6: ( (lv_numbers_5_0= ruleNumber ) )
                    	            // InternalPds16asmParser.g:885:7: (lv_numbers_5_0= ruleNumber )
                    	            {
                    	            // InternalPds16asmParser.g:885:7: (lv_numbers_5_0= ruleNumber )
                    	            // InternalPds16asmParser.g:886:8: lv_numbers_5_0= ruleNumber
                    	            {

                    	            								newCompositeNode(grammarAccess.getWordAccess().getNumbersNumberParserRuleCall_1_1_1_1_0());
                    	            							
                    	            pushFollow(FOLLOW_6);
                    	            lv_numbers_5_0=ruleNumber();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getWordRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"numbers",
                    	            									lv_numbers_5_0,
                    	            									"org.pds16.pds16asm.Pds16asm.Number");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleSpace"
    // InternalPds16asmParser.g:910:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalPds16asmParser.g:910:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalPds16asmParser.g:911:2: iv_ruleSpace= ruleSpace EOF
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
    // InternalPds16asmParser.g:917:1: ruleSpace returns [EObject current=null] : (otherlv_0= Space ( (lv_size_1_0= ruleNumber ) ) (otherlv_2= Comma ( (lv_byteValue_3_0= ruleNumber ) ) )? ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_size_1_0 = null;

        EObject lv_byteValue_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:923:2: ( (otherlv_0= Space ( (lv_size_1_0= ruleNumber ) ) (otherlv_2= Comma ( (lv_byteValue_3_0= ruleNumber ) ) )? ) )
            // InternalPds16asmParser.g:924:2: (otherlv_0= Space ( (lv_size_1_0= ruleNumber ) ) (otherlv_2= Comma ( (lv_byteValue_3_0= ruleNumber ) ) )? )
            {
            // InternalPds16asmParser.g:924:2: (otherlv_0= Space ( (lv_size_1_0= ruleNumber ) ) (otherlv_2= Comma ( (lv_byteValue_3_0= ruleNumber ) ) )? )
            // InternalPds16asmParser.g:925:3: otherlv_0= Space ( (lv_size_1_0= ruleNumber ) ) (otherlv_2= Comma ( (lv_byteValue_3_0= ruleNumber ) ) )?
            {
            otherlv_0=(Token)match(input,Space,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSpaceAccess().getSpaceKeyword_0());
            		
            // InternalPds16asmParser.g:929:3: ( (lv_size_1_0= ruleNumber ) )
            // InternalPds16asmParser.g:930:4: (lv_size_1_0= ruleNumber )
            {
            // InternalPds16asmParser.g:930:4: (lv_size_1_0= ruleNumber )
            // InternalPds16asmParser.g:931:5: lv_size_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getSpaceAccess().getSizeNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_size_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpaceRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_1_0,
            						"org.pds16.pds16asm.Pds16asm.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPds16asmParser.g:948:3: (otherlv_2= Comma ( (lv_byteValue_3_0= ruleNumber ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Comma) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPds16asmParser.g:949:4: otherlv_2= Comma ( (lv_byteValue_3_0= ruleNumber ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getSpaceAccess().getCommaKeyword_2_0());
                    			
                    // InternalPds16asmParser.g:953:4: ( (lv_byteValue_3_0= ruleNumber ) )
                    // InternalPds16asmParser.g:954:5: (lv_byteValue_3_0= ruleNumber )
                    {
                    // InternalPds16asmParser.g:954:5: (lv_byteValue_3_0= ruleNumber )
                    // InternalPds16asmParser.g:955:6: lv_byteValue_3_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getSpaceAccess().getByteValueNumberParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_byteValue_3_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpaceRule());
                    						}
                    						set(
                    							current,
                    							"byteValue",
                    							lv_byteValue_3_0,
                    							"org.pds16.pds16asm.Pds16asm.Number");
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
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleSet"
    // InternalPds16asmParser.g:977:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalPds16asmParser.g:977:44: (iv_ruleSet= ruleSet EOF )
            // InternalPds16asmParser.g:978:2: iv_ruleSet= ruleSet EOF
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
    // InternalPds16asmParser.g:984:1: ruleSet returns [EObject current=null] : (otherlv_0= Set ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= Comma ( (lv_value2_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value1_1_0=null;
        Token otherlv_2=null;
        EObject lv_value2_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:990:2: ( (otherlv_0= Set ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= Comma ( (lv_value2_3_0= ruleExpression ) ) ) )
            // InternalPds16asmParser.g:991:2: (otherlv_0= Set ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= Comma ( (lv_value2_3_0= ruleExpression ) ) )
            {
            // InternalPds16asmParser.g:991:2: (otherlv_0= Set ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= Comma ( (lv_value2_3_0= ruleExpression ) ) )
            // InternalPds16asmParser.g:992:3: otherlv_0= Set ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= Comma ( (lv_value2_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Set,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSetKeyword_0());
            		
            // InternalPds16asmParser.g:996:3: ( (lv_value1_1_0= RULE_ID ) )
            // InternalPds16asmParser.g:997:4: (lv_value1_1_0= RULE_ID )
            {
            // InternalPds16asmParser.g:997:4: (lv_value1_1_0= RULE_ID )
            // InternalPds16asmParser.g:998:5: lv_value1_1_0= RULE_ID
            {
            lv_value1_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,Comma,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSetAccess().getCommaKeyword_2());
            		
            // InternalPds16asmParser.g:1018:3: ( (lv_value2_3_0= ruleExpression ) )
            // InternalPds16asmParser.g:1019:4: (lv_value2_3_0= ruleExpression )
            {
            // InternalPds16asmParser.g:1019:4: (lv_value2_3_0= ruleExpression )
            // InternalPds16asmParser.g:1020:5: lv_value2_3_0= ruleExpression
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
    // InternalPds16asmParser.g:1041:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalPds16asmParser.g:1041:48: (iv_ruleSection= ruleSection EOF )
            // InternalPds16asmParser.g:1042:2: iv_ruleSection= ruleSection EOF
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
    // InternalPds16asmParser.g:1048:1: ruleSection returns [EObject current=null] : (otherlv_0= Section ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:1054:2: ( (otherlv_0= Section ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalPds16asmParser.g:1055:2: (otherlv_0= Section ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalPds16asmParser.g:1055:2: (otherlv_0= Section ( (lv_value_1_0= RULE_ID ) ) )
            // InternalPds16asmParser.g:1056:3: otherlv_0= Section ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Section,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalPds16asmParser.g:1060:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalPds16asmParser.g:1061:4: (lv_value_1_0= RULE_ID )
            {
            // InternalPds16asmParser.g:1061:4: (lv_value_1_0= RULE_ID )
            // InternalPds16asmParser.g:1062:5: lv_value_1_0= RULE_ID
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
    // InternalPds16asmParser.g:1082:1: entryRuleOrg returns [EObject current=null] : iv_ruleOrg= ruleOrg EOF ;
    public final EObject entryRuleOrg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrg = null;


        try {
            // InternalPds16asmParser.g:1082:44: (iv_ruleOrg= ruleOrg EOF )
            // InternalPds16asmParser.g:1083:2: iv_ruleOrg= ruleOrg EOF
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
    // InternalPds16asmParser.g:1089:1: ruleOrg returns [EObject current=null] : (otherlv_0= Org this_Expression_1= ruleExpression ) ;
    public final EObject ruleOrg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1095:2: ( (otherlv_0= Org this_Expression_1= ruleExpression ) )
            // InternalPds16asmParser.g:1096:2: (otherlv_0= Org this_Expression_1= ruleExpression )
            {
            // InternalPds16asmParser.g:1096:2: (otherlv_0= Org this_Expression_1= ruleExpression )
            // InternalPds16asmParser.g:1097:3: otherlv_0= Org this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,Org,FOLLOW_11); 

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
    // InternalPds16asmParser.g:1113:1: entryRuleEqu returns [EObject current=null] : iv_ruleEqu= ruleEqu EOF ;
    public final EObject entryRuleEqu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqu = null;


        try {
            // InternalPds16asmParser.g:1113:44: (iv_ruleEqu= ruleEqu EOF )
            // InternalPds16asmParser.g:1114:2: iv_ruleEqu= ruleEqu EOF
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
    // InternalPds16asmParser.g:1120:1: ruleEqu returns [EObject current=null] : (otherlv_0= Equ this_ID_1= RULE_ID otherlv_2= Comma this_Expression_3= ruleExpression ) ;
    public final EObject ruleEqu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1126:2: ( (otherlv_0= Equ this_ID_1= RULE_ID otherlv_2= Comma this_Expression_3= ruleExpression ) )
            // InternalPds16asmParser.g:1127:2: (otherlv_0= Equ this_ID_1= RULE_ID otherlv_2= Comma this_Expression_3= ruleExpression )
            {
            // InternalPds16asmParser.g:1127:2: (otherlv_0= Equ this_ID_1= RULE_ID otherlv_2= Comma this_Expression_3= ruleExpression )
            // InternalPds16asmParser.g:1128:3: otherlv_0= Equ this_ID_1= RULE_ID otherlv_2= Comma this_Expression_3= ruleExpression
            {
            otherlv_0=(Token)match(input,Equ,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEquAccess().getEquKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            			newLeafNode(this_ID_1, grammarAccess.getEquAccess().getIDTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Comma,FOLLOW_11); 

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
    // InternalPds16asmParser.g:1152:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalPds16asmParser.g:1152:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalPds16asmParser.g:1153:2: iv_ruleInstructions= ruleInstructions EOF
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
    // InternalPds16asmParser.g:1159:1: ruleInstructions returns [EObject current=null] : (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet ) ;
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
            // InternalPds16asmParser.g:1165:2: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet ) )
            // InternalPds16asmParser.g:1166:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet )
            {
            // InternalPds16asmParser.g:1166:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Nop_5= ruleNop | this_Ret_6= ruleRet )
            int alt19=7;
            switch ( input.LA(1) ) {
            case Ldih:
            case Ldb:
            case Ldi:
            case Ld:
                {
                alt19=1;
                }
                break;
            case Stb:
            case St:
                {
                alt19=2;
                }
                break;
            case Adcf:
            case Addf:
            case Decf:
            case Incf:
            case Sbbf:
            case Subf:
            case Subr:
            case Adc:
            case Add:
            case Dec:
            case Inc:
            case Sbb:
            case Sub:
                {
                alt19=3;
                }
                break;
            case Anlf:
            case Movf:
            case Notf:
            case Orlf:
            case Xrlf:
            case Anl:
            case Mov:
            case Not:
            case Orl:
            case Rcl:
            case Rcr:
            case Rrl:
            case Rrm:
            case Shl:
            case Shr:
            case Xrl:
                {
                alt19=4;
                }
                break;
            case Jmpl:
            case Jae:
            case Jbl:
            case Jmp:
            case Jnc:
            case Jne:
            case Jnz:
            case Jc:
            case Je:
            case Jz:
                {
                alt19=5;
                }
                break;
            case Nop:
                {
                alt19=6;
                }
                break;
            case Iret:
            case Ret:
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
                    // InternalPds16asmParser.g:1167:3: this_Load_0= ruleLoad
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
                    // InternalPds16asmParser.g:1176:3: this_Store_1= ruleStore
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
                    // InternalPds16asmParser.g:1185:3: this_Aritmetica_2= ruleAritmetica
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
                    // InternalPds16asmParser.g:1194:3: this_Logica_3= ruleLogica
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
                    // InternalPds16asmParser.g:1203:3: this_Jump_4= ruleJump
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
                    // InternalPds16asmParser.g:1212:3: this_Nop_5= ruleNop
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
                    // InternalPds16asmParser.g:1221:3: this_Ret_6= ruleRet
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
    // InternalPds16asmParser.g:1233:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalPds16asmParser.g:1233:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalPds16asmParser.g:1234:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalPds16asmParser.g:1240:1: ruleLoad returns [EObject current=null] : (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        EObject this_LdImmediate_0 = null;

        EObject this_LdDirect_1 = null;

        EObject this_LdIndexed_2 = null;

        EObject this_LdBasedIndexed_3 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1246:2: ( (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) )
            // InternalPds16asmParser.g:1247:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            {
            // InternalPds16asmParser.g:1247:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalPds16asmParser.g:1248:3: this_LdImmediate_0= ruleLdImmediate
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
                    // InternalPds16asmParser.g:1257:3: this_LdDirect_1= ruleLdDirect
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
                    // InternalPds16asmParser.g:1266:3: this_LdIndexed_2= ruleLdIndexed
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
                    // InternalPds16asmParser.g:1275:3: this_LdBasedIndexed_3= ruleLdBasedIndexed
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
    // InternalPds16asmParser.g:1287:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalPds16asmParser.g:1287:46: (iv_ruleStore= ruleStore EOF )
            // InternalPds16asmParser.g:1288:2: iv_ruleStore= ruleStore EOF
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
    // InternalPds16asmParser.g:1294:1: ruleStore returns [EObject current=null] : (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        EObject this_StDirect_0 = null;

        EObject this_StIndexed_1 = null;

        EObject this_StBasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1300:2: ( (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) )
            // InternalPds16asmParser.g:1301:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            {
            // InternalPds16asmParser.g:1301:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalPds16asmParser.g:1302:3: this_StDirect_0= ruleStDirect
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
                    // InternalPds16asmParser.g:1311:3: this_StIndexed_1= ruleStIndexed
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
                    // InternalPds16asmParser.g:1320:3: this_StBasedIndexed_2= ruleStBasedIndexed
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
    // InternalPds16asmParser.g:1332:1: entryRuleAritmetica returns [EObject current=null] : iv_ruleAritmetica= ruleAritmetica EOF ;
    public final EObject entryRuleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAritmetica = null;


        try {
            // InternalPds16asmParser.g:1332:51: (iv_ruleAritmetica= ruleAritmetica EOF )
            // InternalPds16asmParser.g:1333:2: iv_ruleAritmetica= ruleAritmetica EOF
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
    // InternalPds16asmParser.g:1339:1: ruleAritmetica returns [EObject current=null] : (this_Add_0= ruleAdd | this_Sub_1= ruleSub ) ;
    public final EObject ruleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Sub_1 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1345:2: ( (this_Add_0= ruleAdd | this_Sub_1= ruleSub ) )
            // InternalPds16asmParser.g:1346:2: (this_Add_0= ruleAdd | this_Sub_1= ruleSub )
            {
            // InternalPds16asmParser.g:1346:2: (this_Add_0= ruleAdd | this_Sub_1= ruleSub )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=Adcf && LA22_0<=Addf)||LA22_0==Incf||(LA22_0>=Adc && LA22_0<=Add)||LA22_0==Inc) ) {
                alt22=1;
            }
            else if ( (LA22_0==Decf||(LA22_0>=Sbbf && LA22_0<=Subr)||LA22_0==Dec||LA22_0==Sbb||LA22_0==Sub) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPds16asmParser.g:1347:3: this_Add_0= ruleAdd
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
                    // InternalPds16asmParser.g:1356:3: this_Sub_1= ruleSub
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
    // InternalPds16asmParser.g:1368:1: entryRuleLogica returns [EObject current=null] : iv_ruleLogica= ruleLogica EOF ;
    public final EObject entryRuleLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogica = null;


        try {
            // InternalPds16asmParser.g:1368:47: (iv_ruleLogica= ruleLogica EOF )
            // InternalPds16asmParser.g:1369:2: iv_ruleLogica= ruleLogica EOF
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
    // InternalPds16asmParser.g:1375:1: ruleLogica returns [EObject current=null] : (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc ) ;
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
            // InternalPds16asmParser.g:1381:2: ( (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc ) )
            // InternalPds16asmParser.g:1382:2: (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc )
            {
            // InternalPds16asmParser.g:1382:2: (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc )
            int alt23=8;
            switch ( input.LA(1) ) {
            case Anlf:
            case Anl:
                {
                alt23=1;
                }
                break;
            case Movf:
            case Orlf:
            case Mov:
            case Orl:
                {
                alt23=2;
                }
                break;
            case Xrlf:
            case Xrl:
                {
                alt23=3;
                }
                break;
            case Notf:
            case Not:
                {
                alt23=4;
                }
                break;
            case Shl:
                {
                alt23=5;
                }
                break;
            case Shr:
                {
                alt23=6;
                }
                break;
            case Rrl:
            case Rrm:
                {
                alt23=7;
                }
                break;
            case Rcl:
            case Rcr:
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
                    // InternalPds16asmParser.g:1383:3: this_Anl_0= ruleAnl
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
                    // InternalPds16asmParser.g:1392:3: this_Orl_1= ruleOrl
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
                    // InternalPds16asmParser.g:1401:3: this_Xrl_2= ruleXrl
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
                    // InternalPds16asmParser.g:1410:3: this_Not_3= ruleNot
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
                    // InternalPds16asmParser.g:1419:3: this_Shl_4= ruleShl
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
                    // InternalPds16asmParser.g:1428:3: this_Shr_5= ruleShr
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
                    // InternalPds16asmParser.g:1437:3: this_Rr_6= ruleRr
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
                    // InternalPds16asmParser.g:1446:3: this_Rc_7= ruleRc
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
    // InternalPds16asmParser.g:1458:1: entryRuleJump returns [EObject current=null] : iv_ruleJump= ruleJump EOF ;
    public final EObject entryRuleJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJump = null;


        try {
            // InternalPds16asmParser.g:1458:45: (iv_ruleJump= ruleJump EOF )
            // InternalPds16asmParser.g:1459:2: iv_ruleJump= ruleJump EOF
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
    // InternalPds16asmParser.g:1465:1: ruleJump returns [EObject current=null] : this_JumpOp_0= ruleJumpOp ;
    public final EObject ruleJump() throws RecognitionException {
        EObject current = null;

        EObject this_JumpOp_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1471:2: (this_JumpOp_0= ruleJumpOp )
            // InternalPds16asmParser.g:1472:2: this_JumpOp_0= ruleJumpOp
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
    // InternalPds16asmParser.g:1483:1: entryRuleLdImmediate returns [EObject current=null] : iv_ruleLdImmediate= ruleLdImmediate EOF ;
    public final EObject entryRuleLdImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdImmediate = null;


        try {
            // InternalPds16asmParser.g:1483:52: (iv_ruleLdImmediate= ruleLdImmediate EOF )
            // InternalPds16asmParser.g:1484:2: iv_ruleLdImmediate= ruleLdImmediate EOF
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
    // InternalPds16asmParser.g:1490:1: ruleLdImmediate returns [EObject current=null] : ( (otherlv_0= Ldi | otherlv_1= Ldih ) this_Immediate_2= ruleImmediate ) ;
    public final EObject ruleLdImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Immediate_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1496:2: ( ( (otherlv_0= Ldi | otherlv_1= Ldih ) this_Immediate_2= ruleImmediate ) )
            // InternalPds16asmParser.g:1497:2: ( (otherlv_0= Ldi | otherlv_1= Ldih ) this_Immediate_2= ruleImmediate )
            {
            // InternalPds16asmParser.g:1497:2: ( (otherlv_0= Ldi | otherlv_1= Ldih ) this_Immediate_2= ruleImmediate )
            // InternalPds16asmParser.g:1498:3: (otherlv_0= Ldi | otherlv_1= Ldih ) this_Immediate_2= ruleImmediate
            {
            // InternalPds16asmParser.g:1498:3: (otherlv_0= Ldi | otherlv_1= Ldih )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Ldi) ) {
                alt24=1;
            }
            else if ( (LA24_0==Ldih) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPds16asmParser.g:1499:4: otherlv_0= Ldi
                    {
                    otherlv_0=(Token)match(input,Ldi,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdImmediateAccess().getLdiKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1504:4: otherlv_1= Ldih
                    {
                    otherlv_1=(Token)match(input,Ldih,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1521:1: entryRuleLdDirect returns [EObject current=null] : iv_ruleLdDirect= ruleLdDirect EOF ;
    public final EObject entryRuleLdDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdDirect = null;


        try {
            // InternalPds16asmParser.g:1521:49: (iv_ruleLdDirect= ruleLdDirect EOF )
            // InternalPds16asmParser.g:1522:2: iv_ruleLdDirect= ruleLdDirect EOF
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
    // InternalPds16asmParser.g:1528:1: ruleLdDirect returns [EObject current=null] : ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleLdDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1534:2: ( ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Direct_2= ruleDirect ) )
            // InternalPds16asmParser.g:1535:2: ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asmParser.g:1535:2: ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Direct_2= ruleDirect )
            // InternalPds16asmParser.g:1536:3: (otherlv_0= Ld | otherlv_1= Ldb ) this_Direct_2= ruleDirect
            {
            // InternalPds16asmParser.g:1536:3: (otherlv_0= Ld | otherlv_1= Ldb )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Ld) ) {
                alt25=1;
            }
            else if ( (LA25_0==Ldb) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPds16asmParser.g:1537:4: otherlv_0= Ld
                    {
                    otherlv_0=(Token)match(input,Ld,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdDirectAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1542:4: otherlv_1= Ldb
                    {
                    otherlv_1=(Token)match(input,Ldb,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1559:1: entryRuleLdIndexed returns [EObject current=null] : iv_ruleLdIndexed= ruleLdIndexed EOF ;
    public final EObject entryRuleLdIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdIndexed = null;


        try {
            // InternalPds16asmParser.g:1559:50: (iv_ruleLdIndexed= ruleLdIndexed EOF )
            // InternalPds16asmParser.g:1560:2: iv_ruleLdIndexed= ruleLdIndexed EOF
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
    // InternalPds16asmParser.g:1566:1: ruleLdIndexed returns [EObject current=null] : ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleLdIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1572:2: ( ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asmParser.g:1573:2: ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asmParser.g:1573:2: ( (otherlv_0= Ld | otherlv_1= Ldb ) this_Indexed_2= ruleIndexed )
            // InternalPds16asmParser.g:1574:3: (otherlv_0= Ld | otherlv_1= Ldb ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asmParser.g:1574:3: (otherlv_0= Ld | otherlv_1= Ldb )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Ld) ) {
                alt26=1;
            }
            else if ( (LA26_0==Ldb) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPds16asmParser.g:1575:4: otherlv_0= Ld
                    {
                    otherlv_0=(Token)match(input,Ld,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1580:4: otherlv_1= Ldb
                    {
                    otherlv_1=(Token)match(input,Ldb,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1597:1: entryRuleLdBasedIndexed returns [EObject current=null] : iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF ;
    public final EObject entryRuleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdBasedIndexed = null;


        try {
            // InternalPds16asmParser.g:1597:55: (iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF )
            // InternalPds16asmParser.g:1598:2: iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF
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
    // InternalPds16asmParser.g:1604:1: ruleLdBasedIndexed returns [EObject current=null] : ( (otherlv_0= Ld | otherlv_1= Ldb ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1610:2: ( ( (otherlv_0= Ld | otherlv_1= Ldb ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asmParser.g:1611:2: ( (otherlv_0= Ld | otherlv_1= Ldb ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asmParser.g:1611:2: ( (otherlv_0= Ld | otherlv_1= Ldb ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asmParser.g:1612:3: (otherlv_0= Ld | otherlv_1= Ldb ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asmParser.g:1612:3: (otherlv_0= Ld | otherlv_1= Ldb )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Ld) ) {
                alt27=1;
            }
            else if ( (LA27_0==Ldb) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPds16asmParser.g:1613:4: otherlv_0= Ld
                    {
                    otherlv_0=(Token)match(input,Ld,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdBasedIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1618:4: otherlv_1= Ldb
                    {
                    otherlv_1=(Token)match(input,Ldb,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1635:1: entryRuleStDirect returns [EObject current=null] : iv_ruleStDirect= ruleStDirect EOF ;
    public final EObject entryRuleStDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStDirect = null;


        try {
            // InternalPds16asmParser.g:1635:49: (iv_ruleStDirect= ruleStDirect EOF )
            // InternalPds16asmParser.g:1636:2: iv_ruleStDirect= ruleStDirect EOF
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
    // InternalPds16asmParser.g:1642:1: ruleStDirect returns [EObject current=null] : ( (otherlv_0= St | otherlv_1= Stb ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleStDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1648:2: ( ( (otherlv_0= St | otherlv_1= Stb ) this_Direct_2= ruleDirect ) )
            // InternalPds16asmParser.g:1649:2: ( (otherlv_0= St | otherlv_1= Stb ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asmParser.g:1649:2: ( (otherlv_0= St | otherlv_1= Stb ) this_Direct_2= ruleDirect )
            // InternalPds16asmParser.g:1650:3: (otherlv_0= St | otherlv_1= Stb ) this_Direct_2= ruleDirect
            {
            // InternalPds16asmParser.g:1650:3: (otherlv_0= St | otherlv_1= Stb )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==St) ) {
                alt28=1;
            }
            else if ( (LA28_0==Stb) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPds16asmParser.g:1651:4: otherlv_0= St
                    {
                    otherlv_0=(Token)match(input,St,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getStDirectAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1656:4: otherlv_1= Stb
                    {
                    otherlv_1=(Token)match(input,Stb,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1673:1: entryRuleStIndexed returns [EObject current=null] : iv_ruleStIndexed= ruleStIndexed EOF ;
    public final EObject entryRuleStIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStIndexed = null;


        try {
            // InternalPds16asmParser.g:1673:50: (iv_ruleStIndexed= ruleStIndexed EOF )
            // InternalPds16asmParser.g:1674:2: iv_ruleStIndexed= ruleStIndexed EOF
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
    // InternalPds16asmParser.g:1680:1: ruleStIndexed returns [EObject current=null] : ( (otherlv_0= St | otherlv_1= Stb ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleStIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1686:2: ( ( (otherlv_0= St | otherlv_1= Stb ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asmParser.g:1687:2: ( (otherlv_0= St | otherlv_1= Stb ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asmParser.g:1687:2: ( (otherlv_0= St | otherlv_1= Stb ) this_Indexed_2= ruleIndexed )
            // InternalPds16asmParser.g:1688:3: (otherlv_0= St | otherlv_1= Stb ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asmParser.g:1688:3: (otherlv_0= St | otherlv_1= Stb )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==St) ) {
                alt29=1;
            }
            else if ( (LA29_0==Stb) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPds16asmParser.g:1689:4: otherlv_0= St
                    {
                    otherlv_0=(Token)match(input,St,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getStIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1694:4: otherlv_1= Stb
                    {
                    otherlv_1=(Token)match(input,Stb,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1711:1: entryRuleStBasedIndexed returns [EObject current=null] : iv_ruleStBasedIndexed= ruleStBasedIndexed EOF ;
    public final EObject entryRuleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStBasedIndexed = null;


        try {
            // InternalPds16asmParser.g:1711:55: (iv_ruleStBasedIndexed= ruleStBasedIndexed EOF )
            // InternalPds16asmParser.g:1712:2: iv_ruleStBasedIndexed= ruleStBasedIndexed EOF
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
    // InternalPds16asmParser.g:1718:1: ruleStBasedIndexed returns [EObject current=null] : ( (otherlv_0= St | otherlv_1= Stb ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1724:2: ( ( (otherlv_0= St | otherlv_1= Stb ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asmParser.g:1725:2: ( (otherlv_0= St | otherlv_1= Stb ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asmParser.g:1725:2: ( (otherlv_0= St | otherlv_1= Stb ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asmParser.g:1726:3: (otherlv_0= St | otherlv_1= Stb ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asmParser.g:1726:3: (otherlv_0= St | otherlv_1= Stb )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==St) ) {
                alt30=1;
            }
            else if ( (LA30_0==Stb) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPds16asmParser.g:1727:4: otherlv_0= St
                    {
                    otherlv_0=(Token)match(input,St,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getStBasedIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1732:4: otherlv_1= Stb
                    {
                    otherlv_1=(Token)match(input,Stb,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1749:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalPds16asmParser.g:1749:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalPds16asmParser.g:1750:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalPds16asmParser.g:1756:1: ruleAdd returns [EObject current=null] : ( ( (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= Inc | otherlv_7= Incf ) this_REGISTERS_8= RULE_REGISTERS ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_REGISTERS_8=null;
        EObject this_OperationsWithConstant_4 = null;

        EObject this_OperationsWithTreeRegisters_5 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1762:2: ( ( ( (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= Inc | otherlv_7= Incf ) this_REGISTERS_8= RULE_REGISTERS ) ) )
            // InternalPds16asmParser.g:1763:2: ( ( (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= Inc | otherlv_7= Incf ) this_REGISTERS_8= RULE_REGISTERS ) )
            {
            // InternalPds16asmParser.g:1763:2: ( ( (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | ( (otherlv_6= Inc | otherlv_7= Incf ) this_REGISTERS_8= RULE_REGISTERS ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=Adcf && LA34_0<=Addf)||(LA34_0>=Adc && LA34_0<=Add)) ) {
                alt34=1;
            }
            else if ( (LA34_0==Incf||LA34_0==Inc) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPds16asmParser.g:1764:3: ( (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    {
                    // InternalPds16asmParser.g:1764:3: ( (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    // InternalPds16asmParser.g:1765:4: (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asmParser.g:1765:4: (otherlv_0= Add | otherlv_1= Addf | otherlv_2= Adc | otherlv_3= Adcf )
                    int alt31=4;
                    switch ( input.LA(1) ) {
                    case Add:
                        {
                        alt31=1;
                        }
                        break;
                    case Addf:
                        {
                        alt31=2;
                        }
                        break;
                    case Adc:
                        {
                        alt31=3;
                        }
                        break;
                    case Adcf:
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
                            // InternalPds16asmParser.g:1766:5: otherlv_0= Add
                            {
                            otherlv_0=(Token)match(input,Add,FOLLOW_15); 

                            					newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:1771:5: otherlv_1= Addf
                            {
                            otherlv_1=(Token)match(input,Addf,FOLLOW_15); 

                            					newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddfKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalPds16asmParser.g:1776:5: otherlv_2= Adc
                            {
                            otherlv_2=(Token)match(input,Adc,FOLLOW_15); 

                            					newLeafNode(otherlv_2, grammarAccess.getAddAccess().getAdcKeyword_0_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalPds16asmParser.g:1781:5: otherlv_3= Adcf
                            {
                            otherlv_3=(Token)match(input,Adcf,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getAddAccess().getAdcfKeyword_0_0_3());
                            				

                            }
                            break;

                    }

                    // InternalPds16asmParser.g:1786:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_REGISTERS) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==Comma) ) {
                            int LA32_2 = input.LA(3);

                            if ( (LA32_2==RULE_REGISTERS) ) {
                                int LA32_3 = input.LA(4);

                                if ( (LA32_3==Comma) ) {
                                    int LA32_4 = input.LA(5);

                                    if ( (LA32_4==RULE_REGISTERS) ) {
                                        alt32=2;
                                    }
                                    else if ( (LA32_4==NumberSign) ) {
                                        alt32=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 32, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 32, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalPds16asmParser.g:1787:5: this_OperationsWithConstant_4= ruleOperationsWithConstant
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
                            // InternalPds16asmParser.g:1796:5: this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters
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
                    // InternalPds16asmParser.g:1807:3: ( (otherlv_6= Inc | otherlv_7= Incf ) this_REGISTERS_8= RULE_REGISTERS )
                    {
                    // InternalPds16asmParser.g:1807:3: ( (otherlv_6= Inc | otherlv_7= Incf ) this_REGISTERS_8= RULE_REGISTERS )
                    // InternalPds16asmParser.g:1808:4: (otherlv_6= Inc | otherlv_7= Incf ) this_REGISTERS_8= RULE_REGISTERS
                    {
                    // InternalPds16asmParser.g:1808:4: (otherlv_6= Inc | otherlv_7= Incf )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==Inc) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==Incf) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalPds16asmParser.g:1809:5: otherlv_6= Inc
                            {
                            otherlv_6=(Token)match(input,Inc,FOLLOW_15); 

                            					newLeafNode(otherlv_6, grammarAccess.getAddAccess().getIncKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:1814:5: otherlv_7= Incf
                            {
                            otherlv_7=(Token)match(input,Incf,FOLLOW_15); 

                            					newLeafNode(otherlv_7, grammarAccess.getAddAccess().getIncfKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    this_REGISTERS_8=(Token)match(input,RULE_REGISTERS,FOLLOW_2); 

                    				newLeafNode(this_REGISTERS_8, grammarAccess.getAddAccess().getREGISTERSTerminalRuleCall_1_1());
                    			

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
    // InternalPds16asmParser.g:1828:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalPds16asmParser.g:1828:44: (iv_ruleSub= ruleSub EOF )
            // InternalPds16asmParser.g:1829:2: iv_ruleSub= ruleSub EOF
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
    // InternalPds16asmParser.g:1835:1: ruleSub returns [EObject current=null] : ( ( (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= Subr this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= Dec | otherlv_9= Decf ) this_REGISTERS_10= RULE_REGISTERS ) ) ;
    public final EObject ruleSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_REGISTERS_10=null;
        EObject this_OperationsWithConstant_4 = null;

        EObject this_OperationsWithTreeRegisters_5 = null;

        EObject this_OperationsWithTreeRegisters_7 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1841:2: ( ( ( (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= Subr this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= Dec | otherlv_9= Decf ) this_REGISTERS_10= RULE_REGISTERS ) ) )
            // InternalPds16asmParser.g:1842:2: ( ( (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= Subr this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= Dec | otherlv_9= Decf ) this_REGISTERS_10= RULE_REGISTERS ) )
            {
            // InternalPds16asmParser.g:1842:2: ( ( (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= Subr this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) | ( (otherlv_8= Dec | otherlv_9= Decf ) this_REGISTERS_10= RULE_REGISTERS ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case Sbbf:
            case Subf:
            case Sbb:
            case Sub:
                {
                alt38=1;
                }
                break;
            case Subr:
                {
                alt38=2;
                }
                break;
            case Decf:
            case Dec:
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
                    // InternalPds16asmParser.g:1843:3: ( (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    {
                    // InternalPds16asmParser.g:1843:3: ( (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    // InternalPds16asmParser.g:1844:4: (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asmParser.g:1844:4: (otherlv_0= Sub | otherlv_1= Subf | otherlv_2= Sbb | otherlv_3= Sbbf )
                    int alt35=4;
                    switch ( input.LA(1) ) {
                    case Sub:
                        {
                        alt35=1;
                        }
                        break;
                    case Subf:
                        {
                        alt35=2;
                        }
                        break;
                    case Sbb:
                        {
                        alt35=3;
                        }
                        break;
                    case Sbbf:
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
                            // InternalPds16asmParser.g:1845:5: otherlv_0= Sub
                            {
                            otherlv_0=(Token)match(input,Sub,FOLLOW_15); 

                            					newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:1850:5: otherlv_1= Subf
                            {
                            otherlv_1=(Token)match(input,Subf,FOLLOW_15); 

                            					newLeafNode(otherlv_1, grammarAccess.getSubAccess().getSubfKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalPds16asmParser.g:1855:5: otherlv_2= Sbb
                            {
                            otherlv_2=(Token)match(input,Sbb,FOLLOW_15); 

                            					newLeafNode(otherlv_2, grammarAccess.getSubAccess().getSbbKeyword_0_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalPds16asmParser.g:1860:5: otherlv_3= Sbbf
                            {
                            otherlv_3=(Token)match(input,Sbbf,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getSubAccess().getSbbfKeyword_0_0_3());
                            				

                            }
                            break;

                    }

                    // InternalPds16asmParser.g:1865:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_REGISTERS) ) {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==Comma) ) {
                            int LA36_2 = input.LA(3);

                            if ( (LA36_2==RULE_REGISTERS) ) {
                                int LA36_3 = input.LA(4);

                                if ( (LA36_3==Comma) ) {
                                    int LA36_4 = input.LA(5);

                                    if ( (LA36_4==NumberSign) ) {
                                        alt36=1;
                                    }
                                    else if ( (LA36_4==RULE_REGISTERS) ) {
                                        alt36=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 36, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 36, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalPds16asmParser.g:1866:5: this_OperationsWithConstant_4= ruleOperationsWithConstant
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
                            // InternalPds16asmParser.g:1875:5: this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters
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
                    // InternalPds16asmParser.g:1886:3: (otherlv_6= Subr this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asmParser.g:1886:3: (otherlv_6= Subr this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters )
                    // InternalPds16asmParser.g:1887:4: otherlv_6= Subr this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters
                    {
                    otherlv_6=(Token)match(input,Subr,FOLLOW_15); 

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
                    // InternalPds16asmParser.g:1901:3: ( (otherlv_8= Dec | otherlv_9= Decf ) this_REGISTERS_10= RULE_REGISTERS )
                    {
                    // InternalPds16asmParser.g:1901:3: ( (otherlv_8= Dec | otherlv_9= Decf ) this_REGISTERS_10= RULE_REGISTERS )
                    // InternalPds16asmParser.g:1902:4: (otherlv_8= Dec | otherlv_9= Decf ) this_REGISTERS_10= RULE_REGISTERS
                    {
                    // InternalPds16asmParser.g:1902:4: (otherlv_8= Dec | otherlv_9= Decf )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==Dec) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==Decf) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalPds16asmParser.g:1903:5: otherlv_8= Dec
                            {
                            otherlv_8=(Token)match(input,Dec,FOLLOW_15); 

                            					newLeafNode(otherlv_8, grammarAccess.getSubAccess().getDecKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:1908:5: otherlv_9= Decf
                            {
                            otherlv_9=(Token)match(input,Decf,FOLLOW_15); 

                            					newLeafNode(otherlv_9, grammarAccess.getSubAccess().getDecfKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    this_REGISTERS_10=(Token)match(input,RULE_REGISTERS,FOLLOW_2); 

                    				newLeafNode(this_REGISTERS_10, grammarAccess.getSubAccess().getREGISTERSTerminalRuleCall_2_1());
                    			

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
    // InternalPds16asmParser.g:1922:1: entryRuleAnl returns [EObject current=null] : iv_ruleAnl= ruleAnl EOF ;
    public final EObject entryRuleAnl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnl = null;


        try {
            // InternalPds16asmParser.g:1922:44: (iv_ruleAnl= ruleAnl EOF )
            // InternalPds16asmParser.g:1923:2: iv_ruleAnl= ruleAnl EOF
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
    // InternalPds16asmParser.g:1929:1: ruleAnl returns [EObject current=null] : ( (otherlv_0= Anl | otherlv_1= Anlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) ;
    public final EObject ruleAnl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:1935:2: ( ( (otherlv_0= Anl | otherlv_1= Anlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asmParser.g:1936:2: ( (otherlv_0= Anl | otherlv_1= Anlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asmParser.g:1936:2: ( (otherlv_0= Anl | otherlv_1= Anlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            // InternalPds16asmParser.g:1937:3: (otherlv_0= Anl | otherlv_1= Anlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
            {
            // InternalPds16asmParser.g:1937:3: (otherlv_0= Anl | otherlv_1= Anlf )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Anl) ) {
                alt39=1;
            }
            else if ( (LA39_0==Anlf) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPds16asmParser.g:1938:4: otherlv_0= Anl
                    {
                    otherlv_0=(Token)match(input,Anl,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getAnlAccess().getAnlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:1943:4: otherlv_1= Anlf
                    {
                    otherlv_1=(Token)match(input,Anlf,FOLLOW_15); 

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
    // InternalPds16asmParser.g:1960:1: entryRuleOrl returns [EObject current=null] : iv_ruleOrl= ruleOrl EOF ;
    public final EObject entryRuleOrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrl = null;


        try {
            // InternalPds16asmParser.g:1960:44: (iv_ruleOrl= ruleOrl EOF )
            // InternalPds16asmParser.g:1961:2: iv_ruleOrl= ruleOrl EOF
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
    // InternalPds16asmParser.g:1967:1: ruleOrl returns [EObject current=null] : ( ( (otherlv_0= Orl | otherlv_1= Orlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= Mov | otherlv_4= Movf ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) ) ;
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
            // InternalPds16asmParser.g:1973:2: ( ( ( (otherlv_0= Orl | otherlv_1= Orlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= Mov | otherlv_4= Movf ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) ) )
            // InternalPds16asmParser.g:1974:2: ( ( (otherlv_0= Orl | otherlv_1= Orlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= Mov | otherlv_4= Movf ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) )
            {
            // InternalPds16asmParser.g:1974:2: ( ( (otherlv_0= Orl | otherlv_1= Orlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) | ( (otherlv_3= Mov | otherlv_4= Movf ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Orlf||LA42_0==Orl) ) {
                alt42=1;
            }
            else if ( (LA42_0==Movf||LA42_0==Mov) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPds16asmParser.g:1975:3: ( (otherlv_0= Orl | otherlv_1= Orlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asmParser.g:1975:3: ( (otherlv_0= Orl | otherlv_1= Orlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
                    // InternalPds16asmParser.g:1976:4: (otherlv_0= Orl | otherlv_1= Orlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
                    {
                    // InternalPds16asmParser.g:1976:4: (otherlv_0= Orl | otherlv_1= Orlf )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Orl) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==Orlf) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalPds16asmParser.g:1977:5: otherlv_0= Orl
                            {
                            otherlv_0=(Token)match(input,Orl,FOLLOW_15); 

                            					newLeafNode(otherlv_0, grammarAccess.getOrlAccess().getOrlKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:1982:5: otherlv_1= Orlf
                            {
                            otherlv_1=(Token)match(input,Orlf,FOLLOW_15); 

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
                    // InternalPds16asmParser.g:1997:3: ( (otherlv_3= Mov | otherlv_4= Movf ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters )
                    {
                    // InternalPds16asmParser.g:1997:3: ( (otherlv_3= Mov | otherlv_4= Movf ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters )
                    // InternalPds16asmParser.g:1998:4: (otherlv_3= Mov | otherlv_4= Movf ) this_OperationWithTwoRegisters_5= ruleOperationWithTwoRegisters
                    {
                    // InternalPds16asmParser.g:1998:4: (otherlv_3= Mov | otherlv_4= Movf )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==Mov) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==Movf) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalPds16asmParser.g:1999:5: otherlv_3= Mov
                            {
                            otherlv_3=(Token)match(input,Mov,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getOrlAccess().getMovKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asmParser.g:2004:5: otherlv_4= Movf
                            {
                            otherlv_4=(Token)match(input,Movf,FOLLOW_15); 

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
    // InternalPds16asmParser.g:2022:1: entryRuleXrl returns [EObject current=null] : iv_ruleXrl= ruleXrl EOF ;
    public final EObject entryRuleXrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXrl = null;


        try {
            // InternalPds16asmParser.g:2022:44: (iv_ruleXrl= ruleXrl EOF )
            // InternalPds16asmParser.g:2023:2: iv_ruleXrl= ruleXrl EOF
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
    // InternalPds16asmParser.g:2029:1: ruleXrl returns [EObject current=null] : ( (otherlv_0= Xrl | otherlv_1= Xrlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) ;
    public final EObject ruleXrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2035:2: ( ( (otherlv_0= Xrl | otherlv_1= Xrlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asmParser.g:2036:2: ( (otherlv_0= Xrl | otherlv_1= Xrlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asmParser.g:2036:2: ( (otherlv_0= Xrl | otherlv_1= Xrlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            // InternalPds16asmParser.g:2037:3: (otherlv_0= Xrl | otherlv_1= Xrlf ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
            {
            // InternalPds16asmParser.g:2037:3: (otherlv_0= Xrl | otherlv_1= Xrlf )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Xrl) ) {
                alt43=1;
            }
            else if ( (LA43_0==Xrlf) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalPds16asmParser.g:2038:4: otherlv_0= Xrl
                    {
                    otherlv_0=(Token)match(input,Xrl,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getXrlAccess().getXrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:2043:4: otherlv_1= Xrlf
                    {
                    otherlv_1=(Token)match(input,Xrlf,FOLLOW_15); 

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
    // InternalPds16asmParser.g:2060:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalPds16asmParser.g:2060:44: (iv_ruleNot= ruleNot EOF )
            // InternalPds16asmParser.g:2061:2: iv_ruleNot= ruleNot EOF
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
    // InternalPds16asmParser.g:2067:1: ruleNot returns [EObject current=null] : ( (otherlv_0= Not | otherlv_1= Notf ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2073:2: ( ( (otherlv_0= Not | otherlv_1= Notf ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) )
            // InternalPds16asmParser.g:2074:2: ( (otherlv_0= Not | otherlv_1= Notf ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            {
            // InternalPds16asmParser.g:2074:2: ( (otherlv_0= Not | otherlv_1= Notf ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            // InternalPds16asmParser.g:2075:3: (otherlv_0= Not | otherlv_1= Notf ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters
            {
            // InternalPds16asmParser.g:2075:3: (otherlv_0= Not | otherlv_1= Notf )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Not) ) {
                alt44=1;
            }
            else if ( (LA44_0==Notf) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalPds16asmParser.g:2076:4: otherlv_0= Not
                    {
                    otherlv_0=(Token)match(input,Not,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:2081:4: otherlv_1= Notf
                    {
                    otherlv_1=(Token)match(input,Notf,FOLLOW_15); 

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
    // InternalPds16asmParser.g:2098:1: entryRuleShl returns [EObject current=null] : iv_ruleShl= ruleShl EOF ;
    public final EObject entryRuleShl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShl = null;


        try {
            // InternalPds16asmParser.g:2098:44: (iv_ruleShl= ruleShl EOF )
            // InternalPds16asmParser.g:2099:2: iv_ruleShl= ruleShl EOF
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
    // InternalPds16asmParser.g:2105:1: ruleShl returns [EObject current=null] : (otherlv_0= Shl this_OperationShift_1= ruleOperationShift ) ;
    public final EObject ruleShl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OperationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2111:2: ( (otherlv_0= Shl this_OperationShift_1= ruleOperationShift ) )
            // InternalPds16asmParser.g:2112:2: (otherlv_0= Shl this_OperationShift_1= ruleOperationShift )
            {
            // InternalPds16asmParser.g:2112:2: (otherlv_0= Shl this_OperationShift_1= ruleOperationShift )
            // InternalPds16asmParser.g:2113:3: otherlv_0= Shl this_OperationShift_1= ruleOperationShift
            {
            otherlv_0=(Token)match(input,Shl,FOLLOW_15); 

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
    // InternalPds16asmParser.g:2129:1: entryRuleShr returns [EObject current=null] : iv_ruleShr= ruleShr EOF ;
    public final EObject entryRuleShr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShr = null;


        try {
            // InternalPds16asmParser.g:2129:44: (iv_ruleShr= ruleShr EOF )
            // InternalPds16asmParser.g:2130:2: iv_ruleShr= ruleShr EOF
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
    // InternalPds16asmParser.g:2136:1: ruleShr returns [EObject current=null] : (otherlv_0= Shr this_OperationShift_1= ruleOperationShift ) ;
    public final EObject ruleShr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OperationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2142:2: ( (otherlv_0= Shr this_OperationShift_1= ruleOperationShift ) )
            // InternalPds16asmParser.g:2143:2: (otherlv_0= Shr this_OperationShift_1= ruleOperationShift )
            {
            // InternalPds16asmParser.g:2143:2: (otherlv_0= Shr this_OperationShift_1= ruleOperationShift )
            // InternalPds16asmParser.g:2144:3: otherlv_0= Shr this_OperationShift_1= ruleOperationShift
            {
            otherlv_0=(Token)match(input,Shr,FOLLOW_15); 

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
    // InternalPds16asmParser.g:2160:1: entryRuleRr returns [EObject current=null] : iv_ruleRr= ruleRr EOF ;
    public final EObject entryRuleRr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRr = null;


        try {
            // InternalPds16asmParser.g:2160:43: (iv_ruleRr= ruleRr EOF )
            // InternalPds16asmParser.g:2161:2: iv_ruleRr= ruleRr EOF
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
    // InternalPds16asmParser.g:2167:1: ruleRr returns [EObject current=null] : ( (otherlv_0= Rrl | otherlv_1= Rrm ) this_OperationsWithConstant_2= ruleOperationsWithConstant ) ;
    public final EObject ruleRr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithConstant_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2173:2: ( ( (otherlv_0= Rrl | otherlv_1= Rrm ) this_OperationsWithConstant_2= ruleOperationsWithConstant ) )
            // InternalPds16asmParser.g:2174:2: ( (otherlv_0= Rrl | otherlv_1= Rrm ) this_OperationsWithConstant_2= ruleOperationsWithConstant )
            {
            // InternalPds16asmParser.g:2174:2: ( (otherlv_0= Rrl | otherlv_1= Rrm ) this_OperationsWithConstant_2= ruleOperationsWithConstant )
            // InternalPds16asmParser.g:2175:3: (otherlv_0= Rrl | otherlv_1= Rrm ) this_OperationsWithConstant_2= ruleOperationsWithConstant
            {
            // InternalPds16asmParser.g:2175:3: (otherlv_0= Rrl | otherlv_1= Rrm )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Rrl) ) {
                alt45=1;
            }
            else if ( (LA45_0==Rrm) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalPds16asmParser.g:2176:4: otherlv_0= Rrl
                    {
                    otherlv_0=(Token)match(input,Rrl,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getRrAccess().getRrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:2181:4: otherlv_1= Rrm
                    {
                    otherlv_1=(Token)match(input,Rrm,FOLLOW_15); 

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
    // InternalPds16asmParser.g:2198:1: entryRuleRc returns [EObject current=null] : iv_ruleRc= ruleRc EOF ;
    public final EObject entryRuleRc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRc = null;


        try {
            // InternalPds16asmParser.g:2198:43: (iv_ruleRc= ruleRc EOF )
            // InternalPds16asmParser.g:2199:2: iv_ruleRc= ruleRc EOF
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
    // InternalPds16asmParser.g:2205:1: ruleRc returns [EObject current=null] : ( (otherlv_0= Rcr | otherlv_1= Rcl ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) ;
    public final EObject ruleRc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2211:2: ( ( (otherlv_0= Rcr | otherlv_1= Rcl ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) )
            // InternalPds16asmParser.g:2212:2: ( (otherlv_0= Rcr | otherlv_1= Rcl ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            {
            // InternalPds16asmParser.g:2212:2: ( (otherlv_0= Rcr | otherlv_1= Rcl ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            // InternalPds16asmParser.g:2213:3: (otherlv_0= Rcr | otherlv_1= Rcl ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters
            {
            // InternalPds16asmParser.g:2213:3: (otherlv_0= Rcr | otherlv_1= Rcl )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Rcr) ) {
                alt46=1;
            }
            else if ( (LA46_0==Rcl) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalPds16asmParser.g:2214:4: otherlv_0= Rcr
                    {
                    otherlv_0=(Token)match(input,Rcr,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getRcAccess().getRcrKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:2219:4: otherlv_1= Rcl
                    {
                    otherlv_1=(Token)match(input,Rcl,FOLLOW_15); 

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
    // InternalPds16asmParser.g:2236:1: entryRuleJumpOp returns [EObject current=null] : iv_ruleJumpOp= ruleJumpOp EOF ;
    public final EObject entryRuleJumpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpOp = null;


        try {
            // InternalPds16asmParser.g:2236:47: (iv_ruleJumpOp= ruleJumpOp EOF )
            // InternalPds16asmParser.g:2237:2: iv_ruleJumpOp= ruleJumpOp EOF
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
    // InternalPds16asmParser.g:2243:1: ruleJumpOp returns [EObject current=null] : ( ( ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) ) ) ( ( (lv_opOff_1_0= ruleOperationWithOffset ) ) | ( (lv_opId_2_0= RULE_ID ) ) | otherlv_3= DollarSign ) ) ;
    public final EObject ruleJumpOp() throws RecognitionException {
        EObject current = null;

        Token lv_tag_0_1=null;
        Token lv_tag_0_2=null;
        Token lv_tag_0_3=null;
        Token lv_tag_0_4=null;
        Token lv_tag_0_5=null;
        Token lv_tag_0_6=null;
        Token lv_tag_0_7=null;
        Token lv_tag_0_8=null;
        Token lv_tag_0_9=null;
        Token lv_tag_0_10=null;
        Token lv_opId_2_0=null;
        Token otherlv_3=null;
        EObject lv_opOff_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2249:2: ( ( ( ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) ) ) ( ( (lv_opOff_1_0= ruleOperationWithOffset ) ) | ( (lv_opId_2_0= RULE_ID ) ) | otherlv_3= DollarSign ) ) )
            // InternalPds16asmParser.g:2250:2: ( ( ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) ) ) ( ( (lv_opOff_1_0= ruleOperationWithOffset ) ) | ( (lv_opId_2_0= RULE_ID ) ) | otherlv_3= DollarSign ) )
            {
            // InternalPds16asmParser.g:2250:2: ( ( ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) ) ) ( ( (lv_opOff_1_0= ruleOperationWithOffset ) ) | ( (lv_opId_2_0= RULE_ID ) ) | otherlv_3= DollarSign ) )
            // InternalPds16asmParser.g:2251:3: ( ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) ) ) ( ( (lv_opOff_1_0= ruleOperationWithOffset ) ) | ( (lv_opId_2_0= RULE_ID ) ) | otherlv_3= DollarSign )
            {
            // InternalPds16asmParser.g:2251:3: ( ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) ) )
            // InternalPds16asmParser.g:2252:4: ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) )
            {
            // InternalPds16asmParser.g:2252:4: ( (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl ) )
            // InternalPds16asmParser.g:2253:5: (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl )
            {
            // InternalPds16asmParser.g:2253:5: (lv_tag_0_1= Jz | lv_tag_0_2= Je | lv_tag_0_3= Jnz | lv_tag_0_4= Jne | lv_tag_0_5= Jc | lv_tag_0_6= Jbl | lv_tag_0_7= Jnc | lv_tag_0_8= Jae | lv_tag_0_9= Jmp | lv_tag_0_10= Jmpl )
            int alt47=10;
            switch ( input.LA(1) ) {
            case Jz:
                {
                alt47=1;
                }
                break;
            case Je:
                {
                alt47=2;
                }
                break;
            case Jnz:
                {
                alt47=3;
                }
                break;
            case Jne:
                {
                alt47=4;
                }
                break;
            case Jc:
                {
                alt47=5;
                }
                break;
            case Jbl:
                {
                alt47=6;
                }
                break;
            case Jnc:
                {
                alt47=7;
                }
                break;
            case Jae:
                {
                alt47=8;
                }
                break;
            case Jmp:
                {
                alt47=9;
                }
                break;
            case Jmpl:
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
                    // InternalPds16asmParser.g:2254:6: lv_tag_0_1= Jz
                    {
                    lv_tag_0_1=(Token)match(input,Jz,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_1, grammarAccess.getJumpOpAccess().getTagJzKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:2265:6: lv_tag_0_2= Je
                    {
                    lv_tag_0_2=(Token)match(input,Je,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_2, grammarAccess.getJumpOpAccess().getTagJeKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPds16asmParser.g:2276:6: lv_tag_0_3= Jnz
                    {
                    lv_tag_0_3=(Token)match(input,Jnz,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_3, grammarAccess.getJumpOpAccess().getTagJnzKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalPds16asmParser.g:2287:6: lv_tag_0_4= Jne
                    {
                    lv_tag_0_4=(Token)match(input,Jne,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_4, grammarAccess.getJumpOpAccess().getTagJneKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalPds16asmParser.g:2298:6: lv_tag_0_5= Jc
                    {
                    lv_tag_0_5=(Token)match(input,Jc,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_5, grammarAccess.getJumpOpAccess().getTagJcKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalPds16asmParser.g:2309:6: lv_tag_0_6= Jbl
                    {
                    lv_tag_0_6=(Token)match(input,Jbl,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_6, grammarAccess.getJumpOpAccess().getTagJblKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalPds16asmParser.g:2320:6: lv_tag_0_7= Jnc
                    {
                    lv_tag_0_7=(Token)match(input,Jnc,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_7, grammarAccess.getJumpOpAccess().getTagJncKeyword_0_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalPds16asmParser.g:2331:6: lv_tag_0_8= Jae
                    {
                    lv_tag_0_8=(Token)match(input,Jae,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_8, grammarAccess.getJumpOpAccess().getTagJaeKeyword_0_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalPds16asmParser.g:2342:6: lv_tag_0_9= Jmp
                    {
                    lv_tag_0_9=(Token)match(input,Jmp,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_9, grammarAccess.getJumpOpAccess().getTagJmpKeyword_0_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalPds16asmParser.g:2353:6: lv_tag_0_10= Jmpl
                    {
                    lv_tag_0_10=(Token)match(input,Jmpl,FOLLOW_16); 

                    						newLeafNode(lv_tag_0_10, grammarAccess.getJumpOpAccess().getTagJmplKeyword_0_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_10, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalPds16asmParser.g:2366:3: ( ( (lv_opOff_1_0= ruleOperationWithOffset ) ) | ( (lv_opId_2_0= RULE_ID ) ) | otherlv_3= DollarSign )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_REGISTERS:
                {
                alt48=1;
                }
                break;
            case RULE_ID:
                {
                alt48=2;
                }
                break;
            case DollarSign:
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
                    // InternalPds16asmParser.g:2367:4: ( (lv_opOff_1_0= ruleOperationWithOffset ) )
                    {
                    // InternalPds16asmParser.g:2367:4: ( (lv_opOff_1_0= ruleOperationWithOffset ) )
                    // InternalPds16asmParser.g:2368:5: (lv_opOff_1_0= ruleOperationWithOffset )
                    {
                    // InternalPds16asmParser.g:2368:5: (lv_opOff_1_0= ruleOperationWithOffset )
                    // InternalPds16asmParser.g:2369:6: lv_opOff_1_0= ruleOperationWithOffset
                    {

                    						newCompositeNode(grammarAccess.getJumpOpAccess().getOpOffOperationWithOffsetParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_opOff_1_0=ruleOperationWithOffset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJumpOpRule());
                    						}
                    						set(
                    							current,
                    							"opOff",
                    							lv_opOff_1_0,
                    							"org.pds16.pds16asm.Pds16asm.OperationWithOffset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:2387:4: ( (lv_opId_2_0= RULE_ID ) )
                    {
                    // InternalPds16asmParser.g:2387:4: ( (lv_opId_2_0= RULE_ID ) )
                    // InternalPds16asmParser.g:2388:5: (lv_opId_2_0= RULE_ID )
                    {
                    // InternalPds16asmParser.g:2388:5: (lv_opId_2_0= RULE_ID )
                    // InternalPds16asmParser.g:2389:6: lv_opId_2_0= RULE_ID
                    {
                    lv_opId_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_opId_2_0, grammarAccess.getJumpOpAccess().getOpIdIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"opId",
                    							lv_opId_2_0,
                    							"org.pds16.pds16asm.Pds16asm.ID");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPds16asmParser.g:2406:4: otherlv_3= DollarSign
                    {
                    otherlv_3=(Token)match(input,DollarSign,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getJumpOpAccess().getDollarSignKeyword_1_2());
                    			

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
    // InternalPds16asmParser.g:2415:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalPds16asmParser.g:2415:44: (iv_ruleNop= ruleNop EOF )
            // InternalPds16asmParser.g:2416:2: iv_ruleNop= ruleNop EOF
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
    // InternalPds16asmParser.g:2422:1: ruleNop returns [EObject current=null] : ( (lv_instruction_0_0= Nop ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_instruction_0_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:2428:2: ( ( (lv_instruction_0_0= Nop ) ) )
            // InternalPds16asmParser.g:2429:2: ( (lv_instruction_0_0= Nop ) )
            {
            // InternalPds16asmParser.g:2429:2: ( (lv_instruction_0_0= Nop ) )
            // InternalPds16asmParser.g:2430:3: (lv_instruction_0_0= Nop )
            {
            // InternalPds16asmParser.g:2430:3: (lv_instruction_0_0= Nop )
            // InternalPds16asmParser.g:2431:4: lv_instruction_0_0= Nop
            {
            lv_instruction_0_0=(Token)match(input,Nop,FOLLOW_2); 

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
    // InternalPds16asmParser.g:2446:1: entryRuleRet returns [EObject current=null] : iv_ruleRet= ruleRet EOF ;
    public final EObject entryRuleRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRet = null;


        try {
            // InternalPds16asmParser.g:2446:44: (iv_ruleRet= ruleRet EOF )
            // InternalPds16asmParser.g:2447:2: iv_ruleRet= ruleRet EOF
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
    // InternalPds16asmParser.g:2453:1: ruleRet returns [EObject current=null] : ( ( (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret ) ) ) ;
    public final EObject ruleRet() throws RecognitionException {
        EObject current = null;

        Token lv_instruction_0_1=null;
        Token lv_instruction_0_2=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:2459:2: ( ( ( (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret ) ) ) )
            // InternalPds16asmParser.g:2460:2: ( ( (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret ) ) )
            {
            // InternalPds16asmParser.g:2460:2: ( ( (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret ) ) )
            // InternalPds16asmParser.g:2461:3: ( (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret ) )
            {
            // InternalPds16asmParser.g:2461:3: ( (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret ) )
            // InternalPds16asmParser.g:2462:4: (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret )
            {
            // InternalPds16asmParser.g:2462:4: (lv_instruction_0_1= Ret | lv_instruction_0_2= Iret )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Ret) ) {
                alt49=1;
            }
            else if ( (LA49_0==Iret) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalPds16asmParser.g:2463:5: lv_instruction_0_1= Ret
                    {
                    lv_instruction_0_1=(Token)match(input,Ret,FOLLOW_2); 

                    					newLeafNode(lv_instruction_0_1, grammarAccess.getRetAccess().getInstructionRetKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRetRule());
                    					}
                    					setWithLastConsumed(current, "instruction", lv_instruction_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:2474:5: lv_instruction_0_2= Iret
                    {
                    lv_instruction_0_2=(Token)match(input,Iret,FOLLOW_2); 

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
    // InternalPds16asmParser.g:2490:1: entryRuleImmediate returns [EObject current=null] : iv_ruleImmediate= ruleImmediate EOF ;
    public final EObject entryRuleImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate = null;


        try {
            // InternalPds16asmParser.g:2490:50: (iv_ruleImmediate= ruleImmediate EOF )
            // InternalPds16asmParser.g:2491:2: iv_ruleImmediate= ruleImmediate EOF
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
    // InternalPds16asmParser.g:2497:1: ruleImmediate returns [EObject current=null] : ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) ) ;
    public final EObject ruleImmediate() throws RecognitionException {
        EObject current = null;

        Token lv_register_0_0=null;
        Token otherlv_1=null;
        EObject lv_immediate8_2_0 = null;

        EObject lv_lowORhigh_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2503:2: ( ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) ) )
            // InternalPds16asmParser.g:2504:2: ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) )
            {
            // InternalPds16asmParser.g:2504:2: ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) ) )
            // InternalPds16asmParser.g:2505:3: ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) )
            {
            // InternalPds16asmParser.g:2505:3: ( (lv_register_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:2506:4: (lv_register_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:2506:4: (lv_register_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:2507:5: lv_register_0_0= RULE_REGISTERS
            {
            lv_register_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_register_0_0, grammarAccess.getImmediateAccess().getRegisterREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImmediateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"register",
            						lv_register_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getImmediateAccess().getCommaKeyword_1());
            		
            // InternalPds16asmParser.g:2527:3: ( ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) ) | ( (lv_lowORhigh_3_0= ruleLowOrHight ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==NumberSign) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==High||LA50_1==Low) ) {
                    alt50=2;
                }
                else if ( ((LA50_1>=RULE_HEX && LA50_1<=RULE_BIN)||(LA50_1>=RULE_CHAR && LA50_1<=RULE_ID)||LA50_1==RULE_INT) ) {
                    alt50=1;
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
                    // InternalPds16asmParser.g:2528:4: ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) )
                    {
                    // InternalPds16asmParser.g:2528:4: ( (lv_immediate8_2_0= ruleImmediate8OrLabel ) )
                    // InternalPds16asmParser.g:2529:5: (lv_immediate8_2_0= ruleImmediate8OrLabel )
                    {
                    // InternalPds16asmParser.g:2529:5: (lv_immediate8_2_0= ruleImmediate8OrLabel )
                    // InternalPds16asmParser.g:2530:6: lv_immediate8_2_0= ruleImmediate8OrLabel
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
                    // InternalPds16asmParser.g:2548:4: ( (lv_lowORhigh_3_0= ruleLowOrHight ) )
                    {
                    // InternalPds16asmParser.g:2548:4: ( (lv_lowORhigh_3_0= ruleLowOrHight ) )
                    // InternalPds16asmParser.g:2549:5: (lv_lowORhigh_3_0= ruleLowOrHight )
                    {
                    // InternalPds16asmParser.g:2549:5: (lv_lowORhigh_3_0= ruleLowOrHight )
                    // InternalPds16asmParser.g:2550:6: lv_lowORhigh_3_0= ruleLowOrHight
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
    // InternalPds16asmParser.g:2572:1: entryRuleDirect returns [EObject current=null] : iv_ruleDirect= ruleDirect EOF ;
    public final EObject entryRuleDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirect = null;


        try {
            // InternalPds16asmParser.g:2572:47: (iv_ruleDirect= ruleDirect EOF )
            // InternalPds16asmParser.g:2573:2: iv_ruleDirect= ruleDirect EOF
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
    // InternalPds16asmParser.g:2579:1: ruleDirect returns [EObject current=null] : ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_direct7_2_0= ruleDirectOrLabel ) ) ) ;
    public final EObject ruleDirect() throws RecognitionException {
        EObject current = null;

        Token lv_register_0_0=null;
        Token otherlv_1=null;
        EObject lv_direct7_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2585:2: ( ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_direct7_2_0= ruleDirectOrLabel ) ) ) )
            // InternalPds16asmParser.g:2586:2: ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_direct7_2_0= ruleDirectOrLabel ) ) )
            {
            // InternalPds16asmParser.g:2586:2: ( ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_direct7_2_0= ruleDirectOrLabel ) ) )
            // InternalPds16asmParser.g:2587:3: ( (lv_register_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_direct7_2_0= ruleDirectOrLabel ) )
            {
            // InternalPds16asmParser.g:2587:3: ( (lv_register_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:2588:4: (lv_register_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:2588:4: (lv_register_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:2589:5: lv_register_0_0= RULE_REGISTERS
            {
            lv_register_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_register_0_0, grammarAccess.getDirectAccess().getRegisterREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"register",
            						lv_register_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectAccess().getCommaKeyword_1());
            		
            // InternalPds16asmParser.g:2609:3: ( (lv_direct7_2_0= ruleDirectOrLabel ) )
            // InternalPds16asmParser.g:2610:4: (lv_direct7_2_0= ruleDirectOrLabel )
            {
            // InternalPds16asmParser.g:2610:4: (lv_direct7_2_0= ruleDirectOrLabel )
            // InternalPds16asmParser.g:2611:5: lv_direct7_2_0= ruleDirectOrLabel
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
    // InternalPds16asmParser.g:2632:1: entryRuleIndexed returns [EObject current=null] : iv_ruleIndexed= ruleIndexed EOF ;
    public final EObject entryRuleIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexed = null;


        try {
            // InternalPds16asmParser.g:2632:48: (iv_ruleIndexed= ruleIndexed EOF )
            // InternalPds16asmParser.g:2633:2: iv_ruleIndexed= ruleIndexed EOF
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
    // InternalPds16asmParser.g:2639:1: ruleIndexed returns [EObject current=null] : ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleIndexed() throws RecognitionException {
        EObject current = null;

        Token lv_rd_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_rbx_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_idx3_5_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2645:2: ( ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= RightSquareBracket ) )
            // InternalPds16asmParser.g:2646:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= RightSquareBracket )
            {
            // InternalPds16asmParser.g:2646:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= RightSquareBracket )
            // InternalPds16asmParser.g:2647:3: ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_idx3_5_0= ruleIdx3OrLabel ) ) otherlv_6= RightSquareBracket
            {
            // InternalPds16asmParser.g:2647:3: ( (lv_rd_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:2648:4: (lv_rd_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:2648:4: (lv_rd_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:2649:5: lv_rd_0_0= RULE_REGISTERS
            {
            lv_rd_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rd_0_0, grammarAccess.getIndexedAccess().getRdREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asmParser.g:2673:3: ( (lv_rbx_3_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:2674:4: (lv_rbx_3_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:2674:4: (lv_rbx_3_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:2675:5: lv_rbx_3_0= RULE_REGISTERS
            {
            lv_rbx_3_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rbx_3_0, grammarAccess.getIndexedAccess().getRbxREGISTERSTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rbx",
            						lv_rbx_3_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_4=(Token)match(input,Comma,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asmParser.g:2695:3: ( (lv_idx3_5_0= ruleIdx3OrLabel ) )
            // InternalPds16asmParser.g:2696:4: (lv_idx3_5_0= ruleIdx3OrLabel )
            {
            // InternalPds16asmParser.g:2696:4: (lv_idx3_5_0= ruleIdx3OrLabel )
            // InternalPds16asmParser.g:2697:5: lv_idx3_5_0= ruleIdx3OrLabel
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getIdx3Idx3OrLabelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

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
    // InternalPds16asmParser.g:2722:1: entryRuleBasedIndexed returns [EObject current=null] : iv_ruleBasedIndexed= ruleBasedIndexed EOF ;
    public final EObject entryRuleBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasedIndexed = null;


        try {
            // InternalPds16asmParser.g:2722:53: (iv_ruleBasedIndexed= ruleBasedIndexed EOF )
            // InternalPds16asmParser.g:2723:2: iv_ruleBasedIndexed= ruleBasedIndexed EOF
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
    // InternalPds16asmParser.g:2729:1: ruleBasedIndexed returns [EObject current=null] : (this_REGISTERS_0= RULE_REGISTERS otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_rix_5_0= RULE_REGISTERS ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token this_REGISTERS_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_rbx_3_0=null;
        Token otherlv_4=null;
        Token lv_rix_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:2735:2: ( (this_REGISTERS_0= RULE_REGISTERS otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_rix_5_0= RULE_REGISTERS ) ) otherlv_6= RightSquareBracket ) )
            // InternalPds16asmParser.g:2736:2: (this_REGISTERS_0= RULE_REGISTERS otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_rix_5_0= RULE_REGISTERS ) ) otherlv_6= RightSquareBracket )
            {
            // InternalPds16asmParser.g:2736:2: (this_REGISTERS_0= RULE_REGISTERS otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_rix_5_0= RULE_REGISTERS ) ) otherlv_6= RightSquareBracket )
            // InternalPds16asmParser.g:2737:3: this_REGISTERS_0= RULE_REGISTERS otherlv_1= Comma otherlv_2= LeftSquareBracket ( (lv_rbx_3_0= RULE_REGISTERS ) ) otherlv_4= Comma ( (lv_rix_5_0= RULE_REGISTERS ) ) otherlv_6= RightSquareBracket
            {
            this_REGISTERS_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            			newLeafNode(this_REGISTERS_0, grammarAccess.getBasedIndexedAccess().getREGISTERSTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Comma,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBasedIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getBasedIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asmParser.g:2749:3: ( (lv_rbx_3_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:2750:4: (lv_rbx_3_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:2750:4: (lv_rbx_3_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:2751:5: lv_rbx_3_0= RULE_REGISTERS
            {
            lv_rbx_3_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rbx_3_0, grammarAccess.getBasedIndexedAccess().getRbxREGISTERSTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasedIndexedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rbx",
            						lv_rbx_3_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_4=(Token)match(input,Comma,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getBasedIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asmParser.g:2771:3: ( (lv_rix_5_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:2772:4: (lv_rix_5_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:2772:4: (lv_rix_5_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:2773:5: lv_rix_5_0= RULE_REGISTERS
            {
            lv_rix_5_0=(Token)match(input,RULE_REGISTERS,FOLLOW_19); 

            					newLeafNode(lv_rix_5_0, grammarAccess.getBasedIndexedAccess().getRixREGISTERSTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasedIndexedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rix",
            						lv_rix_5_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

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
    // InternalPds16asmParser.g:2797:1: entryRuleDirectOrLabel returns [EObject current=null] : iv_ruleDirectOrLabel= ruleDirectOrLabel EOF ;
    public final EObject entryRuleDirectOrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectOrLabel = null;


        try {
            // InternalPds16asmParser.g:2797:54: (iv_ruleDirectOrLabel= ruleDirectOrLabel EOF )
            // InternalPds16asmParser.g:2798:2: iv_ruleDirectOrLabel= ruleDirectOrLabel EOF
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
    // InternalPds16asmParser.g:2804:1: ruleDirectOrLabel returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDirectOrLabel() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2810:2: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) ) )
            // InternalPds16asmParser.g:2811:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) )
            {
            // InternalPds16asmParser.g:2811:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_label_1_0= RULE_ID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_HEX && LA51_0<=RULE_BIN)||LA51_0==RULE_CHAR||LA51_0==RULE_INT) ) {
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
                    // InternalPds16asmParser.g:2812:3: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // InternalPds16asmParser.g:2812:3: ( (lv_number_0_0= ruleNumber ) )
                    // InternalPds16asmParser.g:2813:4: (lv_number_0_0= ruleNumber )
                    {
                    // InternalPds16asmParser.g:2813:4: (lv_number_0_0= ruleNumber )
                    // InternalPds16asmParser.g:2814:5: lv_number_0_0= ruleNumber
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
                    // InternalPds16asmParser.g:2832:3: ( (lv_label_1_0= RULE_ID ) )
                    {
                    // InternalPds16asmParser.g:2832:3: ( (lv_label_1_0= RULE_ID ) )
                    // InternalPds16asmParser.g:2833:4: (lv_label_1_0= RULE_ID )
                    {
                    // InternalPds16asmParser.g:2833:4: (lv_label_1_0= RULE_ID )
                    // InternalPds16asmParser.g:2834:5: lv_label_1_0= RULE_ID
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
    // InternalPds16asmParser.g:2854:1: entryRuleImmediate8OrLabel returns [EObject current=null] : iv_ruleImmediate8OrLabel= ruleImmediate8OrLabel EOF ;
    public final EObject entryRuleImmediate8OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate8OrLabel = null;


        try {
            // InternalPds16asmParser.g:2854:58: (iv_ruleImmediate8OrLabel= ruleImmediate8OrLabel EOF )
            // InternalPds16asmParser.g:2855:2: iv_ruleImmediate8OrLabel= ruleImmediate8OrLabel EOF
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
    // InternalPds16asmParser.g:2861:1: ruleImmediate8OrLabel returns [EObject current=null] : (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleImmediate8OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2867:2: ( (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asmParser.g:2868:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asmParser.g:2868:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asmParser.g:2869:3: otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,NumberSign,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getImmediate8OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asmParser.g:2873:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_HEX && LA52_0<=RULE_BIN)||LA52_0==RULE_CHAR||LA52_0==RULE_INT) ) {
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
                    // InternalPds16asmParser.g:2874:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asmParser.g:2874:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asmParser.g:2875:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asmParser.g:2875:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asmParser.g:2876:6: lv_number_1_0= ruleNumber
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
                    // InternalPds16asmParser.g:2894:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asmParser.g:2894:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asmParser.g:2895:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asmParser.g:2895:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asmParser.g:2896:6: lv_label_2_0= RULE_ID
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
    // InternalPds16asmParser.g:2917:1: entryRuleIdx3OrLabel returns [EObject current=null] : iv_ruleIdx3OrLabel= ruleIdx3OrLabel EOF ;
    public final EObject entryRuleIdx3OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdx3OrLabel = null;


        try {
            // InternalPds16asmParser.g:2917:52: (iv_ruleIdx3OrLabel= ruleIdx3OrLabel EOF )
            // InternalPds16asmParser.g:2918:2: iv_ruleIdx3OrLabel= ruleIdx3OrLabel EOF
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
    // InternalPds16asmParser.g:2924:1: ruleIdx3OrLabel returns [EObject current=null] : (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleIdx3OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2930:2: ( (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asmParser.g:2931:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asmParser.g:2931:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asmParser.g:2932:3: otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,NumberSign,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIdx3OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asmParser.g:2936:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_HEX && LA53_0<=RULE_BIN)||LA53_0==RULE_CHAR||LA53_0==RULE_INT) ) {
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
                    // InternalPds16asmParser.g:2937:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asmParser.g:2937:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asmParser.g:2938:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asmParser.g:2938:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asmParser.g:2939:6: lv_number_1_0= ruleNumber
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
                    // InternalPds16asmParser.g:2957:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asmParser.g:2957:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asmParser.g:2958:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asmParser.g:2958:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asmParser.g:2959:6: lv_label_2_0= RULE_ID
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
    // InternalPds16asmParser.g:2980:1: entryRuleConst4OrLabel returns [EObject current=null] : iv_ruleConst4OrLabel= ruleConst4OrLabel EOF ;
    public final EObject entryRuleConst4OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst4OrLabel = null;


        try {
            // InternalPds16asmParser.g:2980:54: (iv_ruleConst4OrLabel= ruleConst4OrLabel EOF )
            // InternalPds16asmParser.g:2981:2: iv_ruleConst4OrLabel= ruleConst4OrLabel EOF
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
    // InternalPds16asmParser.g:2987:1: ruleConst4OrLabel returns [EObject current=null] : (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleConst4OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:2993:2: ( (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asmParser.g:2994:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asmParser.g:2994:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asmParser.g:2995:3: otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,NumberSign,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConst4OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asmParser.g:2999:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_HEX && LA54_0<=RULE_BIN)||LA54_0==RULE_CHAR||LA54_0==RULE_INT) ) {
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
                    // InternalPds16asmParser.g:3000:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asmParser.g:3000:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asmParser.g:3001:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asmParser.g:3001:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asmParser.g:3002:6: lv_number_1_0= ruleNumber
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
                    // InternalPds16asmParser.g:3020:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asmParser.g:3020:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asmParser.g:3021:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asmParser.g:3021:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asmParser.g:3022:6: lv_label_2_0= RULE_ID
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
    // InternalPds16asmParser.g:3043:1: entryRuleOffset8OrLabel returns [EObject current=null] : iv_ruleOffset8OrLabel= ruleOffset8OrLabel EOF ;
    public final EObject entryRuleOffset8OrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset8OrLabel = null;


        try {
            // InternalPds16asmParser.g:3043:55: (iv_ruleOffset8OrLabel= ruleOffset8OrLabel EOF )
            // InternalPds16asmParser.g:3044:2: iv_ruleOffset8OrLabel= ruleOffset8OrLabel EOF
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
    // InternalPds16asmParser.g:3050:1: ruleOffset8OrLabel returns [EObject current=null] : (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleOffset8OrLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        EObject lv_number_1_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:3056:2: ( (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // InternalPds16asmParser.g:3057:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // InternalPds16asmParser.g:3057:2: (otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) ) )
            // InternalPds16asmParser.g:3058:3: otherlv_0= NumberSign ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,NumberSign,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOffset8OrLabelAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asmParser.g:3062:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_label_2_0= RULE_ID ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_HEX && LA55_0<=RULE_BIN)||LA55_0==RULE_CHAR||LA55_0==RULE_INT) ) {
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
                    // InternalPds16asmParser.g:3063:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalPds16asmParser.g:3063:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalPds16asmParser.g:3064:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalPds16asmParser.g:3064:5: (lv_number_1_0= ruleNumber )
                    // InternalPds16asmParser.g:3065:6: lv_number_1_0= ruleNumber
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
                    // InternalPds16asmParser.g:3083:4: ( (lv_label_2_0= RULE_ID ) )
                    {
                    // InternalPds16asmParser.g:3083:4: ( (lv_label_2_0= RULE_ID ) )
                    // InternalPds16asmParser.g:3084:5: (lv_label_2_0= RULE_ID )
                    {
                    // InternalPds16asmParser.g:3084:5: (lv_label_2_0= RULE_ID )
                    // InternalPds16asmParser.g:3085:6: lv_label_2_0= RULE_ID
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
    // InternalPds16asmParser.g:3106:1: entryRuleOperationWithTwoRegisters returns [EObject current=null] : iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF ;
    public final EObject entryRuleOperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationWithTwoRegisters = null;


        try {
            // InternalPds16asmParser.g:3106:66: (iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF )
            // InternalPds16asmParser.g:3107:2: iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF
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
    // InternalPds16asmParser.g:3113:1: ruleOperationWithTwoRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) ) ;
    public final EObject ruleOperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        Token lv_rd_0_0=null;
        Token otherlv_1=null;
        Token lv_rm_2_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:3119:2: ( ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) ) )
            // InternalPds16asmParser.g:3120:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) )
            {
            // InternalPds16asmParser.g:3120:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) )
            // InternalPds16asmParser.g:3121:3: ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) )
            {
            // InternalPds16asmParser.g:3121:3: ( (lv_rd_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3122:4: (lv_rd_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3122:4: (lv_rd_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3123:5: lv_rd_0_0= RULE_REGISTERS
            {
            lv_rd_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rd_0_0, grammarAccess.getOperationWithTwoRegistersAccess().getRdREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationWithTwoRegistersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithTwoRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asmParser.g:3143:3: ( (lv_rm_2_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3144:4: (lv_rm_2_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3144:4: (lv_rm_2_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3145:5: lv_rm_2_0= RULE_REGISTERS
            {
            lv_rm_2_0=(Token)match(input,RULE_REGISTERS,FOLLOW_2); 

            					newLeafNode(lv_rm_2_0, grammarAccess.getOperationWithTwoRegistersAccess().getRmREGISTERSTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationWithTwoRegistersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

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
    // InternalPds16asmParser.g:3165:1: entryRuleOperationsWithTreeRegisters returns [EObject current=null] : iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF ;
    public final EObject entryRuleOperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsWithTreeRegisters = null;


        try {
            // InternalPds16asmParser.g:3165:68: (iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF )
            // InternalPds16asmParser.g:3166:2: iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF
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
    // InternalPds16asmParser.g:3172:1: ruleOperationsWithTreeRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_rn_4_0= RULE_REGISTERS ) ) ) ;
    public final EObject ruleOperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        Token lv_rd_0_0=null;
        Token otherlv_1=null;
        Token lv_rm_2_0=null;
        Token otherlv_3=null;
        Token lv_rn_4_0=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:3178:2: ( ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_rn_4_0= RULE_REGISTERS ) ) ) )
            // InternalPds16asmParser.g:3179:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_rn_4_0= RULE_REGISTERS ) ) )
            {
            // InternalPds16asmParser.g:3179:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_rn_4_0= RULE_REGISTERS ) ) )
            // InternalPds16asmParser.g:3180:3: ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_rn_4_0= RULE_REGISTERS ) )
            {
            // InternalPds16asmParser.g:3180:3: ( (lv_rd_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3181:4: (lv_rd_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3181:4: (lv_rd_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3182:5: lv_rd_0_0= RULE_REGISTERS
            {
            lv_rd_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rd_0_0, grammarAccess.getOperationsWithTreeRegistersAccess().getRdREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asmParser.g:3202:3: ( (lv_rm_2_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3203:4: (lv_rm_2_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3203:4: (lv_rm_2_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3204:5: lv_rm_2_0= RULE_REGISTERS
            {
            lv_rm_2_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rm_2_0, grammarAccess.getOperationsWithTreeRegistersAccess().getRmREGISTERSTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_3());
            		
            // InternalPds16asmParser.g:3224:3: ( (lv_rn_4_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3225:4: (lv_rn_4_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3225:4: (lv_rn_4_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3226:5: lv_rn_4_0= RULE_REGISTERS
            {
            lv_rn_4_0=(Token)match(input,RULE_REGISTERS,FOLLOW_2); 

            					newLeafNode(lv_rn_4_0, grammarAccess.getOperationsWithTreeRegistersAccess().getRnREGISTERSTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rn",
            						lv_rn_4_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

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
    // InternalPds16asmParser.g:3246:1: entryRuleOperationsWithConstant returns [EObject current=null] : iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF ;
    public final EObject entryRuleOperationsWithConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsWithConstant = null;


        try {
            // InternalPds16asmParser.g:3246:63: (iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF )
            // InternalPds16asmParser.g:3247:2: iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF
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
    // InternalPds16asmParser.g:3253:1: ruleOperationsWithConstant returns [EObject current=null] : ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) ) ;
    public final EObject ruleOperationsWithConstant() throws RecognitionException {
        EObject current = null;

        Token lv_rd_0_0=null;
        Token otherlv_1=null;
        Token lv_rm_2_0=null;
        Token otherlv_3=null;
        EObject lv_const4_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:3259:2: ( ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) ) )
            // InternalPds16asmParser.g:3260:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) )
            {
            // InternalPds16asmParser.g:3260:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) )
            // InternalPds16asmParser.g:3261:3: ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) )
            {
            // InternalPds16asmParser.g:3261:3: ( (lv_rd_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3262:4: (lv_rd_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3262:4: (lv_rd_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3263:5: lv_rd_0_0= RULE_REGISTERS
            {
            lv_rd_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rd_0_0, grammarAccess.getOperationsWithConstantAccess().getRdREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsWithConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_1());
            		
            // InternalPds16asmParser.g:3283:3: ( (lv_rm_2_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3284:4: (lv_rm_2_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3284:4: (lv_rm_2_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3285:5: lv_rm_2_0= RULE_REGISTERS
            {
            lv_rm_2_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rm_2_0, grammarAccess.getOperationsWithConstantAccess().getRmREGISTERSTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsWithConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_3());
            		
            // InternalPds16asmParser.g:3305:3: ( (lv_const4_4_0= ruleConst4OrLabel ) )
            // InternalPds16asmParser.g:3306:4: (lv_const4_4_0= ruleConst4OrLabel )
            {
            // InternalPds16asmParser.g:3306:4: (lv_const4_4_0= ruleConst4OrLabel )
            // InternalPds16asmParser.g:3307:5: lv_const4_4_0= ruleConst4OrLabel
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
    // InternalPds16asmParser.g:3328:1: entryRuleOperationShift returns [EObject current=null] : iv_ruleOperationShift= ruleOperationShift EOF ;
    public final EObject entryRuleOperationShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationShift = null;


        try {
            // InternalPds16asmParser.g:3328:55: (iv_ruleOperationShift= ruleOperationShift EOF )
            // InternalPds16asmParser.g:3329:2: iv_ruleOperationShift= ruleOperationShift EOF
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
    // InternalPds16asmParser.g:3335:1: ruleOperationShift returns [EObject current=null] : ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= Comma ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) ) ;
    public final EObject ruleOperationShift() throws RecognitionException {
        EObject current = null;

        Token lv_rd_0_0=null;
        Token otherlv_1=null;
        Token lv_rm_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_sin_6_1=null;
        Token lv_sin_6_2=null;
        Token lv_sin_6_3=null;
        Token lv_sin_6_4=null;
        Token lv_sin_6_5=null;
        EObject lv_const4_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:3341:2: ( ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= Comma ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) ) )
            // InternalPds16asmParser.g:3342:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= Comma ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) )
            {
            // InternalPds16asmParser.g:3342:2: ( ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= Comma ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) ) )
            // InternalPds16asmParser.g:3343:3: ( (lv_rd_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_rm_2_0= RULE_REGISTERS ) ) otherlv_3= Comma ( (lv_const4_4_0= ruleConst4OrLabel ) ) otherlv_5= Comma ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) )
            {
            // InternalPds16asmParser.g:3343:3: ( (lv_rd_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3344:4: (lv_rd_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3344:4: (lv_rd_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3345:5: lv_rd_0_0= RULE_REGISTERS
            {
            lv_rd_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rd_0_0, grammarAccess.getOperationShiftAccess().getRdREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationShiftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationShiftAccess().getCommaKeyword_1());
            		
            // InternalPds16asmParser.g:3365:3: ( (lv_rm_2_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3366:4: (lv_rm_2_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3366:4: (lv_rm_2_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3367:5: lv_rm_2_0= RULE_REGISTERS
            {
            lv_rm_2_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rm_2_0, grammarAccess.getOperationShiftAccess().getRmREGISTERSTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationShiftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationShiftAccess().getCommaKeyword_3());
            		
            // InternalPds16asmParser.g:3387:3: ( (lv_const4_4_0= ruleConst4OrLabel ) )
            // InternalPds16asmParser.g:3388:4: (lv_const4_4_0= ruleConst4OrLabel )
            {
            // InternalPds16asmParser.g:3388:4: (lv_const4_4_0= ruleConst4OrLabel )
            // InternalPds16asmParser.g:3389:5: lv_const4_4_0= ruleConst4OrLabel
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getConst4Const4OrLabelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,Comma,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationShiftAccess().getCommaKeyword_5());
            		
            // InternalPds16asmParser.g:3410:3: ( ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) ) )
            // InternalPds16asmParser.g:3411:4: ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) )
            {
            // InternalPds16asmParser.g:3411:4: ( (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR ) )
            // InternalPds16asmParser.g:3412:5: (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR )
            {
            // InternalPds16asmParser.g:3412:5: (lv_sin_6_1= RULE_INT | lv_sin_6_2= RULE_HEX | lv_sin_6_3= RULE_OCT | lv_sin_6_4= RULE_BIN | lv_sin_6_5= RULE_CHAR )
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
                    // InternalPds16asmParser.g:3413:6: lv_sin_6_1= RULE_INT
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
                    // InternalPds16asmParser.g:3428:6: lv_sin_6_2= RULE_HEX
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
                    // InternalPds16asmParser.g:3443:6: lv_sin_6_3= RULE_OCT
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
                    // InternalPds16asmParser.g:3458:6: lv_sin_6_4= RULE_BIN
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
                    // InternalPds16asmParser.g:3473:6: lv_sin_6_5= RULE_CHAR
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
    // InternalPds16asmParser.g:3494:1: entryRuleOperationWithOffset returns [EObject current=null] : iv_ruleOperationWithOffset= ruleOperationWithOffset EOF ;
    public final EObject entryRuleOperationWithOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationWithOffset = null;


        try {
            // InternalPds16asmParser.g:3494:60: (iv_ruleOperationWithOffset= ruleOperationWithOffset EOF )
            // InternalPds16asmParser.g:3495:2: iv_ruleOperationWithOffset= ruleOperationWithOffset EOF
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
    // InternalPds16asmParser.g:3501:1: ruleOperationWithOffset returns [EObject current=null] : ( ( (lv_rbx_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) ) ;
    public final EObject ruleOperationWithOffset() throws RecognitionException {
        EObject current = null;

        Token lv_rbx_0_0=null;
        Token otherlv_1=null;
        EObject lv_offset8_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asmParser.g:3507:2: ( ( ( (lv_rbx_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) ) )
            // InternalPds16asmParser.g:3508:2: ( ( (lv_rbx_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) )
            {
            // InternalPds16asmParser.g:3508:2: ( ( (lv_rbx_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_offset8_2_0= ruleOffset8OrLabel ) ) )
            // InternalPds16asmParser.g:3509:3: ( (lv_rbx_0_0= RULE_REGISTERS ) ) otherlv_1= Comma ( (lv_offset8_2_0= ruleOffset8OrLabel ) )
            {
            // InternalPds16asmParser.g:3509:3: ( (lv_rbx_0_0= RULE_REGISTERS ) )
            // InternalPds16asmParser.g:3510:4: (lv_rbx_0_0= RULE_REGISTERS )
            {
            // InternalPds16asmParser.g:3510:4: (lv_rbx_0_0= RULE_REGISTERS )
            // InternalPds16asmParser.g:3511:5: lv_rbx_0_0= RULE_REGISTERS
            {
            lv_rbx_0_0=(Token)match(input,RULE_REGISTERS,FOLLOW_14); 

            					newLeafNode(lv_rbx_0_0, grammarAccess.getOperationWithOffsetAccess().getRbxREGISTERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationWithOffsetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rbx",
            						lv_rbx_0_0,
            						"org.pds16.pds16asm.Pds16asm.REGISTERS");
            				

            }


            }

            otherlv_1=(Token)match(input,Comma,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithOffsetAccess().getCommaKeyword_1());
            		
            // InternalPds16asmParser.g:3531:3: ( (lv_offset8_2_0= ruleOffset8OrLabel ) )
            // InternalPds16asmParser.g:3532:4: (lv_offset8_2_0= ruleOffset8OrLabel )
            {
            // InternalPds16asmParser.g:3532:4: (lv_offset8_2_0= ruleOffset8OrLabel )
            // InternalPds16asmParser.g:3533:5: lv_offset8_2_0= ruleOffset8OrLabel
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
    // InternalPds16asmParser.g:3554:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPds16asmParser.g:3554:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPds16asmParser.g:3555:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalPds16asmParser.g:3561:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+ ;
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
            // InternalPds16asmParser.g:3567:2: ( ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+ )
            // InternalPds16asmParser.g:3568:2: ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+
            {
            // InternalPds16asmParser.g:3568:2: ( ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) ) | ( (lv_idValue_1_0= RULE_ID ) ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=3;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_HEX && LA58_0<=RULE_BIN)||LA58_0==RULE_CHAR||LA58_0==RULE_INT) ) {
                    alt58=1;
                }
                else if ( (LA58_0==RULE_ID) ) {
                    alt58=2;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalPds16asmParser.g:3569:3: ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) )
            	    {
            	    // InternalPds16asmParser.g:3569:3: ( ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) ) )
            	    // InternalPds16asmParser.g:3570:4: ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) )
            	    {
            	    // InternalPds16asmParser.g:3570:4: ( (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR ) )
            	    // InternalPds16asmParser.g:3571:5: (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR )
            	    {
            	    // InternalPds16asmParser.g:3571:5: (lv_numericValue_0_1= RULE_INT | lv_numericValue_0_2= RULE_HEX | lv_numericValue_0_3= RULE_OCT | lv_numericValue_0_4= RULE_BIN | lv_numericValue_0_5= RULE_CHAR )
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
            	            // InternalPds16asmParser.g:3572:6: lv_numericValue_0_1= RULE_INT
            	            {
            	            lv_numericValue_0_1=(Token)match(input,RULE_INT,FOLLOW_10); 

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
            	            // InternalPds16asmParser.g:3587:6: lv_numericValue_0_2= RULE_HEX
            	            {
            	            lv_numericValue_0_2=(Token)match(input,RULE_HEX,FOLLOW_10); 

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
            	            // InternalPds16asmParser.g:3602:6: lv_numericValue_0_3= RULE_OCT
            	            {
            	            lv_numericValue_0_3=(Token)match(input,RULE_OCT,FOLLOW_10); 

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
            	            // InternalPds16asmParser.g:3617:6: lv_numericValue_0_4= RULE_BIN
            	            {
            	            lv_numericValue_0_4=(Token)match(input,RULE_BIN,FOLLOW_10); 

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
            	            // InternalPds16asmParser.g:3632:6: lv_numericValue_0_5= RULE_CHAR
            	            {
            	            lv_numericValue_0_5=(Token)match(input,RULE_CHAR,FOLLOW_10); 

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
            	    // InternalPds16asmParser.g:3650:3: ( (lv_idValue_1_0= RULE_ID ) )
            	    {
            	    // InternalPds16asmParser.g:3650:3: ( (lv_idValue_1_0= RULE_ID ) )
            	    // InternalPds16asmParser.g:3651:4: (lv_idValue_1_0= RULE_ID )
            	    {
            	    // InternalPds16asmParser.g:3651:4: (lv_idValue_1_0= RULE_ID )
            	    // InternalPds16asmParser.g:3652:5: lv_idValue_1_0= RULE_ID
            	    {
            	    lv_idValue_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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
    // InternalPds16asmParser.g:3672:1: entryRuleLowOrHight returns [EObject current=null] : iv_ruleLowOrHight= ruleLowOrHight EOF ;
    public final EObject entryRuleLowOrHight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowOrHight = null;


        try {
            // InternalPds16asmParser.g:3672:51: (iv_ruleLowOrHight= ruleLowOrHight EOF )
            // InternalPds16asmParser.g:3673:2: iv_ruleLowOrHight= ruleLowOrHight EOF
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
    // InternalPds16asmParser.g:3679:1: ruleLowOrHight returns [EObject current=null] : (otherlv_0= NumberSign (otherlv_1= Low | otherlv_2= High ) otherlv_3= LeftParenthesis ( (lv_value_4_0= ruleExpression ) ) otherlv_5= RightParenthesis ) ;
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
            // InternalPds16asmParser.g:3685:2: ( (otherlv_0= NumberSign (otherlv_1= Low | otherlv_2= High ) otherlv_3= LeftParenthesis ( (lv_value_4_0= ruleExpression ) ) otherlv_5= RightParenthesis ) )
            // InternalPds16asmParser.g:3686:2: (otherlv_0= NumberSign (otherlv_1= Low | otherlv_2= High ) otherlv_3= LeftParenthesis ( (lv_value_4_0= ruleExpression ) ) otherlv_5= RightParenthesis )
            {
            // InternalPds16asmParser.g:3686:2: (otherlv_0= NumberSign (otherlv_1= Low | otherlv_2= High ) otherlv_3= LeftParenthesis ( (lv_value_4_0= ruleExpression ) ) otherlv_5= RightParenthesis )
            // InternalPds16asmParser.g:3687:3: otherlv_0= NumberSign (otherlv_1= Low | otherlv_2= High ) otherlv_3= LeftParenthesis ( (lv_value_4_0= ruleExpression ) ) otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,NumberSign,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLowOrHightAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asmParser.g:3691:3: (otherlv_1= Low | otherlv_2= High )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Low) ) {
                alt59=1;
            }
            else if ( (LA59_0==High) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalPds16asmParser.g:3692:4: otherlv_1= Low
                    {
                    otherlv_1=(Token)match(input,Low,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getLowOrHightAccess().getLowKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asmParser.g:3697:4: otherlv_2= High
                    {
                    otherlv_2=(Token)match(input,High,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getLowOrHightAccess().getHighKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getLowOrHightAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPds16asmParser.g:3706:3: ( (lv_value_4_0= ruleExpression ) )
            // InternalPds16asmParser.g:3707:4: (lv_value_4_0= ruleExpression )
            {
            // InternalPds16asmParser.g:3707:4: (lv_value_4_0= ruleExpression )
            // InternalPds16asmParser.g:3708:5: lv_value_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLowOrHightAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNumber"
    // InternalPds16asmParser.g:3733:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalPds16asmParser.g:3733:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalPds16asmParser.g:3734:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPds16asmParser.g:3740:1: ruleNumber returns [EObject current=null] : ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;


        	enterRule();

        try {
            // InternalPds16asmParser.g:3746:2: ( ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) ) )
            // InternalPds16asmParser.g:3747:2: ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) )
            {
            // InternalPds16asmParser.g:3747:2: ( ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) ) )
            // InternalPds16asmParser.g:3748:3: ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) )
            {
            // InternalPds16asmParser.g:3748:3: ( (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR ) )
            // InternalPds16asmParser.g:3749:4: (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR )
            {
            // InternalPds16asmParser.g:3749:4: (lv_value_0_1= RULE_INT | lv_value_0_2= RULE_HEX | lv_value_0_3= RULE_OCT | lv_value_0_4= RULE_BIN | lv_value_0_5= RULE_CHAR )
            int alt60=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt60=1;
                }
                break;
            case RULE_HEX:
                {
                alt60=2;
                }
                break;
            case RULE_OCT:
                {
                alt60=3;
                }
                break;
            case RULE_BIN:
                {
                alt60=4;
                }
                break;
            case RULE_CHAR:
                {
                alt60=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalPds16asmParser.g:3750:5: lv_value_0_1= RULE_INT
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
                    // InternalPds16asmParser.g:3765:5: lv_value_0_2= RULE_HEX
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
                    // InternalPds16asmParser.g:3780:5: lv_value_0_3= RULE_OCT
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
                    // InternalPds16asmParser.g:3795:5: lv_value_0_4= RULE_BIN
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
                    // InternalPds16asmParser.g:3810:5: lv_value_0_5= RULE_CHAR
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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\31\1\uffff\2\112\1\107\1\110\1\112\1\uffff\1\107\1\103\2\uffff";
    static final String dfa_3s = "\1\101\1\uffff\2\112\1\107\1\123\1\112\1\uffff\1\107\1\112\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\2\2\uffff\1\3\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\22\uffff\1\3\1\1\23\uffff\1\2",
            "",
            "\1\4",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\3\7\1\uffff\2\7\1\uffff\1\7",
            "\1\10",
            "",
            "\1\11",
            "\1\12\6\uffff\1\13",
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
            return "1247:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\73\2\112\1\107\1\110\1\112\1\uffff\1\107\1\103\2\uffff";
    static final String dfa_9s = "\1\102\2\112\1\107\1\123\1\112\1\uffff\1\107\1\112\2\uffff";
    static final String dfa_10s = "\6\uffff\1\1\2\uffff\1\3\1\2";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\6\uffff\1\1",
            "\1\3",
            "\1\3",
            "\1\4",
            "\1\5\3\uffff\3\6\1\uffff\2\6\1\uffff\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\12\6\uffff\1\11",
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
            return "1301:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFBFFFFFDFFFF2L,0x0000000000040007L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xFFFFBFFFFFDFFFF0L,0x0000000000040007L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000000000197000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000197000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x00000000000B7000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x00000000000B7000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000097000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020410L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});

}
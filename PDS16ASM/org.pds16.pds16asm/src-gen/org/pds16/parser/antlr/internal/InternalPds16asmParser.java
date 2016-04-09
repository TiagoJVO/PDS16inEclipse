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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMT", "RULE_INT", "RULE_HEX", "RULE_STRING", "RULE_BIN", "RULE_OCT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ldi'", "'ldih'", "'ld'", "'ldb'", "'st'", "'stb'", "'add'", "'addf'", "'adc'", "'adcf'", "'sub'", "'subf'", "'sbb'", "'sbbf'", "'subr'", "'anl'", "'anlf'", "'orl'", "'orlf'", "'xrl'", "'xrlf'", "'not'", "'notf'", "'shl'", "'shr'", "'rrl'", "'rrm'", "'rcr'", "'rcl'", "'jz'", "'je'", "'jnz'", "'jne'", "'jc'", "'jbl'", "'jnc'", "'jae'", "'jmp'", "'jmpl'", "','", "'['", "']'", "'#'", "'r0'", "'r1'", "'r2'", "'r3'", "'r4'", "'r5'", "'r6'", "'r7'", "'PSW'"
    };
    public static final int RULE_HEX=6;
    public static final int T__50=50;
    public static final int RULE_OCT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_BIN=8;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_COMT=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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
    // InternalPds16asm.g:71:1: rulePDS16ASM returns [EObject current=null] : ( (lv_instuctions_0_0= ruleInstructions ) )* ;
    public final EObject rulePDS16ASM() throws RecognitionException {
        EObject current = null;

        EObject lv_instuctions_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:77:2: ( ( (lv_instuctions_0_0= ruleInstructions ) )* )
            // InternalPds16asm.g:78:2: ( (lv_instuctions_0_0= ruleInstructions ) )*
            {
            // InternalPds16asm.g:78:2: ( (lv_instuctions_0_0= ruleInstructions ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMT||(LA1_0>=15 && LA1_0<=53)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPds16asm.g:79:3: (lv_instuctions_0_0= ruleInstructions )
            	    {
            	    // InternalPds16asm.g:79:3: (lv_instuctions_0_0= ruleInstructions )
            	    // InternalPds16asm.g:80:4: lv_instuctions_0_0= ruleInstructions
            	    {

            	    				newCompositeNode(grammarAccess.getPDS16ASMAccess().getInstuctionsInstructionsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instuctions_0_0=ruleInstructions();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPDS16ASMRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instuctions",
            	    					lv_instuctions_0_0,
            	    					"org.pds16.Pds16asm.Instructions");
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


    // $ANTLR start "entryRuleInstructions"
    // InternalPds16asm.g:100:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalPds16asm.g:100:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalPds16asm.g:101:2: iv_ruleInstructions= ruleInstructions EOF
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
    // InternalPds16asm.g:107:1: ruleInstructions returns [EObject current=null] : (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Comment_5= ruleComment ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Store_1 = null;

        EObject this_Aritmetica_2 = null;

        EObject this_Logica_3 = null;

        EObject this_Jump_4 = null;

        EObject this_Comment_5 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:113:2: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Comment_5= ruleComment ) )
            // InternalPds16asm.g:114:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Comment_5= ruleComment )
            {
            // InternalPds16asm.g:114:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_Aritmetica_2= ruleAritmetica | this_Logica_3= ruleLogica | this_Jump_4= ruleJump | this_Comment_5= ruleComment )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
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
                {
                alt2=4;
                }
                break;
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
                {
                alt2=5;
                }
                break;
            case RULE_COMT:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPds16asm.g:115:3: this_Load_0= ruleLoad
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
                    // InternalPds16asm.g:124:3: this_Store_1= ruleStore
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
                    // InternalPds16asm.g:133:3: this_Aritmetica_2= ruleAritmetica
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
                    // InternalPds16asm.g:142:3: this_Logica_3= ruleLogica
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
                    // InternalPds16asm.g:151:3: this_Jump_4= ruleJump
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
                    // InternalPds16asm.g:160:3: this_Comment_5= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getCommentParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_5=ruleComment();

                    state._fsp--;


                    			current = this_Comment_5;
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


    // $ANTLR start "entryRuleComment"
    // InternalPds16asm.g:172:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalPds16asm.g:172:48: (iv_ruleComment= ruleComment EOF )
            // InternalPds16asm.g:173:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalPds16asm.g:179:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_COMT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:185:2: ( ( (lv_comment_0_0= RULE_COMT ) ) )
            // InternalPds16asm.g:186:2: ( (lv_comment_0_0= RULE_COMT ) )
            {
            // InternalPds16asm.g:186:2: ( (lv_comment_0_0= RULE_COMT ) )
            // InternalPds16asm.g:187:3: (lv_comment_0_0= RULE_COMT )
            {
            // InternalPds16asm.g:187:3: (lv_comment_0_0= RULE_COMT )
            // InternalPds16asm.g:188:4: lv_comment_0_0= RULE_COMT
            {
            lv_comment_0_0=(Token)match(input,RULE_COMT,FOLLOW_2); 

            				newLeafNode(lv_comment_0_0, grammarAccess.getCommentAccess().getCommentCOMTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"comment",
            					lv_comment_0_0,
            					"org.pds16.Pds16asm.COMT");
            			

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleLoad"
    // InternalPds16asm.g:207:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalPds16asm.g:207:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalPds16asm.g:208:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalPds16asm.g:214:1: ruleLoad returns [EObject current=null] : (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        EObject this_LdImmediate_0 = null;

        EObject this_LdDirect_1 = null;

        EObject this_LdIndexed_2 = null;

        EObject this_LdBasedIndexed_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:220:2: ( (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) )
            // InternalPds16asm.g:221:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            {
            // InternalPds16asm.g:221:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalPds16asm.g:222:3: this_LdImmediate_0= ruleLdImmediate
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
                    // InternalPds16asm.g:231:3: this_LdDirect_1= ruleLdDirect
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
                    // InternalPds16asm.g:240:3: this_LdIndexed_2= ruleLdIndexed
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
                    // InternalPds16asm.g:249:3: this_LdBasedIndexed_3= ruleLdBasedIndexed
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
    // InternalPds16asm.g:261:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalPds16asm.g:261:46: (iv_ruleStore= ruleStore EOF )
            // InternalPds16asm.g:262:2: iv_ruleStore= ruleStore EOF
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
    // InternalPds16asm.g:268:1: ruleStore returns [EObject current=null] : (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        EObject this_StDirect_0 = null;

        EObject this_StIndexed_1 = null;

        EObject this_StBasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:274:2: ( (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) )
            // InternalPds16asm.g:275:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            {
            // InternalPds16asm.g:275:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalPds16asm.g:276:3: this_StDirect_0= ruleStDirect
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
                    // InternalPds16asm.g:285:3: this_StIndexed_1= ruleStIndexed
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
                    // InternalPds16asm.g:294:3: this_StBasedIndexed_2= ruleStBasedIndexed
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
    // InternalPds16asm.g:306:1: entryRuleAritmetica returns [EObject current=null] : iv_ruleAritmetica= ruleAritmetica EOF ;
    public final EObject entryRuleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAritmetica = null;


        try {
            // InternalPds16asm.g:306:51: (iv_ruleAritmetica= ruleAritmetica EOF )
            // InternalPds16asm.g:307:2: iv_ruleAritmetica= ruleAritmetica EOF
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
    // InternalPds16asm.g:313:1: ruleAritmetica returns [EObject current=null] : (this_Add_0= ruleAdd | this_Sub_1= ruleSub ) ;
    public final EObject ruleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Sub_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:319:2: ( (this_Add_0= ruleAdd | this_Sub_1= ruleSub ) )
            // InternalPds16asm.g:320:2: (this_Add_0= ruleAdd | this_Sub_1= ruleSub )
            {
            // InternalPds16asm.g:320:2: (this_Add_0= ruleAdd | this_Sub_1= ruleSub )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=24)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=25 && LA5_0<=29)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPds16asm.g:321:3: this_Add_0= ruleAdd
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
                    // InternalPds16asm.g:330:3: this_Sub_1= ruleSub
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
    // InternalPds16asm.g:342:1: entryRuleLogica returns [EObject current=null] : iv_ruleLogica= ruleLogica EOF ;
    public final EObject entryRuleLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogica = null;


        try {
            // InternalPds16asm.g:342:47: (iv_ruleLogica= ruleLogica EOF )
            // InternalPds16asm.g:343:2: iv_ruleLogica= ruleLogica EOF
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
    // InternalPds16asm.g:349:1: ruleLogica returns [EObject current=null] : (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc ) ;
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
            // InternalPds16asm.g:355:2: ( (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc ) )
            // InternalPds16asm.g:356:2: (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc )
            {
            // InternalPds16asm.g:356:2: (this_Anl_0= ruleAnl | this_Orl_1= ruleOrl | this_Xrl_2= ruleXrl | this_Not_3= ruleNot | this_Shl_4= ruleShl | this_Shr_5= ruleShr | this_Rr_6= ruleRr | this_Rc_7= ruleRc )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
            case 33:
                {
                alt6=2;
                }
                break;
            case 34:
            case 35:
                {
                alt6=3;
                }
                break;
            case 36:
            case 37:
                {
                alt6=4;
                }
                break;
            case 38:
                {
                alt6=5;
                }
                break;
            case 39:
                {
                alt6=6;
                }
                break;
            case 40:
            case 41:
                {
                alt6=7;
                }
                break;
            case 42:
            case 43:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPds16asm.g:357:3: this_Anl_0= ruleAnl
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
                    // InternalPds16asm.g:366:3: this_Orl_1= ruleOrl
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
                    // InternalPds16asm.g:375:3: this_Xrl_2= ruleXrl
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
                    // InternalPds16asm.g:384:3: this_Not_3= ruleNot
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
                    // InternalPds16asm.g:393:3: this_Shl_4= ruleShl
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
                    // InternalPds16asm.g:402:3: this_Shr_5= ruleShr
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
                    // InternalPds16asm.g:411:3: this_Rr_6= ruleRr
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
                    // InternalPds16asm.g:420:3: this_Rc_7= ruleRc
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
    // InternalPds16asm.g:432:1: entryRuleJump returns [EObject current=null] : iv_ruleJump= ruleJump EOF ;
    public final EObject entryRuleJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJump = null;


        try {
            // InternalPds16asm.g:432:45: (iv_ruleJump= ruleJump EOF )
            // InternalPds16asm.g:433:2: iv_ruleJump= ruleJump EOF
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
    // InternalPds16asm.g:439:1: ruleJump returns [EObject current=null] : this_JumpOp_0= ruleJumpOp ;
    public final EObject ruleJump() throws RecognitionException {
        EObject current = null;

        EObject this_JumpOp_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:445:2: (this_JumpOp_0= ruleJumpOp )
            // InternalPds16asm.g:446:2: this_JumpOp_0= ruleJumpOp
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
    // InternalPds16asm.g:457:1: entryRuleLdImmediate returns [EObject current=null] : iv_ruleLdImmediate= ruleLdImmediate EOF ;
    public final EObject entryRuleLdImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdImmediate = null;


        try {
            // InternalPds16asm.g:457:52: (iv_ruleLdImmediate= ruleLdImmediate EOF )
            // InternalPds16asm.g:458:2: iv_ruleLdImmediate= ruleLdImmediate EOF
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
    // InternalPds16asm.g:464:1: ruleLdImmediate returns [EObject current=null] : ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate ) ;
    public final EObject ruleLdImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Immediate_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:470:2: ( ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate ) )
            // InternalPds16asm.g:471:2: ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate )
            {
            // InternalPds16asm.g:471:2: ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate )
            // InternalPds16asm.g:472:3: (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate
            {
            // InternalPds16asm.g:472:3: (otherlv_0= 'ldi' | otherlv_1= 'ldih' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPds16asm.g:473:4: otherlv_0= 'ldi'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdImmediateAccess().getLdiKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:478:4: otherlv_1= 'ldih'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_4); 

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
    // InternalPds16asm.g:495:1: entryRuleLdDirect returns [EObject current=null] : iv_ruleLdDirect= ruleLdDirect EOF ;
    public final EObject entryRuleLdDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdDirect = null;


        try {
            // InternalPds16asm.g:495:49: (iv_ruleLdDirect= ruleLdDirect EOF )
            // InternalPds16asm.g:496:2: iv_ruleLdDirect= ruleLdDirect EOF
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
    // InternalPds16asm.g:502:1: ruleLdDirect returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleLdDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:508:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect ) )
            // InternalPds16asm.g:509:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asm.g:509:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect )
            // InternalPds16asm.g:510:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect
            {
            // InternalPds16asm.g:510:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPds16asm.g:511:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdDirectAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:516:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

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
    // InternalPds16asm.g:533:1: entryRuleLdIndexed returns [EObject current=null] : iv_ruleLdIndexed= ruleLdIndexed EOF ;
    public final EObject entryRuleLdIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdIndexed = null;


        try {
            // InternalPds16asm.g:533:50: (iv_ruleLdIndexed= ruleLdIndexed EOF )
            // InternalPds16asm.g:534:2: iv_ruleLdIndexed= ruleLdIndexed EOF
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
    // InternalPds16asm.g:540:1: ruleLdIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleLdIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:546:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asm.g:547:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asm.g:547:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed )
            // InternalPds16asm.g:548:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asm.g:548:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPds16asm.g:549:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:554:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

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
    // InternalPds16asm.g:571:1: entryRuleLdBasedIndexed returns [EObject current=null] : iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF ;
    public final EObject entryRuleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdBasedIndexed = null;


        try {
            // InternalPds16asm.g:571:55: (iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF )
            // InternalPds16asm.g:572:2: iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF
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
    // InternalPds16asm.g:578:1: ruleLdBasedIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:584:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asm.g:585:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asm.g:585:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asm.g:586:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asm.g:586:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPds16asm.g:587:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdBasedIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:592:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

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
    // InternalPds16asm.g:609:1: entryRuleStDirect returns [EObject current=null] : iv_ruleStDirect= ruleStDirect EOF ;
    public final EObject entryRuleStDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStDirect = null;


        try {
            // InternalPds16asm.g:609:49: (iv_ruleStDirect= ruleStDirect EOF )
            // InternalPds16asm.g:610:2: iv_ruleStDirect= ruleStDirect EOF
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
    // InternalPds16asm.g:616:1: ruleStDirect returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleStDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:622:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect ) )
            // InternalPds16asm.g:623:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asm.g:623:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect )
            // InternalPds16asm.g:624:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect
            {
            // InternalPds16asm.g:624:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPds16asm.g:625:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStDirectAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:630:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

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
    // InternalPds16asm.g:647:1: entryRuleStIndexed returns [EObject current=null] : iv_ruleStIndexed= ruleStIndexed EOF ;
    public final EObject entryRuleStIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStIndexed = null;


        try {
            // InternalPds16asm.g:647:50: (iv_ruleStIndexed= ruleStIndexed EOF )
            // InternalPds16asm.g:648:2: iv_ruleStIndexed= ruleStIndexed EOF
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
    // InternalPds16asm.g:654:1: ruleStIndexed returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleStIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:660:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asm.g:661:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asm.g:661:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed )
            // InternalPds16asm.g:662:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asm.g:662:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPds16asm.g:663:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:668:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

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
    // InternalPds16asm.g:685:1: entryRuleStBasedIndexed returns [EObject current=null] : iv_ruleStBasedIndexed= ruleStBasedIndexed EOF ;
    public final EObject entryRuleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStBasedIndexed = null;


        try {
            // InternalPds16asm.g:685:55: (iv_ruleStBasedIndexed= ruleStBasedIndexed EOF )
            // InternalPds16asm.g:686:2: iv_ruleStBasedIndexed= ruleStBasedIndexed EOF
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
    // InternalPds16asm.g:692:1: ruleStBasedIndexed returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:698:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asm.g:699:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asm.g:699:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asm.g:700:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asm.g:700:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPds16asm.g:701:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStBasedIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:706:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

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
    // InternalPds16asm.g:723:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalPds16asm.g:723:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalPds16asm.g:724:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalPds16asm.g:730:1: ruleAdd returns [EObject current=null] : ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_OperationsWithConstant_4 = null;

        EObject this_OperationsWithTreeRegisters_5 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:736:2: ( ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) )
            // InternalPds16asm.g:737:2: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
            {
            // InternalPds16asm.g:737:2: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asm.g:738:3: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:738:3: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPds16asm.g:739:4: otherlv_0= 'add'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:744:4: otherlv_1= 'addf'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddfKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:749:4: otherlv_2= 'adc'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getAddAccess().getAdcKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:754:4: otherlv_3= 'adcf'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddAccess().getAdcfKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalPds16asm.g:759:3: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalPds16asm.g:760:4: this_OperationsWithConstant_4= ruleOperationsWithConstant
                    {

                    				newCompositeNode(grammarAccess.getAddAccess().getOperationsWithConstantParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_OperationsWithConstant_4=ruleOperationsWithConstant();

                    state._fsp--;


                    				current = this_OperationsWithConstant_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:769:4: this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters
                    {

                    				newCompositeNode(grammarAccess.getAddAccess().getOperationsWithTreeRegistersParserRuleCall_1_1());
                    			
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
    // InternalPds16asm.g:782:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalPds16asm.g:782:44: (iv_ruleSub= ruleSub EOF )
            // InternalPds16asm.g:783:2: iv_ruleSub= ruleSub EOF
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
    // InternalPds16asm.g:789:1: ruleSub returns [EObject current=null] : ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) ) ;
    public final EObject ruleSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject this_OperationsWithConstant_4 = null;

        EObject this_OperationsWithTreeRegisters_5 = null;

        EObject this_OperationsWithTreeRegisters_7 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:795:2: ( ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) ) )
            // InternalPds16asm.g:796:2: ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) )
            {
            // InternalPds16asm.g:796:2: ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) ) | (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=25 && LA18_0<=28)) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPds16asm.g:797:3: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    {
                    // InternalPds16asm.g:797:3: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters ) )
                    // InternalPds16asm.g:798:4: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asm.g:798:4: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' )
                    int alt16=4;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt16=1;
                        }
                        break;
                    case 26:
                        {
                        alt16=2;
                        }
                        break;
                    case 27:
                        {
                        alt16=3;
                        }
                        break;
                    case 28:
                        {
                        alt16=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // InternalPds16asm.g:799:5: otherlv_0= 'sub'
                            {
                            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                            					newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:804:5: otherlv_1= 'subf'
                            {
                            otherlv_1=(Token)match(input,26,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getSubAccess().getSubfKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalPds16asm.g:809:5: otherlv_2= 'sbb'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getSubAccess().getSbbKeyword_0_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalPds16asm.g:814:5: otherlv_3= 'sbbf'
                            {
                            otherlv_3=(Token)match(input,28,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getSubAccess().getSbbfKeyword_0_0_3());
                            				

                            }
                            break;

                    }

                    // InternalPds16asm.g:819:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // InternalPds16asm.g:820:5: this_OperationsWithConstant_4= ruleOperationsWithConstant
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
                            // InternalPds16asm.g:829:5: this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters
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
                    // InternalPds16asm.g:840:3: (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters )
                    {
                    // InternalPds16asm.g:840:3: (otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters )
                    // InternalPds16asm.g:841:4: otherlv_6= 'subr' this_OperationsWithTreeRegisters_7= ruleOperationsWithTreeRegisters
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_4); 

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
    // InternalPds16asm.g:858:1: entryRuleAnl returns [EObject current=null] : iv_ruleAnl= ruleAnl EOF ;
    public final EObject entryRuleAnl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnl = null;


        try {
            // InternalPds16asm.g:858:44: (iv_ruleAnl= ruleAnl EOF )
            // InternalPds16asm.g:859:2: iv_ruleAnl= ruleAnl EOF
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
    // InternalPds16asm.g:865:1: ruleAnl returns [EObject current=null] : ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) ;
    public final EObject ruleAnl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:871:2: ( ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asm.g:872:2: ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:872:2: ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            // InternalPds16asm.g:873:3: (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
            {
            // InternalPds16asm.g:873:3: (otherlv_0= 'anl' | otherlv_1= 'anlf' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPds16asm.g:874:4: otherlv_0= 'anl'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getAnlAccess().getAnlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:879:4: otherlv_1= 'anlf'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_4); 

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
    // InternalPds16asm.g:896:1: entryRuleOrl returns [EObject current=null] : iv_ruleOrl= ruleOrl EOF ;
    public final EObject entryRuleOrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrl = null;


        try {
            // InternalPds16asm.g:896:44: (iv_ruleOrl= ruleOrl EOF )
            // InternalPds16asm.g:897:2: iv_ruleOrl= ruleOrl EOF
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
    // InternalPds16asm.g:903:1: ruleOrl returns [EObject current=null] : ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) ;
    public final EObject ruleOrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:909:2: ( ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asm.g:910:2: ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:910:2: ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            // InternalPds16asm.g:911:3: (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
            {
            // InternalPds16asm.g:911:3: (otherlv_0= 'orl' | otherlv_1= 'orlf' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            else if ( (LA20_0==33) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPds16asm.g:912:4: otherlv_0= 'orl'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getOrlAccess().getOrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:917:4: otherlv_1= 'orlf'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrlAccess().getOrlfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getOrlAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
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
    // $ANTLR end "ruleOrl"


    // $ANTLR start "entryRuleXrl"
    // InternalPds16asm.g:934:1: entryRuleXrl returns [EObject current=null] : iv_ruleXrl= ruleXrl EOF ;
    public final EObject entryRuleXrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXrl = null;


        try {
            // InternalPds16asm.g:934:44: (iv_ruleXrl= ruleXrl EOF )
            // InternalPds16asm.g:935:2: iv_ruleXrl= ruleXrl EOF
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
    // InternalPds16asm.g:941:1: ruleXrl returns [EObject current=null] : ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) ;
    public final EObject ruleXrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:947:2: ( ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters ) )
            // InternalPds16asm.g:948:2: ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:948:2: ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters )
            // InternalPds16asm.g:949:3: (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_OperationsWithTreeRegisters_2= ruleOperationsWithTreeRegisters
            {
            // InternalPds16asm.g:949:3: (otherlv_0= 'xrl' | otherlv_1= 'xrlf' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPds16asm.g:950:4: otherlv_0= 'xrl'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getXrlAccess().getXrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:955:4: otherlv_1= 'xrlf'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_4); 

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
    // InternalPds16asm.g:972:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalPds16asm.g:972:44: (iv_ruleNot= ruleNot EOF )
            // InternalPds16asm.g:973:2: iv_ruleNot= ruleNot EOF
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
    // InternalPds16asm.g:979:1: ruleNot returns [EObject current=null] : ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:985:2: ( ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) )
            // InternalPds16asm.g:986:2: ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            {
            // InternalPds16asm.g:986:2: ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            // InternalPds16asm.g:987:3: (otherlv_0= 'not' | otherlv_1= 'notf' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters
            {
            // InternalPds16asm.g:987:3: (otherlv_0= 'not' | otherlv_1= 'notf' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPds16asm.g:988:4: otherlv_0= 'not'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:993:4: otherlv_1= 'notf'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_4); 

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
    // InternalPds16asm.g:1010:1: entryRuleShl returns [EObject current=null] : iv_ruleShl= ruleShl EOF ;
    public final EObject entryRuleShl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShl = null;


        try {
            // InternalPds16asm.g:1010:44: (iv_ruleShl= ruleShl EOF )
            // InternalPds16asm.g:1011:2: iv_ruleShl= ruleShl EOF
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
    // InternalPds16asm.g:1017:1: ruleShl returns [EObject current=null] : (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift ) ;
    public final EObject ruleShl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OperationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1023:2: ( (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift ) )
            // InternalPds16asm.g:1024:2: (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift )
            {
            // InternalPds16asm.g:1024:2: (otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift )
            // InternalPds16asm.g:1025:3: otherlv_0= 'shl' this_OperationShift_1= ruleOperationShift
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

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
    // InternalPds16asm.g:1041:1: entryRuleShr returns [EObject current=null] : iv_ruleShr= ruleShr EOF ;
    public final EObject entryRuleShr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShr = null;


        try {
            // InternalPds16asm.g:1041:44: (iv_ruleShr= ruleShr EOF )
            // InternalPds16asm.g:1042:2: iv_ruleShr= ruleShr EOF
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
    // InternalPds16asm.g:1048:1: ruleShr returns [EObject current=null] : (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift ) ;
    public final EObject ruleShr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OperationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1054:2: ( (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift ) )
            // InternalPds16asm.g:1055:2: (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift )
            {
            // InternalPds16asm.g:1055:2: (otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift )
            // InternalPds16asm.g:1056:3: otherlv_0= 'shr' this_OperationShift_1= ruleOperationShift
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

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
    // InternalPds16asm.g:1072:1: entryRuleRr returns [EObject current=null] : iv_ruleRr= ruleRr EOF ;
    public final EObject entryRuleRr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRr = null;


        try {
            // InternalPds16asm.g:1072:43: (iv_ruleRr= ruleRr EOF )
            // InternalPds16asm.g:1073:2: iv_ruleRr= ruleRr EOF
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
    // InternalPds16asm.g:1079:1: ruleRr returns [EObject current=null] : ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant ) ;
    public final EObject ruleRr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationsWithConstant_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1085:2: ( ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant ) )
            // InternalPds16asm.g:1086:2: ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant )
            {
            // InternalPds16asm.g:1086:2: ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant )
            // InternalPds16asm.g:1087:3: (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_OperationsWithConstant_2= ruleOperationsWithConstant
            {
            // InternalPds16asm.g:1087:3: (otherlv_0= 'rrl' | otherlv_1= 'rrm' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPds16asm.g:1088:4: otherlv_0= 'rrl'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getRrAccess().getRrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1093:4: otherlv_1= 'rrm'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_4); 

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
    // InternalPds16asm.g:1110:1: entryRuleRc returns [EObject current=null] : iv_ruleRc= ruleRc EOF ;
    public final EObject entryRuleRc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRc = null;


        try {
            // InternalPds16asm.g:1110:43: (iv_ruleRc= ruleRc EOF )
            // InternalPds16asm.g:1111:2: iv_ruleRc= ruleRc EOF
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
    // InternalPds16asm.g:1117:1: ruleRc returns [EObject current=null] : ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) ;
    public final EObject ruleRc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_OperationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1123:2: ( ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters ) )
            // InternalPds16asm.g:1124:2: ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            {
            // InternalPds16asm.g:1124:2: ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters )
            // InternalPds16asm.g:1125:3: (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_OperationWithTwoRegisters_2= ruleOperationWithTwoRegisters
            {
            // InternalPds16asm.g:1125:3: (otherlv_0= 'rcr' | otherlv_1= 'rcl' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            else if ( (LA24_0==43) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPds16asm.g:1126:4: otherlv_0= 'rcr'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getRcAccess().getRcrKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1131:4: otherlv_1= 'rcl'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_4); 

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
    // InternalPds16asm.g:1148:1: entryRuleJumpOp returns [EObject current=null] : iv_ruleJumpOp= ruleJumpOp EOF ;
    public final EObject entryRuleJumpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpOp = null;


        try {
            // InternalPds16asm.g:1148:47: (iv_ruleJumpOp= ruleJumpOp EOF )
            // InternalPds16asm.g:1149:2: iv_ruleJumpOp= ruleJumpOp EOF
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
    // InternalPds16asm.g:1155:1: ruleJumpOp returns [EObject current=null] : ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) this_OperationWithOffset_10= ruleOperationWithOffset ) ;
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
        EObject this_OperationWithOffset_10 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1161:2: ( ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) this_OperationWithOffset_10= ruleOperationWithOffset ) )
            // InternalPds16asm.g:1162:2: ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) this_OperationWithOffset_10= ruleOperationWithOffset )
            {
            // InternalPds16asm.g:1162:2: ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) this_OperationWithOffset_10= ruleOperationWithOffset )
            // InternalPds16asm.g:1163:3: (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) this_OperationWithOffset_10= ruleOperationWithOffset
            {
            // InternalPds16asm.g:1163:3: (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' )
            int alt25=10;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt25=1;
                }
                break;
            case 45:
                {
                alt25=2;
                }
                break;
            case 46:
                {
                alt25=3;
                }
                break;
            case 47:
                {
                alt25=4;
                }
                break;
            case 48:
                {
                alt25=5;
                }
                break;
            case 49:
                {
                alt25=6;
                }
                break;
            case 50:
                {
                alt25=7;
                }
                break;
            case 51:
                {
                alt25=8;
                }
                break;
            case 52:
                {
                alt25=9;
                }
                break;
            case 53:
                {
                alt25=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPds16asm.g:1164:4: otherlv_0= 'jz'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getJumpOpAccess().getJzKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1169:4: otherlv_1= 'je'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getJumpOpAccess().getJeKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:1174:4: otherlv_2= 'jnz'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getJumpOpAccess().getJnzKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:1179:4: otherlv_3= 'jne'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getJumpOpAccess().getJneKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:1184:4: otherlv_4= 'jc'
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getJumpOpAccess().getJcKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:1189:4: otherlv_5= 'jbl'
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getJumpOpAccess().getJblKeyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:1194:4: otherlv_6= 'jnc'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getJumpOpAccess().getJncKeyword_0_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:1199:4: otherlv_7= 'jae'
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getJumpOpAccess().getJaeKeyword_0_7());
                    			

                    }
                    break;
                case 9 :
                    // InternalPds16asm.g:1204:4: otherlv_8= 'jmp'
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getJumpOpAccess().getJmpKeyword_0_8());
                    			

                    }
                    break;
                case 10 :
                    // InternalPds16asm.g:1209:4: otherlv_9= 'jmpl'
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getJumpOpAccess().getJmplKeyword_0_9());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getJumpOpAccess().getOperationWithOffsetParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationWithOffset_10=ruleOperationWithOffset();

            state._fsp--;


            			current = this_OperationWithOffset_10;
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
    // $ANTLR end "ruleJumpOp"


    // $ANTLR start "entryRuleImmediate"
    // InternalPds16asm.g:1226:1: entryRuleImmediate returns [EObject current=null] : iv_ruleImmediate= ruleImmediate EOF ;
    public final EObject entryRuleImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate = null;


        try {
            // InternalPds16asm.g:1226:50: (iv_ruleImmediate= ruleImmediate EOF )
            // InternalPds16asm.g:1227:2: iv_ruleImmediate= ruleImmediate EOF
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
    // InternalPds16asm.g:1233:1: ruleImmediate returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleIntOrHexOrString ) ) ) ;
    public final EObject ruleImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_register_0_0 = null;

        AntlrDatatypeRuleToken lv_immediate8_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1239:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleIntOrHexOrString ) ) ) )
            // InternalPds16asm.g:1240:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleIntOrHexOrString ) ) )
            {
            // InternalPds16asm.g:1240:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleIntOrHexOrString ) ) )
            // InternalPds16asm.g:1241:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleIntOrHexOrString ) )
            {
            // InternalPds16asm.g:1241:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1242:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1242:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:1243:5: lv_register_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getImmediateAccess().getRegisterRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_register_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImmediateRule());
            					}
            					set(
            						current,
            						"register",
            						lv_register_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImmediateAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1264:3: ( (lv_immediate8_2_0= ruleIntOrHexOrString ) )
            // InternalPds16asm.g:1265:4: (lv_immediate8_2_0= ruleIntOrHexOrString )
            {
            // InternalPds16asm.g:1265:4: (lv_immediate8_2_0= ruleIntOrHexOrString )
            // InternalPds16asm.g:1266:5: lv_immediate8_2_0= ruleIntOrHexOrString
            {

            					newCompositeNode(grammarAccess.getImmediateAccess().getImmediate8IntOrHexOrStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_immediate8_2_0=ruleIntOrHexOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImmediateRule());
            					}
            					set(
            						current,
            						"immediate8",
            						lv_immediate8_2_0,
            						"org.pds16.Pds16asm.IntOrHexOrString");
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
    // $ANTLR end "ruleImmediate"


    // $ANTLR start "entryRuleDirect"
    // InternalPds16asm.g:1287:1: entryRuleDirect returns [EObject current=null] : iv_ruleDirect= ruleDirect EOF ;
    public final EObject entryRuleDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirect = null;


        try {
            // InternalPds16asm.g:1287:47: (iv_ruleDirect= ruleDirect EOF )
            // InternalPds16asm.g:1288:2: iv_ruleDirect= ruleDirect EOF
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
    // InternalPds16asm.g:1294:1: ruleDirect returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' (this_INT_2= RULE_INT | this_HEX_3= RULE_HEX | this_STRING_4= RULE_STRING ) ) ;
    public final EObject ruleDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INT_2=null;
        Token this_HEX_3=null;
        Token this_STRING_4=null;
        EObject lv_register_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1300:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' (this_INT_2= RULE_INT | this_HEX_3= RULE_HEX | this_STRING_4= RULE_STRING ) ) )
            // InternalPds16asm.g:1301:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' (this_INT_2= RULE_INT | this_HEX_3= RULE_HEX | this_STRING_4= RULE_STRING ) )
            {
            // InternalPds16asm.g:1301:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' (this_INT_2= RULE_INT | this_HEX_3= RULE_HEX | this_STRING_4= RULE_STRING ) )
            // InternalPds16asm.g:1302:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' (this_INT_2= RULE_INT | this_HEX_3= RULE_HEX | this_STRING_4= RULE_STRING )
            {
            // InternalPds16asm.g:1302:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1303:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1303:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:1304:5: lv_register_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getDirectAccess().getRegisterRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_register_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectRule());
            					}
            					set(
            						current,
            						"register",
            						lv_register_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1325:3: (this_INT_2= RULE_INT | this_HEX_3= RULE_HEX | this_STRING_4= RULE_STRING )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt26=1;
                }
                break;
            case RULE_HEX:
                {
                alt26=2;
                }
                break;
            case RULE_STRING:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPds16asm.g:1326:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_2, grammarAccess.getDirectAccess().getINTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1331:4: this_HEX_3= RULE_HEX
                    {
                    this_HEX_3=(Token)match(input,RULE_HEX,FOLLOW_2); 

                    				newLeafNode(this_HEX_3, grammarAccess.getDirectAccess().getHEXTerminalRuleCall_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:1336:4: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_4, grammarAccess.getDirectAccess().getSTRINGTerminalRuleCall_2_2());
                    			

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
    // $ANTLR end "ruleDirect"


    // $ANTLR start "entryRuleIndexed"
    // InternalPds16asm.g:1345:1: entryRuleIndexed returns [EObject current=null] : iv_ruleIndexed= ruleIndexed EOF ;
    public final EObject entryRuleIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexed = null;


        try {
            // InternalPds16asm.g:1345:48: (iv_ruleIndexed= ruleIndexed EOF )
            // InternalPds16asm.g:1346:2: iv_ruleIndexed= ruleIndexed EOF
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
    // InternalPds16asm.g:1352:1: ruleIndexed returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIntOrHexOrString ) ) otherlv_6= ']' ) ;
    public final EObject ruleIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rbx_3_0 = null;

        AntlrDatatypeRuleToken lv_idx3_5_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1358:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIntOrHexOrString ) ) otherlv_6= ']' ) )
            // InternalPds16asm.g:1359:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIntOrHexOrString ) ) otherlv_6= ']' )
            {
            // InternalPds16asm.g:1359:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIntOrHexOrString ) ) otherlv_6= ']' )
            // InternalPds16asm.g:1360:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_idx3_5_0= ruleIntOrHexOrString ) ) otherlv_6= ']'
            {
            // InternalPds16asm.g:1360:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1361:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1361:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1362:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:1387:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:1388:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:1388:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:1389:5: lv_rbx_3_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getRbxRegistersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rbx_3_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"rbx",
            						lv_rbx_3_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:1410:3: ( (lv_idx3_5_0= ruleIntOrHexOrString ) )
            // InternalPds16asm.g:1411:4: (lv_idx3_5_0= ruleIntOrHexOrString )
            {
            // InternalPds16asm.g:1411:4: (lv_idx3_5_0= ruleIntOrHexOrString )
            // InternalPds16asm.g:1412:5: lv_idx3_5_0= ruleIntOrHexOrString
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getIdx3IntOrHexOrStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_idx3_5_0=ruleIntOrHexOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexedRule());
            					}
            					set(
            						current,
            						"idx3",
            						lv_idx3_5_0,
            						"org.pds16.Pds16asm.IntOrHexOrString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,56,FOLLOW_2); 

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
    // InternalPds16asm.g:1437:1: entryRuleBasedIndexed returns [EObject current=null] : iv_ruleBasedIndexed= ruleBasedIndexed EOF ;
    public final EObject entryRuleBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasedIndexed = null;


        try {
            // InternalPds16asm.g:1437:53: (iv_ruleBasedIndexed= ruleBasedIndexed EOF )
            // InternalPds16asm.g:1438:2: iv_ruleBasedIndexed= ruleBasedIndexed EOF
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
    // InternalPds16asm.g:1444:1: ruleBasedIndexed returns [EObject current=null] : (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) ;
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
            // InternalPds16asm.g:1450:2: ( (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) )
            // InternalPds16asm.g:1451:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            {
            // InternalPds16asm.g:1451:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            // InternalPds16asm.g:1452:3: this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']'
            {

            			newCompositeNode(grammarAccess.getBasedIndexedAccess().getRegistersParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Registers_0=ruleRegisters();

            state._fsp--;


            			current = this_Registers_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBasedIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBasedIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:1468:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:1469:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:1469:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:1470:5: lv_rbx_3_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getBasedIndexedAccess().getRbxRegistersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rbx_3_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasedIndexedRule());
            					}
            					set(
            						current,
            						"rbx",
            						lv_rbx_3_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getBasedIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:1491:3: ( (lv_rix_5_0= ruleRegisters ) )
            // InternalPds16asm.g:1492:4: (lv_rix_5_0= ruleRegisters )
            {
            // InternalPds16asm.g:1492:4: (lv_rix_5_0= ruleRegisters )
            // InternalPds16asm.g:1493:5: lv_rix_5_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getBasedIndexedAccess().getRixRegistersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_rix_5_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasedIndexedRule());
            					}
            					set(
            						current,
            						"rix",
            						lv_rix_5_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,56,FOLLOW_2); 

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


    // $ANTLR start "entryRuleIntOrHexOrString"
    // InternalPds16asm.g:1518:1: entryRuleIntOrHexOrString returns [String current=null] : iv_ruleIntOrHexOrString= ruleIntOrHexOrString EOF ;
    public final String entryRuleIntOrHexOrString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntOrHexOrString = null;


        try {
            // InternalPds16asm.g:1518:56: (iv_ruleIntOrHexOrString= ruleIntOrHexOrString EOF )
            // InternalPds16asm.g:1519:2: iv_ruleIntOrHexOrString= ruleIntOrHexOrString EOF
            {
             newCompositeNode(grammarAccess.getIntOrHexOrStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntOrHexOrString=ruleIntOrHexOrString();

            state._fsp--;

             current =iv_ruleIntOrHexOrString.getText(); 
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
    // $ANTLR end "entryRuleIntOrHexOrString"


    // $ANTLR start "ruleIntOrHexOrString"
    // InternalPds16asm.g:1525:1: ruleIntOrHexOrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '#' this_INT_1= RULE_INT ) | this_HEX_2= RULE_HEX ) | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIntOrHexOrString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEX_2=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalPds16asm.g:1531:2: ( ( ( (kw= '#' this_INT_1= RULE_INT ) | this_HEX_2= RULE_HEX ) | this_STRING_3= RULE_STRING ) )
            // InternalPds16asm.g:1532:2: ( ( (kw= '#' this_INT_1= RULE_INT ) | this_HEX_2= RULE_HEX ) | this_STRING_3= RULE_STRING )
            {
            // InternalPds16asm.g:1532:2: ( ( (kw= '#' this_INT_1= RULE_INT ) | this_HEX_2= RULE_HEX ) | this_STRING_3= RULE_STRING )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_HEX||LA28_0==57) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPds16asm.g:1533:3: ( (kw= '#' this_INT_1= RULE_INT ) | this_HEX_2= RULE_HEX )
                    {
                    // InternalPds16asm.g:1533:3: ( (kw= '#' this_INT_1= RULE_INT ) | this_HEX_2= RULE_HEX )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==57) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==RULE_HEX) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalPds16asm.g:1534:4: (kw= '#' this_INT_1= RULE_INT )
                            {
                            // InternalPds16asm.g:1534:4: (kw= '#' this_INT_1= RULE_INT )
                            // InternalPds16asm.g:1535:5: kw= '#' this_INT_1= RULE_INT
                            {
                            kw=(Token)match(input,57,FOLLOW_10); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getIntOrHexOrStringAccess().getNumberSignKeyword_0_0_0());
                            				
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                            					current.merge(this_INT_1);
                            				

                            					newLeafNode(this_INT_1, grammarAccess.getIntOrHexOrStringAccess().getINTTerminalRuleCall_0_0_1());
                            				

                            }


                            }
                            break;
                        case 2 :
                            // InternalPds16asm.g:1549:4: this_HEX_2= RULE_HEX
                            {
                            this_HEX_2=(Token)match(input,RULE_HEX,FOLLOW_2); 

                            				current.merge(this_HEX_2);
                            			

                            				newLeafNode(this_HEX_2, grammarAccess.getIntOrHexOrStringAccess().getHEXTerminalRuleCall_0_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1558:3: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_3);
                    		

                    			newLeafNode(this_STRING_3, grammarAccess.getIntOrHexOrStringAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleIntOrHexOrString"


    // $ANTLR start "entryRuleOperationWithTwoRegisters"
    // InternalPds16asm.g:1569:1: entryRuleOperationWithTwoRegisters returns [EObject current=null] : iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF ;
    public final EObject entryRuleOperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationWithTwoRegisters = null;


        try {
            // InternalPds16asm.g:1569:66: (iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF )
            // InternalPds16asm.g:1570:2: iv_ruleOperationWithTwoRegisters= ruleOperationWithTwoRegisters EOF
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
    // InternalPds16asm.g:1576:1: ruleOperationWithTwoRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) ) ;
    public final EObject ruleOperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1582:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) ) )
            // InternalPds16asm.g:1583:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) )
            {
            // InternalPds16asm.g:1583:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) )
            // InternalPds16asm.g:1584:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) )
            {
            // InternalPds16asm.g:1584:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1585:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1585:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1586:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationWithTwoRegistersAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithTwoRegistersRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithTwoRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1607:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1608:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1608:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1609:5: lv_rm_2_0= ruleRegisters
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
            						"org.pds16.Pds16asm.Registers");
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
    // InternalPds16asm.g:1630:1: entryRuleOperationsWithTreeRegisters returns [EObject current=null] : iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF ;
    public final EObject entryRuleOperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsWithTreeRegisters = null;


        try {
            // InternalPds16asm.g:1630:68: (iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF )
            // InternalPds16asm.g:1631:2: iv_ruleOperationsWithTreeRegisters= ruleOperationsWithTreeRegisters EOF
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
    // InternalPds16asm.g:1637:1: ruleOperationsWithTreeRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) ) ;
    public final EObject ruleOperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;

        EObject lv_rn_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1643:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) ) )
            // InternalPds16asm.g:1644:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) )
            {
            // InternalPds16asm.g:1644:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) )
            // InternalPds16asm.g:1645:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) )
            {
            // InternalPds16asm.g:1645:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1646:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1646:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1647:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithTreeRegistersAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1668:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1669:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1669:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1670:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithTreeRegistersAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_rm_2_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithTreeRegistersRule());
            					}
            					set(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_3());
            		
            // InternalPds16asm.g:1691:3: ( (lv_rn_4_0= ruleRegisters ) )
            // InternalPds16asm.g:1692:4: (lv_rn_4_0= ruleRegisters )
            {
            // InternalPds16asm.g:1692:4: (lv_rn_4_0= ruleRegisters )
            // InternalPds16asm.g:1693:5: lv_rn_4_0= ruleRegisters
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
            						"org.pds16.Pds16asm.Registers");
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
    // InternalPds16asm.g:1714:1: entryRuleOperationsWithConstant returns [EObject current=null] : iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF ;
    public final EObject entryRuleOperationsWithConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsWithConstant = null;


        try {
            // InternalPds16asm.g:1714:63: (iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF )
            // InternalPds16asm.g:1715:2: iv_ruleOperationsWithConstant= ruleOperationsWithConstant EOF
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
    // InternalPds16asm.g:1721:1: ruleOperationsWithConstant returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) ) ;
    public final EObject ruleOperationsWithConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;

        AntlrDatatypeRuleToken lv_const4_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1727:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) ) )
            // InternalPds16asm.g:1728:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) )
            {
            // InternalPds16asm.g:1728:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) )
            // InternalPds16asm.g:1729:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) )
            {
            // InternalPds16asm.g:1729:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1730:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1730:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1731:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithConstantRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1752:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1753:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1753:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1754:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_rm_2_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithConstantRule());
            					}
            					set(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_3());
            		
            // InternalPds16asm.g:1775:3: ( (lv_const4_4_0= ruleIntOrHexOrString ) )
            // InternalPds16asm.g:1776:4: (lv_const4_4_0= ruleIntOrHexOrString )
            {
            // InternalPds16asm.g:1776:4: (lv_const4_4_0= ruleIntOrHexOrString )
            // InternalPds16asm.g:1777:5: lv_const4_4_0= ruleIntOrHexOrString
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getConst4IntOrHexOrStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_const4_4_0=ruleIntOrHexOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsWithConstantRule());
            					}
            					set(
            						current,
            						"const4",
            						lv_const4_4_0,
            						"org.pds16.Pds16asm.IntOrHexOrString");
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
    // InternalPds16asm.g:1798:1: entryRuleOperationShift returns [EObject current=null] : iv_ruleOperationShift= ruleOperationShift EOF ;
    public final EObject entryRuleOperationShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationShift = null;


        try {
            // InternalPds16asm.g:1798:55: (iv_ruleOperationShift= ruleOperationShift EOF )
            // InternalPds16asm.g:1799:2: iv_ruleOperationShift= ruleOperationShift EOF
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
    // InternalPds16asm.g:1805:1: ruleOperationShift returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) otherlv_5= ',' ( (lv_sin_6_0= RULE_BIN ) ) ) ;
    public final EObject ruleOperationShift() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_sin_6_0=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;

        AntlrDatatypeRuleToken lv_const4_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1811:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) otherlv_5= ',' ( (lv_sin_6_0= RULE_BIN ) ) ) )
            // InternalPds16asm.g:1812:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) otherlv_5= ',' ( (lv_sin_6_0= RULE_BIN ) ) )
            {
            // InternalPds16asm.g:1812:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) otherlv_5= ',' ( (lv_sin_6_0= RULE_BIN ) ) )
            // InternalPds16asm.g:1813:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_const4_4_0= ruleIntOrHexOrString ) ) otherlv_5= ',' ( (lv_sin_6_0= RULE_BIN ) )
            {
            // InternalPds16asm.g:1813:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1814:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1814:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1815:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_rd_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationShiftRule());
            					}
            					set(
            						current,
            						"rd",
            						lv_rd_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationShiftAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1836:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1837:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1837:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1838:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_rm_2_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationShiftRule());
            					}
            					set(
            						current,
            						"rm",
            						lv_rm_2_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationShiftAccess().getCommaKeyword_3());
            		
            // InternalPds16asm.g:1859:3: ( (lv_const4_4_0= ruleIntOrHexOrString ) )
            // InternalPds16asm.g:1860:4: (lv_const4_4_0= ruleIntOrHexOrString )
            {
            // InternalPds16asm.g:1860:4: (lv_const4_4_0= ruleIntOrHexOrString )
            // InternalPds16asm.g:1861:5: lv_const4_4_0= ruleIntOrHexOrString
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getConst4IntOrHexOrStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_const4_4_0=ruleIntOrHexOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationShiftRule());
            					}
            					set(
            						current,
            						"const4",
            						lv_const4_4_0,
            						"org.pds16.Pds16asm.IntOrHexOrString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationShiftAccess().getCommaKeyword_5());
            		
            // InternalPds16asm.g:1882:3: ( (lv_sin_6_0= RULE_BIN ) )
            // InternalPds16asm.g:1883:4: (lv_sin_6_0= RULE_BIN )
            {
            // InternalPds16asm.g:1883:4: (lv_sin_6_0= RULE_BIN )
            // InternalPds16asm.g:1884:5: lv_sin_6_0= RULE_BIN
            {
            lv_sin_6_0=(Token)match(input,RULE_BIN,FOLLOW_2); 

            					newLeafNode(lv_sin_6_0, grammarAccess.getOperationShiftAccess().getSinBINTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationShiftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sin",
            						lv_sin_6_0,
            						"org.pds16.Pds16asm.BIN");
            				

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
    // InternalPds16asm.g:1904:1: entryRuleOperationWithOffset returns [EObject current=null] : iv_ruleOperationWithOffset= ruleOperationWithOffset EOF ;
    public final EObject entryRuleOperationWithOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationWithOffset = null;


        try {
            // InternalPds16asm.g:1904:60: (iv_ruleOperationWithOffset= ruleOperationWithOffset EOF )
            // InternalPds16asm.g:1905:2: iv_ruleOperationWithOffset= ruleOperationWithOffset EOF
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
    // InternalPds16asm.g:1911:1: ruleOperationWithOffset returns [EObject current=null] : ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleIntOrHexOrString ) ) ) ;
    public final EObject ruleOperationWithOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rbx_0_0 = null;

        AntlrDatatypeRuleToken lv_offset8_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1917:2: ( ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleIntOrHexOrString ) ) ) )
            // InternalPds16asm.g:1918:2: ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleIntOrHexOrString ) ) )
            {
            // InternalPds16asm.g:1918:2: ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleIntOrHexOrString ) ) )
            // InternalPds16asm.g:1919:3: ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleIntOrHexOrString ) )
            {
            // InternalPds16asm.g:1919:3: ( (lv_rbx_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1920:4: (lv_rbx_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1920:4: (lv_rbx_0_0= ruleRegisters )
            // InternalPds16asm.g:1921:5: lv_rbx_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationWithOffsetAccess().getRbxRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_rbx_0_0=ruleRegisters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithOffsetRule());
            					}
            					set(
            						current,
            						"rbx",
            						lv_rbx_0_0,
            						"org.pds16.Pds16asm.Registers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithOffsetAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1942:3: ( (lv_offset8_2_0= ruleIntOrHexOrString ) )
            // InternalPds16asm.g:1943:4: (lv_offset8_2_0= ruleIntOrHexOrString )
            {
            // InternalPds16asm.g:1943:4: (lv_offset8_2_0= ruleIntOrHexOrString )
            // InternalPds16asm.g:1944:5: lv_offset8_2_0= ruleIntOrHexOrString
            {

            					newCompositeNode(grammarAccess.getOperationWithOffsetAccess().getOffset8IntOrHexOrStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_offset8_2_0=ruleIntOrHexOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithOffsetRule());
            					}
            					set(
            						current,
            						"offset8",
            						lv_offset8_2_0,
            						"org.pds16.Pds16asm.IntOrHexOrString");
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


    // $ANTLR start "entryRuleRegisters"
    // InternalPds16asm.g:1965:1: entryRuleRegisters returns [EObject current=null] : iv_ruleRegisters= ruleRegisters EOF ;
    public final EObject entryRuleRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisters = null;


        try {
            // InternalPds16asm.g:1965:50: (iv_ruleRegisters= ruleRegisters EOF )
            // InternalPds16asm.g:1966:2: iv_ruleRegisters= ruleRegisters EOF
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
    // InternalPds16asm.g:1972:1: ruleRegisters returns [EObject current=null] : ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) ) ;
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
            // InternalPds16asm.g:1978:2: ( ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) ) )
            // InternalPds16asm.g:1979:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) )
            {
            // InternalPds16asm.g:1979:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) )
            // InternalPds16asm.g:1980:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) )
            {
            // InternalPds16asm.g:1980:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) )
            // InternalPds16asm.g:1981:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' )
            {
            // InternalPds16asm.g:1981:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt29=1;
                }
                break;
            case 59:
                {
                alt29=2;
                }
                break;
            case 60:
                {
                alt29=3;
                }
                break;
            case 61:
                {
                alt29=4;
                }
                break;
            case 62:
                {
                alt29=5;
                }
                break;
            case 63:
                {
                alt29=6;
                }
                break;
            case 64:
                {
                alt29=7;
                }
                break;
            case 65:
                {
                alt29=8;
                }
                break;
            case 66:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalPds16asm.g:1982:5: lv_value_0_1= 'r0'
                    {
                    lv_value_0_1=(Token)match(input,58,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getRegistersAccess().getValueR0Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1993:5: lv_value_0_2= 'r1'
                    {
                    lv_value_0_2=(Token)match(input,59,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getRegistersAccess().getValueR1Keyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:2004:5: lv_value_0_3= 'r2'
                    {
                    lv_value_0_3=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getRegistersAccess().getValueR2Keyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:2015:5: lv_value_0_4= 'r3'
                    {
                    lv_value_0_4=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getRegistersAccess().getValueR3Keyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:2026:5: lv_value_0_5= 'r4'
                    {
                    lv_value_0_5=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getRegistersAccess().getValueR4Keyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:2037:5: lv_value_0_6= 'r5'
                    {
                    lv_value_0_6=(Token)match(input,63,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getRegistersAccess().getValueR5Keyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:2048:5: lv_value_0_7= 'r6'
                    {
                    lv_value_0_7=(Token)match(input,64,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getRegistersAccess().getValueR6Keyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:2059:5: lv_value_0_8= 'r7'
                    {
                    lv_value_0_8=(Token)match(input,65,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getRegistersAccess().getValueR7Keyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalPds16asm.g:2070:5: lv_value_0_9= 'PSW'
                    {
                    lv_value_0_9=(Token)match(input,66,FOLLOW_2); 

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\17\1\uffff\2\72\11\66\1\5\1\72\1\uffff\11\66\1\6\2\uffff";
    static final String dfa_3s = "\1\22\1\uffff\2\102\11\66\1\67\1\102\1\uffff\11\66\1\102\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\15\uffff\1\2\12\uffff\1\3\1\4";
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
            "\3\17\57\uffff\1\16",
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
            "\2\32\61\uffff\1\32\11\33",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "221:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )";
        }
    }
    static final String dfa_7s = "\33\uffff";
    static final String dfa_8s = "\1\23\2\72\11\66\1\5\1\72\1\uffff\11\66\1\6\2\uffff";
    static final String dfa_9s = "\1\24\2\102\11\66\1\67\1\102\1\uffff\11\66\1\102\2\uffff";
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
            "\3\16\57\uffff\1\15",
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
            "\2\32\61\uffff\1\32\11\31",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "275:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )";
        }
    }
    static final String dfa_13s = "\27\uffff";
    static final String dfa_14s = "\1\72\11\66\1\72\11\66\1\6\2\uffff";
    static final String dfa_15s = "\1\102\11\66\1\102\11\66\1\102\2\uffff";
    static final String dfa_16s = "\25\uffff\1\1\1\2";
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
            "\2\25\61\uffff\1\25\11\26",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "759:3: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )";
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "819:4: (this_OperationsWithConstant_4= ruleOperationsWithConstant | this_OperationsWithTreeRegisters_5= ruleOperationsWithTreeRegisters )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x003FFFFFFFFF8012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x02000000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});

}
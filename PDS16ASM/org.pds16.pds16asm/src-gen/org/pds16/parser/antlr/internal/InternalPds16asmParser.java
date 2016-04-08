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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_COMT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ldi'", "'ldih'", "'ld'", "'ldb'", "'st'", "'stb'", "'add'", "'addf'", "'adc'", "'adcf'", "'sub'", "'subf'", "'sbb'", "'sbbf'", "'anl'", "'anlf'", "'orl'", "'orlf'", "'xrl'", "'xrlf'", "'not'", "'notf'", "'shl'", "'shr'", "'rrl'", "'rrm'", "'rcr'", "'rcl'", "'jz'", "'je'", "'jnz'", "'jne'", "'jc'", "'jbl'", "'jnc'", "'jae'", "'jmp'", "'jmpl'", "','", "'['", "'#'", "']'", "'r0'", "'r1'", "'r2'", "'r3'", "'r4'", "'r5'", "'r6'", "'r7'", "'PSW'"
    };
    public static final int RULE_HEX=5;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_COMT=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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

                if ( (LA1_0==RULE_COMT||(LA1_0>=13 && LA1_0<=50)) ) {
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
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt2=3;
                }
                break;
            case 27:
            case 28:
            case 29:
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
                {
                alt2=4;
                }
                break;
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


    // $ANTLR start "entryRuleLoad"
    // InternalPds16asm.g:172:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalPds16asm.g:172:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalPds16asm.g:173:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalPds16asm.g:179:1: ruleLoad returns [EObject current=null] : (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        EObject this_LdImmediate_0 = null;

        EObject this_LdDirect_1 = null;

        EObject this_LdIndexed_2 = null;

        EObject this_LdBasedIndexed_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:185:2: ( (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) )
            // InternalPds16asm.g:186:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            {
            // InternalPds16asm.g:186:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalPds16asm.g:187:3: this_LdImmediate_0= ruleLdImmediate
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
                    // InternalPds16asm.g:196:3: this_LdDirect_1= ruleLdDirect
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
                    // InternalPds16asm.g:205:3: this_LdIndexed_2= ruleLdIndexed
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
                    // InternalPds16asm.g:214:3: this_LdBasedIndexed_3= ruleLdBasedIndexed
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
    // InternalPds16asm.g:226:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalPds16asm.g:226:46: (iv_ruleStore= ruleStore EOF )
            // InternalPds16asm.g:227:2: iv_ruleStore= ruleStore EOF
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
    // InternalPds16asm.g:233:1: ruleStore returns [EObject current=null] : (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        EObject this_StDirect_0 = null;

        EObject this_StIndexed_1 = null;

        EObject this_StBasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:239:2: ( (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed ) )
            // InternalPds16asm.g:240:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            {
            // InternalPds16asm.g:240:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalPds16asm.g:241:3: this_StDirect_0= ruleStDirect
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
                    // InternalPds16asm.g:250:3: this_StIndexed_1= ruleStIndexed
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
                    // InternalPds16asm.g:259:3: this_StBasedIndexed_2= ruleStBasedIndexed
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
    // InternalPds16asm.g:271:1: entryRuleAritmetica returns [EObject current=null] : iv_ruleAritmetica= ruleAritmetica EOF ;
    public final EObject entryRuleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAritmetica = null;


        try {
            // InternalPds16asm.g:271:51: (iv_ruleAritmetica= ruleAritmetica EOF )
            // InternalPds16asm.g:272:2: iv_ruleAritmetica= ruleAritmetica EOF
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
    // InternalPds16asm.g:278:1: ruleAritmetica returns [EObject current=null] : (this_AddRegisters_0= ruleAddRegisters | this_AddConstant_1= ruleAddConstant | this_SubRegisters_2= ruleSubRegisters | this_SubConstant_3= ruleSubConstant ) ;
    public final EObject ruleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject this_AddRegisters_0 = null;

        EObject this_AddConstant_1 = null;

        EObject this_SubRegisters_2 = null;

        EObject this_SubConstant_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:284:2: ( (this_AddRegisters_0= ruleAddRegisters | this_AddConstant_1= ruleAddConstant | this_SubRegisters_2= ruleSubRegisters | this_SubConstant_3= ruleSubConstant ) )
            // InternalPds16asm.g:285:2: (this_AddRegisters_0= ruleAddRegisters | this_AddConstant_1= ruleAddConstant | this_SubRegisters_2= ruleSubRegisters | this_SubConstant_3= ruleSubConstant )
            {
            // InternalPds16asm.g:285:2: (this_AddRegisters_0= ruleAddRegisters | this_AddConstant_1= ruleAddConstant | this_SubRegisters_2= ruleSubRegisters | this_SubConstant_3= ruleSubConstant )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalPds16asm.g:286:3: this_AddRegisters_0= ruleAddRegisters
                    {

                    			newCompositeNode(grammarAccess.getAritmeticaAccess().getAddRegistersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRegisters_0=ruleAddRegisters();

                    state._fsp--;


                    			current = this_AddRegisters_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:295:3: this_AddConstant_1= ruleAddConstant
                    {

                    			newCompositeNode(grammarAccess.getAritmeticaAccess().getAddConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddConstant_1=ruleAddConstant();

                    state._fsp--;


                    			current = this_AddConstant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:304:3: this_SubRegisters_2= ruleSubRegisters
                    {

                    			newCompositeNode(grammarAccess.getAritmeticaAccess().getSubRegistersParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubRegisters_2=ruleSubRegisters();

                    state._fsp--;


                    			current = this_SubRegisters_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:313:3: this_SubConstant_3= ruleSubConstant
                    {

                    			newCompositeNode(grammarAccess.getAritmeticaAccess().getSubConstantParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubConstant_3=ruleSubConstant();

                    state._fsp--;


                    			current = this_SubConstant_3;
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
    // InternalPds16asm.g:325:1: entryRuleLogica returns [EObject current=null] : iv_ruleLogica= ruleLogica EOF ;
    public final EObject entryRuleLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogica = null;


        try {
            // InternalPds16asm.g:325:47: (iv_ruleLogica= ruleLogica EOF )
            // InternalPds16asm.g:326:2: iv_ruleLogica= ruleLogica EOF
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
    // InternalPds16asm.g:332:1: ruleLogica returns [EObject current=null] : (this_ANL_0= ruleANL | this_ORL_1= ruleORL | this_XRL_2= ruleXRL | this_NOT_3= ruleNOT | this_SHL_4= ruleSHL | this_SHR_5= ruleSHR | this_RR_6= ruleRR | this_RC_7= ruleRC ) ;
    public final EObject ruleLogica() throws RecognitionException {
        EObject current = null;

        EObject this_ANL_0 = null;

        EObject this_ORL_1 = null;

        EObject this_XRL_2 = null;

        EObject this_NOT_3 = null;

        EObject this_SHL_4 = null;

        EObject this_SHR_5 = null;

        EObject this_RR_6 = null;

        EObject this_RC_7 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:338:2: ( (this_ANL_0= ruleANL | this_ORL_1= ruleORL | this_XRL_2= ruleXRL | this_NOT_3= ruleNOT | this_SHL_4= ruleSHL | this_SHR_5= ruleSHR | this_RR_6= ruleRR | this_RC_7= ruleRC ) )
            // InternalPds16asm.g:339:2: (this_ANL_0= ruleANL | this_ORL_1= ruleORL | this_XRL_2= ruleXRL | this_NOT_3= ruleNOT | this_SHL_4= ruleSHL | this_SHR_5= ruleSHR | this_RR_6= ruleRR | this_RC_7= ruleRC )
            {
            // InternalPds16asm.g:339:2: (this_ANL_0= ruleANL | this_ORL_1= ruleORL | this_XRL_2= ruleXRL | this_NOT_3= ruleNOT | this_SHL_4= ruleSHL | this_SHR_5= ruleSHR | this_RR_6= ruleRR | this_RC_7= ruleRC )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
            case 32:
                {
                alt6=3;
                }
                break;
            case 33:
            case 34:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            case 36:
                {
                alt6=6;
                }
                break;
            case 37:
            case 38:
                {
                alt6=7;
                }
                break;
            case 39:
            case 40:
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
                    // InternalPds16asm.g:340:3: this_ANL_0= ruleANL
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getANLParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ANL_0=ruleANL();

                    state._fsp--;


                    			current = this_ANL_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:349:3: this_ORL_1= ruleORL
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getORLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ORL_1=ruleORL();

                    state._fsp--;


                    			current = this_ORL_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:358:3: this_XRL_2= ruleXRL
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getXRLParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XRL_2=ruleXRL();

                    state._fsp--;


                    			current = this_XRL_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:367:3: this_NOT_3= ruleNOT
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getNOTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NOT_3=ruleNOT();

                    state._fsp--;


                    			current = this_NOT_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:376:3: this_SHL_4= ruleSHL
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getSHLParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SHL_4=ruleSHL();

                    state._fsp--;


                    			current = this_SHL_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:385:3: this_SHR_5= ruleSHR
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getSHRParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SHR_5=ruleSHR();

                    state._fsp--;


                    			current = this_SHR_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:394:3: this_RR_6= ruleRR
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getRRParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RR_6=ruleRR();

                    state._fsp--;


                    			current = this_RR_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:403:3: this_RC_7= ruleRC
                    {

                    			newCompositeNode(grammarAccess.getLogicaAccess().getRCParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RC_7=ruleRC();

                    state._fsp--;


                    			current = this_RC_7;
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
    // InternalPds16asm.g:415:1: entryRuleJump returns [EObject current=null] : iv_ruleJump= ruleJump EOF ;
    public final EObject entryRuleJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJump = null;


        try {
            // InternalPds16asm.g:415:45: (iv_ruleJump= ruleJump EOF )
            // InternalPds16asm.g:416:2: iv_ruleJump= ruleJump EOF
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
    // InternalPds16asm.g:422:1: ruleJump returns [EObject current=null] : this_JumpOp_0= ruleJumpOp ;
    public final EObject ruleJump() throws RecognitionException {
        EObject current = null;

        EObject this_JumpOp_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:428:2: (this_JumpOp_0= ruleJumpOp )
            // InternalPds16asm.g:429:2: this_JumpOp_0= ruleJumpOp
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
    // InternalPds16asm.g:440:1: entryRuleLdImmediate returns [EObject current=null] : iv_ruleLdImmediate= ruleLdImmediate EOF ;
    public final EObject entryRuleLdImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdImmediate = null;


        try {
            // InternalPds16asm.g:440:52: (iv_ruleLdImmediate= ruleLdImmediate EOF )
            // InternalPds16asm.g:441:2: iv_ruleLdImmediate= ruleLdImmediate EOF
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
    // InternalPds16asm.g:447:1: ruleLdImmediate returns [EObject current=null] : ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate ) ;
    public final EObject ruleLdImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Immediate_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:453:2: ( ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate ) )
            // InternalPds16asm.g:454:2: ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate )
            {
            // InternalPds16asm.g:454:2: ( (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate )
            // InternalPds16asm.g:455:3: (otherlv_0= 'ldi' | otherlv_1= 'ldih' ) this_Immediate_2= ruleImmediate
            {
            // InternalPds16asm.g:455:3: (otherlv_0= 'ldi' | otherlv_1= 'ldih' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPds16asm.g:456:4: otherlv_0= 'ldi'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdImmediateAccess().getLdiKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:461:4: otherlv_1= 'ldih'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_4); 

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
    // InternalPds16asm.g:478:1: entryRuleLdDirect returns [EObject current=null] : iv_ruleLdDirect= ruleLdDirect EOF ;
    public final EObject entryRuleLdDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdDirect = null;


        try {
            // InternalPds16asm.g:478:49: (iv_ruleLdDirect= ruleLdDirect EOF )
            // InternalPds16asm.g:479:2: iv_ruleLdDirect= ruleLdDirect EOF
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
    // InternalPds16asm.g:485:1: ruleLdDirect returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleLdDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:491:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect ) )
            // InternalPds16asm.g:492:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asm.g:492:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect )
            // InternalPds16asm.g:493:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Direct_2= ruleDirect
            {
            // InternalPds16asm.g:493:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPds16asm.g:494:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdDirectAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:499:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_4); 

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
    // InternalPds16asm.g:516:1: entryRuleLdIndexed returns [EObject current=null] : iv_ruleLdIndexed= ruleLdIndexed EOF ;
    public final EObject entryRuleLdIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdIndexed = null;


        try {
            // InternalPds16asm.g:516:50: (iv_ruleLdIndexed= ruleLdIndexed EOF )
            // InternalPds16asm.g:517:2: iv_ruleLdIndexed= ruleLdIndexed EOF
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
    // InternalPds16asm.g:523:1: ruleLdIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleLdIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:529:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asm.g:530:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asm.g:530:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed )
            // InternalPds16asm.g:531:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asm.g:531:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPds16asm.g:532:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:537:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_4); 

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
    // InternalPds16asm.g:554:1: entryRuleLdBasedIndexed returns [EObject current=null] : iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF ;
    public final EObject entryRuleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdBasedIndexed = null;


        try {
            // InternalPds16asm.g:554:55: (iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF )
            // InternalPds16asm.g:555:2: iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF
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
    // InternalPds16asm.g:561:1: ruleLdBasedIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:567:2: ( ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asm.g:568:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asm.g:568:2: ( (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asm.g:569:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asm.g:569:3: (otherlv_0= 'ld' | otherlv_1= 'ldb' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPds16asm.g:570:4: otherlv_0= 'ld'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdBasedIndexedAccess().getLdKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:575:4: otherlv_1= 'ldb'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_4); 

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
    // InternalPds16asm.g:592:1: entryRuleStDirect returns [EObject current=null] : iv_ruleStDirect= ruleStDirect EOF ;
    public final EObject entryRuleStDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStDirect = null;


        try {
            // InternalPds16asm.g:592:49: (iv_ruleStDirect= ruleStDirect EOF )
            // InternalPds16asm.g:593:2: iv_ruleStDirect= ruleStDirect EOF
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
    // InternalPds16asm.g:599:1: ruleStDirect returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect ) ;
    public final EObject ruleStDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:605:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect ) )
            // InternalPds16asm.g:606:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect )
            {
            // InternalPds16asm.g:606:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect )
            // InternalPds16asm.g:607:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Direct_2= ruleDirect
            {
            // InternalPds16asm.g:607:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==18) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPds16asm.g:608:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStDirectAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:613:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

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
    // InternalPds16asm.g:630:1: entryRuleStIndexed returns [EObject current=null] : iv_ruleStIndexed= ruleStIndexed EOF ;
    public final EObject entryRuleStIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStIndexed = null;


        try {
            // InternalPds16asm.g:630:50: (iv_ruleStIndexed= ruleStIndexed EOF )
            // InternalPds16asm.g:631:2: iv_ruleStIndexed= ruleStIndexed EOF
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
    // InternalPds16asm.g:637:1: ruleStIndexed returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed ) ;
    public final EObject ruleStIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_Indexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:643:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed ) )
            // InternalPds16asm.g:644:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed )
            {
            // InternalPds16asm.g:644:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed )
            // InternalPds16asm.g:645:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_Indexed_2= ruleIndexed
            {
            // InternalPds16asm.g:645:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPds16asm.g:646:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:651:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

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
    // InternalPds16asm.g:668:1: entryRuleStBasedIndexed returns [EObject current=null] : iv_ruleStBasedIndexed= ruleStBasedIndexed EOF ;
    public final EObject entryRuleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStBasedIndexed = null;


        try {
            // InternalPds16asm.g:668:55: (iv_ruleStBasedIndexed= ruleStBasedIndexed EOF )
            // InternalPds16asm.g:669:2: iv_ruleStBasedIndexed= ruleStBasedIndexed EOF
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
    // InternalPds16asm.g:675:1: ruleStBasedIndexed returns [EObject current=null] : ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed ) ;
    public final EObject ruleStBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BasedIndexed_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:681:2: ( ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed ) )
            // InternalPds16asm.g:682:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed )
            {
            // InternalPds16asm.g:682:2: ( (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed )
            // InternalPds16asm.g:683:3: (otherlv_0= 'st' | otherlv_1= 'stb' ) this_BasedIndexed_2= ruleBasedIndexed
            {
            // InternalPds16asm.g:683:3: (otherlv_0= 'st' | otherlv_1= 'stb' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==18) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPds16asm.g:684:4: otherlv_0= 'st'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStBasedIndexedAccess().getStKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:689:4: otherlv_1= 'stb'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

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


    // $ANTLR start "entryRuleAddRegisters"
    // InternalPds16asm.g:706:1: entryRuleAddRegisters returns [EObject current=null] : iv_ruleAddRegisters= ruleAddRegisters EOF ;
    public final EObject entryRuleAddRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRegisters = null;


        try {
            // InternalPds16asm.g:706:53: (iv_ruleAddRegisters= ruleAddRegisters EOF )
            // InternalPds16asm.g:707:2: iv_ruleAddRegisters= ruleAddRegisters EOF
            {
             newCompositeNode(grammarAccess.getAddRegistersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddRegisters=ruleAddRegisters();

            state._fsp--;

             current =iv_ruleAddRegisters; 
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
    // $ANTLR end "entryRuleAddRegisters"


    // $ANTLR start "ruleAddRegisters"
    // InternalPds16asm.g:713:1: ruleAddRegisters returns [EObject current=null] : ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters ) ;
    public final EObject ruleAddRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_operationsWithTreeRegisters_4 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:719:2: ( ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters ) )
            // InternalPds16asm.g:720:2: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:720:2: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters )
            // InternalPds16asm.g:721:3: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters
            {
            // InternalPds16asm.g:721:3: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            case 22:
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
                    // InternalPds16asm.g:722:4: otherlv_0= 'add'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddRegistersAccess().getAddKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:727:4: otherlv_1= 'addf'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddRegistersAccess().getAddfKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:732:4: otherlv_2= 'adc'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getAddRegistersAccess().getAdcKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:737:4: otherlv_3= 'adcf'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddRegistersAccess().getAdcfKeyword_0_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getAddRegistersAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithTreeRegisters_4=ruleoperationsWithTreeRegisters();

            state._fsp--;


            			current = this_operationsWithTreeRegisters_4;
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
    // $ANTLR end "ruleAddRegisters"


    // $ANTLR start "entryRuleAddConstant"
    // InternalPds16asm.g:754:1: entryRuleAddConstant returns [EObject current=null] : iv_ruleAddConstant= ruleAddConstant EOF ;
    public final EObject entryRuleAddConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddConstant = null;


        try {
            // InternalPds16asm.g:754:52: (iv_ruleAddConstant= ruleAddConstant EOF )
            // InternalPds16asm.g:755:2: iv_ruleAddConstant= ruleAddConstant EOF
            {
             newCompositeNode(grammarAccess.getAddConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddConstant=ruleAddConstant();

            state._fsp--;

             current =iv_ruleAddConstant; 
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
    // $ANTLR end "entryRuleAddConstant"


    // $ANTLR start "ruleAddConstant"
    // InternalPds16asm.g:761:1: ruleAddConstant returns [EObject current=null] : ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithConstant_4= ruleoperationsWithConstant ) ;
    public final EObject ruleAddConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_operationsWithConstant_4 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:767:2: ( ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithConstant_4= ruleoperationsWithConstant ) )
            // InternalPds16asm.g:768:2: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithConstant_4= ruleoperationsWithConstant )
            {
            // InternalPds16asm.g:768:2: ( (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithConstant_4= ruleoperationsWithConstant )
            // InternalPds16asm.g:769:3: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' ) this_operationsWithConstant_4= ruleoperationsWithConstant
            {
            // InternalPds16asm.g:769:3: (otherlv_0= 'add' | otherlv_1= 'addf' | otherlv_2= 'adc' | otherlv_3= 'adcf' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            case 22:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPds16asm.g:770:4: otherlv_0= 'add'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddConstantAccess().getAddKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:775:4: otherlv_1= 'addf'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddConstantAccess().getAddfKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:780:4: otherlv_2= 'adc'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getAddConstantAccess().getAdcKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:785:4: otherlv_3= 'adcf'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddConstantAccess().getAdcfKeyword_0_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getAddConstantAccess().getOperationsWithConstantParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithConstant_4=ruleoperationsWithConstant();

            state._fsp--;


            			current = this_operationsWithConstant_4;
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
    // $ANTLR end "ruleAddConstant"


    // $ANTLR start "entryRuleSubRegisters"
    // InternalPds16asm.g:802:1: entryRuleSubRegisters returns [EObject current=null] : iv_ruleSubRegisters= ruleSubRegisters EOF ;
    public final EObject entryRuleSubRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRegisters = null;


        try {
            // InternalPds16asm.g:802:53: (iv_ruleSubRegisters= ruleSubRegisters EOF )
            // InternalPds16asm.g:803:2: iv_ruleSubRegisters= ruleSubRegisters EOF
            {
             newCompositeNode(grammarAccess.getSubRegistersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubRegisters=ruleSubRegisters();

            state._fsp--;

             current =iv_ruleSubRegisters; 
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
    // $ANTLR end "entryRuleSubRegisters"


    // $ANTLR start "ruleSubRegisters"
    // InternalPds16asm.g:809:1: ruleSubRegisters returns [EObject current=null] : ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters ) ;
    public final EObject ruleSubRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_operationsWithTreeRegisters_4 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:815:2: ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters ) )
            // InternalPds16asm.g:816:2: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:816:2: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters )
            // InternalPds16asm.g:817:3: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithTreeRegisters_4= ruleoperationsWithTreeRegisters
            {
            // InternalPds16asm.g:817:3: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt16=1;
                }
                break;
            case 24:
                {
                alt16=2;
                }
                break;
            case 25:
                {
                alt16=3;
                }
                break;
            case 26:
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
                    // InternalPds16asm.g:818:4: otherlv_0= 'sub'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubRegistersAccess().getSubKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:823:4: otherlv_1= 'subf'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubRegistersAccess().getSubfKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:828:4: otherlv_2= 'sbb'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubRegistersAccess().getSbbKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:833:4: otherlv_3= 'sbbf'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubRegistersAccess().getSbbfKeyword_0_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getSubRegistersAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithTreeRegisters_4=ruleoperationsWithTreeRegisters();

            state._fsp--;


            			current = this_operationsWithTreeRegisters_4;
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
    // $ANTLR end "ruleSubRegisters"


    // $ANTLR start "entryRuleSubConstant"
    // InternalPds16asm.g:850:1: entryRuleSubConstant returns [EObject current=null] : iv_ruleSubConstant= ruleSubConstant EOF ;
    public final EObject entryRuleSubConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubConstant = null;


        try {
            // InternalPds16asm.g:850:52: (iv_ruleSubConstant= ruleSubConstant EOF )
            // InternalPds16asm.g:851:2: iv_ruleSubConstant= ruleSubConstant EOF
            {
             newCompositeNode(grammarAccess.getSubConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubConstant=ruleSubConstant();

            state._fsp--;

             current =iv_ruleSubConstant; 
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
    // $ANTLR end "entryRuleSubConstant"


    // $ANTLR start "ruleSubConstant"
    // InternalPds16asm.g:857:1: ruleSubConstant returns [EObject current=null] : ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithConstant_4= ruleoperationsWithConstant ) ;
    public final EObject ruleSubConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_operationsWithConstant_4 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:863:2: ( ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithConstant_4= ruleoperationsWithConstant ) )
            // InternalPds16asm.g:864:2: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithConstant_4= ruleoperationsWithConstant )
            {
            // InternalPds16asm.g:864:2: ( (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithConstant_4= ruleoperationsWithConstant )
            // InternalPds16asm.g:865:3: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' ) this_operationsWithConstant_4= ruleoperationsWithConstant
            {
            // InternalPds16asm.g:865:3: (otherlv_0= 'sub' | otherlv_1= 'subf' | otherlv_2= 'sbb' | otherlv_3= 'sbbf' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt17=1;
                }
                break;
            case 24:
                {
                alt17=2;
                }
                break;
            case 25:
                {
                alt17=3;
                }
                break;
            case 26:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPds16asm.g:866:4: otherlv_0= 'sub'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubConstantAccess().getSubKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:871:4: otherlv_1= 'subf'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubConstantAccess().getSubfKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:876:4: otherlv_2= 'sbb'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubConstantAccess().getSbbKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:881:4: otherlv_3= 'sbbf'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubConstantAccess().getSbbfKeyword_0_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getSubConstantAccess().getOperationsWithConstantParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithConstant_4=ruleoperationsWithConstant();

            state._fsp--;


            			current = this_operationsWithConstant_4;
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
    // $ANTLR end "ruleSubConstant"


    // $ANTLR start "entryRuleANL"
    // InternalPds16asm.g:898:1: entryRuleANL returns [EObject current=null] : iv_ruleANL= ruleANL EOF ;
    public final EObject entryRuleANL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANL = null;


        try {
            // InternalPds16asm.g:898:44: (iv_ruleANL= ruleANL EOF )
            // InternalPds16asm.g:899:2: iv_ruleANL= ruleANL EOF
            {
             newCompositeNode(grammarAccess.getANLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANL=ruleANL();

            state._fsp--;

             current =iv_ruleANL; 
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
    // $ANTLR end "entryRuleANL"


    // $ANTLR start "ruleANL"
    // InternalPds16asm.g:905:1: ruleANL returns [EObject current=null] : ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters ) ;
    public final EObject ruleANL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_operationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:911:2: ( ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters ) )
            // InternalPds16asm.g:912:2: ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:912:2: ( (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters )
            // InternalPds16asm.g:913:3: (otherlv_0= 'anl' | otherlv_1= 'anlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters
            {
            // InternalPds16asm.g:913:3: (otherlv_0= 'anl' | otherlv_1= 'anlf' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPds16asm.g:914:4: otherlv_0= 'anl'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getANLAccess().getAnlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:919:4: otherlv_1= 'anlf'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getANLAccess().getAnlfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getANLAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithTreeRegisters_2=ruleoperationsWithTreeRegisters();

            state._fsp--;


            			current = this_operationsWithTreeRegisters_2;
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
    // $ANTLR end "ruleANL"


    // $ANTLR start "entryRuleORL"
    // InternalPds16asm.g:936:1: entryRuleORL returns [EObject current=null] : iv_ruleORL= ruleORL EOF ;
    public final EObject entryRuleORL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORL = null;


        try {
            // InternalPds16asm.g:936:44: (iv_ruleORL= ruleORL EOF )
            // InternalPds16asm.g:937:2: iv_ruleORL= ruleORL EOF
            {
             newCompositeNode(grammarAccess.getORLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORL=ruleORL();

            state._fsp--;

             current =iv_ruleORL; 
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
    // $ANTLR end "entryRuleORL"


    // $ANTLR start "ruleORL"
    // InternalPds16asm.g:943:1: ruleORL returns [EObject current=null] : ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters ) ;
    public final EObject ruleORL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_operationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:949:2: ( ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters ) )
            // InternalPds16asm.g:950:2: ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:950:2: ( (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters )
            // InternalPds16asm.g:951:3: (otherlv_0= 'orl' | otherlv_1= 'orlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters
            {
            // InternalPds16asm.g:951:3: (otherlv_0= 'orl' | otherlv_1= 'orlf' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==30) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPds16asm.g:952:4: otherlv_0= 'orl'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getORLAccess().getOrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:957:4: otherlv_1= 'orlf'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getORLAccess().getOrlfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getORLAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithTreeRegisters_2=ruleoperationsWithTreeRegisters();

            state._fsp--;


            			current = this_operationsWithTreeRegisters_2;
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
    // $ANTLR end "ruleORL"


    // $ANTLR start "entryRuleXRL"
    // InternalPds16asm.g:974:1: entryRuleXRL returns [EObject current=null] : iv_ruleXRL= ruleXRL EOF ;
    public final EObject entryRuleXRL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRL = null;


        try {
            // InternalPds16asm.g:974:44: (iv_ruleXRL= ruleXRL EOF )
            // InternalPds16asm.g:975:2: iv_ruleXRL= ruleXRL EOF
            {
             newCompositeNode(grammarAccess.getXRLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXRL=ruleXRL();

            state._fsp--;

             current =iv_ruleXRL; 
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
    // $ANTLR end "entryRuleXRL"


    // $ANTLR start "ruleXRL"
    // InternalPds16asm.g:981:1: ruleXRL returns [EObject current=null] : ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters ) ;
    public final EObject ruleXRL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_operationsWithTreeRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:987:2: ( ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters ) )
            // InternalPds16asm.g:988:2: ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters )
            {
            // InternalPds16asm.g:988:2: ( (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters )
            // InternalPds16asm.g:989:3: (otherlv_0= 'xrl' | otherlv_1= 'xrlf' ) this_operationsWithTreeRegisters_2= ruleoperationsWithTreeRegisters
            {
            // InternalPds16asm.g:989:3: (otherlv_0= 'xrl' | otherlv_1= 'xrlf' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPds16asm.g:990:4: otherlv_0= 'xrl'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getXRLAccess().getXrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:995:4: otherlv_1= 'xrlf'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getXRLAccess().getXrlfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getXRLAccess().getOperationsWithTreeRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithTreeRegisters_2=ruleoperationsWithTreeRegisters();

            state._fsp--;


            			current = this_operationsWithTreeRegisters_2;
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
    // $ANTLR end "ruleXRL"


    // $ANTLR start "entryRuleNOT"
    // InternalPds16asm.g:1012:1: entryRuleNOT returns [EObject current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final EObject entryRuleNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOT = null;


        try {
            // InternalPds16asm.g:1012:44: (iv_ruleNOT= ruleNOT EOF )
            // InternalPds16asm.g:1013:2: iv_ruleNOT= ruleNOT EOF
            {
             newCompositeNode(grammarAccess.getNOTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNOT=ruleNOT();

            state._fsp--;

             current =iv_ruleNOT; 
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
    // $ANTLR end "entryRuleNOT"


    // $ANTLR start "ruleNOT"
    // InternalPds16asm.g:1019:1: ruleNOT returns [EObject current=null] : ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters ) ;
    public final EObject ruleNOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_operationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1025:2: ( ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters ) )
            // InternalPds16asm.g:1026:2: ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters )
            {
            // InternalPds16asm.g:1026:2: ( (otherlv_0= 'not' | otherlv_1= 'notf' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters )
            // InternalPds16asm.g:1027:3: (otherlv_0= 'not' | otherlv_1= 'notf' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters
            {
            // InternalPds16asm.g:1027:3: (otherlv_0= 'not' | otherlv_1= 'notf' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            else if ( (LA21_0==34) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPds16asm.g:1028:4: otherlv_0= 'not'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getNOTAccess().getNotKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1033:4: otherlv_1= 'notf'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getNOTAccess().getNotfKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getNOTAccess().getOperationWithTwoRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationWithTwoRegisters_2=ruleoperationWithTwoRegisters();

            state._fsp--;


            			current = this_operationWithTwoRegisters_2;
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
    // $ANTLR end "ruleNOT"


    // $ANTLR start "entryRuleSHL"
    // InternalPds16asm.g:1050:1: entryRuleSHL returns [EObject current=null] : iv_ruleSHL= ruleSHL EOF ;
    public final EObject entryRuleSHL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSHL = null;


        try {
            // InternalPds16asm.g:1050:44: (iv_ruleSHL= ruleSHL EOF )
            // InternalPds16asm.g:1051:2: iv_ruleSHL= ruleSHL EOF
            {
             newCompositeNode(grammarAccess.getSHLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSHL=ruleSHL();

            state._fsp--;

             current =iv_ruleSHL; 
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
    // $ANTLR end "entryRuleSHL"


    // $ANTLR start "ruleSHL"
    // InternalPds16asm.g:1057:1: ruleSHL returns [EObject current=null] : (otherlv_0= 'shl' this_operationShift_1= ruleoperationShift ) ;
    public final EObject ruleSHL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_operationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1063:2: ( (otherlv_0= 'shl' this_operationShift_1= ruleoperationShift ) )
            // InternalPds16asm.g:1064:2: (otherlv_0= 'shl' this_operationShift_1= ruleoperationShift )
            {
            // InternalPds16asm.g:1064:2: (otherlv_0= 'shl' this_operationShift_1= ruleoperationShift )
            // InternalPds16asm.g:1065:3: otherlv_0= 'shl' this_operationShift_1= ruleoperationShift
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSHLAccess().getShlKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSHLAccess().getOperationShiftParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationShift_1=ruleoperationShift();

            state._fsp--;


            			current = this_operationShift_1;
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
    // $ANTLR end "ruleSHL"


    // $ANTLR start "entryRuleSHR"
    // InternalPds16asm.g:1081:1: entryRuleSHR returns [EObject current=null] : iv_ruleSHR= ruleSHR EOF ;
    public final EObject entryRuleSHR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSHR = null;


        try {
            // InternalPds16asm.g:1081:44: (iv_ruleSHR= ruleSHR EOF )
            // InternalPds16asm.g:1082:2: iv_ruleSHR= ruleSHR EOF
            {
             newCompositeNode(grammarAccess.getSHRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSHR=ruleSHR();

            state._fsp--;

             current =iv_ruleSHR; 
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
    // $ANTLR end "entryRuleSHR"


    // $ANTLR start "ruleSHR"
    // InternalPds16asm.g:1088:1: ruleSHR returns [EObject current=null] : (otherlv_0= 'shr' this_operationShift_1= ruleoperationShift ) ;
    public final EObject ruleSHR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_operationShift_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1094:2: ( (otherlv_0= 'shr' this_operationShift_1= ruleoperationShift ) )
            // InternalPds16asm.g:1095:2: (otherlv_0= 'shr' this_operationShift_1= ruleoperationShift )
            {
            // InternalPds16asm.g:1095:2: (otherlv_0= 'shr' this_operationShift_1= ruleoperationShift )
            // InternalPds16asm.g:1096:3: otherlv_0= 'shr' this_operationShift_1= ruleoperationShift
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSHRAccess().getShrKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSHRAccess().getOperationShiftParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationShift_1=ruleoperationShift();

            state._fsp--;


            			current = this_operationShift_1;
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
    // $ANTLR end "ruleSHR"


    // $ANTLR start "entryRuleRR"
    // InternalPds16asm.g:1112:1: entryRuleRR returns [EObject current=null] : iv_ruleRR= ruleRR EOF ;
    public final EObject entryRuleRR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRR = null;


        try {
            // InternalPds16asm.g:1112:43: (iv_ruleRR= ruleRR EOF )
            // InternalPds16asm.g:1113:2: iv_ruleRR= ruleRR EOF
            {
             newCompositeNode(grammarAccess.getRRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRR=ruleRR();

            state._fsp--;

             current =iv_ruleRR; 
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
    // $ANTLR end "entryRuleRR"


    // $ANTLR start "ruleRR"
    // InternalPds16asm.g:1119:1: ruleRR returns [EObject current=null] : ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_operationsWithConstant_2= ruleoperationsWithConstant ) ;
    public final EObject ruleRR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_operationsWithConstant_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1125:2: ( ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_operationsWithConstant_2= ruleoperationsWithConstant ) )
            // InternalPds16asm.g:1126:2: ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_operationsWithConstant_2= ruleoperationsWithConstant )
            {
            // InternalPds16asm.g:1126:2: ( (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_operationsWithConstant_2= ruleoperationsWithConstant )
            // InternalPds16asm.g:1127:3: (otherlv_0= 'rrl' | otherlv_1= 'rrm' ) this_operationsWithConstant_2= ruleoperationsWithConstant
            {
            // InternalPds16asm.g:1127:3: (otherlv_0= 'rrl' | otherlv_1= 'rrm' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            else if ( (LA22_0==38) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPds16asm.g:1128:4: otherlv_0= 'rrl'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getRRAccess().getRrlKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1133:4: otherlv_1= 'rrm'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getRRAccess().getRrmKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getRRAccess().getOperationsWithConstantParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationsWithConstant_2=ruleoperationsWithConstant();

            state._fsp--;


            			current = this_operationsWithConstant_2;
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
    // $ANTLR end "ruleRR"


    // $ANTLR start "entryRuleRC"
    // InternalPds16asm.g:1150:1: entryRuleRC returns [EObject current=null] : iv_ruleRC= ruleRC EOF ;
    public final EObject entryRuleRC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRC = null;


        try {
            // InternalPds16asm.g:1150:43: (iv_ruleRC= ruleRC EOF )
            // InternalPds16asm.g:1151:2: iv_ruleRC= ruleRC EOF
            {
             newCompositeNode(grammarAccess.getRCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRC=ruleRC();

            state._fsp--;

             current =iv_ruleRC; 
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
    // $ANTLR end "entryRuleRC"


    // $ANTLR start "ruleRC"
    // InternalPds16asm.g:1157:1: ruleRC returns [EObject current=null] : ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters ) ;
    public final EObject ruleRC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_operationWithTwoRegisters_2 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1163:2: ( ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters ) )
            // InternalPds16asm.g:1164:2: ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters )
            {
            // InternalPds16asm.g:1164:2: ( (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters )
            // InternalPds16asm.g:1165:3: (otherlv_0= 'rcr' | otherlv_1= 'rcl' ) this_operationWithTwoRegisters_2= ruleoperationWithTwoRegisters
            {
            // InternalPds16asm.g:1165:3: (otherlv_0= 'rcr' | otherlv_1= 'rcl' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            else if ( (LA23_0==40) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPds16asm.g:1166:4: otherlv_0= 'rcr'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getRCAccess().getRcrKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1171:4: otherlv_1= 'rcl'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getRCAccess().getRclKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getRCAccess().getOperationWithTwoRegistersParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_operationWithTwoRegisters_2=ruleoperationWithTwoRegisters();

            state._fsp--;


            			current = this_operationWithTwoRegisters_2;
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
    // $ANTLR end "ruleRC"


    // $ANTLR start "entryRuleJumpOp"
    // InternalPds16asm.g:1188:1: entryRuleJumpOp returns [EObject current=null] : iv_ruleJumpOp= ruleJumpOp EOF ;
    public final EObject entryRuleJumpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpOp = null;


        try {
            // InternalPds16asm.g:1188:47: (iv_ruleJumpOp= ruleJumpOp EOF )
            // InternalPds16asm.g:1189:2: iv_ruleJumpOp= ruleJumpOp EOF
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
    // InternalPds16asm.g:1195:1: ruleJumpOp returns [EObject current=null] : ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_operationWithOffset_10= ruleoperationWithOffset | ( (lv_op_11_0= RULE_STRING ) ) ) ) ;
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
        EObject this_operationWithOffset_10 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1201:2: ( ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_operationWithOffset_10= ruleoperationWithOffset | ( (lv_op_11_0= RULE_STRING ) ) ) ) )
            // InternalPds16asm.g:1202:2: ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_operationWithOffset_10= ruleoperationWithOffset | ( (lv_op_11_0= RULE_STRING ) ) ) )
            {
            // InternalPds16asm.g:1202:2: ( (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_operationWithOffset_10= ruleoperationWithOffset | ( (lv_op_11_0= RULE_STRING ) ) ) )
            // InternalPds16asm.g:1203:3: (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' ) (this_operationWithOffset_10= ruleoperationWithOffset | ( (lv_op_11_0= RULE_STRING ) ) )
            {
            // InternalPds16asm.g:1203:3: (otherlv_0= 'jz' | otherlv_1= 'je' | otherlv_2= 'jnz' | otherlv_3= 'jne' | otherlv_4= 'jc' | otherlv_5= 'jbl' | otherlv_6= 'jnc' | otherlv_7= 'jae' | otherlv_8= 'jmp' | otherlv_9= 'jmpl' )
            int alt24=10;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt24=1;
                }
                break;
            case 42:
                {
                alt24=2;
                }
                break;
            case 43:
                {
                alt24=3;
                }
                break;
            case 44:
                {
                alt24=4;
                }
                break;
            case 45:
                {
                alt24=5;
                }
                break;
            case 46:
                {
                alt24=6;
                }
                break;
            case 47:
                {
                alt24=7;
                }
                break;
            case 48:
                {
                alt24=8;
                }
                break;
            case 49:
                {
                alt24=9;
                }
                break;
            case 50:
                {
                alt24=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPds16asm.g:1204:4: otherlv_0= 'jz'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getJumpOpAccess().getJzKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1209:4: otherlv_1= 'je'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getJumpOpAccess().getJeKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:1214:4: otherlv_2= 'jnz'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getJumpOpAccess().getJnzKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:1219:4: otherlv_3= 'jne'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getJumpOpAccess().getJneKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:1224:4: otherlv_4= 'jc'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getJumpOpAccess().getJcKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:1229:4: otherlv_5= 'jbl'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getJumpOpAccess().getJblKeyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:1234:4: otherlv_6= 'jnc'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getJumpOpAccess().getJncKeyword_0_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:1239:4: otherlv_7= 'jae'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getJumpOpAccess().getJaeKeyword_0_7());
                    			

                    }
                    break;
                case 9 :
                    // InternalPds16asm.g:1244:4: otherlv_8= 'jmp'
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getJumpOpAccess().getJmpKeyword_0_8());
                    			

                    }
                    break;
                case 10 :
                    // InternalPds16asm.g:1249:4: otherlv_9= 'jmpl'
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getJumpOpAccess().getJmplKeyword_0_9());
                    			

                    }
                    break;

            }

            // InternalPds16asm.g:1254:3: (this_operationWithOffset_10= ruleoperationWithOffset | ( (lv_op_11_0= RULE_STRING ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=55 && LA25_0<=63)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPds16asm.g:1255:4: this_operationWithOffset_10= ruleoperationWithOffset
                    {

                    				newCompositeNode(grammarAccess.getJumpOpAccess().getOperationWithOffsetParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_operationWithOffset_10=ruleoperationWithOffset();

                    state._fsp--;


                    				current = this_operationWithOffset_10;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1264:4: ( (lv_op_11_0= RULE_STRING ) )
                    {
                    // InternalPds16asm.g:1264:4: ( (lv_op_11_0= RULE_STRING ) )
                    // InternalPds16asm.g:1265:5: (lv_op_11_0= RULE_STRING )
                    {
                    // InternalPds16asm.g:1265:5: (lv_op_11_0= RULE_STRING )
                    // InternalPds16asm.g:1266:6: lv_op_11_0= RULE_STRING
                    {
                    lv_op_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_op_11_0, grammarAccess.getJumpOpAccess().getOpSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJumpOpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"op",
                    							lv_op_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleJumpOp"


    // $ANTLR start "entryRuleImmediate"
    // InternalPds16asm.g:1287:1: entryRuleImmediate returns [EObject current=null] : iv_ruleImmediate= ruleImmediate EOF ;
    public final EObject entryRuleImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate = null;


        try {
            // InternalPds16asm.g:1287:50: (iv_ruleImmediate= ruleImmediate EOF )
            // InternalPds16asm.g:1288:2: iv_ruleImmediate= ruleImmediate EOF
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
    // InternalPds16asm.g:1294:1: ruleImmediate returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) ) ;
    public final EObject ruleImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_register_0_0 = null;

        EObject lv_immediate8_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1300:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) ) )
            // InternalPds16asm.g:1301:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) )
            {
            // InternalPds16asm.g:1301:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) )
            // InternalPds16asm.g:1302:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) )
            {
            // InternalPds16asm.g:1302:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1303:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1303:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:1304:5: lv_register_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getImmediateAccess().getRegisterRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getImmediateAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1325:3: ( (lv_immediate8_2_0= ruleHexaDecimal ) )
            // InternalPds16asm.g:1326:4: (lv_immediate8_2_0= ruleHexaDecimal )
            {
            // InternalPds16asm.g:1326:4: (lv_immediate8_2_0= ruleHexaDecimal )
            // InternalPds16asm.g:1327:5: lv_immediate8_2_0= ruleHexaDecimal
            {

            					newCompositeNode(grammarAccess.getImmediateAccess().getImmediate8HexaDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_immediate8_2_0=ruleHexaDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImmediateRule());
            					}
            					set(
            						current,
            						"immediate8",
            						lv_immediate8_2_0,
            						"org.pds16.Pds16asm.HexaDecimal");
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
    // InternalPds16asm.g:1348:1: entryRuleDirect returns [EObject current=null] : iv_ruleDirect= ruleDirect EOF ;
    public final EObject entryRuleDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirect = null;


        try {
            // InternalPds16asm.g:1348:47: (iv_ruleDirect= ruleDirect EOF )
            // InternalPds16asm.g:1349:2: iv_ruleDirect= ruleDirect EOF
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
    // InternalPds16asm.g:1355:1: ruleDirect returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) ) ;
    public final EObject ruleDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_direct7_2_0=null;
        EObject lv_register_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1361:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) ) )
            // InternalPds16asm.g:1362:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) )
            {
            // InternalPds16asm.g:1362:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) )
            // InternalPds16asm.g:1363:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) )
            {
            // InternalPds16asm.g:1363:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1364:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1364:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:1365:5: lv_register_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getDirectAccess().getRegisterRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1386:3: ( (lv_direct7_2_0= RULE_HEX ) )
            // InternalPds16asm.g:1387:4: (lv_direct7_2_0= RULE_HEX )
            {
            // InternalPds16asm.g:1387:4: (lv_direct7_2_0= RULE_HEX )
            // InternalPds16asm.g:1388:5: lv_direct7_2_0= RULE_HEX
            {
            lv_direct7_2_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

            					newLeafNode(lv_direct7_2_0, grammarAccess.getDirectAccess().getDirect7HEXTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"direct7",
            						lv_direct7_2_0,
            						"org.pds16.Pds16asm.HEX");
            				

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
    // InternalPds16asm.g:1408:1: entryRuleIndexed returns [EObject current=null] : iv_ruleIndexed= ruleIndexed EOF ;
    public final EObject entryRuleIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexed = null;


        try {
            // InternalPds16asm.g:1408:48: (iv_ruleIndexed= ruleIndexed EOF )
            // InternalPds16asm.g:1409:2: iv_ruleIndexed= ruleIndexed EOF
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
    // InternalPds16asm.g:1415:1: ruleIndexed returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' ) ;
    public final EObject ruleIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_index_5_0=null;
        Token this_INT_6=null;
        Token this_HEX_7=null;
        Token otherlv_8=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rbx_3_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1421:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' ) )
            // InternalPds16asm.g:1422:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' )
            {
            // InternalPds16asm.g:1422:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' )
            // InternalPds16asm.g:1423:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']'
            {
            // InternalPds16asm.g:1423:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1424:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1424:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1425:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:1450:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:1451:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:1451:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:1452:5: lv_rbx_3_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getIndexedAccess().getRbxRegistersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_4=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:1473:3: ( (lv_index_5_0= '#' ) )
            // InternalPds16asm.g:1474:4: (lv_index_5_0= '#' )
            {
            // InternalPds16asm.g:1474:4: (lv_index_5_0= '#' )
            // InternalPds16asm.g:1475:5: lv_index_5_0= '#'
            {
            lv_index_5_0=(Token)match(input,53,FOLLOW_10); 

            					newLeafNode(lv_index_5_0, grammarAccess.getIndexedAccess().getIndexNumberSignKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexedRule());
            					}
            					setWithLastConsumed(current, "index", lv_index_5_0, "#");
            				

            }


            }

            // InternalPds16asm.g:1487:3: (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_HEX) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPds16asm.g:1488:4: this_INT_6= RULE_INT
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_11); 

                    				newLeafNode(this_INT_6, grammarAccess.getIndexedAccess().getINTTerminalRuleCall_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:1493:4: this_HEX_7= RULE_HEX
                    {
                    this_HEX_7=(Token)match(input,RULE_HEX,FOLLOW_11); 

                    				newLeafNode(this_HEX_7, grammarAccess.getIndexedAccess().getHEXTerminalRuleCall_6_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIndexedAccess().getRightSquareBracketKeyword_7());
            		

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
    // InternalPds16asm.g:1506:1: entryRuleBasedIndexed returns [EObject current=null] : iv_ruleBasedIndexed= ruleBasedIndexed EOF ;
    public final EObject entryRuleBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasedIndexed = null;


        try {
            // InternalPds16asm.g:1506:53: (iv_ruleBasedIndexed= ruleBasedIndexed EOF )
            // InternalPds16asm.g:1507:2: iv_ruleBasedIndexed= ruleBasedIndexed EOF
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
    // InternalPds16asm.g:1513:1: ruleBasedIndexed returns [EObject current=null] : (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) ;
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
            // InternalPds16asm.g:1519:2: ( (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) )
            // InternalPds16asm.g:1520:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            {
            // InternalPds16asm.g:1520:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            // InternalPds16asm.g:1521:3: this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']'
            {

            			newCompositeNode(grammarAccess.getBasedIndexedAccess().getRegistersParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Registers_0=ruleRegisters();

            state._fsp--;


            			current = this_Registers_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBasedIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBasedIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:1537:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:1538:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:1538:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:1539:5: lv_rbx_3_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getBasedIndexedAccess().getRbxRegistersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_4=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getBasedIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:1560:3: ( (lv_rix_5_0= ruleRegisters ) )
            // InternalPds16asm.g:1561:4: (lv_rix_5_0= ruleRegisters )
            {
            // InternalPds16asm.g:1561:4: (lv_rix_5_0= ruleRegisters )
            // InternalPds16asm.g:1562:5: lv_rix_5_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getBasedIndexedAccess().getRixRegistersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_6=(Token)match(input,54,FOLLOW_2); 

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


    // $ANTLR start "entryRuleHexaDecimal"
    // InternalPds16asm.g:1587:1: entryRuleHexaDecimal returns [EObject current=null] : iv_ruleHexaDecimal= ruleHexaDecimal EOF ;
    public final EObject entryRuleHexaDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexaDecimal = null;


        try {
            // InternalPds16asm.g:1587:52: (iv_ruleHexaDecimal= ruleHexaDecimal EOF )
            // InternalPds16asm.g:1588:2: iv_ruleHexaDecimal= ruleHexaDecimal EOF
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
    // InternalPds16asm.g:1594:1: ruleHexaDecimal returns [EObject current=null] : (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexaDecimal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:1600:2: ( (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) ) )
            // InternalPds16asm.g:1601:2: (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) )
            {
            // InternalPds16asm.g:1601:2: (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) )
            // InternalPds16asm.g:1602:3: otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHexaDecimalAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:1606:3: ( (lv_number_1_0= RULE_HEX ) )
            // InternalPds16asm.g:1607:4: (lv_number_1_0= RULE_HEX )
            {
            // InternalPds16asm.g:1607:4: (lv_number_1_0= RULE_HEX )
            // InternalPds16asm.g:1608:5: lv_number_1_0= RULE_HEX
            {
            lv_number_1_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

            					newLeafNode(lv_number_1_0, grammarAccess.getHexaDecimalAccess().getNumberHEXTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHexaDecimalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.pds16.Pds16asm.HEX");
            				

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


    // $ANTLR start "entryRuleoperationWithTwoRegisters"
    // InternalPds16asm.g:1628:1: entryRuleoperationWithTwoRegisters returns [EObject current=null] : iv_ruleoperationWithTwoRegisters= ruleoperationWithTwoRegisters EOF ;
    public final EObject entryRuleoperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationWithTwoRegisters = null;


        try {
            // InternalPds16asm.g:1628:66: (iv_ruleoperationWithTwoRegisters= ruleoperationWithTwoRegisters EOF )
            // InternalPds16asm.g:1629:2: iv_ruleoperationWithTwoRegisters= ruleoperationWithTwoRegisters EOF
            {
             newCompositeNode(grammarAccess.getOperationWithTwoRegistersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperationWithTwoRegisters=ruleoperationWithTwoRegisters();

            state._fsp--;

             current =iv_ruleoperationWithTwoRegisters; 
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
    // $ANTLR end "entryRuleoperationWithTwoRegisters"


    // $ANTLR start "ruleoperationWithTwoRegisters"
    // InternalPds16asm.g:1635:1: ruleoperationWithTwoRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) ) ;
    public final EObject ruleoperationWithTwoRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1641:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) ) )
            // InternalPds16asm.g:1642:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) )
            {
            // InternalPds16asm.g:1642:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) )
            // InternalPds16asm.g:1643:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) )
            {
            // InternalPds16asm.g:1643:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1644:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1644:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1645:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationWithTwoRegistersAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithTwoRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1666:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1667:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1667:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1668:5: lv_rm_2_0= ruleRegisters
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
    // $ANTLR end "ruleoperationWithTwoRegisters"


    // $ANTLR start "entryRuleoperationsWithTreeRegisters"
    // InternalPds16asm.g:1689:1: entryRuleoperationsWithTreeRegisters returns [EObject current=null] : iv_ruleoperationsWithTreeRegisters= ruleoperationsWithTreeRegisters EOF ;
    public final EObject entryRuleoperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationsWithTreeRegisters = null;


        try {
            // InternalPds16asm.g:1689:68: (iv_ruleoperationsWithTreeRegisters= ruleoperationsWithTreeRegisters EOF )
            // InternalPds16asm.g:1690:2: iv_ruleoperationsWithTreeRegisters= ruleoperationsWithTreeRegisters EOF
            {
             newCompositeNode(grammarAccess.getOperationsWithTreeRegistersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperationsWithTreeRegisters=ruleoperationsWithTreeRegisters();

            state._fsp--;

             current =iv_ruleoperationsWithTreeRegisters; 
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
    // $ANTLR end "entryRuleoperationsWithTreeRegisters"


    // $ANTLR start "ruleoperationsWithTreeRegisters"
    // InternalPds16asm.g:1696:1: ruleoperationsWithTreeRegisters returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) ) ;
    public final EObject ruleoperationsWithTreeRegisters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;

        EObject lv_rn_4_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1702:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) ) )
            // InternalPds16asm.g:1703:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) )
            {
            // InternalPds16asm.g:1703:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) ) )
            // InternalPds16asm.g:1704:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' ( (lv_rn_4_0= ruleRegisters ) )
            {
            // InternalPds16asm.g:1704:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1705:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1705:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1706:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithTreeRegistersAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1727:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1728:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1728:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1729:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithTreeRegistersAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithTreeRegistersAccess().getCommaKeyword_3());
            		
            // InternalPds16asm.g:1750:3: ( (lv_rn_4_0= ruleRegisters ) )
            // InternalPds16asm.g:1751:4: (lv_rn_4_0= ruleRegisters )
            {
            // InternalPds16asm.g:1751:4: (lv_rn_4_0= ruleRegisters )
            // InternalPds16asm.g:1752:5: lv_rn_4_0= ruleRegisters
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
    // $ANTLR end "ruleoperationsWithTreeRegisters"


    // $ANTLR start "entryRuleoperationsWithConstant"
    // InternalPds16asm.g:1773:1: entryRuleoperationsWithConstant returns [EObject current=null] : iv_ruleoperationsWithConstant= ruleoperationsWithConstant EOF ;
    public final EObject entryRuleoperationsWithConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationsWithConstant = null;


        try {
            // InternalPds16asm.g:1773:63: (iv_ruleoperationsWithConstant= ruleoperationsWithConstant EOF )
            // InternalPds16asm.g:1774:2: iv_ruleoperationsWithConstant= ruleoperationsWithConstant EOF
            {
             newCompositeNode(grammarAccess.getOperationsWithConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperationsWithConstant=ruleoperationsWithConstant();

            state._fsp--;

             current =iv_ruleoperationsWithConstant; 
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
    // $ANTLR end "entryRuleoperationsWithConstant"


    // $ANTLR start "ruleoperationsWithConstant"
    // InternalPds16asm.g:1780:1: ruleoperationsWithConstant returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) ) ;
    public final EObject ruleoperationsWithConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_const4_5_0=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1786:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) ) )
            // InternalPds16asm.g:1787:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) )
            {
            // InternalPds16asm.g:1787:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) )
            // InternalPds16asm.g:1788:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) )
            {
            // InternalPds16asm.g:1788:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1789:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1789:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1790:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1811:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1812:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1812:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1813:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationsWithConstantAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsWithConstantAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,53,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationsWithConstantAccess().getNumberSignKeyword_4());
            		
            // InternalPds16asm.g:1838:3: ( (lv_const4_5_0= RULE_INT ) )
            // InternalPds16asm.g:1839:4: (lv_const4_5_0= RULE_INT )
            {
            // InternalPds16asm.g:1839:4: (lv_const4_5_0= RULE_INT )
            // InternalPds16asm.g:1840:5: lv_const4_5_0= RULE_INT
            {
            lv_const4_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_const4_5_0, grammarAccess.getOperationsWithConstantAccess().getConst4INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsWithConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"const4",
            						lv_const4_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleoperationsWithConstant"


    // $ANTLR start "entryRuleoperationShift"
    // InternalPds16asm.g:1860:1: entryRuleoperationShift returns [EObject current=null] : iv_ruleoperationShift= ruleoperationShift EOF ;
    public final EObject entryRuleoperationShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationShift = null;


        try {
            // InternalPds16asm.g:1860:55: (iv_ruleoperationShift= ruleoperationShift EOF )
            // InternalPds16asm.g:1861:2: iv_ruleoperationShift= ruleoperationShift EOF
            {
             newCompositeNode(grammarAccess.getOperationShiftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperationShift=ruleoperationShift();

            state._fsp--;

             current =iv_ruleoperationShift; 
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
    // $ANTLR end "entryRuleoperationShift"


    // $ANTLR start "ruleoperationShift"
    // InternalPds16asm.g:1867:1: ruleoperationShift returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sin_7_0= RULE_INT ) ) ) ;
    public final EObject ruleoperationShift() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_const4_5_0=null;
        Token otherlv_6=null;
        Token lv_sin_7_0=null;
        EObject lv_rd_0_0 = null;

        EObject lv_rm_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1873:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sin_7_0= RULE_INT ) ) ) )
            // InternalPds16asm.g:1874:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sin_7_0= RULE_INT ) ) )
            {
            // InternalPds16asm.g:1874:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sin_7_0= RULE_INT ) ) )
            // InternalPds16asm.g:1875:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_rm_2_0= ruleRegisters ) ) otherlv_3= ',' otherlv_4= '#' ( (lv_const4_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sin_7_0= RULE_INT ) )
            {
            // InternalPds16asm.g:1875:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1876:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1876:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:1877:5: lv_rd_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getRdRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationShiftAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:1898:3: ( (lv_rm_2_0= ruleRegisters ) )
            // InternalPds16asm.g:1899:4: (lv_rm_2_0= ruleRegisters )
            {
            // InternalPds16asm.g:1899:4: (lv_rm_2_0= ruleRegisters )
            // InternalPds16asm.g:1900:5: lv_rm_2_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationShiftAccess().getRmRegistersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationShiftAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,53,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationShiftAccess().getNumberSignKeyword_4());
            		
            // InternalPds16asm.g:1925:3: ( (lv_const4_5_0= RULE_INT ) )
            // InternalPds16asm.g:1926:4: (lv_const4_5_0= RULE_INT )
            {
            // InternalPds16asm.g:1926:4: (lv_const4_5_0= RULE_INT )
            // InternalPds16asm.g:1927:5: lv_const4_5_0= RULE_INT
            {
            lv_const4_5_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_const4_5_0, grammarAccess.getOperationShiftAccess().getConst4INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationShiftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"const4",
            						lv_const4_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationShiftAccess().getCommaKeyword_6());
            		
            // InternalPds16asm.g:1947:3: ( (lv_sin_7_0= RULE_INT ) )
            // InternalPds16asm.g:1948:4: (lv_sin_7_0= RULE_INT )
            {
            // InternalPds16asm.g:1948:4: (lv_sin_7_0= RULE_INT )
            // InternalPds16asm.g:1949:5: lv_sin_7_0= RULE_INT
            {
            lv_sin_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_sin_7_0, grammarAccess.getOperationShiftAccess().getSinINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationShiftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sin",
            						lv_sin_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleoperationShift"


    // $ANTLR start "entryRuleoperationWithOffset"
    // InternalPds16asm.g:1969:1: entryRuleoperationWithOffset returns [EObject current=null] : iv_ruleoperationWithOffset= ruleoperationWithOffset EOF ;
    public final EObject entryRuleoperationWithOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationWithOffset = null;


        try {
            // InternalPds16asm.g:1969:60: (iv_ruleoperationWithOffset= ruleoperationWithOffset EOF )
            // InternalPds16asm.g:1970:2: iv_ruleoperationWithOffset= ruleoperationWithOffset EOF
            {
             newCompositeNode(grammarAccess.getOperationWithOffsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperationWithOffset=ruleoperationWithOffset();

            state._fsp--;

             current =iv_ruleoperationWithOffset; 
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
    // $ANTLR end "entryRuleoperationWithOffset"


    // $ANTLR start "ruleoperationWithOffset"
    // InternalPds16asm.g:1976:1: ruleoperationWithOffset returns [EObject current=null] : ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleHexaDecimal ) ) ) ;
    public final EObject ruleoperationWithOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rbx_0_0 = null;

        EObject lv_offset8_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:1982:2: ( ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleHexaDecimal ) ) ) )
            // InternalPds16asm.g:1983:2: ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleHexaDecimal ) ) )
            {
            // InternalPds16asm.g:1983:2: ( ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleHexaDecimal ) ) )
            // InternalPds16asm.g:1984:3: ( (lv_rbx_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_offset8_2_0= ruleHexaDecimal ) )
            {
            // InternalPds16asm.g:1984:3: ( (lv_rbx_0_0= ruleRegisters ) )
            // InternalPds16asm.g:1985:4: (lv_rbx_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:1985:4: (lv_rbx_0_0= ruleRegisters )
            // InternalPds16asm.g:1986:5: lv_rbx_0_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getOperationWithOffsetAccess().getRbxRegistersParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_1=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationWithOffsetAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:2007:3: ( (lv_offset8_2_0= ruleHexaDecimal ) )
            // InternalPds16asm.g:2008:4: (lv_offset8_2_0= ruleHexaDecimal )
            {
            // InternalPds16asm.g:2008:4: (lv_offset8_2_0= ruleHexaDecimal )
            // InternalPds16asm.g:2009:5: lv_offset8_2_0= ruleHexaDecimal
            {

            					newCompositeNode(grammarAccess.getOperationWithOffsetAccess().getOffset8HexaDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_offset8_2_0=ruleHexaDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationWithOffsetRule());
            					}
            					set(
            						current,
            						"offset8",
            						lv_offset8_2_0,
            						"org.pds16.Pds16asm.HexaDecimal");
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
    // $ANTLR end "ruleoperationWithOffset"


    // $ANTLR start "entryRuleComment"
    // InternalPds16asm.g:2030:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalPds16asm.g:2030:48: (iv_ruleComment= ruleComment EOF )
            // InternalPds16asm.g:2031:2: iv_ruleComment= ruleComment EOF
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
    // InternalPds16asm.g:2037:1: ruleComment returns [EObject current=null] : ( (lv_value_0_0= RULE_COMT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:2043:2: ( ( (lv_value_0_0= RULE_COMT ) ) )
            // InternalPds16asm.g:2044:2: ( (lv_value_0_0= RULE_COMT ) )
            {
            // InternalPds16asm.g:2044:2: ( (lv_value_0_0= RULE_COMT ) )
            // InternalPds16asm.g:2045:3: (lv_value_0_0= RULE_COMT )
            {
            // InternalPds16asm.g:2045:3: (lv_value_0_0= RULE_COMT )
            // InternalPds16asm.g:2046:4: lv_value_0_0= RULE_COMT
            {
            lv_value_0_0=(Token)match(input,RULE_COMT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCommentAccess().getValueCOMTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
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


    // $ANTLR start "entryRuleRegisters"
    // InternalPds16asm.g:2065:1: entryRuleRegisters returns [EObject current=null] : iv_ruleRegisters= ruleRegisters EOF ;
    public final EObject entryRuleRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisters = null;


        try {
            // InternalPds16asm.g:2065:50: (iv_ruleRegisters= ruleRegisters EOF )
            // InternalPds16asm.g:2066:2: iv_ruleRegisters= ruleRegisters EOF
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
    // InternalPds16asm.g:2072:1: ruleRegisters returns [EObject current=null] : ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) ) ;
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
            // InternalPds16asm.g:2078:2: ( ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) ) )
            // InternalPds16asm.g:2079:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) )
            {
            // InternalPds16asm.g:2079:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) ) )
            // InternalPds16asm.g:2080:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) )
            {
            // InternalPds16asm.g:2080:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' ) )
            // InternalPds16asm.g:2081:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' )
            {
            // InternalPds16asm.g:2081:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' | lv_value_0_9= 'PSW' )
            int alt27=9;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt27=1;
                }
                break;
            case 56:
                {
                alt27=2;
                }
                break;
            case 57:
                {
                alt27=3;
                }
                break;
            case 58:
                {
                alt27=4;
                }
                break;
            case 59:
                {
                alt27=5;
                }
                break;
            case 60:
                {
                alt27=6;
                }
                break;
            case 61:
                {
                alt27=7;
                }
                break;
            case 62:
                {
                alt27=8;
                }
                break;
            case 63:
                {
                alt27=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalPds16asm.g:2082:5: lv_value_0_1= 'r0'
                    {
                    lv_value_0_1=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getRegistersAccess().getValueR0Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:2093:5: lv_value_0_2= 'r1'
                    {
                    lv_value_0_2=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getRegistersAccess().getValueR1Keyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:2104:5: lv_value_0_3= 'r2'
                    {
                    lv_value_0_3=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getRegistersAccess().getValueR2Keyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:2115:5: lv_value_0_4= 'r3'
                    {
                    lv_value_0_4=(Token)match(input,58,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getRegistersAccess().getValueR3Keyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:2126:5: lv_value_0_5= 'r4'
                    {
                    lv_value_0_5=(Token)match(input,59,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getRegistersAccess().getValueR4Keyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:2137:5: lv_value_0_6= 'r5'
                    {
                    lv_value_0_6=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getRegistersAccess().getValueR5Keyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:2148:5: lv_value_0_7= 'r6'
                    {
                    lv_value_0_7=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getRegistersAccess().getValueR6Keyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:2159:5: lv_value_0_8= 'r7'
                    {
                    lv_value_0_8=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getRegistersAccess().getValueR7Keyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalPds16asm.g:2170:5: lv_value_0_9= 'PSW'
                    {
                    lv_value_0_9=(Token)match(input,63,FOLLOW_2); 

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
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\15\1\uffff\2\67\11\63\1\5\1\uffff\1\67\11\63\1\65\2\uffff";
    static final String dfa_3s = "\1\20\1\uffff\2\77\11\63\1\64\1\uffff\1\77\11\63\1\77\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\14\uffff\1\2\13\uffff\1\4\1\3";
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
            "\1\16\56\uffff\1\17",
            "",
            "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\33\1\uffff\11\32",
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
            return "186:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )";
        }
    }
    static final String dfa_7s = "\33\uffff";
    static final String dfa_8s = "\1\21\2\67\11\63\1\5\1\67\1\uffff\11\63\1\65\2\uffff";
    static final String dfa_9s = "\1\22\2\77\11\63\1\64\1\77\1\uffff\11\63\1\77\2\uffff";
    static final String dfa_10s = "\16\uffff\1\1\12\uffff\1\2\1\3";
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
            "\1\16\56\uffff\1\15",
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
            "\1\31\1\uffff\11\32",
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
            return "240:2: (this_StDirect_0= ruleStDirect | this_StIndexed_1= ruleStIndexed | this_StBasedIndexed_2= ruleStBasedIndexed )";
        }
    }
    static final String dfa_13s = "\65\uffff";
    static final String dfa_14s = "\1\23\10\67\22\63\2\67\22\63\2\65\4\uffff";
    static final String dfa_15s = "\1\32\10\77\22\63\2\77\22\63\2\77\4\uffff";
    static final String dfa_16s = "\61\uffff\1\1\1\2\1\4\1\3";
    static final String dfa_17s = "\65\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32",
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32",
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32",
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45",
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\62\1\uffff\11\61",
            "\1\63\1\uffff\11\64",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "285:2: (this_AddRegisters_0= ruleAddRegisters | this_AddConstant_1= ruleAddConstant | this_SubRegisters_2= ruleSubRegisters | this_SubConstant_3= ruleSubConstant )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0007FFFFFFFFE082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xFF80000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xFF80000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});

}
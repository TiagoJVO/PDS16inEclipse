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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEX", "RULE_INT", "RULE_COMT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ldi'", "'ldih'", "'ld'", "'ldb'", "','", "'['", "'#'", "']'", "'r0'", "'r1'", "'r2'", "'r3'", "'r4'", "'r5'", "'r6'", "'r7'"
    };
    public static final int RULE_HEX=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_COMT=6;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==RULE_COMT||(LA1_0>=13 && LA1_0<=16)) ) {
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
    // InternalPds16asm.g:107:1: ruleInstructions returns [EObject current=null] : (this_Load_0= ruleLoad | this_Comment_1= ruleComment ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Comment_1 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:113:2: ( (this_Load_0= ruleLoad | this_Comment_1= ruleComment ) )
            // InternalPds16asm.g:114:2: (this_Load_0= ruleLoad | this_Comment_1= ruleComment )
            {
            // InternalPds16asm.g:114:2: (this_Load_0= ruleLoad | this_Comment_1= ruleComment )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_COMT) ) {
                alt2=2;
            }
            else {
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
                    // InternalPds16asm.g:124:3: this_Comment_1= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_1=ruleComment();

                    state._fsp--;


                    			current = this_Comment_1;
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
    // InternalPds16asm.g:136:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalPds16asm.g:136:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalPds16asm.g:137:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalPds16asm.g:143:1: ruleLoad returns [EObject current=null] : (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        EObject this_LdImmediate_0 = null;

        EObject this_LdDirect_1 = null;

        EObject this_LdIndexed_2 = null;

        EObject this_LdBasedIndexed_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:149:2: ( (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed ) )
            // InternalPds16asm.g:150:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            {
            // InternalPds16asm.g:150:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalPds16asm.g:151:3: this_LdImmediate_0= ruleLdImmediate
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
                    // InternalPds16asm.g:160:3: this_LdDirect_1= ruleLdDirect
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
                    // InternalPds16asm.g:169:3: this_LdIndexed_2= ruleLdIndexed
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
                    // InternalPds16asm.g:178:3: this_LdBasedIndexed_3= ruleLdBasedIndexed
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


    // $ANTLR start "entryRuleLdImmediate"
    // InternalPds16asm.g:190:1: entryRuleLdImmediate returns [EObject current=null] : iv_ruleLdImmediate= ruleLdImmediate EOF ;
    public final EObject entryRuleLdImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdImmediate = null;


        try {
            // InternalPds16asm.g:190:52: (iv_ruleLdImmediate= ruleLdImmediate EOF )
            // InternalPds16asm.g:191:2: iv_ruleLdImmediate= ruleLdImmediate EOF
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
    // InternalPds16asm.g:197:1: ruleLdImmediate returns [EObject current=null] : ( (otherlv_0= 'ldi' this_Immediate_1= ruleImmediate ) | (otherlv_2= 'ldih' this_Immediate_3= ruleImmediate ) ) ;
    public final EObject ruleLdImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Immediate_1 = null;

        EObject this_Immediate_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:203:2: ( ( (otherlv_0= 'ldi' this_Immediate_1= ruleImmediate ) | (otherlv_2= 'ldih' this_Immediate_3= ruleImmediate ) ) )
            // InternalPds16asm.g:204:2: ( (otherlv_0= 'ldi' this_Immediate_1= ruleImmediate ) | (otherlv_2= 'ldih' this_Immediate_3= ruleImmediate ) )
            {
            // InternalPds16asm.g:204:2: ( (otherlv_0= 'ldi' this_Immediate_1= ruleImmediate ) | (otherlv_2= 'ldih' this_Immediate_3= ruleImmediate ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPds16asm.g:205:3: (otherlv_0= 'ldi' this_Immediate_1= ruleImmediate )
                    {
                    // InternalPds16asm.g:205:3: (otherlv_0= 'ldi' this_Immediate_1= ruleImmediate )
                    // InternalPds16asm.g:206:4: otherlv_0= 'ldi' this_Immediate_1= ruleImmediate
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdImmediateAccess().getLdiKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getLdImmediateAccess().getImmediateParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Immediate_1=ruleImmediate();

                    state._fsp--;


                    				current = this_Immediate_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:220:3: (otherlv_2= 'ldih' this_Immediate_3= ruleImmediate )
                    {
                    // InternalPds16asm.g:220:3: (otherlv_2= 'ldih' this_Immediate_3= ruleImmediate )
                    // InternalPds16asm.g:221:4: otherlv_2= 'ldih' this_Immediate_3= ruleImmediate
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getLdImmediateAccess().getLdihKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getLdImmediateAccess().getImmediateParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Immediate_3=ruleImmediate();

                    state._fsp--;


                    				current = this_Immediate_3;
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
    // $ANTLR end "ruleLdImmediate"


    // $ANTLR start "entryRuleLdDirect"
    // InternalPds16asm.g:238:1: entryRuleLdDirect returns [EObject current=null] : iv_ruleLdDirect= ruleLdDirect EOF ;
    public final EObject entryRuleLdDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdDirect = null;


        try {
            // InternalPds16asm.g:238:49: (iv_ruleLdDirect= ruleLdDirect EOF )
            // InternalPds16asm.g:239:2: iv_ruleLdDirect= ruleLdDirect EOF
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
    // InternalPds16asm.g:245:1: ruleLdDirect returns [EObject current=null] : ( (otherlv_0= 'ld' this_Direct_1= ruleDirect ) | (otherlv_2= 'ldb' this_Direct_3= ruleDirect ) ) ;
    public final EObject ruleLdDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Direct_1 = null;

        EObject this_Direct_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:251:2: ( ( (otherlv_0= 'ld' this_Direct_1= ruleDirect ) | (otherlv_2= 'ldb' this_Direct_3= ruleDirect ) ) )
            // InternalPds16asm.g:252:2: ( (otherlv_0= 'ld' this_Direct_1= ruleDirect ) | (otherlv_2= 'ldb' this_Direct_3= ruleDirect ) )
            {
            // InternalPds16asm.g:252:2: ( (otherlv_0= 'ld' this_Direct_1= ruleDirect ) | (otherlv_2= 'ldb' this_Direct_3= ruleDirect ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPds16asm.g:253:3: (otherlv_0= 'ld' this_Direct_1= ruleDirect )
                    {
                    // InternalPds16asm.g:253:3: (otherlv_0= 'ld' this_Direct_1= ruleDirect )
                    // InternalPds16asm.g:254:4: otherlv_0= 'ld' this_Direct_1= ruleDirect
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdDirectAccess().getLdKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getLdDirectAccess().getDirectParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Direct_1=ruleDirect();

                    state._fsp--;


                    				current = this_Direct_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:268:3: (otherlv_2= 'ldb' this_Direct_3= ruleDirect )
                    {
                    // InternalPds16asm.g:268:3: (otherlv_2= 'ldb' this_Direct_3= ruleDirect )
                    // InternalPds16asm.g:269:4: otherlv_2= 'ldb' this_Direct_3= ruleDirect
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getLdDirectAccess().getLdbKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getLdDirectAccess().getDirectParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Direct_3=ruleDirect();

                    state._fsp--;


                    				current = this_Direct_3;
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
    // $ANTLR end "ruleLdDirect"


    // $ANTLR start "entryRuleLdIndexed"
    // InternalPds16asm.g:286:1: entryRuleLdIndexed returns [EObject current=null] : iv_ruleLdIndexed= ruleLdIndexed EOF ;
    public final EObject entryRuleLdIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdIndexed = null;


        try {
            // InternalPds16asm.g:286:50: (iv_ruleLdIndexed= ruleLdIndexed EOF )
            // InternalPds16asm.g:287:2: iv_ruleLdIndexed= ruleLdIndexed EOF
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
    // InternalPds16asm.g:293:1: ruleLdIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' this_Indexed_1= ruleIndexed ) | (otherlv_2= 'ldb' this_Indexed_3= ruleIndexed ) ) ;
    public final EObject ruleLdIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Indexed_1 = null;

        EObject this_Indexed_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:299:2: ( ( (otherlv_0= 'ld' this_Indexed_1= ruleIndexed ) | (otherlv_2= 'ldb' this_Indexed_3= ruleIndexed ) ) )
            // InternalPds16asm.g:300:2: ( (otherlv_0= 'ld' this_Indexed_1= ruleIndexed ) | (otherlv_2= 'ldb' this_Indexed_3= ruleIndexed ) )
            {
            // InternalPds16asm.g:300:2: ( (otherlv_0= 'ld' this_Indexed_1= ruleIndexed ) | (otherlv_2= 'ldb' this_Indexed_3= ruleIndexed ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPds16asm.g:301:3: (otherlv_0= 'ld' this_Indexed_1= ruleIndexed )
                    {
                    // InternalPds16asm.g:301:3: (otherlv_0= 'ld' this_Indexed_1= ruleIndexed )
                    // InternalPds16asm.g:302:4: otherlv_0= 'ld' this_Indexed_1= ruleIndexed
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdIndexedAccess().getLdKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getLdIndexedAccess().getIndexedParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Indexed_1=ruleIndexed();

                    state._fsp--;


                    				current = this_Indexed_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:316:3: (otherlv_2= 'ldb' this_Indexed_3= ruleIndexed )
                    {
                    // InternalPds16asm.g:316:3: (otherlv_2= 'ldb' this_Indexed_3= ruleIndexed )
                    // InternalPds16asm.g:317:4: otherlv_2= 'ldb' this_Indexed_3= ruleIndexed
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getLdIndexedAccess().getLdbKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getLdIndexedAccess().getIndexedParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Indexed_3=ruleIndexed();

                    state._fsp--;


                    				current = this_Indexed_3;
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
    // $ANTLR end "ruleLdIndexed"


    // $ANTLR start "entryRuleLdBasedIndexed"
    // InternalPds16asm.g:334:1: entryRuleLdBasedIndexed returns [EObject current=null] : iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF ;
    public final EObject entryRuleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdBasedIndexed = null;


        try {
            // InternalPds16asm.g:334:55: (iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF )
            // InternalPds16asm.g:335:2: iv_ruleLdBasedIndexed= ruleLdBasedIndexed EOF
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
    // InternalPds16asm.g:341:1: ruleLdBasedIndexed returns [EObject current=null] : ( (otherlv_0= 'ld' this_BasedIndexed_1= ruleBasedIndexed ) | (otherlv_2= 'ldb' this_BasedIndexed_3= ruleBasedIndexed ) ) ;
    public final EObject ruleLdBasedIndexed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BasedIndexed_1 = null;

        EObject this_BasedIndexed_3 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:347:2: ( ( (otherlv_0= 'ld' this_BasedIndexed_1= ruleBasedIndexed ) | (otherlv_2= 'ldb' this_BasedIndexed_3= ruleBasedIndexed ) ) )
            // InternalPds16asm.g:348:2: ( (otherlv_0= 'ld' this_BasedIndexed_1= ruleBasedIndexed ) | (otherlv_2= 'ldb' this_BasedIndexed_3= ruleBasedIndexed ) )
            {
            // InternalPds16asm.g:348:2: ( (otherlv_0= 'ld' this_BasedIndexed_1= ruleBasedIndexed ) | (otherlv_2= 'ldb' this_BasedIndexed_3= ruleBasedIndexed ) )
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
                    // InternalPds16asm.g:349:3: (otherlv_0= 'ld' this_BasedIndexed_1= ruleBasedIndexed )
                    {
                    // InternalPds16asm.g:349:3: (otherlv_0= 'ld' this_BasedIndexed_1= ruleBasedIndexed )
                    // InternalPds16asm.g:350:4: otherlv_0= 'ld' this_BasedIndexed_1= ruleBasedIndexed
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLdBasedIndexedAccess().getLdKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getLdBasedIndexedAccess().getBasedIndexedParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_BasedIndexed_1=ruleBasedIndexed();

                    state._fsp--;


                    				current = this_BasedIndexed_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:364:3: (otherlv_2= 'ldb' this_BasedIndexed_3= ruleBasedIndexed )
                    {
                    // InternalPds16asm.g:364:3: (otherlv_2= 'ldb' this_BasedIndexed_3= ruleBasedIndexed )
                    // InternalPds16asm.g:365:4: otherlv_2= 'ldb' this_BasedIndexed_3= ruleBasedIndexed
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getLdBasedIndexedAccess().getLdbKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getLdBasedIndexedAccess().getBasedIndexedParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_BasedIndexed_3=ruleBasedIndexed();

                    state._fsp--;


                    				current = this_BasedIndexed_3;
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
    // $ANTLR end "ruleLdBasedIndexed"


    // $ANTLR start "entryRuleImmediate"
    // InternalPds16asm.g:382:1: entryRuleImmediate returns [EObject current=null] : iv_ruleImmediate= ruleImmediate EOF ;
    public final EObject entryRuleImmediate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmediate = null;


        try {
            // InternalPds16asm.g:382:50: (iv_ruleImmediate= ruleImmediate EOF )
            // InternalPds16asm.g:383:2: iv_ruleImmediate= ruleImmediate EOF
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
    // InternalPds16asm.g:389:1: ruleImmediate returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) ) ;
    public final EObject ruleImmediate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_register_0_0 = null;

        EObject lv_immediate8_2_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:395:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) ) )
            // InternalPds16asm.g:396:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) )
            {
            // InternalPds16asm.g:396:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) ) )
            // InternalPds16asm.g:397:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_immediate8_2_0= ruleHexaDecimal ) )
            {
            // InternalPds16asm.g:397:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:398:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:398:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:399:5: lv_register_0_0= ruleRegisters
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

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImmediateAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:420:3: ( (lv_immediate8_2_0= ruleHexaDecimal ) )
            // InternalPds16asm.g:421:4: (lv_immediate8_2_0= ruleHexaDecimal )
            {
            // InternalPds16asm.g:421:4: (lv_immediate8_2_0= ruleHexaDecimal )
            // InternalPds16asm.g:422:5: lv_immediate8_2_0= ruleHexaDecimal
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
    // InternalPds16asm.g:443:1: entryRuleDirect returns [EObject current=null] : iv_ruleDirect= ruleDirect EOF ;
    public final EObject entryRuleDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirect = null;


        try {
            // InternalPds16asm.g:443:47: (iv_ruleDirect= ruleDirect EOF )
            // InternalPds16asm.g:444:2: iv_ruleDirect= ruleDirect EOF
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
    // InternalPds16asm.g:450:1: ruleDirect returns [EObject current=null] : ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) ) ;
    public final EObject ruleDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_direct7_2_0=null;
        EObject lv_register_0_0 = null;



        	enterRule();

        try {
            // InternalPds16asm.g:456:2: ( ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) ) )
            // InternalPds16asm.g:457:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) )
            {
            // InternalPds16asm.g:457:2: ( ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) ) )
            // InternalPds16asm.g:458:3: ( (lv_register_0_0= ruleRegisters ) ) otherlv_1= ',' ( (lv_direct7_2_0= RULE_HEX ) )
            {
            // InternalPds16asm.g:458:3: ( (lv_register_0_0= ruleRegisters ) )
            // InternalPds16asm.g:459:4: (lv_register_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:459:4: (lv_register_0_0= ruleRegisters )
            // InternalPds16asm.g:460:5: lv_register_0_0= ruleRegisters
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

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectAccess().getCommaKeyword_1());
            		
            // InternalPds16asm.g:481:3: ( (lv_direct7_2_0= RULE_HEX ) )
            // InternalPds16asm.g:482:4: (lv_direct7_2_0= RULE_HEX )
            {
            // InternalPds16asm.g:482:4: (lv_direct7_2_0= RULE_HEX )
            // InternalPds16asm.g:483:5: lv_direct7_2_0= RULE_HEX
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
    // InternalPds16asm.g:503:1: entryRuleIndexed returns [EObject current=null] : iv_ruleIndexed= ruleIndexed EOF ;
    public final EObject entryRuleIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexed = null;


        try {
            // InternalPds16asm.g:503:48: (iv_ruleIndexed= ruleIndexed EOF )
            // InternalPds16asm.g:504:2: iv_ruleIndexed= ruleIndexed EOF
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
    // InternalPds16asm.g:510:1: ruleIndexed returns [EObject current=null] : ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' ) ;
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
            // InternalPds16asm.g:516:2: ( ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' ) )
            // InternalPds16asm.g:517:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' )
            {
            // InternalPds16asm.g:517:2: ( ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']' )
            // InternalPds16asm.g:518:3: ( (lv_rd_0_0= ruleRegisters ) ) otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_index_5_0= '#' ) ) (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX ) otherlv_8= ']'
            {
            // InternalPds16asm.g:518:3: ( (lv_rd_0_0= ruleRegisters ) )
            // InternalPds16asm.g:519:4: (lv_rd_0_0= ruleRegisters )
            {
            // InternalPds16asm.g:519:4: (lv_rd_0_0= ruleRegisters )
            // InternalPds16asm.g:520:5: lv_rd_0_0= ruleRegisters
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

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:545:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:546:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:546:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:547:5: lv_rbx_3_0= ruleRegisters
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

            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:568:3: ( (lv_index_5_0= '#' ) )
            // InternalPds16asm.g:569:4: (lv_index_5_0= '#' )
            {
            // InternalPds16asm.g:569:4: (lv_index_5_0= '#' )
            // InternalPds16asm.g:570:5: lv_index_5_0= '#'
            {
            lv_index_5_0=(Token)match(input,19,FOLLOW_9); 

            					newLeafNode(lv_index_5_0, grammarAccess.getIndexedAccess().getIndexNumberSignKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexedRule());
            					}
            					setWithLastConsumed(current, "index", lv_index_5_0, "#");
            				

            }


            }

            // InternalPds16asm.g:582:3: (this_INT_6= RULE_INT | this_HEX_7= RULE_HEX )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HEX) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPds16asm.g:583:4: this_INT_6= RULE_INT
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				newLeafNode(this_INT_6, grammarAccess.getIndexedAccess().getINTTerminalRuleCall_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:588:4: this_HEX_7= RULE_HEX
                    {
                    this_HEX_7=(Token)match(input,RULE_HEX,FOLLOW_10); 

                    				newLeafNode(this_HEX_7, grammarAccess.getIndexedAccess().getHEXTerminalRuleCall_6_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

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
    // InternalPds16asm.g:601:1: entryRuleBasedIndexed returns [EObject current=null] : iv_ruleBasedIndexed= ruleBasedIndexed EOF ;
    public final EObject entryRuleBasedIndexed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasedIndexed = null;


        try {
            // InternalPds16asm.g:601:53: (iv_ruleBasedIndexed= ruleBasedIndexed EOF )
            // InternalPds16asm.g:602:2: iv_ruleBasedIndexed= ruleBasedIndexed EOF
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
    // InternalPds16asm.g:608:1: ruleBasedIndexed returns [EObject current=null] : (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) ;
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
            // InternalPds16asm.g:614:2: ( (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' ) )
            // InternalPds16asm.g:615:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            {
            // InternalPds16asm.g:615:2: (this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']' )
            // InternalPds16asm.g:616:3: this_Registers_0= ruleRegisters otherlv_1= ',' otherlv_2= '[' ( (lv_rbx_3_0= ruleRegisters ) ) otherlv_4= ',' ( (lv_rix_5_0= ruleRegisters ) ) otherlv_6= ']'
            {

            			newCompositeNode(grammarAccess.getBasedIndexedAccess().getRegistersParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Registers_0=ruleRegisters();

            state._fsp--;


            			current = this_Registers_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBasedIndexedAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBasedIndexedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPds16asm.g:632:3: ( (lv_rbx_3_0= ruleRegisters ) )
            // InternalPds16asm.g:633:4: (lv_rbx_3_0= ruleRegisters )
            {
            // InternalPds16asm.g:633:4: (lv_rbx_3_0= ruleRegisters )
            // InternalPds16asm.g:634:5: lv_rbx_3_0= ruleRegisters
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

            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getBasedIndexedAccess().getCommaKeyword_4());
            		
            // InternalPds16asm.g:655:3: ( (lv_rix_5_0= ruleRegisters ) )
            // InternalPds16asm.g:656:4: (lv_rix_5_0= ruleRegisters )
            {
            // InternalPds16asm.g:656:4: (lv_rix_5_0= ruleRegisters )
            // InternalPds16asm.g:657:5: lv_rix_5_0= ruleRegisters
            {

            					newCompositeNode(grammarAccess.getBasedIndexedAccess().getRixRegistersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalPds16asm.g:682:1: entryRuleHexaDecimal returns [EObject current=null] : iv_ruleHexaDecimal= ruleHexaDecimal EOF ;
    public final EObject entryRuleHexaDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexaDecimal = null;


        try {
            // InternalPds16asm.g:682:52: (iv_ruleHexaDecimal= ruleHexaDecimal EOF )
            // InternalPds16asm.g:683:2: iv_ruleHexaDecimal= ruleHexaDecimal EOF
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
    // InternalPds16asm.g:689:1: ruleHexaDecimal returns [EObject current=null] : (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexaDecimal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:695:2: ( (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) ) )
            // InternalPds16asm.g:696:2: (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) )
            {
            // InternalPds16asm.g:696:2: (otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) ) )
            // InternalPds16asm.g:697:3: otherlv_0= '#' ( (lv_number_1_0= RULE_HEX ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getHexaDecimalAccess().getNumberSignKeyword_0());
            		
            // InternalPds16asm.g:701:3: ( (lv_number_1_0= RULE_HEX ) )
            // InternalPds16asm.g:702:4: (lv_number_1_0= RULE_HEX )
            {
            // InternalPds16asm.g:702:4: (lv_number_1_0= RULE_HEX )
            // InternalPds16asm.g:703:5: lv_number_1_0= RULE_HEX
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


    // $ANTLR start "entryRuleComment"
    // InternalPds16asm.g:723:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalPds16asm.g:723:48: (iv_ruleComment= ruleComment EOF )
            // InternalPds16asm.g:724:2: iv_ruleComment= ruleComment EOF
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
    // InternalPds16asm.g:730:1: ruleComment returns [EObject current=null] : ( (lv_value_0_0= RULE_COMT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPds16asm.g:736:2: ( ( (lv_value_0_0= RULE_COMT ) ) )
            // InternalPds16asm.g:737:2: ( (lv_value_0_0= RULE_COMT ) )
            {
            // InternalPds16asm.g:737:2: ( (lv_value_0_0= RULE_COMT ) )
            // InternalPds16asm.g:738:3: (lv_value_0_0= RULE_COMT )
            {
            // InternalPds16asm.g:738:3: (lv_value_0_0= RULE_COMT )
            // InternalPds16asm.g:739:4: lv_value_0_0= RULE_COMT
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
    // InternalPds16asm.g:758:1: entryRuleRegisters returns [EObject current=null] : iv_ruleRegisters= ruleRegisters EOF ;
    public final EObject entryRuleRegisters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisters = null;


        try {
            // InternalPds16asm.g:758:50: (iv_ruleRegisters= ruleRegisters EOF )
            // InternalPds16asm.g:759:2: iv_ruleRegisters= ruleRegisters EOF
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
    // InternalPds16asm.g:765:1: ruleRegisters returns [EObject current=null] : ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' ) ) ) ;
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


        	enterRule();

        try {
            // InternalPds16asm.g:771:2: ( ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' ) ) ) )
            // InternalPds16asm.g:772:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' ) ) )
            {
            // InternalPds16asm.g:772:2: ( ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' ) ) )
            // InternalPds16asm.g:773:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' ) )
            {
            // InternalPds16asm.g:773:3: ( (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' ) )
            // InternalPds16asm.g:774:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' )
            {
            // InternalPds16asm.g:774:4: (lv_value_0_1= 'r0' | lv_value_0_2= 'r1' | lv_value_0_3= 'r2' | lv_value_0_4= 'r3' | lv_value_0_5= 'r4' | lv_value_0_6= 'r5' | lv_value_0_7= 'r6' | lv_value_0_8= 'r7' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            case 27:
                {
                alt9=7;
                }
                break;
            case 28:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPds16asm.g:775:5: lv_value_0_1= 'r0'
                    {
                    lv_value_0_1=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getRegistersAccess().getValueR0Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:786:5: lv_value_0_2= 'r1'
                    {
                    lv_value_0_2=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getRegistersAccess().getValueR1Keyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalPds16asm.g:797:5: lv_value_0_3= 'r2'
                    {
                    lv_value_0_3=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getRegistersAccess().getValueR2Keyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalPds16asm.g:808:5: lv_value_0_4= 'r3'
                    {
                    lv_value_0_4=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getRegistersAccess().getValueR3Keyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalPds16asm.g:819:5: lv_value_0_5= 'r4'
                    {
                    lv_value_0_5=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getRegistersAccess().getValueR4Keyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalPds16asm.g:830:5: lv_value_0_6= 'r5'
                    {
                    lv_value_0_6=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getRegistersAccess().getValueR5Keyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalPds16asm.g:841:5: lv_value_0_7= 'r6'
                    {
                    lv_value_0_7=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getRegistersAccess().getValueR6Keyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalPds16asm.g:852:5: lv_value_0_8= 'r7'
                    {
                    lv_value_0_8=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getRegistersAccess().getValueR7Keyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegistersRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

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
    static final String dfa_1s = "\55\uffff";
    static final String dfa_2s = "\1\15\1\uffff\2\25\20\21\2\4\1\25\1\uffff\1\25\20\21\2\23\2\uffff";
    static final String dfa_3s = "\1\20\1\uffff\2\34\20\21\2\22\1\34\1\uffff\1\34\20\21\2\34\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\25\uffff\1\2\23\uffff\1\3\1\4";
    static final String dfa_5s = "\55\uffff}>";
    static final String[] dfa_6s = {
            "\2\1\1\2\1\3",
            "",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\27\15\uffff\1\26",
            "\1\27\15\uffff\1\30",
            "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40",
            "",
            "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\52",
            "\1\52",
            "\1\52",
            "\1\52",
            "\1\52",
            "\1\52",
            "\1\52",
            "\1\52",
            "\1\53\1\uffff\10\54",
            "\1\53\1\uffff\10\54",
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
            return "150:2: (this_LdImmediate_0= ruleLdImmediate | this_LdDirect_1= ruleLdDirect | this_LdIndexed_2= ruleLdIndexed | this_LdBasedIndexed_3= ruleLdBasedIndexed )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001E042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});

}
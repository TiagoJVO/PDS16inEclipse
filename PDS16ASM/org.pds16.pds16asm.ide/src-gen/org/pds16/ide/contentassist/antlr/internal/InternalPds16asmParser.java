package org.pds16.ide.contentassist.antlr.internal;

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
import org.pds16.services.Pds16asmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPds16asmParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(Pds16asmGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalPds16asm.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPds16asm.g:54:1: ( ruleModel EOF )
            // InternalPds16asm.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPds16asm.g:62:1: ruleModel : ( ( rule__Model__OperationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:66:2: ( ( ( rule__Model__OperationsAssignment )* ) )
            // InternalPds16asm.g:67:2: ( ( rule__Model__OperationsAssignment )* )
            {
            // InternalPds16asm.g:67:2: ( ( rule__Model__OperationsAssignment )* )
            // InternalPds16asm.g:68:3: ( rule__Model__OperationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getOperationsAssignment()); 
            // InternalPds16asm.g:69:3: ( rule__Model__OperationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPds16asm.g:69:4: rule__Model__OperationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__OperationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getOperationsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOperations"
    // InternalPds16asm.g:78:1: entryRuleOperations : ruleOperations EOF ;
    public final void entryRuleOperations() throws RecognitionException {
        try {
            // InternalPds16asm.g:79:1: ( ruleOperations EOF )
            // InternalPds16asm.g:80:1: ruleOperations EOF
            {
             before(grammarAccess.getOperationsRule()); 
            pushFollow(FOLLOW_1);
            ruleOperations();

            state._fsp--;

             after(grammarAccess.getOperationsRule()); 
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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalPds16asm.g:87:1: ruleOperations : ( ( rule__Operations__Alternatives ) ) ;
    public final void ruleOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:91:2: ( ( ( rule__Operations__Alternatives ) ) )
            // InternalPds16asm.g:92:2: ( ( rule__Operations__Alternatives ) )
            {
            // InternalPds16asm.g:92:2: ( ( rule__Operations__Alternatives ) )
            // InternalPds16asm.g:93:3: ( rule__Operations__Alternatives )
            {
             before(grammarAccess.getOperationsAccess().getAlternatives()); 
            // InternalPds16asm.g:94:3: ( rule__Operations__Alternatives )
            // InternalPds16asm.g:94:4: rule__Operations__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleOperationLDI"
    // InternalPds16asm.g:103:1: entryRuleOperationLDI : ruleOperationLDI EOF ;
    public final void entryRuleOperationLDI() throws RecognitionException {
        try {
            // InternalPds16asm.g:104:1: ( ruleOperationLDI EOF )
            // InternalPds16asm.g:105:1: ruleOperationLDI EOF
            {
             before(grammarAccess.getOperationLDIRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationLDI();

            state._fsp--;

             after(grammarAccess.getOperationLDIRule()); 
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
    // $ANTLR end "entryRuleOperationLDI"


    // $ANTLR start "ruleOperationLDI"
    // InternalPds16asm.g:112:1: ruleOperationLDI : ( ( rule__OperationLDI__Group__0 ) ) ;
    public final void ruleOperationLDI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:116:2: ( ( ( rule__OperationLDI__Group__0 ) ) )
            // InternalPds16asm.g:117:2: ( ( rule__OperationLDI__Group__0 ) )
            {
            // InternalPds16asm.g:117:2: ( ( rule__OperationLDI__Group__0 ) )
            // InternalPds16asm.g:118:3: ( rule__OperationLDI__Group__0 )
            {
             before(grammarAccess.getOperationLDIAccess().getGroup()); 
            // InternalPds16asm.g:119:3: ( rule__OperationLDI__Group__0 )
            // InternalPds16asm.g:119:4: rule__OperationLDI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationLDI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationLDIAccess().getGroup()); 

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
    // $ANTLR end "ruleOperationLDI"


    // $ANTLR start "entryRuleOperationLD2"
    // InternalPds16asm.g:128:1: entryRuleOperationLD2 : ruleOperationLD2 EOF ;
    public final void entryRuleOperationLD2() throws RecognitionException {
        try {
            // InternalPds16asm.g:129:1: ( ruleOperationLD2 EOF )
            // InternalPds16asm.g:130:1: ruleOperationLD2 EOF
            {
             before(grammarAccess.getOperationLD2Rule()); 
            pushFollow(FOLLOW_1);
            ruleOperationLD2();

            state._fsp--;

             after(grammarAccess.getOperationLD2Rule()); 
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
    // $ANTLR end "entryRuleOperationLD2"


    // $ANTLR start "ruleOperationLD2"
    // InternalPds16asm.g:137:1: ruleOperationLD2 : ( ( rule__OperationLD2__Group__0 ) ) ;
    public final void ruleOperationLD2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:141:2: ( ( ( rule__OperationLD2__Group__0 ) ) )
            // InternalPds16asm.g:142:2: ( ( rule__OperationLD2__Group__0 ) )
            {
            // InternalPds16asm.g:142:2: ( ( rule__OperationLD2__Group__0 ) )
            // InternalPds16asm.g:143:3: ( rule__OperationLD2__Group__0 )
            {
             before(grammarAccess.getOperationLD2Access().getGroup()); 
            // InternalPds16asm.g:144:3: ( rule__OperationLD2__Group__0 )
            // InternalPds16asm.g:144:4: rule__OperationLD2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationLD2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationLD2Access().getGroup()); 

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
    // $ANTLR end "ruleOperationLD2"


    // $ANTLR start "entryRuleIndexed"
    // InternalPds16asm.g:153:1: entryRuleIndexed : ruleIndexed EOF ;
    public final void entryRuleIndexed() throws RecognitionException {
        try {
            // InternalPds16asm.g:154:1: ( ruleIndexed EOF )
            // InternalPds16asm.g:155:1: ruleIndexed EOF
            {
             before(grammarAccess.getIndexedRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexed();

            state._fsp--;

             after(grammarAccess.getIndexedRule()); 
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
    // $ANTLR end "entryRuleIndexed"


    // $ANTLR start "ruleIndexed"
    // InternalPds16asm.g:162:1: ruleIndexed : ( ( rule__Indexed__Group__0 ) ) ;
    public final void ruleIndexed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:166:2: ( ( ( rule__Indexed__Group__0 ) ) )
            // InternalPds16asm.g:167:2: ( ( rule__Indexed__Group__0 ) )
            {
            // InternalPds16asm.g:167:2: ( ( rule__Indexed__Group__0 ) )
            // InternalPds16asm.g:168:3: ( rule__Indexed__Group__0 )
            {
             before(grammarAccess.getIndexedAccess().getGroup()); 
            // InternalPds16asm.g:169:3: ( rule__Indexed__Group__0 )
            // InternalPds16asm.g:169:4: rule__Indexed__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Indexed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexedAccess().getGroup()); 

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
    // $ANTLR end "ruleIndexed"


    // $ANTLR start "entryRuleHexaDecimal"
    // InternalPds16asm.g:178:1: entryRuleHexaDecimal : ruleHexaDecimal EOF ;
    public final void entryRuleHexaDecimal() throws RecognitionException {
        try {
            // InternalPds16asm.g:179:1: ( ruleHexaDecimal EOF )
            // InternalPds16asm.g:180:1: ruleHexaDecimal EOF
            {
             before(grammarAccess.getHexaDecimalRule()); 
            pushFollow(FOLLOW_1);
            ruleHexaDecimal();

            state._fsp--;

             after(grammarAccess.getHexaDecimalRule()); 
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
    // $ANTLR end "entryRuleHexaDecimal"


    // $ANTLR start "ruleHexaDecimal"
    // InternalPds16asm.g:187:1: ruleHexaDecimal : ( ( rule__HexaDecimal__Group__0 ) ) ;
    public final void ruleHexaDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:191:2: ( ( ( rule__HexaDecimal__Group__0 ) ) )
            // InternalPds16asm.g:192:2: ( ( rule__HexaDecimal__Group__0 ) )
            {
            // InternalPds16asm.g:192:2: ( ( rule__HexaDecimal__Group__0 ) )
            // InternalPds16asm.g:193:3: ( rule__HexaDecimal__Group__0 )
            {
             before(grammarAccess.getHexaDecimalAccess().getGroup()); 
            // InternalPds16asm.g:194:3: ( rule__HexaDecimal__Group__0 )
            // InternalPds16asm.g:194:4: rule__HexaDecimal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HexaDecimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHexaDecimalAccess().getGroup()); 

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
    // $ANTLR end "ruleHexaDecimal"


    // $ANTLR start "entryRuleRegisters"
    // InternalPds16asm.g:203:1: entryRuleRegisters : ruleRegisters EOF ;
    public final void entryRuleRegisters() throws RecognitionException {
        try {
            // InternalPds16asm.g:204:1: ( ruleRegisters EOF )
            // InternalPds16asm.g:205:1: ruleRegisters EOF
            {
             before(grammarAccess.getRegistersRule()); 
            pushFollow(FOLLOW_1);
            ruleRegisters();

            state._fsp--;

             after(grammarAccess.getRegistersRule()); 
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
    // $ANTLR end "entryRuleRegisters"


    // $ANTLR start "ruleRegisters"
    // InternalPds16asm.g:212:1: ruleRegisters : ( ( rule__Registers__Alternatives ) ) ;
    public final void ruleRegisters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:216:2: ( ( ( rule__Registers__Alternatives ) ) )
            // InternalPds16asm.g:217:2: ( ( rule__Registers__Alternatives ) )
            {
            // InternalPds16asm.g:217:2: ( ( rule__Registers__Alternatives ) )
            // InternalPds16asm.g:218:3: ( rule__Registers__Alternatives )
            {
             before(grammarAccess.getRegistersAccess().getAlternatives()); 
            // InternalPds16asm.g:219:3: ( rule__Registers__Alternatives )
            // InternalPds16asm.g:219:4: rule__Registers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Registers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegistersAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRegisters"


    // $ANTLR start "entryRuleR1"
    // InternalPds16asm.g:228:1: entryRuleR1 : ruleR1 EOF ;
    public final void entryRuleR1() throws RecognitionException {
        try {
            // InternalPds16asm.g:229:1: ( ruleR1 EOF )
            // InternalPds16asm.g:230:1: ruleR1 EOF
            {
             before(grammarAccess.getR1Rule()); 
            pushFollow(FOLLOW_1);
            ruleR1();

            state._fsp--;

             after(grammarAccess.getR1Rule()); 
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
    // $ANTLR end "entryRuleR1"


    // $ANTLR start "ruleR1"
    // InternalPds16asm.g:237:1: ruleR1 : ( ( rule__R1__ValueAssignment ) ) ;
    public final void ruleR1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:241:2: ( ( ( rule__R1__ValueAssignment ) ) )
            // InternalPds16asm.g:242:2: ( ( rule__R1__ValueAssignment ) )
            {
            // InternalPds16asm.g:242:2: ( ( rule__R1__ValueAssignment ) )
            // InternalPds16asm.g:243:3: ( rule__R1__ValueAssignment )
            {
             before(grammarAccess.getR1Access().getValueAssignment()); 
            // InternalPds16asm.g:244:3: ( rule__R1__ValueAssignment )
            // InternalPds16asm.g:244:4: rule__R1__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__R1__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getR1Access().getValueAssignment()); 

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
    // $ANTLR end "ruleR1"


    // $ANTLR start "entryRuleR2"
    // InternalPds16asm.g:253:1: entryRuleR2 : ruleR2 EOF ;
    public final void entryRuleR2() throws RecognitionException {
        try {
            // InternalPds16asm.g:254:1: ( ruleR2 EOF )
            // InternalPds16asm.g:255:1: ruleR2 EOF
            {
             before(grammarAccess.getR2Rule()); 
            pushFollow(FOLLOW_1);
            ruleR2();

            state._fsp--;

             after(grammarAccess.getR2Rule()); 
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
    // $ANTLR end "entryRuleR2"


    // $ANTLR start "ruleR2"
    // InternalPds16asm.g:262:1: ruleR2 : ( ( rule__R2__ValueAssignment ) ) ;
    public final void ruleR2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:266:2: ( ( ( rule__R2__ValueAssignment ) ) )
            // InternalPds16asm.g:267:2: ( ( rule__R2__ValueAssignment ) )
            {
            // InternalPds16asm.g:267:2: ( ( rule__R2__ValueAssignment ) )
            // InternalPds16asm.g:268:3: ( rule__R2__ValueAssignment )
            {
             before(grammarAccess.getR2Access().getValueAssignment()); 
            // InternalPds16asm.g:269:3: ( rule__R2__ValueAssignment )
            // InternalPds16asm.g:269:4: rule__R2__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__R2__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getR2Access().getValueAssignment()); 

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
    // $ANTLR end "ruleR2"


    // $ANTLR start "rule__Operations__Alternatives"
    // InternalPds16asm.g:277:1: rule__Operations__Alternatives : ( ( ruleOperationLDI ) | ( ruleOperationLD2 ) );
    public final void rule__Operations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:281:1: ( ( ruleOperationLDI ) | ( ruleOperationLD2 ) )
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
                    // InternalPds16asm.g:282:2: ( ruleOperationLDI )
                    {
                    // InternalPds16asm.g:282:2: ( ruleOperationLDI )
                    // InternalPds16asm.g:283:3: ruleOperationLDI
                    {
                     before(grammarAccess.getOperationsAccess().getOperationLDIParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationLDI();

                    state._fsp--;

                     after(grammarAccess.getOperationsAccess().getOperationLDIParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:288:2: ( ruleOperationLD2 )
                    {
                    // InternalPds16asm.g:288:2: ( ruleOperationLD2 )
                    // InternalPds16asm.g:289:3: ruleOperationLD2
                    {
                     before(grammarAccess.getOperationsAccess().getOperationLD2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationLD2();

                    state._fsp--;

                     after(grammarAccess.getOperationsAccess().getOperationLD2ParserRuleCall_1()); 

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
    // $ANTLR end "rule__Operations__Alternatives"


    // $ANTLR start "rule__Registers__Alternatives"
    // InternalPds16asm.g:298:1: rule__Registers__Alternatives : ( ( ruleR1 ) | ( ruleR2 ) );
    public final void rule__Registers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:302:1: ( ( ruleR1 ) | ( ruleR2 ) )
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
                    // InternalPds16asm.g:303:2: ( ruleR1 )
                    {
                    // InternalPds16asm.g:303:2: ( ruleR1 )
                    // InternalPds16asm.g:304:3: ruleR1
                    {
                     before(grammarAccess.getRegistersAccess().getR1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleR1();

                    state._fsp--;

                     after(grammarAccess.getRegistersAccess().getR1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:309:2: ( ruleR2 )
                    {
                    // InternalPds16asm.g:309:2: ( ruleR2 )
                    // InternalPds16asm.g:310:3: ruleR2
                    {
                     before(grammarAccess.getRegistersAccess().getR2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleR2();

                    state._fsp--;

                     after(grammarAccess.getRegistersAccess().getR2ParserRuleCall_1()); 

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
    // $ANTLR end "rule__Registers__Alternatives"


    // $ANTLR start "rule__OperationLDI__Group__0"
    // InternalPds16asm.g:319:1: rule__OperationLDI__Group__0 : rule__OperationLDI__Group__0__Impl rule__OperationLDI__Group__1 ;
    public final void rule__OperationLDI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:323:1: ( rule__OperationLDI__Group__0__Impl rule__OperationLDI__Group__1 )
            // InternalPds16asm.g:324:2: rule__OperationLDI__Group__0__Impl rule__OperationLDI__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OperationLDI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLDI__Group__1();

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
    // $ANTLR end "rule__OperationLDI__Group__0"


    // $ANTLR start "rule__OperationLDI__Group__0__Impl"
    // InternalPds16asm.g:331:1: rule__OperationLDI__Group__0__Impl : ( 'LDI' ) ;
    public final void rule__OperationLDI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:335:1: ( ( 'LDI' ) )
            // InternalPds16asm.g:336:1: ( 'LDI' )
            {
            // InternalPds16asm.g:336:1: ( 'LDI' )
            // InternalPds16asm.g:337:2: 'LDI'
            {
             before(grammarAccess.getOperationLDIAccess().getLDIKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getOperationLDIAccess().getLDIKeyword_0()); 

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
    // $ANTLR end "rule__OperationLDI__Group__0__Impl"


    // $ANTLR start "rule__OperationLDI__Group__1"
    // InternalPds16asm.g:346:1: rule__OperationLDI__Group__1 : rule__OperationLDI__Group__1__Impl rule__OperationLDI__Group__2 ;
    public final void rule__OperationLDI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:350:1: ( rule__OperationLDI__Group__1__Impl rule__OperationLDI__Group__2 )
            // InternalPds16asm.g:351:2: rule__OperationLDI__Group__1__Impl rule__OperationLDI__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__OperationLDI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLDI__Group__2();

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
    // $ANTLR end "rule__OperationLDI__Group__1"


    // $ANTLR start "rule__OperationLDI__Group__1__Impl"
    // InternalPds16asm.g:358:1: rule__OperationLDI__Group__1__Impl : ( ( rule__OperationLDI__RegisterAssignment_1 ) ) ;
    public final void rule__OperationLDI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:362:1: ( ( ( rule__OperationLDI__RegisterAssignment_1 ) ) )
            // InternalPds16asm.g:363:1: ( ( rule__OperationLDI__RegisterAssignment_1 ) )
            {
            // InternalPds16asm.g:363:1: ( ( rule__OperationLDI__RegisterAssignment_1 ) )
            // InternalPds16asm.g:364:2: ( rule__OperationLDI__RegisterAssignment_1 )
            {
             before(grammarAccess.getOperationLDIAccess().getRegisterAssignment_1()); 
            // InternalPds16asm.g:365:2: ( rule__OperationLDI__RegisterAssignment_1 )
            // InternalPds16asm.g:365:3: rule__OperationLDI__RegisterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationLDI__RegisterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationLDIAccess().getRegisterAssignment_1()); 

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
    // $ANTLR end "rule__OperationLDI__Group__1__Impl"


    // $ANTLR start "rule__OperationLDI__Group__2"
    // InternalPds16asm.g:373:1: rule__OperationLDI__Group__2 : rule__OperationLDI__Group__2__Impl rule__OperationLDI__Group__3 ;
    public final void rule__OperationLDI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:377:1: ( rule__OperationLDI__Group__2__Impl rule__OperationLDI__Group__3 )
            // InternalPds16asm.g:378:2: rule__OperationLDI__Group__2__Impl rule__OperationLDI__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__OperationLDI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLDI__Group__3();

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
    // $ANTLR end "rule__OperationLDI__Group__2"


    // $ANTLR start "rule__OperationLDI__Group__2__Impl"
    // InternalPds16asm.g:385:1: rule__OperationLDI__Group__2__Impl : ( ',' ) ;
    public final void rule__OperationLDI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:389:1: ( ( ',' ) )
            // InternalPds16asm.g:390:1: ( ',' )
            {
            // InternalPds16asm.g:390:1: ( ',' )
            // InternalPds16asm.g:391:2: ','
            {
             before(grammarAccess.getOperationLDIAccess().getCommaKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationLDIAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__OperationLDI__Group__2__Impl"


    // $ANTLR start "rule__OperationLDI__Group__3"
    // InternalPds16asm.g:400:1: rule__OperationLDI__Group__3 : rule__OperationLDI__Group__3__Impl rule__OperationLDI__Group__4 ;
    public final void rule__OperationLDI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:404:1: ( rule__OperationLDI__Group__3__Impl rule__OperationLDI__Group__4 )
            // InternalPds16asm.g:405:2: rule__OperationLDI__Group__3__Impl rule__OperationLDI__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__OperationLDI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLDI__Group__4();

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
    // $ANTLR end "rule__OperationLDI__Group__3"


    // $ANTLR start "rule__OperationLDI__Group__3__Impl"
    // InternalPds16asm.g:412:1: rule__OperationLDI__Group__3__Impl : ( ( rule__OperationLDI__Immediate8Assignment_3 ) ) ;
    public final void rule__OperationLDI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:416:1: ( ( ( rule__OperationLDI__Immediate8Assignment_3 ) ) )
            // InternalPds16asm.g:417:1: ( ( rule__OperationLDI__Immediate8Assignment_3 ) )
            {
            // InternalPds16asm.g:417:1: ( ( rule__OperationLDI__Immediate8Assignment_3 ) )
            // InternalPds16asm.g:418:2: ( rule__OperationLDI__Immediate8Assignment_3 )
            {
             before(grammarAccess.getOperationLDIAccess().getImmediate8Assignment_3()); 
            // InternalPds16asm.g:419:2: ( rule__OperationLDI__Immediate8Assignment_3 )
            // InternalPds16asm.g:419:3: rule__OperationLDI__Immediate8Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OperationLDI__Immediate8Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationLDIAccess().getImmediate8Assignment_3()); 

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
    // $ANTLR end "rule__OperationLDI__Group__3__Impl"


    // $ANTLR start "rule__OperationLDI__Group__4"
    // InternalPds16asm.g:427:1: rule__OperationLDI__Group__4 : rule__OperationLDI__Group__4__Impl ;
    public final void rule__OperationLDI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:431:1: ( rule__OperationLDI__Group__4__Impl )
            // InternalPds16asm.g:432:2: rule__OperationLDI__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationLDI__Group__4__Impl();

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
    // $ANTLR end "rule__OperationLDI__Group__4"


    // $ANTLR start "rule__OperationLDI__Group__4__Impl"
    // InternalPds16asm.g:438:1: rule__OperationLDI__Group__4__Impl : ( ';' ) ;
    public final void rule__OperationLDI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:442:1: ( ( ';' ) )
            // InternalPds16asm.g:443:1: ( ';' )
            {
            // InternalPds16asm.g:443:1: ( ';' )
            // InternalPds16asm.g:444:2: ';'
            {
             before(grammarAccess.getOperationLDIAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOperationLDIAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__OperationLDI__Group__4__Impl"


    // $ANTLR start "rule__OperationLD2__Group__0"
    // InternalPds16asm.g:454:1: rule__OperationLD2__Group__0 : rule__OperationLD2__Group__0__Impl rule__OperationLD2__Group__1 ;
    public final void rule__OperationLD2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:458:1: ( rule__OperationLD2__Group__0__Impl rule__OperationLD2__Group__1 )
            // InternalPds16asm.g:459:2: rule__OperationLD2__Group__0__Impl rule__OperationLD2__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OperationLD2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLD2__Group__1();

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
    // $ANTLR end "rule__OperationLD2__Group__0"


    // $ANTLR start "rule__OperationLD2__Group__0__Impl"
    // InternalPds16asm.g:466:1: rule__OperationLD2__Group__0__Impl : ( 'LD' ) ;
    public final void rule__OperationLD2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:470:1: ( ( 'LD' ) )
            // InternalPds16asm.g:471:1: ( 'LD' )
            {
            // InternalPds16asm.g:471:1: ( 'LD' )
            // InternalPds16asm.g:472:2: 'LD'
            {
             before(grammarAccess.getOperationLD2Access().getLDKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOperationLD2Access().getLDKeyword_0()); 

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
    // $ANTLR end "rule__OperationLD2__Group__0__Impl"


    // $ANTLR start "rule__OperationLD2__Group__1"
    // InternalPds16asm.g:481:1: rule__OperationLD2__Group__1 : rule__OperationLD2__Group__1__Impl rule__OperationLD2__Group__2 ;
    public final void rule__OperationLD2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:485:1: ( rule__OperationLD2__Group__1__Impl rule__OperationLD2__Group__2 )
            // InternalPds16asm.g:486:2: rule__OperationLD2__Group__1__Impl rule__OperationLD2__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__OperationLD2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLD2__Group__2();

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
    // $ANTLR end "rule__OperationLD2__Group__1"


    // $ANTLR start "rule__OperationLD2__Group__1__Impl"
    // InternalPds16asm.g:493:1: rule__OperationLD2__Group__1__Impl : ( ( rule__OperationLD2__RegisterAssignment_1 ) ) ;
    public final void rule__OperationLD2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:497:1: ( ( ( rule__OperationLD2__RegisterAssignment_1 ) ) )
            // InternalPds16asm.g:498:1: ( ( rule__OperationLD2__RegisterAssignment_1 ) )
            {
            // InternalPds16asm.g:498:1: ( ( rule__OperationLD2__RegisterAssignment_1 ) )
            // InternalPds16asm.g:499:2: ( rule__OperationLD2__RegisterAssignment_1 )
            {
             before(grammarAccess.getOperationLD2Access().getRegisterAssignment_1()); 
            // InternalPds16asm.g:500:2: ( rule__OperationLD2__RegisterAssignment_1 )
            // InternalPds16asm.g:500:3: rule__OperationLD2__RegisterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationLD2__RegisterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationLD2Access().getRegisterAssignment_1()); 

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
    // $ANTLR end "rule__OperationLD2__Group__1__Impl"


    // $ANTLR start "rule__OperationLD2__Group__2"
    // InternalPds16asm.g:508:1: rule__OperationLD2__Group__2 : rule__OperationLD2__Group__2__Impl rule__OperationLD2__Group__3 ;
    public final void rule__OperationLD2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:512:1: ( rule__OperationLD2__Group__2__Impl rule__OperationLD2__Group__3 )
            // InternalPds16asm.g:513:2: rule__OperationLD2__Group__2__Impl rule__OperationLD2__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__OperationLD2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLD2__Group__3();

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
    // $ANTLR end "rule__OperationLD2__Group__2"


    // $ANTLR start "rule__OperationLD2__Group__2__Impl"
    // InternalPds16asm.g:520:1: rule__OperationLD2__Group__2__Impl : ( ',' ) ;
    public final void rule__OperationLD2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:524:1: ( ( ',' ) )
            // InternalPds16asm.g:525:1: ( ',' )
            {
            // InternalPds16asm.g:525:1: ( ',' )
            // InternalPds16asm.g:526:2: ','
            {
             before(grammarAccess.getOperationLD2Access().getCommaKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationLD2Access().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__OperationLD2__Group__2__Impl"


    // $ANTLR start "rule__OperationLD2__Group__3"
    // InternalPds16asm.g:535:1: rule__OperationLD2__Group__3 : rule__OperationLD2__Group__3__Impl rule__OperationLD2__Group__4 ;
    public final void rule__OperationLD2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:539:1: ( rule__OperationLD2__Group__3__Impl rule__OperationLD2__Group__4 )
            // InternalPds16asm.g:540:2: rule__OperationLD2__Group__3__Impl rule__OperationLD2__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__OperationLD2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationLD2__Group__4();

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
    // $ANTLR end "rule__OperationLD2__Group__3"


    // $ANTLR start "rule__OperationLD2__Group__3__Impl"
    // InternalPds16asm.g:547:1: rule__OperationLD2__Group__3__Impl : ( ( rule__OperationLD2__IndexedAssignment_3 ) ) ;
    public final void rule__OperationLD2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:551:1: ( ( ( rule__OperationLD2__IndexedAssignment_3 ) ) )
            // InternalPds16asm.g:552:1: ( ( rule__OperationLD2__IndexedAssignment_3 ) )
            {
            // InternalPds16asm.g:552:1: ( ( rule__OperationLD2__IndexedAssignment_3 ) )
            // InternalPds16asm.g:553:2: ( rule__OperationLD2__IndexedAssignment_3 )
            {
             before(grammarAccess.getOperationLD2Access().getIndexedAssignment_3()); 
            // InternalPds16asm.g:554:2: ( rule__OperationLD2__IndexedAssignment_3 )
            // InternalPds16asm.g:554:3: rule__OperationLD2__IndexedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OperationLD2__IndexedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationLD2Access().getIndexedAssignment_3()); 

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
    // $ANTLR end "rule__OperationLD2__Group__3__Impl"


    // $ANTLR start "rule__OperationLD2__Group__4"
    // InternalPds16asm.g:562:1: rule__OperationLD2__Group__4 : rule__OperationLD2__Group__4__Impl ;
    public final void rule__OperationLD2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:566:1: ( rule__OperationLD2__Group__4__Impl )
            // InternalPds16asm.g:567:2: rule__OperationLD2__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationLD2__Group__4__Impl();

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
    // $ANTLR end "rule__OperationLD2__Group__4"


    // $ANTLR start "rule__OperationLD2__Group__4__Impl"
    // InternalPds16asm.g:573:1: rule__OperationLD2__Group__4__Impl : ( ';' ) ;
    public final void rule__OperationLD2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:577:1: ( ( ';' ) )
            // InternalPds16asm.g:578:1: ( ';' )
            {
            // InternalPds16asm.g:578:1: ( ';' )
            // InternalPds16asm.g:579:2: ';'
            {
             before(grammarAccess.getOperationLD2Access().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOperationLD2Access().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__OperationLD2__Group__4__Impl"


    // $ANTLR start "rule__Indexed__Group__0"
    // InternalPds16asm.g:589:1: rule__Indexed__Group__0 : rule__Indexed__Group__0__Impl rule__Indexed__Group__1 ;
    public final void rule__Indexed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:593:1: ( rule__Indexed__Group__0__Impl rule__Indexed__Group__1 )
            // InternalPds16asm.g:594:2: rule__Indexed__Group__0__Impl rule__Indexed__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Indexed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Indexed__Group__1();

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
    // $ANTLR end "rule__Indexed__Group__0"


    // $ANTLR start "rule__Indexed__Group__0__Impl"
    // InternalPds16asm.g:601:1: rule__Indexed__Group__0__Impl : ( '[' ) ;
    public final void rule__Indexed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:605:1: ( ( '[' ) )
            // InternalPds16asm.g:606:1: ( '[' )
            {
            // InternalPds16asm.g:606:1: ( '[' )
            // InternalPds16asm.g:607:2: '['
            {
             before(grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIndexedAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Indexed__Group__0__Impl"


    // $ANTLR start "rule__Indexed__Group__1"
    // InternalPds16asm.g:616:1: rule__Indexed__Group__1 : rule__Indexed__Group__1__Impl rule__Indexed__Group__2 ;
    public final void rule__Indexed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:620:1: ( rule__Indexed__Group__1__Impl rule__Indexed__Group__2 )
            // InternalPds16asm.g:621:2: rule__Indexed__Group__1__Impl rule__Indexed__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Indexed__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Indexed__Group__2();

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
    // $ANTLR end "rule__Indexed__Group__1"


    // $ANTLR start "rule__Indexed__Group__1__Impl"
    // InternalPds16asm.g:628:1: rule__Indexed__Group__1__Impl : ( ( rule__Indexed__RegAssignment_1 ) ) ;
    public final void rule__Indexed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:632:1: ( ( ( rule__Indexed__RegAssignment_1 ) ) )
            // InternalPds16asm.g:633:1: ( ( rule__Indexed__RegAssignment_1 ) )
            {
            // InternalPds16asm.g:633:1: ( ( rule__Indexed__RegAssignment_1 ) )
            // InternalPds16asm.g:634:2: ( rule__Indexed__RegAssignment_1 )
            {
             before(grammarAccess.getIndexedAccess().getRegAssignment_1()); 
            // InternalPds16asm.g:635:2: ( rule__Indexed__RegAssignment_1 )
            // InternalPds16asm.g:635:3: rule__Indexed__RegAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Indexed__RegAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexedAccess().getRegAssignment_1()); 

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
    // $ANTLR end "rule__Indexed__Group__1__Impl"


    // $ANTLR start "rule__Indexed__Group__2"
    // InternalPds16asm.g:643:1: rule__Indexed__Group__2 : rule__Indexed__Group__2__Impl rule__Indexed__Group__3 ;
    public final void rule__Indexed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:647:1: ( rule__Indexed__Group__2__Impl rule__Indexed__Group__3 )
            // InternalPds16asm.g:648:2: rule__Indexed__Group__2__Impl rule__Indexed__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Indexed__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Indexed__Group__3();

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
    // $ANTLR end "rule__Indexed__Group__2"


    // $ANTLR start "rule__Indexed__Group__2__Impl"
    // InternalPds16asm.g:655:1: rule__Indexed__Group__2__Impl : ( ',' ) ;
    public final void rule__Indexed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:659:1: ( ( ',' ) )
            // InternalPds16asm.g:660:1: ( ',' )
            {
            // InternalPds16asm.g:660:1: ( ',' )
            // InternalPds16asm.g:661:2: ','
            {
             before(grammarAccess.getIndexedAccess().getCommaKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIndexedAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Indexed__Group__2__Impl"


    // $ANTLR start "rule__Indexed__Group__3"
    // InternalPds16asm.g:670:1: rule__Indexed__Group__3 : rule__Indexed__Group__3__Impl rule__Indexed__Group__4 ;
    public final void rule__Indexed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:674:1: ( rule__Indexed__Group__3__Impl rule__Indexed__Group__4 )
            // InternalPds16asm.g:675:2: rule__Indexed__Group__3__Impl rule__Indexed__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Indexed__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Indexed__Group__4();

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
    // $ANTLR end "rule__Indexed__Group__3"


    // $ANTLR start "rule__Indexed__Group__3__Impl"
    // InternalPds16asm.g:682:1: rule__Indexed__Group__3__Impl : ( ( rule__Indexed__Imediate8Assignment_3 ) ) ;
    public final void rule__Indexed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:686:1: ( ( ( rule__Indexed__Imediate8Assignment_3 ) ) )
            // InternalPds16asm.g:687:1: ( ( rule__Indexed__Imediate8Assignment_3 ) )
            {
            // InternalPds16asm.g:687:1: ( ( rule__Indexed__Imediate8Assignment_3 ) )
            // InternalPds16asm.g:688:2: ( rule__Indexed__Imediate8Assignment_3 )
            {
             before(grammarAccess.getIndexedAccess().getImediate8Assignment_3()); 
            // InternalPds16asm.g:689:2: ( rule__Indexed__Imediate8Assignment_3 )
            // InternalPds16asm.g:689:3: rule__Indexed__Imediate8Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Indexed__Imediate8Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndexedAccess().getImediate8Assignment_3()); 

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
    // $ANTLR end "rule__Indexed__Group__3__Impl"


    // $ANTLR start "rule__Indexed__Group__4"
    // InternalPds16asm.g:697:1: rule__Indexed__Group__4 : rule__Indexed__Group__4__Impl ;
    public final void rule__Indexed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:701:1: ( rule__Indexed__Group__4__Impl )
            // InternalPds16asm.g:702:2: rule__Indexed__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Indexed__Group__4__Impl();

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
    // $ANTLR end "rule__Indexed__Group__4"


    // $ANTLR start "rule__Indexed__Group__4__Impl"
    // InternalPds16asm.g:708:1: rule__Indexed__Group__4__Impl : ( ']' ) ;
    public final void rule__Indexed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:712:1: ( ( ']' ) )
            // InternalPds16asm.g:713:1: ( ']' )
            {
            // InternalPds16asm.g:713:1: ( ']' )
            // InternalPds16asm.g:714:2: ']'
            {
             before(grammarAccess.getIndexedAccess().getRightSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIndexedAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Indexed__Group__4__Impl"


    // $ANTLR start "rule__HexaDecimal__Group__0"
    // InternalPds16asm.g:724:1: rule__HexaDecimal__Group__0 : rule__HexaDecimal__Group__0__Impl rule__HexaDecimal__Group__1 ;
    public final void rule__HexaDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:728:1: ( rule__HexaDecimal__Group__0__Impl rule__HexaDecimal__Group__1 )
            // InternalPds16asm.g:729:2: rule__HexaDecimal__Group__0__Impl rule__HexaDecimal__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__HexaDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HexaDecimal__Group__1();

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
    // $ANTLR end "rule__HexaDecimal__Group__0"


    // $ANTLR start "rule__HexaDecimal__Group__0__Impl"
    // InternalPds16asm.g:736:1: rule__HexaDecimal__Group__0__Impl : ( '#' ) ;
    public final void rule__HexaDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:740:1: ( ( '#' ) )
            // InternalPds16asm.g:741:1: ( '#' )
            {
            // InternalPds16asm.g:741:1: ( '#' )
            // InternalPds16asm.g:742:2: '#'
            {
             before(grammarAccess.getHexaDecimalAccess().getNumberSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHexaDecimalAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__HexaDecimal__Group__0__Impl"


    // $ANTLR start "rule__HexaDecimal__Group__1"
    // InternalPds16asm.g:751:1: rule__HexaDecimal__Group__1 : rule__HexaDecimal__Group__1__Impl ;
    public final void rule__HexaDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:755:1: ( rule__HexaDecimal__Group__1__Impl )
            // InternalPds16asm.g:756:2: rule__HexaDecimal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HexaDecimal__Group__1__Impl();

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
    // $ANTLR end "rule__HexaDecimal__Group__1"


    // $ANTLR start "rule__HexaDecimal__Group__1__Impl"
    // InternalPds16asm.g:762:1: rule__HexaDecimal__Group__1__Impl : ( ( rule__HexaDecimal__NumberAssignment_1 ) ) ;
    public final void rule__HexaDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:766:1: ( ( ( rule__HexaDecimal__NumberAssignment_1 ) ) )
            // InternalPds16asm.g:767:1: ( ( rule__HexaDecimal__NumberAssignment_1 ) )
            {
            // InternalPds16asm.g:767:1: ( ( rule__HexaDecimal__NumberAssignment_1 ) )
            // InternalPds16asm.g:768:2: ( rule__HexaDecimal__NumberAssignment_1 )
            {
             before(grammarAccess.getHexaDecimalAccess().getNumberAssignment_1()); 
            // InternalPds16asm.g:769:2: ( rule__HexaDecimal__NumberAssignment_1 )
            // InternalPds16asm.g:769:3: rule__HexaDecimal__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HexaDecimal__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHexaDecimalAccess().getNumberAssignment_1()); 

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
    // $ANTLR end "rule__HexaDecimal__Group__1__Impl"


    // $ANTLR start "rule__Model__OperationsAssignment"
    // InternalPds16asm.g:778:1: rule__Model__OperationsAssignment : ( ruleOperations ) ;
    public final void rule__Model__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:782:1: ( ( ruleOperations ) )
            // InternalPds16asm.g:783:2: ( ruleOperations )
            {
            // InternalPds16asm.g:783:2: ( ruleOperations )
            // InternalPds16asm.g:784:3: ruleOperations
            {
             before(grammarAccess.getModelAccess().getOperationsOperationsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOperations();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOperationsOperationsParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__OperationsAssignment"


    // $ANTLR start "rule__OperationLDI__RegisterAssignment_1"
    // InternalPds16asm.g:793:1: rule__OperationLDI__RegisterAssignment_1 : ( ruleRegisters ) ;
    public final void rule__OperationLDI__RegisterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:797:1: ( ( ruleRegisters ) )
            // InternalPds16asm.g:798:2: ( ruleRegisters )
            {
            // InternalPds16asm.g:798:2: ( ruleRegisters )
            // InternalPds16asm.g:799:3: ruleRegisters
            {
             before(grammarAccess.getOperationLDIAccess().getRegisterRegistersParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegisters();

            state._fsp--;

             after(grammarAccess.getOperationLDIAccess().getRegisterRegistersParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OperationLDI__RegisterAssignment_1"


    // $ANTLR start "rule__OperationLDI__Immediate8Assignment_3"
    // InternalPds16asm.g:808:1: rule__OperationLDI__Immediate8Assignment_3 : ( ruleHexaDecimal ) ;
    public final void rule__OperationLDI__Immediate8Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:812:1: ( ( ruleHexaDecimal ) )
            // InternalPds16asm.g:813:2: ( ruleHexaDecimal )
            {
            // InternalPds16asm.g:813:2: ( ruleHexaDecimal )
            // InternalPds16asm.g:814:3: ruleHexaDecimal
            {
             before(grammarAccess.getOperationLDIAccess().getImmediate8HexaDecimalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHexaDecimal();

            state._fsp--;

             after(grammarAccess.getOperationLDIAccess().getImmediate8HexaDecimalParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OperationLDI__Immediate8Assignment_3"


    // $ANTLR start "rule__OperationLD2__RegisterAssignment_1"
    // InternalPds16asm.g:823:1: rule__OperationLD2__RegisterAssignment_1 : ( ruleRegisters ) ;
    public final void rule__OperationLD2__RegisterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:827:1: ( ( ruleRegisters ) )
            // InternalPds16asm.g:828:2: ( ruleRegisters )
            {
            // InternalPds16asm.g:828:2: ( ruleRegisters )
            // InternalPds16asm.g:829:3: ruleRegisters
            {
             before(grammarAccess.getOperationLD2Access().getRegisterRegistersParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegisters();

            state._fsp--;

             after(grammarAccess.getOperationLD2Access().getRegisterRegistersParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OperationLD2__RegisterAssignment_1"


    // $ANTLR start "rule__OperationLD2__IndexedAssignment_3"
    // InternalPds16asm.g:838:1: rule__OperationLD2__IndexedAssignment_3 : ( ruleIndexed ) ;
    public final void rule__OperationLD2__IndexedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:842:1: ( ( ruleIndexed ) )
            // InternalPds16asm.g:843:2: ( ruleIndexed )
            {
            // InternalPds16asm.g:843:2: ( ruleIndexed )
            // InternalPds16asm.g:844:3: ruleIndexed
            {
             before(grammarAccess.getOperationLD2Access().getIndexedIndexedParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIndexed();

            state._fsp--;

             after(grammarAccess.getOperationLD2Access().getIndexedIndexedParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OperationLD2__IndexedAssignment_3"


    // $ANTLR start "rule__Indexed__RegAssignment_1"
    // InternalPds16asm.g:853:1: rule__Indexed__RegAssignment_1 : ( ruleRegisters ) ;
    public final void rule__Indexed__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:857:1: ( ( ruleRegisters ) )
            // InternalPds16asm.g:858:2: ( ruleRegisters )
            {
            // InternalPds16asm.g:858:2: ( ruleRegisters )
            // InternalPds16asm.g:859:3: ruleRegisters
            {
             before(grammarAccess.getIndexedAccess().getRegRegistersParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegisters();

            state._fsp--;

             after(grammarAccess.getIndexedAccess().getRegRegistersParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Indexed__RegAssignment_1"


    // $ANTLR start "rule__Indexed__Imediate8Assignment_3"
    // InternalPds16asm.g:868:1: rule__Indexed__Imediate8Assignment_3 : ( ruleHexaDecimal ) ;
    public final void rule__Indexed__Imediate8Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:872:1: ( ( ruleHexaDecimal ) )
            // InternalPds16asm.g:873:2: ( ruleHexaDecimal )
            {
            // InternalPds16asm.g:873:2: ( ruleHexaDecimal )
            // InternalPds16asm.g:874:3: ruleHexaDecimal
            {
             before(grammarAccess.getIndexedAccess().getImediate8HexaDecimalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHexaDecimal();

            state._fsp--;

             after(grammarAccess.getIndexedAccess().getImediate8HexaDecimalParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Indexed__Imediate8Assignment_3"


    // $ANTLR start "rule__HexaDecimal__NumberAssignment_1"
    // InternalPds16asm.g:883:1: rule__HexaDecimal__NumberAssignment_1 : ( RULE_ID ) ;
    public final void rule__HexaDecimal__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:887:1: ( ( RULE_ID ) )
            // InternalPds16asm.g:888:2: ( RULE_ID )
            {
            // InternalPds16asm.g:888:2: ( RULE_ID )
            // InternalPds16asm.g:889:3: RULE_ID
            {
             before(grammarAccess.getHexaDecimalAccess().getNumberIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHexaDecimalAccess().getNumberIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__HexaDecimal__NumberAssignment_1"


    // $ANTLR start "rule__R1__ValueAssignment"
    // InternalPds16asm.g:898:1: rule__R1__ValueAssignment : ( ( 'R1' ) ) ;
    public final void rule__R1__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:902:1: ( ( ( 'R1' ) ) )
            // InternalPds16asm.g:903:2: ( ( 'R1' ) )
            {
            // InternalPds16asm.g:903:2: ( ( 'R1' ) )
            // InternalPds16asm.g:904:3: ( 'R1' )
            {
             before(grammarAccess.getR1Access().getValueR1Keyword_0()); 
            // InternalPds16asm.g:905:3: ( 'R1' )
            // InternalPds16asm.g:906:4: 'R1'
            {
             before(grammarAccess.getR1Access().getValueR1Keyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getR1Access().getValueR1Keyword_0()); 

            }

             after(grammarAccess.getR1Access().getValueR1Keyword_0()); 

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
    // $ANTLR end "rule__R1__ValueAssignment"


    // $ANTLR start "rule__R2__ValueAssignment"
    // InternalPds16asm.g:917:1: rule__R2__ValueAssignment : ( ( 'R2' ) ) ;
    public final void rule__R2__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPds16asm.g:921:1: ( ( ( 'R2' ) ) )
            // InternalPds16asm.g:922:2: ( ( 'R2' ) )
            {
            // InternalPds16asm.g:922:2: ( ( 'R2' ) )
            // InternalPds16asm.g:923:3: ( 'R2' )
            {
             before(grammarAccess.getR2Access().getValueR2Keyword_0()); 
            // InternalPds16asm.g:924:3: ( 'R2' )
            // InternalPds16asm.g:925:4: 'R2'
            {
             before(grammarAccess.getR2Access().getValueR2Keyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getR2Access().getValueR2Keyword_0()); 

            }

             after(grammarAccess.getR2Access().getValueR2Keyword_0()); 

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
    // $ANTLR end "rule__R2__ValueAssignment"

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
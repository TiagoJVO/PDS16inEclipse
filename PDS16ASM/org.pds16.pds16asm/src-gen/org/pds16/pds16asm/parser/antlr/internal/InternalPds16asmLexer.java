package org.pds16.pds16asm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPds16asmLexer extends Lexer {
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

    public InternalPds16asmLexer() {;} 
    public InternalPds16asmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPds16asmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPds16asm.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:11:7: ( ':' )
            // InternalPds16asm.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:12:7: ( '.bss' )
            // InternalPds16asm.g:12:9: '.bss'
            {
            match(".bss"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:13:7: ( '.data' )
            // InternalPds16asm.g:13:9: '.data'
            {
            match(".data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:14:7: ( '.end' )
            // InternalPds16asm.g:14:9: '.end'
            {
            match(".end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:15:7: ( '.text' )
            // InternalPds16asm.g:15:9: '.text'
            {
            match(".text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:16:7: ( '.ascii' )
            // InternalPds16asm.g:16:9: '.ascii'
            {
            match(".ascii"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:17:7: ( ',' )
            // InternalPds16asm.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:18:7: ( '.asciiz' )
            // InternalPds16asm.g:18:9: '.asciiz'
            {
            match(".asciiz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:19:7: ( '.byte' )
            // InternalPds16asm.g:19:9: '.byte'
            {
            match(".byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:20:7: ( '.word' )
            // InternalPds16asm.g:20:9: '.word'
            {
            match(".word"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:21:7: ( '.space' )
            // InternalPds16asm.g:21:9: '.space'
            {
            match(".space"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:22:7: ( '.set' )
            // InternalPds16asm.g:22:9: '.set'
            {
            match(".set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:23:7: ( '.section' )
            // InternalPds16asm.g:23:9: '.section'
            {
            match(".section"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:24:7: ( '.org' )
            // InternalPds16asm.g:24:9: '.org'
            {
            match(".org"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:25:7: ( '.equ' )
            // InternalPds16asm.g:25:9: '.equ'
            {
            match(".equ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:26:7: ( 'ldi' )
            // InternalPds16asm.g:26:9: 'ldi'
            {
            match("ldi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:27:7: ( 'ldih' )
            // InternalPds16asm.g:27:9: 'ldih'
            {
            match("ldih"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:28:7: ( 'ld' )
            // InternalPds16asm.g:28:9: 'ld'
            {
            match("ld"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:29:7: ( 'ldb' )
            // InternalPds16asm.g:29:9: 'ldb'
            {
            match("ldb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:30:7: ( 'st' )
            // InternalPds16asm.g:30:9: 'st'
            {
            match("st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:31:7: ( 'stb' )
            // InternalPds16asm.g:31:9: 'stb'
            {
            match("stb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:32:7: ( 'add' )
            // InternalPds16asm.g:32:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:33:7: ( 'addf' )
            // InternalPds16asm.g:33:9: 'addf'
            {
            match("addf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:34:7: ( 'adc' )
            // InternalPds16asm.g:34:9: 'adc'
            {
            match("adc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:35:7: ( 'adcf' )
            // InternalPds16asm.g:35:9: 'adcf'
            {
            match("adcf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:36:7: ( 'inc' )
            // InternalPds16asm.g:36:9: 'inc'
            {
            match("inc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:37:7: ( 'incf' )
            // InternalPds16asm.g:37:9: 'incf'
            {
            match("incf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:38:7: ( 'sub' )
            // InternalPds16asm.g:38:9: 'sub'
            {
            match("sub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:39:7: ( 'subf' )
            // InternalPds16asm.g:39:9: 'subf'
            {
            match("subf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:40:7: ( 'sbb' )
            // InternalPds16asm.g:40:9: 'sbb'
            {
            match("sbb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:41:7: ( 'sbbf' )
            // InternalPds16asm.g:41:9: 'sbbf'
            {
            match("sbbf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:42:7: ( 'subr' )
            // InternalPds16asm.g:42:9: 'subr'
            {
            match("subr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:43:7: ( 'dec' )
            // InternalPds16asm.g:43:9: 'dec'
            {
            match("dec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:44:7: ( 'decf' )
            // InternalPds16asm.g:44:9: 'decf'
            {
            match("decf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:45:7: ( 'anl' )
            // InternalPds16asm.g:45:9: 'anl'
            {
            match("anl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:46:7: ( 'anlf' )
            // InternalPds16asm.g:46:9: 'anlf'
            {
            match("anlf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:47:7: ( 'orl' )
            // InternalPds16asm.g:47:9: 'orl'
            {
            match("orl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:48:7: ( 'orlf' )
            // InternalPds16asm.g:48:9: 'orlf'
            {
            match("orlf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:49:7: ( 'mov' )
            // InternalPds16asm.g:49:9: 'mov'
            {
            match("mov"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:50:7: ( 'movf' )
            // InternalPds16asm.g:50:9: 'movf'
            {
            match("movf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:51:7: ( 'xrl' )
            // InternalPds16asm.g:51:9: 'xrl'
            {
            match("xrl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:52:7: ( 'xrlf' )
            // InternalPds16asm.g:52:9: 'xrlf'
            {
            match("xrlf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:53:7: ( 'not' )
            // InternalPds16asm.g:53:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:54:7: ( 'notf' )
            // InternalPds16asm.g:54:9: 'notf'
            {
            match("notf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:55:7: ( 'shl' )
            // InternalPds16asm.g:55:9: 'shl'
            {
            match("shl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:56:7: ( 'shr' )
            // InternalPds16asm.g:56:9: 'shr'
            {
            match("shr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:57:7: ( 'rrl' )
            // InternalPds16asm.g:57:9: 'rrl'
            {
            match("rrl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:58:7: ( 'rrm' )
            // InternalPds16asm.g:58:9: 'rrm'
            {
            match("rrm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:59:7: ( 'rcr' )
            // InternalPds16asm.g:59:9: 'rcr'
            {
            match("rcr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:60:7: ( 'rcl' )
            // InternalPds16asm.g:60:9: 'rcl'
            {
            match("rcl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:61:7: ( 'jz' )
            // InternalPds16asm.g:61:9: 'jz'
            {
            match("jz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:62:7: ( 'je' )
            // InternalPds16asm.g:62:9: 'je'
            {
            match("je"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:63:7: ( 'jnz' )
            // InternalPds16asm.g:63:9: 'jnz'
            {
            match("jnz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:64:7: ( 'jne' )
            // InternalPds16asm.g:64:9: 'jne'
            {
            match("jne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:65:7: ( 'jc' )
            // InternalPds16asm.g:65:9: 'jc'
            {
            match("jc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:66:7: ( 'jbl' )
            // InternalPds16asm.g:66:9: 'jbl'
            {
            match("jbl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:67:7: ( 'jnc' )
            // InternalPds16asm.g:67:9: 'jnc'
            {
            match("jnc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:68:7: ( 'jae' )
            // InternalPds16asm.g:68:9: 'jae'
            {
            match("jae"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:69:7: ( 'jmp' )
            // InternalPds16asm.g:69:9: 'jmp'
            {
            match("jmp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:70:7: ( 'jmpl' )
            // InternalPds16asm.g:70:9: 'jmpl'
            {
            match("jmpl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:71:7: ( '$' )
            // InternalPds16asm.g:71:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:72:7: ( 'nop' )
            // InternalPds16asm.g:72:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:73:7: ( 'ret' )
            // InternalPds16asm.g:73:9: 'ret'
            {
            match("ret"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:74:7: ( 'iret' )
            // InternalPds16asm.g:74:9: 'iret'
            {
            match("iret"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:75:7: ( '[' )
            // InternalPds16asm.g:75:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:76:7: ( ']' )
            // InternalPds16asm.g:76:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:77:7: ( '#' )
            // InternalPds16asm.g:77:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:78:7: ( 'low' )
            // InternalPds16asm.g:78:9: 'low'
            {
            match("low"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:79:7: ( 'high' )
            // InternalPds16asm.g:79:9: 'high'
            {
            match("high"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:80:7: ( '(' )
            // InternalPds16asm.g:80:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:81:7: ( ')' )
            // InternalPds16asm.g:81:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:82:7: ( 'r0' )
            // InternalPds16asm.g:82:9: 'r0'
            {
            match("r0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:83:7: ( 'r1' )
            // InternalPds16asm.g:83:9: 'r1'
            {
            match("r1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:84:7: ( 'r2' )
            // InternalPds16asm.g:84:9: 'r2'
            {
            match("r2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:85:7: ( 'r3' )
            // InternalPds16asm.g:85:9: 'r3'
            {
            match("r3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:86:7: ( 'r4' )
            // InternalPds16asm.g:86:9: 'r4'
            {
            match("r4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:87:7: ( 'r5' )
            // InternalPds16asm.g:87:9: 'r5'
            {
            match("r5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:88:7: ( 'r6' )
            // InternalPds16asm.g:88:9: 'r6'
            {
            match("r6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:89:7: ( 'r7' )
            // InternalPds16asm.g:89:9: 'r7'
            {
            match("r7"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:90:7: ( 'PSW' )
            // InternalPds16asm.g:90:9: 'PSW'
            {
            match("PSW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4162:10: ( ( RULE_SIGN )? ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalPds16asm.g:4162:12: ( RULE_SIGN )? ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            // InternalPds16asm.g:4162:12: ( RULE_SIGN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPds16asm.g:4162:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asm.g:4162:23: ( '0x' | '0X' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='x') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='X') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPds16asm.g:4162:24: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:4162:29: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalPds16asm.g:4162:35: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPds16asm.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_OCT"
    public final void mRULE_OCT() throws RecognitionException {
        try {
            int _type = RULE_OCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4164:10: ( ( RULE_SIGN )? '0' ( '0' .. '7' )+ )
            // InternalPds16asm.g:4164:12: ( RULE_SIGN )? '0' ( '0' .. '7' )+
            {
            // InternalPds16asm.g:4164:12: ( RULE_SIGN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPds16asm.g:4164:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            match('0'); 
            // InternalPds16asm.g:4164:27: ( '0' .. '7' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='7')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPds16asm.g:4164:28: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCT"

    // $ANTLR start "RULE_BIN"
    public final void mRULE_BIN() throws RecognitionException {
        try {
            int _type = RULE_BIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4166:10: ( ( RULE_SIGN )? ( '0' | '1' )+ 'b' )
            // InternalPds16asm.g:4166:12: ( RULE_SIGN )? ( '0' | '1' )+ 'b'
            {
            // InternalPds16asm.g:4166:12: ( RULE_SIGN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPds16asm.g:4166:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asm.g:4166:23: ( '0' | '1' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='1')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPds16asm.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4168:11: ( ( RULE_SIGN )? '\\'' RULE_ANY_OTHER '\\'' )
            // InternalPds16asm.g:4168:13: ( RULE_SIGN )? '\\'' RULE_ANY_OTHER '\\''
            {
            // InternalPds16asm.g:4168:13: ( RULE_SIGN )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='+'||LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPds16asm.g:4168:13: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            match('\''); 
            mRULE_ANY_OTHER(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalPds16asm.g:4170:20: ( ( '-' | '+' ) )
            // InternalPds16asm.g:4170:22: ( '-' | '+' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4172:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPds16asm.g:4172:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPds16asm.g:4172:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPds16asm.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4174:10: ( ( RULE_SIGN )? ( '0' .. '9' )+ )
            // InternalPds16asm.g:4174:12: ( RULE_SIGN )? ( '0' .. '9' )+
            {
            // InternalPds16asm.g:4174:12: ( RULE_SIGN )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPds16asm.g:4174:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asm.g:4174:23: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPds16asm.g:4174:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4176:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPds16asm.g:4176:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPds16asm.g:4176:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPds16asm.g:4176:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPds16asm.g:4176:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPds16asm.g:4176:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asm.g:4176:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:4176:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPds16asm.g:4176:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPds16asm.g:4176:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asm.g:4176:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4178:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPds16asm.g:4178:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPds16asm.g:4178:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPds16asm.g:4178:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4180:17: ( ';' ( options {greedy=false; } : . )* '\\n' )
            // InternalPds16asm.g:4180:19: ';' ( options {greedy=false; } : . )* '\\n'
            {
            match(';'); 
            // InternalPds16asm.g:4180:23: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\n') ) {
                    alt16=2;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPds16asm.g:4180:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4182:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPds16asm.g:4182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPds16asm.g:4182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPds16asm.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            // InternalPds16asm.g:4184:25: ( . )
            // InternalPds16asm.g:4184:27: .
            {
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPds16asm.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_HEX | RULE_OCT | RULE_BIN | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt18=90;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalPds16asm.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalPds16asm.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalPds16asm.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalPds16asm.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalPds16asm.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalPds16asm.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalPds16asm.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalPds16asm.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalPds16asm.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalPds16asm.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalPds16asm.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalPds16asm.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalPds16asm.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalPds16asm.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalPds16asm.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalPds16asm.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalPds16asm.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalPds16asm.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalPds16asm.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalPds16asm.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalPds16asm.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalPds16asm.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalPds16asm.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalPds16asm.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalPds16asm.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalPds16asm.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalPds16asm.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalPds16asm.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalPds16asm.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalPds16asm.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalPds16asm.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalPds16asm.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalPds16asm.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalPds16asm.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalPds16asm.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalPds16asm.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalPds16asm.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalPds16asm.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalPds16asm.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalPds16asm.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalPds16asm.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalPds16asm.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalPds16asm.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalPds16asm.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalPds16asm.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalPds16asm.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalPds16asm.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalPds16asm.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalPds16asm.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalPds16asm.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalPds16asm.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalPds16asm.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalPds16asm.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalPds16asm.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalPds16asm.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalPds16asm.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalPds16asm.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalPds16asm.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalPds16asm.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalPds16asm.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalPds16asm.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalPds16asm.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalPds16asm.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalPds16asm.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalPds16asm.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalPds16asm.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalPds16asm.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalPds16asm.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalPds16asm.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalPds16asm.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalPds16asm.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalPds16asm.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalPds16asm.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalPds16asm.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalPds16asm.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalPds16asm.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalPds16asm.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalPds16asm.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalPds16asm.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalPds16asm.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalPds16asm.g:1:490: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 82 :
                // InternalPds16asm.g:1:499: RULE_OCT
                {
                mRULE_OCT(); 

                }
                break;
            case 83 :
                // InternalPds16asm.g:1:508: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 84 :
                // InternalPds16asm.g:1:517: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 85 :
                // InternalPds16asm.g:1:527: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 86 :
                // InternalPds16asm.g:1:535: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // InternalPds16asm.g:1:544: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // InternalPds16asm.g:1:556: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 89 :
                // InternalPds16asm.g:1:572: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // InternalPds16asm.g:1:588: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\4\uffff\13\33\4\uffff\1\33\2\uffff\1\33\1\uffff\2\34\17\uffff\1\135\1\33\1\140\17\33\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\33\1\u0082\5\33\2\uffff\1\u0088\1\uffff\1\u0088\2\uffff\1\35\7\uffff\1\u008f\1\u0090\1\uffff\1\u0091\1\u0092\1\uffff\1\u0095\1\u0097\1\u0098\1\u0099\1\u009b\1\u009d\1\u009f\1\u00a1\1\33\1\u00a4\1\u00a6\1\u00a8\1\u00aa\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\12\uffff\1\u00b3\1\u00b4\1\u00b5\1\uffff\1\u00b6\1\u00b7\1\u00b9\1\33\1\u00bb\1\uffff\1\114\4\uffff\1\u00bd\4\uffff\1\u00be\1\u00bf\1\uffff\1\u00c0\3\uffff\1\u00c1\1\uffff\1\u00c2\1\uffff\1\u00c3\1\uffff\1\u00c4\1\uffff\1\u00c5\1\u00c6\1\uffff\1\u00c7\1\uffff\1\u00c8\1\uffff\1\u00c9\1\uffff\1\u00ca\14\uffff\1\u00cb\1\uffff\1\u00cc\22\uffff\1\u00cf\2\uffff";
    static final String DFA18_eofS =
        "\u00d0\uffff";
    static final String DFA18_minS =
        "\1\11\1\uffff\1\141\1\uffff\1\144\1\142\1\144\1\156\1\145\1\162\1\157\1\162\1\157\1\60\1\141\4\uffff\1\151\2\uffff\1\123\1\47\2\60\1\0\6\uffff\1\163\1\uffff\1\156\1\uffff\1\163\1\uffff\1\145\1\uffff\1\60\1\167\1\60\2\142\1\154\1\143\1\154\1\143\1\145\1\143\1\154\1\166\1\154\1\160\2\154\1\164\12\60\1\143\1\60\1\154\1\145\1\160\1\147\1\127\2\uffff\1\60\1\uffff\1\60\2\0\1\47\4\uffff\1\143\1\uffff\1\143\2\60\1\uffff\2\60\1\uffff\10\60\1\164\13\60\12\uffff\3\60\1\uffff\3\60\1\150\1\60\1\uffff\1\0\1\uffff\1\151\2\uffff\1\60\4\uffff\2\60\1\uffff\1\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\14\uffff\1\60\1\uffff\1\60\1\uffff\1\151\20\uffff\1\172\2\uffff";
    static final String DFA18_maxS =
        "\1\172\1\uffff\1\167\1\uffff\1\157\1\165\1\156\1\162\1\145\1\162\1\157\1\162\1\157\1\162\1\172\4\uffff\1\151\2\uffff\1\123\1\71\1\170\1\142\1\uffff\6\uffff\1\171\1\uffff\1\161\1\uffff\1\163\1\uffff\1\160\1\uffff\1\172\1\167\1\172\2\142\1\162\1\144\1\154\1\143\1\145\1\143\1\154\1\166\1\154\1\164\1\155\1\162\1\164\14\172\1\154\1\145\1\160\1\147\1\127\2\uffff\1\142\1\uffff\1\71\2\uffff\1\47\4\uffff\1\143\1\uffff\1\164\2\172\1\uffff\2\172\1\uffff\10\172\1\164\13\172\12\uffff\3\172\1\uffff\3\172\1\150\1\172\1\uffff\1\uffff\1\uffff\1\151\2\uffff\1\172\4\uffff\2\172\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\14\uffff\1\172\1\uffff\1\172\1\uffff\1\151\20\uffff\1\172\2\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\uffff\1\7\13\uffff\1\75\1\101\1\102\1\103\1\uffff\1\106\1\107\5\uffff\1\125\1\126\1\127\1\130\1\131\1\132\1\uffff\1\3\1\uffff\1\5\1\uffff\1\12\1\uffff\1\16\43\uffff\1\124\1\121\1\uffff\1\123\4\uffff\1\2\1\11\1\4\1\17\1\uffff\1\13\3\uffff\1\22\2\uffff\1\24\24\uffff\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\63\1\64\3\uffff\1\67\5\uffff\1\122\1\uffff\1\124\1\uffff\1\14\1\15\1\uffff\1\20\1\23\1\104\1\25\2\uffff\1\34\1\uffff\1\36\1\55\1\56\1\uffff\1\26\1\uffff\1\30\1\uffff\1\43\1\uffff\1\32\2\uffff\1\41\1\uffff\1\45\1\uffff\1\47\1\uffff\1\51\1\uffff\1\53\1\76\1\57\1\60\1\61\1\62\1\77\1\65\1\66\1\71\1\70\1\72\1\uffff\1\73\1\uffff\1\120\1\uffff\1\21\1\35\1\40\1\37\1\27\1\31\1\44\1\33\1\100\1\42\1\46\1\50\1\52\1\54\1\74\1\105\1\uffff\1\10\1\6";
    static final String DFA18_specialS =
        "\32\uffff\1\3\66\uffff\1\0\1\2\66\uffff\1\1\106\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\uffff\1\35\1\22\1\17\2\uffff\1\32\1\24\1\25\1\uffff\1\27\1\3\1\27\1\2\1\36\1\30\1\31\10\34\1\1\1\37\5\uffff\17\33\1\26\12\33\1\20\1\uffff\1\21\1\uffff\1\33\1\uffff\1\6\2\33\1\10\3\33\1\23\1\7\1\16\1\33\1\4\1\12\1\14\1\11\2\33\1\15\1\5\4\33\1\13\2\33",
            "",
            "\1\45\1\41\1\uffff\1\42\1\43\11\uffff\1\50\3\uffff\1\47\1\44\2\uffff\1\46",
            "",
            "\1\51\12\uffff\1\52",
            "\1\55\5\uffff\1\56\13\uffff\1\53\1\54",
            "\1\57\11\uffff\1\60",
            "\1\61\3\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\53\uffff\1\71\1\uffff\1\72\14\uffff\1\70",
            "\1\110\1\107\1\106\1\uffff\1\104\7\uffff\1\111\1\105\13\uffff\1\103",
            "",
            "",
            "",
            "",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114\10\uffff\1\30\1\31\10\34",
            "\2\116\6\120\40\uffff\1\115\11\uffff\1\117\25\uffff\1\115",
            "\2\31\60\uffff\1\117",
            "\47\122\1\123\64\122\1\121\uffa3\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124\5\uffff\1\125",
            "",
            "\1\126\2\uffff\1\127",
            "",
            "\1\130",
            "",
            "\1\132\12\uffff\1\131",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\33\1\134\6\33\1\133\21\33",
            "\1\136",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\33\1\137\30\33",
            "\1\141",
            "\1\142",
            "\1\143\5\uffff\1\144",
            "\1\146\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\3\uffff\1\156",
            "\1\160\1\161",
            "\1\163\5\uffff\1\162",
            "\1\164",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0081\1\uffff\1\u0080\24\uffff\1\177",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\2\116\6\120\2\34\50\uffff\1\117",
            "",
            "\10\120\2\34",
            "\47\35\1\u0089\uffd8\35",
            "\47\35\1\u008a\uffd8\35",
            "\1\114",
            "",
            "",
            "",
            "",
            "\1\u008b",
            "",
            "\1\u008d\20\uffff\1\u008c",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\7\33\1\u008e\22\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u0093\13\33\1\u0094\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u0096\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u009a\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u009c\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u009e\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u00a0\24\33",
            "\1\u00a2",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u00a3\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u00a5\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u00a7\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u00a9\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u00ab\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\u00b8\16\33",
            "\1\u00ba",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\35",
            "",
            "\1\u00bc",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00cd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ce",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_HEX | RULE_OCT | RULE_BIN | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_81 = input.LA(1);

                        s = -1;
                        if ( (LA18_81=='\'') ) {s = 137;}

                        else if ( ((LA18_81>='\u0000' && LA18_81<='&')||(LA18_81>='(' && LA18_81<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_137 = input.LA(1);

                        s = -1;
                        if ( ((LA18_137>='\u0000' && LA18_137<='\uFFFF')) ) {s = 29;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_82 = input.LA(1);

                        s = -1;
                        if ( (LA18_82=='\'') ) {s = 138;}

                        else if ( ((LA18_82>='\u0000' && LA18_82<='&')||(LA18_82>='(' && LA18_82<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_26 = input.LA(1);

                        s = -1;
                        if ( (LA18_26=='\\') ) {s = 81;}

                        else if ( ((LA18_26>='\u0000' && LA18_26<='&')||(LA18_26>='(' && LA18_26<='[')||(LA18_26>=']' && LA18_26<='\uFFFF')) ) {s = 82;}

                        else if ( (LA18_26=='\'') ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
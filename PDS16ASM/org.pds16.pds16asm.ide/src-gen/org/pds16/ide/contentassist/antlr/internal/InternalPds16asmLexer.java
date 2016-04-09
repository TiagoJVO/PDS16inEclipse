package org.pds16.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPds16asmLexer extends Lexer {
    public static final int RULE_HEX=5;
    public static final int T__50=50;
    public static final int RULE_OCT=10;
    public static final int T__19=19;
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
    public static final int RULE_BIN=9;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_COMT=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_NUMB=8;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
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
            // InternalPds16asm.g:11:7: ( 'ldi' )
            // InternalPds16asm.g:11:9: 'ldi'
            {
            match("ldi"); 


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
            // InternalPds16asm.g:12:7: ( 'ldih' )
            // InternalPds16asm.g:12:9: 'ldih'
            {
            match("ldih"); 


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
            // InternalPds16asm.g:13:7: ( 'ld' )
            // InternalPds16asm.g:13:9: 'ld'
            {
            match("ld"); 


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
            // InternalPds16asm.g:14:7: ( 'ldb' )
            // InternalPds16asm.g:14:9: 'ldb'
            {
            match("ldb"); 


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
            // InternalPds16asm.g:15:7: ( 'st' )
            // InternalPds16asm.g:15:9: 'st'
            {
            match("st"); 


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
            // InternalPds16asm.g:16:7: ( 'stb' )
            // InternalPds16asm.g:16:9: 'stb'
            {
            match("stb"); 


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
            // InternalPds16asm.g:17:7: ( 'add' )
            // InternalPds16asm.g:17:9: 'add'
            {
            match("add"); 


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
            // InternalPds16asm.g:18:7: ( 'addf' )
            // InternalPds16asm.g:18:9: 'addf'
            {
            match("addf"); 


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
            // InternalPds16asm.g:19:7: ( 'adc' )
            // InternalPds16asm.g:19:9: 'adc'
            {
            match("adc"); 


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
            // InternalPds16asm.g:20:7: ( 'adcf' )
            // InternalPds16asm.g:20:9: 'adcf'
            {
            match("adcf"); 


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
            // InternalPds16asm.g:21:7: ( 'sub' )
            // InternalPds16asm.g:21:9: 'sub'
            {
            match("sub"); 


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
            // InternalPds16asm.g:22:7: ( 'subf' )
            // InternalPds16asm.g:22:9: 'subf'
            {
            match("subf"); 


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
            // InternalPds16asm.g:23:7: ( 'sbb' )
            // InternalPds16asm.g:23:9: 'sbb'
            {
            match("sbb"); 


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
            // InternalPds16asm.g:24:7: ( 'sbbf' )
            // InternalPds16asm.g:24:9: 'sbbf'
            {
            match("sbbf"); 


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
            // InternalPds16asm.g:25:7: ( 'anl' )
            // InternalPds16asm.g:25:9: 'anl'
            {
            match("anl"); 


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
            // InternalPds16asm.g:26:7: ( 'anlf' )
            // InternalPds16asm.g:26:9: 'anlf'
            {
            match("anlf"); 


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
            // InternalPds16asm.g:27:7: ( 'orl' )
            // InternalPds16asm.g:27:9: 'orl'
            {
            match("orl"); 


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
            // InternalPds16asm.g:28:7: ( 'orlf' )
            // InternalPds16asm.g:28:9: 'orlf'
            {
            match("orlf"); 


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
            // InternalPds16asm.g:29:7: ( 'xrl' )
            // InternalPds16asm.g:29:9: 'xrl'
            {
            match("xrl"); 


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
            // InternalPds16asm.g:30:7: ( 'xrlf' )
            // InternalPds16asm.g:30:9: 'xrlf'
            {
            match("xrlf"); 


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
            // InternalPds16asm.g:31:7: ( 'not' )
            // InternalPds16asm.g:31:9: 'not'
            {
            match("not"); 


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
            // InternalPds16asm.g:32:7: ( 'notf' )
            // InternalPds16asm.g:32:9: 'notf'
            {
            match("notf"); 


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
            // InternalPds16asm.g:33:7: ( 'rrl' )
            // InternalPds16asm.g:33:9: 'rrl'
            {
            match("rrl"); 


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
            // InternalPds16asm.g:34:7: ( 'rrm' )
            // InternalPds16asm.g:34:9: 'rrm'
            {
            match("rrm"); 


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
            // InternalPds16asm.g:35:7: ( 'rcr' )
            // InternalPds16asm.g:35:9: 'rcr'
            {
            match("rcr"); 


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
            // InternalPds16asm.g:36:7: ( 'rcl' )
            // InternalPds16asm.g:36:9: 'rcl'
            {
            match("rcl"); 


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
            // InternalPds16asm.g:37:7: ( 'jz' )
            // InternalPds16asm.g:37:9: 'jz'
            {
            match("jz"); 


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
            // InternalPds16asm.g:38:7: ( 'je' )
            // InternalPds16asm.g:38:9: 'je'
            {
            match("je"); 


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
            // InternalPds16asm.g:39:7: ( 'jnz' )
            // InternalPds16asm.g:39:9: 'jnz'
            {
            match("jnz"); 


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
            // InternalPds16asm.g:40:7: ( 'jne' )
            // InternalPds16asm.g:40:9: 'jne'
            {
            match("jne"); 


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
            // InternalPds16asm.g:41:7: ( 'jc' )
            // InternalPds16asm.g:41:9: 'jc'
            {
            match("jc"); 


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
            // InternalPds16asm.g:42:7: ( 'jbl' )
            // InternalPds16asm.g:42:9: 'jbl'
            {
            match("jbl"); 


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
            // InternalPds16asm.g:43:7: ( 'jnc' )
            // InternalPds16asm.g:43:9: 'jnc'
            {
            match("jnc"); 


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
            // InternalPds16asm.g:44:7: ( 'jae' )
            // InternalPds16asm.g:44:9: 'jae'
            {
            match("jae"); 


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
            // InternalPds16asm.g:45:7: ( 'jmp' )
            // InternalPds16asm.g:45:9: 'jmp'
            {
            match("jmp"); 


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
            // InternalPds16asm.g:46:7: ( 'jmpl' )
            // InternalPds16asm.g:46:9: 'jmpl'
            {
            match("jmpl"); 


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
            // InternalPds16asm.g:47:7: ( 'r0' )
            // InternalPds16asm.g:47:9: 'r0'
            {
            match("r0"); 


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
            // InternalPds16asm.g:48:7: ( 'r1' )
            // InternalPds16asm.g:48:9: 'r1'
            {
            match("r1"); 


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
            // InternalPds16asm.g:49:7: ( 'r2' )
            // InternalPds16asm.g:49:9: 'r2'
            {
            match("r2"); 


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
            // InternalPds16asm.g:50:7: ( 'r3' )
            // InternalPds16asm.g:50:9: 'r3'
            {
            match("r3"); 


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
            // InternalPds16asm.g:51:7: ( 'r4' )
            // InternalPds16asm.g:51:9: 'r4'
            {
            match("r4"); 


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
            // InternalPds16asm.g:52:7: ( 'r5' )
            // InternalPds16asm.g:52:9: 'r5'
            {
            match("r5"); 


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
            // InternalPds16asm.g:53:7: ( 'r6' )
            // InternalPds16asm.g:53:9: 'r6'
            {
            match("r6"); 


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
            // InternalPds16asm.g:54:7: ( 'r7' )
            // InternalPds16asm.g:54:9: 'r7'
            {
            match("r7"); 


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
            // InternalPds16asm.g:55:7: ( 'PSW' )
            // InternalPds16asm.g:55:9: 'PSW'
            {
            match("PSW"); 


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
            // InternalPds16asm.g:56:7: ( 'subr' )
            // InternalPds16asm.g:56:9: 'subr'
            {
            match("subr"); 


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
            // InternalPds16asm.g:57:7: ( 'shl' )
            // InternalPds16asm.g:57:9: 'shl'
            {
            match("shl"); 


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
            // InternalPds16asm.g:58:7: ( 'shr' )
            // InternalPds16asm.g:58:9: 'shr'
            {
            match("shr"); 


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
            // InternalPds16asm.g:59:7: ( ',' )
            // InternalPds16asm.g:59:9: ','
            {
            match(','); 

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
            // InternalPds16asm.g:60:7: ( '[' )
            // InternalPds16asm.g:60:9: '['
            {
            match('['); 

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
            // InternalPds16asm.g:61:7: ( ']' )
            // InternalPds16asm.g:61:9: ']'
            {
            match(']'); 

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
            // InternalPds16asm.g:62:7: ( '#' )
            // InternalPds16asm.g:62:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4503:10: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalPds16asm.g:4503:12: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPds16asm.g:4503:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_NUMB"
    public final void mRULE_NUMB() throws RecognitionException {
        try {
            int _type = RULE_NUMB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4505:11: ( ( '0' .. '9' )+ )
            // InternalPds16asm.g:4505:13: ( '0' .. '9' )+
            {
            // InternalPds16asm.g:4505:13: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPds16asm.g:4505:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMB"

    // $ANTLR start "RULE_OCT"
    public final void mRULE_OCT() throws RecognitionException {
        try {
            int _type = RULE_OCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4507:10: ( ( '0' | '1' .. '7' ( '0' .. '7' )* ) )
            // InternalPds16asm.g:4507:12: ( '0' | '1' .. '7' ( '0' .. '7' )* )
            {
            // InternalPds16asm.g:4507:12: ( '0' | '1' .. '7' ( '0' .. '7' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='7')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPds16asm.g:4507:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:4507:17: '1' .. '7' ( '0' .. '7' )*
                    {
                    matchRange('1','7'); 
                    // InternalPds16asm.g:4507:26: ( '0' .. '7' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='7')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPds16asm.g:4507:27: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_OCT"

    // $ANTLR start "RULE_BIN"
    public final void mRULE_BIN() throws RecognitionException {
        try {
            int _type = RULE_BIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4509:10: ( ( '0' | '1' )+ )
            // InternalPds16asm.g:4509:12: ( '0' | '1' )+
            {
            // InternalPds16asm.g:4509:12: ( '0' | '1' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='1')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
    // $ANTLR end "RULE_BIN"

    // $ANTLR start "RULE_COMT"
    public final void mRULE_COMT() throws RecognitionException {
        try {
            int _type = RULE_COMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4511:11: ( ';' ( options {greedy=false; } : . )* '\\n' )
            // InternalPds16asm.g:4511:13: ';' ( options {greedy=false; } : . )* '\\n'
            {
            match(';'); 
            // InternalPds16asm.g:4511:17: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPds16asm.g:4511:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "RULE_COMT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4513:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPds16asm.g:4513:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPds16asm.g:4513:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPds16asm.g:4513:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPds16asm.g:4513:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // InternalPds16asm.g:4515:10: ( ( '0' .. '9' )+ )
            // InternalPds16asm.g:4515:12: ( '0' .. '9' )+
            {
            // InternalPds16asm.g:4515:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPds16asm.g:4515:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalPds16asm.g:4517:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPds16asm.g:4517:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPds16asm.g:4517:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPds16asm.g:4517:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPds16asm.g:4517:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPds16asm.g:4517:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asm.g:4517:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPds16asm.g:4517:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPds16asm.g:4517:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPds16asm.g:4517:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asm.g:4517:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalPds16asm.g:4519:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPds16asm.g:4519:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPds16asm.g:4519:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPds16asm.g:4519:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalPds16asm.g:4521:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPds16asm.g:4521:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPds16asm.g:4521:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPds16asm.g:4521:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalPds16asm.g:4521:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPds16asm.g:4521:41: ( '\\r' )? '\\n'
                    {
                    // InternalPds16asm.g:4521:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalPds16asm.g:4521:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4523:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPds16asm.g:4523:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPds16asm.g:4523:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asm.g:4525:16: ( . )
            // InternalPds16asm.g:4525:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPds16asm.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_HEX | RULE_NUMB | RULE_OCT | RULE_BIN | RULE_COMT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=64;
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
                // InternalPds16asm.g:1:322: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 54 :
                // InternalPds16asm.g:1:331: RULE_NUMB
                {
                mRULE_NUMB(); 

                }
                break;
            case 55 :
                // InternalPds16asm.g:1:341: RULE_OCT
                {
                mRULE_OCT(); 

                }
                break;
            case 56 :
                // InternalPds16asm.g:1:350: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 57 :
                // InternalPds16asm.g:1:359: RULE_COMT
                {
                mRULE_COMT(); 

                }
                break;
            case 58 :
                // InternalPds16asm.g:1:369: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // InternalPds16asm.g:1:377: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 60 :
                // InternalPds16asm.g:1:386: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 61 :
                // InternalPds16asm.g:1:398: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 62 :
                // InternalPds16asm.g:1:414: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 63 :
                // InternalPds16asm.g:1:430: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // InternalPds16asm.g:1:438: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\11\33\4\uffff\4\74\2\31\1\uffff\3\31\2\uffff\1\110\1\uffff\1\112\12\33\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\33\1\146\4\33\6\uffff\4\74\5\uffff\1\154\1\155\1\uffff\1\156\1\uffff\1\161\1\163\1\164\1\165\1\167\1\171\1\173\1\175\1\177\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\12\uffff\1\u0086\1\u0087\1\u0088\1\uffff\1\u0089\1\u008a\1\u008c\1\u008d\1\u008e\3\uffff\1\u008f\1\u0090\1\uffff\1\u0091\3\uffff\1\u0092\1\uffff\1\u0093\1\uffff\1\u0094\1\uffff\1\u0095\1\uffff\1\u0096\1\uffff\1\u0097\12\uffff\1\u0098\15\uffff";
    static final String DFA18_eofS =
        "\u0099\uffff";
    static final String DFA18_minS =
        "\1\0\1\144\1\142\1\144\2\162\1\157\1\60\1\141\1\123\4\uffff\4\60\1\0\1\101\1\uffff\2\0\1\52\2\uffff\1\60\1\uffff\1\60\2\142\1\154\1\143\3\154\1\164\2\154\12\60\1\143\1\60\1\154\1\145\1\160\1\127\6\uffff\4\60\5\uffff\2\60\1\uffff\1\60\1\uffff\16\60\12\uffff\3\60\1\uffff\5\60\3\uffff\2\60\1\uffff\1\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\12\uffff\1\60\15\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\144\1\165\1\156\2\162\1\157\1\162\1\172\1\123\4\uffff\1\170\3\71\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\1\172\2\142\1\162\1\144\3\154\1\164\1\155\1\162\14\172\1\154\1\145\1\160\1\127\6\uffff\4\71\5\uffff\2\172\1\uffff\1\172\1\uffff\16\172\12\uffff\3\172\1\uffff\5\172\3\uffff\2\172\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\12\uffff\1\172\15\uffff";
    static final String DFA18_acceptS =
        "\12\uffff\1\61\1\62\1\63\1\64\6\uffff\1\72\3\uffff\1\77\1\100\1\uffff\1\72\33\uffff\1\61\1\62\1\63\1\64\1\65\1\66\4\uffff\1\71\1\74\1\75\1\76\1\77\2\uffff\1\3\1\uffff\1\5\16\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\33\1\34\3\uffff\1\37\5\uffff\1\1\1\4\1\6\2\uffff\1\13\1\uffff\1\15\1\57\1\60\1\uffff\1\7\1\uffff\1\11\1\uffff\1\17\1\uffff\1\21\1\uffff\1\23\1\uffff\1\25\1\27\1\30\1\31\1\32\1\35\1\36\1\41\1\40\1\42\1\uffff\1\43\1\55\1\2\1\14\1\56\1\16\1\10\1\12\1\20\1\22\1\24\1\26\1\44";
    static final String DFA18_specialS =
        "\1\0\21\uffff\1\2\2\uffff\1\3\1\1\u0082\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\1\15\3\31\1\26\4\31\1\12\2\31\1\27\1\16\1\17\6\21\2\20\1\31\1\22\5\31\17\24\1\11\12\24\1\13\1\31\1\14\1\23\1\24\1\31\1\3\10\24\1\10\1\24\1\1\1\24\1\6\1\4\2\24\1\7\1\2\4\24\1\5\2\24\uff85\31",
            "\1\32",
            "\1\36\5\uffff\1\37\13\uffff\1\34\1\35",
            "\1\40\11\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\53\uffff\1\46\16\uffff\1\45",
            "\1\64\1\63\1\62\1\uffff\1\60\7\uffff\1\65\1\61\13\uffff\1\57",
            "\1\66",
            "",
            "",
            "",
            "",
            "\2\75\10\76\36\uffff\1\73\37\uffff\1\73",
            "\2\77\6\100\2\76",
            "\12\76",
            "\10\100\2\76",
            "\0\101",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\102",
            "\0\102",
            "\1\103\4\uffff\1\104",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\33\1\107\6\33\1\106\21\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\33\1\111\30\33",
            "\1\113",
            "\1\114",
            "\1\115\5\uffff\1\116",
            "\1\120\1\117",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125\1\126",
            "\1\130\5\uffff\1\127",
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
            "\1\145\1\uffff\1\144\24\uffff\1\143",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\75\10\76",
            "\12\76",
            "\2\77\6\100\2\76",
            "\10\100\2\76",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\7\33\1\153\22\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\157\13\33\1\160\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\162\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\166\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\170\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\172\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\174\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\176\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\5\33\1\u0080\24\33",
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
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\u008b\16\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_HEX | RULE_NUMB | RULE_OCT | RULE_BIN | RULE_COMT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='l') ) {s = 1;}

                        else if ( (LA18_0=='s') ) {s = 2;}

                        else if ( (LA18_0=='a') ) {s = 3;}

                        else if ( (LA18_0=='o') ) {s = 4;}

                        else if ( (LA18_0=='x') ) {s = 5;}

                        else if ( (LA18_0=='n') ) {s = 6;}

                        else if ( (LA18_0=='r') ) {s = 7;}

                        else if ( (LA18_0=='j') ) {s = 8;}

                        else if ( (LA18_0=='P') ) {s = 9;}

                        else if ( (LA18_0==',') ) {s = 10;}

                        else if ( (LA18_0=='[') ) {s = 11;}

                        else if ( (LA18_0==']') ) {s = 12;}

                        else if ( (LA18_0=='#') ) {s = 13;}

                        else if ( (LA18_0=='0') ) {s = 14;}

                        else if ( (LA18_0=='1') ) {s = 15;}

                        else if ( ((LA18_0>='8' && LA18_0<='9')) ) {s = 16;}

                        else if ( ((LA18_0>='2' && LA18_0<='7')) ) {s = 17;}

                        else if ( (LA18_0==';') ) {s = 18;}

                        else if ( (LA18_0=='^') ) {s = 19;}

                        else if ( ((LA18_0>='A' && LA18_0<='O')||(LA18_0>='Q' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='b' && LA18_0<='i')||LA18_0=='k'||LA18_0=='m'||(LA18_0>='p' && LA18_0<='q')||(LA18_0>='t' && LA18_0<='w')||(LA18_0>='y' && LA18_0<='z')) ) {s = 20;}

                        else if ( (LA18_0=='\"') ) {s = 21;}

                        else if ( (LA18_0=='\'') ) {s = 22;}

                        else if ( (LA18_0=='/') ) {s = 23;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 24;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='+')||(LA18_0>='-' && LA18_0<='.')||LA18_0==':'||(LA18_0>='<' && LA18_0<='@')||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_22 = input.LA(1);

                        s = -1;
                        if ( ((LA18_22>='\u0000' && LA18_22<='\uFFFF')) ) {s = 66;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_18 = input.LA(1);

                        s = -1;
                        if ( ((LA18_18>='\u0000' && LA18_18<='\uFFFF')) ) {s = 65;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_21 = input.LA(1);

                        s = -1;
                        if ( ((LA18_21>='\u0000' && LA18_21<='\uFFFF')) ) {s = 66;}

                        else s = 25;

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
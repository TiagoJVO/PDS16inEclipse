package org.pds16.pds16asm.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPds16asmLexer extends Lexer {
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

    public InternalPds16asmLexer() {;} 
    public InternalPds16asmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPds16asmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPds16asmLexer.g"; }

    // $ANTLR start "Section"
    public final void mSection() throws RecognitionException {
        try {
            int _type = Section;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:14:9: ( '.' ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalPds16asmLexer.g:14:11: '.' ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            match('.'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Section"

    // $ANTLR start "Asciiz"
    public final void mAsciiz() throws RecognitionException {
        try {
            int _type = Asciiz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:16:8: ( '.' ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) )
            // InternalPds16asmLexer.g:16:10: '.' ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'I' | 'i' ) ( 'Z' | 'z' )
            {
            match('.'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asciiz"

    // $ANTLR start "Ascii"
    public final void mAscii() throws RecognitionException {
        try {
            int _type = Ascii;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:18:7: ( '.' ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'I' | 'i' ) )
            // InternalPds16asmLexer.g:18:9: '.' ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'I' | 'i' )
            {
            match('.'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ascii"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
        try {
            int _type = Space;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:20:7: ( '.' ( 'S' | 's' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:20:9: '.' ( 'S' | 's' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            match('.'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Space"

    // $ANTLR start "Byte"
    public final void mByte() throws RecognitionException {
        try {
            int _type = Byte;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:22:6: ( '.' ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:22:8: '.' ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            match('.'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte"

    // $ANTLR start "Data"
    public final void mData() throws RecognitionException {
        try {
            int _type = Data;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:24:6: ( '.' ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalPds16asmLexer.g:24:8: '.' ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            match('.'); 
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Data"

    // $ANTLR start "Text"
    public final void mText() throws RecognitionException {
        try {
            int _type = Text;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:26:6: ( '.' ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:26:8: '.' ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' )
            {
            match('.'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Text"

    // $ANTLR start "Word"
    public final void mWord() throws RecognitionException {
        try {
            int _type = Word;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:28:6: ( '.' ( 'W' | 'w' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) )
            // InternalPds16asmLexer.g:28:8: '.' ( 'W' | 'w' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' )
            {
            match('.'); 
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Word"

    // $ANTLR start "Bss"
    public final void mBss() throws RecognitionException {
        try {
            int _type = Bss;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:30:5: ( '.' ( 'B' | 'b' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // InternalPds16asmLexer.g:30:7: '.' ( 'B' | 'b' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            match('.'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bss"

    // $ANTLR start "End"
    public final void mEnd() throws RecognitionException {
        try {
            int _type = End;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:32:5: ( '.' ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalPds16asmLexer.g:32:7: '.' ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            match('.'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "End"

    // $ANTLR start "Equ"
    public final void mEqu() throws RecognitionException {
        try {
            int _type = Equ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:34:5: ( '.' ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) )
            // InternalPds16asmLexer.g:34:7: '.' ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' )
            {
            match('.'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equ"

    // $ANTLR start "Org"
    public final void mOrg() throws RecognitionException {
        try {
            int _type = Org;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:36:5: ( '.' ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'G' | 'g' ) )
            // InternalPds16asmLexer.g:36:7: '.' ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'G' | 'g' )
            {
            match('.'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Org"

    // $ANTLR start "Set"
    public final void mSet() throws RecognitionException {
        try {
            int _type = Set;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:38:5: ( '.' ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:38:7: '.' ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            match('.'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Set"

    // $ANTLR start "Adcf"
    public final void mAdcf() throws RecognitionException {
        try {
            int _type = Adcf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:40:6: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:40:8: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Adcf"

    // $ANTLR start "Addf"
    public final void mAddf() throws RecognitionException {
        try {
            int _type = Addf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:42:6: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:42:8: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Addf"

    // $ANTLR start "Anlf"
    public final void mAnlf() throws RecognitionException {
        try {
            int _type = Anlf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:44:6: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:44:8: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Anlf"

    // $ANTLR start "Decf"
    public final void mDecf() throws RecognitionException {
        try {
            int _type = Decf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:46:6: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:46:8: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Decf"

    // $ANTLR start "High"
    public final void mHigh() throws RecognitionException {
        try {
            int _type = High;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:48:6: ( ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'H' | 'h' ) )
            // InternalPds16asmLexer.g:48:8: ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "High"

    // $ANTLR start "Incf"
    public final void mIncf() throws RecognitionException {
        try {
            int _type = Incf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:50:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:50:8: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Incf"

    // $ANTLR start "Iret"
    public final void mIret() throws RecognitionException {
        try {
            int _type = Iret;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:52:6: ( ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:52:8: ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Iret"

    // $ANTLR start "Jmpl"
    public final void mJmpl() throws RecognitionException {
        try {
            int _type = Jmpl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:54:6: ( ( 'J' | 'j' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:54:8: ( 'J' | 'j' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jmpl"

    // $ANTLR start "Ldih"
    public final void mLdih() throws RecognitionException {
        try {
            int _type = Ldih;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:56:6: ( ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'H' | 'h' ) )
            // InternalPds16asmLexer.g:56:8: ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ldih"

    // $ANTLR start "Movf"
    public final void mMovf() throws RecognitionException {
        try {
            int _type = Movf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:58:6: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:58:8: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Movf"

    // $ANTLR start "Notf"
    public final void mNotf() throws RecognitionException {
        try {
            int _type = Notf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:60:6: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:60:8: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Notf"

    // $ANTLR start "Orlf"
    public final void mOrlf() throws RecognitionException {
        try {
            int _type = Orlf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:62:6: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:62:8: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Orlf"

    // $ANTLR start "Sbbf"
    public final void mSbbf() throws RecognitionException {
        try {
            int _type = Sbbf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:64:6: ( ( 'S' | 's' ) ( 'B' | 'b' ) ( 'B' | 'b' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:64:8: ( 'S' | 's' ) ( 'B' | 'b' ) ( 'B' | 'b' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sbbf"

    // $ANTLR start "Subf"
    public final void mSubf() throws RecognitionException {
        try {
            int _type = Subf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:66:6: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:66:8: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subf"

    // $ANTLR start "Subr"
    public final void mSubr() throws RecognitionException {
        try {
            int _type = Subr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:68:6: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'R' | 'r' ) )
            // InternalPds16asmLexer.g:68:8: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subr"

    // $ANTLR start "Xrlf"
    public final void mXrlf() throws RecognitionException {
        try {
            int _type = Xrlf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:70:6: ( ( 'X' | 'x' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'F' | 'f' ) )
            // InternalPds16asmLexer.g:70:8: ( 'X' | 'x' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xrlf"

    // $ANTLR start "Adc"
    public final void mAdc() throws RecognitionException {
        try {
            int _type = Adc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:72:5: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:72:7: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Adc"

    // $ANTLR start "Add"
    public final void mAdd() throws RecognitionException {
        try {
            int _type = Add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:74:5: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) )
            // InternalPds16asmLexer.g:74:7: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Add"

    // $ANTLR start "Anl"
    public final void mAnl() throws RecognitionException {
        try {
            int _type = Anl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:76:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:76:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Anl"

    // $ANTLR start "Dec"
    public final void mDec() throws RecognitionException {
        try {
            int _type = Dec;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:78:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:78:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dec"

    // $ANTLR start "Inc"
    public final void mInc() throws RecognitionException {
        try {
            int _type = Inc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:80:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:80:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inc"

    // $ANTLR start "Jae"
    public final void mJae() throws RecognitionException {
        try {
            int _type = Jae;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:82:5: ( ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:82:7: ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jae"

    // $ANTLR start "Jbl"
    public final void mJbl() throws RecognitionException {
        try {
            int _type = Jbl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:84:5: ( ( 'J' | 'j' ) ( 'B' | 'b' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:84:7: ( 'J' | 'j' ) ( 'B' | 'b' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jbl"

    // $ANTLR start "Jmp"
    public final void mJmp() throws RecognitionException {
        try {
            int _type = Jmp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:86:5: ( ( 'J' | 'j' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // InternalPds16asmLexer.g:86:7: ( 'J' | 'j' ) ( 'M' | 'm' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jmp"

    // $ANTLR start "Jnc"
    public final void mJnc() throws RecognitionException {
        try {
            int _type = Jnc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:88:5: ( ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:88:7: ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jnc"

    // $ANTLR start "Jne"
    public final void mJne() throws RecognitionException {
        try {
            int _type = Jne;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:90:5: ( ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:90:7: ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jne"

    // $ANTLR start "Jnz"
    public final void mJnz() throws RecognitionException {
        try {
            int _type = Jnz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:92:5: ( ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'Z' | 'z' ) )
            // InternalPds16asmLexer.g:92:7: ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'Z' | 'z' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jnz"

    // $ANTLR start "Ldb"
    public final void mLdb() throws RecognitionException {
        try {
            int _type = Ldb;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:94:5: ( ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:94:7: ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ldb"

    // $ANTLR start "Ldi"
    public final void mLdi() throws RecognitionException {
        try {
            int _type = Ldi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:96:5: ( ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'I' | 'i' ) )
            // InternalPds16asmLexer.g:96:7: ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ldi"

    // $ANTLR start "Low"
    public final void mLow() throws RecognitionException {
        try {
            int _type = Low;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:98:5: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // InternalPds16asmLexer.g:98:7: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Low"

    // $ANTLR start "Mov"
    public final void mMov() throws RecognitionException {
        try {
            int _type = Mov;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:100:5: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) )
            // InternalPds16asmLexer.g:100:7: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mov"

    // $ANTLR start "Nop"
    public final void mNop() throws RecognitionException {
        try {
            int _type = Nop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:102:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // InternalPds16asmLexer.g:102:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nop"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:104:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:104:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Orl"
    public final void mOrl() throws RecognitionException {
        try {
            int _type = Orl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:106:5: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:106:7: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Orl"

    // $ANTLR start "Rcl"
    public final void mRcl() throws RecognitionException {
        try {
            int _type = Rcl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:108:5: ( ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:108:7: ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rcl"

    // $ANTLR start "Rcr"
    public final void mRcr() throws RecognitionException {
        try {
            int _type = Rcr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:110:5: ( ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'R' | 'r' ) )
            // InternalPds16asmLexer.g:110:7: ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rcr"

    // $ANTLR start "Ret"
    public final void mRet() throws RecognitionException {
        try {
            int _type = Ret;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:112:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:112:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ret"

    // $ANTLR start "Rrl"
    public final void mRrl() throws RecognitionException {
        try {
            int _type = Rrl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:114:5: ( ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:114:7: ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rrl"

    // $ANTLR start "Rrm"
    public final void mRrm() throws RecognitionException {
        try {
            int _type = Rrm;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:116:5: ( ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            // InternalPds16asmLexer.g:116:7: ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rrm"

    // $ANTLR start "Sbb"
    public final void mSbb() throws RecognitionException {
        try {
            int _type = Sbb;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:118:5: ( ( 'S' | 's' ) ( 'B' | 'b' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:118:7: ( 'S' | 's' ) ( 'B' | 'b' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sbb"

    // $ANTLR start "Shl"
    public final void mShl() throws RecognitionException {
        try {
            int _type = Shl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:120:5: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:120:7: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Shl"

    // $ANTLR start "Shr"
    public final void mShr() throws RecognitionException {
        try {
            int _type = Shr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:122:5: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'R' | 'r' ) )
            // InternalPds16asmLexer.g:122:7: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Shr"

    // $ANTLR start "Stb"
    public final void mStb() throws RecognitionException {
        try {
            int _type = Stb;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:124:5: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:124:7: ( 'S' | 's' ) ( 'T' | 't' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stb"

    // $ANTLR start "Sub"
    public final void mSub() throws RecognitionException {
        try {
            int _type = Sub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:126:5: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:126:7: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sub"

    // $ANTLR start "Xrl"
    public final void mXrl() throws RecognitionException {
        try {
            int _type = Xrl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:128:5: ( ( 'X' | 'x' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:128:7: ( 'X' | 'x' ) ( 'R' | 'r' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xrl"

    // $ANTLR start "Jc"
    public final void mJc() throws RecognitionException {
        try {
            int _type = Jc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:130:4: ( ( 'J' | 'j' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:130:6: ( 'J' | 'j' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jc"

    // $ANTLR start "Je"
    public final void mJe() throws RecognitionException {
        try {
            int _type = Je;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:132:4: ( ( 'J' | 'j' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:132:6: ( 'J' | 'j' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Je"

    // $ANTLR start "Jz"
    public final void mJz() throws RecognitionException {
        try {
            int _type = Jz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:134:4: ( ( 'J' | 'j' ) ( 'Z' | 'z' ) )
            // InternalPds16asmLexer.g:134:6: ( 'J' | 'j' ) ( 'Z' | 'z' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jz"

    // $ANTLR start "Ld"
    public final void mLd() throws RecognitionException {
        try {
            int _type = Ld;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:136:4: ( ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalPds16asmLexer.g:136:6: ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ld"

    // $ANTLR start "St"
    public final void mSt() throws RecognitionException {
        try {
            int _type = St;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:138:4: ( ( 'S' | 's' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:138:6: ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "St"

    // $ANTLR start "NumberSign"
    public final void mNumberSign() throws RecognitionException {
        try {
            int _type = NumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:140:12: ( '#' )
            // InternalPds16asmLexer.g:140:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSign"

    // $ANTLR start "DollarSign"
    public final void mDollarSign() throws RecognitionException {
        try {
            int _type = DollarSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:142:12: ( '$' )
            // InternalPds16asmLexer.g:142:14: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DollarSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:144:17: ( '(' )
            // InternalPds16asmLexer.g:144:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:146:18: ( ')' )
            // InternalPds16asmLexer.g:146:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:148:7: ( ',' )
            // InternalPds16asmLexer.g:148:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:150:19: ( '[' )
            // InternalPds16asmLexer.g:150:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:152:20: ( ']' )
            // InternalPds16asmLexer.g:152:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_REGISTERS"
    public final void mRULE_REGISTERS() throws RecognitionException {
        try {
            int _type = RULE_REGISTERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:156:16: ( ( 'r0' | 'r1' | 'r2' | 'r3' | 'r4' | 'r5' | 'r6' | 'r7' | 'PSW' ) )
            // InternalPds16asmLexer.g:156:18: ( 'r0' | 'r1' | 'r2' | 'r3' | 'r4' | 'r5' | 'r6' | 'r7' | 'PSW' )
            {
            // InternalPds16asmLexer.g:156:18: ( 'r0' | 'r1' | 'r2' | 'r3' | 'r4' | 'r5' | 'r6' | 'r7' | 'PSW' )
            int alt1=9;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalPds16asmLexer.g:156:19: 'r0'
                    {
                    match("r0"); 


                    }
                    break;
                case 2 :
                    // InternalPds16asmLexer.g:156:24: 'r1'
                    {
                    match("r1"); 


                    }
                    break;
                case 3 :
                    // InternalPds16asmLexer.g:156:29: 'r2'
                    {
                    match("r2"); 


                    }
                    break;
                case 4 :
                    // InternalPds16asmLexer.g:156:34: 'r3'
                    {
                    match("r3"); 


                    }
                    break;
                case 5 :
                    // InternalPds16asmLexer.g:156:39: 'r4'
                    {
                    match("r4"); 


                    }
                    break;
                case 6 :
                    // InternalPds16asmLexer.g:156:44: 'r5'
                    {
                    match("r5"); 


                    }
                    break;
                case 7 :
                    // InternalPds16asmLexer.g:156:49: 'r6'
                    {
                    match("r6"); 


                    }
                    break;
                case 8 :
                    // InternalPds16asmLexer.g:156:54: 'r7'
                    {
                    match("r7"); 


                    }
                    break;
                case 9 :
                    // InternalPds16asmLexer.g:156:59: 'PSW'
                    {
                    match("PSW"); 


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
    // $ANTLR end "RULE_REGISTERS"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:158:10: ( ( RULE_SIGN )? ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalPds16asmLexer.g:158:12: ( RULE_SIGN )? ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            // InternalPds16asmLexer.g:158:12: ( RULE_SIGN )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPds16asmLexer.g:158:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asmLexer.g:158:23: ( '0x' | '0X' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='x') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='X') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPds16asmLexer.g:158:24: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalPds16asmLexer.g:158:29: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalPds16asmLexer.g:158:35: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')||(LA4_0>='a' && LA4_0<='f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPds16asmLexer.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalPds16asmLexer.g:160:10: ( ( RULE_SIGN )? '0' ( '0' .. '7' )+ )
            // InternalPds16asmLexer.g:160:12: ( RULE_SIGN )? '0' ( '0' .. '7' )+
            {
            // InternalPds16asmLexer.g:160:12: ( RULE_SIGN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPds16asmLexer.g:160:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            match('0'); 
            // InternalPds16asmLexer.g:160:27: ( '0' .. '7' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPds16asmLexer.g:160:28: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalPds16asmLexer.g:162:10: ( ( RULE_SIGN )? ( '0' | '1' )+ 'b' )
            // InternalPds16asmLexer.g:162:12: ( RULE_SIGN )? ( '0' | '1' )+ 'b'
            {
            // InternalPds16asmLexer.g:162:12: ( RULE_SIGN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPds16asmLexer.g:162:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asmLexer.g:162:23: ( '0' | '1' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='1')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPds16asmLexer.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalPds16asmLexer.g:164:11: ( ( RULE_SIGN )? '\\'' RULE_ANY_OTHER '\\'' )
            // InternalPds16asmLexer.g:164:13: ( RULE_SIGN )? '\\'' RULE_ANY_OTHER '\\''
            {
            // InternalPds16asmLexer.g:164:13: ( RULE_SIGN )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPds16asmLexer.g:164:13: RULE_SIGN
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
            // InternalPds16asmLexer.g:166:20: ( ( '-' | '+' ) )
            // InternalPds16asmLexer.g:166:22: ( '-' | '+' )
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
            // InternalPds16asmLexer.g:168:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPds16asmLexer.g:168:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPds16asmLexer.g:168:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPds16asmLexer.g:
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
            	    break loop10;
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

    // $ANTLR start "RULE_IDLABEL"
    public final void mRULE_IDLABEL() throws RecognitionException {
        try {
            int _type = RULE_IDLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:170:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ':' )
            // InternalPds16asmLexer.g:170:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ':'
            {
            // InternalPds16asmLexer.g:170:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPds16asmLexer.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDLABEL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:172:10: ( ( RULE_SIGN )? ( '0' .. '9' )+ )
            // InternalPds16asmLexer.g:172:12: ( RULE_SIGN )? ( '0' .. '9' )+
            {
            // InternalPds16asmLexer.g:172:12: ( RULE_SIGN )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPds16asmLexer.g:172:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asmLexer.g:172:23: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPds16asmLexer.g:172:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalPds16asmLexer.g:174:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPds16asmLexer.g:174:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPds16asmLexer.g:174:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPds16asmLexer.g:174:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPds16asmLexer.g:174:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPds16asmLexer.g:174:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asmLexer.g:174:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPds16asmLexer.g:174:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPds16asmLexer.g:174:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPds16asmLexer.g:174:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asmLexer.g:174:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalPds16asmLexer.g:176:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPds16asmLexer.g:176:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPds16asmLexer.g:176:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPds16asmLexer.g:176:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // InternalPds16asmLexer.g:178:17: ( ';' ( options {greedy=false; } : . )* '\\n' )
            // InternalPds16asmLexer.g:178:19: ';' ( options {greedy=false; } : . )* '\\n'
            {
            match(';'); 
            // InternalPds16asmLexer.g:178:23: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\n') ) {
                    alt18=2;
                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPds16asmLexer.g:178:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // InternalPds16asmLexer.g:180:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPds16asmLexer.g:180:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPds16asmLexer.g:180:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPds16asmLexer.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalPds16asmLexer.g:182:25: ( . )
            // InternalPds16asmLexer.g:182:27: .
            {
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPds16asmLexer.g:1:8: ( Section | Asciiz | Ascii | Space | Byte | Data | Text | Word | Bss | End | Equ | Org | Set | Adcf | Addf | Anlf | Decf | High | Incf | Iret | Jmpl | Ldih | Movf | Notf | Orlf | Sbbf | Subf | Subr | Xrlf | Adc | Add | Anl | Dec | Inc | Jae | Jbl | Jmp | Jnc | Jne | Jnz | Ldb | Ldi | Low | Mov | Nop | Not | Orl | Rcl | Rcr | Ret | Rrl | Rrm | Sbb | Shl | Shr | Stb | Sub | Xrl | Jc | Je | Jz | Ld | St | NumberSign | DollarSign | LeftParenthesis | RightParenthesis | Comma | LeftSquareBracket | RightSquareBracket | RULE_REGISTERS | RULE_HEX | RULE_OCT | RULE_BIN | RULE_CHAR | RULE_ID | RULE_IDLABEL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt20=82;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalPds16asmLexer.g:1:10: Section
                {
                mSection(); 

                }
                break;
            case 2 :
                // InternalPds16asmLexer.g:1:18: Asciiz
                {
                mAsciiz(); 

                }
                break;
            case 3 :
                // InternalPds16asmLexer.g:1:25: Ascii
                {
                mAscii(); 

                }
                break;
            case 4 :
                // InternalPds16asmLexer.g:1:31: Space
                {
                mSpace(); 

                }
                break;
            case 5 :
                // InternalPds16asmLexer.g:1:37: Byte
                {
                mByte(); 

                }
                break;
            case 6 :
                // InternalPds16asmLexer.g:1:42: Data
                {
                mData(); 

                }
                break;
            case 7 :
                // InternalPds16asmLexer.g:1:47: Text
                {
                mText(); 

                }
                break;
            case 8 :
                // InternalPds16asmLexer.g:1:52: Word
                {
                mWord(); 

                }
                break;
            case 9 :
                // InternalPds16asmLexer.g:1:57: Bss
                {
                mBss(); 

                }
                break;
            case 10 :
                // InternalPds16asmLexer.g:1:61: End
                {
                mEnd(); 

                }
                break;
            case 11 :
                // InternalPds16asmLexer.g:1:65: Equ
                {
                mEqu(); 

                }
                break;
            case 12 :
                // InternalPds16asmLexer.g:1:69: Org
                {
                mOrg(); 

                }
                break;
            case 13 :
                // InternalPds16asmLexer.g:1:73: Set
                {
                mSet(); 

                }
                break;
            case 14 :
                // InternalPds16asmLexer.g:1:77: Adcf
                {
                mAdcf(); 

                }
                break;
            case 15 :
                // InternalPds16asmLexer.g:1:82: Addf
                {
                mAddf(); 

                }
                break;
            case 16 :
                // InternalPds16asmLexer.g:1:87: Anlf
                {
                mAnlf(); 

                }
                break;
            case 17 :
                // InternalPds16asmLexer.g:1:92: Decf
                {
                mDecf(); 

                }
                break;
            case 18 :
                // InternalPds16asmLexer.g:1:97: High
                {
                mHigh(); 

                }
                break;
            case 19 :
                // InternalPds16asmLexer.g:1:102: Incf
                {
                mIncf(); 

                }
                break;
            case 20 :
                // InternalPds16asmLexer.g:1:107: Iret
                {
                mIret(); 

                }
                break;
            case 21 :
                // InternalPds16asmLexer.g:1:112: Jmpl
                {
                mJmpl(); 

                }
                break;
            case 22 :
                // InternalPds16asmLexer.g:1:117: Ldih
                {
                mLdih(); 

                }
                break;
            case 23 :
                // InternalPds16asmLexer.g:1:122: Movf
                {
                mMovf(); 

                }
                break;
            case 24 :
                // InternalPds16asmLexer.g:1:127: Notf
                {
                mNotf(); 

                }
                break;
            case 25 :
                // InternalPds16asmLexer.g:1:132: Orlf
                {
                mOrlf(); 

                }
                break;
            case 26 :
                // InternalPds16asmLexer.g:1:137: Sbbf
                {
                mSbbf(); 

                }
                break;
            case 27 :
                // InternalPds16asmLexer.g:1:142: Subf
                {
                mSubf(); 

                }
                break;
            case 28 :
                // InternalPds16asmLexer.g:1:147: Subr
                {
                mSubr(); 

                }
                break;
            case 29 :
                // InternalPds16asmLexer.g:1:152: Xrlf
                {
                mXrlf(); 

                }
                break;
            case 30 :
                // InternalPds16asmLexer.g:1:157: Adc
                {
                mAdc(); 

                }
                break;
            case 31 :
                // InternalPds16asmLexer.g:1:161: Add
                {
                mAdd(); 

                }
                break;
            case 32 :
                // InternalPds16asmLexer.g:1:165: Anl
                {
                mAnl(); 

                }
                break;
            case 33 :
                // InternalPds16asmLexer.g:1:169: Dec
                {
                mDec(); 

                }
                break;
            case 34 :
                // InternalPds16asmLexer.g:1:173: Inc
                {
                mInc(); 

                }
                break;
            case 35 :
                // InternalPds16asmLexer.g:1:177: Jae
                {
                mJae(); 

                }
                break;
            case 36 :
                // InternalPds16asmLexer.g:1:181: Jbl
                {
                mJbl(); 

                }
                break;
            case 37 :
                // InternalPds16asmLexer.g:1:185: Jmp
                {
                mJmp(); 

                }
                break;
            case 38 :
                // InternalPds16asmLexer.g:1:189: Jnc
                {
                mJnc(); 

                }
                break;
            case 39 :
                // InternalPds16asmLexer.g:1:193: Jne
                {
                mJne(); 

                }
                break;
            case 40 :
                // InternalPds16asmLexer.g:1:197: Jnz
                {
                mJnz(); 

                }
                break;
            case 41 :
                // InternalPds16asmLexer.g:1:201: Ldb
                {
                mLdb(); 

                }
                break;
            case 42 :
                // InternalPds16asmLexer.g:1:205: Ldi
                {
                mLdi(); 

                }
                break;
            case 43 :
                // InternalPds16asmLexer.g:1:209: Low
                {
                mLow(); 

                }
                break;
            case 44 :
                // InternalPds16asmLexer.g:1:213: Mov
                {
                mMov(); 

                }
                break;
            case 45 :
                // InternalPds16asmLexer.g:1:217: Nop
                {
                mNop(); 

                }
                break;
            case 46 :
                // InternalPds16asmLexer.g:1:221: Not
                {
                mNot(); 

                }
                break;
            case 47 :
                // InternalPds16asmLexer.g:1:225: Orl
                {
                mOrl(); 

                }
                break;
            case 48 :
                // InternalPds16asmLexer.g:1:229: Rcl
                {
                mRcl(); 

                }
                break;
            case 49 :
                // InternalPds16asmLexer.g:1:233: Rcr
                {
                mRcr(); 

                }
                break;
            case 50 :
                // InternalPds16asmLexer.g:1:237: Ret
                {
                mRet(); 

                }
                break;
            case 51 :
                // InternalPds16asmLexer.g:1:241: Rrl
                {
                mRrl(); 

                }
                break;
            case 52 :
                // InternalPds16asmLexer.g:1:245: Rrm
                {
                mRrm(); 

                }
                break;
            case 53 :
                // InternalPds16asmLexer.g:1:249: Sbb
                {
                mSbb(); 

                }
                break;
            case 54 :
                // InternalPds16asmLexer.g:1:253: Shl
                {
                mShl(); 

                }
                break;
            case 55 :
                // InternalPds16asmLexer.g:1:257: Shr
                {
                mShr(); 

                }
                break;
            case 56 :
                // InternalPds16asmLexer.g:1:261: Stb
                {
                mStb(); 

                }
                break;
            case 57 :
                // InternalPds16asmLexer.g:1:265: Sub
                {
                mSub(); 

                }
                break;
            case 58 :
                // InternalPds16asmLexer.g:1:269: Xrl
                {
                mXrl(); 

                }
                break;
            case 59 :
                // InternalPds16asmLexer.g:1:273: Jc
                {
                mJc(); 

                }
                break;
            case 60 :
                // InternalPds16asmLexer.g:1:276: Je
                {
                mJe(); 

                }
                break;
            case 61 :
                // InternalPds16asmLexer.g:1:279: Jz
                {
                mJz(); 

                }
                break;
            case 62 :
                // InternalPds16asmLexer.g:1:282: Ld
                {
                mLd(); 

                }
                break;
            case 63 :
                // InternalPds16asmLexer.g:1:285: St
                {
                mSt(); 

                }
                break;
            case 64 :
                // InternalPds16asmLexer.g:1:288: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 65 :
                // InternalPds16asmLexer.g:1:299: DollarSign
                {
                mDollarSign(); 

                }
                break;
            case 66 :
                // InternalPds16asmLexer.g:1:310: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 67 :
                // InternalPds16asmLexer.g:1:326: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 68 :
                // InternalPds16asmLexer.g:1:343: Comma
                {
                mComma(); 

                }
                break;
            case 69 :
                // InternalPds16asmLexer.g:1:349: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 70 :
                // InternalPds16asmLexer.g:1:367: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 71 :
                // InternalPds16asmLexer.g:1:386: RULE_REGISTERS
                {
                mRULE_REGISTERS(); 

                }
                break;
            case 72 :
                // InternalPds16asmLexer.g:1:401: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 73 :
                // InternalPds16asmLexer.g:1:410: RULE_OCT
                {
                mRULE_OCT(); 

                }
                break;
            case 74 :
                // InternalPds16asmLexer.g:1:419: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 75 :
                // InternalPds16asmLexer.g:1:428: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 76 :
                // InternalPds16asmLexer.g:1:438: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 77 :
                // InternalPds16asmLexer.g:1:446: RULE_IDLABEL
                {
                mRULE_IDLABEL(); 

                }
                break;
            case 78 :
                // InternalPds16asmLexer.g:1:459: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 79 :
                // InternalPds16asmLexer.g:1:468: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 80 :
                // InternalPds16asmLexer.g:1:480: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // InternalPds16asmLexer.g:1:496: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // InternalPds16asmLexer.g:1:512: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\13\uffff";
    static final String DFA1_minS =
        "\1\120\1\60\11\uffff";
    static final String DFA1_maxS =
        "\1\162\1\67\11\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\41\uffff\1\1",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "156:18: ( 'r0' | 'r1' | 'r2' | 'r3' | 'r4' | 'r5' | 'r6' | 'r7' | 'PSW' )";
        }
    }
    static final String DFA20_eotS =
        "\2\uffff\14\54\7\uffff\2\54\1\uffff\2\122\1\uffff\1\54\1\122\14\uffff\3\54\2\uffff\10\54\1\157\1\160\1\161\1\164\7\54\1\177\4\54\10\u0086\1\54\2\122\4\uffff\1\u008d\1\u008a\1\u008d\2\uffff\1\35\7\uffff\1\u0094\1\u0096\1\u0098\1\u009a\1\54\1\u009d\1\54\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\3\uffff\1\u00a7\1\u00a8\1\uffff\1\u00a9\1\u00ab\1\u00ad\1\u00ae\1\u00b0\1\u00b2\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u0086\1\uffff\1\u008d\1\uffff\1\u008d\1\u0088\1\uffff\1\121\4\uffff\1\u00c1\1\uffff\1\u00c2\1\uffff\1\u00c3\1\uffff\1\u00c4\1\uffff\1\u00c5\1\u00c6\1\uffff\1\u00c7\1\u00c8\6\uffff\1\u00c9\3\uffff\1\u00ca\1\uffff\1\u00cb\2\uffff\1\u00cc\1\uffff\1\u00cd\1\uffff\1\u00ce\1\u00cf\4\uffff\1\u00d0\27\uffff\1\u00d3\2\uffff";
    static final String DFA20_eofS =
        "\u00d4\uffff";
    static final String DFA20_minS =
        "\1\11\1\101\14\60\7\uffff\2\60\1\47\2\60\1\0\2\60\4\uffff\1\105\2\123\3\uffff\1\116\1\uffff\3\60\2\uffff\43\60\2\uffff\5\60\2\0\1\47\1\103\1\uffff\1\103\4\uffff\15\60\3\uffff\2\60\1\uffff\12\60\1\uffff\6\60\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\0\3\uffff\1\111\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff\2\60\6\uffff\1\60\3\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff\1\60\6\uffff\1\111\20\uffff\1\132\2\uffff";
    static final String DFA20_maxS =
        "\1\172\1\167\14\172\7\uffff\2\172\1\71\2\172\1\uffff\2\172\4\uffff\1\160\1\163\1\171\3\uffff\1\161\1\uffff\3\172\2\uffff\41\172\1\170\1\142\2\uffff\5\172\2\uffff\1\47\1\164\1\uffff\1\143\4\uffff\15\172\3\uffff\2\172\1\uffff\12\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\142\1\uffff\1\71\1\172\1\uffff\1\uffff\3\uffff\1\151\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2\172\6\uffff\1\172\3\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\1\uffff\2\172\4\uffff\1\172\6\uffff\1\151\20\uffff\1\172\2\uffff";
    static final String DFA20_acceptS =
        "\16\uffff\1\100\1\101\1\102\1\103\1\104\1\105\1\106\10\uffff\1\117\1\120\1\121\1\122\3\uffff\1\6\1\7\1\10\1\uffff\1\14\3\uffff\1\114\1\115\43\uffff\1\113\1\116\11\uffff\1\4\1\uffff\1\5\1\11\1\12\1\13\15\uffff\1\73\1\74\1\75\2\uffff\1\76\12\uffff\1\77\6\uffff\1\107\1\uffff\1\110\1\uffff\1\112\2\uffff\1\111\1\uffff\1\113\1\1\1\15\2\uffff\1\36\1\uffff\1\37\1\uffff\1\40\1\uffff\1\41\2\uffff\1\42\2\uffff\1\45\1\43\1\44\1\46\1\47\1\50\1\uffff\1\52\1\51\1\53\1\uffff\1\54\1\uffff\1\56\1\55\1\uffff\1\57\1\uffff\1\65\2\uffff\1\71\1\66\1\67\1\70\1\uffff\1\72\1\60\1\61\1\62\1\63\1\64\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\uffff\1\2\1\3";
    static final String DFA20_specialS =
        "\32\uffff\1\2\75\uffff\1\3\1\1\64\uffff\1\0\105\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\uffff\1\35\1\16\1\17\2\uffff\1\32\1\20\1\21\1\uffff\1\27\1\22\1\27\1\1\1\36\1\30\1\31\10\34\1\uffff\1\37\5\uffff\1\2\2\33\1\3\3\33\1\4\1\5\1\6\1\33\1\7\1\10\1\11\1\12\1\26\1\33\1\25\1\13\4\33\1\14\2\33\1\23\1\uffff\1\24\1\uffff\1\33\1\uffff\1\2\2\33\1\3\3\33\1\4\1\5\1\6\1\33\1\7\1\10\1\11\1\12\2\33\1\15\1\13\4\33\1\14\2\33",
            "\1\42\1\43\1\uffff\1\44\1\47\11\uffff\1\50\3\uffff\1\41\1\45\2\uffff\1\46\11\uffff\1\42\1\43\1\uffff\1\44\1\47\11\uffff\1\50\3\uffff\1\41\1\45\2\uffff\1\46",
            "\12\53\1\55\6\uffff\3\53\1\51\11\53\1\52\14\53\4\uffff\1\53\1\uffff\3\53\1\51\11\53\1\52\14\53",
            "\12\53\1\55\6\uffff\4\53\1\56\25\53\4\uffff\1\53\1\uffff\4\53\1\56\25\53",
            "\12\53\1\55\6\uffff\10\53\1\57\21\53\4\uffff\1\53\1\uffff\10\53\1\57\21\53",
            "\12\53\1\55\6\uffff\15\53\1\60\3\53\1\61\10\53\4\uffff\1\53\1\uffff\15\53\1\60\3\53\1\61\10\53",
            "\12\53\1\55\6\uffff\1\63\1\64\1\66\1\53\1\67\7\53\1\62\1\65\13\53\1\70\4\uffff\1\53\1\uffff\1\63\1\64\1\66\1\53\1\67\7\53\1\62\1\65\13\53\1\70",
            "\12\53\1\55\6\uffff\3\53\1\71\12\53\1\72\13\53\4\uffff\1\53\1\uffff\3\53\1\71\12\53\1\72\13\53",
            "\12\53\1\55\6\uffff\16\53\1\73\13\53\4\uffff\1\53\1\uffff\16\53\1\73\13\53",
            "\12\53\1\55\6\uffff\16\53\1\74\13\53\4\uffff\1\53\1\uffff\16\53\1\74\13\53",
            "\12\53\1\55\6\uffff\21\53\1\75\10\53\4\uffff\1\53\1\uffff\21\53\1\75\10\53",
            "\12\53\1\55\6\uffff\1\53\1\76\5\53\1\100\13\53\1\101\1\77\5\53\4\uffff\1\53\1\uffff\1\53\1\76\5\53\1\100\13\53\1\101\1\77\5\53",
            "\12\53\1\55\6\uffff\21\53\1\102\10\53\4\uffff\1\53\1\uffff\21\53\1\102\10\53",
            "\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\2\53\1\55\6\uffff\2\53\1\103\1\53\1\104\14\53\1\105\10\53\4\uffff\1\53\1\uffff\2\53\1\103\1\53\1\104\14\53\1\105\10\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\1\55\6\uffff\2\53\1\103\1\53\1\104\14\53\1\105\10\53\4\uffff\1\53\1\uffff\2\53\1\103\1\53\1\104\14\53\1\105\10\53",
            "\12\53\1\55\6\uffff\22\53\1\116\7\53\4\uffff\1\53\1\uffff\32\53",
            "\1\121\10\uffff\1\117\1\120\10\122",
            "\2\125\6\127\2\34\1\55\6\uffff\27\55\1\124\2\55\4\uffff\1\55\1\uffff\1\55\1\126\25\55\1\123\2\55",
            "\2\31\10\34\1\55\6\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\126\30\55",
            "\47\131\1\132\64\131\1\130\uffa3\131",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\34\1\55\6\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\133\12\uffff\1\134\24\uffff\1\133\12\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\137\5\uffff\1\136\31\uffff\1\137\5\uffff\1\136",
            "",
            "",
            "",
            "\1\140\2\uffff\1\141\34\uffff\1\140\2\uffff\1\141",
            "",
            "\12\53\1\55\6\uffff\2\53\1\142\1\143\26\53\4\uffff\1\53\1\uffff\2\53\1\142\1\143\26\53",
            "\12\53\1\55\6\uffff\13\53\1\144\16\53\4\uffff\1\53\1\uffff\13\53\1\144\16\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\1\55\6\uffff\2\53\1\145\27\53\4\uffff\1\53\1\uffff\2\53\1\145\27\53",
            "\12\53\1\55\6\uffff\6\53\1\146\23\53\4\uffff\1\53\1\uffff\6\53\1\146\23\53",
            "\12\53\1\55\6\uffff\2\53\1\147\27\53\4\uffff\1\53\1\uffff\2\53\1\147\27\53",
            "\12\53\1\55\6\uffff\4\53\1\150\25\53\4\uffff\1\53\1\uffff\4\53\1\150\25\53",
            "\12\53\1\55\6\uffff\17\53\1\151\12\53\4\uffff\1\53\1\uffff\17\53\1\151\12\53",
            "\12\53\1\55\6\uffff\4\53\1\152\25\53\4\uffff\1\53\1\uffff\4\53\1\152\25\53",
            "\12\53\1\55\6\uffff\13\53\1\153\16\53\4\uffff\1\53\1\uffff\13\53\1\153\16\53",
            "\12\53\1\55\6\uffff\2\53\1\154\1\53\1\155\24\53\1\156\4\uffff\1\53\1\uffff\2\53\1\154\1\53\1\155\24\53\1\156",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\1\53\1\163\6\53\1\162\21\53\4\uffff\1\53\1\uffff\1\53\1\163\6\53\1\162\21\53",
            "\12\53\1\55\6\uffff\26\53\1\165\3\53\4\uffff\1\53\1\uffff\26\53\1\165\3\53",
            "\12\53\1\55\6\uffff\25\53\1\166\4\53\4\uffff\1\53\1\uffff\25\53\1\166\4\53",
            "\12\53\1\55\6\uffff\17\53\1\170\3\53\1\167\6\53\4\uffff\1\53\1\uffff\17\53\1\170\3\53\1\167\6\53",
            "\12\53\1\55\6\uffff\13\53\1\171\16\53\4\uffff\1\53\1\uffff\13\53\1\171\16\53",
            "\12\53\1\55\6\uffff\1\53\1\172\30\53\4\uffff\1\53\1\uffff\1\53\1\172\30\53",
            "\12\53\1\55\6\uffff\1\53\1\173\30\53\4\uffff\1\53\1\uffff\1\53\1\173\30\53",
            "\12\53\1\55\6\uffff\13\53\1\174\5\53\1\175\10\53\4\uffff\1\53\1\uffff\13\53\1\174\5\53\1\175\10\53",
            "\12\53\1\55\6\uffff\1\53\1\176\30\53\4\uffff\1\53\1\uffff\1\53\1\176\30\53",
            "\12\53\1\55\6\uffff\13\53\1\u0080\16\53\4\uffff\1\53\1\uffff\13\53\1\u0080\16\53",
            "\12\53\1\55\6\uffff\13\53\1\u0081\5\53\1\u0082\10\53\4\uffff\1\53\1\uffff\13\53\1\u0081\5\53\1\u0082\10\53",
            "\12\53\1\55\6\uffff\23\53\1\u0083\6\53\4\uffff\1\53\1\uffff\23\53\1\u0083\6\53",
            "\12\53\1\55\6\uffff\13\53\1\u0084\1\u0085\15\53\4\uffff\1\53\1\uffff\13\53\1\u0084\1\u0085\15\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\26\53\1\u0087\3\53\4\uffff\1\53\1\uffff\32\53",
            "\2\u0089\6\u008b\40\uffff\1\u0088\11\uffff\1\u008a\25\uffff\1\u0088",
            "\2\120\60\uffff\1\u008a",
            "",
            "",
            "\12\u008c\1\55\6\uffff\6\u008c\24\55\4\uffff\1\55\1\uffff\6\u008c\24\55",
            "\12\u008c\1\55\6\uffff\6\u008c\24\55\4\uffff\1\55\1\uffff\6\u008c\24\55",
            "\2\125\6\127\2\34\1\55\6\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\126\30\55",
            "\13\55\6\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\10\127\2\34\1\55\6\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\47\35\1\u008e\uffd8\35",
            "\47\35\1\u008f\uffd8\35",
            "\1\121",
            "\1\u0090\20\uffff\1\u0091\16\uffff\1\u0090\20\uffff\1\u0091",
            "",
            "\1\u0092\37\uffff\1\u0092",
            "",
            "",
            "",
            "",
            "\12\53\1\55\6\uffff\5\53\1\u0093\24\53\4\uffff\1\53\1\uffff\5\53\1\u0093\24\53",
            "\12\53\1\55\6\uffff\5\53\1\u0095\24\53\4\uffff\1\53\1\uffff\5\53\1\u0095\24\53",
            "\12\53\1\55\6\uffff\5\53\1\u0097\24\53\4\uffff\1\53\1\uffff\5\53\1\u0097\24\53",
            "\12\53\1\55\6\uffff\5\53\1\u0099\24\53\4\uffff\1\53\1\uffff\5\53\1\u0099\24\53",
            "\12\53\1\55\6\uffff\7\53\1\u009b\22\53\4\uffff\1\53\1\uffff\7\53\1\u009b\22\53",
            "\12\53\1\55\6\uffff\5\53\1\u009c\24\53\4\uffff\1\53\1\uffff\5\53\1\u009c\24\53",
            "\12\53\1\55\6\uffff\23\53\1\u009e\6\53\4\uffff\1\53\1\uffff\23\53\1\u009e\6\53",
            "\12\53\1\55\6\uffff\13\53\1\u009f\16\53\4\uffff\1\53\1\uffff\13\53\1\u009f\16\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\12\53\1\55\6\uffff\7\53\1\u00a6\22\53\4\uffff\1\53\1\uffff\7\53\1\u00a6\22\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\5\53\1\u00aa\24\53\4\uffff\1\53\1\uffff\5\53\1\u00aa\24\53",
            "\12\53\1\55\6\uffff\5\53\1\u00ac\24\53\4\uffff\1\53\1\uffff\5\53\1\u00ac\24\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\5\53\1\u00af\24\53\4\uffff\1\53\1\uffff\5\53\1\u00af\24\53",
            "\12\53\1\55\6\uffff\5\53\1\u00b1\24\53\4\uffff\1\53\1\uffff\5\53\1\u00b1\24\53",
            "\12\53\1\55\6\uffff\5\53\1\u00b3\13\53\1\u00b4\10\53\4\uffff\1\53\1\uffff\5\53\1\u00b3\13\53\1\u00b4\10\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\5\53\1\u00b9\24\53\4\uffff\1\53\1\uffff\5\53\1\u00b9\24\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\2\u0089\6\u008b\2\122\50\uffff\1\u008a",
            "",
            "\10\u008b\2\122",
            "\12\u008c\1\55\6\uffff\6\u008c\24\55\4\uffff\1\55\1\uffff\6\u008c\24\55",
            "",
            "\0\35",
            "",
            "",
            "",
            "\1\u00c0\37\uffff\1\u00c0",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d1\37\uffff\1\u00d1",
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
            "\1\u00d2\37\uffff\1\u00d2",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Section | Asciiz | Ascii | Space | Byte | Data | Text | Word | Bss | End | Equ | Org | Set | Adcf | Addf | Anlf | Decf | High | Incf | Iret | Jmpl | Ldih | Movf | Notf | Orlf | Sbbf | Subf | Subr | Xrlf | Adc | Add | Anl | Dec | Inc | Jae | Jbl | Jmp | Jnc | Jne | Jnz | Ldb | Ldi | Low | Mov | Nop | Not | Orl | Rcl | Rcr | Ret | Rrl | Rrm | Sbb | Shl | Shr | Stb | Sub | Xrl | Jc | Je | Jz | Ld | St | NumberSign | DollarSign | LeftParenthesis | RightParenthesis | Comma | LeftSquareBracket | RightSquareBracket | RULE_REGISTERS | RULE_HEX | RULE_OCT | RULE_BIN | RULE_CHAR | RULE_ID | RULE_IDLABEL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_142 = input.LA(1);

                        s = -1;
                        if ( ((LA20_142>='\u0000' && LA20_142<='\uFFFF')) ) {s = 29;}

                        else s = 81;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_89 = input.LA(1);

                        s = -1;
                        if ( (LA20_89=='\'') ) {s = 143;}

                        else if ( ((LA20_89>='\u0000' && LA20_89<='&')||(LA20_89>='(' && LA20_89<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_26 = input.LA(1);

                        s = -1;
                        if ( (LA20_26=='\\') ) {s = 88;}

                        else if ( ((LA20_26>='\u0000' && LA20_26<='&')||(LA20_26>='(' && LA20_26<='[')||(LA20_26>=']' && LA20_26<='\uFFFF')) ) {s = 89;}

                        else if ( (LA20_26=='\'') ) {s = 90;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_88 = input.LA(1);

                        s = -1;
                        if ( (LA20_88=='\'') ) {s = 142;}

                        else if ( ((LA20_88>='\u0000' && LA20_88<='&')||(LA20_88>='(' && LA20_88<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
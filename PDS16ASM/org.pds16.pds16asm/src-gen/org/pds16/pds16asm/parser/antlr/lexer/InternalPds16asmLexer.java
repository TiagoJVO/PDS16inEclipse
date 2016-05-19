package org.pds16.pds16asm.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPds16asmLexer extends Lexer {
    public static final int Stb=60;
    public static final int RULE_HEX=85;
    public static final int Word=11;
    public static final int RULE_OCT=86;
    public static final int Asciiz=5;
    public static final int RULE_SIGN=84;
    public static final int Rrm=56;
    public static final int Rrl=55;
    public static final int LeftParenthesis=78;
    public static final int Jbl=40;
    public static final int Addf=18;
    public static final int R0=67;
    public static final int RULE_BIN=87;
    public static final int R1=68;
    public static final int Space=7;
    public static final int R2=69;
    public static final int Sub=61;
    public static final int R3=70;
    public static final int R4=71;
    public static final int Bss=12;
    public static final int R5=72;
    public static final int R6=73;
    public static final int RULE_ID=90;
    public static final int R7=74;
    public static final int Equ=14;
    public static final int Low=47;
    public static final int Notf=27;
    public static final int RULE_INT=91;
    public static final int Byte=8;
    public static final int RULE_ML_COMMENT=93;
    public static final int Rcl=52;
    public static final int LeftSquareBracket=82;
    public static final int Xrlf=32;
    public static final int Rcr=53;
    public static final int Set=16;
    public static final int Incf=22;
    public static final int Comma=80;
    public static final int Jc=63;
    public static final int Je=64;
    public static final int Subf=30;
    public static final int Text=10;
    public static final int Jmp=41;
    public static final int Section=4;
    public static final int Jz=65;
    public static final int Subr=31;
    public static final int Jnc=42;
    public static final int Add=35;
    public static final int Jne=43;
    public static final int Ret=54;
    public static final int Adc=34;
    public static final int St=75;
    public static final int Ldih=25;
    public static final int Xrl=62;
    public static final int Shl=58;
    public static final int Jnz=44;
    public static final int Anlf=19;
    public static final int Orlf=28;
    public static final int Ld=66;
    public static final int RULE_CHAR=89;
    public static final int Iret=23;
    public static final int Shr=59;
    public static final int RightSquareBracket=83;
    public static final int RightParenthesis=79;
    public static final int Nop=49;
    public static final int Not=50;
    public static final int PSW=33;
    public static final int NumberSign=76;
    public static final int End=13;
    public static final int Jmpl=24;
    public static final int Anl=36;
    public static final int Inc=38;
    public static final int Org=15;
    public static final int Orl=51;
    public static final int RULE_STRING=92;
    public static final int Ldb=45;
    public static final int RULE_SL_COMMENT=94;
    public static final int Ldi=46;
    public static final int Sbb=57;
    public static final int Sbbf=29;
    public static final int Movf=26;
    public static final int Colon=81;
    public static final int EOF=-1;
    public static final int High=21;
    public static final int Dec=37;
    public static final int Decf=20;
    public static final int RULE_WS=95;
    public static final int Data=9;
    public static final int RULE_ANY_OTHER=88;
    public static final int Jae=39;
    public static final int Mov=48;
    public static final int Ascii=6;
    public static final int DollarSign=77;
    public static final int Adcf=17;

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

    // $ANTLR start "PSW"
    public final void mPSW() throws RecognitionException {
        try {
            int _type = PSW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:72:5: ( ( 'P' | 'p' ) ( 'S' | 's' ) ( 'W' | 'w' ) )
            // InternalPds16asmLexer.g:72:7: ( 'P' | 'p' ) ( 'S' | 's' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
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
    // $ANTLR end "PSW"

    // $ANTLR start "Adc"
    public final void mAdc() throws RecognitionException {
        try {
            int _type = Adc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:74:5: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:74:7: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'C' | 'c' )
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
            // InternalPds16asmLexer.g:76:5: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) )
            // InternalPds16asmLexer.g:76:7: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' )
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
            // InternalPds16asmLexer.g:78:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:78:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'L' | 'l' )
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
            // InternalPds16asmLexer.g:80:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:80:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' )
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
            // InternalPds16asmLexer.g:82:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:82:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' )
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
            // InternalPds16asmLexer.g:84:5: ( ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:84:7: ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'E' | 'e' )
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
            // InternalPds16asmLexer.g:86:5: ( ( 'J' | 'j' ) ( 'B' | 'b' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:86:7: ( 'J' | 'j' ) ( 'B' | 'b' ) ( 'L' | 'l' )
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
            // InternalPds16asmLexer.g:88:5: ( ( 'J' | 'j' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // InternalPds16asmLexer.g:88:7: ( 'J' | 'j' ) ( 'M' | 'm' ) ( 'P' | 'p' )
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
            // InternalPds16asmLexer.g:90:5: ( ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:90:7: ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'C' | 'c' )
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
            // InternalPds16asmLexer.g:92:5: ( ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:92:7: ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'E' | 'e' )
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
            // InternalPds16asmLexer.g:94:5: ( ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'Z' | 'z' ) )
            // InternalPds16asmLexer.g:94:7: ( 'J' | 'j' ) ( 'N' | 'n' ) ( 'Z' | 'z' )
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
            // InternalPds16asmLexer.g:96:5: ( ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:96:7: ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'B' | 'b' )
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
            // InternalPds16asmLexer.g:98:5: ( ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'I' | 'i' ) )
            // InternalPds16asmLexer.g:98:7: ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'I' | 'i' )
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
            // InternalPds16asmLexer.g:100:5: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // InternalPds16asmLexer.g:100:7: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' )
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
            // InternalPds16asmLexer.g:102:5: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) )
            // InternalPds16asmLexer.g:102:7: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' )
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
            // InternalPds16asmLexer.g:104:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // InternalPds16asmLexer.g:104:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'P' | 'p' )
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
            // InternalPds16asmLexer.g:106:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:106:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
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
            // InternalPds16asmLexer.g:108:5: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:108:7: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'L' | 'l' )
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
            // InternalPds16asmLexer.g:110:5: ( ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:110:7: ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'L' | 'l' )
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
            // InternalPds16asmLexer.g:112:5: ( ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'R' | 'r' ) )
            // InternalPds16asmLexer.g:112:7: ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'R' | 'r' )
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
            // InternalPds16asmLexer.g:114:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:114:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' )
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
            // InternalPds16asmLexer.g:116:5: ( ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:116:7: ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'L' | 'l' )
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
            // InternalPds16asmLexer.g:118:5: ( ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            // InternalPds16asmLexer.g:118:7: ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'M' | 'm' )
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
            // InternalPds16asmLexer.g:120:5: ( ( 'S' | 's' ) ( 'B' | 'b' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:120:7: ( 'S' | 's' ) ( 'B' | 'b' ) ( 'B' | 'b' )
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
            // InternalPds16asmLexer.g:122:5: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:122:7: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'L' | 'l' )
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
            // InternalPds16asmLexer.g:124:5: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'R' | 'r' ) )
            // InternalPds16asmLexer.g:124:7: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'R' | 'r' )
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
            // InternalPds16asmLexer.g:126:5: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:126:7: ( 'S' | 's' ) ( 'T' | 't' ) ( 'B' | 'b' )
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
            // InternalPds16asmLexer.g:128:5: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) )
            // InternalPds16asmLexer.g:128:7: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' )
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
            // InternalPds16asmLexer.g:130:5: ( ( 'X' | 'x' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // InternalPds16asmLexer.g:130:7: ( 'X' | 'x' ) ( 'R' | 'r' ) ( 'L' | 'l' )
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
            // InternalPds16asmLexer.g:132:4: ( ( 'J' | 'j' ) ( 'C' | 'c' ) )
            // InternalPds16asmLexer.g:132:6: ( 'J' | 'j' ) ( 'C' | 'c' )
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
            // InternalPds16asmLexer.g:134:4: ( ( 'J' | 'j' ) ( 'E' | 'e' ) )
            // InternalPds16asmLexer.g:134:6: ( 'J' | 'j' ) ( 'E' | 'e' )
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
            // InternalPds16asmLexer.g:136:4: ( ( 'J' | 'j' ) ( 'Z' | 'z' ) )
            // InternalPds16asmLexer.g:136:6: ( 'J' | 'j' ) ( 'Z' | 'z' )
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
            // InternalPds16asmLexer.g:138:4: ( ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalPds16asmLexer.g:138:6: ( 'L' | 'l' ) ( 'D' | 'd' )
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

    // $ANTLR start "R0"
    public final void mR0() throws RecognitionException {
        try {
            int _type = R0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:140:4: ( ( 'R' | 'r' ) '0' )
            // InternalPds16asmLexer.g:140:6: ( 'R' | 'r' ) '0'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R0"

    // $ANTLR start "R1"
    public final void mR1() throws RecognitionException {
        try {
            int _type = R1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:142:4: ( ( 'R' | 'r' ) '1' )
            // InternalPds16asmLexer.g:142:6: ( 'R' | 'r' ) '1'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R1"

    // $ANTLR start "R2"
    public final void mR2() throws RecognitionException {
        try {
            int _type = R2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:144:4: ( ( 'R' | 'r' ) '2' )
            // InternalPds16asmLexer.g:144:6: ( 'R' | 'r' ) '2'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R2"

    // $ANTLR start "R3"
    public final void mR3() throws RecognitionException {
        try {
            int _type = R3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:146:4: ( ( 'R' | 'r' ) '3' )
            // InternalPds16asmLexer.g:146:6: ( 'R' | 'r' ) '3'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R3"

    // $ANTLR start "R4"
    public final void mR4() throws RecognitionException {
        try {
            int _type = R4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:148:4: ( ( 'R' | 'r' ) '4' )
            // InternalPds16asmLexer.g:148:6: ( 'R' | 'r' ) '4'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R4"

    // $ANTLR start "R5"
    public final void mR5() throws RecognitionException {
        try {
            int _type = R5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:150:4: ( ( 'R' | 'r' ) '5' )
            // InternalPds16asmLexer.g:150:6: ( 'R' | 'r' ) '5'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R5"

    // $ANTLR start "R6"
    public final void mR6() throws RecognitionException {
        try {
            int _type = R6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:152:4: ( ( 'R' | 'r' ) '6' )
            // InternalPds16asmLexer.g:152:6: ( 'R' | 'r' ) '6'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('6'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R6"

    // $ANTLR start "R7"
    public final void mR7() throws RecognitionException {
        try {
            int _type = R7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:154:4: ( ( 'R' | 'r' ) '7' )
            // InternalPds16asmLexer.g:154:6: ( 'R' | 'r' ) '7'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R7"

    // $ANTLR start "St"
    public final void mSt() throws RecognitionException {
        try {
            int _type = St;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:156:4: ( ( 'S' | 's' ) ( 'T' | 't' ) )
            // InternalPds16asmLexer.g:156:6: ( 'S' | 's' ) ( 'T' | 't' )
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
            // InternalPds16asmLexer.g:158:12: ( '#' )
            // InternalPds16asmLexer.g:158:14: '#'
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
            // InternalPds16asmLexer.g:160:12: ( '$' )
            // InternalPds16asmLexer.g:160:14: '$'
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
            // InternalPds16asmLexer.g:162:17: ( '(' )
            // InternalPds16asmLexer.g:162:19: '('
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
            // InternalPds16asmLexer.g:164:18: ( ')' )
            // InternalPds16asmLexer.g:164:20: ')'
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
            // InternalPds16asmLexer.g:166:7: ( ',' )
            // InternalPds16asmLexer.g:166:9: ','
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:168:7: ( ':' )
            // InternalPds16asmLexer.g:168:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:170:19: ( '[' )
            // InternalPds16asmLexer.g:170:21: '['
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
            // InternalPds16asmLexer.g:172:20: ( ']' )
            // InternalPds16asmLexer.g:172:22: ']'
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

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPds16asmLexer.g:176:10: ( ( RULE_SIGN )? ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalPds16asmLexer.g:176:12: ( RULE_SIGN )? ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            // InternalPds16asmLexer.g:176:12: ( RULE_SIGN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPds16asmLexer.g:176:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asmLexer.g:176:23: ( '0x' | '0X' )
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
                    // InternalPds16asmLexer.g:176:24: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalPds16asmLexer.g:176:29: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalPds16asmLexer.g:176:35: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // InternalPds16asmLexer.g:178:10: ( ( RULE_SIGN )? '0' ( '0' .. '7' )+ )
            // InternalPds16asmLexer.g:178:12: ( RULE_SIGN )? '0' ( '0' .. '7' )+
            {
            // InternalPds16asmLexer.g:178:12: ( RULE_SIGN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPds16asmLexer.g:178:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            match('0'); 
            // InternalPds16asmLexer.g:178:27: ( '0' .. '7' )+
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
            	    // InternalPds16asmLexer.g:178:28: '0' .. '7'
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
            // InternalPds16asmLexer.g:180:10: ( ( RULE_SIGN )? ( '0' | '1' )+ 'b' )
            // InternalPds16asmLexer.g:180:12: ( RULE_SIGN )? ( '0' | '1' )+ 'b'
            {
            // InternalPds16asmLexer.g:180:12: ( RULE_SIGN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPds16asmLexer.g:180:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asmLexer.g:180:23: ( '0' | '1' )+
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
            // InternalPds16asmLexer.g:182:11: ( ( RULE_SIGN )? '\\'' RULE_ANY_OTHER '\\'' )
            // InternalPds16asmLexer.g:182:13: ( RULE_SIGN )? '\\'' RULE_ANY_OTHER '\\''
            {
            // InternalPds16asmLexer.g:182:13: ( RULE_SIGN )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='+'||LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPds16asmLexer.g:182:13: RULE_SIGN
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
            // InternalPds16asmLexer.g:184:20: ( ( '-' | '+' ) )
            // InternalPds16asmLexer.g:184:22: ( '-' | '+' )
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
            // InternalPds16asmLexer.g:186:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPds16asmLexer.g:186:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPds16asmLexer.g:186:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            // InternalPds16asmLexer.g:188:10: ( ( RULE_SIGN )? ( '0' .. '9' )+ )
            // InternalPds16asmLexer.g:188:12: ( RULE_SIGN )? ( '0' .. '9' )+
            {
            // InternalPds16asmLexer.g:188:12: ( RULE_SIGN )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPds16asmLexer.g:188:12: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalPds16asmLexer.g:188:23: ( '0' .. '9' )+
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
            	    // InternalPds16asmLexer.g:188:24: '0' .. '9'
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
            // InternalPds16asmLexer.g:190:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPds16asmLexer.g:190:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPds16asmLexer.g:190:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPds16asmLexer.g:190:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPds16asmLexer.g:190:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPds16asmLexer.g:190:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asmLexer.g:190:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPds16asmLexer.g:190:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPds16asmLexer.g:190:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPds16asmLexer.g:190:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPds16asmLexer.g:190:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPds16asmLexer.g:192:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPds16asmLexer.g:192:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPds16asmLexer.g:192:24: ( options {greedy=false; } : . )*
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
            	    // InternalPds16asmLexer.g:192:52: .
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
            // InternalPds16asmLexer.g:194:17: ( ';' ( options {greedy=false; } : . )* '\\n' )
            // InternalPds16asmLexer.g:194:19: ';' ( options {greedy=false; } : . )* '\\n'
            {
            match(';'); 
            // InternalPds16asmLexer.g:194:23: ( options {greedy=false; } : . )*
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
            	    // InternalPds16asmLexer.g:194:51: .
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
            // InternalPds16asmLexer.g:196:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPds16asmLexer.g:196:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPds16asmLexer.g:196:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalPds16asmLexer.g:198:25: ( . )
            // InternalPds16asmLexer.g:198:27: .
            {
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPds16asmLexer.g:1:8: ( Section | Asciiz | Ascii | Space | Byte | Data | Text | Word | Bss | End | Equ | Org | Set | Adcf | Addf | Anlf | Decf | High | Incf | Iret | Jmpl | Ldih | Movf | Notf | Orlf | Sbbf | Subf | Subr | Xrlf | PSW | Adc | Add | Anl | Dec | Inc | Jae | Jbl | Jmp | Jnc | Jne | Jnz | Ldb | Ldi | Low | Mov | Nop | Not | Orl | Rcl | Rcr | Ret | Rrl | Rrm | Sbb | Shl | Shr | Stb | Sub | Xrl | Jc | Je | Jz | Ld | R0 | R1 | R2 | R3 | R4 | R5 | R6 | R7 | St | NumberSign | DollarSign | LeftParenthesis | RightParenthesis | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_HEX | RULE_OCT | RULE_BIN | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt18=90;
        alt18 = dfa18.predict(input);
        switch (alt18) {
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
                // InternalPds16asmLexer.g:1:157: PSW
                {
                mPSW(); 

                }
                break;
            case 31 :
                // InternalPds16asmLexer.g:1:161: Adc
                {
                mAdc(); 

                }
                break;
            case 32 :
                // InternalPds16asmLexer.g:1:165: Add
                {
                mAdd(); 

                }
                break;
            case 33 :
                // InternalPds16asmLexer.g:1:169: Anl
                {
                mAnl(); 

                }
                break;
            case 34 :
                // InternalPds16asmLexer.g:1:173: Dec
                {
                mDec(); 

                }
                break;
            case 35 :
                // InternalPds16asmLexer.g:1:177: Inc
                {
                mInc(); 

                }
                break;
            case 36 :
                // InternalPds16asmLexer.g:1:181: Jae
                {
                mJae(); 

                }
                break;
            case 37 :
                // InternalPds16asmLexer.g:1:185: Jbl
                {
                mJbl(); 

                }
                break;
            case 38 :
                // InternalPds16asmLexer.g:1:189: Jmp
                {
                mJmp(); 

                }
                break;
            case 39 :
                // InternalPds16asmLexer.g:1:193: Jnc
                {
                mJnc(); 

                }
                break;
            case 40 :
                // InternalPds16asmLexer.g:1:197: Jne
                {
                mJne(); 

                }
                break;
            case 41 :
                // InternalPds16asmLexer.g:1:201: Jnz
                {
                mJnz(); 

                }
                break;
            case 42 :
                // InternalPds16asmLexer.g:1:205: Ldb
                {
                mLdb(); 

                }
                break;
            case 43 :
                // InternalPds16asmLexer.g:1:209: Ldi
                {
                mLdi(); 

                }
                break;
            case 44 :
                // InternalPds16asmLexer.g:1:213: Low
                {
                mLow(); 

                }
                break;
            case 45 :
                // InternalPds16asmLexer.g:1:217: Mov
                {
                mMov(); 

                }
                break;
            case 46 :
                // InternalPds16asmLexer.g:1:221: Nop
                {
                mNop(); 

                }
                break;
            case 47 :
                // InternalPds16asmLexer.g:1:225: Not
                {
                mNot(); 

                }
                break;
            case 48 :
                // InternalPds16asmLexer.g:1:229: Orl
                {
                mOrl(); 

                }
                break;
            case 49 :
                // InternalPds16asmLexer.g:1:233: Rcl
                {
                mRcl(); 

                }
                break;
            case 50 :
                // InternalPds16asmLexer.g:1:237: Rcr
                {
                mRcr(); 

                }
                break;
            case 51 :
                // InternalPds16asmLexer.g:1:241: Ret
                {
                mRet(); 

                }
                break;
            case 52 :
                // InternalPds16asmLexer.g:1:245: Rrl
                {
                mRrl(); 

                }
                break;
            case 53 :
                // InternalPds16asmLexer.g:1:249: Rrm
                {
                mRrm(); 

                }
                break;
            case 54 :
                // InternalPds16asmLexer.g:1:253: Sbb
                {
                mSbb(); 

                }
                break;
            case 55 :
                // InternalPds16asmLexer.g:1:257: Shl
                {
                mShl(); 

                }
                break;
            case 56 :
                // InternalPds16asmLexer.g:1:261: Shr
                {
                mShr(); 

                }
                break;
            case 57 :
                // InternalPds16asmLexer.g:1:265: Stb
                {
                mStb(); 

                }
                break;
            case 58 :
                // InternalPds16asmLexer.g:1:269: Sub
                {
                mSub(); 

                }
                break;
            case 59 :
                // InternalPds16asmLexer.g:1:273: Xrl
                {
                mXrl(); 

                }
                break;
            case 60 :
                // InternalPds16asmLexer.g:1:277: Jc
                {
                mJc(); 

                }
                break;
            case 61 :
                // InternalPds16asmLexer.g:1:280: Je
                {
                mJe(); 

                }
                break;
            case 62 :
                // InternalPds16asmLexer.g:1:283: Jz
                {
                mJz(); 

                }
                break;
            case 63 :
                // InternalPds16asmLexer.g:1:286: Ld
                {
                mLd(); 

                }
                break;
            case 64 :
                // InternalPds16asmLexer.g:1:289: R0
                {
                mR0(); 

                }
                break;
            case 65 :
                // InternalPds16asmLexer.g:1:292: R1
                {
                mR1(); 

                }
                break;
            case 66 :
                // InternalPds16asmLexer.g:1:295: R2
                {
                mR2(); 

                }
                break;
            case 67 :
                // InternalPds16asmLexer.g:1:298: R3
                {
                mR3(); 

                }
                break;
            case 68 :
                // InternalPds16asmLexer.g:1:301: R4
                {
                mR4(); 

                }
                break;
            case 69 :
                // InternalPds16asmLexer.g:1:304: R5
                {
                mR5(); 

                }
                break;
            case 70 :
                // InternalPds16asmLexer.g:1:307: R6
                {
                mR6(); 

                }
                break;
            case 71 :
                // InternalPds16asmLexer.g:1:310: R7
                {
                mR7(); 

                }
                break;
            case 72 :
                // InternalPds16asmLexer.g:1:313: St
                {
                mSt(); 

                }
                break;
            case 73 :
                // InternalPds16asmLexer.g:1:316: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 74 :
                // InternalPds16asmLexer.g:1:327: DollarSign
                {
                mDollarSign(); 

                }
                break;
            case 75 :
                // InternalPds16asmLexer.g:1:338: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 76 :
                // InternalPds16asmLexer.g:1:354: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 77 :
                // InternalPds16asmLexer.g:1:371: Comma
                {
                mComma(); 

                }
                break;
            case 78 :
                // InternalPds16asmLexer.g:1:377: Colon
                {
                mColon(); 

                }
                break;
            case 79 :
                // InternalPds16asmLexer.g:1:383: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 80 :
                // InternalPds16asmLexer.g:1:401: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 81 :
                // InternalPds16asmLexer.g:1:420: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 82 :
                // InternalPds16asmLexer.g:1:429: RULE_OCT
                {
                mRULE_OCT(); 

                }
                break;
            case 83 :
                // InternalPds16asmLexer.g:1:438: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 84 :
                // InternalPds16asmLexer.g:1:447: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 85 :
                // InternalPds16asmLexer.g:1:457: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 86 :
                // InternalPds16asmLexer.g:1:465: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // InternalPds16asmLexer.g:1:474: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // InternalPds16asmLexer.g:1:486: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 89 :
                // InternalPds16asmLexer.g:1:502: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // InternalPds16asmLexer.g:1:518: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\2\uffff\15\33\11\uffff\2\34\17\uffff\12\33\1\150\1\151\1\152\1\155\7\33\1\170\5\33\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\2\uffff\1\u0088\1\uffff\1\u0088\2\uffff\1\35\7\uffff\1\u008f\1\u0091\1\u0093\1\u0095\1\33\1\u0098\1\33\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\3\uffff\1\u00a2\1\u00a3\1\uffff\1\u00a4\1\u00a6\1\u00a8\1\u00a9\1\u00ab\1\u00ad\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\11\uffff\1\114\4\uffff\1\u00bd\1\uffff\1\u00be\1\uffff\1\u00bf\1\uffff\1\u00c0\1\uffff\1\u00c1\1\u00c2\1\uffff\1\u00c3\1\u00c4\6\uffff\1\u00c5\3\uffff\1\u00c6\1\uffff\1\u00c7\2\uffff\1\u00c8\1\uffff\1\u00c9\1\uffff\1\u00ca\1\u00cb\4\uffff\1\u00cc\30\uffff\1\u00cf\2\uffff";
    static final String DFA18_eofS =
        "\u00d0\uffff";
    static final String DFA18_minS =
        "\1\11\1\101\1\104\1\105\1\111\1\116\1\101\1\104\2\117\1\122\1\102\1\122\1\123\1\60\10\uffff\1\47\2\60\1\0\6\uffff\1\105\2\123\3\uffff\1\116\1\uffff\1\103\1\114\1\103\1\107\1\103\1\105\1\120\1\105\1\114\1\103\4\60\1\127\1\126\1\120\1\114\2\102\1\114\1\60\1\114\1\127\1\114\1\124\1\114\10\60\2\uffff\1\60\1\uffff\1\60\2\0\1\47\1\103\1\uffff\1\103\4\uffff\4\60\1\110\1\60\1\124\6\60\3\uffff\2\60\1\uffff\12\60\1\uffff\7\60\11\uffff\1\0\3\uffff\1\111\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff\2\60\6\uffff\1\60\3\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff\1\60\7\uffff\1\111\20\uffff\1\132\2\uffff";
    static final String DFA18_maxS =
        "\1\172\1\167\1\156\1\145\1\151\1\162\1\172\3\157\1\162\1\165\1\162\1\163\1\162\10\uffff\1\71\1\170\1\142\1\uffff\6\uffff\1\160\1\163\1\171\3\uffff\1\161\1\uffff\1\144\1\154\1\143\1\147\1\143\1\145\1\160\1\145\1\154\5\172\1\167\1\166\1\164\1\154\2\142\1\162\1\172\1\154\1\167\1\162\1\164\1\155\10\172\2\uffff\1\142\1\uffff\1\71\2\uffff\1\47\1\164\1\uffff\1\143\4\uffff\4\172\1\150\1\172\1\164\6\172\3\uffff\2\172\1\uffff\12\172\1\uffff\7\172\11\uffff\1\uffff\3\uffff\1\151\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2\172\6\uffff\1\172\3\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\1\uffff\2\172\4\uffff\1\172\7\uffff\1\151\20\uffff\1\172\2\uffff";
    static final String DFA18_acceptS =
        "\17\uffff\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\4\uffff\1\125\1\126\1\127\1\130\1\131\1\132\3\uffff\1\6\1\7\1\10\1\uffff\1\14\43\uffff\1\124\1\121\1\uffff\1\123\5\uffff\1\4\1\uffff\1\5\1\11\1\12\1\13\15\uffff\1\74\1\75\1\76\2\uffff\1\77\12\uffff\1\110\7\uffff\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\122\1\uffff\1\124\1\1\1\15\2\uffff\1\37\1\uffff\1\40\1\uffff\1\41\1\uffff\1\42\2\uffff\1\43\2\uffff\1\46\1\44\1\45\1\47\1\50\1\51\1\uffff\1\53\1\52\1\54\1\uffff\1\55\1\uffff\1\57\1\56\1\uffff\1\60\1\uffff\1\66\2\uffff\1\72\1\67\1\70\1\71\1\uffff\1\73\1\36\1\61\1\62\1\63\1\64\1\65\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\uffff\1\2\1\3";
    static final String DFA18_specialS =
        "\32\uffff\1\1\66\uffff\1\0\1\2\66\uffff\1\3\106\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\uffff\1\35\1\17\1\20\2\uffff\1\32\1\21\1\22\1\uffff\1\27\1\23\1\27\1\1\1\36\1\30\1\31\10\34\1\24\1\37\5\uffff\1\2\2\33\1\3\3\33\1\4\1\5\1\6\1\33\1\7\1\10\1\11\1\12\1\15\1\33\1\16\1\13\4\33\1\14\2\33\1\25\1\uffff\1\26\1\uffff\1\33\1\uffff\1\2\2\33\1\3\3\33\1\4\1\5\1\6\1\33\1\7\1\10\1\11\1\12\1\15\1\33\1\16\1\13\4\33\1\14\2\33",
            "\1\42\1\43\1\uffff\1\44\1\47\11\uffff\1\50\3\uffff\1\41\1\45\2\uffff\1\46\11\uffff\1\42\1\43\1\uffff\1\44\1\47\11\uffff\1\50\3\uffff\1\41\1\45\2\uffff\1\46",
            "\1\51\11\uffff\1\52\25\uffff\1\51\11\uffff\1\52",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\3\uffff\1\56\33\uffff\1\55\3\uffff\1\56",
            "\1\60\1\61\1\63\1\uffff\1\64\7\uffff\1\57\1\62\13\uffff\1\65\6\uffff\1\60\1\61\1\63\1\uffff\1\64\7\uffff\1\57\1\62\13\uffff\1\65",
            "\1\66\12\uffff\1\67\24\uffff\1\66\12\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\5\uffff\1\75\13\uffff\1\76\1\74\14\uffff\1\73\5\uffff\1\75\13\uffff\1\76\1\74",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\13\uffff\1\101\1\uffff\1\102\14\uffff\1\103\20\uffff\1\101\1\uffff\1\102\14\uffff\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\124\12\uffff\1\125\24\uffff\1\124\12\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\130\5\uffff\1\127\31\uffff\1\130\5\uffff\1\127",
            "",
            "",
            "",
            "\1\131\2\uffff\1\132\34\uffff\1\131\2\uffff\1\132",
            "",
            "\1\133\1\134\36\uffff\1\133\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "\1\145\1\uffff\1\146\24\uffff\1\147\10\uffff\1\145\1\uffff\1\146\24\uffff\1\147",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\1\33\1\154\6\33\1\153\21\33\4\uffff\1\33\1\uffff\1\33\1\154\6\33\1\153\21\33",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\1\161\3\uffff\1\160\33\uffff\1\161\3\uffff\1\160",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\5\uffff\1\166\31\uffff\1\165\5\uffff\1\166",
            "\12\33\7\uffff\1\33\1\167\30\33\4\uffff\1\33\1\uffff\1\33\1\167\30\33",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\1\173\5\uffff\1\174\31\uffff\1\173\5\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\1\176\1\177\36\uffff\1\176\1\177",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\2\116\6\120\2\34\50\uffff\1\117",
            "",
            "\10\120\2\34",
            "\47\35\1\u0089\uffd8\35",
            "\47\35\1\u008a\uffd8\35",
            "\1\114",
            "\1\u008b\20\uffff\1\u008c\16\uffff\1\u008b\20\uffff\1\u008c",
            "",
            "\1\u008d\37\uffff\1\u008d",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\5\33\1\u008e\24\33\4\uffff\1\33\1\uffff\5\33\1\u008e\24\33",
            "\12\33\7\uffff\5\33\1\u0090\24\33\4\uffff\1\33\1\uffff\5\33\1\u0090\24\33",
            "\12\33\7\uffff\5\33\1\u0092\24\33\4\uffff\1\33\1\uffff\5\33\1\u0092\24\33",
            "\12\33\7\uffff\5\33\1\u0094\24\33\4\uffff\1\33\1\uffff\5\33\1\u0094\24\33",
            "\1\u0096\37\uffff\1\u0096",
            "\12\33\7\uffff\5\33\1\u0097\24\33\4\uffff\1\33\1\uffff\5\33\1\u0097\24\33",
            "\1\u0099\37\uffff\1\u0099",
            "\12\33\7\uffff\13\33\1\u009a\16\33\4\uffff\1\33\1\uffff\13\33\1\u009a\16\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "\12\33\7\uffff\7\33\1\u00a1\22\33\4\uffff\1\33\1\uffff\7\33\1\u00a1\22\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\5\33\1\u00a5\24\33\4\uffff\1\33\1\uffff\5\33\1\u00a5\24\33",
            "\12\33\7\uffff\5\33\1\u00a7\24\33\4\uffff\1\33\1\uffff\5\33\1\u00a7\24\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\5\33\1\u00aa\24\33\4\uffff\1\33\1\uffff\5\33\1\u00aa\24\33",
            "\12\33\7\uffff\5\33\1\u00ac\24\33\4\uffff\1\33\1\uffff\5\33\1\u00ac\24\33",
            "\12\33\7\uffff\5\33\1\u00ae\13\33\1\u00af\10\33\4\uffff\1\33\1\uffff\5\33\1\u00ae\13\33\1\u00af\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\5\33\1\u00b4\24\33\4\uffff\1\33\1\uffff\5\33\1\u00b4\24\33",
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
            "\0\35",
            "",
            "",
            "",
            "\1\u00bc\37\uffff\1\u00bc",
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
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            "\1\u00cd\37\uffff\1\u00cd",
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
            "\1\u00ce\37\uffff\1\u00ce",
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
            return "1:1: Tokens : ( Section | Asciiz | Ascii | Space | Byte | Data | Text | Word | Bss | End | Equ | Org | Set | Adcf | Addf | Anlf | Decf | High | Incf | Iret | Jmpl | Ldih | Movf | Notf | Orlf | Sbbf | Subf | Subr | Xrlf | PSW | Adc | Add | Anl | Dec | Inc | Jae | Jbl | Jmp | Jnc | Jne | Jnz | Ldb | Ldi | Low | Mov | Nop | Not | Orl | Rcl | Rcr | Ret | Rrl | Rrm | Sbb | Shl | Shr | Stb | Sub | Xrl | Jc | Je | Jz | Ld | R0 | R1 | R2 | R3 | R4 | R5 | R6 | R7 | St | NumberSign | DollarSign | LeftParenthesis | RightParenthesis | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_HEX | RULE_OCT | RULE_BIN | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
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
                        int LA18_26 = input.LA(1);

                        s = -1;
                        if ( (LA18_26=='\\') ) {s = 81;}

                        else if ( ((LA18_26>='\u0000' && LA18_26<='&')||(LA18_26>='(' && LA18_26<='[')||(LA18_26>=']' && LA18_26<='\uFFFF')) ) {s = 82;}

                        else if ( (LA18_26=='\'') ) {s = 83;}

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
                        int LA18_137 = input.LA(1);

                        s = -1;
                        if ( ((LA18_137>='\u0000' && LA18_137<='\uFFFF')) ) {s = 29;}

                        else s = 76;

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
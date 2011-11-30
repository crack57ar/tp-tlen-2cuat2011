// $ANTLR 3.4 C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g 2011-11-30 15:34:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TlenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "'('", "')'", "'*'", "'+'", "'.'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'?'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__4=4;
    public static final int T__5=5;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TlenParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TlenParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TlenParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g"; }



    // $ANTLR start "s"
    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:3:1: s returns [AFND afnd] : expr EOF ;
    public final AFND s() throws RecognitionException {
        AFND afnd = null;


        AFND expr1 =null;


        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:4:3: ( expr EOF )
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:4:3: expr EOF
            {
            pushFollow(FOLLOW_expr_in_s16);
            expr1=expr();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_s18); 

            afnd = expr1;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return afnd;
    }
    // $ANTLR end "s"



    // $ANTLR start "expr"
    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:5:1: expr returns [AFND afnd] : dis '|' expr2= expr ;
    public final AFND expr() throws RecognitionException {
        AFND afnd = null;


        AFND expr2 =null;

        AFND dis2 =null;


        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:6:3: ( dis '|' expr2= expr )
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:6:3: dis '|' expr2= expr
            {
            pushFollow(FOLLOW_dis_in_expr31);
            dis2=dis();

            state._fsp--;


            match(input,72,FOLLOW_72_in_expr33); 

            pushFollow(FOLLOW_expr_in_expr39);
            expr2=expr();

            state._fsp--;


            afnd = AFND.paralelize(dis2,expr2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return afnd;
    }
    // $ANTLR end "expr"



    // $ANTLR start "dis"
    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:7:1: dis returns [AFND afnd] : un (dis2= dis )? ;
    public final AFND dis() throws RecognitionException {
        AFND afnd = null;


        AFND dis2 =null;

        AFND un3 =null;


        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:8:3: ( un (dis2= dis )? )
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:8:3: un (dis2= dis )?
            {
            pushFollow(FOLLOW_un_in_dis54);
            un3=un();

            state._fsp--;


            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:8:5: (dis2= dis )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==4||(LA1_0 >= 8 && LA1_0 <= 18)||(LA1_0 >= 20 && LA1_0 <= 71)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:8:6: dis2= dis
                    {
                    pushFollow(FOLLOW_dis_in_dis60);
                    dis2=dis();

                    state._fsp--;


                    }
                    break;

            }


            afnd = AFND.serialize(un3,dis2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return afnd;
    }
    // $ANTLR end "dis"



    // $ANTLR start "un"
    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:9:1: un returns [AFND afnd] : atom ( '+' | '*' | '?' )? ;
    public final AFND un() throws RecognitionException {
        AFND afnd = null;


        TlenParser.atom_return atom4 =null;


        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:10:3: ( atom ( '+' | '*' | '?' )? )
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:10:5: atom ( '+' | '*' | '?' )?
            {
            pushFollow(FOLLOW_atom_in_un77);
            atom4=atom();

            state._fsp--;


            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:10:9: ( '+' | '*' | '?' )?
            int alt2=4;
            switch ( input.LA(1) ) {
                case 7:
                    {
                    alt2=1;
                    }
                    break;
                case 6:
                    {
                    alt2=2;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:10:11: '+'
                    {
                    match(input,7,FOLLOW_7_in_un80); 

                    afnd = AFND.plusRepeat((atom4!=null?atom4.afnd:null));

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:11:10: '*'
                    {
                    match(input,6,FOLLOW_6_in_un94); 

                    afnd = AFND.repeat((atom4!=null?atom4.afnd:null));

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:12:10: '?'
                    {
                    match(input,19,FOLLOW_19_in_un108); 

                    afnd = AFND.optional((atom4!=null?atom4.afnd:null));

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return afnd;
    }
    // $ANTLR end "un"


    public static class atom_return extends ParserRuleReturnScope {
        public AFND afnd;
    };


    // $ANTLR start "atom"
    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:13:1: atom returns [AFND afnd] : ( ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '.' ) | '(' expr ')' );
    public final TlenParser.atom_return atom() throws RecognitionException {
        TlenParser.atom_return retval = new TlenParser.atom_return();
        retval.start = input.LT(1);


        AFND expr5 =null;


        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:14:3: ( ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '.' ) | '(' expr ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 8 && LA3_0 <= 18)||(LA3_0 >= 20 && LA3_0 <= 71)) ) {
                alt3=1;
            }
            else if ( (LA3_0==4) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:14:4: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '.' )
                    {
                    if ( (input.LA(1) >= 8 && input.LA(1) <= 18)||(input.LA(1) >= 20 && input.LA(1) <= 71) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    retval.afnd = AFND.simple(input.toString(retval.start,input.LT(-1)));

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\facultad\\teoria de lenguaje\\tp\\tp-tlen\\src\\Tlen.g:32:5: '(' expr ')'
                    {
                    match(input,4,FOLLOW_4_in_atom420); 

                    pushFollow(FOLLOW_expr_in_atom421);
                    expr5=expr();

                    state._fsp--;


                    match(input,5,FOLLOW_5_in_atom422); 

                    retval.afnd = expr5;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_s16 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_s18 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dis_in_expr31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_expr33 = new BitSet(new long[]{0xFFFFFFFFFFF7FF10L,0x00000000000000FFL});
    public static final BitSet FOLLOW_expr_in_expr39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_un_in_dis54 = new BitSet(new long[]{0xFFFFFFFFFFF7FF12L,0x00000000000000FFL});
    public static final BitSet FOLLOW_dis_in_dis60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_un77 = new BitSet(new long[]{0x00000000000800C2L});
    public static final BitSet FOLLOW_7_in_un80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_un94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_un108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_4_in_atom420 = new BitSet(new long[]{0xFFFFFFFFFFF7FF10L,0x00000000000000FFL});
    public static final BitSet FOLLOW_expr_in_atom421 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5_in_atom422 = new BitSet(new long[]{0x0000000000000002L});

}
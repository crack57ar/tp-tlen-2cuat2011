// $ANTLR 3.4 /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g 2011-12-06 23:13:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TlenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "' '", "'('", "')'", "'*'", "'+'", "'.'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'?'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'|'"
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
    public static final int T__73=73;

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
    public String getGrammarFileName() { return "/home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g"; }



    // $ANTLR start "s"
    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:3:1: s returns [AFND afnd] : expr EOF ;
    public final AFND s() throws RecognitionException {
        AFND afnd = null;


        AFND expr1 =null;


        try {
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:4:3: ( expr EOF )
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:4:3: expr EOF
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
    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:5:1: expr returns [AFND afnd] : dis ( '|' expr2= expr )? ;
    public final AFND expr() throws RecognitionException {
        AFND afnd = null;


        AFND expr2 =null;

        AFND dis2 =null;


        try {
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:6:3: ( dis ( '|' expr2= expr )? )
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:6:3: dis ( '|' expr2= expr )?
            {
            pushFollow(FOLLOW_dis_in_expr31);
            dis2=dis();

            state._fsp--;


            afnd = dis2;

            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:6:27: ( '|' expr2= expr )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==73) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:6:28: '|' expr2= expr
                    {
                    match(input,73,FOLLOW_73_in_expr36); 

                    pushFollow(FOLLOW_expr_in_expr42);
                    expr2=expr();

                    state._fsp--;


                    afnd = AFND.paralelize(dis2,expr2);

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
    // $ANTLR end "expr"



    // $ANTLR start "dis"
    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:7:1: dis returns [AFND afnd] : un (dis2= dis )? ;
    public final AFND dis() throws RecognitionException {
        AFND afnd = null;


        AFND dis2 =null;

        AFND un3 =null;


        try {
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:8:3: ( un (dis2= dis )? )
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:8:3: un (dis2= dis )?
            {
            pushFollow(FOLLOW_un_in_dis60);
            un3=un();

            state._fsp--;


            afnd = un3;

            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:8:24: (dis2= dis )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 4 && LA2_0 <= 5)||(LA2_0 >= 9 && LA2_0 <= 19)||(LA2_0 >= 21 && LA2_0 <= 72)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:8:25: dis2= dis
                    {
                    pushFollow(FOLLOW_dis_in_dis68);
                    dis2=dis();

                    state._fsp--;


                    afnd = AFND.serialize(un3,dis2);

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
    // $ANTLR end "dis"



    // $ANTLR start "un"
    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:9:1: un returns [AFND afnd] : atom ( '+' | '*' | '?' )? ;
    public final AFND un() throws RecognitionException {
        AFND afnd = null;


        TlenParser.atom_return atom4 =null;


        try {
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:10:3: ( atom ( '+' | '*' | '?' )? )
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:10:5: atom ( '+' | '*' | '?' )?
            {
            pushFollow(FOLLOW_atom_in_un86);
            atom4=atom();

            state._fsp--;


            afnd = (atom4!=null?atom4.afnd:null);

            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:11:4: ( '+' | '*' | '?' )?
            int alt3=4;
            switch ( input.LA(1) ) {
                case 8:
                    {
                    alt3=1;
                    }
                    break;
                case 7:
                    {
                    alt3=2;
                    }
                    break;
                case 20:
                    {
                    alt3=3;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:11:6: '+'
                    {
                    match(input,8,FOLLOW_8_in_un95); 

                    afnd = AFND.plusRepeat((atom4!=null?atom4.afnd:null));

                    }
                    break;
                case 2 :
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:12:5: '*'
                    {
                    match(input,7,FOLLOW_7_in_un104); 

                    afnd = AFND.repeat((atom4!=null?atom4.afnd:null));

                    }
                    break;
                case 3 :
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:13:5: '?'
                    {
                    match(input,20,FOLLOW_20_in_un113); 

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
    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:14:1: atom returns [AFND afnd] : ( ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | ' ' ) | '.' | '(' expr ')' );
    public final TlenParser.atom_return atom() throws RecognitionException {
        TlenParser.atom_return retval = new TlenParser.atom_return();
        retval.start = input.LT(1);


        AFND expr5 =null;


        try {
            // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:15:3: ( ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | ' ' ) | '.' | '(' expr ')' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
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
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt4=1;
                }
                break;
            case 9:
                {
                alt4=2;
                }
                break;
            case 5:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:15:4: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | ' ' )
                    {
                    if ( input.LA(1)==4||(input.LA(1) >= 10 && input.LA(1) <= 19)||(input.LA(1) >= 21 && input.LA(1) <= 72) ) {
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
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:32:5: '.'
                    {
                    match(input,9,FOLLOW_9_in_atom422); 

                    retval.afnd = AFND.any();

                    }
                    break;
                case 3 :
                    // /home/miguel/workspace/tp-tlen-2cuat2011/tp-tlen/src/Tlen.g:33:5: '(' expr ')'
                    {
                    match(input,5,FOLLOW_5_in_atom429); 

                    pushFollow(FOLLOW_expr_in_atom430);
                    expr5=expr();

                    state._fsp--;


                    match(input,6,FOLLOW_6_in_atom431); 

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
    public static final BitSet FOLLOW_dis_in_expr31 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_expr36 = new BitSet(new long[]{0xFFFFFFFFFFEFFE30L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expr_in_expr42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_un_in_dis60 = new BitSet(new long[]{0xFFFFFFFFFFEFFE32L,0x00000000000001FFL});
    public static final BitSet FOLLOW_dis_in_dis68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_un86 = new BitSet(new long[]{0x0000000000100182L});
    public static final BitSet FOLLOW_8_in_un95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_un104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_un113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_atom422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_5_in_atom429 = new BitSet(new long[]{0xFFFFFFFFFFEFFE30L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expr_in_atom430 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_atom431 = new BitSet(new long[]{0x0000000000000002L});

}
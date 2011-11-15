package uba.tlen.regex.antlr;

// $ANTLR 3.4 C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g 2011-11-15 12:53:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TlenParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g"; }


    public static class s_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "s"
    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:8:1: s : expr EOF !;
    public final TlenParser.s_return s() throws RecognitionException {
        TlenParser.s_return retval = new TlenParser.s_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        TlenParser.expr_return expr1 =null;


        CommonTree EOF2_tree=null;

        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:8:3: ( expr EOF !)
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:8:5: expr EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_s34);
            expr1=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_s36); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "s"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:9:1: expr : dis ( '|' ^ dis )* ;
    public final TlenParser.expr_return expr() throws RecognitionException {
        TlenParser.expr_return retval = new TlenParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;
        TlenParser.dis_return dis3 =null;

        TlenParser.dis_return dis5 =null;


        CommonTree char_literal4_tree=null;

        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:9:6: ( dis ( '|' ^ dis )* )
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:9:8: dis ( '|' ^ dis )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_dis_in_expr44);
            dis3=dis();

            state._fsp--;

            adaptor.addChild(root_0, dis3.getTree());

            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:9:11: ( '|' ^ dis )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==72) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:9:12: '|' ^ dis
            	    {
            	    char_literal4=(Token)match(input,72,FOLLOW_72_in_expr46); 
            	    char_literal4_tree = 
            	    (CommonTree)adaptor.create(char_literal4)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal4_tree, root_0);


            	    pushFollow(FOLLOW_dis_in_expr49);
            	    dis5=dis();

            	    state._fsp--;

            	    adaptor.addChild(root_0, dis5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class dis_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dis"
    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:10:1: dis : un ^ ( dis )? ;
    public final TlenParser.dis_return dis() throws RecognitionException {
        TlenParser.dis_return retval = new TlenParser.dis_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        TlenParser.un_return un6 =null;

        TlenParser.dis_return dis7 =null;



        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:10:5: ( un ^ ( dis )? )
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:10:7: un ^ ( dis )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_un_in_dis58);
            un6=un();

            state._fsp--;

            root_0 = (CommonTree)adaptor.becomeRoot(un6.getTree(), root_0);

            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:10:11: ( dis )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==4||(LA2_0 >= 8 && LA2_0 <= 18)||(LA2_0 >= 20 && LA2_0 <= 71)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:10:11: dis
                    {
                    pushFollow(FOLLOW_dis_in_dis61);
                    dis7=dis();

                    state._fsp--;

                    adaptor.addChild(root_0, dis7.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dis"


    public static class un_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "un"
    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:11:1: un : atom ( '+' ^| '*' ^| '?' ^)? ;
    public final TlenParser.un_return un() throws RecognitionException {
        TlenParser.un_return retval = new TlenParser.un_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        TlenParser.atom_return atom8 =null;


        CommonTree char_literal9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:11:5: ( atom ( '+' ^| '*' ^| '?' ^)? )
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:11:7: atom ( '+' ^| '*' ^| '?' ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_un70);
            atom8=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom8.getTree());

            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:11:11: ( '+' ^| '*' ^| '?' ^)?
            int alt3=4;
            switch ( input.LA(1) ) {
                case 7:
                    {
                    alt3=1;
                    }
                    break;
                case 6:
                    {
                    alt3=2;
                    }
                    break;
                case 19:
                    {
                    alt3=3;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:11:12: '+' ^
                    {
                    char_literal9=(Token)match(input,7,FOLLOW_7_in_un72); 
                    char_literal9_tree = 
                    (CommonTree)adaptor.create(char_literal9)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal9_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:11:17: '*' ^
                    {
                    char_literal10=(Token)match(input,6,FOLLOW_6_in_un75); 
                    char_literal10_tree = 
                    (CommonTree)adaptor.create(char_literal10)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal10_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:11:22: '?' ^
                    {
                    char_literal11=(Token)match(input,19,FOLLOW_19_in_un78); 
                    char_literal11_tree = 
                    (CommonTree)adaptor.create(char_literal11)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "un"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:12:1: atom : ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '.' | '(' expr ')' );
    public final TlenParser.atom_return atom() throws RecognitionException {
        TlenParser.atom_return retval = new TlenParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal12=null;
        Token char_literal13=null;
        Token char_literal14=null;
        Token char_literal15=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token char_literal32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        Token char_literal46=null;
        Token char_literal47=null;
        Token char_literal48=null;
        Token char_literal49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal62=null;
        Token char_literal63=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal72=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        TlenParser.expr_return expr76 =null;


        CommonTree char_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree char_literal77_tree=null;

        try {
            // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:12:6: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '.' | '(' expr ')' )
            int alt4=64;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt4=1;
                }
                break;
            case 47:
                {
                alt4=2;
                }
                break;
            case 48:
                {
                alt4=3;
                }
                break;
            case 49:
                {
                alt4=4;
                }
                break;
            case 50:
                {
                alt4=5;
                }
                break;
            case 51:
                {
                alt4=6;
                }
                break;
            case 52:
                {
                alt4=7;
                }
                break;
            case 53:
                {
                alt4=8;
                }
                break;
            case 54:
                {
                alt4=9;
                }
                break;
            case 55:
                {
                alt4=10;
                }
                break;
            case 56:
                {
                alt4=11;
                }
                break;
            case 57:
                {
                alt4=12;
                }
                break;
            case 58:
                {
                alt4=13;
                }
                break;
            case 59:
                {
                alt4=14;
                }
                break;
            case 60:
                {
                alt4=15;
                }
                break;
            case 61:
                {
                alt4=16;
                }
                break;
            case 62:
                {
                alt4=17;
                }
                break;
            case 63:
                {
                alt4=18;
                }
                break;
            case 64:
                {
                alt4=19;
                }
                break;
            case 65:
                {
                alt4=20;
                }
                break;
            case 66:
                {
                alt4=21;
                }
                break;
            case 67:
                {
                alt4=22;
                }
                break;
            case 68:
                {
                alt4=23;
                }
                break;
            case 69:
                {
                alt4=24;
                }
                break;
            case 70:
                {
                alt4=25;
                }
                break;
            case 71:
                {
                alt4=26;
                }
                break;
            case 20:
                {
                alt4=27;
                }
                break;
            case 21:
                {
                alt4=28;
                }
                break;
            case 22:
                {
                alt4=29;
                }
                break;
            case 23:
                {
                alt4=30;
                }
                break;
            case 24:
                {
                alt4=31;
                }
                break;
            case 25:
                {
                alt4=32;
                }
                break;
            case 26:
                {
                alt4=33;
                }
                break;
            case 27:
                {
                alt4=34;
                }
                break;
            case 28:
                {
                alt4=35;
                }
                break;
            case 29:
                {
                alt4=36;
                }
                break;
            case 30:
                {
                alt4=37;
                }
                break;
            case 31:
                {
                alt4=38;
                }
                break;
            case 32:
                {
                alt4=39;
                }
                break;
            case 33:
                {
                alt4=40;
                }
                break;
            case 34:
                {
                alt4=41;
                }
                break;
            case 35:
                {
                alt4=42;
                }
                break;
            case 36:
                {
                alt4=43;
                }
                break;
            case 37:
                {
                alt4=44;
                }
                break;
            case 38:
                {
                alt4=45;
                }
                break;
            case 39:
                {
                alt4=46;
                }
                break;
            case 40:
                {
                alt4=47;
                }
                break;
            case 41:
                {
                alt4=48;
                }
                break;
            case 42:
                {
                alt4=49;
                }
                break;
            case 43:
                {
                alt4=50;
                }
                break;
            case 44:
                {
                alt4=51;
                }
                break;
            case 45:
                {
                alt4=52;
                }
                break;
            case 9:
                {
                alt4=53;
                }
                break;
            case 10:
                {
                alt4=54;
                }
                break;
            case 11:
                {
                alt4=55;
                }
                break;
            case 12:
                {
                alt4=56;
                }
                break;
            case 13:
                {
                alt4=57;
                }
                break;
            case 14:
                {
                alt4=58;
                }
                break;
            case 15:
                {
                alt4=59;
                }
                break;
            case 16:
                {
                alt4=60;
                }
                break;
            case 17:
                {
                alt4=61;
                }
                break;
            case 18:
                {
                alt4=62;
                }
                break;
            case 8:
                {
                alt4=63;
                }
                break;
            case 4:
                {
                alt4=64;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:12:8: 'a'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal12=(Token)match(input,46,FOLLOW_46_in_atom88); 
                    char_literal12_tree = 
                    (CommonTree)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:12:14: 'b'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal13=(Token)match(input,47,FOLLOW_47_in_atom92); 
                    char_literal13_tree = 
                    (CommonTree)adaptor.create(char_literal13)
                    ;
                    adaptor.addChild(root_0, char_literal13_tree);


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:12:20: 'c'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal14=(Token)match(input,48,FOLLOW_48_in_atom96); 
                    char_literal14_tree = 
                    (CommonTree)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:12:26: 'd'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal15=(Token)match(input,49,FOLLOW_49_in_atom100); 
                    char_literal15_tree = 
                    (CommonTree)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:13:3: 'e'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal16=(Token)match(input,50,FOLLOW_50_in_atom106); 
                    char_literal16_tree = 
                    (CommonTree)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:13:9: 'f'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal17=(Token)match(input,51,FOLLOW_51_in_atom110); 
                    char_literal17_tree = 
                    (CommonTree)adaptor.create(char_literal17)
                    ;
                    adaptor.addChild(root_0, char_literal17_tree);


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:13:15: 'g'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal18=(Token)match(input,52,FOLLOW_52_in_atom114); 
                    char_literal18_tree = 
                    (CommonTree)adaptor.create(char_literal18)
                    ;
                    adaptor.addChild(root_0, char_literal18_tree);


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:13:21: 'h'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal19=(Token)match(input,53,FOLLOW_53_in_atom118); 
                    char_literal19_tree = 
                    (CommonTree)adaptor.create(char_literal19)
                    ;
                    adaptor.addChild(root_0, char_literal19_tree);


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:14:3: 'i'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal20=(Token)match(input,54,FOLLOW_54_in_atom124); 
                    char_literal20_tree = 
                    (CommonTree)adaptor.create(char_literal20)
                    ;
                    adaptor.addChild(root_0, char_literal20_tree);


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:14:9: 'j'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal21=(Token)match(input,55,FOLLOW_55_in_atom128); 
                    char_literal21_tree = 
                    (CommonTree)adaptor.create(char_literal21)
                    ;
                    adaptor.addChild(root_0, char_literal21_tree);


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:14:15: 'k'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal22=(Token)match(input,56,FOLLOW_56_in_atom132); 
                    char_literal22_tree = 
                    (CommonTree)adaptor.create(char_literal22)
                    ;
                    adaptor.addChild(root_0, char_literal22_tree);


                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:14:21: 'l'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal23=(Token)match(input,57,FOLLOW_57_in_atom136); 
                    char_literal23_tree = 
                    (CommonTree)adaptor.create(char_literal23)
                    ;
                    adaptor.addChild(root_0, char_literal23_tree);


                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:15:3: 'm'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal24=(Token)match(input,58,FOLLOW_58_in_atom142); 
                    char_literal24_tree = 
                    (CommonTree)adaptor.create(char_literal24)
                    ;
                    adaptor.addChild(root_0, char_literal24_tree);


                    }
                    break;
                case 14 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:15:9: 'n'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal25=(Token)match(input,59,FOLLOW_59_in_atom146); 
                    char_literal25_tree = 
                    (CommonTree)adaptor.create(char_literal25)
                    ;
                    adaptor.addChild(root_0, char_literal25_tree);


                    }
                    break;
                case 15 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:15:15: 'o'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal26=(Token)match(input,60,FOLLOW_60_in_atom150); 
                    char_literal26_tree = 
                    (CommonTree)adaptor.create(char_literal26)
                    ;
                    adaptor.addChild(root_0, char_literal26_tree);


                    }
                    break;
                case 16 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:15:21: 'p'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal27=(Token)match(input,61,FOLLOW_61_in_atom154); 
                    char_literal27_tree = 
                    (CommonTree)adaptor.create(char_literal27)
                    ;
                    adaptor.addChild(root_0, char_literal27_tree);


                    }
                    break;
                case 17 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:16:3: 'q'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal28=(Token)match(input,62,FOLLOW_62_in_atom160); 
                    char_literal28_tree = 
                    (CommonTree)adaptor.create(char_literal28)
                    ;
                    adaptor.addChild(root_0, char_literal28_tree);


                    }
                    break;
                case 18 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:16:9: 'r'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal29=(Token)match(input,63,FOLLOW_63_in_atom164); 
                    char_literal29_tree = 
                    (CommonTree)adaptor.create(char_literal29)
                    ;
                    adaptor.addChild(root_0, char_literal29_tree);


                    }
                    break;
                case 19 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:16:15: 's'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal30=(Token)match(input,64,FOLLOW_64_in_atom168); 
                    char_literal30_tree = 
                    (CommonTree)adaptor.create(char_literal30)
                    ;
                    adaptor.addChild(root_0, char_literal30_tree);


                    }
                    break;
                case 20 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:16:21: 't'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal31=(Token)match(input,65,FOLLOW_65_in_atom172); 
                    char_literal31_tree = 
                    (CommonTree)adaptor.create(char_literal31)
                    ;
                    adaptor.addChild(root_0, char_literal31_tree);


                    }
                    break;
                case 21 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:17:3: 'u'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal32=(Token)match(input,66,FOLLOW_66_in_atom178); 
                    char_literal32_tree = 
                    (CommonTree)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);


                    }
                    break;
                case 22 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:17:9: 'v'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal33=(Token)match(input,67,FOLLOW_67_in_atom182); 
                    char_literal33_tree = 
                    (CommonTree)adaptor.create(char_literal33)
                    ;
                    adaptor.addChild(root_0, char_literal33_tree);


                    }
                    break;
                case 23 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:17:15: 'w'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal34=(Token)match(input,68,FOLLOW_68_in_atom186); 
                    char_literal34_tree = 
                    (CommonTree)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 24 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:17:21: 'x'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal35=(Token)match(input,69,FOLLOW_69_in_atom190); 
                    char_literal35_tree = 
                    (CommonTree)adaptor.create(char_literal35)
                    ;
                    adaptor.addChild(root_0, char_literal35_tree);


                    }
                    break;
                case 25 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:18:3: 'y'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal36=(Token)match(input,70,FOLLOW_70_in_atom196); 
                    char_literal36_tree = 
                    (CommonTree)adaptor.create(char_literal36)
                    ;
                    adaptor.addChild(root_0, char_literal36_tree);


                    }
                    break;
                case 26 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:18:9: 'z'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal37=(Token)match(input,71,FOLLOW_71_in_atom200); 
                    char_literal37_tree = 
                    (CommonTree)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);


                    }
                    break;
                case 27 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:19:3: 'A'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal38=(Token)match(input,20,FOLLOW_20_in_atom207); 
                    char_literal38_tree = 
                    (CommonTree)adaptor.create(char_literal38)
                    ;
                    adaptor.addChild(root_0, char_literal38_tree);


                    }
                    break;
                case 28 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:19:9: 'B'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal39=(Token)match(input,21,FOLLOW_21_in_atom211); 
                    char_literal39_tree = 
                    (CommonTree)adaptor.create(char_literal39)
                    ;
                    adaptor.addChild(root_0, char_literal39_tree);


                    }
                    break;
                case 29 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:19:15: 'C'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal40=(Token)match(input,22,FOLLOW_22_in_atom215); 
                    char_literal40_tree = 
                    (CommonTree)adaptor.create(char_literal40)
                    ;
                    adaptor.addChild(root_0, char_literal40_tree);


                    }
                    break;
                case 30 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:19:21: 'D'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal41=(Token)match(input,23,FOLLOW_23_in_atom219); 
                    char_literal41_tree = 
                    (CommonTree)adaptor.create(char_literal41)
                    ;
                    adaptor.addChild(root_0, char_literal41_tree);


                    }
                    break;
                case 31 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:20:3: 'E'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal42=(Token)match(input,24,FOLLOW_24_in_atom225); 
                    char_literal42_tree = 
                    (CommonTree)adaptor.create(char_literal42)
                    ;
                    adaptor.addChild(root_0, char_literal42_tree);


                    }
                    break;
                case 32 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:20:9: 'F'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal43=(Token)match(input,25,FOLLOW_25_in_atom229); 
                    char_literal43_tree = 
                    (CommonTree)adaptor.create(char_literal43)
                    ;
                    adaptor.addChild(root_0, char_literal43_tree);


                    }
                    break;
                case 33 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:20:15: 'G'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal44=(Token)match(input,26,FOLLOW_26_in_atom233); 
                    char_literal44_tree = 
                    (CommonTree)adaptor.create(char_literal44)
                    ;
                    adaptor.addChild(root_0, char_literal44_tree);


                    }
                    break;
                case 34 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:20:21: 'H'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal45=(Token)match(input,27,FOLLOW_27_in_atom237); 
                    char_literal45_tree = 
                    (CommonTree)adaptor.create(char_literal45)
                    ;
                    adaptor.addChild(root_0, char_literal45_tree);


                    }
                    break;
                case 35 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:21:3: 'I'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal46=(Token)match(input,28,FOLLOW_28_in_atom243); 
                    char_literal46_tree = 
                    (CommonTree)adaptor.create(char_literal46)
                    ;
                    adaptor.addChild(root_0, char_literal46_tree);


                    }
                    break;
                case 36 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:21:9: 'J'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal47=(Token)match(input,29,FOLLOW_29_in_atom247); 
                    char_literal47_tree = 
                    (CommonTree)adaptor.create(char_literal47)
                    ;
                    adaptor.addChild(root_0, char_literal47_tree);


                    }
                    break;
                case 37 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:21:15: 'K'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal48=(Token)match(input,30,FOLLOW_30_in_atom251); 
                    char_literal48_tree = 
                    (CommonTree)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);


                    }
                    break;
                case 38 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:21:21: 'L'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal49=(Token)match(input,31,FOLLOW_31_in_atom255); 
                    char_literal49_tree = 
                    (CommonTree)adaptor.create(char_literal49)
                    ;
                    adaptor.addChild(root_0, char_literal49_tree);


                    }
                    break;
                case 39 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:22:3: 'M'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal50=(Token)match(input,32,FOLLOW_32_in_atom261); 
                    char_literal50_tree = 
                    (CommonTree)adaptor.create(char_literal50)
                    ;
                    adaptor.addChild(root_0, char_literal50_tree);


                    }
                    break;
                case 40 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:22:9: 'N'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal51=(Token)match(input,33,FOLLOW_33_in_atom265); 
                    char_literal51_tree = 
                    (CommonTree)adaptor.create(char_literal51)
                    ;
                    adaptor.addChild(root_0, char_literal51_tree);


                    }
                    break;
                case 41 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:22:15: 'O'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal52=(Token)match(input,34,FOLLOW_34_in_atom269); 
                    char_literal52_tree = 
                    (CommonTree)adaptor.create(char_literal52)
                    ;
                    adaptor.addChild(root_0, char_literal52_tree);


                    }
                    break;
                case 42 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:22:21: 'P'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal53=(Token)match(input,35,FOLLOW_35_in_atom273); 
                    char_literal53_tree = 
                    (CommonTree)adaptor.create(char_literal53)
                    ;
                    adaptor.addChild(root_0, char_literal53_tree);


                    }
                    break;
                case 43 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:23:3: 'Q'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal54=(Token)match(input,36,FOLLOW_36_in_atom279); 
                    char_literal54_tree = 
                    (CommonTree)adaptor.create(char_literal54)
                    ;
                    adaptor.addChild(root_0, char_literal54_tree);


                    }
                    break;
                case 44 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:23:9: 'R'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal55=(Token)match(input,37,FOLLOW_37_in_atom283); 
                    char_literal55_tree = 
                    (CommonTree)adaptor.create(char_literal55)
                    ;
                    adaptor.addChild(root_0, char_literal55_tree);


                    }
                    break;
                case 45 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:23:15: 'S'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal56=(Token)match(input,38,FOLLOW_38_in_atom287); 
                    char_literal56_tree = 
                    (CommonTree)adaptor.create(char_literal56)
                    ;
                    adaptor.addChild(root_0, char_literal56_tree);


                    }
                    break;
                case 46 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:23:21: 'T'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal57=(Token)match(input,39,FOLLOW_39_in_atom291); 
                    char_literal57_tree = 
                    (CommonTree)adaptor.create(char_literal57)
                    ;
                    adaptor.addChild(root_0, char_literal57_tree);


                    }
                    break;
                case 47 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:24:3: 'U'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal58=(Token)match(input,40,FOLLOW_40_in_atom297); 
                    char_literal58_tree = 
                    (CommonTree)adaptor.create(char_literal58)
                    ;
                    adaptor.addChild(root_0, char_literal58_tree);


                    }
                    break;
                case 48 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:24:9: 'V'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal59=(Token)match(input,41,FOLLOW_41_in_atom301); 
                    char_literal59_tree = 
                    (CommonTree)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);


                    }
                    break;
                case 49 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:24:15: 'W'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal60=(Token)match(input,42,FOLLOW_42_in_atom305); 
                    char_literal60_tree = 
                    (CommonTree)adaptor.create(char_literal60)
                    ;
                    adaptor.addChild(root_0, char_literal60_tree);


                    }
                    break;
                case 50 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:24:21: 'X'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal61=(Token)match(input,43,FOLLOW_43_in_atom309); 
                    char_literal61_tree = 
                    (CommonTree)adaptor.create(char_literal61)
                    ;
                    adaptor.addChild(root_0, char_literal61_tree);


                    }
                    break;
                case 51 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:25:3: 'Y'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal62=(Token)match(input,44,FOLLOW_44_in_atom315); 
                    char_literal62_tree = 
                    (CommonTree)adaptor.create(char_literal62)
                    ;
                    adaptor.addChild(root_0, char_literal62_tree);


                    }
                    break;
                case 52 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:25:9: 'Z'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal63=(Token)match(input,45,FOLLOW_45_in_atom319); 
                    char_literal63_tree = 
                    (CommonTree)adaptor.create(char_literal63)
                    ;
                    adaptor.addChild(root_0, char_literal63_tree);


                    }
                    break;
                case 53 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:26:3: '0'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal64=(Token)match(input,9,FOLLOW_9_in_atom325); 
                    char_literal64_tree = 
                    (CommonTree)adaptor.create(char_literal64)
                    ;
                    adaptor.addChild(root_0, char_literal64_tree);


                    }
                    break;
                case 54 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:26:9: '1'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal65=(Token)match(input,10,FOLLOW_10_in_atom329); 
                    char_literal65_tree = 
                    (CommonTree)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);


                    }
                    break;
                case 55 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:26:15: '2'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal66=(Token)match(input,11,FOLLOW_11_in_atom333); 
                    char_literal66_tree = 
                    (CommonTree)adaptor.create(char_literal66)
                    ;
                    adaptor.addChild(root_0, char_literal66_tree);


                    }
                    break;
                case 56 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:26:21: '3'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal67=(Token)match(input,12,FOLLOW_12_in_atom337); 
                    char_literal67_tree = 
                    (CommonTree)adaptor.create(char_literal67)
                    ;
                    adaptor.addChild(root_0, char_literal67_tree);


                    }
                    break;
                case 57 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:27:3: '4'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal68=(Token)match(input,13,FOLLOW_13_in_atom343); 
                    char_literal68_tree = 
                    (CommonTree)adaptor.create(char_literal68)
                    ;
                    adaptor.addChild(root_0, char_literal68_tree);


                    }
                    break;
                case 58 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:27:9: '5'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal69=(Token)match(input,14,FOLLOW_14_in_atom347); 
                    char_literal69_tree = 
                    (CommonTree)adaptor.create(char_literal69)
                    ;
                    adaptor.addChild(root_0, char_literal69_tree);


                    }
                    break;
                case 59 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:27:15: '6'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal70=(Token)match(input,15,FOLLOW_15_in_atom351); 
                    char_literal70_tree = 
                    (CommonTree)adaptor.create(char_literal70)
                    ;
                    adaptor.addChild(root_0, char_literal70_tree);


                    }
                    break;
                case 60 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:27:21: '7'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal71=(Token)match(input,16,FOLLOW_16_in_atom355); 
                    char_literal71_tree = 
                    (CommonTree)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);


                    }
                    break;
                case 61 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:28:3: '8'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal72=(Token)match(input,17,FOLLOW_17_in_atom361); 
                    char_literal72_tree = 
                    (CommonTree)adaptor.create(char_literal72)
                    ;
                    adaptor.addChild(root_0, char_literal72_tree);


                    }
                    break;
                case 62 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:28:9: '9'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal73=(Token)match(input,18,FOLLOW_18_in_atom365); 
                    char_literal73_tree = 
                    (CommonTree)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);


                    }
                    break;
                case 63 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:28:15: '.'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal74=(Token)match(input,8,FOLLOW_8_in_atom369); 
                    char_literal74_tree = 
                    (CommonTree)adaptor.create(char_literal74)
                    ;
                    adaptor.addChild(root_0, char_literal74_tree);


                    }
                    break;
                case 64 :
                    // C:\\Documents and Settings\\psm\\Mis documentos\\tlen.g:28:21: '(' expr ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal75=(Token)match(input,4,FOLLOW_4_in_atom373); 
                    char_literal75_tree = 
                    (CommonTree)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);


                    pushFollow(FOLLOW_expr_in_atom374);
                    expr76=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr76.getTree());

                    char_literal77=(Token)match(input,5,FOLLOW_5_in_atom375); 
                    char_literal77_tree = 
                    (CommonTree)adaptor.create(char_literal77)
                    ;
                    adaptor.addChild(root_0, char_literal77_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_s34 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_s36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dis_in_expr44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_expr46 = new BitSet(new long[]{0xFFFFFFFFFFF7FF10L,0x00000000000000FFL});
    public static final BitSet FOLLOW_dis_in_expr49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_un_in_dis58 = new BitSet(new long[]{0xFFFFFFFFFFF7FF12L,0x00000000000000FFL});
    public static final BitSet FOLLOW_dis_in_dis61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_un70 = new BitSet(new long[]{0x00000000000800C2L});
    public static final BitSet FOLLOW_7_in_un72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_un75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_un78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_atom88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_atom92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_atom96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_atom100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_atom106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_atom110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_atom114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_atom124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atom128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_atom132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_atom136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_atom142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_atom146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_atom150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_atom154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_atom160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_atom164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_atom168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_atom178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_atom182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_atom186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_atom190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_atom196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_atom200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_atom207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_atom211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_atom215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_atom219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_atom225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_atom229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_atom233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_atom237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_atom243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_atom247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_atom251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_atom255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_atom265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_atom269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_atom273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_atom279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_atom283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_atom287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_atom291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_atom297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_atom301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_atom305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_atom309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_atom315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_atom319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_atom325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atom329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_atom333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_atom337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atom343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_atom347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atom351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_atom355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_atom361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_atom365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_4_in_atom373 = new BitSet(new long[]{0xFFFFFFFFFFF7FF10L,0x00000000000000FFL});
    public static final BitSet FOLLOW_expr_in_atom374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5_in_atom375 = new BitSet(new long[]{0x0000000000000002L});

}
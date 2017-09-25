// $ANTLR 3.2 Sep 23, 2009 12:02:23 Npl.g 2017-09-25 20:18:17

import java.util.HashMap;
import java.lang.Math;
import java.math.MathContext;
import java.math.BigDecimal;
import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class NplParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "LET", "VAR", "SUM", "AVG", "BD", "TRIG", "PRINT", "WS", "'begin'", "'end'", "'='", "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int PRINT=11;
    public static final int BD=9;
    public static final int VAR=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int WS=12;
    public static final int EOF=-1;
    public static final int NEWLINE=4;
    public static final int SUM=7;
    public static final int AVG=8;
    public static final int T__22=22;
    public static final int LET=5;
    public static final int TRIG=10;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public NplParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public NplParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return NplParser.tokenNames; }
    public String getGrammarFileName() { return "Npl.g"; }


    public static HashMap<String,Object> memory = new HashMap<String,Object>();
    public static void main(String[] args) throws Exception {	
    	    NplLexer lexer = new NplLexer(new ANTLRFileStream(args[0]));
    		CommonTokenStream tokens = new CommonTokenStream(lexer);
    		NplParser parser = new NplParser(tokens);
    		parser.prog();
    	//write : 'write' |'WRITE' | 'Write' ;
    	//write : write VAR
        // {System.out.println($VAR.text);}
    	// ;
    		}
    		


    // $ANTLR start "prog"
    // Npl.g:26:1: prog : 'begin' ( stat )+ 'end' ;
    public final void prog() throws RecognitionException {
        try {
            // Npl.g:26:5: ( 'begin' ( stat )+ 'end' )
            // Npl.g:26:7: 'begin' ( stat )+ 'end'
            {
            match(input,13,FOLLOW_13_in_prog29); 
            // Npl.g:26:15: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NEWLINE && LA1_0<=PRINT)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Npl.g:26:15: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog31);
            	    stat();

            	    state._fsp--;


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

            match(input,14,FOLLOW_14_in_prog34); 

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
    // $ANTLR end "prog"


    // $ANTLR start "stat"
    // Npl.g:28:1: stat : ( exp | letExp NEWLINE | printExp NEWLINE | sumExp NEWLINE | avgExp NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        NplParser.exp_return exp1 = null;

        NplParser.sumExp_return sumExp2 = null;


        try {
            // Npl.g:28:5: ( exp | letExp NEWLINE | printExp NEWLINE | sumExp NEWLINE | avgExp NEWLINE | NEWLINE )
            int alt2=6;
            switch ( input.LA(1) ) {
            case VAR:
            case BD:
            case TRIG:
            case 16:
                {
                alt2=1;
                }
                break;
            case LET:
                {
                alt2=2;
                }
                break;
            case PRINT:
                {
                alt2=3;
                }
                break;
            case SUM:
                {
                alt2=4;
                }
                break;
            case AVG:
                {
                alt2=5;
                }
                break;
            case NEWLINE:
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
                    // Npl.g:28:9: exp
                    {
                    pushFollow(FOLLOW_exp_in_stat44);
                    exp1=exp();

                    state._fsp--;

                    System.out.println((exp1!=null?exp1.value:null));

                    }
                    break;
                case 2 :
                    // Npl.g:29:9: letExp NEWLINE
                    {
                    pushFollow(FOLLOW_letExp_in_stat56);
                    letExp();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat58); 

                    }
                    break;
                case 3 :
                    // Npl.g:30:9: printExp NEWLINE
                    {
                    pushFollow(FOLLOW_printExp_in_stat68);
                    printExp();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat70); 

                    }
                    break;
                case 4 :
                    // Npl.g:31:9: sumExp NEWLINE
                    {
                    pushFollow(FOLLOW_sumExp_in_stat80);
                    sumExp2=sumExp();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat82); 
                    System.out.println((sumExp2!=null?sumExp2.value:null));

                    }
                    break;
                case 5 :
                    // Npl.g:32:9: avgExp NEWLINE
                    {
                    pushFollow(FOLLOW_avgExp_in_stat94);
                    avgExp();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat96); 
                    System.out.println(memory.get("Avg"));

                    }
                    break;
                case 6 :
                    // Npl.g:33:9: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat108); 

                    }
                    break;

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
    // $ANTLR end "stat"


    // $ANTLR start "letExp"
    // Npl.g:36:1: letExp : LET VAR '=' exp ;
    public final void letExp() throws RecognitionException {
        Token VAR3=null;
        NplParser.exp_return exp4 = null;


        try {
            // Npl.g:36:8: ( LET VAR '=' exp )
            // Npl.g:36:10: LET VAR '=' exp
            {
            match(input,LET,FOLLOW_LET_in_letExp121); 
            VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_letExp123); 
            match(input,15,FOLLOW_15_in_letExp125); 
            pushFollow(FOLLOW_exp_in_letExp127);
            exp4=exp();

            state._fsp--;

            memory.put((VAR3!=null?VAR3.getText():null), (exp4!=null?exp4.value:null));
            	System.out.println((VAR3!=null?VAR3.getText():null) + " is set to " + (exp4!=null?exp4.value:null));

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
    // $ANTLR end "letExp"

    public static class sumExp_return extends ParserRuleReturnScope {
        public BigDecimal value;
    };

    // $ANTLR start "sumExp"
    // Npl.g:42:1: sumExp returns [BigDecimal value] : SUM '(' listExp ')' ;
    public final NplParser.sumExp_return sumExp() throws RecognitionException {
        NplParser.sumExp_return retval = new NplParser.sumExp_return();
        retval.start = input.LT(1);

        BigDecimal listExp5 = null;


        try {
            // Npl.g:43:5: ( SUM '(' listExp ')' )
            // Npl.g:43:9: SUM '(' listExp ')'
            {
            match(input,SUM,FOLLOW_SUM_in_sumExp155); 
            match(input,16,FOLLOW_16_in_sumExp157); 
            pushFollow(FOLLOW_listExp_in_sumExp159);
            listExp5=listExp();

            state._fsp--;

            match(input,17,FOLLOW_17_in_sumExp161); 
            retval.value = listExp5;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sumExp"


    // $ANTLR start "listExp"
    // Npl.g:47:1: listExp returns [BigDecimal value] : a= exp ( ',' b= listExp | ) ;
    public final BigDecimal listExp() throws RecognitionException {
        BigDecimal value = null;

        NplParser.exp_return a = null;

        BigDecimal b = null;


        try {
            // Npl.g:48:5: (a= exp ( ',' b= listExp | ) )
            // Npl.g:48:9: a= exp ( ',' b= listExp | )
            {
            pushFollow(FOLLOW_exp_in_listExp190);
            a=exp();

            state._fsp--;

            value = (a!=null?a.value:null);
            // Npl.g:49:9: ( ',' b= listExp | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Npl.g:49:10: ',' b= listExp
                    {
                    match(input,18,FOLLOW_18_in_listExp203); 
                    pushFollow(FOLLOW_listExp_in_listExp207);
                    b=listExp();

                    state._fsp--;

                    value = value.add(b);

                    }
                    break;
                case 2 :
                    // Npl.g:51:2: 
                    {
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
        }
        return value;
    }
    // $ANTLR end "listExp"

    public static class avgExp_return extends ParserRuleReturnScope {
        public double value;
    };

    // $ANTLR start "avgExp"
    // Npl.g:54:1: avgExp returns [double value] : AVG '(' avgNpl ')' ;
    public final NplParser.avgExp_return avgExp() throws RecognitionException {
        NplParser.avgExp_return retval = new NplParser.avgExp_return();
        retval.start = input.LT(1);

        BigDecimal avgNpl6 = null;



        int counter = 0;
        memory.put("Counter",counter);

        try {
            // Npl.g:59:5: ( AVG '(' avgNpl ')' )
            // Npl.g:59:9: AVG '(' avgNpl ')'
            {
            match(input,AVG,FOLLOW_AVG_in_avgExp242); 
            match(input,16,FOLLOW_16_in_avgExp244); 
            pushFollow(FOLLOW_avgNpl_in_avgExp246);
            avgNpl6=avgNpl();

            state._fsp--;

            match(input,17,FOLLOW_17_in_avgExp248); 
            MathContext mc = new MathContext(15);
            	double dbl3 = Double.parseDouble(avgNpl6.toPlainString());
            	int int1 = (Integer)memory.get("Counter");
            	dbl3 = dbl3/int1;
            	memory.put("Avg",dbl3);

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "avgExp"


    // $ANTLR start "avgNpl"
    // Npl.g:66:1: avgNpl returns [BigDecimal value] : a= exp ( ',' b= avgNpl | ) ;
    public final BigDecimal avgNpl() throws RecognitionException {
        BigDecimal value = null;

        NplParser.exp_return a = null;

        BigDecimal b = null;


        try {
            // Npl.g:67:5: (a= exp ( ',' b= avgNpl | ) )
            // Npl.g:67:9: a= exp ( ',' b= avgNpl | )
            {
            pushFollow(FOLLOW_exp_in_avgNpl275);
            a=exp();

            state._fsp--;

            value = (a!=null?a.value:null);
            	int counter = (Integer)memory.get("Counter");
            	counter++;
            	memory.put("Counter",counter);
            // Npl.g:71:2: ( ',' b= avgNpl | )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Npl.g:71:3: ',' b= avgNpl
                    {
                    match(input,18,FOLLOW_18_in_avgNpl281); 
                    pushFollow(FOLLOW_avgNpl_in_avgNpl285);
                    b=avgNpl();

                    state._fsp--;

                    value = value.add(b);

                    }
                    break;
                case 2 :
                    // Npl.g:73:2: 
                    {
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
        }
        return value;
    }
    // $ANTLR end "avgNpl"

    public static class exp_return extends ParserRuleReturnScope {
        public BigDecimal value;
    };

    // $ANTLR start "exp"
    // Npl.g:76:1: exp returns [BigDecimal value] : a= multExp ( '+' b= multExp | '-' b= multExp )* ;
    public final NplParser.exp_return exp() throws RecognitionException {
        NplParser.exp_return retval = new NplParser.exp_return();
        retval.start = input.LT(1);

        BigDecimal a = null;

        BigDecimal b = null;


        try {
            // Npl.g:77:5: (a= multExp ( '+' b= multExp | '-' b= multExp )* )
            // Npl.g:77:9: a= multExp ( '+' b= multExp | '-' b= multExp )*
            {
            pushFollow(FOLLOW_multExp_in_exp318);
            a=multExp();

            state._fsp--;

            retval.value = a;
            // Npl.g:78:9: ( '+' b= multExp | '-' b= multExp )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }
                else if ( (LA5_0==20) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // Npl.g:78:13: '+' b= multExp
            	    {
            	    match(input,19,FOLLOW_19_in_exp334); 
            	    pushFollow(FOLLOW_multExp_in_exp338);
            	    b=multExp();

            	    state._fsp--;

            	    retval.value = retval.value.add(b);

            	    }
            	    break;
            	case 2 :
            	    // Npl.g:79:13: '-' b= multExp
            	    {
            	    match(input,20,FOLLOW_20_in_exp354); 
            	    pushFollow(FOLLOW_multExp_in_exp358);
            	    b=multExp();

            	    state._fsp--;

            	    retval.value = retval.value.subtract(b);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exp"


    // $ANTLR start "multExp"
    // Npl.g:83:1: multExp returns [BigDecimal value] : a= atom ( '*' b= atom | '/' b= atom )* ;
    public final BigDecimal multExp() throws RecognitionException {
        BigDecimal value = null;

        BigDecimal a = null;

        BigDecimal b = null;


        try {
            // Npl.g:84:5: (a= atom ( '*' b= atom | '/' b= atom )* )
            // Npl.g:84:9: a= atom ( '*' b= atom | '/' b= atom )*
            {
            pushFollow(FOLLOW_atom_in_multExp396);
            a=atom();

            state._fsp--;

            value = a;
            // Npl.g:85:2: ( '*' b= atom | '/' b= atom )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }
                else if ( (LA6_0==22) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // Npl.g:85:7: '*' b= atom
            	    {
            	    match(input,21,FOLLOW_21_in_multExp406); 
            	    pushFollow(FOLLOW_atom_in_multExp410);
            	    b=atom();

            	    state._fsp--;

            	    value = value.multiply(b);

            	    }
            	    break;
            	case 2 :
            	    // Npl.g:86:7: '/' b= atom
            	    {
            	    match(input,22,FOLLOW_22_in_multExp420); 
            	    pushFollow(FOLLOW_atom_in_multExp424);
            	    b=atom();

            	    state._fsp--;

            	    MathContext mc = new MathContext(15);
            	    		 double dbl1 = Double.parseDouble(value.toPlainString());
            	    		 double dbl2 = Double.parseDouble(b.toPlainString());
            	    		 dbl1 = dbl1/dbl2;
            	    		 value = new BigDecimal(dbl1,mc);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "multExp"


    // $ANTLR start "atom"
    // Npl.g:94:1: atom returns [BigDecimal value] : ( BD | VAR | TRIG '(' exp ')' | '(' exp ')' );
    public final BigDecimal atom() throws RecognitionException {
        BigDecimal value = null;

        Token BD7=null;
        Token VAR8=null;
        Token TRIG9=null;
        NplParser.exp_return exp10 = null;

        NplParser.exp_return exp11 = null;


        try {
            // Npl.g:95:5: ( BD | VAR | TRIG '(' exp ')' | '(' exp ')' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case BD:
                {
                alt7=1;
                }
                break;
            case VAR:
                {
                alt7=2;
                }
                break;
            case TRIG:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // Npl.g:95:9: BD
                    {
                    BD7=(Token)match(input,BD,FOLLOW_BD_in_atom453); 
                    value = new BigDecimal((BD7!=null?BD7.getText():null));

                    }
                    break;
                case 2 :
                    // Npl.g:96:9: VAR
                    {
                    VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_atom465); 

                    	BigDecimal v = (BigDecimal)memory.get((VAR8!=null?VAR8.getText():null));
                            if ( v!=null ) value = v;
                            else System.err.println((VAR8!=null?VAR8.getText():null));
                            

                    }
                    break;
                case 3 :
                    // Npl.g:102:9: TRIG '(' exp ')'
                    {
                    TRIG9=(Token)match(input,TRIG,FOLLOW_TRIG_in_atom479); 
                    match(input,16,FOLLOW_16_in_atom481); 
                    pushFollow(FOLLOW_exp_in_atom483);
                    exp10=exp();

                    state._fsp--;

                    match(input,17,FOLLOW_17_in_atom485); 

                    	MathContext mc = new MathContext(15);
                    	if((TRIG9!=null?TRIG9.getText():null).equals("sin") ) {
                    		double dbl = Math.sin(Double.parseDouble((exp10!=null?exp10.value:null).toPlainString()));
                    		value = new BigDecimal(dbl,mc);}
                    	if((TRIG9!=null?TRIG9.getText():null).equals("cos") ) {
                    		double dbl = Math.cos(Double.parseDouble((exp10!=null?exp10.value:null).toPlainString()));
                    		value = new BigDecimal(dbl,mc);}
                    	if((TRIG9!=null?TRIG9.getText():null).equals("tan") ) {
                    		double dbl = Math.tan(Double.parseDouble((exp10!=null?exp10.value:null).toPlainString()));
                    		value = new BigDecimal(dbl,mc);}
                    	

                    }
                    break;
                case 4 :
                    // Npl.g:114:9: '(' exp ')'
                    {
                    match(input,16,FOLLOW_16_in_atom497); 
                    pushFollow(FOLLOW_exp_in_atom499);
                    exp11=exp();

                    state._fsp--;

                    match(input,17,FOLLOW_17_in_atom501); 
                    value = (exp11!=null?exp11.value:null);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "atom"


    // $ANTLR start "printExp"
    // Npl.g:117:1: printExp : PRINT ( exp | avgExp | sumExp ) ;
    public final void printExp() throws RecognitionException {
        NplParser.exp_return exp12 = null;

        NplParser.avgExp_return avgExp13 = null;

        NplParser.sumExp_return sumExp14 = null;


        try {
            // Npl.g:117:10: ( PRINT ( exp | avgExp | sumExp ) )
            // Npl.g:117:12: PRINT ( exp | avgExp | sumExp )
            {
            match(input,PRINT,FOLLOW_PRINT_in_printExp516); 
            // Npl.g:118:2: ( exp | avgExp | sumExp )
            int alt8=3;
            switch ( input.LA(1) ) {
            case VAR:
            case BD:
            case TRIG:
            case 16:
                {
                alt8=1;
                }
                break;
            case AVG:
                {
                alt8=2;
                }
                break;
            case SUM:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // Npl.g:118:7: exp
                    {
                    pushFollow(FOLLOW_exp_in_printExp524);
                    exp12=exp();

                    state._fsp--;

                    System.out.println((exp12!=null?input.toString(exp12.start,exp12.stop):null));

                    }
                    break;
                case 2 :
                    // Npl.g:119:7: avgExp
                    {
                    pushFollow(FOLLOW_avgExp_in_printExp534);
                    avgExp13=avgExp();

                    state._fsp--;

                    System.out.println((avgExp13!=null?input.toString(avgExp13.start,avgExp13.stop):null));

                    }
                    break;
                case 3 :
                    // Npl.g:120:7: sumExp
                    {
                    pushFollow(FOLLOW_sumExp_in_printExp544);
                    sumExp14=sumExp();

                    state._fsp--;

                    System.out.println((sumExp14!=null?input.toString(sumExp14.start,sumExp14.stop):null));

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
        }
        return ;
    }
    // $ANTLR end "printExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_13_in_prog29 = new BitSet(new long[]{0x0000000000010FF0L});
    public static final BitSet FOLLOW_stat_in_prog31 = new BitSet(new long[]{0x0000000000014FF0L});
    public static final BitSet FOLLOW_14_in_prog34 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_stat44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letExp_in_stat56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_stat58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printExp_in_stat68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_stat70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sumExp_in_stat80 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_stat82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_avgExp_in_stat94 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_stat96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letExp121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VAR_in_letExp123 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_letExp125 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_exp_in_letExp127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUM_in_sumExp155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_sumExp157 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_listExp_in_sumExp159 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_sumExp161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_listExp190 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_listExp203 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_listExp_in_listExp207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVG_in_avgExp242 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_avgExp244 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_avgNpl_in_avgExp246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_avgExp248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_avgNpl275 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_avgNpl281 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_avgNpl_in_avgNpl285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExp_in_exp318 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_exp334 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_multExp_in_exp338 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_20_in_exp354 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_multExp_in_exp358 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_atom_in_multExp396 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_multExp406 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_atom_in_multExp410 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_22_in_multExp420 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_atom_in_multExp424 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_BD_in_atom453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_atom465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIG_in_atom479 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom481 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_exp_in_atom483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_atom485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_atom497 = new BitSet(new long[]{0x0000000000010640L});
    public static final BitSet FOLLOW_exp_in_atom499 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_atom501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printExp516 = new BitSet(new long[]{0x00000000000107C0L});
    public static final BitSet FOLLOW_exp_in_printExp524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_avgExp_in_printExp534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sumExp_in_printExp544 = new BitSet(new long[]{0x0000000000000002L});

}
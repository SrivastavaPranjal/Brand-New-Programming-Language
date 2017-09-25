// $ANTLR 3.2 Sep 23, 2009 12:02:23 Npl.g 2017-09-25 20:18:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class NplLexer extends Lexer {
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

    public NplLexer() {;} 
    public NplLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public NplLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Npl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:3:7: ( 'begin' )
            // Npl.g:3:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:4:7: ( 'end' )
            // Npl.g:4:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:5:7: ( '=' )
            // Npl.g:5:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:6:7: ( '(' )
            // Npl.g:6:9: '('
            {
            match('('); 

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
            // Npl.g:7:7: ( ')' )
            // Npl.g:7:9: ')'
            {
            match(')'); 

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
            // Npl.g:8:7: ( ',' )
            // Npl.g:8:9: ','
            {
            match(','); 

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
            // Npl.g:9:7: ( '+' )
            // Npl.g:9:9: '+'
            {
            match('+'); 

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
            // Npl.g:10:7: ( '-' )
            // Npl.g:10:9: '-'
            {
            match('-'); 

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
            // Npl.g:11:7: ( '*' )
            // Npl.g:11:9: '*'
            {
            match('*'); 

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
            // Npl.g:12:7: ( '/' )
            // Npl.g:12:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:128:5: ( 'let' | 'LET' | 'Let' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='l') ) {
                alt1=1;
            }
            else if ( (LA1_0=='L') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='E') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='e') ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // Npl.g:128:9: 'let'
                    {
                    match("let"); 


                    }
                    break;
                case 2 :
                    // Npl.g:128:15: 'LET'
                    {
                    match("LET"); 


                    }
                    break;
                case 3 :
                    // Npl.g:128:21: 'Let'
                    {
                    match("Let"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:129:7: ( 'print' | 'PRINT' | 'Print' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='p') ) {
                alt2=1;
            }
            else if ( (LA2_0=='P') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='R') ) {
                    alt2=2;
                }
                else if ( (LA2_2=='r') ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

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
                    // Npl.g:129:9: 'print'
                    {
                    match("print"); 


                    }
                    break;
                case 2 :
                    // Npl.g:129:17: 'PRINT'
                    {
                    match("PRINT"); 


                    }
                    break;
                case 3 :
                    // Npl.g:129:25: 'Print'
                    {
                    match("Print"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "TRIG"
    public final void mTRIG() throws RecognitionException {
        try {
            int _type = TRIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:131:6: ( 'sin' | 'cos' | 'tan' | 'SIN' | 'COS' | 'TAN' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt3=1;
                }
                break;
            case 'c':
                {
                alt3=2;
                }
                break;
            case 't':
                {
                alt3=3;
                }
                break;
            case 'S':
                {
                alt3=4;
                }
                break;
            case 'C':
                {
                alt3=5;
                }
                break;
            case 'T':
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // Npl.g:131:9: 'sin'
                    {
                    match("sin"); 


                    }
                    break;
                case 2 :
                    // Npl.g:131:15: 'cos'
                    {
                    match("cos"); 


                    }
                    break;
                case 3 :
                    // Npl.g:131:21: 'tan'
                    {
                    match("tan"); 


                    }
                    break;
                case 4 :
                    // Npl.g:131:27: 'SIN'
                    {
                    match("SIN"); 


                    }
                    break;
                case 5 :
                    // Npl.g:131:33: 'COS'
                    {
                    match("COS"); 


                    }
                    break;
                case 6 :
                    // Npl.g:131:39: 'TAN'
                    {
                    match("TAN"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIG"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:132:5: ( 'sum' | 'SUM' | 'Sum' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='s') ) {
                alt4=1;
            }
            else if ( (LA4_0=='S') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='U') ) {
                    alt4=2;
                }
                else if ( (LA4_2=='u') ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Npl.g:132:9: 'sum'
                    {
                    match("sum"); 


                    }
                    break;
                case 2 :
                    // Npl.g:132:15: 'SUM'
                    {
                    match("SUM"); 


                    }
                    break;
                case 3 :
                    // Npl.g:132:21: 'Sum'
                    {
                    match("Sum"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:133:5: ( 'avg' | 'AVG' | 'Avg' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='a') ) {
                alt5=1;
            }
            else if ( (LA5_0=='A') ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='V') ) {
                    alt5=2;
                }
                else if ( (LA5_2=='v') ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Npl.g:133:9: 'avg'
                    {
                    match("avg"); 


                    }
                    break;
                case 2 :
                    // Npl.g:133:15: 'AVG'
                    {
                    match("AVG"); 


                    }
                    break;
                case 3 :
                    // Npl.g:133:21: 'Avg'
                    {
                    match("Avg"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:134:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // Npl.g:134:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Npl.g:134:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Npl.g:
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
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "BD"
    public final void mBD() throws RecognitionException {
        try {
            int _type = BD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:135:4: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // Npl.g:135:8: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // Npl.g:135:8: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Npl.g:135:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // Npl.g:135:20: ( '.' ( '0' .. '9' )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='.') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Npl.g:135:21: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // Npl.g:135:25: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Npl.g:135:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
    // $ANTLR end "BD"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:136:8: ( ( '\\r' )? '\\n' )
            // Npl.g:136:9: ( '\\r' )? '\\n'
            {
            // Npl.g:136:9: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Npl.g:136:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Npl.g:137:5: ( ( ' ' | '\\t' )+ )
            // Npl.g:137:9: ( ' ' | '\\t' )+
            {
            // Npl.g:137:9: ( ' ' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Npl.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Npl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | LET | PRINT | TRIG | SUM | AVG | VAR | BD | NEWLINE | WS )
        int alt12=19;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // Npl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // Npl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // Npl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // Npl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // Npl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // Npl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // Npl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // Npl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // Npl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // Npl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // Npl.g:1:70: LET
                {
                mLET(); 

                }
                break;
            case 12 :
                // Npl.g:1:74: PRINT
                {
                mPRINT(); 

                }
                break;
            case 13 :
                // Npl.g:1:80: TRIG
                {
                mTRIG(); 

                }
                break;
            case 14 :
                // Npl.g:1:85: SUM
                {
                mSUM(); 

                }
                break;
            case 15 :
                // Npl.g:1:89: AVG
                {
                mAVG(); 

                }
                break;
            case 16 :
                // Npl.g:1:93: VAR
                {
                mVAR(); 

                }
                break;
            case 17 :
                // Npl.g:1:97: BD
                {
                mBD(); 

                }
                break;
            case 18 :
                // Npl.g:1:100: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 19 :
                // Npl.g:1:108: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\27\10\uffff\14\27\4\uffff\25\27\1\104\3\105\3\27\1\111"+
        "\1\112\3\111\2\112\2\111\3\113\1\27\2\uffff\3\27\3\uffff\1\120\3"+
        "\121\2\uffff";
    static final String DFA12_eofS =
        "\122\uffff";
    static final String DFA12_minS =
        "\1\11\1\145\1\156\10\uffff\1\145\1\105\1\162\1\122\1\151\1\157"+
        "\1\141\1\111\1\117\1\101\1\166\1\126\4\uffff\1\147\1\144\1\164\1"+
        "\124\1\164\1\151\1\111\1\151\1\156\1\155\1\163\1\156\1\116\1\115"+
        "\1\155\1\123\1\116\1\147\1\107\1\147\1\151\4\60\1\156\1\116\1\156"+
        "\14\60\1\156\2\uffff\1\164\1\124\1\164\3\uffff\4\60\2\uffff";
    static final String DFA12_maxS =
        "\1\172\1\145\1\156\10\uffff\2\145\2\162\1\165\1\157\1\141\1\165"+
        "\1\117\1\101\2\166\4\uffff\1\147\1\144\1\164\1\124\1\164\1\151\1"+
        "\111\1\151\1\156\1\155\1\163\1\156\1\116\1\115\1\155\1\123\1\116"+
        "\1\147\1\107\1\147\1\151\4\172\1\156\1\116\1\156\14\172\1\156\2"+
        "\uffff\1\164\1\124\1\164\3\uffff\4\172\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\14\uffff\1\20\1\21"+
        "\1\22\1\23\51\uffff\1\2\1\13\3\uffff\1\15\1\16\1\17\4\uffff\1\1"+
        "\1\14";
    static final String DFA12_specialS =
        "\122\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\32\1\31\2\uffff\1\31\22\uffff\1\32\7\uffff\1\4\1\5\1\11"+
            "\1\7\1\6\1\10\1\uffff\1\12\12\30\3\uffff\1\3\3\uffff\1\26\1"+
            "\27\1\23\10\27\1\14\3\27\1\16\2\27\1\22\1\24\6\27\6\uffff\1"+
            "\25\1\1\1\20\1\27\1\2\6\27\1\13\3\27\1\15\2\27\1\17\1\21\6\27",
            "\1\33",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\36\37\uffff\1\37",
            "\1\40",
            "\1\41\37\uffff\1\42",
            "\1\43\13\uffff\1\44",
            "\1\45",
            "\1\46",
            "\1\47\13\uffff\1\50\37\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\37\uffff\1\56",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\114",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | LET | PRINT | TRIG | SUM | AVG | VAR | BD | NEWLINE | WS );";
        }
    }
 

}

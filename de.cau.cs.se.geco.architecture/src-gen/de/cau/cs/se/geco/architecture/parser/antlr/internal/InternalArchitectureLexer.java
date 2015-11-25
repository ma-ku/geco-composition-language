package de.cau.cs.se.geco.architecture.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArchitectureLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalArchitectureLexer() {;} 
    public InternalArchitectureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalArchitectureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:11:7: ( 'package' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:11:9: 'package'
            {
            match("package"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:12:7: ( 'import' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:12:9: 'import'
            {
            match("import"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:13:7: ( 'model' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:13:9: 'model'
            {
            match("model"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:14:7: ( ',' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:14:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:15:7: ( 'register' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:15:9: 'register'
            {
            match("register"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:16:7: ( 'text' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:16:9: 'text'
            {
            match("text"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:17:7: ( 'weave' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:17:9: 'weave'
            {
            match("weave"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:18:7: ( 'link' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:18:9: 'link'
            {
            match("link"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:19:7: ( '=>' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:19:9: '=>'
            {
            match("=>"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:20:7: ( ':' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:20:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:21:7: ( 'generate' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:21:9: 'generate'
            {
            match("generate"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:22:7: ( '(' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:22:9: '('
            {
            match('('); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:23:7: ( ')' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:23:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:24:7: ( 'source' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:24:9: 'source'
            {
            match("source"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:25:7: ( 'target' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:25:9: 'target'
            {
            match("target"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:26:7: ( 'trace' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:26:9: 'trace'
            {
            match("trace"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:27:7: ( 'out' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:27:9: 'out'
            {
            match("out"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:28:7: ( 'in' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:28:9: 'in'
            {
            match("in"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:29:7: ( '[' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:29:9: '['
            {
            match('['); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:30:7: ( ']' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:30:9: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:31:7: ( '/' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:31:9: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:32:7: ( 'null' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:32:9: 'null'
            {
            match("null"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:33:7: ( '[]' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:33:9: '[]'
            {
            match("[]"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:34:7: ( '!' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:34:9: '!'
            {
            match('!'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:35:7: ( 'typeof' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:35:9: 'typeof'
            {
            match("typeof"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:36:7: ( 'use' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:36:9: 'use'
            {
            match("use"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:37:7: ( '<' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:37:9: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:38:7: ( '>' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:38:9: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:39:7: ( '{' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:39:9: '{'
            {
            match('{'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:40:7: ( '}' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:40:9: '}'
            {
            match('}'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:41:7: ( '.' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:41:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:42:7: ( 'io' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:42:9: 'io'
            {
            match("io"); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:43:7: ( '&' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:43:9: '&'
            {
            match('&'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:44:7: ( '|' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:44:9: '|'
            {
            match('|'); 

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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:45:7: ( '==' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:45:9: '=='
            {
            match("=="); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:46:7: ( '!=' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:46:9: '!='
            {
            match("!="); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:47:7: ( '>=' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:47:9: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:48:7: ( '<=' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:48:9: '<='
            {
            match("<="); 


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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:49:7: ( '~' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:49:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2230:21: ( '0' .. '9' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2230:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:12: ( ( ( '-' )? ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( '-' )? ( RULE_DIGIT )+ 'f' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:14: ( ( '-' )? ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( '-' )? ( RULE_DIGIT )+ 'f' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:14: ( ( '-' )? ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( '-' )? ( RULE_DIGIT )+ 'f' )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:15: ( '-' )? ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:15: ( '-' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='-') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:20: ( RULE_DIGIT )+
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
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:20: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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

                    match('.'); 
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:36: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:36: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:49: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:59: ( '+' | '-' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='+'||LA4_0=='-') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:70: ( RULE_DIGIT )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:70: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

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
                            break;

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:84: ( 'f' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='f') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:84: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:89: ( '-' )? ( RULE_DIGIT )+ 'f'
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:89: ( '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:89: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:94: ( RULE_DIGIT )+
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
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2232:94: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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

                    match('f'); 

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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2234:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2234:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2234:16: ( 'true' | 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='t') ) {
                alt11=1;
            }
            else if ( (LA11_0=='f') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2234:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2234:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2236:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2236:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2236:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2236:11: '^'
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

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2236:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:
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
            	    break loop13;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2238:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2238:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2238:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2238:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2240:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2242:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2242:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2242:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2242:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2244:41: '\\r'
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2246:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2246:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2246:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2248:16: ( . )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2248:18: .
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
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=48;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:244: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:255: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:268: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:276: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:285: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:297: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:313: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:329: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1:337: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA10_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "2232:14: ( ( '-' )? ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( '-' )? ( RULE_DIGIT )+ 'f' )";
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\3\50\1\uffff\4\50\1\46\1\uffff\1\50\2\uffff\2\50\1\76\1\uffff\1\102\1\50\1\105\1\50\1\110\1\112\6\uffff\1\46\1\122\1\50\1\46\1\uffff\2\46\2\uffff\1\50\1\uffff\1\50\1\131\1\132\1\50\1\uffff\7\50\3\uffff\1\50\2\uffff\2\50\6\uffff\1\50\2\uffff\1\50\14\uffff\1\122\1\50\2\uffff\2\50\2\uffff\13\50\1\167\1\50\1\171\5\50\1\177\2\50\1\u0082\2\50\1\u0085\2\50\1\uffff\1\u0088\1\uffff\3\50\1\u008c\1\50\1\uffff\1\50\1\u008f\1\uffff\1\50\1\u0091\1\uffff\2\50\1\uffff\1\u0082\1\50\1\u0095\1\uffff\1\50\1\u0097\1\uffff\1\u0098\1\uffff\1\50\1\u009a\1\u009b\1\uffff\1\50\2\uffff\1\50\2\uffff\1\u009e\1\u009f\2\uffff";
    static final String DFA23_eofS =
        "\u00a0\uffff";
    static final String DFA23_minS =
        "\1\0\1\141\1\155\1\157\1\uffff\1\145\1\141\1\145\1\151\1\75\1\uffff\1\145\2\uffff\1\157\1\165\1\135\1\uffff\1\52\1\165\1\75\1\163\2\75\6\uffff\1\60\1\56\1\141\1\101\1\uffff\2\0\2\uffff\1\143\1\uffff\1\160\2\60\1\144\1\uffff\1\147\1\170\1\162\1\141\1\160\1\141\1\156\3\uffff\1\156\2\uffff\1\165\1\164\6\uffff\1\154\2\uffff\1\145\14\uffff\1\56\1\154\2\uffff\1\153\1\157\2\uffff\1\145\1\151\1\164\1\147\1\143\2\145\1\166\1\153\1\145\1\162\1\60\1\154\1\60\1\163\1\141\1\162\1\154\1\163\1\60\2\145\1\60\1\157\1\145\1\60\1\162\1\143\1\uffff\1\60\1\uffff\1\145\1\147\1\164\1\60\1\164\1\uffff\1\164\1\60\1\uffff\1\146\1\60\1\uffff\1\141\1\145\1\uffff\1\60\1\145\1\60\1\uffff\1\145\1\60\1\uffff\1\60\1\uffff\1\164\2\60\1\uffff\1\162\2\uffff\1\145\2\uffff\2\60\2\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\141\2\157\1\uffff\1\145\1\171\1\145\1\151\1\76\1\uffff\1\145\2\uffff\1\157\1\165\1\135\1\uffff\1\57\1\165\1\75\1\163\2\75\6\uffff\1\71\1\146\1\141\1\172\1\uffff\2\uffff\2\uffff\1\143\1\uffff\1\160\2\172\1\144\1\uffff\1\147\1\170\1\162\1\165\1\160\1\141\1\156\3\uffff\1\156\2\uffff\1\165\1\164\6\uffff\1\154\2\uffff\1\145\14\uffff\1\146\1\154\2\uffff\1\153\1\157\2\uffff\1\145\1\151\1\164\1\147\1\143\2\145\1\166\1\153\1\145\1\162\1\172\1\154\1\172\1\163\1\141\1\162\1\154\1\163\1\172\2\145\1\172\1\157\1\145\1\172\1\162\1\143\1\uffff\1\172\1\uffff\1\145\1\147\1\164\1\172\1\164\1\uffff\1\164\1\172\1\uffff\1\146\1\172\1\uffff\1\141\1\145\1\uffff\1\172\1\145\1\172\1\uffff\1\145\1\172\1\uffff\1\172\1\uffff\1\164\2\172\1\uffff\1\162\2\uffff\1\145\2\uffff\2\172\2\uffff";
    static final String DFA23_acceptS =
        "\4\uffff\1\4\5\uffff\1\12\1\uffff\1\14\1\15\3\uffff\1\24\6\uffff\1\35\1\36\1\37\1\41\1\42\1\47\4\uffff\1\52\2\uffff\1\57\1\60\1\uffff\1\52\4\uffff\1\4\7\uffff\1\11\1\43\1\12\1\uffff\1\14\1\15\2\uffff\1\27\1\23\1\24\1\55\1\56\1\25\1\uffff\1\44\1\30\1\uffff\1\46\1\33\1\45\1\34\1\35\1\36\1\37\1\41\1\42\1\47\1\50\1\53\2\uffff\1\54\1\57\2\uffff\1\22\1\40\34\uffff\1\21\1\uffff\1\32\5\uffff\1\6\2\uffff\1\51\2\uffff\1\10\2\uffff\1\26\3\uffff\1\3\2\uffff\1\20\1\uffff\1\7\3\uffff\1\2\1\uffff\1\17\1\31\1\uffff\1\16\1\1\2\uffff\1\5\1\13";
    static final String DFA23_specialS =
        "\1\0\42\uffff\1\2\1\1\173\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\24\1\43\3\46\1\33\1\44\1\14\1\15\2\46\1\4\1\36\1\32\1\22\12\37\1\12\1\46\1\26\1\11\1\27\2\46\32\42\1\20\1\46\1\21\1\41\1\42\1\46\5\42\1\40\1\13\1\42\1\2\2\42\1\10\1\3\1\23\1\17\1\1\1\42\1\5\1\16\1\6\1\25\1\42\1\7\3\42\1\30\1\34\1\31\1\35\uff81\46",
            "\1\47",
            "\1\51\1\52\1\53",
            "\1\54",
            "",
            "\1\56",
            "\1\60\3\uffff\1\57\14\uffff\1\61\6\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\66\1\65",
            "",
            "\1\70",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\1\100\4\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\106",
            "\1\107",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\121",
            "\1\121\1\uffff\12\123\54\uffff\1\121",
            "\1\124",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\125",
            "\0\125",
            "",
            "",
            "\1\127",
            "",
            "\1\130",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137\23\uffff\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\147",
            "",
            "",
            "\1\150",
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
            "\1\121\1\uffff\12\123\54\uffff\1\121",
            "\1\151",
            "",
            "",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\170",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0080",
            "\1\u0081",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0083",
            "\1\u0084",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0086",
            "\1\u0087",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008d",
            "",
            "\1\u008e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0090",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0094",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0096",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0099",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u009c",
            "",
            "",
            "\1\u009d",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='p') ) {s = 1;}

                        else if ( (LA23_0=='i') ) {s = 2;}

                        else if ( (LA23_0=='m') ) {s = 3;}

                        else if ( (LA23_0==',') ) {s = 4;}

                        else if ( (LA23_0=='r') ) {s = 5;}

                        else if ( (LA23_0=='t') ) {s = 6;}

                        else if ( (LA23_0=='w') ) {s = 7;}

                        else if ( (LA23_0=='l') ) {s = 8;}

                        else if ( (LA23_0=='=') ) {s = 9;}

                        else if ( (LA23_0==':') ) {s = 10;}

                        else if ( (LA23_0=='g') ) {s = 11;}

                        else if ( (LA23_0=='(') ) {s = 12;}

                        else if ( (LA23_0==')') ) {s = 13;}

                        else if ( (LA23_0=='s') ) {s = 14;}

                        else if ( (LA23_0=='o') ) {s = 15;}

                        else if ( (LA23_0=='[') ) {s = 16;}

                        else if ( (LA23_0==']') ) {s = 17;}

                        else if ( (LA23_0=='/') ) {s = 18;}

                        else if ( (LA23_0=='n') ) {s = 19;}

                        else if ( (LA23_0=='!') ) {s = 20;}

                        else if ( (LA23_0=='u') ) {s = 21;}

                        else if ( (LA23_0=='<') ) {s = 22;}

                        else if ( (LA23_0=='>') ) {s = 23;}

                        else if ( (LA23_0=='{') ) {s = 24;}

                        else if ( (LA23_0=='}') ) {s = 25;}

                        else if ( (LA23_0=='.') ) {s = 26;}

                        else if ( (LA23_0=='&') ) {s = 27;}

                        else if ( (LA23_0=='|') ) {s = 28;}

                        else if ( (LA23_0=='~') ) {s = 29;}

                        else if ( (LA23_0=='-') ) {s = 30;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 31;}

                        else if ( (LA23_0=='f') ) {s = 32;}

                        else if ( (LA23_0=='^') ) {s = 33;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='e')||LA23_0=='h'||(LA23_0>='j' && LA23_0<='k')||LA23_0=='q'||LA23_0=='v'||(LA23_0>='x' && LA23_0<='z')) ) {s = 34;}

                        else if ( (LA23_0=='\"') ) {s = 35;}

                        else if ( (LA23_0=='\'') ) {s = 36;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 37;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||(LA23_0>='#' && LA23_0<='%')||(LA23_0>='*' && LA23_0<='+')||LA23_0==';'||(LA23_0>='?' && LA23_0<='@')||LA23_0=='\\'||LA23_0=='`'||(LA23_0>='\u007F' && LA23_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_36 = input.LA(1);

                        s = -1;
                        if ( ((LA23_36>='\u0000' && LA23_36<='\uFFFF')) ) {s = 85;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_35 = input.LA(1);

                        s = -1;
                        if ( ((LA23_35>='\u0000' && LA23_35<='\uFFFF')) ) {s = 85;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
package de.cau.cs.se.geco.architecture.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.se.geco.architecture.services.ArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalArchitectureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'weave'", "'gen'", "'model'", "','", "'register'", "'text'", "'=>'", "':'", "'generate'", "'->'", "'<-'", "'/'", "'null'", "'*'", "'['", "']'", "'('", "')'", "'<'", "'>'", "'{'", "'}'", "'&'", "'|'", "'=='", "'!='", "'>='", "'<='", "'~'", "'.'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalArchitectureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArchitectureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArchitectureParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g"; }



     	private ArchitectureGrammarAccess grammarAccess;
     	
        public InternalArchitectureParser(TokenStream input, ArchitectureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ArchitectureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'import' ( (lv_imports_3_0= ruleImport ) )* ( (lv_registeredPackages_4_0= ruleRegisteredPackage ) )+ ( ( (lv_connections_5_0= ruleConnection ) ) | ( (lv_metamodels_6_0= ruleMetamodelSequence ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_registeredPackages_4_0 = null;

        EObject lv_connections_5_0 = null;

        EObject lv_metamodels_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'import' ( (lv_imports_3_0= ruleImport ) )* ( (lv_registeredPackages_4_0= ruleRegisteredPackage ) )+ ( ( (lv_connections_5_0= ruleConnection ) ) | ( (lv_metamodels_6_0= ruleMetamodelSequence ) ) )* ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'import' ( (lv_imports_3_0= ruleImport ) )* ( (lv_registeredPackages_4_0= ruleRegisteredPackage ) )+ ( ( (lv_connections_5_0= ruleConnection ) ) | ( (lv_metamodels_6_0= ruleMetamodelSequence ) ) )* )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'import' ( (lv_imports_3_0= ruleImport ) )* ( (lv_registeredPackages_4_0= ruleRegisteredPackage ) )+ ( ( (lv_connections_5_0= ruleConnection ) ) | ( (lv_metamodels_6_0= ruleMetamodelSequence ) ) )* )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'import' ( (lv_imports_3_0= ruleImport ) )* ( (lv_registeredPackages_4_0= ruleRegisteredPackage ) )+ ( ( (lv_connections_5_0= ruleConnection ) ) | ( (lv_metamodels_6_0= ruleMetamodelSequence ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleModel155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getImportKeyword_2());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:106:1: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:107:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:107:1: (lv_imports_3_0= ruleImport )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:108:3: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel176);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:124:3: ( (lv_registeredPackages_4_0= ruleRegisteredPackage ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:125:1: (lv_registeredPackages_4_0= ruleRegisteredPackage )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:125:1: (lv_registeredPackages_4_0= ruleRegisteredPackage )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:126:3: lv_registeredPackages_4_0= ruleRegisteredPackage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRegisteredPackage_in_ruleModel198);
            	    lv_registeredPackages_4_0=ruleRegisteredPackage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"registeredPackages",
            	              		lv_registeredPackages_4_0, 
            	              		"RegisteredPackage");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:142:3: ( ( (lv_connections_5_0= ruleConnection ) ) | ( (lv_metamodels_6_0= ruleMetamodelSequence ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==24) ) {
                    alt3=1;
                }
                else if ( (LA3_0==18) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:142:4: ( (lv_connections_5_0= ruleConnection ) )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:142:4: ( (lv_connections_5_0= ruleConnection ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:143:1: (lv_connections_5_0= ruleConnection )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:143:1: (lv_connections_5_0= ruleConnection )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:144:3: lv_connections_5_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getConnectionsConnectionParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConnection_in_ruleModel221);
            	    lv_connections_5_0=ruleConnection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"connections",
            	              		lv_connections_5_0, 
            	              		"Connection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:161:6: ( (lv_metamodels_6_0= ruleMetamodelSequence ) )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:161:6: ( (lv_metamodels_6_0= ruleMetamodelSequence ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:162:1: (lv_metamodels_6_0= ruleMetamodelSequence )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:162:1: (lv_metamodels_6_0= ruleMetamodelSequence )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:163:3: lv_metamodels_6_0= ruleMetamodelSequence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetamodelSequence_in_ruleModel248);
            	    lv_metamodels_6_0=ruleMetamodelSequence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"metamodels",
            	              		lv_metamodels_6_0, 
            	              		"MetamodelSequence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:187:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:188:2: (iv_ruleImport= ruleImport EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:189:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport286);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport296); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:196:1: ruleImport returns [EObject current=null] : (this_WeaverImport_0= ruleWeaverImport | this_GeneratorImport_1= ruleGeneratorImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_WeaverImport_0 = null;

        EObject this_GeneratorImport_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:199:28: ( (this_WeaverImport_0= ruleWeaverImport | this_GeneratorImport_1= ruleGeneratorImport ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:200:1: (this_WeaverImport_0= ruleWeaverImport | this_GeneratorImport_1= ruleGeneratorImport )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:200:1: (this_WeaverImport_0= ruleWeaverImport | this_GeneratorImport_1= ruleGeneratorImport )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:201:5: this_WeaverImport_0= ruleWeaverImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getWeaverImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWeaverImport_in_ruleImport343);
                    this_WeaverImport_0=ruleWeaverImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WeaverImport_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:211:5: this_GeneratorImport_1= ruleGeneratorImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportAccess().getGeneratorImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGeneratorImport_in_ruleImport370);
                    this_GeneratorImport_1=ruleGeneratorImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GeneratorImport_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleWeaverImport"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:227:1: entryRuleWeaverImport returns [EObject current=null] : iv_ruleWeaverImport= ruleWeaverImport EOF ;
    public final EObject entryRuleWeaverImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeaverImport = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:228:2: (iv_ruleWeaverImport= ruleWeaverImport EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:229:2: iv_ruleWeaverImport= ruleWeaverImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeaverImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeaverImport_in_entryRuleWeaverImport405);
            iv_ruleWeaverImport=ruleWeaverImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeaverImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeaverImport415); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeaverImport"


    // $ANTLR start "ruleWeaverImport"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:236:1: ruleWeaverImport returns [EObject current=null] : (otherlv_0= 'weave' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleWeaverImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:239:28: ( (otherlv_0= 'weave' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:240:1: (otherlv_0= 'weave' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:240:1: (otherlv_0= 'weave' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:240:3: otherlv_0= 'weave' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleWeaverImport452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWeaverImportAccess().getWeaveKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:244:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:245:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:245:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:246:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWeaverImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleWeaverImport473);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWeaverImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeaverImport"


    // $ANTLR start "entryRuleGeneratorImport"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:270:1: entryRuleGeneratorImport returns [EObject current=null] : iv_ruleGeneratorImport= ruleGeneratorImport EOF ;
    public final EObject entryRuleGeneratorImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorImport = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:271:2: (iv_ruleGeneratorImport= ruleGeneratorImport EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:272:2: iv_ruleGeneratorImport= ruleGeneratorImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorImportRule()); 
            }
            pushFollow(FOLLOW_ruleGeneratorImport_in_entryRuleGeneratorImport509);
            iv_ruleGeneratorImport=ruleGeneratorImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneratorImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneratorImport519); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneratorImport"


    // $ANTLR start "ruleGeneratorImport"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:279:1: ruleGeneratorImport returns [EObject current=null] : (otherlv_0= 'gen' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleGeneratorImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:282:28: ( (otherlv_0= 'gen' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:283:1: (otherlv_0= 'gen' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:283:1: (otherlv_0= 'gen' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:283:3: otherlv_0= 'gen' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleGeneratorImport556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneratorImportAccess().getGenKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:287:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:288:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:288:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:289:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneratorImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleGeneratorImport577);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeneratorImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneratorImport"


    // $ANTLR start "entryRuleMetamodelSequence"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:313:1: entryRuleMetamodelSequence returns [EObject current=null] : iv_ruleMetamodelSequence= ruleMetamodelSequence EOF ;
    public final EObject entryRuleMetamodelSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelSequence = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:314:2: (iv_ruleMetamodelSequence= ruleMetamodelSequence EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:315:2: iv_ruleMetamodelSequence= ruleMetamodelSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence613);
            iv_ruleMetamodelSequence=ruleMetamodelSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelSequence623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelSequence"


    // $ANTLR start "ruleMetamodelSequence"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:322:1: ruleMetamodelSequence returns [EObject current=null] : (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* ) ;
    public final EObject ruleMetamodelSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_metamodels_2_0 = null;

        EObject lv_metamodels_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:325:28: ( (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:326:1: (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:326:1: (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:326:3: otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMetamodelSequence660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMetamodelSequenceAccess().getModelKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:330:1: ( (lv_type_1_0= ruleModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:331:1: (lv_type_1_0= ruleModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:331:1: (lv_type_1_0= ruleModelNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:332:3: lv_type_1_0= ruleModelNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_ruleMetamodelSequence681);
            lv_type_1_0=ruleModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetamodelSequenceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"ModelNodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:348:2: ( (lv_metamodels_2_0= ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:349:1: (lv_metamodels_2_0= ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:349:1: (lv_metamodels_2_0= ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:350:3: lv_metamodels_2_0= ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMetamodel_in_ruleMetamodelSequence702);
            lv_metamodels_2_0=ruleMetamodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetamodelSequenceRule());
              	        }
                     		add(
                     			current, 
                     			"metamodels",
                      		lv_metamodels_2_0, 
                      		"Metamodel");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:366:2: (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:366:4: otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMetamodelSequence715); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMetamodelSequenceAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:370:1: ( (lv_metamodels_4_0= ruleMetamodel ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:371:1: (lv_metamodels_4_0= ruleMetamodel )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:371:1: (lv_metamodels_4_0= ruleMetamodel )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:372:3: lv_metamodels_4_0= ruleMetamodel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetamodel_in_ruleMetamodelSequence736);
            	    lv_metamodels_4_0=ruleMetamodel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMetamodelSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"metamodels",
            	              		lv_metamodels_4_0, 
            	              		"Metamodel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelSequence"


    // $ANTLR start "entryRuleMetamodel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:396:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:397:2: (iv_ruleMetamodel= ruleMetamodel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:398:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel774);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:405:1: ruleMetamodel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:408:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:409:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:409:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:410:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:410:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:411:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodel825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMetamodelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleRegisteredPackage"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:435:1: entryRuleRegisteredPackage returns [EObject current=null] : iv_ruleRegisteredPackage= ruleRegisteredPackage EOF ;
    public final EObject entryRuleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredPackage = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:436:2: (iv_ruleRegisteredPackage= ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:437:2: iv_ruleRegisteredPackage= ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage865);
            iv_ruleRegisteredPackage=ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisteredPackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage875); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegisteredPackage"


    // $ANTLR start "ruleRegisteredPackage"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:444:1: ruleRegisteredPackage returns [EObject current=null] : (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isText_3_0=null;
        Token lv_extension_4_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:447:28: ( (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:448:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:448:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:448:3: otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRegisteredPackage912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:453:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisteredPackage929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:470:2: ( ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:470:3: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:470:3: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:471:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:471:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:472:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleRegisteredPackage956);
                    lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRegisteredPackageRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_2_0, 
                              		"QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:489:6: ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:489:6: ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:489:7: ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:489:7: ( (lv_isText_3_0= 'text' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:490:1: (lv_isText_3_0= 'text' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:490:1: (lv_isText_3_0= 'text' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:491:3: lv_isText_3_0= 'text'
                    {
                    lv_isText_3_0=(Token)match(input,21,FOLLOW_21_in_ruleRegisteredPackage981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isText_3_0, grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
                      	        }
                             		setWithLastConsumed(current, "isText", true, "text");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:504:2: ( (lv_extension_4_0= RULE_STRING ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:505:1: (lv_extension_4_0= RULE_STRING )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:505:1: (lv_extension_4_0= RULE_STRING )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:506:3: lv_extension_4_0= RULE_STRING
                    {
                    lv_extension_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegisteredPackage1011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extension_4_0, grammarAccess.getRegisteredPackageAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extension",
                              		lv_extension_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegisteredPackage"


    // $ANTLR start "entryRuleConnection"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:530:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:531:2: (iv_ruleConnection= ruleConnection EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:532:2: iv_ruleConnection= ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection1054);
            iv_ruleConnection=ruleConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection1064); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:539:1: ruleConnection returns [EObject current=null] : (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        EObject this_Generator_0 = null;

        EObject this_Weaver_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:542:28: ( (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:543:1: (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:543:1: (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:544:5: this_Generator_0= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConnectionAccess().getGeneratorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_ruleConnection1111);
                    this_Generator_0=ruleGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Generator_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:554:5: this_Weaver_1= ruleWeaver
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConnectionAccess().getWeaverParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWeaver_in_ruleConnection1138);
                    this_Weaver_1=ruleWeaver();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Weaver_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleWeaver"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:570:1: entryRuleWeaver returns [EObject current=null] : iv_ruleWeaver= ruleWeaver EOF ;
    public final EObject entryRuleWeaver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeaver = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:571:2: (iv_ruleWeaver= ruleWeaver EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:572:2: iv_ruleWeaver= ruleWeaver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeaverRule()); 
            }
            pushFollow(FOLLOW_ruleWeaver_in_entryRuleWeaver1173);
            iv_ruleWeaver=ruleWeaver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeaver; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeaver1183); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeaver"


    // $ANTLR start "ruleWeaver"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:579:1: ruleWeaver returns [EObject current=null] : (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_aspectModel_3_0= ruleAspectModel ) ) (otherlv_4= '=>' ( (lv_targetModel_5_0= ruleTargetModelNodeType ) ) )? ) ;
    public final EObject ruleWeaver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_sourceModel_2_0 = null;

        EObject lv_aspectModel_3_0 = null;

        EObject lv_targetModel_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:582:28: ( (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_aspectModel_3_0= ruleAspectModel ) ) (otherlv_4= '=>' ( (lv_targetModel_5_0= ruleTargetModelNodeType ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:583:1: (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_aspectModel_3_0= ruleAspectModel ) ) (otherlv_4= '=>' ( (lv_targetModel_5_0= ruleTargetModelNodeType ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:583:1: (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_aspectModel_3_0= ruleAspectModel ) ) (otherlv_4= '=>' ( (lv_targetModel_5_0= ruleTargetModelNodeType ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:583:3: otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_aspectModel_3_0= ruleAspectModel ) ) (otherlv_4= '=>' ( (lv_targetModel_5_0= ruleTargetModelNodeType ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleWeaver1220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWeaverAccess().getWeaveKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:587:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:588:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:588:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:589:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getWeaverRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWeaver1240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getWeaverAccess().getWeaverWeaverImportCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:600:2: ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:601:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:601:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:602:3: lv_sourceModel_2_0= ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_ruleWeaver1261);
            lv_sourceModel_2_0=ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWeaverRule());
              	        }
                     		set(
                     			current, 
                     			"sourceModel",
                      		lv_sourceModel_2_0, 
                      		"SourceModelNodeSelector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:618:2: ( (lv_aspectModel_3_0= ruleAspectModel ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:619:1: (lv_aspectModel_3_0= ruleAspectModel )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:619:1: (lv_aspectModel_3_0= ruleAspectModel )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:620:3: lv_aspectModel_3_0= ruleAspectModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAspectModel_in_ruleWeaver1282);
            lv_aspectModel_3_0=ruleAspectModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWeaverRule());
              	        }
                     		set(
                     			current, 
                     			"aspectModel",
                      		lv_aspectModel_3_0, 
                      		"AspectModel");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:636:2: (otherlv_4= '=>' ( (lv_targetModel_5_0= ruleTargetModelNodeType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:636:4: otherlv_4= '=>' ( (lv_targetModel_5_0= ruleTargetModelNodeType ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleWeaver1295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:640:1: ( (lv_targetModel_5_0= ruleTargetModelNodeType ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:641:1: (lv_targetModel_5_0= ruleTargetModelNodeType )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:641:1: (lv_targetModel_5_0= ruleTargetModelNodeType )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:642:3: lv_targetModel_5_0= ruleTargetModelNodeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWeaverAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTargetModelNodeType_in_ruleWeaver1316);
                    lv_targetModel_5_0=ruleTargetModelNodeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWeaverRule());
                      	        }
                             		set(
                             			current, 
                             			"targetModel",
                              		lv_targetModel_5_0, 
                              		"TargetModelNodeType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeaver"


    // $ANTLR start "entryRuleAspectModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:666:1: entryRuleAspectModel returns [EObject current=null] : iv_ruleAspectModel= ruleAspectModel EOF ;
    public final EObject entryRuleAspectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspectModel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:667:2: (iv_ruleAspectModel= ruleAspectModel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:668:2: iv_ruleAspectModel= ruleAspectModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectModelRule()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_entryRuleAspectModel1354);
            iv_ruleAspectModel=ruleAspectModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspectModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectModel1364); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspectModel"


    // $ANTLR start "ruleAspectModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:675:1: ruleAspectModel returns [EObject current=null] : ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator ) ;
    public final EObject ruleAspectModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TargetModelNodeType_1 = null;

        EObject this_Generator_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:678:28: ( ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:679:1: ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:679:1: ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:679:2: (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:679:2: (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:679:4: otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAspectModel1402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAspectModelAccess().getColonKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAspectModelAccess().getTargetModelNodeTypeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTargetModelNodeType_in_ruleAspectModel1424);
                    this_TargetModelNodeType_1=ruleTargetModelNodeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TargetModelNodeType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:694:5: this_Generator_2= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAspectModelAccess().getGeneratorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_ruleAspectModel1452);
                    this_Generator_2=ruleGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Generator_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAspectModel"


    // $ANTLR start "entryRuleGenerator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:710:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:711:2: (iv_ruleGenerator= ruleGenerator EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:712:2: iv_ruleGenerator= ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleGenerator_in_entryRuleGenerator1487);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerator1497); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:719:1: ruleGenerator returns [EObject current=null] : (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_sourceModel_2_0 = null;

        EObject lv_targetModel_3_0 = null;

        EObject lv_writeTraceModel_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:722:28: ( (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:723:1: (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:723:1: (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:723:3: otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGenerator1534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneratorAccess().getGenerateKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:727:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:728:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:728:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:729:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGeneratorRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator1554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getGeneratorGeneratorImportCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:740:2: ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:741:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:741:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:742:3: lv_sourceModel_2_0= ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_ruleGenerator1575);
            lv_sourceModel_2_0=ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
              	        }
                     		set(
                     			current, 
                     			"sourceModel",
                      		lv_sourceModel_2_0, 
                      		"SourceModelNodeSelector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:758:2: ( (lv_targetModel_3_0= ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:759:1: (lv_targetModel_3_0= ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:759:1: (lv_targetModel_3_0= ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:760:3: lv_targetModel_3_0= ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_ruleGenerator1596);
            lv_targetModel_3_0=ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
              	        }
                     		set(
                     			current, 
                     			"targetModel",
                      		lv_targetModel_3_0, 
                      		"TargetModelNodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:776:2: (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:776:4: otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleGenerator1609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:780:1: ( (lv_writeTraceModel_5_0= ruleTraceModel ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:781:1: (lv_writeTraceModel_5_0= ruleTraceModel )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:781:1: (lv_writeTraceModel_5_0= ruleTraceModel )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:782:3: lv_writeTraceModel_5_0= ruleTraceModel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGeneratorAccess().getWriteTraceModelTraceModelParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTraceModel_in_ruleGenerator1630);
                    lv_writeTraceModel_5_0=ruleTraceModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
                      	        }
                             		set(
                             			current, 
                             			"writeTraceModel",
                              		lv_writeTraceModel_5_0, 
                              		"TraceModel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:798:4: (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:798:6: otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleGenerator1645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getGeneratorAccess().getLessThanSignHyphenMinusKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:802:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:803:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:803:1: (otherlv_7= RULE_ID )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:804:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratorRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator1665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:815:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:815:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleGenerator1678); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getGeneratorAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:819:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:820:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:820:1: (otherlv_9= RULE_ID )
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:821:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getGeneratorRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator1698); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleSourceModelNodeSelector"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:840:1: entryRuleSourceModelNodeSelector returns [EObject current=null] : iv_ruleSourceModelNodeSelector= ruleSourceModelNodeSelector EOF ;
    public final EObject entryRuleSourceModelNodeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceModelNodeSelector = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:841:2: (iv_ruleSourceModelNodeSelector= ruleSourceModelNodeSelector EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:842:2: iv_ruleSourceModelNodeSelector= ruleSourceModelNodeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceModelNodeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector1738);
            iv_ruleSourceModelNodeSelector=ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceModelNodeSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceModelNodeSelector1748); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceModelNodeSelector"


    // $ANTLR start "ruleSourceModelNodeSelector"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:849:1: ruleSourceModelNodeSelector returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ) | ( () otherlv_4= 'null' ) ) ;
    public final EObject ruleSourceModelNodeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_property_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:852:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ) | ( () otherlv_4= 'null' ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:853:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ) | ( () otherlv_4= 'null' ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:853:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ) | ( () otherlv_4= 'null' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:853:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:853:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:853:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )?
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:853:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:854:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:854:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:855:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSourceModelNodeSelectorRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSourceModelNodeSelector1794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:866:2: (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:866:4: otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) )
                            {
                            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSourceModelNodeSelector1807); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_1_0());
                                  
                            }
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:870:1: ( (lv_property_2_0= ruleNodeProperty ) )
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:871:1: (lv_property_2_0= ruleNodeProperty )
                            {
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:871:1: (lv_property_2_0= ruleNodeProperty )
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:872:3: lv_property_2_0= ruleNodeProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNodeProperty_in_ruleSourceModelNodeSelector1828);
                            lv_property_2_0=ruleNodeProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSourceModelNodeSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"property",
                                      		lv_property_2_0, 
                                      		"NodeProperty");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:889:6: ( () otherlv_4= 'null' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:889:6: ( () otherlv_4= 'null' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:889:7: () otherlv_4= 'null'
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:889:7: ()
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:890:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSourceModelNodeSelectorAccess().getSourceModelNodeSelectorAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSourceModelNodeSelector1859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSourceModelNodeSelectorAccess().getNullKeyword_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceModelNodeSelector"


    // $ANTLR start "entryRuleTargetModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:907:1: entryRuleTargetModelNodeType returns [EObject current=null] : iv_ruleTargetModelNodeType= ruleTargetModelNodeType EOF ;
    public final EObject entryRuleTargetModelNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModelNodeType = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:908:2: (iv_ruleTargetModelNodeType= ruleTargetModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:909:2: iv_ruleTargetModelNodeType= ruleTargetModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType1896);
            iv_ruleTargetModelNodeType=ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetModelNodeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetModelNodeType1906); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetModelNodeType"


    // $ANTLR start "ruleTargetModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:916:1: ruleTargetModelNodeType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( (lv_multiply_2_0= '*' ) )? ) ;
    public final EObject ruleTargetModelNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_multiply_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:919:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( (lv_multiply_2_0= '*' ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:920:1: ( () ( (otherlv_1= RULE_ID ) )? ( (lv_multiply_2_0= '*' ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:920:1: ( () ( (otherlv_1= RULE_ID ) )? ( (lv_multiply_2_0= '*' ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:920:2: () ( (otherlv_1= RULE_ID ) )? ( (lv_multiply_2_0= '*' ) )?
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:920:2: ()
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:921:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTargetModelNodeTypeAccess().getTargetModelNodeTypeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:926:2: ( (otherlv_1= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:927:1: (otherlv_1= RULE_ID )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:927:1: (otherlv_1= RULE_ID )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:928:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTargetModelNodeTypeRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTargetModelNodeType1960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:939:3: ( (lv_multiply_2_0= '*' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:940:1: (lv_multiply_2_0= '*' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:940:1: (lv_multiply_2_0= '*' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:941:3: lv_multiply_2_0= '*'
                    {
                    lv_multiply_2_0=(Token)match(input,29,FOLLOW_29_in_ruleTargetModelNodeType1979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multiply_2_0, grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAsteriskKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTargetModelNodeTypeRule());
                      	        }
                             		setWithLastConsumed(current, "multiply", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetModelNodeType"


    // $ANTLR start "entryRuleModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:962:1: entryRuleModelNodeType returns [EObject current=null] : iv_ruleModelNodeType= ruleModelNodeType EOF ;
    public final EObject entryRuleModelNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNodeType = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:963:2: (iv_ruleModelNodeType= ruleModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:964:2: iv_ruleModelNodeType= ruleModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType2029);
            iv_ruleModelNodeType=ruleModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelNodeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodeType2039); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelNodeType"


    // $ANTLR start "ruleModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:971:1: ruleModelNodeType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '/' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '/' ( (lv_property_4_0= ruleNodeProperty ) ) )? ) ;
    public final EObject ruleModelNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_property_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:974:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '/' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '/' ( (lv_property_4_0= ruleNodeProperty ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:975:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '/' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '/' ( (lv_property_4_0= ruleNodeProperty ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:975:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '/' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '/' ( (lv_property_4_0= ruleNodeProperty ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:975:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '/' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '/' ( (lv_property_4_0= ruleNodeProperty ) ) )?
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:975:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:976:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:976:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:977:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelNodeTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodeType2084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleModelNodeType2096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:992:1: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:993:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:993:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:994:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelNodeTypeRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodeType2116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getModelNodeTypeAccess().getTypeEClassCrossReference_2_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1005:2: (otherlv_3= '/' ( (lv_property_4_0= ruleNodeProperty ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1005:4: otherlv_3= '/' ( (lv_property_4_0= ruleNodeProperty ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleModelNodeType2129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1009:1: ( (lv_property_4_0= ruleNodeProperty ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1010:1: (lv_property_4_0= ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1010:1: (lv_property_4_0= ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1011:3: lv_property_4_0= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_ruleModelNodeType2150);
                    lv_property_4_0=ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelNodeTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"property",
                              		lv_property_4_0, 
                              		"NodeProperty");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelNodeType"


    // $ANTLR start "entryRuleNodeProperty"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1035:1: entryRuleNodeProperty returns [EObject current=null] : iv_ruleNodeProperty= ruleNodeProperty EOF ;
    public final EObject entryRuleNodeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeProperty = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1036:2: (iv_ruleNodeProperty= ruleNodeProperty EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1037:2: iv_ruleNodeProperty= ruleNodeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty2188);
            iv_ruleNodeProperty=ruleNodeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeProperty2198); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeProperty"


    // $ANTLR start "ruleNodeProperty"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:1: ruleNodeProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? ) ;
    public final EObject ruleNodeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_constraint_2_0 = null;

        EObject lv_subProperty_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1047:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1048:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1048:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1048:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )?
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1048:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1049:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1049:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1050:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodePropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeProperty2243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNodePropertyAccess().getPropertyEReferenceCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1061:2: (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1061:4: otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleNodeProperty2256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1065:1: ( (lv_constraint_2_0= ruleConstraintExpression ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1066:1: (lv_constraint_2_0= ruleConstraintExpression )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1066:1: (lv_constraint_2_0= ruleConstraintExpression )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1067:3: lv_constraint_2_0= ruleConstraintExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstraintExpression_in_ruleNodeProperty2277);
                    lv_constraint_2_0=ruleConstraintExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodePropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_2_0, 
                              		"ConstraintExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleNodeProperty2289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1087:3: (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1087:5: otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleNodeProperty2304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1091:1: ( (lv_subProperty_5_0= ruleNodeProperty ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1092:1: (lv_subProperty_5_0= ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1092:1: (lv_subProperty_5_0= ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1093:3: lv_subProperty_5_0= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_ruleNodeProperty2325);
                    lv_subProperty_5_0=ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodePropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"subProperty",
                              		lv_subProperty_5_0, 
                              		"NodeProperty");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeProperty"


    // $ANTLR start "entryRuleConstraintExpression"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1117:1: entryRuleConstraintExpression returns [EObject current=null] : iv_ruleConstraintExpression= ruleConstraintExpression EOF ;
    public final EObject entryRuleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExpression = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1118:2: (iv_ruleConstraintExpression= ruleConstraintExpression EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1119:2: iv_ruleConstraintExpression= ruleConstraintExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression2363);
            iv_ruleConstraintExpression=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExpression2373); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1126:1: ruleConstraintExpression returns [EObject current=null] : (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? ) ;
    public final EObject ruleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1129:28: ( (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1130:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1130:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1131:5: this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_ruleConstraintExpression2420);
            this_CompareExpression_0=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:1: ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) && (synpred1_InternalArchitecture())) {
                alt20=1;
            }
            else if ( (LA20_0==39) && (synpred1_InternalArchitecture())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:3: ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1144:6: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1144:7: () ( (lv_operator_2_0= ruleLogicOperator ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1144:7: ()
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1145:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1150:2: ( (lv_operator_2_0= ruleLogicOperator ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1151:1: (lv_operator_2_0= ruleLogicOperator )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1151:1: (lv_operator_2_0= ruleLogicOperator )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1152:3: lv_operator_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorParserRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicOperator_in_ruleConstraintExpression2469);
                    lv_operator_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1168:4: ( (lv_right_3_0= ruleConstraintExpression ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1169:1: (lv_right_3_0= ruleConstraintExpression )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1169:1: (lv_right_3_0= ruleConstraintExpression )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1170:3: lv_right_3_0= ruleConstraintExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstraintExpression_in_ruleConstraintExpression2492);
                    lv_right_3_0=ruleConstraintExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"ConstraintExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleCompareExpression"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1194:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1195:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1196:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression2530);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression2540); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1203:1: ruleCompareExpression returns [EObject current=null] : (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BasicConstraint_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1206:28: ( (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1207:1: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1207:1: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1208:5: this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2587);
            this_BasicConstraint_0=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:1: ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) && (synpred2_InternalArchitecture())) {
                alt21=1;
            }
            else if ( (LA21_0==41) && (synpred2_InternalArchitecture())) {
                alt21=1;
            }
            else if ( (LA21_0==35) && (synpred2_InternalArchitecture())) {
                alt21=1;
            }
            else if ( (LA21_0==34) && (synpred2_InternalArchitecture())) {
                alt21=1;
            }
            else if ( (LA21_0==42) && (synpred2_InternalArchitecture())) {
                alt21=1;
            }
            else if ( (LA21_0==43) && (synpred2_InternalArchitecture())) {
                alt21=1;
            }
            else if ( (LA21_0==44) && (synpred2_InternalArchitecture())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:2: ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:2: ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:3: ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1221:6: ( () ( (lv_operator_2_0= ruleComparator ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1221:7: () ( (lv_operator_2_0= ruleComparator ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1221:7: ()
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1222:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1227:2: ( (lv_operator_2_0= ruleComparator ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1228:1: (lv_operator_2_0= ruleComparator )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1228:1: (lv_operator_2_0= ruleComparator )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1229:3: lv_operator_2_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getOperatorComparatorParserRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparator_in_ruleCompareExpression2636);
                    lv_operator_2_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"Comparator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1245:4: ( (lv_right_3_0= ruleBasicConstraint ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1246:1: (lv_right_3_0= ruleBasicConstraint )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1246:1: (lv_right_3_0= ruleBasicConstraint )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1247:3: lv_right_3_0= ruleBasicConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2659);
                    lv_right_3_0=ruleBasicConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"BasicConstraint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleBasicConstraint"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1271:1: entryRuleBasicConstraint returns [EObject current=null] : iv_ruleBasicConstraint= ruleBasicConstraint EOF ;
    public final EObject entryRuleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraint = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1272:2: (iv_ruleBasicConstraint= ruleBasicConstraint EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1273:2: iv_ruleBasicConstraint= ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint2697);
            iv_ruleBasicConstraint=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicConstraint2707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1280:1: ruleBasicConstraint returns [EObject current=null] : (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand ) ;
    public final EObject ruleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesisConstraint_0 = null;

        EObject this_Operand_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1283:28: ( (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1284:1: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1284:1: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_BOOLEAN)||LA22_0==36) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1285:5: this_ParenthesisConstraint_0= ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_ruleBasicConstraint2754);
                    this_ParenthesisConstraint_0=ruleParenthesisConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesisConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1295:5: this_Operand_1= ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperand_in_ruleBasicConstraint2781);
                    this_Operand_1=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operand_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleParenthesisConstraint"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1311:1: entryRuleParenthesisConstraint returns [EObject current=null] : iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF ;
    public final EObject entryRuleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisConstraint = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1312:2: (iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1313:2: iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint2816);
            iv_ruleParenthesisConstraint=ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint2826); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesisConstraint"


    // $ANTLR start "ruleParenthesisConstraint"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1320:1: ruleParenthesisConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1323:28: ( (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1324:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1324:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1324:3: otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleParenthesisConstraint2863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1328:1: ( (lv_constraint_1_0= ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1329:1: (lv_constraint_1_0= ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1329:1: (lv_constraint_1_0= ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1330:3: lv_constraint_1_0= ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_ruleParenthesisConstraint2884);
            lv_constraint_1_0=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesisConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"ConstraintExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleParenthesisConstraint2896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesisConstraint"


    // $ANTLR start "entryRuleOperand"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1358:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1359:2: (iv_ruleOperand= ruleOperand EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1360:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand2932);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand2942); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1367:1: ruleOperand returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_NodeProperty_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1370:28: ( (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1371:1: (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1371:1: (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_BOOLEAN)||LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1372:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOperand2989);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1382:5: this_NodeProperty_1= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_ruleOperand3016);
                    this_NodeProperty_1=ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleTraceModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1398:1: entryRuleTraceModel returns [EObject current=null] : iv_ruleTraceModel= ruleTraceModel EOF ;
    public final EObject entryRuleTraceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceModel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1399:2: (iv_ruleTraceModel= ruleTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1400:2: iv_ruleTraceModel= ruleTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_entryRuleTraceModel3051);
            iv_ruleTraceModel=ruleTraceModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModel3061); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceModel"


    // $ANTLR start "ruleTraceModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1407:1: ruleTraceModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' ) ;
    public final EObject ruleTraceModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nodeSetRelations_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1410:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1411:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1411:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1411:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>'
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1411:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1412:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1412:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1413:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTraceModel3103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTraceModelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleTraceModel3120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1433:1: ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1434:1: (lv_nodeSetRelations_2_0= ruleNodeSetRelation )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1434:1: (lv_nodeSetRelations_2_0= ruleNodeSetRelation )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1435:3: lv_nodeSetRelations_2_0= ruleNodeSetRelation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeSetRelation_in_ruleTraceModel3141);
            	    lv_nodeSetRelations_2_0=ruleNodeSetRelation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTraceModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"nodeSetRelations",
            	              		lv_nodeSetRelations_2_0, 
            	              		"NodeSetRelation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleTraceModel3154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceModel"


    // $ANTLR start "entryRuleNodeSetRelation"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1463:1: entryRuleNodeSetRelation returns [EObject current=null] : iv_ruleNodeSetRelation= ruleNodeSetRelation EOF ;
    public final EObject entryRuleNodeSetRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSetRelation = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1464:2: (iv_ruleNodeSetRelation= ruleNodeSetRelation EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1465:2: iv_ruleNodeSetRelation= ruleNodeSetRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeSetRelationRule()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation3190);
            iv_ruleNodeSetRelation=ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeSetRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSetRelation3200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeSetRelation"


    // $ANTLR start "ruleNodeSetRelation"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1472:1: ruleNodeSetRelation returns [EObject current=null] : (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleNodeSetRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sourceNodes_1_0 = null;

        EObject lv_sourceNodes_3_0 = null;

        EObject lv_targetNodes_5_0 = null;

        EObject lv_targetNodes_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1475:28: ( (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1476:1: (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1476:1: (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1476:3: otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleNodeSetRelation3237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1480:1: ( (lv_sourceNodes_1_0= ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1481:1: (lv_sourceNodes_1_0= ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1481:1: (lv_sourceNodes_1_0= ruleNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1482:3: lv_sourceNodes_1_0= ruleNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3258);
            lv_sourceNodes_1_0=ruleNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
              	        }
                     		add(
                     			current, 
                     			"sourceNodes",
                      		lv_sourceNodes_1_0, 
                      		"NodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1498:2: (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1498:4: otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleNodeSetRelation3271); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1502:1: ( (lv_sourceNodes_3_0= ruleNodeType ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1503:1: (lv_sourceNodes_3_0= ruleNodeType )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1503:1: (lv_sourceNodes_3_0= ruleNodeType )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1504:3: lv_sourceNodes_3_0= ruleNodeType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3292);
            	    lv_sourceNodes_3_0=ruleNodeType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sourceNodes",
            	              		lv_sourceNodes_3_0, 
            	              		"NodeType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleNodeSetRelation3306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNodeSetRelationAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1524:1: ( (lv_targetNodes_5_0= ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1525:1: (lv_targetNodes_5_0= ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1525:1: (lv_targetNodes_5_0= ruleNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1526:3: lv_targetNodes_5_0= ruleNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3327);
            lv_targetNodes_5_0=ruleNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
              	        }
                     		add(
                     			current, 
                     			"targetNodes",
                      		lv_targetNodes_5_0, 
                      		"NodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1542:2: (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1542:4: otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleNodeSetRelation3340); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1546:1: ( (lv_targetNodes_7_0= ruleNodeType ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1547:1: (lv_targetNodes_7_0= ruleNodeType )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1547:1: (lv_targetNodes_7_0= ruleNodeType )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1548:3: lv_targetNodes_7_0= ruleNodeType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3361);
            	    lv_targetNodes_7_0=ruleNodeType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"targetNodes",
            	              		lv_targetNodes_7_0, 
            	              		"NodeType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleNodeSetRelation3375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeSetRelation"


    // $ANTLR start "entryRuleNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1576:1: entryRuleNodeType returns [EObject current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final EObject entryRuleNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeType = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1577:2: (iv_ruleNodeType= ruleNodeType EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1578:2: iv_ruleNodeType= ruleNodeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType3411);
            iv_ruleNodeType=ruleNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType3421); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1585:1: ruleNodeType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1588:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1589:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1589:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1590:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1590:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1591:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType3465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNodeTypeAccess().getEclassEClassCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1610:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1611:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1612:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3500);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3510); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1619:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_ArrayLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1622:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1623:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1623:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
                {
                alt27=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt27=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt27=4;
                }
                break;
            case 36:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1624:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral3557);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1634:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral3584);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1644:5: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral3611);
                    this_FloatLiteral_2=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1654:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral3638);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1664:5: this_ArrayLiteral_4= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_ruleLiteral3665);
                    this_ArrayLiteral_4=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1680:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1681:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1682:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3700);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral3710); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1689:1: ruleArrayLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_1_0 = null;

        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1692:28: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1693:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1693:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1693:3: otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleArrayLiteral3747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1697:1: ( (lv_literals_1_0= ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1698:1: (lv_literals_1_0= ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1698:1: (lv_literals_1_0= ruleLiteral )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1699:3: lv_literals_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral3768);
            lv_literals_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
              	        }
                     		add(
                     			current, 
                     			"literals",
                      		lv_literals_1_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1715:2: (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1715:4: otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleArrayLiteral3781); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1719:1: ( (lv_literals_3_0= ruleLiteral ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1720:1: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1720:1: (lv_literals_3_0= ruleLiteral )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1721:3: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral3802);
            	    lv_literals_3_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literals",
            	              		lv_literals_3_0, 
            	              		"Literal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleArrayLiteral3816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1749:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1750:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1751:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3852);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3862); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1758:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1761:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1762:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1762:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1763:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1763:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1764:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1788:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1789:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1790:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3943);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral3953); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1797:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1800:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1801:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1801:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1802:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1802:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1803:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral3994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1827:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1828:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1829:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4034);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral4044); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1836:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1839:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1840:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1840:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1841:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1841:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1842:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatLiteral4085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"FLOAT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1866:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1867:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1868:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4125);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral4135); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1875:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1878:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1879:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1879:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1880:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1880:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1881:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral4176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleLogicOperator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1905:1: entryRuleLogicOperator returns [EObject current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final EObject entryRuleLogicOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOperator = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1906:2: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1907:2: iv_ruleLogicOperator= ruleLogicOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator4216);
            iv_ruleLogicOperator=ruleLogicOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOperator4226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOperator"


    // $ANTLR start "ruleLogicOperator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1914:1: ruleLogicOperator returns [EObject current=null] : ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) ) ;
    public final EObject ruleLogicOperator() throws RecognitionException {
        EObject current = null;

        Token lv_AND_0_0=null;
        Token lv_OR_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1917:28: ( ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1918:1: ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1918:1: ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            else if ( (LA29_0==39) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1918:2: ( (lv_AND_0_0= '&' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1918:2: ( (lv_AND_0_0= '&' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1919:1: (lv_AND_0_0= '&' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1919:1: (lv_AND_0_0= '&' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1920:3: lv_AND_0_0= '&'
                    {
                    lv_AND_0_0=(Token)match(input,38,FOLLOW_38_in_ruleLogicOperator4269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_AND_0_0, grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogicOperatorRule());
                      	        }
                             		setWithLastConsumed(current, "AND", lv_AND_0_0, "&");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1934:6: ( (lv_OR_1_0= '|' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1934:6: ( (lv_OR_1_0= '|' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1935:1: (lv_OR_1_0= '|' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1935:1: (lv_OR_1_0= '|' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1936:3: lv_OR_1_0= '|'
                    {
                    lv_OR_1_0=(Token)match(input,39,FOLLOW_39_in_ruleLogicOperator4306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_OR_1_0, grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogicOperatorRule());
                      	        }
                             		setWithLastConsumed(current, "OR", lv_OR_1_0, "|");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "entryRuleComparator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1957:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1958:2: (iv_ruleComparator= ruleComparator EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1959:2: iv_ruleComparator= ruleComparator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_entryRuleComparator4355);
            iv_ruleComparator=ruleComparator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparator4365); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1966:1: ruleComparator returns [EObject current=null] : ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token lv_EQ_0_0=null;
        Token lv_NE_1_0=null;
        Token lv_GR_2_0=null;
        Token lv_LW_3_0=null;
        Token lv_GE_4_0=null;
        Token lv_LE_5_0=null;
        Token lv_LIKE_6_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1969:28: ( ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1970:1: ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1970:1: ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt30=1;
                }
                break;
            case 41:
                {
                alt30=2;
                }
                break;
            case 35:
                {
                alt30=3;
                }
                break;
            case 34:
                {
                alt30=4;
                }
                break;
            case 42:
                {
                alt30=5;
                }
                break;
            case 43:
                {
                alt30=6;
                }
                break;
            case 44:
                {
                alt30=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1970:2: ( (lv_EQ_0_0= '==' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1970:2: ( (lv_EQ_0_0= '==' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1971:1: (lv_EQ_0_0= '==' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1971:1: (lv_EQ_0_0= '==' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1972:3: lv_EQ_0_0= '=='
                    {
                    lv_EQ_0_0=(Token)match(input,40,FOLLOW_40_in_ruleComparator4408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_EQ_0_0, grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "EQ", lv_EQ_0_0, "==");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1986:6: ( (lv_NE_1_0= '!=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1986:6: ( (lv_NE_1_0= '!=' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1987:1: (lv_NE_1_0= '!=' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1987:1: (lv_NE_1_0= '!=' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1988:3: lv_NE_1_0= '!='
                    {
                    lv_NE_1_0=(Token)match(input,41,FOLLOW_41_in_ruleComparator4445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_NE_1_0, grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "NE", lv_NE_1_0, "!=");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2002:6: ( (lv_GR_2_0= '>' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2002:6: ( (lv_GR_2_0= '>' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2003:1: (lv_GR_2_0= '>' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2003:1: (lv_GR_2_0= '>' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2004:3: lv_GR_2_0= '>'
                    {
                    lv_GR_2_0=(Token)match(input,35,FOLLOW_35_in_ruleComparator4482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_GR_2_0, grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "GR", lv_GR_2_0, ">");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2018:6: ( (lv_LW_3_0= '<' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2018:6: ( (lv_LW_3_0= '<' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2019:1: (lv_LW_3_0= '<' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2019:1: (lv_LW_3_0= '<' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2020:3: lv_LW_3_0= '<'
                    {
                    lv_LW_3_0=(Token)match(input,34,FOLLOW_34_in_ruleComparator4519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_LW_3_0, grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "LW", lv_LW_3_0, "<");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2034:6: ( (lv_GE_4_0= '>=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2034:6: ( (lv_GE_4_0= '>=' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2035:1: (lv_GE_4_0= '>=' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2035:1: (lv_GE_4_0= '>=' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2036:3: lv_GE_4_0= '>='
                    {
                    lv_GE_4_0=(Token)match(input,42,FOLLOW_42_in_ruleComparator4556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_GE_4_0, grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "GE", lv_GE_4_0, ">=");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2050:6: ( (lv_LE_5_0= '<=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2050:6: ( (lv_LE_5_0= '<=' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2051:1: (lv_LE_5_0= '<=' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2051:1: (lv_LE_5_0= '<=' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2052:3: lv_LE_5_0= '<='
                    {
                    lv_LE_5_0=(Token)match(input,43,FOLLOW_43_in_ruleComparator4593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_LE_5_0, grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "LE", lv_LE_5_0, "<=");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2066:6: ( (lv_LIKE_6_0= '~' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2066:6: ( (lv_LIKE_6_0= '~' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2067:1: (lv_LIKE_6_0= '~' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2067:1: (lv_LIKE_6_0= '~' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2068:3: lv_LIKE_6_0= '~'
                    {
                    lv_LIKE_6_0=(Token)match(input,44,FOLLOW_44_in_ruleComparator4630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_LIKE_6_0, grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "LIKE", lv_LIKE_6_0, "~");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2089:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2090:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2091:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4680);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4691); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2098:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2101:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2102:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2102:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2102:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2109:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_ID) && (synpred3_InternalArchitecture())) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2109:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2109:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2109:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedName4759); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4775); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2132:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2133:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2134:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard4823);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard4834); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2141:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2144:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2145:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2145:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2146:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard4881);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2156:1: (kw= '.' kw= '*' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2157:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedNameWithWildcard4900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedNameWithWildcard4913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"

    // $ANTLR start synpred1_InternalArchitecture
    public final void synpred1_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:3: ( ( () ( ( ruleLogicOperator ) ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:4: ( () ( ( ruleLogicOperator ) ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:4: ( () ( ( ruleLogicOperator ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:5: () ( ( ruleLogicOperator ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1139:5: ()
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1140:1: 
        {
        }

        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1140:2: ( ( ruleLogicOperator ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1141:1: ( ruleLogicOperator )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1141:1: ( ruleLogicOperator )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1142:1: ruleLogicOperator
        {
        pushFollow(FOLLOW_ruleLogicOperator_in_synpred1_InternalArchitecture2439);
        ruleLogicOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalArchitecture

    // $ANTLR start synpred2_InternalArchitecture
    public final void synpred2_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:3: ( ( () ( ( ruleComparator ) ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:4: ( () ( ( ruleComparator ) ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:4: ( () ( ( ruleComparator ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:5: () ( ( ruleComparator ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1216:5: ()
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1217:1: 
        {
        }

        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1217:2: ( ( ruleComparator ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1218:1: ( ruleComparator )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1218:1: ( ruleComparator )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1219:1: ruleComparator
        {
        pushFollow(FOLLOW_ruleComparator_in_synpred2_InternalArchitecture2606);
        ruleComparator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalArchitecture

    // $ANTLR start synpred3_InternalArchitecture
    public final void synpred3_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2109:3: ( '.' )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2110:2: '.'
        {
        match(input,45,FOLLOW_45_in_synpred3_InternalArchitecture4750); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalArchitecture

    // Delegated rules

    public final boolean synpred1_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModel155 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel176 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_ruleModel198 = new BitSet(new long[]{0x0000000001170002L});
    public static final BitSet FOLLOW_ruleConnection_in_ruleModel221 = new BitSet(new long[]{0x0000000001050002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_ruleModel248 = new BitSet(new long[]{0x0000000001050002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaverImport_in_ruleImport343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratorImport_in_ruleImport370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaverImport_in_entryRuleWeaverImport405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeaverImport415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleWeaverImport452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleWeaverImport473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratorImport_in_entryRuleGeneratorImport509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneratorImport519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGeneratorImport556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleGeneratorImport577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelSequence623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMetamodelSequence660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_ruleMetamodelSequence681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleMetamodelSequence702 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleMetamodelSequence715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleMetamodelSequence736 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodel825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRegisteredPackage912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisteredPackage929 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleRegisteredPackage956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRegisteredPackage981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegisteredPackage1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleConnection1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_ruleConnection1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_entryRuleWeaver1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeaver1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleWeaver1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWeaver1240 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_ruleWeaver1261 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAspectModel_in_ruleWeaver1282 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleWeaver1295 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_ruleWeaver1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_entryRuleAspectModel1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectModel1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAspectModel1402 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_ruleAspectModel1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleAspectModel1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGenerator1534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator1554 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_ruleGenerator1575 = new BitSet(new long[]{0x0000000026000010L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_ruleGenerator1596 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleGenerator1609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTraceModel_in_ruleGenerator1630 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleGenerator1645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator1665 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleGenerator1678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator1698 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector1738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceModelNodeSelector1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSourceModelNodeSelector1794 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleSourceModelNodeSelector1807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleSourceModelNodeSelector1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSourceModelNodeSelector1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType1896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetModelNodeType1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTargetModelNodeType1960 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTargetModelNodeType1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType2029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodeType2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodeType2084 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelNodeType2096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodeType2116 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleModelNodeType2129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleModelNodeType2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty2188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeProperty2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeProperty2243 = new BitSet(new long[]{0x0000000048000002L});
    public static final BitSet FOLLOW_30_in_ruleNodeProperty2256 = new BitSet(new long[]{0x00000011000001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleNodeProperty2277 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNodeProperty2289 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleNodeProperty2304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleNodeProperty2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression2363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleConstraintExpression2420 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_ruleConstraintExpression2469 = new BitSet(new long[]{0x00000011000001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleConstraintExpression2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression2530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2587 = new BitSet(new long[]{0x00001F0C00000002L});
    public static final BitSet FOLLOW_ruleComparator_in_ruleCompareExpression2636 = new BitSet(new long[]{0x00000011000001F0L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint2697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraint2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_ruleBasicConstraint2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_ruleBasicConstraint2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint2816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParenthesisConstraint2863 = new BitSet(new long[]{0x00000011000001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleParenthesisConstraint2884 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleParenthesisConstraint2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand2932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOperand2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleOperand3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_entryRuleTraceModel3051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModel3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTraceModel3103 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTraceModel3120 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_ruleTraceModel3141 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_35_in_ruleTraceModel3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation3190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSetRelation3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleNodeSetRelation3237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3258 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_19_in_ruleNodeSetRelation3271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3292 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_23_in_ruleNodeSetRelation3306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3327 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeSetRelation3340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3361 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_ruleNodeSetRelation3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType3411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_ruleLiteral3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleArrayLiteral3747 = new BitSet(new long[]{0x00000010000001E0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral3768 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_19_in_ruleArrayLiteral3781 = new BitSet(new long[]{0x00000010000001E0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral3802 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_37_in_ruleArrayLiteral3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatLiteral4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator4216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOperator4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLogicOperator4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLogicOperator4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_entryRuleComparator4355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparator4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleComparator4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComparator4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleComparator4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleComparator4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleComparator4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleComparator4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleComparator4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4731 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedName4759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4775 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard4823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard4881 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedNameWithWildcard4900 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedNameWithWildcard4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_synpred1_InternalArchitecture2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_synpred2_InternalArchitecture2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred3_InternalArchitecture4750 = new BitSet(new long[]{0x0000000000000002L});

}
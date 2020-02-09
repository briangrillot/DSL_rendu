package fsm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fsm.services.TextEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'InitialState'", "'FinalState'", "'State'", "','", "'Transition'", "'->'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTextEditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextEditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextEditorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTextEditor.g"; }



     	private TextEditorGrammarAccess grammarAccess;

        public InternalTextEditorParser(TokenStream input, TextEditorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected TextEditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalTextEditor.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalTextEditor.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalTextEditor.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalTextEditor.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'InitialState' ( (lv_state_4_0= ruleInitialState ) ) ) (otherlv_5= 'FinalState' ( (lv_state_6_0= ruleFinalState ) ) ) ( (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_state_10_0 = null;

        EObject lv_transition_12_0 = null;

        EObject lv_transition_14_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'InitialState' ( (lv_state_4_0= ruleInitialState ) ) ) (otherlv_5= 'FinalState' ( (lv_state_6_0= ruleFinalState ) ) ) ( (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* ) )
            // InternalTextEditor.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'InitialState' ( (lv_state_4_0= ruleInitialState ) ) ) (otherlv_5= 'FinalState' ( (lv_state_6_0= ruleFinalState ) ) ) ( (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* )
            {
            // InternalTextEditor.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'InitialState' ( (lv_state_4_0= ruleInitialState ) ) ) (otherlv_5= 'FinalState' ( (lv_state_6_0= ruleFinalState ) ) ) ( (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* )
            // InternalTextEditor.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'InitialState' ( (lv_state_4_0= ruleInitialState ) ) ) (otherlv_5= 'FinalState' ( (lv_state_6_0= ruleFinalState ) ) ) ( (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )*
            {
            // InternalTextEditor.g:79:3: ()
            // InternalTextEditor.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalTextEditor.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTextEditor.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalTextEditor.g:91:4: (lv_name_2_0= ruleEString )
            // InternalTextEditor.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextEditor.g:109:3: (otherlv_3= 'InitialState' ( (lv_state_4_0= ruleInitialState ) ) )
            // InternalTextEditor.g:110:4: otherlv_3= 'InitialState' ( (lv_state_4_0= ruleInitialState ) )
            {
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getInitialStateKeyword_3_0());
            			
            // InternalTextEditor.g:114:4: ( (lv_state_4_0= ruleInitialState ) )
            // InternalTextEditor.g:115:5: (lv_state_4_0= ruleInitialState )
            {
            // InternalTextEditor.g:115:5: (lv_state_4_0= ruleInitialState )
            // InternalTextEditor.g:116:6: lv_state_4_0= ruleInitialState
            {

            						newCompositeNode(grammarAccess.getFSMAccess().getStateInitialStateParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_5);
            lv_state_4_0=ruleInitialState();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFSMRule());
            						}
            						add(
            							current,
            							"state",
            							lv_state_4_0,
            							"fsm.TextEditor.InitialState");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalTextEditor.g:134:3: (otherlv_5= 'FinalState' ( (lv_state_6_0= ruleFinalState ) ) )
            // InternalTextEditor.g:135:4: otherlv_5= 'FinalState' ( (lv_state_6_0= ruleFinalState ) )
            {
            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getFinalStateKeyword_4_0());
            			
            // InternalTextEditor.g:139:4: ( (lv_state_6_0= ruleFinalState ) )
            // InternalTextEditor.g:140:5: (lv_state_6_0= ruleFinalState )
            {
            // InternalTextEditor.g:140:5: (lv_state_6_0= ruleFinalState )
            // InternalTextEditor.g:141:6: lv_state_6_0= ruleFinalState
            {

            						newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_6);
            lv_state_6_0=ruleFinalState();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFSMRule());
            						}
            						add(
            							current,
            							"state",
            							lv_state_6_0,
            							"fsm.TextEditor.FinalState");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalTextEditor.g:159:3: ( (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }
                else if ( (LA3_0==16) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTextEditor.g:160:4: (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    {
            	    // InternalTextEditor.g:160:4: (otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    // InternalTextEditor.g:161:5: otherlv_7= 'State' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getStateKeyword_5_0_0());
            	    				
            	    // InternalTextEditor.g:165:5: ( (lv_state_8_0= ruleState ) )
            	    // InternalTextEditor.g:166:6: (lv_state_8_0= ruleState )
            	    {
            	    // InternalTextEditor.g:166:6: (lv_state_8_0= ruleState )
            	    // InternalTextEditor.g:167:7: lv_state_8_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_5_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_state_8_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_8_0,
            	    								"fsm.TextEditor.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalTextEditor.g:184:5: (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalTextEditor.g:185:6: otherlv_9= ',' ( (lv_state_10_0= ruleState ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_5_0_2_0());
            	    	    					
            	    	    // InternalTextEditor.g:189:6: ( (lv_state_10_0= ruleState ) )
            	    	    // InternalTextEditor.g:190:7: (lv_state_10_0= ruleState )
            	    	    {
            	    	    // InternalTextEditor.g:190:7: (lv_state_10_0= ruleState )
            	    	    // InternalTextEditor.g:191:8: lv_state_10_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_5_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_state_10_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_10_0,
            	    	    									"fsm.TextEditor.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTextEditor.g:211:4: (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )
            	    {
            	    // InternalTextEditor.g:211:4: (otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )
            	    // InternalTextEditor.g:212:5: otherlv_11= 'Transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getFSMAccess().getTransitionKeyword_5_1_0());
            	    				
            	    // InternalTextEditor.g:216:5: ( (lv_transition_12_0= ruleTransition ) )
            	    // InternalTextEditor.g:217:6: (lv_transition_12_0= ruleTransition )
            	    {
            	    // InternalTextEditor.g:217:6: (lv_transition_12_0= ruleTransition )
            	    // InternalTextEditor.g:218:7: lv_transition_12_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_transition_12_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transition",
            	    								lv_transition_12_0,
            	    								"fsm.TextEditor.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalTextEditor.g:235:5: (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==15) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalTextEditor.g:236:6: otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_13, grammarAccess.getFSMAccess().getCommaKeyword_5_1_2_0());
            	    	    					
            	    	    // InternalTextEditor.g:240:6: ( (lv_transition_14_0= ruleTransition ) )
            	    	    // InternalTextEditor.g:241:7: (lv_transition_14_0= ruleTransition )
            	    	    {
            	    	    // InternalTextEditor.g:241:7: (lv_transition_14_0= ruleTransition )
            	    	    // InternalTextEditor.g:242:8: lv_transition_14_0= ruleTransition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_5_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_transition_14_0=ruleTransition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"transition",
            	    	    									lv_transition_14_0,
            	    	    									"fsm.TextEditor.Transition");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalTextEditor.g:266:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalTextEditor.g:266:46: (iv_ruleState= ruleState EOF )
            // InternalTextEditor.g:267:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalTextEditor.g:273:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:279:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTextEditor.g:280:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTextEditor.g:280:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTextEditor.g:281:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTextEditor.g:281:3: ()
            // InternalTextEditor.g:282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalTextEditor.g:288:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTextEditor.g:289:4: (lv_name_1_0= ruleEString )
            {
            // InternalTextEditor.g:289:4: (lv_name_1_0= ruleEString )
            // InternalTextEditor.g:290:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // InternalTextEditor.g:311:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTextEditor.g:311:47: (iv_ruleEString= ruleEString EOF )
            // InternalTextEditor.g:312:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTextEditor.g:318:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTextEditor.g:324:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTextEditor.g:325:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTextEditor.g:325:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTextEditor.g:326:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTextEditor.g:334:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTransition"
    // InternalTextEditor.g:345:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalTextEditor.g:345:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalTextEditor.g:346:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalTextEditor.g:352:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:358:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // InternalTextEditor.g:359:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // InternalTextEditor.g:359:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // InternalTextEditor.g:360:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            // InternalTextEditor.g:360:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTextEditor.g:361:4: (lv_name_0_0= ruleEString )
            {
            // InternalTextEditor.g:361:4: (lv_name_0_0= ruleEString )
            // InternalTextEditor.g:362:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextEditor.g:379:3: ( ( ruleEString ) )
            // InternalTextEditor.g:380:4: ( ruleEString )
            {
            // InternalTextEditor.g:380:4: ( ruleEString )
            // InternalTextEditor.g:381:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalTextEditor.g:399:3: ( ( ruleEString ) )
            // InternalTextEditor.g:400:4: ( ruleEString )
            {
            // InternalTextEditor.g:400:4: ( ruleEString )
            // InternalTextEditor.g:401:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInitialState"
    // InternalTextEditor.g:419:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalTextEditor.g:419:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalTextEditor.g:420:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalTextEditor.g:426:1: ruleInitialState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:432:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTextEditor.g:433:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTextEditor.g:433:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTextEditor.g:434:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTextEditor.g:434:3: ()
            // InternalTextEditor.g:435:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
            					current);
            			

            }

            // InternalTextEditor.g:441:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTextEditor.g:442:4: (lv_name_1_0= ruleEString )
            {
            // InternalTextEditor.g:442:4: (lv_name_1_0= ruleEString )
            // InternalTextEditor.g:443:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleFinalState"
    // InternalTextEditor.g:464:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalTextEditor.g:464:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalTextEditor.g:465:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalTextEditor.g:471:1: ruleFinalState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:477:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTextEditor.g:478:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTextEditor.g:478:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTextEditor.g:479:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTextEditor.g:479:3: ()
            // InternalTextEditor.g:480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            // InternalTextEditor.g:486:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTextEditor.g:487:4: (lv_name_1_0= ruleEString )
            {
            // InternalTextEditor.g:487:4: (lv_name_1_0= ruleEString )
            // InternalTextEditor.g:488:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});

}
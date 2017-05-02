package se.chalmers.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import se.chalmers.services.TurtleBotMissionDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleBotMissionDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TurtleBot'", "'{'", "'bot_start'", "'area'", "'waypointtypes'", "','", "'}'", "'waypoints'", "'missions'", "'Area'", "'xmax'", "'ymax'", "'WaypointType'", "'WayPoint'", "'coord_x'", "'coord_y'", "'('", "')'", "'Mission'", "'task'", "'-'", "'LineTask'", "'ShortestPathTask'", "'ReturnToStartTask'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTurtleBotMissionDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTurtleBotMissionDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTurtleBotMissionDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTurtleBotMissionDSL.g"; }



     	private TurtleBotMissionDSLGrammarAccess grammarAccess;

        public InternalTurtleBotMissionDSLParser(TokenStream input, TurtleBotMissionDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TurtleBot";
       	}

       	@Override
       	protected TurtleBotMissionDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTurtleBot"
    // InternalTurtleBotMissionDSL.g:64:1: entryRuleTurtleBot returns [EObject current=null] : iv_ruleTurtleBot= ruleTurtleBot EOF ;
    public final EObject entryRuleTurtleBot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurtleBot = null;


        try {
            // InternalTurtleBotMissionDSL.g:64:50: (iv_ruleTurtleBot= ruleTurtleBot EOF )
            // InternalTurtleBotMissionDSL.g:65:2: iv_ruleTurtleBot= ruleTurtleBot EOF
            {
             newCompositeNode(grammarAccess.getTurtleBotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurtleBot=ruleTurtleBot();

            state._fsp--;

             current =iv_ruleTurtleBot; 
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
    // $ANTLR end "entryRuleTurtleBot"


    // $ANTLR start "ruleTurtleBot"
    // InternalTurtleBotMissionDSL.g:71:1: ruleTurtleBot returns [EObject current=null] : (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'bot_start' ( ( ruleEString ) ) otherlv_5= 'area' ( (lv_area_6_0= ruleArea ) ) otherlv_7= 'waypointtypes' otherlv_8= '{' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) (otherlv_10= ',' ( (lv_waypointtypes_11_0= ruleWaypointType ) ) )* otherlv_12= '}' otherlv_13= 'waypoints' otherlv_14= '{' ( (lv_waypoints_15_0= ruleWayPoint ) ) (otherlv_16= ',' ( (lv_waypoints_17_0= ruleWayPoint ) ) )* otherlv_18= '}' (otherlv_19= 'missions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleTurtleBot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_area_6_0 = null;

        EObject lv_waypointtypes_9_0 = null;

        EObject lv_waypointtypes_11_0 = null;

        EObject lv_waypoints_15_0 = null;

        EObject lv_waypoints_17_0 = null;

        EObject lv_missions_21_0 = null;

        EObject lv_missions_23_0 = null;



        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:77:2: ( (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'bot_start' ( ( ruleEString ) ) otherlv_5= 'area' ( (lv_area_6_0= ruleArea ) ) otherlv_7= 'waypointtypes' otherlv_8= '{' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) (otherlv_10= ',' ( (lv_waypointtypes_11_0= ruleWaypointType ) ) )* otherlv_12= '}' otherlv_13= 'waypoints' otherlv_14= '{' ( (lv_waypoints_15_0= ruleWayPoint ) ) (otherlv_16= ',' ( (lv_waypoints_17_0= ruleWayPoint ) ) )* otherlv_18= '}' (otherlv_19= 'missions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalTurtleBotMissionDSL.g:78:2: (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'bot_start' ( ( ruleEString ) ) otherlv_5= 'area' ( (lv_area_6_0= ruleArea ) ) otherlv_7= 'waypointtypes' otherlv_8= '{' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) (otherlv_10= ',' ( (lv_waypointtypes_11_0= ruleWaypointType ) ) )* otherlv_12= '}' otherlv_13= 'waypoints' otherlv_14= '{' ( (lv_waypoints_15_0= ruleWayPoint ) ) (otherlv_16= ',' ( (lv_waypoints_17_0= ruleWayPoint ) ) )* otherlv_18= '}' (otherlv_19= 'missions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalTurtleBotMissionDSL.g:78:2: (otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'bot_start' ( ( ruleEString ) ) otherlv_5= 'area' ( (lv_area_6_0= ruleArea ) ) otherlv_7= 'waypointtypes' otherlv_8= '{' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) (otherlv_10= ',' ( (lv_waypointtypes_11_0= ruleWaypointType ) ) )* otherlv_12= '}' otherlv_13= 'waypoints' otherlv_14= '{' ( (lv_waypoints_15_0= ruleWayPoint ) ) (otherlv_16= ',' ( (lv_waypoints_17_0= ruleWayPoint ) ) )* otherlv_18= '}' (otherlv_19= 'missions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalTurtleBotMissionDSL.g:79:3: otherlv_0= 'TurtleBot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'bot_start' ( ( ruleEString ) ) otherlv_5= 'area' ( (lv_area_6_0= ruleArea ) ) otherlv_7= 'waypointtypes' otherlv_8= '{' ( (lv_waypointtypes_9_0= ruleWaypointType ) ) (otherlv_10= ',' ( (lv_waypointtypes_11_0= ruleWaypointType ) ) )* otherlv_12= '}' otherlv_13= 'waypoints' otherlv_14= '{' ( (lv_waypoints_15_0= ruleWayPoint ) ) (otherlv_16= ',' ( (lv_waypoints_17_0= ruleWayPoint ) ) )* otherlv_18= '}' (otherlv_19= 'missions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTurtleBotAccess().getTurtleBotKeyword_0());
            		
            // InternalTurtleBotMissionDSL.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtleBotMissionDSL.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:84:4: (lv_name_1_0= ruleEString )
            // InternalTurtleBotMissionDSL.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"se.chalmers.TurtleBotMissionDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTurtleBotAccess().getBot_startKeyword_3());
            		
            // InternalTurtleBotMissionDSL.g:110:3: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:111:4: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:111:4: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:112:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurtleBotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getBot_startWayPointCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getTurtleBotAccess().getAreaKeyword_5());
            		
            // InternalTurtleBotMissionDSL.g:130:3: ( (lv_area_6_0= ruleArea ) )
            // InternalTurtleBotMissionDSL.g:131:4: (lv_area_6_0= ruleArea )
            {
            // InternalTurtleBotMissionDSL.g:131:4: (lv_area_6_0= ruleArea )
            // InternalTurtleBotMissionDSL.g:132:5: lv_area_6_0= ruleArea
            {

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getAreaAreaParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_area_6_0=ruleArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            					}
            					set(
            						current,
            						"area",
            						lv_area_6_0,
            						"se.chalmers.TurtleBotMissionDSL.Area");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTurtleBotAccess().getWaypointtypesKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalTurtleBotMissionDSL.g:157:3: ( (lv_waypointtypes_9_0= ruleWaypointType ) )
            // InternalTurtleBotMissionDSL.g:158:4: (lv_waypointtypes_9_0= ruleWaypointType )
            {
            // InternalTurtleBotMissionDSL.g:158:4: (lv_waypointtypes_9_0= ruleWaypointType )
            // InternalTurtleBotMissionDSL.g:159:5: lv_waypointtypes_9_0= ruleWaypointType
            {

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_waypointtypes_9_0=ruleWaypointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            					}
            					add(
            						current,
            						"waypointtypes",
            						lv_waypointtypes_9_0,
            						"se.chalmers.TurtleBotMissionDSL.WaypointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtleBotMissionDSL.g:176:3: (otherlv_10= ',' ( (lv_waypointtypes_11_0= ruleWaypointType ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:177:4: otherlv_10= ',' ( (lv_waypointtypes_11_0= ruleWaypointType ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTurtleBotAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalTurtleBotMissionDSL.g:181:4: ( (lv_waypointtypes_11_0= ruleWaypointType ) )
            	    // InternalTurtleBotMissionDSL.g:182:5: (lv_waypointtypes_11_0= ruleWaypointType )
            	    {
            	    // InternalTurtleBotMissionDSL.g:182:5: (lv_waypointtypes_11_0= ruleWaypointType )
            	    // InternalTurtleBotMissionDSL.g:183:6: lv_waypointtypes_11_0= ruleWaypointType
            	    {

            	    						newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_waypointtypes_11_0=ruleWaypointType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"waypointtypes",
            	    							lv_waypointtypes_11_0,
            	    							"se.chalmers.TurtleBotMissionDSL.WaypointType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTurtleBotAccess().getWaypointsKeyword_12());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalTurtleBotMissionDSL.g:213:3: ( (lv_waypoints_15_0= ruleWayPoint ) )
            // InternalTurtleBotMissionDSL.g:214:4: (lv_waypoints_15_0= ruleWayPoint )
            {
            // InternalTurtleBotMissionDSL.g:214:4: (lv_waypoints_15_0= ruleWayPoint )
            // InternalTurtleBotMissionDSL.g:215:5: lv_waypoints_15_0= ruleWayPoint
            {

            					newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_10);
            lv_waypoints_15_0=ruleWayPoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            					}
            					add(
            						current,
            						"waypoints",
            						lv_waypoints_15_0,
            						"se.chalmers.TurtleBotMissionDSL.WayPoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtleBotMissionDSL.g:232:3: (otherlv_16= ',' ( (lv_waypoints_17_0= ruleWayPoint ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:233:4: otherlv_16= ',' ( (lv_waypoints_17_0= ruleWayPoint ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_16, grammarAccess.getTurtleBotAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalTurtleBotMissionDSL.g:237:4: ( (lv_waypoints_17_0= ruleWayPoint ) )
            	    // InternalTurtleBotMissionDSL.g:238:5: (lv_waypoints_17_0= ruleWayPoint )
            	    {
            	    // InternalTurtleBotMissionDSL.g:238:5: (lv_waypoints_17_0= ruleWayPoint )
            	    // InternalTurtleBotMissionDSL.g:239:6: lv_waypoints_17_0= ruleWayPoint
            	    {

            	    						newCompositeNode(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_waypoints_17_0=ruleWayPoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTurtleBotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"waypoints",
            	    							lv_waypoints_17_0,
            	    							"se.chalmers.TurtleBotMissionDSL.WayPoint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalTurtleBotMissionDSL.g:261:3: (otherlv_19= 'missions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:262:4: otherlv_19= 'missions' otherlv_20= '{' ( (lv_missions_21_0= ruleMission ) ) (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getTurtleBotAccess().getMissionsKeyword_17_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalTurtleBotMissionDSL.g:270:4: ( (lv_missions_21_0= ruleMission ) )
                    // InternalTurtleBotMissionDSL.g:271:5: (lv_missions_21_0= ruleMission )
                    {
                    // InternalTurtleBotMissionDSL.g:271:5: (lv_missions_21_0= ruleMission )
                    // InternalTurtleBotMissionDSL.g:272:6: lv_missions_21_0= ruleMission
                    {

                    						newCompositeNode(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_missions_21_0=ruleMission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTurtleBotRule());
                    						}
                    						add(
                    							current,
                    							"missions",
                    							lv_missions_21_0,
                    							"se.chalmers.TurtleBotMissionDSL.Mission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTurtleBotMissionDSL.g:289:4: (otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTurtleBotMissionDSL.g:290:5: otherlv_22= ',' ( (lv_missions_23_0= ruleMission ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_14); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTurtleBotAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalTurtleBotMissionDSL.g:294:5: ( (lv_missions_23_0= ruleMission ) )
                    	    // InternalTurtleBotMissionDSL.g:295:6: (lv_missions_23_0= ruleMission )
                    	    {
                    	    // InternalTurtleBotMissionDSL.g:295:6: (lv_missions_23_0= ruleMission )
                    	    // InternalTurtleBotMissionDSL.g:296:7: lv_missions_23_0= ruleMission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_missions_23_0=ruleMission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTurtleBotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"missions",
                    	    								lv_missions_23_0,
                    	    								"se.chalmers.TurtleBotMissionDSL.Mission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleTurtleBot"


    // $ANTLR start "entryRuleTask"
    // InternalTurtleBotMissionDSL.g:327:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalTurtleBotMissionDSL.g:327:45: (iv_ruleTask= ruleTask EOF )
            // InternalTurtleBotMissionDSL.g:328:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTurtleBotMissionDSL.g:334:1: ruleTask returns [EObject current=null] : (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_LineTask_0 = null;

        EObject this_ShortestPathTask_1 = null;

        EObject this_ReturnToStartTask_2 = null;



        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:340:2: ( (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask ) )
            // InternalTurtleBotMissionDSL.g:341:2: (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask )
            {
            // InternalTurtleBotMissionDSL.g:341:2: (this_LineTask_0= ruleLineTask | this_ShortestPathTask_1= ruleShortestPathTask | this_ReturnToStartTask_2= ruleReturnToStartTask )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:342:3: this_LineTask_0= ruleLineTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getLineTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineTask_0=ruleLineTask();

                    state._fsp--;


                    			current = this_LineTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTurtleBotMissionDSL.g:351:3: this_ShortestPathTask_1= ruleShortestPathTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getShortestPathTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShortestPathTask_1=ruleShortestPathTask();

                    state._fsp--;


                    			current = this_ShortestPathTask_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTurtleBotMissionDSL.g:360:3: this_ReturnToStartTask_2= ruleReturnToStartTask
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getReturnToStartTaskParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReturnToStartTask_2=ruleReturnToStartTask();

                    state._fsp--;


                    			current = this_ReturnToStartTask_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleEString"
    // InternalTurtleBotMissionDSL.g:372:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTurtleBotMissionDSL.g:372:47: (iv_ruleEString= ruleEString EOF )
            // InternalTurtleBotMissionDSL.g:373:2: iv_ruleEString= ruleEString EOF
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
    // InternalTurtleBotMissionDSL.g:379:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:385:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTurtleBotMissionDSL.g:386:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTurtleBotMissionDSL.g:386:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:387:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTurtleBotMissionDSL.g:395:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleArea"
    // InternalTurtleBotMissionDSL.g:406:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalTurtleBotMissionDSL.g:406:45: (iv_ruleArea= ruleArea EOF )
            // InternalTurtleBotMissionDSL.g:407:2: iv_ruleArea= ruleArea EOF
            {
             newCompositeNode(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;

             current =iv_ruleArea; 
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
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalTurtleBotMissionDSL.g:413:1: ruleArea returns [EObject current=null] : ( () otherlv_1= 'Area' otherlv_2= '{' (otherlv_3= 'xmax' ( (lv_xmax_4_0= ruleEInt ) ) )? (otherlv_5= 'ymax' ( (lv_ymax_6_0= ruleEInt ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_xmax_4_0 = null;

        AntlrDatatypeRuleToken lv_ymax_6_0 = null;



        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:419:2: ( ( () otherlv_1= 'Area' otherlv_2= '{' (otherlv_3= 'xmax' ( (lv_xmax_4_0= ruleEInt ) ) )? (otherlv_5= 'ymax' ( (lv_ymax_6_0= ruleEInt ) ) )? otherlv_7= '}' ) )
            // InternalTurtleBotMissionDSL.g:420:2: ( () otherlv_1= 'Area' otherlv_2= '{' (otherlv_3= 'xmax' ( (lv_xmax_4_0= ruleEInt ) ) )? (otherlv_5= 'ymax' ( (lv_ymax_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            {
            // InternalTurtleBotMissionDSL.g:420:2: ( () otherlv_1= 'Area' otherlv_2= '{' (otherlv_3= 'xmax' ( (lv_xmax_4_0= ruleEInt ) ) )? (otherlv_5= 'ymax' ( (lv_ymax_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            // InternalTurtleBotMissionDSL.g:421:3: () otherlv_1= 'Area' otherlv_2= '{' (otherlv_3= 'xmax' ( (lv_xmax_4_0= ruleEInt ) ) )? (otherlv_5= 'ymax' ( (lv_ymax_6_0= ruleEInt ) ) )? otherlv_7= '}'
            {
            // InternalTurtleBotMissionDSL.g:421:3: ()
            // InternalTurtleBotMissionDSL.g:422:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAreaAccess().getAreaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAreaAccess().getAreaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTurtleBotMissionDSL.g:436:3: (otherlv_3= 'xmax' ( (lv_xmax_4_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:437:4: otherlv_3= 'xmax' ( (lv_xmax_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getAreaAccess().getXmaxKeyword_3_0());
                    			
                    // InternalTurtleBotMissionDSL.g:441:4: ( (lv_xmax_4_0= ruleEInt ) )
                    // InternalTurtleBotMissionDSL.g:442:5: (lv_xmax_4_0= ruleEInt )
                    {
                    // InternalTurtleBotMissionDSL.g:442:5: (lv_xmax_4_0= ruleEInt )
                    // InternalTurtleBotMissionDSL.g:443:6: lv_xmax_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAreaAccess().getXmaxEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_xmax_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaRule());
                    						}
                    						set(
                    							current,
                    							"xmax",
                    							lv_xmax_4_0,
                    							"se.chalmers.TurtleBotMissionDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTurtleBotMissionDSL.g:461:3: (otherlv_5= 'ymax' ( (lv_ymax_6_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:462:4: otherlv_5= 'ymax' ( (lv_ymax_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getAreaAccess().getYmaxKeyword_4_0());
                    			
                    // InternalTurtleBotMissionDSL.g:466:4: ( (lv_ymax_6_0= ruleEInt ) )
                    // InternalTurtleBotMissionDSL.g:467:5: (lv_ymax_6_0= ruleEInt )
                    {
                    // InternalTurtleBotMissionDSL.g:467:5: (lv_ymax_6_0= ruleEInt )
                    // InternalTurtleBotMissionDSL.g:468:6: lv_ymax_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAreaAccess().getYmaxEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_ymax_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaRule());
                    						}
                    						set(
                    							current,
                    							"ymax",
                    							lv_ymax_6_0,
                    							"se.chalmers.TurtleBotMissionDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleWaypointType"
    // InternalTurtleBotMissionDSL.g:494:1: entryRuleWaypointType returns [EObject current=null] : iv_ruleWaypointType= ruleWaypointType EOF ;
    public final EObject entryRuleWaypointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaypointType = null;


        try {
            // InternalTurtleBotMissionDSL.g:494:53: (iv_ruleWaypointType= ruleWaypointType EOF )
            // InternalTurtleBotMissionDSL.g:495:2: iv_ruleWaypointType= ruleWaypointType EOF
            {
             newCompositeNode(grammarAccess.getWaypointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaypointType=ruleWaypointType();

            state._fsp--;

             current =iv_ruleWaypointType; 
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
    // $ANTLR end "entryRuleWaypointType"


    // $ANTLR start "ruleWaypointType"
    // InternalTurtleBotMissionDSL.g:501:1: ruleWaypointType returns [EObject current=null] : ( () otherlv_1= 'WaypointType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleWaypointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:507:2: ( ( () otherlv_1= 'WaypointType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTurtleBotMissionDSL.g:508:2: ( () otherlv_1= 'WaypointType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTurtleBotMissionDSL.g:508:2: ( () otherlv_1= 'WaypointType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:509:3: () otherlv_1= 'WaypointType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:509:3: ()
            // InternalTurtleBotMissionDSL.g:510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaypointTypeAccess().getWaypointTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWaypointTypeAccess().getWaypointTypeKeyword_1());
            		
            // InternalTurtleBotMissionDSL.g:520:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTurtleBotMissionDSL.g:521:4: (lv_name_2_0= ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:521:4: (lv_name_2_0= ruleEString )
            // InternalTurtleBotMissionDSL.g:522:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWaypointTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaypointTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"se.chalmers.TurtleBotMissionDSL.EString");
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
    // $ANTLR end "ruleWaypointType"


    // $ANTLR start "entryRuleWayPoint"
    // InternalTurtleBotMissionDSL.g:543:1: entryRuleWayPoint returns [EObject current=null] : iv_ruleWayPoint= ruleWayPoint EOF ;
    public final EObject entryRuleWayPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWayPoint = null;


        try {
            // InternalTurtleBotMissionDSL.g:543:49: (iv_ruleWayPoint= ruleWayPoint EOF )
            // InternalTurtleBotMissionDSL.g:544:2: iv_ruleWayPoint= ruleWayPoint EOF
            {
             newCompositeNode(grammarAccess.getWayPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWayPoint=ruleWayPoint();

            state._fsp--;

             current =iv_ruleWayPoint; 
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
    // $ANTLR end "entryRuleWayPoint"


    // $ANTLR start "ruleWayPoint"
    // InternalTurtleBotMissionDSL.g:550:1: ruleWayPoint returns [EObject current=null] : (otherlv_0= 'WayPoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'coord_x' ( (lv_coord_x_4_0= ruleEInt ) ) )? (otherlv_5= 'coord_y' ( (lv_coord_y_6_0= ruleEInt ) ) )? otherlv_7= 'waypointtypes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) ;
    public final EObject ruleWayPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_coord_x_4_0 = null;

        AntlrDatatypeRuleToken lv_coord_y_6_0 = null;



        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:556:2: ( (otherlv_0= 'WayPoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'coord_x' ( (lv_coord_x_4_0= ruleEInt ) ) )? (otherlv_5= 'coord_y' ( (lv_coord_y_6_0= ruleEInt ) ) )? otherlv_7= 'waypointtypes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalTurtleBotMissionDSL.g:557:2: (otherlv_0= 'WayPoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'coord_x' ( (lv_coord_x_4_0= ruleEInt ) ) )? (otherlv_5= 'coord_y' ( (lv_coord_y_6_0= ruleEInt ) ) )? otherlv_7= 'waypointtypes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalTurtleBotMissionDSL.g:557:2: (otherlv_0= 'WayPoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'coord_x' ( (lv_coord_x_4_0= ruleEInt ) ) )? (otherlv_5= 'coord_y' ( (lv_coord_y_6_0= ruleEInt ) ) )? otherlv_7= 'waypointtypes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalTurtleBotMissionDSL.g:558:3: otherlv_0= 'WayPoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'coord_x' ( (lv_coord_x_4_0= ruleEInt ) ) )? (otherlv_5= 'coord_y' ( (lv_coord_y_6_0= ruleEInt ) ) )? otherlv_7= 'waypointtypes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWayPointAccess().getWayPointKeyword_0());
            		
            // InternalTurtleBotMissionDSL.g:562:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtleBotMissionDSL.g:563:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:563:4: (lv_name_1_0= ruleEString )
            // InternalTurtleBotMissionDSL.g:564:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWayPointAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWayPointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"se.chalmers.TurtleBotMissionDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getWayPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTurtleBotMissionDSL.g:585:3: (otherlv_3= 'coord_x' ( (lv_coord_x_4_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:586:4: otherlv_3= 'coord_x' ( (lv_coord_x_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getWayPointAccess().getCoord_xKeyword_3_0());
                    			
                    // InternalTurtleBotMissionDSL.g:590:4: ( (lv_coord_x_4_0= ruleEInt ) )
                    // InternalTurtleBotMissionDSL.g:591:5: (lv_coord_x_4_0= ruleEInt )
                    {
                    // InternalTurtleBotMissionDSL.g:591:5: (lv_coord_x_4_0= ruleEInt )
                    // InternalTurtleBotMissionDSL.g:592:6: lv_coord_x_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getWayPointAccess().getCoord_xEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_coord_x_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWayPointRule());
                    						}
                    						set(
                    							current,
                    							"coord_x",
                    							lv_coord_x_4_0,
                    							"se.chalmers.TurtleBotMissionDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTurtleBotMissionDSL.g:610:3: (otherlv_5= 'coord_y' ( (lv_coord_y_6_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:611:4: otherlv_5= 'coord_y' ( (lv_coord_y_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getWayPointAccess().getCoord_yKeyword_4_0());
                    			
                    // InternalTurtleBotMissionDSL.g:615:4: ( (lv_coord_y_6_0= ruleEInt ) )
                    // InternalTurtleBotMissionDSL.g:616:5: (lv_coord_y_6_0= ruleEInt )
                    {
                    // InternalTurtleBotMissionDSL.g:616:5: (lv_coord_y_6_0= ruleEInt )
                    // InternalTurtleBotMissionDSL.g:617:6: lv_coord_y_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getWayPointAccess().getCoord_yEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_coord_y_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWayPointRule());
                    						}
                    						set(
                    							current,
                    							"coord_y",
                    							lv_coord_y_6_0,
                    							"se.chalmers.TurtleBotMissionDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getWayPointAccess().getWaypointtypesKeyword_5());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getWayPointAccess().getLeftParenthesisKeyword_6());
            		
            // InternalTurtleBotMissionDSL.g:643:3: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:644:4: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:644:4: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:645:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWayPointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_7_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtleBotMissionDSL.g:659:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:660:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getWayPointAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalTurtleBotMissionDSL.g:664:4: ( ( ruleEString ) )
            	    // InternalTurtleBotMissionDSL.g:665:5: ( ruleEString )
            	    {
            	    // InternalTurtleBotMissionDSL.g:665:5: ( ruleEString )
            	    // InternalTurtleBotMissionDSL.g:666:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getWayPointRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getWayPointAccess().getRightParenthesisKeyword_9());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getWayPointAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleWayPoint"


    // $ANTLR start "entryRuleMission"
    // InternalTurtleBotMissionDSL.g:693:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalTurtleBotMissionDSL.g:693:48: (iv_ruleMission= ruleMission EOF )
            // InternalTurtleBotMissionDSL.g:694:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalTurtleBotMissionDSL.g:700:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'task' otherlv_4= '{' ( (lv_task_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_task_7_0= ruleTask ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_task_5_0 = null;

        EObject lv_task_7_0 = null;



        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:706:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'task' otherlv_4= '{' ( (lv_task_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_task_7_0= ruleTask ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalTurtleBotMissionDSL.g:707:2: (otherlv_0= 'Mission' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'task' otherlv_4= '{' ( (lv_task_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_task_7_0= ruleTask ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalTurtleBotMissionDSL.g:707:2: (otherlv_0= 'Mission' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'task' otherlv_4= '{' ( (lv_task_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_task_7_0= ruleTask ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalTurtleBotMissionDSL.g:708:3: otherlv_0= 'Mission' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'task' otherlv_4= '{' ( (lv_task_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_task_7_0= ruleTask ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalTurtleBotMissionDSL.g:712:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtleBotMissionDSL.g:713:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:713:4: (lv_name_1_0= ruleEString )
            // InternalTurtleBotMissionDSL.g:714:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"se.chalmers.TurtleBotMissionDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getTaskKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTurtleBotMissionDSL.g:743:3: ( (lv_task_5_0= ruleTask ) )
            // InternalTurtleBotMissionDSL.g:744:4: (lv_task_5_0= ruleTask )
            {
            // InternalTurtleBotMissionDSL.g:744:4: (lv_task_5_0= ruleTask )
            // InternalTurtleBotMissionDSL.g:745:5: lv_task_5_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_task_5_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"task",
            						lv_task_5_0,
            						"se.chalmers.TurtleBotMissionDSL.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtleBotMissionDSL.g:762:3: (otherlv_6= ',' ( (lv_task_7_0= ruleTask ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:763:4: otherlv_6= ',' ( (lv_task_7_0= ruleTask ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalTurtleBotMissionDSL.g:767:4: ( (lv_task_7_0= ruleTask ) )
            	    // InternalTurtleBotMissionDSL.g:768:5: (lv_task_7_0= ruleTask )
            	    {
            	    // InternalTurtleBotMissionDSL.g:768:5: (lv_task_7_0= ruleTask )
            	    // InternalTurtleBotMissionDSL.g:769:6: lv_task_7_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_task_7_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"task",
            	    							lv_task_7_0,
            	    							"se.chalmers.TurtleBotMissionDSL.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleEInt"
    // InternalTurtleBotMissionDSL.g:799:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTurtleBotMissionDSL.g:799:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTurtleBotMissionDSL.g:800:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTurtleBotMissionDSL.g:806:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:812:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTurtleBotMissionDSL.g:813:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTurtleBotMissionDSL.g:813:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTurtleBotMissionDSL.g:814:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTurtleBotMissionDSL.g:814:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:815:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLineTask"
    // InternalTurtleBotMissionDSL.g:832:1: entryRuleLineTask returns [EObject current=null] : iv_ruleLineTask= ruleLineTask EOF ;
    public final EObject entryRuleLineTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineTask = null;


        try {
            // InternalTurtleBotMissionDSL.g:832:49: (iv_ruleLineTask= ruleLineTask EOF )
            // InternalTurtleBotMissionDSL.g:833:2: iv_ruleLineTask= ruleLineTask EOF
            {
             newCompositeNode(grammarAccess.getLineTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineTask=ruleLineTask();

            state._fsp--;

             current =iv_ruleLineTask; 
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
    // $ANTLR end "entryRuleLineTask"


    // $ANTLR start "ruleLineTask"
    // InternalTurtleBotMissionDSL.g:839:1: ruleLineTask returns [EObject current=null] : (otherlv_0= 'LineTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleLineTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:845:2: ( (otherlv_0= 'LineTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalTurtleBotMissionDSL.g:846:2: (otherlv_0= 'LineTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalTurtleBotMissionDSL.g:846:2: (otherlv_0= 'LineTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalTurtleBotMissionDSL.g:847:3: otherlv_0= 'LineTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLineTaskAccess().getLineTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLineTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getLineTaskAccess().getWaypointsKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLineTaskAccess().getLeftParenthesisKeyword_3());
            		
            // InternalTurtleBotMissionDSL.g:863:3: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:864:4: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:864:4: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:865:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineTaskRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtleBotMissionDSL.g:879:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:880:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLineTaskAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalTurtleBotMissionDSL.g:884:4: ( ( ruleEString ) )
            	    // InternalTurtleBotMissionDSL.g:885:5: ( ruleEString )
            	    {
            	    // InternalTurtleBotMissionDSL.g:885:5: ( ruleEString )
            	    // InternalTurtleBotMissionDSL.g:886:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLineTaskRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getLineTaskAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLineTaskAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLineTask"


    // $ANTLR start "entryRuleShortestPathTask"
    // InternalTurtleBotMissionDSL.g:913:1: entryRuleShortestPathTask returns [EObject current=null] : iv_ruleShortestPathTask= ruleShortestPathTask EOF ;
    public final EObject entryRuleShortestPathTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortestPathTask = null;


        try {
            // InternalTurtleBotMissionDSL.g:913:57: (iv_ruleShortestPathTask= ruleShortestPathTask EOF )
            // InternalTurtleBotMissionDSL.g:914:2: iv_ruleShortestPathTask= ruleShortestPathTask EOF
            {
             newCompositeNode(grammarAccess.getShortestPathTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortestPathTask=ruleShortestPathTask();

            state._fsp--;

             current =iv_ruleShortestPathTask; 
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
    // $ANTLR end "entryRuleShortestPathTask"


    // $ANTLR start "ruleShortestPathTask"
    // InternalTurtleBotMissionDSL.g:920:1: ruleShortestPathTask returns [EObject current=null] : (otherlv_0= 'ShortestPathTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleShortestPathTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:926:2: ( (otherlv_0= 'ShortestPathTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalTurtleBotMissionDSL.g:927:2: (otherlv_0= 'ShortestPathTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalTurtleBotMissionDSL.g:927:2: (otherlv_0= 'ShortestPathTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalTurtleBotMissionDSL.g:928:3: otherlv_0= 'ShortestPathTask' otherlv_1= '{' otherlv_2= 'waypoints' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getShortestPathTaskAccess().getShortestPathTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getShortestPathTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getShortestPathTaskAccess().getWaypointsKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getShortestPathTaskAccess().getLeftParenthesisKeyword_3());
            		
            // InternalTurtleBotMissionDSL.g:944:3: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:945:4: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:945:4: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:946:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShortestPathTaskRule());
            					}
            				

            					newCompositeNode(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtleBotMissionDSL.g:960:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:961:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getShortestPathTaskAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalTurtleBotMissionDSL.g:965:4: ( ( ruleEString ) )
            	    // InternalTurtleBotMissionDSL.g:966:5: ( ruleEString )
            	    {
            	    // InternalTurtleBotMissionDSL.g:966:5: ( ruleEString )
            	    // InternalTurtleBotMissionDSL.g:967:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getShortestPathTaskRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getShortestPathTaskAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getShortestPathTaskAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleShortestPathTask"


    // $ANTLR start "entryRuleReturnToStartTask"
    // InternalTurtleBotMissionDSL.g:994:1: entryRuleReturnToStartTask returns [EObject current=null] : iv_ruleReturnToStartTask= ruleReturnToStartTask EOF ;
    public final EObject entryRuleReturnToStartTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnToStartTask = null;


        try {
            // InternalTurtleBotMissionDSL.g:994:58: (iv_ruleReturnToStartTask= ruleReturnToStartTask EOF )
            // InternalTurtleBotMissionDSL.g:995:2: iv_ruleReturnToStartTask= ruleReturnToStartTask EOF
            {
             newCompositeNode(grammarAccess.getReturnToStartTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnToStartTask=ruleReturnToStartTask();

            state._fsp--;

             current =iv_ruleReturnToStartTask; 
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
    // $ANTLR end "entryRuleReturnToStartTask"


    // $ANTLR start "ruleReturnToStartTask"
    // InternalTurtleBotMissionDSL.g:1001:1: ruleReturnToStartTask returns [EObject current=null] : ( () otherlv_1= 'ReturnToStartTask' ) ;
    public final EObject ruleReturnToStartTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTurtleBotMissionDSL.g:1007:2: ( ( () otherlv_1= 'ReturnToStartTask' ) )
            // InternalTurtleBotMissionDSL.g:1008:2: ( () otherlv_1= 'ReturnToStartTask' )
            {
            // InternalTurtleBotMissionDSL.g:1008:2: ( () otherlv_1= 'ReturnToStartTask' )
            // InternalTurtleBotMissionDSL.g:1009:3: () otherlv_1= 'ReturnToStartTask'
            {
            // InternalTurtleBotMissionDSL.g:1009:3: ()
            // InternalTurtleBotMissionDSL.g:1010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskKeyword_1());
            		

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
    // $ANTLR end "ruleReturnToStartTask"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});

}
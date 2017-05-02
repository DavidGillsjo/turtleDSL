package se.chalmers.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import se.chalmers.services.TurtleBotMissionDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleBotMissionDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TurtleBot'", "'{'", "'bot_start'", "'area'", "'waypointtypes'", "'}'", "'waypoints'", "','", "'missions'", "'Area'", "'xmax'", "'ymax'", "'WaypointType'", "'WayPoint'", "'('", "')'", "'coord_x'", "'coord_y'", "'Mission'", "'task'", "'-'", "'LineTask'", "'ShortestPathTask'", "'ReturnToStartTask'"
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

    	public void setGrammarAccess(TurtleBotMissionDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTurtleBot"
    // InternalTurtleBotMissionDSL.g:53:1: entryRuleTurtleBot : ruleTurtleBot EOF ;
    public final void entryRuleTurtleBot() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:54:1: ( ruleTurtleBot EOF )
            // InternalTurtleBotMissionDSL.g:55:1: ruleTurtleBot EOF
            {
             before(grammarAccess.getTurtleBotRule()); 
            pushFollow(FOLLOW_1);
            ruleTurtleBot();

            state._fsp--;

             after(grammarAccess.getTurtleBotRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurtleBot"


    // $ANTLR start "ruleTurtleBot"
    // InternalTurtleBotMissionDSL.g:62:1: ruleTurtleBot : ( ( rule__TurtleBot__Group__0 ) ) ;
    public final void ruleTurtleBot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:66:2: ( ( ( rule__TurtleBot__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:67:2: ( ( rule__TurtleBot__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:67:2: ( ( rule__TurtleBot__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:68:3: ( rule__TurtleBot__Group__0 )
            {
             before(grammarAccess.getTurtleBotAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:69:3: ( rule__TurtleBot__Group__0 )
            // InternalTurtleBotMissionDSL.g:69:4: rule__TurtleBot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurtleBot"


    // $ANTLR start "entryRuleTask"
    // InternalTurtleBotMissionDSL.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:79:1: ( ruleTask EOF )
            // InternalTurtleBotMissionDSL.g:80:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTurtleBotMissionDSL.g:87:1: ruleTask : ( ( rule__Task__Alternatives ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:91:2: ( ( ( rule__Task__Alternatives ) ) )
            // InternalTurtleBotMissionDSL.g:92:2: ( ( rule__Task__Alternatives ) )
            {
            // InternalTurtleBotMissionDSL.g:92:2: ( ( rule__Task__Alternatives ) )
            // InternalTurtleBotMissionDSL.g:93:3: ( rule__Task__Alternatives )
            {
             before(grammarAccess.getTaskAccess().getAlternatives()); 
            // InternalTurtleBotMissionDSL.g:94:3: ( rule__Task__Alternatives )
            // InternalTurtleBotMissionDSL.g:94:4: rule__Task__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Task__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleEString"
    // InternalTurtleBotMissionDSL.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:104:1: ( ruleEString EOF )
            // InternalTurtleBotMissionDSL.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTurtleBotMissionDSL.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTurtleBotMissionDSL.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTurtleBotMissionDSL.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalTurtleBotMissionDSL.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTurtleBotMissionDSL.g:119:3: ( rule__EString__Alternatives )
            // InternalTurtleBotMissionDSL.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleArea"
    // InternalTurtleBotMissionDSL.g:128:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:129:1: ( ruleArea EOF )
            // InternalTurtleBotMissionDSL.g:130:1: ruleArea EOF
            {
             before(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getAreaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalTurtleBotMissionDSL.g:137:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:141:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:142:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:142:2: ( ( rule__Area__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:143:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:144:3: ( rule__Area__Group__0 )
            // InternalTurtleBotMissionDSL.g:144:4: rule__Area__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleWaypointType"
    // InternalTurtleBotMissionDSL.g:153:1: entryRuleWaypointType : ruleWaypointType EOF ;
    public final void entryRuleWaypointType() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:154:1: ( ruleWaypointType EOF )
            // InternalTurtleBotMissionDSL.g:155:1: ruleWaypointType EOF
            {
             before(grammarAccess.getWaypointTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWaypointType();

            state._fsp--;

             after(grammarAccess.getWaypointTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWaypointType"


    // $ANTLR start "ruleWaypointType"
    // InternalTurtleBotMissionDSL.g:162:1: ruleWaypointType : ( ( rule__WaypointType__Group__0 ) ) ;
    public final void ruleWaypointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:166:2: ( ( ( rule__WaypointType__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:167:2: ( ( rule__WaypointType__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:167:2: ( ( rule__WaypointType__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:168:3: ( rule__WaypointType__Group__0 )
            {
             before(grammarAccess.getWaypointTypeAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:169:3: ( rule__WaypointType__Group__0 )
            // InternalTurtleBotMissionDSL.g:169:4: rule__WaypointType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WaypointType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaypointTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWaypointType"


    // $ANTLR start "entryRuleWayPoint"
    // InternalTurtleBotMissionDSL.g:178:1: entryRuleWayPoint : ruleWayPoint EOF ;
    public final void entryRuleWayPoint() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:179:1: ( ruleWayPoint EOF )
            // InternalTurtleBotMissionDSL.g:180:1: ruleWayPoint EOF
            {
             before(grammarAccess.getWayPointRule()); 
            pushFollow(FOLLOW_1);
            ruleWayPoint();

            state._fsp--;

             after(grammarAccess.getWayPointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWayPoint"


    // $ANTLR start "ruleWayPoint"
    // InternalTurtleBotMissionDSL.g:187:1: ruleWayPoint : ( ( rule__WayPoint__Group__0 ) ) ;
    public final void ruleWayPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:191:2: ( ( ( rule__WayPoint__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:192:2: ( ( rule__WayPoint__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:192:2: ( ( rule__WayPoint__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:193:3: ( rule__WayPoint__Group__0 )
            {
             before(grammarAccess.getWayPointAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:194:3: ( rule__WayPoint__Group__0 )
            // InternalTurtleBotMissionDSL.g:194:4: rule__WayPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWayPoint"


    // $ANTLR start "entryRuleMission"
    // InternalTurtleBotMissionDSL.g:203:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:204:1: ( ruleMission EOF )
            // InternalTurtleBotMissionDSL.g:205:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalTurtleBotMissionDSL.g:212:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:216:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:217:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:217:2: ( ( rule__Mission__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:218:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:219:3: ( rule__Mission__Group__0 )
            // InternalTurtleBotMissionDSL.g:219:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleEInt"
    // InternalTurtleBotMissionDSL.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:229:1: ( ruleEInt EOF )
            // InternalTurtleBotMissionDSL.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTurtleBotMissionDSL.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:244:3: ( rule__EInt__Group__0 )
            // InternalTurtleBotMissionDSL.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLineTask"
    // InternalTurtleBotMissionDSL.g:253:1: entryRuleLineTask : ruleLineTask EOF ;
    public final void entryRuleLineTask() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:254:1: ( ruleLineTask EOF )
            // InternalTurtleBotMissionDSL.g:255:1: ruleLineTask EOF
            {
             before(grammarAccess.getLineTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleLineTask();

            state._fsp--;

             after(grammarAccess.getLineTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineTask"


    // $ANTLR start "ruleLineTask"
    // InternalTurtleBotMissionDSL.g:262:1: ruleLineTask : ( ( rule__LineTask__Group__0 ) ) ;
    public final void ruleLineTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:266:2: ( ( ( rule__LineTask__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:267:2: ( ( rule__LineTask__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:267:2: ( ( rule__LineTask__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:268:3: ( rule__LineTask__Group__0 )
            {
             before(grammarAccess.getLineTaskAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:269:3: ( rule__LineTask__Group__0 )
            // InternalTurtleBotMissionDSL.g:269:4: rule__LineTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineTask"


    // $ANTLR start "entryRuleShortestPathTask"
    // InternalTurtleBotMissionDSL.g:278:1: entryRuleShortestPathTask : ruleShortestPathTask EOF ;
    public final void entryRuleShortestPathTask() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:279:1: ( ruleShortestPathTask EOF )
            // InternalTurtleBotMissionDSL.g:280:1: ruleShortestPathTask EOF
            {
             before(grammarAccess.getShortestPathTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleShortestPathTask();

            state._fsp--;

             after(grammarAccess.getShortestPathTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShortestPathTask"


    // $ANTLR start "ruleShortestPathTask"
    // InternalTurtleBotMissionDSL.g:287:1: ruleShortestPathTask : ( ( rule__ShortestPathTask__Group__0 ) ) ;
    public final void ruleShortestPathTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:291:2: ( ( ( rule__ShortestPathTask__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:292:2: ( ( rule__ShortestPathTask__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:292:2: ( ( rule__ShortestPathTask__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:293:3: ( rule__ShortestPathTask__Group__0 )
            {
             before(grammarAccess.getShortestPathTaskAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:294:3: ( rule__ShortestPathTask__Group__0 )
            // InternalTurtleBotMissionDSL.g:294:4: rule__ShortestPathTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShortestPathTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShortestPathTask"


    // $ANTLR start "entryRuleReturnToStartTask"
    // InternalTurtleBotMissionDSL.g:303:1: entryRuleReturnToStartTask : ruleReturnToStartTask EOF ;
    public final void entryRuleReturnToStartTask() throws RecognitionException {
        try {
            // InternalTurtleBotMissionDSL.g:304:1: ( ruleReturnToStartTask EOF )
            // InternalTurtleBotMissionDSL.g:305:1: ruleReturnToStartTask EOF
            {
             before(grammarAccess.getReturnToStartTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnToStartTask();

            state._fsp--;

             after(grammarAccess.getReturnToStartTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReturnToStartTask"


    // $ANTLR start "ruleReturnToStartTask"
    // InternalTurtleBotMissionDSL.g:312:1: ruleReturnToStartTask : ( ( rule__ReturnToStartTask__Group__0 ) ) ;
    public final void ruleReturnToStartTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:316:2: ( ( ( rule__ReturnToStartTask__Group__0 ) ) )
            // InternalTurtleBotMissionDSL.g:317:2: ( ( rule__ReturnToStartTask__Group__0 ) )
            {
            // InternalTurtleBotMissionDSL.g:317:2: ( ( rule__ReturnToStartTask__Group__0 ) )
            // InternalTurtleBotMissionDSL.g:318:3: ( rule__ReturnToStartTask__Group__0 )
            {
             before(grammarAccess.getReturnToStartTaskAccess().getGroup()); 
            // InternalTurtleBotMissionDSL.g:319:3: ( rule__ReturnToStartTask__Group__0 )
            // InternalTurtleBotMissionDSL.g:319:4: rule__ReturnToStartTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnToStartTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnToStartTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnToStartTask"


    // $ANTLR start "rule__Task__Alternatives"
    // InternalTurtleBotMissionDSL.g:327:1: rule__Task__Alternatives : ( ( ruleLineTask ) | ( ruleShortestPathTask ) | ( ruleReturnToStartTask ) );
    public final void rule__Task__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:331:1: ( ( ruleLineTask ) | ( ruleShortestPathTask ) | ( ruleReturnToStartTask ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:332:2: ( ruleLineTask )
                    {
                    // InternalTurtleBotMissionDSL.g:332:2: ( ruleLineTask )
                    // InternalTurtleBotMissionDSL.g:333:3: ruleLineTask
                    {
                     before(grammarAccess.getTaskAccess().getLineTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLineTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getLineTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtleBotMissionDSL.g:338:2: ( ruleShortestPathTask )
                    {
                    // InternalTurtleBotMissionDSL.g:338:2: ( ruleShortestPathTask )
                    // InternalTurtleBotMissionDSL.g:339:3: ruleShortestPathTask
                    {
                     before(grammarAccess.getTaskAccess().getShortestPathTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleShortestPathTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getShortestPathTaskParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtleBotMissionDSL.g:344:2: ( ruleReturnToStartTask )
                    {
                    // InternalTurtleBotMissionDSL.g:344:2: ( ruleReturnToStartTask )
                    // InternalTurtleBotMissionDSL.g:345:3: ruleReturnToStartTask
                    {
                     before(grammarAccess.getTaskAccess().getReturnToStartTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReturnToStartTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getReturnToStartTaskParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTurtleBotMissionDSL.g:354:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:358:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:359:2: ( RULE_STRING )
                    {
                    // InternalTurtleBotMissionDSL.g:359:2: ( RULE_STRING )
                    // InternalTurtleBotMissionDSL.g:360:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtleBotMissionDSL.g:365:2: ( RULE_ID )
                    {
                    // InternalTurtleBotMissionDSL.g:365:2: ( RULE_ID )
                    // InternalTurtleBotMissionDSL.g:366:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TurtleBot__Group__0"
    // InternalTurtleBotMissionDSL.g:375:1: rule__TurtleBot__Group__0 : rule__TurtleBot__Group__0__Impl rule__TurtleBot__Group__1 ;
    public final void rule__TurtleBot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:379:1: ( rule__TurtleBot__Group__0__Impl rule__TurtleBot__Group__1 )
            // InternalTurtleBotMissionDSL.g:380:2: rule__TurtleBot__Group__0__Impl rule__TurtleBot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__0"


    // $ANTLR start "rule__TurtleBot__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:387:1: rule__TurtleBot__Group__0__Impl : ( 'TurtleBot' ) ;
    public final void rule__TurtleBot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:391:1: ( ( 'TurtleBot' ) )
            // InternalTurtleBotMissionDSL.g:392:1: ( 'TurtleBot' )
            {
            // InternalTurtleBotMissionDSL.g:392:1: ( 'TurtleBot' )
            // InternalTurtleBotMissionDSL.g:393:2: 'TurtleBot'
            {
             before(grammarAccess.getTurtleBotAccess().getTurtleBotKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getTurtleBotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group__1"
    // InternalTurtleBotMissionDSL.g:402:1: rule__TurtleBot__Group__1 : rule__TurtleBot__Group__1__Impl rule__TurtleBot__Group__2 ;
    public final void rule__TurtleBot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:406:1: ( rule__TurtleBot__Group__1__Impl rule__TurtleBot__Group__2 )
            // InternalTurtleBotMissionDSL.g:407:2: rule__TurtleBot__Group__1__Impl rule__TurtleBot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__1"


    // $ANTLR start "rule__TurtleBot__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:414:1: rule__TurtleBot__Group__1__Impl : ( ( rule__TurtleBot__NameAssignment_1 ) ) ;
    public final void rule__TurtleBot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:418:1: ( ( ( rule__TurtleBot__NameAssignment_1 ) ) )
            // InternalTurtleBotMissionDSL.g:419:1: ( ( rule__TurtleBot__NameAssignment_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:419:1: ( ( rule__TurtleBot__NameAssignment_1 ) )
            // InternalTurtleBotMissionDSL.g:420:2: ( rule__TurtleBot__NameAssignment_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getNameAssignment_1()); 
            // InternalTurtleBotMissionDSL.g:421:2: ( rule__TurtleBot__NameAssignment_1 )
            // InternalTurtleBotMissionDSL.g:421:3: rule__TurtleBot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group__2"
    // InternalTurtleBotMissionDSL.g:429:1: rule__TurtleBot__Group__2 : rule__TurtleBot__Group__2__Impl rule__TurtleBot__Group__3 ;
    public final void rule__TurtleBot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:433:1: ( rule__TurtleBot__Group__2__Impl rule__TurtleBot__Group__3 )
            // InternalTurtleBotMissionDSL.g:434:2: rule__TurtleBot__Group__2__Impl rule__TurtleBot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TurtleBot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__2"


    // $ANTLR start "rule__TurtleBot__Group__2__Impl"
    // InternalTurtleBotMissionDSL.g:441:1: rule__TurtleBot__Group__2__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:445:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:446:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:446:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:447:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__2__Impl"


    // $ANTLR start "rule__TurtleBot__Group__3"
    // InternalTurtleBotMissionDSL.g:456:1: rule__TurtleBot__Group__3 : rule__TurtleBot__Group__3__Impl rule__TurtleBot__Group__4 ;
    public final void rule__TurtleBot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:460:1: ( rule__TurtleBot__Group__3__Impl rule__TurtleBot__Group__4 )
            // InternalTurtleBotMissionDSL.g:461:2: rule__TurtleBot__Group__3__Impl rule__TurtleBot__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__TurtleBot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__3"


    // $ANTLR start "rule__TurtleBot__Group__3__Impl"
    // InternalTurtleBotMissionDSL.g:468:1: rule__TurtleBot__Group__3__Impl : ( 'bot_start' ) ;
    public final void rule__TurtleBot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:472:1: ( ( 'bot_start' ) )
            // InternalTurtleBotMissionDSL.g:473:1: ( 'bot_start' )
            {
            // InternalTurtleBotMissionDSL.g:473:1: ( 'bot_start' )
            // InternalTurtleBotMissionDSL.g:474:2: 'bot_start'
            {
             before(grammarAccess.getTurtleBotAccess().getBot_startKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getBot_startKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__3__Impl"


    // $ANTLR start "rule__TurtleBot__Group__4"
    // InternalTurtleBotMissionDSL.g:483:1: rule__TurtleBot__Group__4 : rule__TurtleBot__Group__4__Impl rule__TurtleBot__Group__5 ;
    public final void rule__TurtleBot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:487:1: ( rule__TurtleBot__Group__4__Impl rule__TurtleBot__Group__5 )
            // InternalTurtleBotMissionDSL.g:488:2: rule__TurtleBot__Group__4__Impl rule__TurtleBot__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TurtleBot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__4"


    // $ANTLR start "rule__TurtleBot__Group__4__Impl"
    // InternalTurtleBotMissionDSL.g:495:1: rule__TurtleBot__Group__4__Impl : ( ( rule__TurtleBot__Bot_startAssignment_4 ) ) ;
    public final void rule__TurtleBot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:499:1: ( ( ( rule__TurtleBot__Bot_startAssignment_4 ) ) )
            // InternalTurtleBotMissionDSL.g:500:1: ( ( rule__TurtleBot__Bot_startAssignment_4 ) )
            {
            // InternalTurtleBotMissionDSL.g:500:1: ( ( rule__TurtleBot__Bot_startAssignment_4 ) )
            // InternalTurtleBotMissionDSL.g:501:2: ( rule__TurtleBot__Bot_startAssignment_4 )
            {
             before(grammarAccess.getTurtleBotAccess().getBot_startAssignment_4()); 
            // InternalTurtleBotMissionDSL.g:502:2: ( rule__TurtleBot__Bot_startAssignment_4 )
            // InternalTurtleBotMissionDSL.g:502:3: rule__TurtleBot__Bot_startAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Bot_startAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getBot_startAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__4__Impl"


    // $ANTLR start "rule__TurtleBot__Group__5"
    // InternalTurtleBotMissionDSL.g:510:1: rule__TurtleBot__Group__5 : rule__TurtleBot__Group__5__Impl rule__TurtleBot__Group__6 ;
    public final void rule__TurtleBot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:514:1: ( rule__TurtleBot__Group__5__Impl rule__TurtleBot__Group__6 )
            // InternalTurtleBotMissionDSL.g:515:2: rule__TurtleBot__Group__5__Impl rule__TurtleBot__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__TurtleBot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__5"


    // $ANTLR start "rule__TurtleBot__Group__5__Impl"
    // InternalTurtleBotMissionDSL.g:522:1: rule__TurtleBot__Group__5__Impl : ( 'area' ) ;
    public final void rule__TurtleBot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:526:1: ( ( 'area' ) )
            // InternalTurtleBotMissionDSL.g:527:1: ( 'area' )
            {
            // InternalTurtleBotMissionDSL.g:527:1: ( 'area' )
            // InternalTurtleBotMissionDSL.g:528:2: 'area'
            {
             before(grammarAccess.getTurtleBotAccess().getAreaKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getAreaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__5__Impl"


    // $ANTLR start "rule__TurtleBot__Group__6"
    // InternalTurtleBotMissionDSL.g:537:1: rule__TurtleBot__Group__6 : rule__TurtleBot__Group__6__Impl rule__TurtleBot__Group__7 ;
    public final void rule__TurtleBot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:541:1: ( rule__TurtleBot__Group__6__Impl rule__TurtleBot__Group__7 )
            // InternalTurtleBotMissionDSL.g:542:2: rule__TurtleBot__Group__6__Impl rule__TurtleBot__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__TurtleBot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__6"


    // $ANTLR start "rule__TurtleBot__Group__6__Impl"
    // InternalTurtleBotMissionDSL.g:549:1: rule__TurtleBot__Group__6__Impl : ( ( rule__TurtleBot__AreaAssignment_6 ) ) ;
    public final void rule__TurtleBot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:553:1: ( ( ( rule__TurtleBot__AreaAssignment_6 ) ) )
            // InternalTurtleBotMissionDSL.g:554:1: ( ( rule__TurtleBot__AreaAssignment_6 ) )
            {
            // InternalTurtleBotMissionDSL.g:554:1: ( ( rule__TurtleBot__AreaAssignment_6 ) )
            // InternalTurtleBotMissionDSL.g:555:2: ( rule__TurtleBot__AreaAssignment_6 )
            {
             before(grammarAccess.getTurtleBotAccess().getAreaAssignment_6()); 
            // InternalTurtleBotMissionDSL.g:556:2: ( rule__TurtleBot__AreaAssignment_6 )
            // InternalTurtleBotMissionDSL.g:556:3: rule__TurtleBot__AreaAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__AreaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getAreaAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__6__Impl"


    // $ANTLR start "rule__TurtleBot__Group__7"
    // InternalTurtleBotMissionDSL.g:564:1: rule__TurtleBot__Group__7 : rule__TurtleBot__Group__7__Impl rule__TurtleBot__Group__8 ;
    public final void rule__TurtleBot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:568:1: ( rule__TurtleBot__Group__7__Impl rule__TurtleBot__Group__8 )
            // InternalTurtleBotMissionDSL.g:569:2: rule__TurtleBot__Group__7__Impl rule__TurtleBot__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__7"


    // $ANTLR start "rule__TurtleBot__Group__7__Impl"
    // InternalTurtleBotMissionDSL.g:576:1: rule__TurtleBot__Group__7__Impl : ( 'waypointtypes' ) ;
    public final void rule__TurtleBot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:580:1: ( ( 'waypointtypes' ) )
            // InternalTurtleBotMissionDSL.g:581:1: ( 'waypointtypes' )
            {
            // InternalTurtleBotMissionDSL.g:581:1: ( 'waypointtypes' )
            // InternalTurtleBotMissionDSL.g:582:2: 'waypointtypes'
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getWaypointtypesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__7__Impl"


    // $ANTLR start "rule__TurtleBot__Group__8"
    // InternalTurtleBotMissionDSL.g:591:1: rule__TurtleBot__Group__8 : rule__TurtleBot__Group__8__Impl rule__TurtleBot__Group__9 ;
    public final void rule__TurtleBot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:595:1: ( rule__TurtleBot__Group__8__Impl rule__TurtleBot__Group__9 )
            // InternalTurtleBotMissionDSL.g:596:2: rule__TurtleBot__Group__8__Impl rule__TurtleBot__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__TurtleBot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__8"


    // $ANTLR start "rule__TurtleBot__Group__8__Impl"
    // InternalTurtleBotMissionDSL.g:603:1: rule__TurtleBot__Group__8__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:607:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:608:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:608:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:609:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__8__Impl"


    // $ANTLR start "rule__TurtleBot__Group__9"
    // InternalTurtleBotMissionDSL.g:618:1: rule__TurtleBot__Group__9 : rule__TurtleBot__Group__9__Impl rule__TurtleBot__Group__10 ;
    public final void rule__TurtleBot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:622:1: ( rule__TurtleBot__Group__9__Impl rule__TurtleBot__Group__10 )
            // InternalTurtleBotMissionDSL.g:623:2: rule__TurtleBot__Group__9__Impl rule__TurtleBot__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__TurtleBot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__9"


    // $ANTLR start "rule__TurtleBot__Group__9__Impl"
    // InternalTurtleBotMissionDSL.g:630:1: rule__TurtleBot__Group__9__Impl : ( ( rule__TurtleBot__WaypointtypesAssignment_9 ) ) ;
    public final void rule__TurtleBot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:634:1: ( ( ( rule__TurtleBot__WaypointtypesAssignment_9 ) ) )
            // InternalTurtleBotMissionDSL.g:635:1: ( ( rule__TurtleBot__WaypointtypesAssignment_9 ) )
            {
            // InternalTurtleBotMissionDSL.g:635:1: ( ( rule__TurtleBot__WaypointtypesAssignment_9 ) )
            // InternalTurtleBotMissionDSL.g:636:2: ( rule__TurtleBot__WaypointtypesAssignment_9 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_9()); 
            // InternalTurtleBotMissionDSL.g:637:2: ( rule__TurtleBot__WaypointtypesAssignment_9 )
            // InternalTurtleBotMissionDSL.g:637:3: rule__TurtleBot__WaypointtypesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointtypesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__9__Impl"


    // $ANTLR start "rule__TurtleBot__Group__10"
    // InternalTurtleBotMissionDSL.g:645:1: rule__TurtleBot__Group__10 : rule__TurtleBot__Group__10__Impl rule__TurtleBot__Group__11 ;
    public final void rule__TurtleBot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:649:1: ( rule__TurtleBot__Group__10__Impl rule__TurtleBot__Group__11 )
            // InternalTurtleBotMissionDSL.g:650:2: rule__TurtleBot__Group__10__Impl rule__TurtleBot__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__TurtleBot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__10"


    // $ANTLR start "rule__TurtleBot__Group__10__Impl"
    // InternalTurtleBotMissionDSL.g:657:1: rule__TurtleBot__Group__10__Impl : ( ( rule__TurtleBot__Group_10__0 )* ) ;
    public final void rule__TurtleBot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:661:1: ( ( ( rule__TurtleBot__Group_10__0 )* ) )
            // InternalTurtleBotMissionDSL.g:662:1: ( ( rule__TurtleBot__Group_10__0 )* )
            {
            // InternalTurtleBotMissionDSL.g:662:1: ( ( rule__TurtleBot__Group_10__0 )* )
            // InternalTurtleBotMissionDSL.g:663:2: ( rule__TurtleBot__Group_10__0 )*
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_10()); 
            // InternalTurtleBotMissionDSL.g:664:2: ( rule__TurtleBot__Group_10__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:664:3: rule__TurtleBot__Group_10__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TurtleBot__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTurtleBotAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__10__Impl"


    // $ANTLR start "rule__TurtleBot__Group__11"
    // InternalTurtleBotMissionDSL.g:672:1: rule__TurtleBot__Group__11 : rule__TurtleBot__Group__11__Impl rule__TurtleBot__Group__12 ;
    public final void rule__TurtleBot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:676:1: ( rule__TurtleBot__Group__11__Impl rule__TurtleBot__Group__12 )
            // InternalTurtleBotMissionDSL.g:677:2: rule__TurtleBot__Group__11__Impl rule__TurtleBot__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__TurtleBot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__11"


    // $ANTLR start "rule__TurtleBot__Group__11__Impl"
    // InternalTurtleBotMissionDSL.g:684:1: rule__TurtleBot__Group__11__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:688:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:689:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:689:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:690:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__11__Impl"


    // $ANTLR start "rule__TurtleBot__Group__12"
    // InternalTurtleBotMissionDSL.g:699:1: rule__TurtleBot__Group__12 : rule__TurtleBot__Group__12__Impl rule__TurtleBot__Group__13 ;
    public final void rule__TurtleBot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:703:1: ( rule__TurtleBot__Group__12__Impl rule__TurtleBot__Group__13 )
            // InternalTurtleBotMissionDSL.g:704:2: rule__TurtleBot__Group__12__Impl rule__TurtleBot__Group__13
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__12"


    // $ANTLR start "rule__TurtleBot__Group__12__Impl"
    // InternalTurtleBotMissionDSL.g:711:1: rule__TurtleBot__Group__12__Impl : ( 'waypoints' ) ;
    public final void rule__TurtleBot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:715:1: ( ( 'waypoints' ) )
            // InternalTurtleBotMissionDSL.g:716:1: ( 'waypoints' )
            {
            // InternalTurtleBotMissionDSL.g:716:1: ( 'waypoints' )
            // InternalTurtleBotMissionDSL.g:717:2: 'waypoints'
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getWaypointsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__12__Impl"


    // $ANTLR start "rule__TurtleBot__Group__13"
    // InternalTurtleBotMissionDSL.g:726:1: rule__TurtleBot__Group__13 : rule__TurtleBot__Group__13__Impl rule__TurtleBot__Group__14 ;
    public final void rule__TurtleBot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:730:1: ( rule__TurtleBot__Group__13__Impl rule__TurtleBot__Group__14 )
            // InternalTurtleBotMissionDSL.g:731:2: rule__TurtleBot__Group__13__Impl rule__TurtleBot__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__TurtleBot__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__13"


    // $ANTLR start "rule__TurtleBot__Group__13__Impl"
    // InternalTurtleBotMissionDSL.g:738:1: rule__TurtleBot__Group__13__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:742:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:743:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:743:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:744:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__13__Impl"


    // $ANTLR start "rule__TurtleBot__Group__14"
    // InternalTurtleBotMissionDSL.g:753:1: rule__TurtleBot__Group__14 : rule__TurtleBot__Group__14__Impl rule__TurtleBot__Group__15 ;
    public final void rule__TurtleBot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:757:1: ( rule__TurtleBot__Group__14__Impl rule__TurtleBot__Group__15 )
            // InternalTurtleBotMissionDSL.g:758:2: rule__TurtleBot__Group__14__Impl rule__TurtleBot__Group__15
            {
            pushFollow(FOLLOW_10);
            rule__TurtleBot__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__14"


    // $ANTLR start "rule__TurtleBot__Group__14__Impl"
    // InternalTurtleBotMissionDSL.g:765:1: rule__TurtleBot__Group__14__Impl : ( ( rule__TurtleBot__WaypointsAssignment_14 ) ) ;
    public final void rule__TurtleBot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:769:1: ( ( ( rule__TurtleBot__WaypointsAssignment_14 ) ) )
            // InternalTurtleBotMissionDSL.g:770:1: ( ( rule__TurtleBot__WaypointsAssignment_14 ) )
            {
            // InternalTurtleBotMissionDSL.g:770:1: ( ( rule__TurtleBot__WaypointsAssignment_14 ) )
            // InternalTurtleBotMissionDSL.g:771:2: ( rule__TurtleBot__WaypointsAssignment_14 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_14()); 
            // InternalTurtleBotMissionDSL.g:772:2: ( rule__TurtleBot__WaypointsAssignment_14 )
            // InternalTurtleBotMissionDSL.g:772:3: rule__TurtleBot__WaypointsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__14__Impl"


    // $ANTLR start "rule__TurtleBot__Group__15"
    // InternalTurtleBotMissionDSL.g:780:1: rule__TurtleBot__Group__15 : rule__TurtleBot__Group__15__Impl rule__TurtleBot__Group__16 ;
    public final void rule__TurtleBot__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:784:1: ( rule__TurtleBot__Group__15__Impl rule__TurtleBot__Group__16 )
            // InternalTurtleBotMissionDSL.g:785:2: rule__TurtleBot__Group__15__Impl rule__TurtleBot__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__TurtleBot__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__15"


    // $ANTLR start "rule__TurtleBot__Group__15__Impl"
    // InternalTurtleBotMissionDSL.g:792:1: rule__TurtleBot__Group__15__Impl : ( ( rule__TurtleBot__Group_15__0 )* ) ;
    public final void rule__TurtleBot__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:796:1: ( ( ( rule__TurtleBot__Group_15__0 )* ) )
            // InternalTurtleBotMissionDSL.g:797:1: ( ( rule__TurtleBot__Group_15__0 )* )
            {
            // InternalTurtleBotMissionDSL.g:797:1: ( ( rule__TurtleBot__Group_15__0 )* )
            // InternalTurtleBotMissionDSL.g:798:2: ( rule__TurtleBot__Group_15__0 )*
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_15()); 
            // InternalTurtleBotMissionDSL.g:799:2: ( rule__TurtleBot__Group_15__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:799:3: rule__TurtleBot__Group_15__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TurtleBot__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTurtleBotAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__15__Impl"


    // $ANTLR start "rule__TurtleBot__Group__16"
    // InternalTurtleBotMissionDSL.g:807:1: rule__TurtleBot__Group__16 : rule__TurtleBot__Group__16__Impl rule__TurtleBot__Group__17 ;
    public final void rule__TurtleBot__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:811:1: ( rule__TurtleBot__Group__16__Impl rule__TurtleBot__Group__17 )
            // InternalTurtleBotMissionDSL.g:812:2: rule__TurtleBot__Group__16__Impl rule__TurtleBot__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__TurtleBot__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__16"


    // $ANTLR start "rule__TurtleBot__Group__16__Impl"
    // InternalTurtleBotMissionDSL.g:819:1: rule__TurtleBot__Group__16__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:823:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:824:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:824:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:825:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_16()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__16__Impl"


    // $ANTLR start "rule__TurtleBot__Group__17"
    // InternalTurtleBotMissionDSL.g:834:1: rule__TurtleBot__Group__17 : rule__TurtleBot__Group__17__Impl rule__TurtleBot__Group__18 ;
    public final void rule__TurtleBot__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:838:1: ( rule__TurtleBot__Group__17__Impl rule__TurtleBot__Group__18 )
            // InternalTurtleBotMissionDSL.g:839:2: rule__TurtleBot__Group__17__Impl rule__TurtleBot__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__TurtleBot__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__17"


    // $ANTLR start "rule__TurtleBot__Group__17__Impl"
    // InternalTurtleBotMissionDSL.g:846:1: rule__TurtleBot__Group__17__Impl : ( ( rule__TurtleBot__Group_17__0 )? ) ;
    public final void rule__TurtleBot__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:850:1: ( ( ( rule__TurtleBot__Group_17__0 )? ) )
            // InternalTurtleBotMissionDSL.g:851:1: ( ( rule__TurtleBot__Group_17__0 )? )
            {
            // InternalTurtleBotMissionDSL.g:851:1: ( ( rule__TurtleBot__Group_17__0 )? )
            // InternalTurtleBotMissionDSL.g:852:2: ( rule__TurtleBot__Group_17__0 )?
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_17()); 
            // InternalTurtleBotMissionDSL.g:853:2: ( rule__TurtleBot__Group_17__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:853:3: rule__TurtleBot__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TurtleBot__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurtleBotAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__17__Impl"


    // $ANTLR start "rule__TurtleBot__Group__18"
    // InternalTurtleBotMissionDSL.g:861:1: rule__TurtleBot__Group__18 : rule__TurtleBot__Group__18__Impl ;
    public final void rule__TurtleBot__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:865:1: ( rule__TurtleBot__Group__18__Impl )
            // InternalTurtleBotMissionDSL.g:866:2: rule__TurtleBot__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__18"


    // $ANTLR start "rule__TurtleBot__Group__18__Impl"
    // InternalTurtleBotMissionDSL.g:872:1: rule__TurtleBot__Group__18__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:876:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:877:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:877:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:878:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_18()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group__18__Impl"


    // $ANTLR start "rule__TurtleBot__Group_10__0"
    // InternalTurtleBotMissionDSL.g:888:1: rule__TurtleBot__Group_10__0 : rule__TurtleBot__Group_10__0__Impl rule__TurtleBot__Group_10__1 ;
    public final void rule__TurtleBot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:892:1: ( rule__TurtleBot__Group_10__0__Impl rule__TurtleBot__Group_10__1 )
            // InternalTurtleBotMissionDSL.g:893:2: rule__TurtleBot__Group_10__0__Impl rule__TurtleBot__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__TurtleBot__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_10__0"


    // $ANTLR start "rule__TurtleBot__Group_10__0__Impl"
    // InternalTurtleBotMissionDSL.g:900:1: rule__TurtleBot__Group_10__0__Impl : ( ',' ) ;
    public final void rule__TurtleBot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:904:1: ( ( ',' ) )
            // InternalTurtleBotMissionDSL.g:905:1: ( ',' )
            {
            // InternalTurtleBotMissionDSL.g:905:1: ( ',' )
            // InternalTurtleBotMissionDSL.g:906:2: ','
            {
             before(grammarAccess.getTurtleBotAccess().getCommaKeyword_10_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_10__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_10__1"
    // InternalTurtleBotMissionDSL.g:915:1: rule__TurtleBot__Group_10__1 : rule__TurtleBot__Group_10__1__Impl ;
    public final void rule__TurtleBot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:919:1: ( rule__TurtleBot__Group_10__1__Impl )
            // InternalTurtleBotMissionDSL.g:920:2: rule__TurtleBot__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_10__1"


    // $ANTLR start "rule__TurtleBot__Group_10__1__Impl"
    // InternalTurtleBotMissionDSL.g:926:1: rule__TurtleBot__Group_10__1__Impl : ( ( rule__TurtleBot__WaypointtypesAssignment_10_1 ) ) ;
    public final void rule__TurtleBot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:930:1: ( ( ( rule__TurtleBot__WaypointtypesAssignment_10_1 ) ) )
            // InternalTurtleBotMissionDSL.g:931:1: ( ( rule__TurtleBot__WaypointtypesAssignment_10_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:931:1: ( ( rule__TurtleBot__WaypointtypesAssignment_10_1 ) )
            // InternalTurtleBotMissionDSL.g:932:2: ( rule__TurtleBot__WaypointtypesAssignment_10_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_10_1()); 
            // InternalTurtleBotMissionDSL.g:933:2: ( rule__TurtleBot__WaypointtypesAssignment_10_1 )
            // InternalTurtleBotMissionDSL.g:933:3: rule__TurtleBot__WaypointtypesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointtypesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_10__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group_15__0"
    // InternalTurtleBotMissionDSL.g:942:1: rule__TurtleBot__Group_15__0 : rule__TurtleBot__Group_15__0__Impl rule__TurtleBot__Group_15__1 ;
    public final void rule__TurtleBot__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:946:1: ( rule__TurtleBot__Group_15__0__Impl rule__TurtleBot__Group_15__1 )
            // InternalTurtleBotMissionDSL.g:947:2: rule__TurtleBot__Group_15__0__Impl rule__TurtleBot__Group_15__1
            {
            pushFollow(FOLLOW_13);
            rule__TurtleBot__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_15__0"


    // $ANTLR start "rule__TurtleBot__Group_15__0__Impl"
    // InternalTurtleBotMissionDSL.g:954:1: rule__TurtleBot__Group_15__0__Impl : ( ',' ) ;
    public final void rule__TurtleBot__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:958:1: ( ( ',' ) )
            // InternalTurtleBotMissionDSL.g:959:1: ( ',' )
            {
            // InternalTurtleBotMissionDSL.g:959:1: ( ',' )
            // InternalTurtleBotMissionDSL.g:960:2: ','
            {
             before(grammarAccess.getTurtleBotAccess().getCommaKeyword_15_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_15__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_15__1"
    // InternalTurtleBotMissionDSL.g:969:1: rule__TurtleBot__Group_15__1 : rule__TurtleBot__Group_15__1__Impl ;
    public final void rule__TurtleBot__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:973:1: ( rule__TurtleBot__Group_15__1__Impl )
            // InternalTurtleBotMissionDSL.g:974:2: rule__TurtleBot__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_15__1"


    // $ANTLR start "rule__TurtleBot__Group_15__1__Impl"
    // InternalTurtleBotMissionDSL.g:980:1: rule__TurtleBot__Group_15__1__Impl : ( ( rule__TurtleBot__WaypointsAssignment_15_1 ) ) ;
    public final void rule__TurtleBot__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:984:1: ( ( ( rule__TurtleBot__WaypointsAssignment_15_1 ) ) )
            // InternalTurtleBotMissionDSL.g:985:1: ( ( rule__TurtleBot__WaypointsAssignment_15_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:985:1: ( ( rule__TurtleBot__WaypointsAssignment_15_1 ) )
            // InternalTurtleBotMissionDSL.g:986:2: ( rule__TurtleBot__WaypointsAssignment_15_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_15_1()); 
            // InternalTurtleBotMissionDSL.g:987:2: ( rule__TurtleBot__WaypointsAssignment_15_1 )
            // InternalTurtleBotMissionDSL.g:987:3: rule__TurtleBot__WaypointsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__WaypointsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getWaypointsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_15__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group_17__0"
    // InternalTurtleBotMissionDSL.g:996:1: rule__TurtleBot__Group_17__0 : rule__TurtleBot__Group_17__0__Impl rule__TurtleBot__Group_17__1 ;
    public final void rule__TurtleBot__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1000:1: ( rule__TurtleBot__Group_17__0__Impl rule__TurtleBot__Group_17__1 )
            // InternalTurtleBotMissionDSL.g:1001:2: rule__TurtleBot__Group_17__0__Impl rule__TurtleBot__Group_17__1
            {
            pushFollow(FOLLOW_4);
            rule__TurtleBot__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__0"


    // $ANTLR start "rule__TurtleBot__Group_17__0__Impl"
    // InternalTurtleBotMissionDSL.g:1008:1: rule__TurtleBot__Group_17__0__Impl : ( 'missions' ) ;
    public final void rule__TurtleBot__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1012:1: ( ( 'missions' ) )
            // InternalTurtleBotMissionDSL.g:1013:1: ( 'missions' )
            {
            // InternalTurtleBotMissionDSL.g:1013:1: ( 'missions' )
            // InternalTurtleBotMissionDSL.g:1014:2: 'missions'
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsKeyword_17_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getMissionsKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_17__1"
    // InternalTurtleBotMissionDSL.g:1023:1: rule__TurtleBot__Group_17__1 : rule__TurtleBot__Group_17__1__Impl rule__TurtleBot__Group_17__2 ;
    public final void rule__TurtleBot__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1027:1: ( rule__TurtleBot__Group_17__1__Impl rule__TurtleBot__Group_17__2 )
            // InternalTurtleBotMissionDSL.g:1028:2: rule__TurtleBot__Group_17__1__Impl rule__TurtleBot__Group_17__2
            {
            pushFollow(FOLLOW_15);
            rule__TurtleBot__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__1"


    // $ANTLR start "rule__TurtleBot__Group_17__1__Impl"
    // InternalTurtleBotMissionDSL.g:1035:1: rule__TurtleBot__Group_17__1__Impl : ( '{' ) ;
    public final void rule__TurtleBot__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1039:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:1040:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:1040:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:1041:2: '{'
            {
             before(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_17_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getLeftCurlyBracketKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__1__Impl"


    // $ANTLR start "rule__TurtleBot__Group_17__2"
    // InternalTurtleBotMissionDSL.g:1050:1: rule__TurtleBot__Group_17__2 : rule__TurtleBot__Group_17__2__Impl rule__TurtleBot__Group_17__3 ;
    public final void rule__TurtleBot__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1054:1: ( rule__TurtleBot__Group_17__2__Impl rule__TurtleBot__Group_17__3 )
            // InternalTurtleBotMissionDSL.g:1055:2: rule__TurtleBot__Group_17__2__Impl rule__TurtleBot__Group_17__3
            {
            pushFollow(FOLLOW_10);
            rule__TurtleBot__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__2"


    // $ANTLR start "rule__TurtleBot__Group_17__2__Impl"
    // InternalTurtleBotMissionDSL.g:1062:1: rule__TurtleBot__Group_17__2__Impl : ( ( rule__TurtleBot__MissionsAssignment_17_2 ) ) ;
    public final void rule__TurtleBot__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1066:1: ( ( ( rule__TurtleBot__MissionsAssignment_17_2 ) ) )
            // InternalTurtleBotMissionDSL.g:1067:1: ( ( rule__TurtleBot__MissionsAssignment_17_2 ) )
            {
            // InternalTurtleBotMissionDSL.g:1067:1: ( ( rule__TurtleBot__MissionsAssignment_17_2 ) )
            // InternalTurtleBotMissionDSL.g:1068:2: ( rule__TurtleBot__MissionsAssignment_17_2 )
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsAssignment_17_2()); 
            // InternalTurtleBotMissionDSL.g:1069:2: ( rule__TurtleBot__MissionsAssignment_17_2 )
            // InternalTurtleBotMissionDSL.g:1069:3: rule__TurtleBot__MissionsAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__MissionsAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getMissionsAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__2__Impl"


    // $ANTLR start "rule__TurtleBot__Group_17__3"
    // InternalTurtleBotMissionDSL.g:1077:1: rule__TurtleBot__Group_17__3 : rule__TurtleBot__Group_17__3__Impl rule__TurtleBot__Group_17__4 ;
    public final void rule__TurtleBot__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1081:1: ( rule__TurtleBot__Group_17__3__Impl rule__TurtleBot__Group_17__4 )
            // InternalTurtleBotMissionDSL.g:1082:2: rule__TurtleBot__Group_17__3__Impl rule__TurtleBot__Group_17__4
            {
            pushFollow(FOLLOW_10);
            rule__TurtleBot__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__3"


    // $ANTLR start "rule__TurtleBot__Group_17__3__Impl"
    // InternalTurtleBotMissionDSL.g:1089:1: rule__TurtleBot__Group_17__3__Impl : ( ( rule__TurtleBot__Group_17_3__0 )* ) ;
    public final void rule__TurtleBot__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1093:1: ( ( ( rule__TurtleBot__Group_17_3__0 )* ) )
            // InternalTurtleBotMissionDSL.g:1094:1: ( ( rule__TurtleBot__Group_17_3__0 )* )
            {
            // InternalTurtleBotMissionDSL.g:1094:1: ( ( rule__TurtleBot__Group_17_3__0 )* )
            // InternalTurtleBotMissionDSL.g:1095:2: ( rule__TurtleBot__Group_17_3__0 )*
            {
             before(grammarAccess.getTurtleBotAccess().getGroup_17_3()); 
            // InternalTurtleBotMissionDSL.g:1096:2: ( rule__TurtleBot__Group_17_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:1096:3: rule__TurtleBot__Group_17_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TurtleBot__Group_17_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTurtleBotAccess().getGroup_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__3__Impl"


    // $ANTLR start "rule__TurtleBot__Group_17__4"
    // InternalTurtleBotMissionDSL.g:1104:1: rule__TurtleBot__Group_17__4 : rule__TurtleBot__Group_17__4__Impl ;
    public final void rule__TurtleBot__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1108:1: ( rule__TurtleBot__Group_17__4__Impl )
            // InternalTurtleBotMissionDSL.g:1109:2: rule__TurtleBot__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_17__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__4"


    // $ANTLR start "rule__TurtleBot__Group_17__4__Impl"
    // InternalTurtleBotMissionDSL.g:1115:1: rule__TurtleBot__Group_17__4__Impl : ( '}' ) ;
    public final void rule__TurtleBot__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1119:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:1120:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:1120:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:1121:2: '}'
            {
             before(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_17_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getRightCurlyBracketKeyword_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17__4__Impl"


    // $ANTLR start "rule__TurtleBot__Group_17_3__0"
    // InternalTurtleBotMissionDSL.g:1131:1: rule__TurtleBot__Group_17_3__0 : rule__TurtleBot__Group_17_3__0__Impl rule__TurtleBot__Group_17_3__1 ;
    public final void rule__TurtleBot__Group_17_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1135:1: ( rule__TurtleBot__Group_17_3__0__Impl rule__TurtleBot__Group_17_3__1 )
            // InternalTurtleBotMissionDSL.g:1136:2: rule__TurtleBot__Group_17_3__0__Impl rule__TurtleBot__Group_17_3__1
            {
            pushFollow(FOLLOW_15);
            rule__TurtleBot__Group_17_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_17_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17_3__0"


    // $ANTLR start "rule__TurtleBot__Group_17_3__0__Impl"
    // InternalTurtleBotMissionDSL.g:1143:1: rule__TurtleBot__Group_17_3__0__Impl : ( ',' ) ;
    public final void rule__TurtleBot__Group_17_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1147:1: ( ( ',' ) )
            // InternalTurtleBotMissionDSL.g:1148:1: ( ',' )
            {
            // InternalTurtleBotMissionDSL.g:1148:1: ( ',' )
            // InternalTurtleBotMissionDSL.g:1149:2: ','
            {
             before(grammarAccess.getTurtleBotAccess().getCommaKeyword_17_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTurtleBotAccess().getCommaKeyword_17_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17_3__0__Impl"


    // $ANTLR start "rule__TurtleBot__Group_17_3__1"
    // InternalTurtleBotMissionDSL.g:1158:1: rule__TurtleBot__Group_17_3__1 : rule__TurtleBot__Group_17_3__1__Impl ;
    public final void rule__TurtleBot__Group_17_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1162:1: ( rule__TurtleBot__Group_17_3__1__Impl )
            // InternalTurtleBotMissionDSL.g:1163:2: rule__TurtleBot__Group_17_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__Group_17_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17_3__1"


    // $ANTLR start "rule__TurtleBot__Group_17_3__1__Impl"
    // InternalTurtleBotMissionDSL.g:1169:1: rule__TurtleBot__Group_17_3__1__Impl : ( ( rule__TurtleBot__MissionsAssignment_17_3_1 ) ) ;
    public final void rule__TurtleBot__Group_17_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1173:1: ( ( ( rule__TurtleBot__MissionsAssignment_17_3_1 ) ) )
            // InternalTurtleBotMissionDSL.g:1174:1: ( ( rule__TurtleBot__MissionsAssignment_17_3_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:1174:1: ( ( rule__TurtleBot__MissionsAssignment_17_3_1 ) )
            // InternalTurtleBotMissionDSL.g:1175:2: ( rule__TurtleBot__MissionsAssignment_17_3_1 )
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsAssignment_17_3_1()); 
            // InternalTurtleBotMissionDSL.g:1176:2: ( rule__TurtleBot__MissionsAssignment_17_3_1 )
            // InternalTurtleBotMissionDSL.g:1176:3: rule__TurtleBot__MissionsAssignment_17_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TurtleBot__MissionsAssignment_17_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTurtleBotAccess().getMissionsAssignment_17_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Group_17_3__1__Impl"


    // $ANTLR start "rule__Area__Group__0"
    // InternalTurtleBotMissionDSL.g:1185:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1189:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalTurtleBotMissionDSL.g:1190:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Area__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0"


    // $ANTLR start "rule__Area__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:1197:1: rule__Area__Group__0__Impl : ( () ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1201:1: ( ( () ) )
            // InternalTurtleBotMissionDSL.g:1202:1: ( () )
            {
            // InternalTurtleBotMissionDSL.g:1202:1: ( () )
            // InternalTurtleBotMissionDSL.g:1203:2: ()
            {
             before(grammarAccess.getAreaAccess().getAreaAction_0()); 
            // InternalTurtleBotMissionDSL.g:1204:2: ()
            // InternalTurtleBotMissionDSL.g:1204:3: 
            {
            }

             after(grammarAccess.getAreaAccess().getAreaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0__Impl"


    // $ANTLR start "rule__Area__Group__1"
    // InternalTurtleBotMissionDSL.g:1212:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1216:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalTurtleBotMissionDSL.g:1217:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Area__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1"


    // $ANTLR start "rule__Area__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:1224:1: rule__Area__Group__1__Impl : ( 'Area' ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1228:1: ( ( 'Area' ) )
            // InternalTurtleBotMissionDSL.g:1229:1: ( 'Area' )
            {
            // InternalTurtleBotMissionDSL.g:1229:1: ( 'Area' )
            // InternalTurtleBotMissionDSL.g:1230:2: 'Area'
            {
             before(grammarAccess.getAreaAccess().getAreaKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getAreaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1__Impl"


    // $ANTLR start "rule__Area__Group__2"
    // InternalTurtleBotMissionDSL.g:1239:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1243:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalTurtleBotMissionDSL.g:1244:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Area__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2"


    // $ANTLR start "rule__Area__Group__2__Impl"
    // InternalTurtleBotMissionDSL.g:1251:1: rule__Area__Group__2__Impl : ( '{' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1255:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:1256:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:1256:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:1257:2: '{'
            {
             before(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2__Impl"


    // $ANTLR start "rule__Area__Group__3"
    // InternalTurtleBotMissionDSL.g:1266:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1270:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalTurtleBotMissionDSL.g:1271:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Area__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3"


    // $ANTLR start "rule__Area__Group__3__Impl"
    // InternalTurtleBotMissionDSL.g:1278:1: rule__Area__Group__3__Impl : ( ( rule__Area__Group_3__0 )? ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1282:1: ( ( ( rule__Area__Group_3__0 )? ) )
            // InternalTurtleBotMissionDSL.g:1283:1: ( ( rule__Area__Group_3__0 )? )
            {
            // InternalTurtleBotMissionDSL.g:1283:1: ( ( rule__Area__Group_3__0 )? )
            // InternalTurtleBotMissionDSL.g:1284:2: ( rule__Area__Group_3__0 )?
            {
             before(grammarAccess.getAreaAccess().getGroup_3()); 
            // InternalTurtleBotMissionDSL.g:1285:2: ( rule__Area__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:1285:3: rule__Area__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Area__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3__Impl"


    // $ANTLR start "rule__Area__Group__4"
    // InternalTurtleBotMissionDSL.g:1293:1: rule__Area__Group__4 : rule__Area__Group__4__Impl rule__Area__Group__5 ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1297:1: ( rule__Area__Group__4__Impl rule__Area__Group__5 )
            // InternalTurtleBotMissionDSL.g:1298:2: rule__Area__Group__4__Impl rule__Area__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Area__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4"


    // $ANTLR start "rule__Area__Group__4__Impl"
    // InternalTurtleBotMissionDSL.g:1305:1: rule__Area__Group__4__Impl : ( ( rule__Area__Group_4__0 )? ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1309:1: ( ( ( rule__Area__Group_4__0 )? ) )
            // InternalTurtleBotMissionDSL.g:1310:1: ( ( rule__Area__Group_4__0 )? )
            {
            // InternalTurtleBotMissionDSL.g:1310:1: ( ( rule__Area__Group_4__0 )? )
            // InternalTurtleBotMissionDSL.g:1311:2: ( rule__Area__Group_4__0 )?
            {
             before(grammarAccess.getAreaAccess().getGroup_4()); 
            // InternalTurtleBotMissionDSL.g:1312:2: ( rule__Area__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:1312:3: rule__Area__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Area__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4__Impl"


    // $ANTLR start "rule__Area__Group__5"
    // InternalTurtleBotMissionDSL.g:1320:1: rule__Area__Group__5 : rule__Area__Group__5__Impl ;
    public final void rule__Area__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1324:1: ( rule__Area__Group__5__Impl )
            // InternalTurtleBotMissionDSL.g:1325:2: rule__Area__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5"


    // $ANTLR start "rule__Area__Group__5__Impl"
    // InternalTurtleBotMissionDSL.g:1331:1: rule__Area__Group__5__Impl : ( '}' ) ;
    public final void rule__Area__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1335:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:1336:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:1336:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:1337:2: '}'
            {
             before(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5__Impl"


    // $ANTLR start "rule__Area__Group_3__0"
    // InternalTurtleBotMissionDSL.g:1347:1: rule__Area__Group_3__0 : rule__Area__Group_3__0__Impl rule__Area__Group_3__1 ;
    public final void rule__Area__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1351:1: ( rule__Area__Group_3__0__Impl rule__Area__Group_3__1 )
            // InternalTurtleBotMissionDSL.g:1352:2: rule__Area__Group_3__0__Impl rule__Area__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Area__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_3__0"


    // $ANTLR start "rule__Area__Group_3__0__Impl"
    // InternalTurtleBotMissionDSL.g:1359:1: rule__Area__Group_3__0__Impl : ( 'xmax' ) ;
    public final void rule__Area__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1363:1: ( ( 'xmax' ) )
            // InternalTurtleBotMissionDSL.g:1364:1: ( 'xmax' )
            {
            // InternalTurtleBotMissionDSL.g:1364:1: ( 'xmax' )
            // InternalTurtleBotMissionDSL.g:1365:2: 'xmax'
            {
             before(grammarAccess.getAreaAccess().getXmaxKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getXmaxKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_3__0__Impl"


    // $ANTLR start "rule__Area__Group_3__1"
    // InternalTurtleBotMissionDSL.g:1374:1: rule__Area__Group_3__1 : rule__Area__Group_3__1__Impl ;
    public final void rule__Area__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1378:1: ( rule__Area__Group_3__1__Impl )
            // InternalTurtleBotMissionDSL.g:1379:2: rule__Area__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_3__1"


    // $ANTLR start "rule__Area__Group_3__1__Impl"
    // InternalTurtleBotMissionDSL.g:1385:1: rule__Area__Group_3__1__Impl : ( ( rule__Area__XmaxAssignment_3_1 ) ) ;
    public final void rule__Area__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1389:1: ( ( ( rule__Area__XmaxAssignment_3_1 ) ) )
            // InternalTurtleBotMissionDSL.g:1390:1: ( ( rule__Area__XmaxAssignment_3_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:1390:1: ( ( rule__Area__XmaxAssignment_3_1 ) )
            // InternalTurtleBotMissionDSL.g:1391:2: ( rule__Area__XmaxAssignment_3_1 )
            {
             before(grammarAccess.getAreaAccess().getXmaxAssignment_3_1()); 
            // InternalTurtleBotMissionDSL.g:1392:2: ( rule__Area__XmaxAssignment_3_1 )
            // InternalTurtleBotMissionDSL.g:1392:3: rule__Area__XmaxAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__XmaxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getXmaxAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_3__1__Impl"


    // $ANTLR start "rule__Area__Group_4__0"
    // InternalTurtleBotMissionDSL.g:1401:1: rule__Area__Group_4__0 : rule__Area__Group_4__0__Impl rule__Area__Group_4__1 ;
    public final void rule__Area__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1405:1: ( rule__Area__Group_4__0__Impl rule__Area__Group_4__1 )
            // InternalTurtleBotMissionDSL.g:1406:2: rule__Area__Group_4__0__Impl rule__Area__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Area__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_4__0"


    // $ANTLR start "rule__Area__Group_4__0__Impl"
    // InternalTurtleBotMissionDSL.g:1413:1: rule__Area__Group_4__0__Impl : ( 'ymax' ) ;
    public final void rule__Area__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1417:1: ( ( 'ymax' ) )
            // InternalTurtleBotMissionDSL.g:1418:1: ( 'ymax' )
            {
            // InternalTurtleBotMissionDSL.g:1418:1: ( 'ymax' )
            // InternalTurtleBotMissionDSL.g:1419:2: 'ymax'
            {
             before(grammarAccess.getAreaAccess().getYmaxKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getYmaxKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_4__0__Impl"


    // $ANTLR start "rule__Area__Group_4__1"
    // InternalTurtleBotMissionDSL.g:1428:1: rule__Area__Group_4__1 : rule__Area__Group_4__1__Impl ;
    public final void rule__Area__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1432:1: ( rule__Area__Group_4__1__Impl )
            // InternalTurtleBotMissionDSL.g:1433:2: rule__Area__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_4__1"


    // $ANTLR start "rule__Area__Group_4__1__Impl"
    // InternalTurtleBotMissionDSL.g:1439:1: rule__Area__Group_4__1__Impl : ( ( rule__Area__YmaxAssignment_4_1 ) ) ;
    public final void rule__Area__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1443:1: ( ( ( rule__Area__YmaxAssignment_4_1 ) ) )
            // InternalTurtleBotMissionDSL.g:1444:1: ( ( rule__Area__YmaxAssignment_4_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:1444:1: ( ( rule__Area__YmaxAssignment_4_1 ) )
            // InternalTurtleBotMissionDSL.g:1445:2: ( rule__Area__YmaxAssignment_4_1 )
            {
             before(grammarAccess.getAreaAccess().getYmaxAssignment_4_1()); 
            // InternalTurtleBotMissionDSL.g:1446:2: ( rule__Area__YmaxAssignment_4_1 )
            // InternalTurtleBotMissionDSL.g:1446:3: rule__Area__YmaxAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__YmaxAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getYmaxAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group_4__1__Impl"


    // $ANTLR start "rule__WaypointType__Group__0"
    // InternalTurtleBotMissionDSL.g:1455:1: rule__WaypointType__Group__0 : rule__WaypointType__Group__0__Impl rule__WaypointType__Group__1 ;
    public final void rule__WaypointType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1459:1: ( rule__WaypointType__Group__0__Impl rule__WaypointType__Group__1 )
            // InternalTurtleBotMissionDSL.g:1460:2: rule__WaypointType__Group__0__Impl rule__WaypointType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WaypointType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaypointType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__0"


    // $ANTLR start "rule__WaypointType__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:1467:1: rule__WaypointType__Group__0__Impl : ( () ) ;
    public final void rule__WaypointType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1471:1: ( ( () ) )
            // InternalTurtleBotMissionDSL.g:1472:1: ( () )
            {
            // InternalTurtleBotMissionDSL.g:1472:1: ( () )
            // InternalTurtleBotMissionDSL.g:1473:2: ()
            {
             before(grammarAccess.getWaypointTypeAccess().getWaypointTypeAction_0()); 
            // InternalTurtleBotMissionDSL.g:1474:2: ()
            // InternalTurtleBotMissionDSL.g:1474:3: 
            {
            }

             after(grammarAccess.getWaypointTypeAccess().getWaypointTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__0__Impl"


    // $ANTLR start "rule__WaypointType__Group__1"
    // InternalTurtleBotMissionDSL.g:1482:1: rule__WaypointType__Group__1 : rule__WaypointType__Group__1__Impl rule__WaypointType__Group__2 ;
    public final void rule__WaypointType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1486:1: ( rule__WaypointType__Group__1__Impl rule__WaypointType__Group__2 )
            // InternalTurtleBotMissionDSL.g:1487:2: rule__WaypointType__Group__1__Impl rule__WaypointType__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__WaypointType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaypointType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__1"


    // $ANTLR start "rule__WaypointType__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:1494:1: rule__WaypointType__Group__1__Impl : ( 'WaypointType' ) ;
    public final void rule__WaypointType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1498:1: ( ( 'WaypointType' ) )
            // InternalTurtleBotMissionDSL.g:1499:1: ( 'WaypointType' )
            {
            // InternalTurtleBotMissionDSL.g:1499:1: ( 'WaypointType' )
            // InternalTurtleBotMissionDSL.g:1500:2: 'WaypointType'
            {
             before(grammarAccess.getWaypointTypeAccess().getWaypointTypeKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWaypointTypeAccess().getWaypointTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__1__Impl"


    // $ANTLR start "rule__WaypointType__Group__2"
    // InternalTurtleBotMissionDSL.g:1509:1: rule__WaypointType__Group__2 : rule__WaypointType__Group__2__Impl ;
    public final void rule__WaypointType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1513:1: ( rule__WaypointType__Group__2__Impl )
            // InternalTurtleBotMissionDSL.g:1514:2: rule__WaypointType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaypointType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__2"


    // $ANTLR start "rule__WaypointType__Group__2__Impl"
    // InternalTurtleBotMissionDSL.g:1520:1: rule__WaypointType__Group__2__Impl : ( ( rule__WaypointType__NameAssignment_2 ) ) ;
    public final void rule__WaypointType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1524:1: ( ( ( rule__WaypointType__NameAssignment_2 ) ) )
            // InternalTurtleBotMissionDSL.g:1525:1: ( ( rule__WaypointType__NameAssignment_2 ) )
            {
            // InternalTurtleBotMissionDSL.g:1525:1: ( ( rule__WaypointType__NameAssignment_2 ) )
            // InternalTurtleBotMissionDSL.g:1526:2: ( rule__WaypointType__NameAssignment_2 )
            {
             before(grammarAccess.getWaypointTypeAccess().getNameAssignment_2()); 
            // InternalTurtleBotMissionDSL.g:1527:2: ( rule__WaypointType__NameAssignment_2 )
            // InternalTurtleBotMissionDSL.g:1527:3: rule__WaypointType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WaypointType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWaypointTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__Group__2__Impl"


    // $ANTLR start "rule__WayPoint__Group__0"
    // InternalTurtleBotMissionDSL.g:1536:1: rule__WayPoint__Group__0 : rule__WayPoint__Group__0__Impl rule__WayPoint__Group__1 ;
    public final void rule__WayPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1540:1: ( rule__WayPoint__Group__0__Impl rule__WayPoint__Group__1 )
            // InternalTurtleBotMissionDSL.g:1541:2: rule__WayPoint__Group__0__Impl rule__WayPoint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WayPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__0"


    // $ANTLR start "rule__WayPoint__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:1548:1: rule__WayPoint__Group__0__Impl : ( 'WayPoint' ) ;
    public final void rule__WayPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1552:1: ( ( 'WayPoint' ) )
            // InternalTurtleBotMissionDSL.g:1553:1: ( 'WayPoint' )
            {
            // InternalTurtleBotMissionDSL.g:1553:1: ( 'WayPoint' )
            // InternalTurtleBotMissionDSL.g:1554:2: 'WayPoint'
            {
             before(grammarAccess.getWayPointAccess().getWayPointKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getWayPointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__0__Impl"


    // $ANTLR start "rule__WayPoint__Group__1"
    // InternalTurtleBotMissionDSL.g:1563:1: rule__WayPoint__Group__1 : rule__WayPoint__Group__1__Impl rule__WayPoint__Group__2 ;
    public final void rule__WayPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1567:1: ( rule__WayPoint__Group__1__Impl rule__WayPoint__Group__2 )
            // InternalTurtleBotMissionDSL.g:1568:2: rule__WayPoint__Group__1__Impl rule__WayPoint__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WayPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__1"


    // $ANTLR start "rule__WayPoint__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:1575:1: rule__WayPoint__Group__1__Impl : ( ( rule__WayPoint__NameAssignment_1 ) ) ;
    public final void rule__WayPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1579:1: ( ( ( rule__WayPoint__NameAssignment_1 ) ) )
            // InternalTurtleBotMissionDSL.g:1580:1: ( ( rule__WayPoint__NameAssignment_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:1580:1: ( ( rule__WayPoint__NameAssignment_1 ) )
            // InternalTurtleBotMissionDSL.g:1581:2: ( rule__WayPoint__NameAssignment_1 )
            {
             before(grammarAccess.getWayPointAccess().getNameAssignment_1()); 
            // InternalTurtleBotMissionDSL.g:1582:2: ( rule__WayPoint__NameAssignment_1 )
            // InternalTurtleBotMissionDSL.g:1582:3: rule__WayPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__1__Impl"


    // $ANTLR start "rule__WayPoint__Group__2"
    // InternalTurtleBotMissionDSL.g:1590:1: rule__WayPoint__Group__2 : rule__WayPoint__Group__2__Impl rule__WayPoint__Group__3 ;
    public final void rule__WayPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1594:1: ( rule__WayPoint__Group__2__Impl rule__WayPoint__Group__3 )
            // InternalTurtleBotMissionDSL.g:1595:2: rule__WayPoint__Group__2__Impl rule__WayPoint__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__WayPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__2"


    // $ANTLR start "rule__WayPoint__Group__2__Impl"
    // InternalTurtleBotMissionDSL.g:1602:1: rule__WayPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__WayPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1606:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:1607:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:1607:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:1608:2: '{'
            {
             before(grammarAccess.getWayPointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__2__Impl"


    // $ANTLR start "rule__WayPoint__Group__3"
    // InternalTurtleBotMissionDSL.g:1617:1: rule__WayPoint__Group__3 : rule__WayPoint__Group__3__Impl rule__WayPoint__Group__4 ;
    public final void rule__WayPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1621:1: ( rule__WayPoint__Group__3__Impl rule__WayPoint__Group__4 )
            // InternalTurtleBotMissionDSL.g:1622:2: rule__WayPoint__Group__3__Impl rule__WayPoint__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__WayPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__3"


    // $ANTLR start "rule__WayPoint__Group__3__Impl"
    // InternalTurtleBotMissionDSL.g:1629:1: rule__WayPoint__Group__3__Impl : ( ( rule__WayPoint__Group_3__0 )? ) ;
    public final void rule__WayPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1633:1: ( ( ( rule__WayPoint__Group_3__0 )? ) )
            // InternalTurtleBotMissionDSL.g:1634:1: ( ( rule__WayPoint__Group_3__0 )? )
            {
            // InternalTurtleBotMissionDSL.g:1634:1: ( ( rule__WayPoint__Group_3__0 )? )
            // InternalTurtleBotMissionDSL.g:1635:2: ( rule__WayPoint__Group_3__0 )?
            {
             before(grammarAccess.getWayPointAccess().getGroup_3()); 
            // InternalTurtleBotMissionDSL.g:1636:2: ( rule__WayPoint__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:1636:3: rule__WayPoint__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WayPoint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWayPointAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__3__Impl"


    // $ANTLR start "rule__WayPoint__Group__4"
    // InternalTurtleBotMissionDSL.g:1644:1: rule__WayPoint__Group__4 : rule__WayPoint__Group__4__Impl rule__WayPoint__Group__5 ;
    public final void rule__WayPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1648:1: ( rule__WayPoint__Group__4__Impl rule__WayPoint__Group__5 )
            // InternalTurtleBotMissionDSL.g:1649:2: rule__WayPoint__Group__4__Impl rule__WayPoint__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__WayPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__4"


    // $ANTLR start "rule__WayPoint__Group__4__Impl"
    // InternalTurtleBotMissionDSL.g:1656:1: rule__WayPoint__Group__4__Impl : ( ( rule__WayPoint__Group_4__0 )? ) ;
    public final void rule__WayPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1660:1: ( ( ( rule__WayPoint__Group_4__0 )? ) )
            // InternalTurtleBotMissionDSL.g:1661:1: ( ( rule__WayPoint__Group_4__0 )? )
            {
            // InternalTurtleBotMissionDSL.g:1661:1: ( ( rule__WayPoint__Group_4__0 )? )
            // InternalTurtleBotMissionDSL.g:1662:2: ( rule__WayPoint__Group_4__0 )?
            {
             before(grammarAccess.getWayPointAccess().getGroup_4()); 
            // InternalTurtleBotMissionDSL.g:1663:2: ( rule__WayPoint__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:1663:3: rule__WayPoint__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WayPoint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWayPointAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__4__Impl"


    // $ANTLR start "rule__WayPoint__Group__5"
    // InternalTurtleBotMissionDSL.g:1671:1: rule__WayPoint__Group__5 : rule__WayPoint__Group__5__Impl rule__WayPoint__Group__6 ;
    public final void rule__WayPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1675:1: ( rule__WayPoint__Group__5__Impl rule__WayPoint__Group__6 )
            // InternalTurtleBotMissionDSL.g:1676:2: rule__WayPoint__Group__5__Impl rule__WayPoint__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__WayPoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__5"


    // $ANTLR start "rule__WayPoint__Group__5__Impl"
    // InternalTurtleBotMissionDSL.g:1683:1: rule__WayPoint__Group__5__Impl : ( 'waypointtypes' ) ;
    public final void rule__WayPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1687:1: ( ( 'waypointtypes' ) )
            // InternalTurtleBotMissionDSL.g:1688:1: ( 'waypointtypes' )
            {
            // InternalTurtleBotMissionDSL.g:1688:1: ( 'waypointtypes' )
            // InternalTurtleBotMissionDSL.g:1689:2: 'waypointtypes'
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getWaypointtypesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__5__Impl"


    // $ANTLR start "rule__WayPoint__Group__6"
    // InternalTurtleBotMissionDSL.g:1698:1: rule__WayPoint__Group__6 : rule__WayPoint__Group__6__Impl rule__WayPoint__Group__7 ;
    public final void rule__WayPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1702:1: ( rule__WayPoint__Group__6__Impl rule__WayPoint__Group__7 )
            // InternalTurtleBotMissionDSL.g:1703:2: rule__WayPoint__Group__6__Impl rule__WayPoint__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__WayPoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__6"


    // $ANTLR start "rule__WayPoint__Group__6__Impl"
    // InternalTurtleBotMissionDSL.g:1710:1: rule__WayPoint__Group__6__Impl : ( '(' ) ;
    public final void rule__WayPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1714:1: ( ( '(' ) )
            // InternalTurtleBotMissionDSL.g:1715:1: ( '(' )
            {
            // InternalTurtleBotMissionDSL.g:1715:1: ( '(' )
            // InternalTurtleBotMissionDSL.g:1716:2: '('
            {
             before(grammarAccess.getWayPointAccess().getLeftParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__6__Impl"


    // $ANTLR start "rule__WayPoint__Group__7"
    // InternalTurtleBotMissionDSL.g:1725:1: rule__WayPoint__Group__7 : rule__WayPoint__Group__7__Impl rule__WayPoint__Group__8 ;
    public final void rule__WayPoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1729:1: ( rule__WayPoint__Group__7__Impl rule__WayPoint__Group__8 )
            // InternalTurtleBotMissionDSL.g:1730:2: rule__WayPoint__Group__7__Impl rule__WayPoint__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__WayPoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__7"


    // $ANTLR start "rule__WayPoint__Group__7__Impl"
    // InternalTurtleBotMissionDSL.g:1737:1: rule__WayPoint__Group__7__Impl : ( ( rule__WayPoint__WaypointtypesAssignment_7 ) ) ;
    public final void rule__WayPoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1741:1: ( ( ( rule__WayPoint__WaypointtypesAssignment_7 ) ) )
            // InternalTurtleBotMissionDSL.g:1742:1: ( ( rule__WayPoint__WaypointtypesAssignment_7 ) )
            {
            // InternalTurtleBotMissionDSL.g:1742:1: ( ( rule__WayPoint__WaypointtypesAssignment_7 ) )
            // InternalTurtleBotMissionDSL.g:1743:2: ( rule__WayPoint__WaypointtypesAssignment_7 )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_7()); 
            // InternalTurtleBotMissionDSL.g:1744:2: ( rule__WayPoint__WaypointtypesAssignment_7 )
            // InternalTurtleBotMissionDSL.g:1744:3: rule__WayPoint__WaypointtypesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__WaypointtypesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__7__Impl"


    // $ANTLR start "rule__WayPoint__Group__8"
    // InternalTurtleBotMissionDSL.g:1752:1: rule__WayPoint__Group__8 : rule__WayPoint__Group__8__Impl rule__WayPoint__Group__9 ;
    public final void rule__WayPoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1756:1: ( rule__WayPoint__Group__8__Impl rule__WayPoint__Group__9 )
            // InternalTurtleBotMissionDSL.g:1757:2: rule__WayPoint__Group__8__Impl rule__WayPoint__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__WayPoint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__8"


    // $ANTLR start "rule__WayPoint__Group__8__Impl"
    // InternalTurtleBotMissionDSL.g:1764:1: rule__WayPoint__Group__8__Impl : ( ( rule__WayPoint__Group_8__0 )* ) ;
    public final void rule__WayPoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1768:1: ( ( ( rule__WayPoint__Group_8__0 )* ) )
            // InternalTurtleBotMissionDSL.g:1769:1: ( ( rule__WayPoint__Group_8__0 )* )
            {
            // InternalTurtleBotMissionDSL.g:1769:1: ( ( rule__WayPoint__Group_8__0 )* )
            // InternalTurtleBotMissionDSL.g:1770:2: ( rule__WayPoint__Group_8__0 )*
            {
             before(grammarAccess.getWayPointAccess().getGroup_8()); 
            // InternalTurtleBotMissionDSL.g:1771:2: ( rule__WayPoint__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:1771:3: rule__WayPoint__Group_8__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__WayPoint__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWayPointAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__8__Impl"


    // $ANTLR start "rule__WayPoint__Group__9"
    // InternalTurtleBotMissionDSL.g:1779:1: rule__WayPoint__Group__9 : rule__WayPoint__Group__9__Impl rule__WayPoint__Group__10 ;
    public final void rule__WayPoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1783:1: ( rule__WayPoint__Group__9__Impl rule__WayPoint__Group__10 )
            // InternalTurtleBotMissionDSL.g:1784:2: rule__WayPoint__Group__9__Impl rule__WayPoint__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__WayPoint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__9"


    // $ANTLR start "rule__WayPoint__Group__9__Impl"
    // InternalTurtleBotMissionDSL.g:1791:1: rule__WayPoint__Group__9__Impl : ( ')' ) ;
    public final void rule__WayPoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1795:1: ( ( ')' ) )
            // InternalTurtleBotMissionDSL.g:1796:1: ( ')' )
            {
            // InternalTurtleBotMissionDSL.g:1796:1: ( ')' )
            // InternalTurtleBotMissionDSL.g:1797:2: ')'
            {
             before(grammarAccess.getWayPointAccess().getRightParenthesisKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__9__Impl"


    // $ANTLR start "rule__WayPoint__Group__10"
    // InternalTurtleBotMissionDSL.g:1806:1: rule__WayPoint__Group__10 : rule__WayPoint__Group__10__Impl ;
    public final void rule__WayPoint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1810:1: ( rule__WayPoint__Group__10__Impl )
            // InternalTurtleBotMissionDSL.g:1811:2: rule__WayPoint__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__10"


    // $ANTLR start "rule__WayPoint__Group__10__Impl"
    // InternalTurtleBotMissionDSL.g:1817:1: rule__WayPoint__Group__10__Impl : ( '}' ) ;
    public final void rule__WayPoint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1821:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:1822:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:1822:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:1823:2: '}'
            {
             before(grammarAccess.getWayPointAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group__10__Impl"


    // $ANTLR start "rule__WayPoint__Group_3__0"
    // InternalTurtleBotMissionDSL.g:1833:1: rule__WayPoint__Group_3__0 : rule__WayPoint__Group_3__0__Impl rule__WayPoint__Group_3__1 ;
    public final void rule__WayPoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1837:1: ( rule__WayPoint__Group_3__0__Impl rule__WayPoint__Group_3__1 )
            // InternalTurtleBotMissionDSL.g:1838:2: rule__WayPoint__Group_3__0__Impl rule__WayPoint__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__WayPoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_3__0"


    // $ANTLR start "rule__WayPoint__Group_3__0__Impl"
    // InternalTurtleBotMissionDSL.g:1845:1: rule__WayPoint__Group_3__0__Impl : ( 'coord_x' ) ;
    public final void rule__WayPoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1849:1: ( ( 'coord_x' ) )
            // InternalTurtleBotMissionDSL.g:1850:1: ( 'coord_x' )
            {
            // InternalTurtleBotMissionDSL.g:1850:1: ( 'coord_x' )
            // InternalTurtleBotMissionDSL.g:1851:2: 'coord_x'
            {
             before(grammarAccess.getWayPointAccess().getCoord_xKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getCoord_xKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_3__0__Impl"


    // $ANTLR start "rule__WayPoint__Group_3__1"
    // InternalTurtleBotMissionDSL.g:1860:1: rule__WayPoint__Group_3__1 : rule__WayPoint__Group_3__1__Impl ;
    public final void rule__WayPoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1864:1: ( rule__WayPoint__Group_3__1__Impl )
            // InternalTurtleBotMissionDSL.g:1865:2: rule__WayPoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_3__1"


    // $ANTLR start "rule__WayPoint__Group_3__1__Impl"
    // InternalTurtleBotMissionDSL.g:1871:1: rule__WayPoint__Group_3__1__Impl : ( ( rule__WayPoint__Coord_xAssignment_3_1 ) ) ;
    public final void rule__WayPoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1875:1: ( ( ( rule__WayPoint__Coord_xAssignment_3_1 ) ) )
            // InternalTurtleBotMissionDSL.g:1876:1: ( ( rule__WayPoint__Coord_xAssignment_3_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:1876:1: ( ( rule__WayPoint__Coord_xAssignment_3_1 ) )
            // InternalTurtleBotMissionDSL.g:1877:2: ( rule__WayPoint__Coord_xAssignment_3_1 )
            {
             before(grammarAccess.getWayPointAccess().getCoord_xAssignment_3_1()); 
            // InternalTurtleBotMissionDSL.g:1878:2: ( rule__WayPoint__Coord_xAssignment_3_1 )
            // InternalTurtleBotMissionDSL.g:1878:3: rule__WayPoint__Coord_xAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Coord_xAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getCoord_xAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_3__1__Impl"


    // $ANTLR start "rule__WayPoint__Group_4__0"
    // InternalTurtleBotMissionDSL.g:1887:1: rule__WayPoint__Group_4__0 : rule__WayPoint__Group_4__0__Impl rule__WayPoint__Group_4__1 ;
    public final void rule__WayPoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1891:1: ( rule__WayPoint__Group_4__0__Impl rule__WayPoint__Group_4__1 )
            // InternalTurtleBotMissionDSL.g:1892:2: rule__WayPoint__Group_4__0__Impl rule__WayPoint__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__WayPoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_4__0"


    // $ANTLR start "rule__WayPoint__Group_4__0__Impl"
    // InternalTurtleBotMissionDSL.g:1899:1: rule__WayPoint__Group_4__0__Impl : ( 'coord_y' ) ;
    public final void rule__WayPoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1903:1: ( ( 'coord_y' ) )
            // InternalTurtleBotMissionDSL.g:1904:1: ( 'coord_y' )
            {
            // InternalTurtleBotMissionDSL.g:1904:1: ( 'coord_y' )
            // InternalTurtleBotMissionDSL.g:1905:2: 'coord_y'
            {
             before(grammarAccess.getWayPointAccess().getCoord_yKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getCoord_yKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_4__0__Impl"


    // $ANTLR start "rule__WayPoint__Group_4__1"
    // InternalTurtleBotMissionDSL.g:1914:1: rule__WayPoint__Group_4__1 : rule__WayPoint__Group_4__1__Impl ;
    public final void rule__WayPoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1918:1: ( rule__WayPoint__Group_4__1__Impl )
            // InternalTurtleBotMissionDSL.g:1919:2: rule__WayPoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_4__1"


    // $ANTLR start "rule__WayPoint__Group_4__1__Impl"
    // InternalTurtleBotMissionDSL.g:1925:1: rule__WayPoint__Group_4__1__Impl : ( ( rule__WayPoint__Coord_yAssignment_4_1 ) ) ;
    public final void rule__WayPoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1929:1: ( ( ( rule__WayPoint__Coord_yAssignment_4_1 ) ) )
            // InternalTurtleBotMissionDSL.g:1930:1: ( ( rule__WayPoint__Coord_yAssignment_4_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:1930:1: ( ( rule__WayPoint__Coord_yAssignment_4_1 ) )
            // InternalTurtleBotMissionDSL.g:1931:2: ( rule__WayPoint__Coord_yAssignment_4_1 )
            {
             before(grammarAccess.getWayPointAccess().getCoord_yAssignment_4_1()); 
            // InternalTurtleBotMissionDSL.g:1932:2: ( rule__WayPoint__Coord_yAssignment_4_1 )
            // InternalTurtleBotMissionDSL.g:1932:3: rule__WayPoint__Coord_yAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Coord_yAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getCoord_yAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_4__1__Impl"


    // $ANTLR start "rule__WayPoint__Group_8__0"
    // InternalTurtleBotMissionDSL.g:1941:1: rule__WayPoint__Group_8__0 : rule__WayPoint__Group_8__0__Impl rule__WayPoint__Group_8__1 ;
    public final void rule__WayPoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1945:1: ( rule__WayPoint__Group_8__0__Impl rule__WayPoint__Group_8__1 )
            // InternalTurtleBotMissionDSL.g:1946:2: rule__WayPoint__Group_8__0__Impl rule__WayPoint__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__WayPoint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_8__0"


    // $ANTLR start "rule__WayPoint__Group_8__0__Impl"
    // InternalTurtleBotMissionDSL.g:1953:1: rule__WayPoint__Group_8__0__Impl : ( ',' ) ;
    public final void rule__WayPoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1957:1: ( ( ',' ) )
            // InternalTurtleBotMissionDSL.g:1958:1: ( ',' )
            {
            // InternalTurtleBotMissionDSL.g:1958:1: ( ',' )
            // InternalTurtleBotMissionDSL.g:1959:2: ','
            {
             before(grammarAccess.getWayPointAccess().getCommaKeyword_8_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWayPointAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_8__0__Impl"


    // $ANTLR start "rule__WayPoint__Group_8__1"
    // InternalTurtleBotMissionDSL.g:1968:1: rule__WayPoint__Group_8__1 : rule__WayPoint__Group_8__1__Impl ;
    public final void rule__WayPoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1972:1: ( rule__WayPoint__Group_8__1__Impl )
            // InternalTurtleBotMissionDSL.g:1973:2: rule__WayPoint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_8__1"


    // $ANTLR start "rule__WayPoint__Group_8__1__Impl"
    // InternalTurtleBotMissionDSL.g:1979:1: rule__WayPoint__Group_8__1__Impl : ( ( rule__WayPoint__WaypointtypesAssignment_8_1 ) ) ;
    public final void rule__WayPoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1983:1: ( ( ( rule__WayPoint__WaypointtypesAssignment_8_1 ) ) )
            // InternalTurtleBotMissionDSL.g:1984:1: ( ( rule__WayPoint__WaypointtypesAssignment_8_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:1984:1: ( ( rule__WayPoint__WaypointtypesAssignment_8_1 ) )
            // InternalTurtleBotMissionDSL.g:1985:2: ( rule__WayPoint__WaypointtypesAssignment_8_1 )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_8_1()); 
            // InternalTurtleBotMissionDSL.g:1986:2: ( rule__WayPoint__WaypointtypesAssignment_8_1 )
            // InternalTurtleBotMissionDSL.g:1986:3: rule__WayPoint__WaypointtypesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__WayPoint__WaypointtypesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Group_8__1__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalTurtleBotMissionDSL.g:1995:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:1999:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalTurtleBotMissionDSL.g:2000:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:2007:1: rule__Mission__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2011:1: ( ( 'Mission' ) )
            // InternalTurtleBotMissionDSL.g:2012:1: ( 'Mission' )
            {
            // InternalTurtleBotMissionDSL.g:2012:1: ( 'Mission' )
            // InternalTurtleBotMissionDSL.g:2013:2: 'Mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalTurtleBotMissionDSL.g:2022:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2026:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalTurtleBotMissionDSL.g:2027:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:2034:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2038:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalTurtleBotMissionDSL.g:2039:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:2039:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalTurtleBotMissionDSL.g:2040:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalTurtleBotMissionDSL.g:2041:2: ( rule__Mission__NameAssignment_1 )
            // InternalTurtleBotMissionDSL.g:2041:3: rule__Mission__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalTurtleBotMissionDSL.g:2049:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2053:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalTurtleBotMissionDSL.g:2054:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalTurtleBotMissionDSL.g:2061:1: rule__Mission__Group__2__Impl : ( '{' ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2065:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:2066:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:2066:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:2067:2: '{'
            {
             before(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalTurtleBotMissionDSL.g:2076:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2080:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalTurtleBotMissionDSL.g:2081:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalTurtleBotMissionDSL.g:2088:1: rule__Mission__Group__3__Impl : ( 'task' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2092:1: ( ( 'task' ) )
            // InternalTurtleBotMissionDSL.g:2093:1: ( 'task' )
            {
            // InternalTurtleBotMissionDSL.g:2093:1: ( 'task' )
            // InternalTurtleBotMissionDSL.g:2094:2: 'task'
            {
             before(grammarAccess.getMissionAccess().getTaskKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTaskKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalTurtleBotMissionDSL.g:2103:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2107:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalTurtleBotMissionDSL.g:2108:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Mission__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalTurtleBotMissionDSL.g:2115:1: rule__Mission__Group__4__Impl : ( '{' ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2119:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:2120:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:2120:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:2121:2: '{'
            {
             before(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__Mission__Group__5"
    // InternalTurtleBotMissionDSL.g:2130:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2134:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalTurtleBotMissionDSL.g:2135:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5"


    // $ANTLR start "rule__Mission__Group__5__Impl"
    // InternalTurtleBotMissionDSL.g:2142:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__TaskAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2146:1: ( ( ( rule__Mission__TaskAssignment_5 ) ) )
            // InternalTurtleBotMissionDSL.g:2147:1: ( ( rule__Mission__TaskAssignment_5 ) )
            {
            // InternalTurtleBotMissionDSL.g:2147:1: ( ( rule__Mission__TaskAssignment_5 ) )
            // InternalTurtleBotMissionDSL.g:2148:2: ( rule__Mission__TaskAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getTaskAssignment_5()); 
            // InternalTurtleBotMissionDSL.g:2149:2: ( rule__Mission__TaskAssignment_5 )
            // InternalTurtleBotMissionDSL.g:2149:3: rule__Mission__TaskAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TaskAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTaskAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5__Impl"


    // $ANTLR start "rule__Mission__Group__6"
    // InternalTurtleBotMissionDSL.g:2157:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2161:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalTurtleBotMissionDSL.g:2162:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6"


    // $ANTLR start "rule__Mission__Group__6__Impl"
    // InternalTurtleBotMissionDSL.g:2169:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__Group_6__0 )* ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2173:1: ( ( ( rule__Mission__Group_6__0 )* ) )
            // InternalTurtleBotMissionDSL.g:2174:1: ( ( rule__Mission__Group_6__0 )* )
            {
            // InternalTurtleBotMissionDSL.g:2174:1: ( ( rule__Mission__Group_6__0 )* )
            // InternalTurtleBotMissionDSL.g:2175:2: ( rule__Mission__Group_6__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_6()); 
            // InternalTurtleBotMissionDSL.g:2176:2: ( rule__Mission__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:2176:3: rule__Mission__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Mission__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6__Impl"


    // $ANTLR start "rule__Mission__Group__7"
    // InternalTurtleBotMissionDSL.g:2184:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2188:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalTurtleBotMissionDSL.g:2189:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Mission__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7"


    // $ANTLR start "rule__Mission__Group__7__Impl"
    // InternalTurtleBotMissionDSL.g:2196:1: rule__Mission__Group__7__Impl : ( '}' ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2200:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:2201:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:2201:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:2202:2: '}'
            {
             before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7__Impl"


    // $ANTLR start "rule__Mission__Group__8"
    // InternalTurtleBotMissionDSL.g:2211:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2215:1: ( rule__Mission__Group__8__Impl )
            // InternalTurtleBotMissionDSL.g:2216:2: rule__Mission__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8"


    // $ANTLR start "rule__Mission__Group__8__Impl"
    // InternalTurtleBotMissionDSL.g:2222:1: rule__Mission__Group__8__Impl : ( '}' ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2226:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:2227:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:2227:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:2228:2: '}'
            {
             before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8__Impl"


    // $ANTLR start "rule__Mission__Group_6__0"
    // InternalTurtleBotMissionDSL.g:2238:1: rule__Mission__Group_6__0 : rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 ;
    public final void rule__Mission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2242:1: ( rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 )
            // InternalTurtleBotMissionDSL.g:2243:2: rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Mission__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__0"


    // $ANTLR start "rule__Mission__Group_6__0__Impl"
    // InternalTurtleBotMissionDSL.g:2250:1: rule__Mission__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2254:1: ( ( ',' ) )
            // InternalTurtleBotMissionDSL.g:2255:1: ( ',' )
            {
            // InternalTurtleBotMissionDSL.g:2255:1: ( ',' )
            // InternalTurtleBotMissionDSL.g:2256:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__0__Impl"


    // $ANTLR start "rule__Mission__Group_6__1"
    // InternalTurtleBotMissionDSL.g:2265:1: rule__Mission__Group_6__1 : rule__Mission__Group_6__1__Impl ;
    public final void rule__Mission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2269:1: ( rule__Mission__Group_6__1__Impl )
            // InternalTurtleBotMissionDSL.g:2270:2: rule__Mission__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__1"


    // $ANTLR start "rule__Mission__Group_6__1__Impl"
    // InternalTurtleBotMissionDSL.g:2276:1: rule__Mission__Group_6__1__Impl : ( ( rule__Mission__TaskAssignment_6_1 ) ) ;
    public final void rule__Mission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2280:1: ( ( ( rule__Mission__TaskAssignment_6_1 ) ) )
            // InternalTurtleBotMissionDSL.g:2281:1: ( ( rule__Mission__TaskAssignment_6_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:2281:1: ( ( rule__Mission__TaskAssignment_6_1 ) )
            // InternalTurtleBotMissionDSL.g:2282:2: ( rule__Mission__TaskAssignment_6_1 )
            {
             before(grammarAccess.getMissionAccess().getTaskAssignment_6_1()); 
            // InternalTurtleBotMissionDSL.g:2283:2: ( rule__Mission__TaskAssignment_6_1 )
            // InternalTurtleBotMissionDSL.g:2283:3: rule__Mission__TaskAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TaskAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTaskAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTurtleBotMissionDSL.g:2292:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2296:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTurtleBotMissionDSL.g:2297:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:2304:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2308:1: ( ( ( '-' )? ) )
            // InternalTurtleBotMissionDSL.g:2309:1: ( ( '-' )? )
            {
            // InternalTurtleBotMissionDSL.g:2309:1: ( ( '-' )? )
            // InternalTurtleBotMissionDSL.g:2310:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTurtleBotMissionDSL.g:2311:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTurtleBotMissionDSL.g:2311:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTurtleBotMissionDSL.g:2319:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2323:1: ( rule__EInt__Group__1__Impl )
            // InternalTurtleBotMissionDSL.g:2324:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:2330:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2334:1: ( ( RULE_INT ) )
            // InternalTurtleBotMissionDSL.g:2335:1: ( RULE_INT )
            {
            // InternalTurtleBotMissionDSL.g:2335:1: ( RULE_INT )
            // InternalTurtleBotMissionDSL.g:2336:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__LineTask__Group__0"
    // InternalTurtleBotMissionDSL.g:2346:1: rule__LineTask__Group__0 : rule__LineTask__Group__0__Impl rule__LineTask__Group__1 ;
    public final void rule__LineTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2350:1: ( rule__LineTask__Group__0__Impl rule__LineTask__Group__1 )
            // InternalTurtleBotMissionDSL.g:2351:2: rule__LineTask__Group__0__Impl rule__LineTask__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LineTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__0"


    // $ANTLR start "rule__LineTask__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:2358:1: rule__LineTask__Group__0__Impl : ( 'LineTask' ) ;
    public final void rule__LineTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2362:1: ( ( 'LineTask' ) )
            // InternalTurtleBotMissionDSL.g:2363:1: ( 'LineTask' )
            {
            // InternalTurtleBotMissionDSL.g:2363:1: ( 'LineTask' )
            // InternalTurtleBotMissionDSL.g:2364:2: 'LineTask'
            {
             before(grammarAccess.getLineTaskAccess().getLineTaskKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getLineTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__0__Impl"


    // $ANTLR start "rule__LineTask__Group__1"
    // InternalTurtleBotMissionDSL.g:2373:1: rule__LineTask__Group__1 : rule__LineTask__Group__1__Impl rule__LineTask__Group__2 ;
    public final void rule__LineTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2377:1: ( rule__LineTask__Group__1__Impl rule__LineTask__Group__2 )
            // InternalTurtleBotMissionDSL.g:2378:2: rule__LineTask__Group__1__Impl rule__LineTask__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__LineTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__1"


    // $ANTLR start "rule__LineTask__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:2385:1: rule__LineTask__Group__1__Impl : ( '{' ) ;
    public final void rule__LineTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2389:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:2390:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:2390:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:2391:2: '{'
            {
             before(grammarAccess.getLineTaskAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__1__Impl"


    // $ANTLR start "rule__LineTask__Group__2"
    // InternalTurtleBotMissionDSL.g:2400:1: rule__LineTask__Group__2 : rule__LineTask__Group__2__Impl rule__LineTask__Group__3 ;
    public final void rule__LineTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2404:1: ( rule__LineTask__Group__2__Impl rule__LineTask__Group__3 )
            // InternalTurtleBotMissionDSL.g:2405:2: rule__LineTask__Group__2__Impl rule__LineTask__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__LineTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__2"


    // $ANTLR start "rule__LineTask__Group__2__Impl"
    // InternalTurtleBotMissionDSL.g:2412:1: rule__LineTask__Group__2__Impl : ( 'waypoints' ) ;
    public final void rule__LineTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2416:1: ( ( 'waypoints' ) )
            // InternalTurtleBotMissionDSL.g:2417:1: ( 'waypoints' )
            {
            // InternalTurtleBotMissionDSL.g:2417:1: ( 'waypoints' )
            // InternalTurtleBotMissionDSL.g:2418:2: 'waypoints'
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getWaypointsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__2__Impl"


    // $ANTLR start "rule__LineTask__Group__3"
    // InternalTurtleBotMissionDSL.g:2427:1: rule__LineTask__Group__3 : rule__LineTask__Group__3__Impl rule__LineTask__Group__4 ;
    public final void rule__LineTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2431:1: ( rule__LineTask__Group__3__Impl rule__LineTask__Group__4 )
            // InternalTurtleBotMissionDSL.g:2432:2: rule__LineTask__Group__3__Impl rule__LineTask__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__LineTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__3"


    // $ANTLR start "rule__LineTask__Group__3__Impl"
    // InternalTurtleBotMissionDSL.g:2439:1: rule__LineTask__Group__3__Impl : ( '(' ) ;
    public final void rule__LineTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2443:1: ( ( '(' ) )
            // InternalTurtleBotMissionDSL.g:2444:1: ( '(' )
            {
            // InternalTurtleBotMissionDSL.g:2444:1: ( '(' )
            // InternalTurtleBotMissionDSL.g:2445:2: '('
            {
             before(grammarAccess.getLineTaskAccess().getLeftParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__3__Impl"


    // $ANTLR start "rule__LineTask__Group__4"
    // InternalTurtleBotMissionDSL.g:2454:1: rule__LineTask__Group__4 : rule__LineTask__Group__4__Impl rule__LineTask__Group__5 ;
    public final void rule__LineTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2458:1: ( rule__LineTask__Group__4__Impl rule__LineTask__Group__5 )
            // InternalTurtleBotMissionDSL.g:2459:2: rule__LineTask__Group__4__Impl rule__LineTask__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__LineTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__4"


    // $ANTLR start "rule__LineTask__Group__4__Impl"
    // InternalTurtleBotMissionDSL.g:2466:1: rule__LineTask__Group__4__Impl : ( ( rule__LineTask__WaypointsAssignment_4 ) ) ;
    public final void rule__LineTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2470:1: ( ( ( rule__LineTask__WaypointsAssignment_4 ) ) )
            // InternalTurtleBotMissionDSL.g:2471:1: ( ( rule__LineTask__WaypointsAssignment_4 ) )
            {
            // InternalTurtleBotMissionDSL.g:2471:1: ( ( rule__LineTask__WaypointsAssignment_4 ) )
            // InternalTurtleBotMissionDSL.g:2472:2: ( rule__LineTask__WaypointsAssignment_4 )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsAssignment_4()); 
            // InternalTurtleBotMissionDSL.g:2473:2: ( rule__LineTask__WaypointsAssignment_4 )
            // InternalTurtleBotMissionDSL.g:2473:3: rule__LineTask__WaypointsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__WaypointsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLineTaskAccess().getWaypointsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__4__Impl"


    // $ANTLR start "rule__LineTask__Group__5"
    // InternalTurtleBotMissionDSL.g:2481:1: rule__LineTask__Group__5 : rule__LineTask__Group__5__Impl rule__LineTask__Group__6 ;
    public final void rule__LineTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2485:1: ( rule__LineTask__Group__5__Impl rule__LineTask__Group__6 )
            // InternalTurtleBotMissionDSL.g:2486:2: rule__LineTask__Group__5__Impl rule__LineTask__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__LineTask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__5"


    // $ANTLR start "rule__LineTask__Group__5__Impl"
    // InternalTurtleBotMissionDSL.g:2493:1: rule__LineTask__Group__5__Impl : ( ( rule__LineTask__Group_5__0 )* ) ;
    public final void rule__LineTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2497:1: ( ( ( rule__LineTask__Group_5__0 )* ) )
            // InternalTurtleBotMissionDSL.g:2498:1: ( ( rule__LineTask__Group_5__0 )* )
            {
            // InternalTurtleBotMissionDSL.g:2498:1: ( ( rule__LineTask__Group_5__0 )* )
            // InternalTurtleBotMissionDSL.g:2499:2: ( rule__LineTask__Group_5__0 )*
            {
             before(grammarAccess.getLineTaskAccess().getGroup_5()); 
            // InternalTurtleBotMissionDSL.g:2500:2: ( rule__LineTask__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:2500:3: rule__LineTask__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LineTask__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getLineTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__5__Impl"


    // $ANTLR start "rule__LineTask__Group__6"
    // InternalTurtleBotMissionDSL.g:2508:1: rule__LineTask__Group__6 : rule__LineTask__Group__6__Impl rule__LineTask__Group__7 ;
    public final void rule__LineTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2512:1: ( rule__LineTask__Group__6__Impl rule__LineTask__Group__7 )
            // InternalTurtleBotMissionDSL.g:2513:2: rule__LineTask__Group__6__Impl rule__LineTask__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__LineTask__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__6"


    // $ANTLR start "rule__LineTask__Group__6__Impl"
    // InternalTurtleBotMissionDSL.g:2520:1: rule__LineTask__Group__6__Impl : ( ')' ) ;
    public final void rule__LineTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2524:1: ( ( ')' ) )
            // InternalTurtleBotMissionDSL.g:2525:1: ( ')' )
            {
            // InternalTurtleBotMissionDSL.g:2525:1: ( ')' )
            // InternalTurtleBotMissionDSL.g:2526:2: ')'
            {
             before(grammarAccess.getLineTaskAccess().getRightParenthesisKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__6__Impl"


    // $ANTLR start "rule__LineTask__Group__7"
    // InternalTurtleBotMissionDSL.g:2535:1: rule__LineTask__Group__7 : rule__LineTask__Group__7__Impl ;
    public final void rule__LineTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2539:1: ( rule__LineTask__Group__7__Impl )
            // InternalTurtleBotMissionDSL.g:2540:2: rule__LineTask__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__7"


    // $ANTLR start "rule__LineTask__Group__7__Impl"
    // InternalTurtleBotMissionDSL.g:2546:1: rule__LineTask__Group__7__Impl : ( '}' ) ;
    public final void rule__LineTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2550:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:2551:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:2551:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:2552:2: '}'
            {
             before(grammarAccess.getLineTaskAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group__7__Impl"


    // $ANTLR start "rule__LineTask__Group_5__0"
    // InternalTurtleBotMissionDSL.g:2562:1: rule__LineTask__Group_5__0 : rule__LineTask__Group_5__0__Impl rule__LineTask__Group_5__1 ;
    public final void rule__LineTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2566:1: ( rule__LineTask__Group_5__0__Impl rule__LineTask__Group_5__1 )
            // InternalTurtleBotMissionDSL.g:2567:2: rule__LineTask__Group_5__0__Impl rule__LineTask__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__LineTask__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineTask__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_5__0"


    // $ANTLR start "rule__LineTask__Group_5__0__Impl"
    // InternalTurtleBotMissionDSL.g:2574:1: rule__LineTask__Group_5__0__Impl : ( ',' ) ;
    public final void rule__LineTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2578:1: ( ( ',' ) )
            // InternalTurtleBotMissionDSL.g:2579:1: ( ',' )
            {
            // InternalTurtleBotMissionDSL.g:2579:1: ( ',' )
            // InternalTurtleBotMissionDSL.g:2580:2: ','
            {
             before(grammarAccess.getLineTaskAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLineTaskAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_5__0__Impl"


    // $ANTLR start "rule__LineTask__Group_5__1"
    // InternalTurtleBotMissionDSL.g:2589:1: rule__LineTask__Group_5__1 : rule__LineTask__Group_5__1__Impl ;
    public final void rule__LineTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2593:1: ( rule__LineTask__Group_5__1__Impl )
            // InternalTurtleBotMissionDSL.g:2594:2: rule__LineTask__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_5__1"


    // $ANTLR start "rule__LineTask__Group_5__1__Impl"
    // InternalTurtleBotMissionDSL.g:2600:1: rule__LineTask__Group_5__1__Impl : ( ( rule__LineTask__WaypointsAssignment_5_1 ) ) ;
    public final void rule__LineTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2604:1: ( ( ( rule__LineTask__WaypointsAssignment_5_1 ) ) )
            // InternalTurtleBotMissionDSL.g:2605:1: ( ( rule__LineTask__WaypointsAssignment_5_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:2605:1: ( ( rule__LineTask__WaypointsAssignment_5_1 ) )
            // InternalTurtleBotMissionDSL.g:2606:2: ( rule__LineTask__WaypointsAssignment_5_1 )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsAssignment_5_1()); 
            // InternalTurtleBotMissionDSL.g:2607:2: ( rule__LineTask__WaypointsAssignment_5_1 )
            // InternalTurtleBotMissionDSL.g:2607:3: rule__LineTask__WaypointsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LineTask__WaypointsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLineTaskAccess().getWaypointsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__Group_5__1__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__0"
    // InternalTurtleBotMissionDSL.g:2616:1: rule__ShortestPathTask__Group__0 : rule__ShortestPathTask__Group__0__Impl rule__ShortestPathTask__Group__1 ;
    public final void rule__ShortestPathTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2620:1: ( rule__ShortestPathTask__Group__0__Impl rule__ShortestPathTask__Group__1 )
            // InternalTurtleBotMissionDSL.g:2621:2: rule__ShortestPathTask__Group__0__Impl rule__ShortestPathTask__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ShortestPathTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__0"


    // $ANTLR start "rule__ShortestPathTask__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:2628:1: rule__ShortestPathTask__Group__0__Impl : ( 'ShortestPathTask' ) ;
    public final void rule__ShortestPathTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2632:1: ( ( 'ShortestPathTask' ) )
            // InternalTurtleBotMissionDSL.g:2633:1: ( 'ShortestPathTask' )
            {
            // InternalTurtleBotMissionDSL.g:2633:1: ( 'ShortestPathTask' )
            // InternalTurtleBotMissionDSL.g:2634:2: 'ShortestPathTask'
            {
             before(grammarAccess.getShortestPathTaskAccess().getShortestPathTaskKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getShortestPathTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__0__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__1"
    // InternalTurtleBotMissionDSL.g:2643:1: rule__ShortestPathTask__Group__1 : rule__ShortestPathTask__Group__1__Impl rule__ShortestPathTask__Group__2 ;
    public final void rule__ShortestPathTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2647:1: ( rule__ShortestPathTask__Group__1__Impl rule__ShortestPathTask__Group__2 )
            // InternalTurtleBotMissionDSL.g:2648:2: rule__ShortestPathTask__Group__1__Impl rule__ShortestPathTask__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ShortestPathTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__1"


    // $ANTLR start "rule__ShortestPathTask__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:2655:1: rule__ShortestPathTask__Group__1__Impl : ( '{' ) ;
    public final void rule__ShortestPathTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2659:1: ( ( '{' ) )
            // InternalTurtleBotMissionDSL.g:2660:1: ( '{' )
            {
            // InternalTurtleBotMissionDSL.g:2660:1: ( '{' )
            // InternalTurtleBotMissionDSL.g:2661:2: '{'
            {
             before(grammarAccess.getShortestPathTaskAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__1__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__2"
    // InternalTurtleBotMissionDSL.g:2670:1: rule__ShortestPathTask__Group__2 : rule__ShortestPathTask__Group__2__Impl rule__ShortestPathTask__Group__3 ;
    public final void rule__ShortestPathTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2674:1: ( rule__ShortestPathTask__Group__2__Impl rule__ShortestPathTask__Group__3 )
            // InternalTurtleBotMissionDSL.g:2675:2: rule__ShortestPathTask__Group__2__Impl rule__ShortestPathTask__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ShortestPathTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__2"


    // $ANTLR start "rule__ShortestPathTask__Group__2__Impl"
    // InternalTurtleBotMissionDSL.g:2682:1: rule__ShortestPathTask__Group__2__Impl : ( 'waypoints' ) ;
    public final void rule__ShortestPathTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2686:1: ( ( 'waypoints' ) )
            // InternalTurtleBotMissionDSL.g:2687:1: ( 'waypoints' )
            {
            // InternalTurtleBotMissionDSL.g:2687:1: ( 'waypoints' )
            // InternalTurtleBotMissionDSL.g:2688:2: 'waypoints'
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getWaypointsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__2__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__3"
    // InternalTurtleBotMissionDSL.g:2697:1: rule__ShortestPathTask__Group__3 : rule__ShortestPathTask__Group__3__Impl rule__ShortestPathTask__Group__4 ;
    public final void rule__ShortestPathTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2701:1: ( rule__ShortestPathTask__Group__3__Impl rule__ShortestPathTask__Group__4 )
            // InternalTurtleBotMissionDSL.g:2702:2: rule__ShortestPathTask__Group__3__Impl rule__ShortestPathTask__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ShortestPathTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__3"


    // $ANTLR start "rule__ShortestPathTask__Group__3__Impl"
    // InternalTurtleBotMissionDSL.g:2709:1: rule__ShortestPathTask__Group__3__Impl : ( '(' ) ;
    public final void rule__ShortestPathTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2713:1: ( ( '(' ) )
            // InternalTurtleBotMissionDSL.g:2714:1: ( '(' )
            {
            // InternalTurtleBotMissionDSL.g:2714:1: ( '(' )
            // InternalTurtleBotMissionDSL.g:2715:2: '('
            {
             before(grammarAccess.getShortestPathTaskAccess().getLeftParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__3__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__4"
    // InternalTurtleBotMissionDSL.g:2724:1: rule__ShortestPathTask__Group__4 : rule__ShortestPathTask__Group__4__Impl rule__ShortestPathTask__Group__5 ;
    public final void rule__ShortestPathTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2728:1: ( rule__ShortestPathTask__Group__4__Impl rule__ShortestPathTask__Group__5 )
            // InternalTurtleBotMissionDSL.g:2729:2: rule__ShortestPathTask__Group__4__Impl rule__ShortestPathTask__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ShortestPathTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__4"


    // $ANTLR start "rule__ShortestPathTask__Group__4__Impl"
    // InternalTurtleBotMissionDSL.g:2736:1: rule__ShortestPathTask__Group__4__Impl : ( ( rule__ShortestPathTask__WaypointsAssignment_4 ) ) ;
    public final void rule__ShortestPathTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2740:1: ( ( ( rule__ShortestPathTask__WaypointsAssignment_4 ) ) )
            // InternalTurtleBotMissionDSL.g:2741:1: ( ( rule__ShortestPathTask__WaypointsAssignment_4 ) )
            {
            // InternalTurtleBotMissionDSL.g:2741:1: ( ( rule__ShortestPathTask__WaypointsAssignment_4 ) )
            // InternalTurtleBotMissionDSL.g:2742:2: ( rule__ShortestPathTask__WaypointsAssignment_4 )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_4()); 
            // InternalTurtleBotMissionDSL.g:2743:2: ( rule__ShortestPathTask__WaypointsAssignment_4 )
            // InternalTurtleBotMissionDSL.g:2743:3: rule__ShortestPathTask__WaypointsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__WaypointsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__4__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__5"
    // InternalTurtleBotMissionDSL.g:2751:1: rule__ShortestPathTask__Group__5 : rule__ShortestPathTask__Group__5__Impl rule__ShortestPathTask__Group__6 ;
    public final void rule__ShortestPathTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2755:1: ( rule__ShortestPathTask__Group__5__Impl rule__ShortestPathTask__Group__6 )
            // InternalTurtleBotMissionDSL.g:2756:2: rule__ShortestPathTask__Group__5__Impl rule__ShortestPathTask__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ShortestPathTask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__5"


    // $ANTLR start "rule__ShortestPathTask__Group__5__Impl"
    // InternalTurtleBotMissionDSL.g:2763:1: rule__ShortestPathTask__Group__5__Impl : ( ( rule__ShortestPathTask__Group_5__0 )* ) ;
    public final void rule__ShortestPathTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2767:1: ( ( ( rule__ShortestPathTask__Group_5__0 )* ) )
            // InternalTurtleBotMissionDSL.g:2768:1: ( ( rule__ShortestPathTask__Group_5__0 )* )
            {
            // InternalTurtleBotMissionDSL.g:2768:1: ( ( rule__ShortestPathTask__Group_5__0 )* )
            // InternalTurtleBotMissionDSL.g:2769:2: ( rule__ShortestPathTask__Group_5__0 )*
            {
             before(grammarAccess.getShortestPathTaskAccess().getGroup_5()); 
            // InternalTurtleBotMissionDSL.g:2770:2: ( rule__ShortestPathTask__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTurtleBotMissionDSL.g:2770:3: rule__ShortestPathTask__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ShortestPathTask__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getShortestPathTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__5__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__6"
    // InternalTurtleBotMissionDSL.g:2778:1: rule__ShortestPathTask__Group__6 : rule__ShortestPathTask__Group__6__Impl rule__ShortestPathTask__Group__7 ;
    public final void rule__ShortestPathTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2782:1: ( rule__ShortestPathTask__Group__6__Impl rule__ShortestPathTask__Group__7 )
            // InternalTurtleBotMissionDSL.g:2783:2: rule__ShortestPathTask__Group__6__Impl rule__ShortestPathTask__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ShortestPathTask__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__6"


    // $ANTLR start "rule__ShortestPathTask__Group__6__Impl"
    // InternalTurtleBotMissionDSL.g:2790:1: rule__ShortestPathTask__Group__6__Impl : ( ')' ) ;
    public final void rule__ShortestPathTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2794:1: ( ( ')' ) )
            // InternalTurtleBotMissionDSL.g:2795:1: ( ')' )
            {
            // InternalTurtleBotMissionDSL.g:2795:1: ( ')' )
            // InternalTurtleBotMissionDSL.g:2796:2: ')'
            {
             before(grammarAccess.getShortestPathTaskAccess().getRightParenthesisKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__6__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group__7"
    // InternalTurtleBotMissionDSL.g:2805:1: rule__ShortestPathTask__Group__7 : rule__ShortestPathTask__Group__7__Impl ;
    public final void rule__ShortestPathTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2809:1: ( rule__ShortestPathTask__Group__7__Impl )
            // InternalTurtleBotMissionDSL.g:2810:2: rule__ShortestPathTask__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__7"


    // $ANTLR start "rule__ShortestPathTask__Group__7__Impl"
    // InternalTurtleBotMissionDSL.g:2816:1: rule__ShortestPathTask__Group__7__Impl : ( '}' ) ;
    public final void rule__ShortestPathTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2820:1: ( ( '}' ) )
            // InternalTurtleBotMissionDSL.g:2821:1: ( '}' )
            {
            // InternalTurtleBotMissionDSL.g:2821:1: ( '}' )
            // InternalTurtleBotMissionDSL.g:2822:2: '}'
            {
             before(grammarAccess.getShortestPathTaskAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group__7__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group_5__0"
    // InternalTurtleBotMissionDSL.g:2832:1: rule__ShortestPathTask__Group_5__0 : rule__ShortestPathTask__Group_5__0__Impl rule__ShortestPathTask__Group_5__1 ;
    public final void rule__ShortestPathTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2836:1: ( rule__ShortestPathTask__Group_5__0__Impl rule__ShortestPathTask__Group_5__1 )
            // InternalTurtleBotMissionDSL.g:2837:2: rule__ShortestPathTask__Group_5__0__Impl rule__ShortestPathTask__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ShortestPathTask__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_5__0"


    // $ANTLR start "rule__ShortestPathTask__Group_5__0__Impl"
    // InternalTurtleBotMissionDSL.g:2844:1: rule__ShortestPathTask__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ShortestPathTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2848:1: ( ( ',' ) )
            // InternalTurtleBotMissionDSL.g:2849:1: ( ',' )
            {
            // InternalTurtleBotMissionDSL.g:2849:1: ( ',' )
            // InternalTurtleBotMissionDSL.g:2850:2: ','
            {
             before(grammarAccess.getShortestPathTaskAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getShortestPathTaskAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_5__0__Impl"


    // $ANTLR start "rule__ShortestPathTask__Group_5__1"
    // InternalTurtleBotMissionDSL.g:2859:1: rule__ShortestPathTask__Group_5__1 : rule__ShortestPathTask__Group_5__1__Impl ;
    public final void rule__ShortestPathTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2863:1: ( rule__ShortestPathTask__Group_5__1__Impl )
            // InternalTurtleBotMissionDSL.g:2864:2: rule__ShortestPathTask__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_5__1"


    // $ANTLR start "rule__ShortestPathTask__Group_5__1__Impl"
    // InternalTurtleBotMissionDSL.g:2870:1: rule__ShortestPathTask__Group_5__1__Impl : ( ( rule__ShortestPathTask__WaypointsAssignment_5_1 ) ) ;
    public final void rule__ShortestPathTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2874:1: ( ( ( rule__ShortestPathTask__WaypointsAssignment_5_1 ) ) )
            // InternalTurtleBotMissionDSL.g:2875:1: ( ( rule__ShortestPathTask__WaypointsAssignment_5_1 ) )
            {
            // InternalTurtleBotMissionDSL.g:2875:1: ( ( rule__ShortestPathTask__WaypointsAssignment_5_1 ) )
            // InternalTurtleBotMissionDSL.g:2876:2: ( rule__ShortestPathTask__WaypointsAssignment_5_1 )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_5_1()); 
            // InternalTurtleBotMissionDSL.g:2877:2: ( rule__ShortestPathTask__WaypointsAssignment_5_1 )
            // InternalTurtleBotMissionDSL.g:2877:3: rule__ShortestPathTask__WaypointsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ShortestPathTask__WaypointsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__Group_5__1__Impl"


    // $ANTLR start "rule__ReturnToStartTask__Group__0"
    // InternalTurtleBotMissionDSL.g:2886:1: rule__ReturnToStartTask__Group__0 : rule__ReturnToStartTask__Group__0__Impl rule__ReturnToStartTask__Group__1 ;
    public final void rule__ReturnToStartTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2890:1: ( rule__ReturnToStartTask__Group__0__Impl rule__ReturnToStartTask__Group__1 )
            // InternalTurtleBotMissionDSL.g:2891:2: rule__ReturnToStartTask__Group__0__Impl rule__ReturnToStartTask__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ReturnToStartTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnToStartTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__0"


    // $ANTLR start "rule__ReturnToStartTask__Group__0__Impl"
    // InternalTurtleBotMissionDSL.g:2898:1: rule__ReturnToStartTask__Group__0__Impl : ( () ) ;
    public final void rule__ReturnToStartTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2902:1: ( ( () ) )
            // InternalTurtleBotMissionDSL.g:2903:1: ( () )
            {
            // InternalTurtleBotMissionDSL.g:2903:1: ( () )
            // InternalTurtleBotMissionDSL.g:2904:2: ()
            {
             before(grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskAction_0()); 
            // InternalTurtleBotMissionDSL.g:2905:2: ()
            // InternalTurtleBotMissionDSL.g:2905:3: 
            {
            }

             after(grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__0__Impl"


    // $ANTLR start "rule__ReturnToStartTask__Group__1"
    // InternalTurtleBotMissionDSL.g:2913:1: rule__ReturnToStartTask__Group__1 : rule__ReturnToStartTask__Group__1__Impl ;
    public final void rule__ReturnToStartTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2917:1: ( rule__ReturnToStartTask__Group__1__Impl )
            // InternalTurtleBotMissionDSL.g:2918:2: rule__ReturnToStartTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnToStartTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__1"


    // $ANTLR start "rule__ReturnToStartTask__Group__1__Impl"
    // InternalTurtleBotMissionDSL.g:2924:1: rule__ReturnToStartTask__Group__1__Impl : ( 'ReturnToStartTask' ) ;
    public final void rule__ReturnToStartTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2928:1: ( ( 'ReturnToStartTask' ) )
            // InternalTurtleBotMissionDSL.g:2929:1: ( 'ReturnToStartTask' )
            {
            // InternalTurtleBotMissionDSL.g:2929:1: ( 'ReturnToStartTask' )
            // InternalTurtleBotMissionDSL.g:2930:2: 'ReturnToStartTask'
            {
             before(grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReturnToStartTaskAccess().getReturnToStartTaskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnToStartTask__Group__1__Impl"


    // $ANTLR start "rule__TurtleBot__NameAssignment_1"
    // InternalTurtleBotMissionDSL.g:2940:1: rule__TurtleBot__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TurtleBot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2944:1: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:2945:2: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:2945:2: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:2946:3: ruleEString
            {
             before(grammarAccess.getTurtleBotAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__NameAssignment_1"


    // $ANTLR start "rule__TurtleBot__Bot_startAssignment_4"
    // InternalTurtleBotMissionDSL.g:2955:1: rule__TurtleBot__Bot_startAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__TurtleBot__Bot_startAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2959:1: ( ( ( ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:2960:2: ( ( ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:2960:2: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:2961:3: ( ruleEString )
            {
             before(grammarAccess.getTurtleBotAccess().getBot_startWayPointCrossReference_4_0()); 
            // InternalTurtleBotMissionDSL.g:2962:3: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:2963:4: ruleEString
            {
             before(grammarAccess.getTurtleBotAccess().getBot_startWayPointEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getBot_startWayPointEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTurtleBotAccess().getBot_startWayPointCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__Bot_startAssignment_4"


    // $ANTLR start "rule__TurtleBot__AreaAssignment_6"
    // InternalTurtleBotMissionDSL.g:2974:1: rule__TurtleBot__AreaAssignment_6 : ( ruleArea ) ;
    public final void rule__TurtleBot__AreaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2978:1: ( ( ruleArea ) )
            // InternalTurtleBotMissionDSL.g:2979:2: ( ruleArea )
            {
            // InternalTurtleBotMissionDSL.g:2979:2: ( ruleArea )
            // InternalTurtleBotMissionDSL.g:2980:3: ruleArea
            {
             before(grammarAccess.getTurtleBotAccess().getAreaAreaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getAreaAreaParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__AreaAssignment_6"


    // $ANTLR start "rule__TurtleBot__WaypointtypesAssignment_9"
    // InternalTurtleBotMissionDSL.g:2989:1: rule__TurtleBot__WaypointtypesAssignment_9 : ( ruleWaypointType ) ;
    public final void rule__TurtleBot__WaypointtypesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:2993:1: ( ( ruleWaypointType ) )
            // InternalTurtleBotMissionDSL.g:2994:2: ( ruleWaypointType )
            {
            // InternalTurtleBotMissionDSL.g:2994:2: ( ruleWaypointType )
            // InternalTurtleBotMissionDSL.g:2995:3: ruleWaypointType
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleWaypointType();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointtypesAssignment_9"


    // $ANTLR start "rule__TurtleBot__WaypointtypesAssignment_10_1"
    // InternalTurtleBotMissionDSL.g:3004:1: rule__TurtleBot__WaypointtypesAssignment_10_1 : ( ruleWaypointType ) ;
    public final void rule__TurtleBot__WaypointtypesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3008:1: ( ( ruleWaypointType ) )
            // InternalTurtleBotMissionDSL.g:3009:2: ( ruleWaypointType )
            {
            // InternalTurtleBotMissionDSL.g:3009:2: ( ruleWaypointType )
            // InternalTurtleBotMissionDSL.g:3010:3: ruleWaypointType
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWaypointType();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointtypesWaypointTypeParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointtypesAssignment_10_1"


    // $ANTLR start "rule__TurtleBot__WaypointsAssignment_14"
    // InternalTurtleBotMissionDSL.g:3019:1: rule__TurtleBot__WaypointsAssignment_14 : ( ruleWayPoint ) ;
    public final void rule__TurtleBot__WaypointsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3023:1: ( ( ruleWayPoint ) )
            // InternalTurtleBotMissionDSL.g:3024:2: ( ruleWayPoint )
            {
            // InternalTurtleBotMissionDSL.g:3024:2: ( ruleWayPoint )
            // InternalTurtleBotMissionDSL.g:3025:3: ruleWayPoint
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleWayPoint();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointsAssignment_14"


    // $ANTLR start "rule__TurtleBot__WaypointsAssignment_15_1"
    // InternalTurtleBotMissionDSL.g:3034:1: rule__TurtleBot__WaypointsAssignment_15_1 : ( ruleWayPoint ) ;
    public final void rule__TurtleBot__WaypointsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3038:1: ( ( ruleWayPoint ) )
            // InternalTurtleBotMissionDSL.g:3039:2: ( ruleWayPoint )
            {
            // InternalTurtleBotMissionDSL.g:3039:2: ( ruleWayPoint )
            // InternalTurtleBotMissionDSL.g:3040:3: ruleWayPoint
            {
             before(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWayPoint();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getWaypointsWayPointParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__WaypointsAssignment_15_1"


    // $ANTLR start "rule__TurtleBot__MissionsAssignment_17_2"
    // InternalTurtleBotMissionDSL.g:3049:1: rule__TurtleBot__MissionsAssignment_17_2 : ( ruleMission ) ;
    public final void rule__TurtleBot__MissionsAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3053:1: ( ( ruleMission ) )
            // InternalTurtleBotMissionDSL.g:3054:2: ( ruleMission )
            {
            // InternalTurtleBotMissionDSL.g:3054:2: ( ruleMission )
            // InternalTurtleBotMissionDSL.g:3055:3: ruleMission
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__MissionsAssignment_17_2"


    // $ANTLR start "rule__TurtleBot__MissionsAssignment_17_3_1"
    // InternalTurtleBotMissionDSL.g:3064:1: rule__TurtleBot__MissionsAssignment_17_3_1 : ( ruleMission ) ;
    public final void rule__TurtleBot__MissionsAssignment_17_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3068:1: ( ( ruleMission ) )
            // InternalTurtleBotMissionDSL.g:3069:2: ( ruleMission )
            {
            // InternalTurtleBotMissionDSL.g:3069:2: ( ruleMission )
            // InternalTurtleBotMissionDSL.g:3070:3: ruleMission
            {
             before(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_17_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getTurtleBotAccess().getMissionsMissionParserRuleCall_17_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleBot__MissionsAssignment_17_3_1"


    // $ANTLR start "rule__Area__XmaxAssignment_3_1"
    // InternalTurtleBotMissionDSL.g:3079:1: rule__Area__XmaxAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Area__XmaxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3083:1: ( ( ruleEInt ) )
            // InternalTurtleBotMissionDSL.g:3084:2: ( ruleEInt )
            {
            // InternalTurtleBotMissionDSL.g:3084:2: ( ruleEInt )
            // InternalTurtleBotMissionDSL.g:3085:3: ruleEInt
            {
             before(grammarAccess.getAreaAccess().getXmaxEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getXmaxEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__XmaxAssignment_3_1"


    // $ANTLR start "rule__Area__YmaxAssignment_4_1"
    // InternalTurtleBotMissionDSL.g:3094:1: rule__Area__YmaxAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Area__YmaxAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3098:1: ( ( ruleEInt ) )
            // InternalTurtleBotMissionDSL.g:3099:2: ( ruleEInt )
            {
            // InternalTurtleBotMissionDSL.g:3099:2: ( ruleEInt )
            // InternalTurtleBotMissionDSL.g:3100:3: ruleEInt
            {
             before(grammarAccess.getAreaAccess().getYmaxEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getYmaxEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__YmaxAssignment_4_1"


    // $ANTLR start "rule__WaypointType__NameAssignment_2"
    // InternalTurtleBotMissionDSL.g:3109:1: rule__WaypointType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WaypointType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3113:1: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3114:2: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:3114:2: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3115:3: ruleEString
            {
             before(grammarAccess.getWaypointTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWaypointTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaypointType__NameAssignment_2"


    // $ANTLR start "rule__WayPoint__NameAssignment_1"
    // InternalTurtleBotMissionDSL.g:3124:1: rule__WayPoint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WayPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3128:1: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3129:2: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:3129:2: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3130:3: ruleEString
            {
             before(grammarAccess.getWayPointAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__NameAssignment_1"


    // $ANTLR start "rule__WayPoint__Coord_xAssignment_3_1"
    // InternalTurtleBotMissionDSL.g:3139:1: rule__WayPoint__Coord_xAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__WayPoint__Coord_xAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3143:1: ( ( ruleEInt ) )
            // InternalTurtleBotMissionDSL.g:3144:2: ( ruleEInt )
            {
            // InternalTurtleBotMissionDSL.g:3144:2: ( ruleEInt )
            // InternalTurtleBotMissionDSL.g:3145:3: ruleEInt
            {
             before(grammarAccess.getWayPointAccess().getCoord_xEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getCoord_xEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Coord_xAssignment_3_1"


    // $ANTLR start "rule__WayPoint__Coord_yAssignment_4_1"
    // InternalTurtleBotMissionDSL.g:3154:1: rule__WayPoint__Coord_yAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__WayPoint__Coord_yAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3158:1: ( ( ruleEInt ) )
            // InternalTurtleBotMissionDSL.g:3159:2: ( ruleEInt )
            {
            // InternalTurtleBotMissionDSL.g:3159:2: ( ruleEInt )
            // InternalTurtleBotMissionDSL.g:3160:3: ruleEInt
            {
             before(grammarAccess.getWayPointAccess().getCoord_yEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getCoord_yEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__Coord_yAssignment_4_1"


    // $ANTLR start "rule__WayPoint__WaypointtypesAssignment_7"
    // InternalTurtleBotMissionDSL.g:3169:1: rule__WayPoint__WaypointtypesAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__WayPoint__WaypointtypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3173:1: ( ( ( ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:3174:2: ( ( ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:3174:2: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3175:3: ( ruleEString )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_7_0()); 
            // InternalTurtleBotMissionDSL.g:3176:3: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3177:4: ruleEString
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__WaypointtypesAssignment_7"


    // $ANTLR start "rule__WayPoint__WaypointtypesAssignment_8_1"
    // InternalTurtleBotMissionDSL.g:3188:1: rule__WayPoint__WaypointtypesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__WayPoint__WaypointtypesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3192:1: ( ( ( ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:3193:2: ( ( ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:3193:2: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3194:3: ( ruleEString )
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_8_1_0()); 
            // InternalTurtleBotMissionDSL.g:3195:3: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3196:4: ruleEString
            {
             before(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getWayPointAccess().getWaypointtypesWaypointTypeCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WayPoint__WaypointtypesAssignment_8_1"


    // $ANTLR start "rule__Mission__NameAssignment_1"
    // InternalTurtleBotMissionDSL.g:3207:1: rule__Mission__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3211:1: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3212:2: ( ruleEString )
            {
            // InternalTurtleBotMissionDSL.g:3212:2: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3213:3: ruleEString
            {
             before(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NameAssignment_1"


    // $ANTLR start "rule__Mission__TaskAssignment_5"
    // InternalTurtleBotMissionDSL.g:3222:1: rule__Mission__TaskAssignment_5 : ( ruleTask ) ;
    public final void rule__Mission__TaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3226:1: ( ( ruleTask ) )
            // InternalTurtleBotMissionDSL.g:3227:2: ( ruleTask )
            {
            // InternalTurtleBotMissionDSL.g:3227:2: ( ruleTask )
            // InternalTurtleBotMissionDSL.g:3228:3: ruleTask
            {
             before(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TaskAssignment_5"


    // $ANTLR start "rule__Mission__TaskAssignment_6_1"
    // InternalTurtleBotMissionDSL.g:3237:1: rule__Mission__TaskAssignment_6_1 : ( ruleTask ) ;
    public final void rule__Mission__TaskAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3241:1: ( ( ruleTask ) )
            // InternalTurtleBotMissionDSL.g:3242:2: ( ruleTask )
            {
            // InternalTurtleBotMissionDSL.g:3242:2: ( ruleTask )
            // InternalTurtleBotMissionDSL.g:3243:3: ruleTask
            {
             before(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTaskTaskParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TaskAssignment_6_1"


    // $ANTLR start "rule__LineTask__WaypointsAssignment_4"
    // InternalTurtleBotMissionDSL.g:3252:1: rule__LineTask__WaypointsAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__LineTask__WaypointsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3256:1: ( ( ( ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:3257:2: ( ( ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:3257:2: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3258:3: ( ruleEString )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_4_0()); 
            // InternalTurtleBotMissionDSL.g:3259:3: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3260:4: ruleEString
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__WaypointsAssignment_4"


    // $ANTLR start "rule__LineTask__WaypointsAssignment_5_1"
    // InternalTurtleBotMissionDSL.g:3271:1: rule__LineTask__WaypointsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__LineTask__WaypointsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3275:1: ( ( ( ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:3276:2: ( ( ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:3276:2: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3277:3: ( ruleEString )
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_5_1_0()); 
            // InternalTurtleBotMissionDSL.g:3278:3: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3279:4: ruleEString
            {
             before(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getLineTaskAccess().getWaypointsWayPointCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTask__WaypointsAssignment_5_1"


    // $ANTLR start "rule__ShortestPathTask__WaypointsAssignment_4"
    // InternalTurtleBotMissionDSL.g:3290:1: rule__ShortestPathTask__WaypointsAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ShortestPathTask__WaypointsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3294:1: ( ( ( ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:3295:2: ( ( ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:3295:2: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3296:3: ( ruleEString )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_4_0()); 
            // InternalTurtleBotMissionDSL.g:3297:3: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3298:4: ruleEString
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__WaypointsAssignment_4"


    // $ANTLR start "rule__ShortestPathTask__WaypointsAssignment_5_1"
    // InternalTurtleBotMissionDSL.g:3309:1: rule__ShortestPathTask__WaypointsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ShortestPathTask__WaypointsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtleBotMissionDSL.g:3313:1: ( ( ( ruleEString ) ) )
            // InternalTurtleBotMissionDSL.g:3314:2: ( ( ruleEString ) )
            {
            // InternalTurtleBotMissionDSL.g:3314:2: ( ( ruleEString ) )
            // InternalTurtleBotMissionDSL.g:3315:3: ( ruleEString )
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_5_1_0()); 
            // InternalTurtleBotMissionDSL.g:3316:3: ( ruleEString )
            // InternalTurtleBotMissionDSL.g:3317:4: ruleEString
            {
             before(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getShortestPathTaskAccess().getWaypointsWayPointCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortestPathTask__WaypointsAssignment_5_1"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000700000000L});

}
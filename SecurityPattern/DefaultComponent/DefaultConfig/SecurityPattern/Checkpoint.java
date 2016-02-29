/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Checkpoint
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/Checkpoint.java
*********************************************************************/

package SecurityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecurityPattern/Checkpoint.java                                                                  
//----------------------------------------------------------------------------

//## package SecurityPattern 


//## class Checkpoint 
public class Checkpoint implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCheckpoint = new AnimClass("SecurityPattern.Checkpoint",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Checkpoint.p_check_single_C p_check_single;		//## ignore 
    
    protected Checkpoint.p_check_right_C p_check_right;		//## ignore 
    
    protected Checkpoint.p_check_sp_C p_check_sp;		//## ignore 
    
    protected Checkpoint.p_check_data_C p_check_data;		//## ignore 
    
    protected Checkpoint.p_check_cen_C p_check_cen;		//## ignore 
    
    protected Rights itsRights;		//## link itsRights 
    
    protected Securitypolicy itsSecuritypolicy;		//## link itsSecuritypolicy 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## link itsSingleAccessPoint 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int ValidPolicy=1;
    public static final int sentToPolicy=2;
    public static final int sentToCheckpoint=3;
    public static final int RightValid=4;
    public static final int RightInvalid=5;
    public static final int Idle=6;
    public static final int IdentificationRight=7;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isPort(Object port) {
        return reactive.isPort(port);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Checkpoint(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassCheckpoint.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Checkpoint.p_check_single_C getP_check_single() {
        return p_check_single;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_single_C get_p_check_single() {
        return p_check_single;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_single_C newP_check_single() {
        p_check_single = new Checkpoint.p_check_single_C();
        return p_check_single;
    }
    
    //## auto_generated 
    public void deleteP_check_single() {
        p_check_single=null;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_right_C getP_check_right() {
        return p_check_right;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_right_C get_p_check_right() {
        return p_check_right;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_right_C newP_check_right() {
        p_check_right = new Checkpoint.p_check_right_C();
        return p_check_right;
    }
    
    //## auto_generated 
    public void deleteP_check_right() {
        p_check_right=null;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_sp_C getP_check_sp() {
        return p_check_sp;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_sp_C get_p_check_sp() {
        return p_check_sp;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_sp_C newP_check_sp() {
        p_check_sp = new Checkpoint.p_check_sp_C();
        return p_check_sp;
    }
    
    //## auto_generated 
    public void deleteP_check_sp() {
        p_check_sp=null;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_data_C getP_check_data() {
        return p_check_data;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_data_C get_p_check_data() {
        return p_check_data;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_data_C newP_check_data() {
        p_check_data = new Checkpoint.p_check_data_C();
        return p_check_data;
    }
    
    //## auto_generated 
    public void deleteP_check_data() {
        p_check_data=null;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_cen_C getP_check_cen() {
        return p_check_cen;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_cen_C get_p_check_cen() {
        return p_check_cen;
    }
    
    //## auto_generated 
    public Checkpoint.p_check_cen_C newP_check_cen() {
        p_check_cen = new Checkpoint.p_check_cen_C();
        return p_check_cen;
    }
    
    //## auto_generated 
    public void deleteP_check_cen() {
        p_check_cen=null;
    }
    
    //## auto_generated 
    public Rights getItsRights() {
        return itsRights;
    }
    
    //## auto_generated 
    public void __setItsRights(Rights p_Rights) {
        itsRights = p_Rights;
        if(p_Rights != null)
            {
                animInstance().notifyRelationAdded("itsRights", p_Rights);
            }
        else
            {
                animInstance().notifyRelationCleared("itsRights");
            }
    }
    
    //## auto_generated 
    public void _setItsRights(Rights p_Rights) {
        if(itsRights != null)
            {
                itsRights.__setItsCheckpoint(null);
            }
        __setItsRights(p_Rights);
    }
    
    //## auto_generated 
    public void setItsRights(Rights p_Rights) {
        if(p_Rights != null)
            {
                p_Rights._setItsCheckpoint(this);
            }
        _setItsRights(p_Rights);
    }
    
    //## auto_generated 
    public void _clearItsRights() {
        animInstance().notifyRelationCleared("itsRights");
        itsRights = null;
    }
    
    //## auto_generated 
    public Securitypolicy getItsSecuritypolicy() {
        return itsSecuritypolicy;
    }
    
    //## auto_generated 
    public void __setItsSecuritypolicy(Securitypolicy p_Securitypolicy) {
        itsSecuritypolicy = p_Securitypolicy;
        if(p_Securitypolicy != null)
            {
                animInstance().notifyRelationAdded("itsSecuritypolicy", p_Securitypolicy);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSecuritypolicy");
            }
    }
    
    //## auto_generated 
    public void _setItsSecuritypolicy(Securitypolicy p_Securitypolicy) {
        if(itsSecuritypolicy != null)
            {
                itsSecuritypolicy.__setItsCheckpoint(null);
            }
        __setItsSecuritypolicy(p_Securitypolicy);
    }
    
    //## auto_generated 
    public void setItsSecuritypolicy(Securitypolicy p_Securitypolicy) {
        if(p_Securitypolicy != null)
            {
                p_Securitypolicy._setItsCheckpoint(this);
            }
        _setItsSecuritypolicy(p_Securitypolicy);
    }
    
    //## auto_generated 
    public void _clearItsSecuritypolicy() {
        animInstance().notifyRelationCleared("itsSecuritypolicy");
        itsSecuritypolicy = null;
    }
    
    //## auto_generated 
    public SingleAccessPoint getItsSingleAccessPoint() {
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public void __setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        itsSingleAccessPoint = p_SingleAccessPoint;
        if(p_SingleAccessPoint != null)
            {
                animInstance().notifyRelationAdded("itsSingleAccessPoint", p_SingleAccessPoint);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSingleAccessPoint");
            }
    }
    
    //## auto_generated 
    public void _setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        if(itsSingleAccessPoint != null)
            {
                itsSingleAccessPoint.__setItsCheckpoint(null);
            }
        __setItsSingleAccessPoint(p_SingleAccessPoint);
    }
    
    //## auto_generated 
    public void setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        if(p_SingleAccessPoint != null)
            {
                p_SingleAccessPoint._setItsCheckpoint(this);
            }
        _setItsSingleAccessPoint(p_SingleAccessPoint);
    }
    
    //## auto_generated 
    public void _clearItsSingleAccessPoint() {
        animInstance().notifyRelationCleared("itsSingleAccessPoint");
        itsSingleAccessPoint = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_check_single = newP_check_single();
        p_check_right = newP_check_right();
        p_check_sp = newP_check_sp();
        p_check_data = newP_check_data();
        p_check_cen = newP_check_cen();
        if(getP_check_single() != null)
           getP_check_single().connectCheckpoint(this);
        if(getP_check_right() != null)
           getP_check_right().connectCheckpoint(this);
        if(getP_check_sp() != null)
           getP_check_sp().connectCheckpoint(this);
        if(getP_check_data() != null)
           getP_check_data().connectCheckpoint(this);
        if(getP_check_cen() != null)
           getP_check_cen().connectCheckpoint(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case Idle:
                {
                    Idle_add(animStates);
                }
                break;
                case sentToPolicy:
                {
                    sentToPolicy_add(animStates);
                }
                break;
                case ValidPolicy:
                {
                    ValidPolicy_add(animStates);
                }
                break;
                case sentToCheckpoint:
                {
                    sentToCheckpoint_add(animStates);
                }
                break;
                case IdentificationRight:
                {
                    IdentificationRight_add(animStates);
                }
                break;
                case RightValid:
                {
                    RightValid_add(animStates);
                }
                break;
                case RightInvalid:
                {
                    RightInvalid_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Idle:
                {
                    res = Idle_takeEvent(id);
                }
                break;
                case sentToPolicy:
                {
                    res = sentToPolicy_takeEvent(id);
                }
                break;
                case ValidPolicy:
                {
                    res = ValidPolicy_takeEvent(id);
                }
                break;
                case sentToCheckpoint:
                {
                    res = sentToCheckpoint_takeEvent(id);
                }
                break;
                case IdentificationRight:
                {
                    res = IdentificationRight_takeEvent(id);
                }
                break;
                case RightValid:
                {
                    res = RightValid_takeEvent(id);
                }
                break;
                case RightInvalid:
                {
                    res = RightInvalid_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void ValidPolicy_add(AnimStates animStates) {
            animStates.add("ROOT.ValidPolicy");
        }
        
        //## statechart_method 
        public void sentToPolicy_add(AnimStates animStates) {
            animStates.add("ROOT.sentToPolicy");
        }
        
        //## statechart_method 
        public void sentToCheckpoint_add(AnimStates animStates) {
            animStates.add("ROOT.sentToCheckpoint");
        }
        
        //## statechart_method 
        public void RightValid_add(AnimStates animStates) {
            animStates.add("ROOT.RightValid");
        }
        
        //## statechart_method 
        public void RightInvalid_add(AnimStates animStates) {
            animStates.add("ROOT.RightInvalid");
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## statechart_method 
        public void IdentificationRight_add(AnimStates animStates) {
            animStates.add("ROOT.IdentificationRight");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void RightInvalidExit() {
        }
        
        //## statechart_method 
        public void RightValidEnter() {
        }
        
        //## statechart_method 
        public int sentToPolicy_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sentToPolicyTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int IdentificationRight_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(allow.allow_SecurityPattern_id))
                {
                    res = IdentificationRightTakeallow();
                }
            else if(event.isTypeOf(notAllow.notAllow_SecurityPattern_id))
                {
                    res = IdentificationRightTakenotAllow();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int IdentificationRightTakeallow() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            IdentificationRight_exit();
            RightValid_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int RightInvalid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = RightInvalidTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToPolicy_exit() {
            popNullConfig();
            sentToPolicyExit();
            animInstance().notifyStateExited("ROOT.sentToPolicy");
        }
        
        //## statechart_method 
        public int RightValid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = RightValidTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void IdentificationRight_enter() {
            animInstance().notifyStateEntered("ROOT.IdentificationRight");
            rootState_subState = IdentificationRight;
            rootState_active = IdentificationRight;
            IdentificationRightEnter();
        }
        
        //## statechart_method 
        public void RightValid_exit() {
            popNullConfig();
            RightValidExit();
            animInstance().notifyStateExited("ROOT.RightValid");
        }
        
        //## statechart_method 
        public void RightValidExit() {
        }
        
        //## statechart_method 
        public void RightValid_entDef() {
            RightValid_enter();
        }
        
        //## statechart_method 
        public int sentToCheckpoint_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sentToCheckpointTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int sentToPolicyTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            sentToPolicy_exit();
            ValidPolicy_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ValidPolicyEnter() {
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(checkLogin.checkLogin_SecurityPattern_id))
                {
                    res = IdleTakecheckLogin();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Idle_enter() {
            animInstance().notifyStateEntered("ROOT.Idle");
            rootState_subState = Idle;
            rootState_active = Idle;
            IdleEnter();
        }
        
        //## statechart_method 
        public int RightValidTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            RightValid_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int RightInvalidTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            RightInvalid_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToCheckpoint_enter() {
            animInstance().notifyStateEntered("ROOT.sentToCheckpoint");
            pushNullConfig();
            rootState_subState = sentToCheckpoint;
            rootState_active = sentToCheckpoint;
            sentToCheckpointEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void IdleExit() {
        }
        
        //## statechart_method 
        public void Idle_entDef() {
            Idle_enter();
        }
        
        //## statechart_method 
        public int sentToCheckpointTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            sentToCheckpoint_exit();
            IdentificationRight_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ValidPolicy_exit() {
            popNullConfig();
            ValidPolicyExit();
            animInstance().notifyStateExited("ROOT.ValidPolicy");
        }
        
        //## statechart_method 
        public void ValidPolicy_enter() {
            animInstance().notifyStateEntered("ROOT.ValidPolicy");
            pushNullConfig();
            rootState_subState = ValidPolicy;
            rootState_active = ValidPolicy;
            ValidPolicyEnter();
        }
        
        //## statechart_method 
        public void sentToCheckpointExit() {
        }
        
        //## statechart_method 
        public void sentToCheckpointEnter() {
        }
        
        //## statechart_method 
        public void sentToPolicy_entDef() {
            sentToPolicy_enter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void RightInvalid_enter() {
            animInstance().notifyStateEntered("ROOT.RightInvalid");
            pushNullConfig();
            rootState_subState = RightInvalid;
            rootState_active = RightInvalid;
            RightInvalidEnter();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public int ValidPolicy_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ValidPolicyTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void IdentificationRightExit() {
        }
        
        //## statechart_method 
        public void RightValid_enter() {
            animInstance().notifyStateEntered("ROOT.RightValid");
            pushNullConfig();
            rootState_subState = RightValid;
            rootState_active = RightValid;
            RightValidEnter();
        }
        
        //## statechart_method 
        public void sentToCheckpoint_exit() {
            popNullConfig();
            sentToCheckpointExit();
            animInstance().notifyStateExited("ROOT.sentToCheckpoint");
        }
        
        //## statechart_method 
        public void sentToPolicyExit() {
        }
        
        //## statechart_method 
        public void ValidPolicy_entDef() {
            ValidPolicy_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("8");
            Idle_entDef();
            animInstance().notifyTransitionEnded("8");
        }
        
        //## statechart_method 
        public int IdentificationRightTakenotAllow() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            IdentificationRight_exit();
            RightInvalid_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void IdentificationRightEnter() {
        }
        
        //## statechart_method 
        public void RightInvalidEnter() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void sentToCheckpoint_entDef() {
            sentToCheckpoint_enter();
        }
        
        //## statechart_method 
        public void RightInvalid_entDef() {
            RightInvalid_enter();
        }
        
        //## statechart_method 
        public int ValidPolicyTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            ValidPolicy_exit();
            sentToCheckpoint_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ValidPolicyExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void IdentificationRight_exit() {
            IdentificationRightExit();
            animInstance().notifyStateExited("ROOT.IdentificationRight");
        }
        
        //## statechart_method 
        public void RightInvalid_exit() {
            popNullConfig();
            RightInvalidExit();
            animInstance().notifyStateExited("ROOT.RightInvalid");
        }
        
        //## statechart_method 
        public void sentToPolicyEnter() {
        }
        
        //## statechart_method 
        public void IdentificationRight_entDef() {
            IdentificationRight_enter();
        }
        
        //## statechart_method 
        public int IdleTakecheckLogin() {
            checkLogin params = (checkLogin) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            Idle_exit();
            //#[ transition 0 
            getP_check_sp().gen(new checkPolicy(params.usrid));
            //#]
            sentToPolicy_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToPolicy_enter() {
            animInstance().notifyStateEntered("ROOT.sentToPolicy");
            pushNullConfig();
            rootState_subState = sentToPolicy;
            rootState_active = sentToPolicy;
            sentToPolicyEnter();
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return Checkpoint.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_check_single_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_single_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckpoint(Checkpoint) 
        public void connectCheckpoint(Checkpoint part) {
            //#[ operation connectCheckpoint(Checkpoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_check_right_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_right_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckpoint(Checkpoint) 
        public void connectCheckpoint(Checkpoint part) {
            //#[ operation connectCheckpoint(Checkpoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_check_sp_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_sp_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckpoint(Checkpoint) 
        public void connectCheckpoint(Checkpoint part) {
            //#[ operation connectCheckpoint(Checkpoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_check_data_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_data_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckpoint(Checkpoint) 
        public void connectCheckpoint(Checkpoint part) {
            //#[ operation connectCheckpoint(Checkpoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_check_cen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_cen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckpoint(Checkpoint) 
        public void connectCheckpoint(Checkpoint part) {
            //#[ operation connectCheckpoint(Checkpoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCheckpoint; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsSingleAccessPoint", false, true, itsSingleAccessPoint);
        msg.add("itsSecuritypolicy", false, true, itsSecuritypolicy);
        msg.add("itsRights", false, true, itsRights);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Checkpoint.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Checkpoint.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Checkpoint.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/Checkpoint.java
*********************************************************************/


/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SingleAccessPoint
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/SingleAccessPoint.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/SingleAccessPoint.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class SingleAccessPoint 
public class SingleAccessPoint implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSingleAccessPoint = new AnimClass("SCADA.SingleAccessPoint",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected SingleAccessPoint.p_single_HMI_C p_single_HMI;		//## ignore 
    
    protected SingleAccessPoint.p_single_check_C p_single_check;		//## ignore 
    
    protected Checkpoint itsCheckpoint;		//## link itsCheckpoint 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Valid=1;
    public static final int ReceivedRequest=2;
    public static final int Invalid=3;
    public static final int Idle=4;
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
    public  SingleAccessPoint(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassSingleAccessPoint.getUserClass(),
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
    public SingleAccessPoint.p_single_HMI_C getP_single_HMI() {
        return p_single_HMI;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_HMI_C get_p_single_HMI() {
        return p_single_HMI;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_HMI_C newP_single_HMI() {
        p_single_HMI = new SingleAccessPoint.p_single_HMI_C();
        return p_single_HMI;
    }
    
    //## auto_generated 
    public void deleteP_single_HMI() {
        p_single_HMI=null;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_check_C getP_single_check() {
        return p_single_check;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_check_C get_p_single_check() {
        return p_single_check;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_check_C newP_single_check() {
        p_single_check = new SingleAccessPoint.p_single_check_C();
        return p_single_check;
    }
    
    //## auto_generated 
    public void deleteP_single_check() {
        p_single_check=null;
    }
    
    //## auto_generated 
    public Checkpoint getItsCheckpoint() {
        return itsCheckpoint;
    }
    
    //## auto_generated 
    public void __setItsCheckpoint(Checkpoint p_Checkpoint) {
        itsCheckpoint = p_Checkpoint;
        if(p_Checkpoint != null)
            {
                animInstance().notifyRelationAdded("itsCheckpoint", p_Checkpoint);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCheckpoint");
            }
    }
    
    //## auto_generated 
    public void _setItsCheckpoint(Checkpoint p_Checkpoint) {
        if(itsCheckpoint != null)
            {
                itsCheckpoint.__setItsSingleAccessPoint(null);
            }
        __setItsCheckpoint(p_Checkpoint);
    }
    
    //## auto_generated 
    public void setItsCheckpoint(Checkpoint p_Checkpoint) {
        if(p_Checkpoint != null)
            {
                p_Checkpoint._setItsSingleAccessPoint(this);
            }
        _setItsCheckpoint(p_Checkpoint);
    }
    
    //## auto_generated 
    public void _clearItsCheckpoint() {
        animInstance().notifyRelationCleared("itsCheckpoint");
        itsCheckpoint = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_single_HMI = newP_single_HMI();
        p_single_check = newP_single_check();
        if(getP_single_HMI() != null)
           getP_single_HMI().connectSingleAccessPoint(this);
        if(getP_single_check() != null)
           getP_single_check().connectSingleAccessPoint(this);
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
                case ReceivedRequest:
                {
                    ReceivedRequest_add(animStates);
                }
                break;
                case Valid:
                {
                    Valid_add(animStates);
                }
                break;
                case Invalid:
                {
                    Invalid_add(animStates);
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
                case ReceivedRequest:
                {
                    res = ReceivedRequest_takeEvent(id);
                }
                break;
                case Valid:
                {
                    res = Valid_takeEvent(id);
                }
                break;
                case Invalid:
                {
                    res = Invalid_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Valid_add(AnimStates animStates) {
            animStates.add("ROOT.Valid");
        }
        
        //## statechart_method 
        public void ReceivedRequest_add(AnimStates animStates) {
            animStates.add("ROOT.ReceivedRequest");
        }
        
        //## statechart_method 
        public void Invalid_add(AnimStates animStates) {
            animStates.add("ROOT.Invalid");
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void InvalidExit() {
        }
        
        //## statechart_method 
        public void InvalidEnter() {
        }
        
        //## statechart_method 
        public int ReceivedRequest_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(access.access_SCADA_id))
                {
                    res = ReceivedRequestTakeaccess();
                }
            else if(event.isTypeOf(rejected.rejected_SCADA_id))
                {
                    res = ReceivedRequestTakerejected();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ReceivedRequestEnter() {
        }
        
        //## statechart_method 
        public int InvalidTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Invalid_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Invalid_exit() {
            popNullConfig();
            InvalidExit();
            animInstance().notifyStateExited("ROOT.Invalid");
        }
        
        //## statechart_method 
        public void ReceivedRequest_entDef() {
            ReceivedRequest_enter();
        }
        
        //## statechart_method 
        public int Invalid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = InvalidTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ReceivedRequest_exit() {
            ReceivedRequestExit();
            animInstance().notifyStateExited("ROOT.ReceivedRequest");
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(sendtoSingleLogin.sendtoSingleLogin_SCADA_id))
                {
                    res = IdleTakesendtoSingleLogin();
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
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int ValidTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Valid_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Valid_entDef() {
            Valid_enter();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public int ReceivedRequestTakerejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            ReceivedRequest_exit();
            //#[ transition 3 
            getP_single_HMI().gen(new rejected());
            //#]
            Invalid_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ReceivedRequest_enter() {
            animInstance().notifyStateEntered("ROOT.ReceivedRequest");
            rootState_subState = ReceivedRequest;
            rootState_active = ReceivedRequest;
            ReceivedRequestEnter();
        }
        
        //## statechart_method 
        public void ReceivedRequestExit() {
        }
        
        //## statechart_method 
        public void Valid_enter() {
            animInstance().notifyStateEntered("ROOT.Valid");
            pushNullConfig();
            rootState_subState = Valid;
            rootState_active = Valid;
            ValidEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Invalid_entDef() {
            Invalid_enter();
        }
        
        //## statechart_method 
        public void ValidEnter() {
        }
        
        //## statechart_method 
        public int IdleTakesendtoSingleLogin() {
            sendtoSingleLogin params = (sendtoSingleLogin) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            getP_single_check().gen(new checkLogin(params.usrid));
            //#]
            ReceivedRequest_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void Invalid_enter() {
            animInstance().notifyStateEntered("ROOT.Invalid");
            pushNullConfig();
            rootState_subState = Invalid;
            rootState_active = Invalid;
            InvalidEnter();
        }
        
        //## statechart_method 
        public int ReceivedRequestTakeaccess() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            ReceivedRequest_exit();
            //#[ transition 2 
            getP_single_HMI().gen(new approved());
            //#]
            Valid_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Valid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ValidTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Valid_exit() {
            popNullConfig();
            ValidExit();
            animInstance().notifyStateExited("ROOT.Valid");
        }
        
        //## statechart_method 
        public void ValidExit() {
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
            return SingleAccessPoint.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_single_HMI_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_single_HMI_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSingleAccessPoint(SingleAccessPoint) 
        public void connectSingleAccessPoint(SingleAccessPoint part) {
            //#[ operation connectSingleAccessPoint(SingleAccessPoint) 
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
    public class p_single_check_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_single_check_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSingleAccessPoint(SingleAccessPoint) 
        public void connectSingleAccessPoint(SingleAccessPoint part) {
            //#[ operation connectSingleAccessPoint(SingleAccessPoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSingleAccessPoint; 
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
        
        msg.add("itsCheckpoint", false, true, itsCheckpoint);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(SingleAccessPoint.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            SingleAccessPoint.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            SingleAccessPoint.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/SingleAccessPoint.java
*********************************************************************/


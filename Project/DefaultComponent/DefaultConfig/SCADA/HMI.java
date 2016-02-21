/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: HMI
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/HMI.java
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
// SCADA/HMI.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class HMI 
public class HMI implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassHMI = new AnimClass("SCADA.HMI",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected HMI.p_HMI_cen_C p_HMI_cen;		//## ignore 
    
    protected HMI.p_HMI_single_C p_HMI_single;		//## ignore 
    
    protected CenterController itsCenterController;		//## link itsCenterController 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int signedIn=1;
    public static final int sentToField=2;
    public static final int requestData=3;
    public static final int receivedFromUsr=4;
    public static final int Idle=5;
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
    public  HMI(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassHMI.getUserClass(),
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
    public HMI.p_HMI_cen_C getP_HMI_cen() {
        return p_HMI_cen;
    }
    
    //## auto_generated 
    public HMI.p_HMI_cen_C get_p_HMI_cen() {
        return p_HMI_cen;
    }
    
    //## auto_generated 
    public HMI.p_HMI_cen_C newP_HMI_cen() {
        p_HMI_cen = new HMI.p_HMI_cen_C();
        return p_HMI_cen;
    }
    
    //## auto_generated 
    public void deleteP_HMI_cen() {
        p_HMI_cen=null;
    }
    
    //## auto_generated 
    public HMI.p_HMI_single_C getP_HMI_single() {
        return p_HMI_single;
    }
    
    //## auto_generated 
    public HMI.p_HMI_single_C get_p_HMI_single() {
        return p_HMI_single;
    }
    
    //## auto_generated 
    public HMI.p_HMI_single_C newP_HMI_single() {
        p_HMI_single = new HMI.p_HMI_single_C();
        return p_HMI_single;
    }
    
    //## auto_generated 
    public void deleteP_HMI_single() {
        p_HMI_single=null;
    }
    
    //## auto_generated 
    public CenterController getItsCenterController() {
        return itsCenterController;
    }
    
    //## auto_generated 
    public void __setItsCenterController(CenterController p_CenterController) {
        itsCenterController = p_CenterController;
        if(p_CenterController != null)
            {
                animInstance().notifyRelationAdded("itsCenterController", p_CenterController);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCenterController");
            }
    }
    
    //## auto_generated 
    public void _setItsCenterController(CenterController p_CenterController) {
        if(itsCenterController != null)
            {
                itsCenterController.__setItsHMI(null);
            }
        __setItsCenterController(p_CenterController);
    }
    
    //## auto_generated 
    public void setItsCenterController(CenterController p_CenterController) {
        if(p_CenterController != null)
            {
                p_CenterController._setItsHMI(this);
            }
        _setItsCenterController(p_CenterController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_HMI_cen = newP_HMI_cen();
        p_HMI_single = newP_HMI_single();
        if(getP_HMI_cen() != null)
           getP_HMI_cen().connectHMI(this);
        if(getP_HMI_single() != null)
           getP_HMI_single().connectHMI(this);
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
                case receivedFromUsr:
                {
                    receivedFromUsr_add(animStates);
                }
                break;
                case signedIn:
                {
                    signedIn_add(animStates);
                }
                break;
                case requestData:
                {
                    requestData_add(animStates);
                }
                break;
                case sentToField:
                {
                    sentToField_add(animStates);
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
                case receivedFromUsr:
                {
                    res = receivedFromUsr_takeEvent(id);
                }
                break;
                case signedIn:
                {
                    res = signedIn_takeEvent(id);
                }
                break;
                case requestData:
                {
                    res = requestData_takeEvent(id);
                }
                break;
                case sentToField:
                {
                    res = sentToField_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void signedIn_add(AnimStates animStates) {
            animStates.add("ROOT.signedIn");
        }
        
        //## statechart_method 
        public void sentToField_add(AnimStates animStates) {
            animStates.add("ROOT.sentToField");
        }
        
        //## statechart_method 
        public void requestData_add(AnimStates animStates) {
            animStates.add("ROOT.requestData");
        }
        
        //## statechart_method 
        public void receivedFromUsr_add(AnimStates animStates) {
            animStates.add("ROOT.receivedFromUsr");
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
        public void receivedFromUsrEnter() {
        }
        
        //## statechart_method 
        public void sentToField_entDef() {
            sentToField_enter();
        }
        
        //## statechart_method 
        public int signedInTakequeryData() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            signedIn_exit();
            requestData_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void signedIn_exit() {
            signedInExit();
            animInstance().notifyStateExited("ROOT.signedIn");
        }
        
        //## statechart_method 
        public void sentToField_exit() {
            popNullConfig();
            sentToFieldExit();
            animInstance().notifyStateExited("ROOT.sentToField");
        }
        
        //## statechart_method 
        public void signedIn_enter() {
            animInstance().notifyStateEntered("ROOT.signedIn");
            rootState_subState = signedIn;
            rootState_active = signedIn;
            signedInEnter();
        }
        
        //## statechart_method 
        public void receivedFromUsr_exit() {
            receivedFromUsrExit();
            animInstance().notifyStateExited("ROOT.receivedFromUsr");
        }
        
        //## statechart_method 
        public int signedIn_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(queryData.queryData_SCADA_id))
                {
                    res = signedInTakequeryData();
                }
            else if(event.isTypeOf(sendToField.sendToField_SCADA_id))
                {
                    res = signedInTakesendToField();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(signin.signin_SCADA_id))
                {
                    res = IdleTakesignin();
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
        public void requestData_entDef() {
            requestData_enter();
        }
        
        //## statechart_method 
        public void signedInExit() {
        }
        
        //## statechart_method 
        public void sentToField_enter() {
            animInstance().notifyStateEntered("ROOT.sentToField");
            pushNullConfig();
            rootState_subState = sentToField;
            rootState_active = sentToField;
            sentToFieldEnter();
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
        public int requestDataTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            requestData_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int sentToFieldTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            sentToField_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receivedFromUsr_entDef() {
            receivedFromUsr_enter();
        }
        
        //## statechart_method 
        public int requestData_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = requestDataTakeNull();
                }
            
            return res;
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
        public void signedIn_entDef() {
            signedIn_enter();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void receivedFromUsr_enter() {
            animInstance().notifyStateEntered("ROOT.receivedFromUsr");
            rootState_subState = receivedFromUsr;
            rootState_active = receivedFromUsr;
            receivedFromUsrEnter();
        }
        
        //## statechart_method 
        public void sentToFieldExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int receivedFromUsrTakerejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            receivedFromUsr_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestDataExit() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public int receivedFromUsr_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(rejected.rejected_SCADA_id))
                {
                    res = receivedFromUsrTakerejected();
                }
            else if(event.isTypeOf(approved.approved_SCADA_id))
                {
                    res = receivedFromUsrTakeapproved();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void requestData_enter() {
            animInstance().notifyStateEntered("ROOT.requestData");
            pushNullConfig();
            rootState_subState = requestData;
            rootState_active = requestData;
            requestDataEnter();
        }
        
        //## statechart_method 
        public void requestDataEnter() {
        }
        
        //## statechart_method 
        public int signedInTakesendToField() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            signedIn_exit();
            sentToField_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receivedFromUsrExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int receivedFromUsrTakeapproved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            receivedFromUsr_exit();
            signedIn_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void signedInEnter() {
        }
        
        //## statechart_method 
        public int IdleTakesignin() {
            signin params = (signin) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            getP_HMI_single().gen(new sendtoSingleLogin(params.usrid));
            //#]
            receivedFromUsr_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestData_exit() {
            popNullConfig();
            requestDataExit();
            animInstance().notifyStateExited("ROOT.requestData");
        }
        
        //## statechart_method 
        public int sentToField_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sentToFieldTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToFieldEnter() {
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
            return HMI.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_HMI_cen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_cen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectHMI(HMI) 
        public void connectHMI(HMI part) {
            //#[ operation connectHMI(HMI) 
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
    public class p_HMI_single_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_single_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectHMI(HMI) 
        public void connectHMI(HMI part) {
            //#[ operation connectHMI(HMI) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassHMI; 
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
        
        msg.add("itsCenterController", false, true, itsCenterController);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(HMI.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            HMI.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            HMI.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/HMI.java
*********************************************************************/


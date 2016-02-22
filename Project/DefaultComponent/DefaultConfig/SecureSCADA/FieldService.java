/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldService
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/FieldService.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/FieldService.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## class FieldService 
public class FieldService implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFieldService = new AnimClass("SecureSCADA.FieldService",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected FieldService.p_ser_con_C p_ser_con;		//## ignore 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Idle=1;
    public static final int FourniService=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int FieldService_Timeout_FourniService_id = 1;		//## ignore 
    
    
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
    public  FieldService(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassFieldService.getUserClass(),
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
    public FieldService.p_ser_con_C getP_ser_con() {
        return p_ser_con;
    }
    
    //## auto_generated 
    public FieldService.p_ser_con_C get_p_ser_con() {
        return p_ser_con;
    }
    
    //## auto_generated 
    public FieldService.p_ser_con_C newP_ser_con() {
        p_ser_con = new FieldService.p_ser_con_C();
        return p_ser_con;
    }
    
    //## auto_generated 
    public void deleteP_ser_con() {
        p_ser_con=null;
    }
    
    //## auto_generated 
    public FieldUnit getItsFieldUnit() {
        return itsFieldUnit;
    }
    
    //## auto_generated 
    public void __setItsFieldUnit(FieldUnit p_FieldUnit) {
        itsFieldUnit = p_FieldUnit;
        if(p_FieldUnit != null)
            {
                animInstance().notifyRelationAdded("itsFieldUnit", p_FieldUnit);
            }
        else
            {
                animInstance().notifyRelationCleared("itsFieldUnit");
            }
    }
    
    //## auto_generated 
    public void _setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(itsFieldUnit != null)
            {
                itsFieldUnit.__setItsFieldService(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsFieldService(this);
            }
        _setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void _clearItsFieldUnit() {
        animInstance().notifyRelationCleared("itsFieldUnit");
        itsFieldUnit = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_ser_con = newP_ser_con();
        if(getP_ser_con() != null)
           getP_ser_con().connectFieldService(this);
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
                case FourniService:
                {
                    FourniService_add(animStates);
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
                case FourniService:
                {
                    res = FourniService_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## statechart_method 
        public void FourniService_add(AnimStates animStates) {
            animStates.add("ROOT.FourniService");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int IdleTakerequestService() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            FourniService_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int FourniServiceTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == FieldService_Timeout_FourniService_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    FourniService_exit();
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(requestService.requestService_SecureSCADA_id))
                {
                    res = IdleTakerequestService();
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
        public int FourniService_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = FourniServiceTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FourniService_entDef() {
            FourniService_enter();
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
        public void FourniServiceEnter() {
            itsRiJThread.schedTimeout(1, FieldService_Timeout_FourniService_id, this, "ROOT.FourniService");
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void FourniService_exit() {
            FourniServiceExit();
            animInstance().notifyStateExited("ROOT.FourniService");
        }
        
        //## statechart_method 
        public void FourniService_enter() {
            animInstance().notifyStateEntered("ROOT.FourniService");
            rootState_subState = FourniService;
            rootState_active = FourniService;
            FourniServiceEnter();
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void FourniServiceExit() {
            itsRiJThread.unschedTimeout(FieldService_Timeout_FourniService_id, this);
        }
        
        //## statechart_method 
        public void rootStateExit() {
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
            return FieldService.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_ser_con_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_ser_con_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFieldService(FieldService) 
        public void connectFieldService(FieldService part) {
            //#[ operation connectFieldService(FieldService) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassFieldService; 
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
        
        msg.add("itsFieldUnit", false, true, itsFieldUnit);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(FieldService.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            FieldService.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            FieldService.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/FieldService.java
*********************************************************************/


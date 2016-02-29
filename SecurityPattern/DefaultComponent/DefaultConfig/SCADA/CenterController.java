/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CenterController
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/CenterController.java
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
// SCADA/CenterController.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class CenterController 
public class CenterController implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCenterController = new AnimClass("SCADA.CenterController",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected CenterController.p_cen_HMI_C p_cen_HMI;		//## ignore 
    
    protected CenterController.p_cen_net_C p_cen_net;		//## ignore 
    
    protected Checkpoint itsCheckpoint;		//## classInstance itsCheckpoint 
    
    protected DataServer itsDataServer;		//## link itsDataServer 
    
    protected DataServer itsDataServer_0;		//## classInstance itsDataServer_0 
    
    protected HMI itsHMI;		//## link itsHMI 
    
    protected HMI itsHMI_0;		//## classInstance itsHMI_0 
    
    protected Network itsNetwork;		//## link itsNetwork 
    
    protected Rights itsRights;		//## classInstance itsRights 
    
    protected Securitypolicy itsSecuritypolicy;		//## classInstance itsSecuritypolicy 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## classInstance itsSingleAccessPoint 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int requestedHMI=1;
    public static final int Idle=2;
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
    public  CenterController(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassCenterController.getUserClass(),
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
    public CenterController.p_cen_HMI_C getP_cen_HMI() {
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public CenterController.p_cen_HMI_C get_p_cen_HMI() {
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public CenterController.p_cen_HMI_C newP_cen_HMI() {
        p_cen_HMI = new CenterController.p_cen_HMI_C();
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public void deleteP_cen_HMI() {
        p_cen_HMI=null;
    }
    
    //## auto_generated 
    public CenterController.p_cen_net_C getP_cen_net() {
        return p_cen_net;
    }
    
    //## auto_generated 
    public CenterController.p_cen_net_C get_p_cen_net() {
        return p_cen_net;
    }
    
    //## auto_generated 
    public CenterController.p_cen_net_C newP_cen_net() {
        p_cen_net = new CenterController.p_cen_net_C();
        return p_cen_net;
    }
    
    //## auto_generated 
    public void deleteP_cen_net() {
        p_cen_net=null;
    }
    
    //## auto_generated 
    public Checkpoint getItsCheckpoint() {
        return itsCheckpoint;
    }
    
    //## auto_generated 
    public Checkpoint newItsCheckpoint(RiJThread p_thread) {
        itsCheckpoint = new Checkpoint(p_thread);
        animInstance().notifyRelationAdded("itsCheckpoint", itsCheckpoint);
        return itsCheckpoint;
    }
    
    //## auto_generated 
    public void deleteItsCheckpoint() {
        animInstance().notifyRelationRemoved("itsCheckpoint", itsCheckpoint);
        itsCheckpoint=null;
    }
    
    //## auto_generated 
    public DataServer getItsDataServer() {
        return itsDataServer;
    }
    
    //## auto_generated 
    public void __setItsDataServer(DataServer p_DataServer) {
        itsDataServer = p_DataServer;
        if(p_DataServer != null)
            {
                animInstance().notifyRelationAdded("itsDataServer", p_DataServer);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDataServer");
            }
    }
    
    //## auto_generated 
    public void _setItsDataServer(DataServer p_DataServer) {
        if(itsDataServer != null)
            {
                itsDataServer.__setItsCenterController(null);
            }
        __setItsDataServer(p_DataServer);
    }
    
    //## auto_generated 
    public DataServer newItsDataServer() {
        itsDataServer = new DataServer();
        itsDataServer._setItsCenterController(this);
        animInstance().notifyRelationAdded("itsDataServer", itsDataServer);
        return itsDataServer;
    }
    
    //## auto_generated 
    public void deleteItsDataServer() {
        itsDataServer.__setItsCenterController(null);
        animInstance().notifyRelationRemoved("itsDataServer", itsDataServer);
        itsDataServer=null;
    }
    
    //## auto_generated 
    public DataServer getItsDataServer_0() {
        return itsDataServer_0;
    }
    
    //## auto_generated 
    public DataServer newItsDataServer_0() {
        itsDataServer_0 = new DataServer();
        animInstance().notifyRelationAdded("itsDataServer_0", itsDataServer_0);
        return itsDataServer_0;
    }
    
    //## auto_generated 
    public void deleteItsDataServer_0() {
        animInstance().notifyRelationRemoved("itsDataServer_0", itsDataServer_0);
        itsDataServer_0=null;
    }
    
    //## auto_generated 
    public HMI getItsHMI() {
        return itsHMI;
    }
    
    //## auto_generated 
    public void __setItsHMI(HMI p_HMI) {
        itsHMI = p_HMI;
        if(p_HMI != null)
            {
                animInstance().notifyRelationAdded("itsHMI", p_HMI);
            }
        else
            {
                animInstance().notifyRelationCleared("itsHMI");
            }
    }
    
    //## auto_generated 
    public void _setItsHMI(HMI p_HMI) {
        if(itsHMI != null)
            {
                itsHMI.__setItsCenterController(null);
            }
        __setItsHMI(p_HMI);
    }
    
    //## auto_generated 
    public HMI newItsHMI(RiJThread p_thread) {
        itsHMI = new HMI(p_thread);
        itsHMI._setItsCenterController(this);
        animInstance().notifyRelationAdded("itsHMI", itsHMI);
        return itsHMI;
    }
    
    //## auto_generated 
    public void deleteItsHMI() {
        itsHMI.__setItsCenterController(null);
        animInstance().notifyRelationRemoved("itsHMI", itsHMI);
        itsHMI=null;
    }
    
    //## auto_generated 
    public HMI getItsHMI_0() {
        return itsHMI_0;
    }
    
    //## auto_generated 
    public HMI newItsHMI_0(RiJThread p_thread) {
        itsHMI_0 = new HMI(p_thread);
        animInstance().notifyRelationAdded("itsHMI_0", itsHMI_0);
        return itsHMI_0;
    }
    
    //## auto_generated 
    public void deleteItsHMI_0() {
        animInstance().notifyRelationRemoved("itsHMI_0", itsHMI_0);
        itsHMI_0=null;
    }
    
    //## auto_generated 
    public Network getItsNetwork() {
        return itsNetwork;
    }
    
    //## auto_generated 
    public void __setItsNetwork(Network p_Network) {
        itsNetwork = p_Network;
        if(p_Network != null)
            {
                animInstance().notifyRelationAdded("itsNetwork", p_Network);
            }
        else
            {
                animInstance().notifyRelationCleared("itsNetwork");
            }
    }
    
    //## auto_generated 
    public void _setItsNetwork(Network p_Network) {
        if(itsNetwork != null)
            {
                itsNetwork.__setItsCenterController(null);
            }
        __setItsNetwork(p_Network);
    }
    
    //## auto_generated 
    public void setItsNetwork(Network p_Network) {
        if(p_Network != null)
            {
                p_Network._setItsCenterController(this);
            }
        _setItsNetwork(p_Network);
    }
    
    //## auto_generated 
    public void _clearItsNetwork() {
        animInstance().notifyRelationCleared("itsNetwork");
        itsNetwork = null;
    }
    
    //## auto_generated 
    public Rights getItsRights() {
        return itsRights;
    }
    
    //## auto_generated 
    public Rights newItsRights(RiJThread p_thread) {
        itsRights = new Rights(p_thread);
        animInstance().notifyRelationAdded("itsRights", itsRights);
        return itsRights;
    }
    
    //## auto_generated 
    public void deleteItsRights() {
        animInstance().notifyRelationRemoved("itsRights", itsRights);
        itsRights=null;
    }
    
    //## auto_generated 
    public Securitypolicy getItsSecuritypolicy() {
        return itsSecuritypolicy;
    }
    
    //## auto_generated 
    public Securitypolicy newItsSecuritypolicy(RiJThread p_thread) {
        itsSecuritypolicy = new Securitypolicy(p_thread);
        animInstance().notifyRelationAdded("itsSecuritypolicy", itsSecuritypolicy);
        return itsSecuritypolicy;
    }
    
    //## auto_generated 
    public void deleteItsSecuritypolicy() {
        animInstance().notifyRelationRemoved("itsSecuritypolicy", itsSecuritypolicy);
        itsSecuritypolicy=null;
    }
    
    //## auto_generated 
    public SingleAccessPoint getItsSingleAccessPoint() {
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public SingleAccessPoint newItsSingleAccessPoint(RiJThread p_thread) {
        itsSingleAccessPoint = new SingleAccessPoint(p_thread);
        animInstance().notifyRelationAdded("itsSingleAccessPoint", itsSingleAccessPoint);
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public void deleteItsSingleAccessPoint() {
        animInstance().notifyRelationRemoved("itsSingleAccessPoint", itsSingleAccessPoint);
        itsSingleAccessPoint=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_cen_HMI = newP_cen_HMI();
        p_cen_net = newP_cen_net();
        itsCheckpoint = newItsCheckpoint(p_thread);
        itsDataServer = newItsDataServer();
        itsDataServer_0 = newItsDataServer_0();
        itsHMI = newItsHMI(p_thread);
        itsHMI_0 = newItsHMI_0(p_thread);
        itsRights = newItsRights(p_thread);
        itsSecuritypolicy = newItsSecuritypolicy(p_thread);
        itsSingleAccessPoint = newItsSingleAccessPoint(p_thread);
        {
            
            getP_cen_HMI().setItsDefaultProvidedInterface(itsHMI_0.getP_HMI_cen().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_0.getP_HMI_cen().setItsDefaultRequiredInterface(getP_cen_HMI().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsHMI_0.getP_HMI_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_HMI().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_single_HMI().setItsDefaultRequiredInterface(itsHMI_0.getP_HMI_single().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSingleAccessPoint.getP_single_check().setItsDefaultRequiredInterface(itsCheckpoint.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckpoint.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckpoint.getP_check_right().setItsDefaultRequiredInterface(itsRights.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights.getP_right_check().setItsDefaultRequiredInterface(itsCheckpoint.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSecuritypolicy.getP_sp_check().setItsDefaultRequiredInterface(itsCheckpoint.getP_check_sp().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckpoint.getP_check_sp().setItsDefaultRequiredInterface(itsSecuritypolicy.getP_sp_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckpoint.getP_check_data().setItsDefaultRequiredInterface(itsDataServer_0.getP_data_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsDataServer_0.getP_data_check().setItsDefaultRequiredInterface(itsCheckpoint.getP_check_data().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_cen_net().setItsDefaultProvidedInterface(itsCheckpoint.getP_check_cen().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckpoint.getP_check_cen().setItsDefaultRequiredInterface(getP_cen_net().getItsDefaultRequiredInterface());
            
        }
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckpoint.startBehavior();
        done &= itsHMI.startBehavior();
        done &= itsHMI_0.startBehavior();
        done &= itsRights.startBehavior();
        done &= itsSecuritypolicy.startBehavior();
        done &= itsSingleAccessPoint.startBehavior();
        done &= reactive.startBehavior();
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
                case requestedHMI:
                {
                    requestedHMI_add(animStates);
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
            if(rootState_active == Idle)
                {
                    res = Idle_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void requestedHMI_add(AnimStates animStates) {
            animStates.add("ROOT.requestedHMI");
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
        public void requestedHMI_enter() {
            animInstance().notifyStateEntered("ROOT.requestedHMI");
            rootState_subState = requestedHMI;
            rootState_active = requestedHMI;
            requestedHMIEnter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(login.login_SCADA_id))
                {
                    res = IdleTakelogin();
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
        public void requestedHMIExit() {
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
        public int IdleTakelogin() {
            login params = (login) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            System.out.println(getP_cen_HMI());
            getP_cen_HMI().gen(new signin(params.usrid));
            //#]
            requestedHMI_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int requestedHMI_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
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
        public void requestedHMIEnter() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void requestedHMI_entDef() {
            requestedHMI_enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void requestedHMI_exit() {
            requestedHMIExit();
            animInstance().notifyStateExited("ROOT.requestedHMI");
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
            return CenterController.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_HMI_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_HMI_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_net_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_net_C() {
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCenterController; 
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
        
        msg.add("itsHMI", true, true, itsHMI);
        msg.add("itsDataServer", true, true, itsDataServer);
        msg.add("itsNetwork", false, true, itsNetwork);
        msg.add("itsCheckpoint", true, true, itsCheckpoint);
        msg.add("itsRights", true, true, itsRights);
        msg.add("itsSingleAccessPoint", true, true, itsSingleAccessPoint);
        msg.add("itsSecuritypolicy", true, true, itsSecuritypolicy);
        msg.add("itsHMI_0", true, true, itsHMI_0);
        msg.add("itsDataServer_0", true, true, itsDataServer_0);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CenterController.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CenterController.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CenterController.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/CenterController.java
*********************************************************************/


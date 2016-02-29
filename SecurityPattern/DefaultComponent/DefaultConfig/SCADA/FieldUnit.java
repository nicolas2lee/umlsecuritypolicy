/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldUnit
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/FieldUnit.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/FieldUnit.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class FieldUnit 
public class FieldUnit implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFieldUnit = new AnimClass("SCADA.FieldUnit",false);
    //#]
    
    protected FieldUnit.p_field_net_C p_field_net;		//## ignore 
    
    protected FieldService itsFieldService;		//## link itsFieldService 
    
    protected FieldService itsFieldService_0;		//## classInstance itsFieldService_0 
    
    protected LocalController itsLocalController;		//## link itsLocalController 
    
    protected LocalController itsLocalController_0;		//## classInstance itsLocalController_0 
    
    protected Network itsNetwork;		//## link itsNetwork 
    
    
    // Constructors
    
    //## auto_generated 
    public  FieldUnit() {
        try {
            animInstance().notifyConstructorEntered(animClassFieldUnit.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public FieldUnit.p_field_net_C getP_field_net() {
        return p_field_net;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_net_C get_p_field_net() {
        return p_field_net;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_net_C newP_field_net() {
        p_field_net = new FieldUnit.p_field_net_C();
        return p_field_net;
    }
    
    //## auto_generated 
    public void deleteP_field_net() {
        p_field_net=null;
    }
    
    //## auto_generated 
    public FieldService getItsFieldService() {
        return itsFieldService;
    }
    
    //## auto_generated 
    public void __setItsFieldService(FieldService p_FieldService) {
        itsFieldService = p_FieldService;
        if(p_FieldService != null)
            {
                animInstance().notifyRelationAdded("itsFieldService", p_FieldService);
            }
        else
            {
                animInstance().notifyRelationCleared("itsFieldService");
            }
    }
    
    //## auto_generated 
    public void _setItsFieldService(FieldService p_FieldService) {
        if(itsFieldService != null)
            {
                itsFieldService.__setItsFieldUnit(null);
            }
        __setItsFieldService(p_FieldService);
    }
    
    //## auto_generated 
    public FieldService newItsFieldService() {
        itsFieldService = new FieldService();
        itsFieldService._setItsFieldUnit(this);
        animInstance().notifyRelationAdded("itsFieldService", itsFieldService);
        return itsFieldService;
    }
    
    //## auto_generated 
    public void deleteItsFieldService() {
        itsFieldService.__setItsFieldUnit(null);
        animInstance().notifyRelationRemoved("itsFieldService", itsFieldService);
        itsFieldService=null;
    }
    
    //## auto_generated 
    public FieldService getItsFieldService_0() {
        return itsFieldService_0;
    }
    
    //## auto_generated 
    public FieldService newItsFieldService_0() {
        itsFieldService_0 = new FieldService();
        animInstance().notifyRelationAdded("itsFieldService_0", itsFieldService_0);
        return itsFieldService_0;
    }
    
    //## auto_generated 
    public void deleteItsFieldService_0() {
        animInstance().notifyRelationRemoved("itsFieldService_0", itsFieldService_0);
        itsFieldService_0=null;
    }
    
    //## auto_generated 
    public LocalController getItsLocalController() {
        return itsLocalController;
    }
    
    //## auto_generated 
    public void __setItsLocalController(LocalController p_LocalController) {
        itsLocalController = p_LocalController;
        if(p_LocalController != null)
            {
                animInstance().notifyRelationAdded("itsLocalController", p_LocalController);
            }
        else
            {
                animInstance().notifyRelationCleared("itsLocalController");
            }
    }
    
    //## auto_generated 
    public void _setItsLocalController(LocalController p_LocalController) {
        if(itsLocalController != null)
            {
                itsLocalController.__setItsFieldUnit(null);
            }
        __setItsLocalController(p_LocalController);
    }
    
    //## auto_generated 
    public LocalController newItsLocalController() {
        itsLocalController = new LocalController();
        itsLocalController._setItsFieldUnit(this);
        animInstance().notifyRelationAdded("itsLocalController", itsLocalController);
        return itsLocalController;
    }
    
    //## auto_generated 
    public void deleteItsLocalController() {
        itsLocalController.__setItsFieldUnit(null);
        animInstance().notifyRelationRemoved("itsLocalController", itsLocalController);
        itsLocalController=null;
    }
    
    //## auto_generated 
    public LocalController getItsLocalController_0() {
        return itsLocalController_0;
    }
    
    //## auto_generated 
    public LocalController newItsLocalController_0() {
        itsLocalController_0 = new LocalController();
        animInstance().notifyRelationAdded("itsLocalController_0", itsLocalController_0);
        return itsLocalController_0;
    }
    
    //## auto_generated 
    public void deleteItsLocalController_0() {
        animInstance().notifyRelationRemoved("itsLocalController_0", itsLocalController_0);
        itsLocalController_0=null;
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
                itsNetwork.__setItsFieldUnit(null);
            }
        __setItsNetwork(p_Network);
    }
    
    //## auto_generated 
    public void setItsNetwork(Network p_Network) {
        if(p_Network != null)
            {
                p_Network._setItsFieldUnit(this);
            }
        _setItsNetwork(p_Network);
    }
    
    //## auto_generated 
    public void _clearItsNetwork() {
        animInstance().notifyRelationCleared("itsNetwork");
        itsNetwork = null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        p_field_net = newP_field_net();
        itsFieldService = newItsFieldService();
        itsFieldService_0 = newItsFieldService_0();
        itsLocalController = newItsLocalController();
        itsLocalController_0 = newItsLocalController_0();
        {
            
            getP_field_net().setItsDefaultProvidedInterface(itsLocalController_0.getP_con_field().getItsDefaultProvidedInterface());
            
        }{
            
            itsLocalController_0.getP_con_field().setItsDefaultRequiredInterface(getP_field_net().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsLocalController_0.getP_con_ser().setItsDefaultRequiredInterface(itsFieldService_0.getP_ser_con().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldService_0.getP_ser_con().setItsDefaultRequiredInterface(itsLocalController_0.getP_con_ser().getItsDefaultProvidedInterface());
            
        }
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_field_net_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_field_net_C() {
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassFieldUnit; 
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
        
        msg.add("itsLocalController", true, true, itsLocalController);
        msg.add("itsFieldService", true, true, itsFieldService);
        msg.add("itsLocalController_0", true, true, itsLocalController_0);
        msg.add("itsFieldService_0", true, true, itsFieldService_0);
        msg.add("itsNetwork", false, true, itsNetwork);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(FieldUnit.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            FieldUnit.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            FieldUnit.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/FieldUnit.java
*********************************************************************/


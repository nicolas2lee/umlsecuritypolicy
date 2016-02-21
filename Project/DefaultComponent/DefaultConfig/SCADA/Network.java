/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Network
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/Network.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/Network.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class Network 
public class Network implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassNetwork = new AnimClass("SCADA.Network",false);
    //#]
    
    protected Network.p_net_cen_C p_net_cen;		//## ignore 
    
    protected Network.p_net_field_C p_net_field;		//## ignore 
    
    protected CenterController itsCenterController;		//## link itsCenterController 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    
    // Constructors
    
    //## auto_generated 
    public  Network() {
        try {
            animInstance().notifyConstructorEntered(animClassNetwork.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Network.p_net_cen_C getP_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public Network.p_net_cen_C get_p_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public Network.p_net_cen_C newP_net_cen() {
        p_net_cen = new Network.p_net_cen_C();
        return p_net_cen;
    }
    
    //## auto_generated 
    public void deleteP_net_cen() {
        p_net_cen=null;
    }
    
    //## auto_generated 
    public Network.p_net_field_C getP_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public Network.p_net_field_C get_p_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public Network.p_net_field_C newP_net_field() {
        p_net_field = new Network.p_net_field_C();
        return p_net_field;
    }
    
    //## auto_generated 
    public void deleteP_net_field() {
        p_net_field=null;
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
                itsCenterController.__setItsNetwork(null);
            }
        __setItsCenterController(p_CenterController);
    }
    
    //## auto_generated 
    public void setItsCenterController(CenterController p_CenterController) {
        if(p_CenterController != null)
            {
                p_CenterController._setItsNetwork(this);
            }
        _setItsCenterController(p_CenterController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
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
                itsFieldUnit.__setItsNetwork(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsNetwork(this);
            }
        _setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void _clearItsFieldUnit() {
        animInstance().notifyRelationCleared("itsFieldUnit");
        itsFieldUnit = null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        p_net_cen = newP_net_cen();
        p_net_field = newP_net_field();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_net_cen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_net_cen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectNetwork(Network) 
        public void connectNetwork(Network part) {
            //#[ operation connectNetwork(Network) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_net_field_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_net_field_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectNetwork(Network) 
        public void connectNetwork(Network part) {
            //#[ operation connectNetwork(Network) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassNetwork; 
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
        msg.add("itsFieldUnit", false, true, itsFieldUnit);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Network.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Network.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Network.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/Network.java
*********************************************************************/


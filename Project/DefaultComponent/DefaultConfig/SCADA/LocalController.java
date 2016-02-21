/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: LocalController
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/LocalController.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/LocalController.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class LocalController 
public class LocalController implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassLocalController = new AnimClass("SCADA.LocalController",false);
    //#]
    
    protected LocalController.p_con_field_C p_con_field;		//## ignore 
    
    protected LocalController.p_con_ser_C p_con_ser;		//## ignore 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    
    // Constructors
    
    //## auto_generated 
    public  LocalController() {
        try {
            animInstance().notifyConstructorEntered(animClassLocalController.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public LocalController.p_con_field_C getP_con_field() {
        return p_con_field;
    }
    
    //## auto_generated 
    public LocalController.p_con_field_C get_p_con_field() {
        return p_con_field;
    }
    
    //## auto_generated 
    public LocalController.p_con_field_C newP_con_field() {
        p_con_field = new LocalController.p_con_field_C();
        return p_con_field;
    }
    
    //## auto_generated 
    public void deleteP_con_field() {
        p_con_field=null;
    }
    
    //## auto_generated 
    public LocalController.p_con_ser_C getP_con_ser() {
        return p_con_ser;
    }
    
    //## auto_generated 
    public LocalController.p_con_ser_C get_p_con_ser() {
        return p_con_ser;
    }
    
    //## auto_generated 
    public LocalController.p_con_ser_C newP_con_ser() {
        p_con_ser = new LocalController.p_con_ser_C();
        return p_con_ser;
    }
    
    //## auto_generated 
    public void deleteP_con_ser() {
        p_con_ser=null;
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
                itsFieldUnit.__setItsLocalController(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsLocalController(this);
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
        p_con_field = newP_con_field();
        p_con_ser = newP_con_ser();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_field_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_field_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectLocalController(LocalController) 
        public void connectLocalController(LocalController part) {
            //#[ operation connectLocalController(LocalController) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_ser_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_ser_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectLocalController(LocalController) 
        public void connectLocalController(LocalController part) {
            //#[ operation connectLocalController(LocalController) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassLocalController; 
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
            super(LocalController.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            LocalController.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            LocalController.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/LocalController.java
*********************************************************************/


/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldService
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/FieldService.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/FieldService.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class FieldService 
public class FieldService implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFieldService = new AnimClass("SCADA.FieldService",false);
    //#]
    
    protected FieldService.p_ser_con_C p_ser_con;		//## ignore 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    
    // Constructors
    
    //## auto_generated 
    public  FieldService() {
        try {
            animInstance().notifyConstructorEntered(animClassFieldService.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
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
    protected void initRelations() {
        p_ser_con = newP_ser_con();
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
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/FieldService.java
*********************************************************************/


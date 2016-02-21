/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DataServer
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/DataServer.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/DataServer.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## class DataServer 
public class DataServer implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDataServer = new AnimClass("SCADA.DataServer",false);
    //#]
    
    protected DataServer.p_data_check_C p_data_check;		//## ignore 
    
    protected CenterController itsCenterController;		//## link itsCenterController 
    
    
    // Constructors
    
    //## auto_generated 
    public  DataServer() {
        try {
            animInstance().notifyConstructorEntered(animClassDataServer.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public DataServer.p_data_check_C getP_data_check() {
        return p_data_check;
    }
    
    //## auto_generated 
    public DataServer.p_data_check_C get_p_data_check() {
        return p_data_check;
    }
    
    //## auto_generated 
    public DataServer.p_data_check_C newP_data_check() {
        p_data_check = new DataServer.p_data_check_C();
        return p_data_check;
    }
    
    //## auto_generated 
    public void deleteP_data_check() {
        p_data_check=null;
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
                itsCenterController.__setItsDataServer(null);
            }
        __setItsCenterController(p_CenterController);
    }
    
    //## auto_generated 
    public void setItsCenterController(CenterController p_CenterController) {
        if(p_CenterController != null)
            {
                p_CenterController._setItsDataServer(this);
            }
        _setItsCenterController(p_CenterController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        p_data_check = newP_data_check();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_data_check_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_data_check_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectDataServer(DataServer) 
        public void connectDataServer(DataServer part) {
            //#[ operation connectDataServer(DataServer) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDataServer; 
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
            super(DataServer.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            DataServer.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            DataServer.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/DataServer.java
*********************************************************************/


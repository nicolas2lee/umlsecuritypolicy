/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkRight
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/checkRight.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/checkRight.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## event checkRight(int,String) 
public class checkRight extends RiJEvent implements AnimatedEvent {
    
    public static final int checkRight_SCADA_id = 8032;		//## ignore 
    
    public int task;
    public String usrid;
    
    // Constructors
    
    public  checkRight() {
        lId = checkRight_SCADA_id;
    }
    public  checkRight(int p_task, String p_usrid) {
        lId = checkRight_SCADA_id;
        task = p_task;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (checkRight_SCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SCADA.checkRight");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
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
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
          msg.add("task", task);
          msg.add("usrid", usrid);
    }
    public String toString() {
          String s="checkRight(";      
          s += "task=" + AnimInstance.animToString(task) + " ";
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/checkRight.java
*********************************************************************/


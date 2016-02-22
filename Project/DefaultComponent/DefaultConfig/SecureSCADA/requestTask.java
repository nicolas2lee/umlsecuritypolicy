/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: requestTask
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/requestTask.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/requestTask.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event requestTask(int) 
public class requestTask extends RiJEvent implements AnimatedEvent {
    
    public static final int requestTask_SecureSCADA_id = 8043;		//## ignore 
    
    public int task;
    
    // Constructors
    
    public  requestTask() {
        lId = requestTask_SecureSCADA_id;
    }
    public  requestTask(int p_task) {
        lId = requestTask_SecureSCADA_id;
        task = p_task;
    }
    
    public boolean isTypeOf(long id) {
        return (requestTask_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.requestTask");
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
    }
    public String toString() {
          String s="requestTask(";      
          s += "task=" + AnimInstance.animToString(task) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/requestTask.java
*********************************************************************/


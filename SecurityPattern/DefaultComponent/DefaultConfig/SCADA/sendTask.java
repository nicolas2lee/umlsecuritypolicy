/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendTask
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/sendTask.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/sendTask.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## event sendTask(int,String) 
public class sendTask extends RiJEvent implements AnimatedEvent {
    
    public static final int sendTask_SCADA_id = 8031;		//## ignore 
    
    public int task;
    public String usrid;
    
    // Constructors
    
    public  sendTask() {
        lId = sendTask_SCADA_id;
    }
    public  sendTask(int p_task, String p_usrid) {
        lId = sendTask_SCADA_id;
        task = p_task;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (sendTask_SCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SCADA.sendTask");
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
          String s="sendTask(";      
          s += "task=" + AnimInstance.animToString(task) + " ";
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/sendTask.java
*********************************************************************/


/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendTask
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/sendTask.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/sendTask.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event sendTask(int,String) 
public class sendTask extends RiJEvent implements AnimatedEvent {
    
    public static final int sendTask_SecureSCADA_id = 8031;		//## ignore 
    
    public int task;
    public String usrid;
    
    // Constructors
    
    public  sendTask() {
        lId = sendTask_SecureSCADA_id;
    }
    public  sendTask(int p_task, String p_usrid) {
        lId = sendTask_SecureSCADA_id;
        task = p_task;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (sendTask_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.sendTask");
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
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/sendTask.java
*********************************************************************/


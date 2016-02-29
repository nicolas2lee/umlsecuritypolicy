/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkRight
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/checkRight.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/checkRight.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event checkRight(int,String) 
public class checkRight extends RiJEvent implements AnimatedEvent {
    
    public static final int checkRight_SecureSCADA_id = 8032;		//## ignore 
    
    public int task;
    public String usrid;
    
    // Constructors
    
    public  checkRight() {
        lId = checkRight_SecureSCADA_id;
    }
    public  checkRight(int p_task, String p_usrid) {
        lId = checkRight_SecureSCADA_id;
        task = p_task;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (checkRight_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.checkRight");
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
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/checkRight.java
*********************************************************************/


/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkPolicy
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/checkPolicy.java
*********************************************************************/

package SecurityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecurityPattern/checkPolicy.java                                                                  
//----------------------------------------------------------------------------

//## package SecurityPattern 


//## event checkPolicy(String) 
public class checkPolicy extends RiJEvent implements AnimatedEvent {
    
    public static final int checkPolicy_SecurityPattern_id = 17423;		//## ignore 
    
    public String usrid;
    
    // Constructors
    
    public  checkPolicy() {
        lId = checkPolicy_SecurityPattern_id;
    }
    public  checkPolicy(String p_usrid) {
        lId = checkPolicy_SecurityPattern_id;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (checkPolicy_SecurityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecurityPattern.checkPolicy");
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
          msg.add("usrid", usrid);
    }
    public String toString() {
          String s="checkPolicy(";      
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/checkPolicy.java
*********************************************************************/


/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkLogin
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/checkLogin.java
*********************************************************************/

package SecurityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecurityPattern/checkLogin.java                                                                  
//----------------------------------------------------------------------------

//## package SecurityPattern 


//## event checkLogin(String) 
public class checkLogin extends RiJEvent implements AnimatedEvent {
    
    public static final int checkLogin_SecurityPattern_id = 17424;		//## ignore 
    
    public String usrid;
    
    // Constructors
    
    public  checkLogin() {
        lId = checkLogin_SecurityPattern_id;
    }
    public  checkLogin(String p_usrid) {
        lId = checkLogin_SecurityPattern_id;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (checkLogin_SecurityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecurityPattern.checkLogin");
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
          String s="checkLogin(";      
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/checkLogin.java
*********************************************************************/


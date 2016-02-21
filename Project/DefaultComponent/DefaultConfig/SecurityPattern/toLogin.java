/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: toLogin
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/toLogin.java
*********************************************************************/

package SecurityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecurityPattern/toLogin.java                                                                  
//----------------------------------------------------------------------------

//## package SecurityPattern 


//## event toLogin(String) 
public class toLogin extends RiJEvent implements AnimatedEvent {
    
    public static final int toLogin_SecurityPattern_id = 17422;		//## ignore 
    
    public String usrid;
    
    // Constructors
    
    public  toLogin() {
        lId = toLogin_SecurityPattern_id;
    }
    public  toLogin(String p_usrid) {
        lId = toLogin_SecurityPattern_id;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (toLogin_SecurityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecurityPattern.toLogin");
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
          String s="toLogin(";      
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/toLogin.java
*********************************************************************/


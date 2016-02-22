/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkLogin
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/checkLogin.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/checkLogin.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event checkLogin(String) 
public class checkLogin extends RiJEvent implements AnimatedEvent {
    
    public static final int checkLogin_SecureSCADA_id = 8022;		//## ignore 
    
    public String usrid;
    
    // Constructors
    
    public  checkLogin() {
        lId = checkLogin_SecureSCADA_id;
    }
    public  checkLogin(String p_usrid) {
        lId = checkLogin_SecureSCADA_id;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (checkLogin_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.checkLogin");
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
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/checkLogin.java
*********************************************************************/


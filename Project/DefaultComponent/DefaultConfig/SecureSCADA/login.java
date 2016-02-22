/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: login
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/login.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/login.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event login(String) 
public class login extends RiJEvent implements AnimatedEvent {
    
    public static final int login_SecureSCADA_id = 8019;		//## ignore 
    
    public String usrid;
    
    // Constructors
    
    public  login() {
        lId = login_SecureSCADA_id;
    }
    public  login(String p_usrid) {
        lId = login_SecureSCADA_id;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (login_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.login");
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
          String s="login(";      
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/login.java
*********************************************************************/


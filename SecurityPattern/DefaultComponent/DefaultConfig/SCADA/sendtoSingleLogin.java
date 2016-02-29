/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendtoSingleLogin
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/sendtoSingleLogin.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SCADA/sendtoSingleLogin.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## event sendtoSingleLogin(String) 
public class sendtoSingleLogin extends RiJEvent implements AnimatedEvent {
    
    public static final int sendtoSingleLogin_SCADA_id = 8028;		//## ignore 
    
    public String usrid;
    
    // Constructors
    
    public  sendtoSingleLogin() {
        lId = sendtoSingleLogin_SCADA_id;
    }
    public  sendtoSingleLogin(String p_usrid) {
        lId = sendtoSingleLogin_SCADA_id;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (sendtoSingleLogin_SCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SCADA.sendtoSingleLogin");
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
          String s="sendtoSingleLogin(";      
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/sendtoSingleLogin.java
*********************************************************************/


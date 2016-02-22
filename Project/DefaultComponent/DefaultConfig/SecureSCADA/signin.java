/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: signin
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/signin.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/signin.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event signin(String) 
public class signin extends RiJEvent implements AnimatedEvent {
    
    public static final int signin_SecureSCADA_id = 8018;		//## ignore 
    
    public String usrid;
    
    // Constructors
    
    public  signin() {
        lId = signin_SecureSCADA_id;
    }
    public  signin(String p_usrid) {
        lId = signin_SecureSCADA_id;
        usrid = p_usrid;
    }
    
    public boolean isTypeOf(long id) {
        return (signin_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.signin");
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
          String s="signin(";      
          s += "usrid=" + AnimInstance.animToString(usrid) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/signin.java
*********************************************************************/


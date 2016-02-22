/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: notOk
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/notOk.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/notOk.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event notOk() 
public class notOk extends RiJEvent implements AnimatedEvent {
    
    public static final int notOk_SecureSCADA_id = 8025;		//## ignore 
    
    
    // Constructors
    
    public  notOk() {
        lId = notOk_SecureSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (notOk_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.notOk");
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
    }
    public String toString() {
          String s="notOk(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/notOk.java
*********************************************************************/


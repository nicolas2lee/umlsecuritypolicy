/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: notAllow
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/notAllow.java
*********************************************************************/

package SecurityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecurityPattern/notAllow.java                                                                  
//----------------------------------------------------------------------------

//## package SecurityPattern 


//## event notAllow() 
public class notAllow extends RiJEvent implements AnimatedEvent {
    
    public static final int notAllow_SecurityPattern_id = 17417;		//## ignore 
    
    
    // Constructors
    
    public  notAllow() {
        lId = notAllow_SecurityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (notAllow_SecurityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecurityPattern.notAllow");
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
          String s="notAllow(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecurityPattern/notAllow.java
*********************************************************************/


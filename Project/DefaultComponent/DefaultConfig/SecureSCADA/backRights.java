/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: backRights
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/backRights.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/backRights.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event backRights(int) 
public class backRights extends RiJEvent implements AnimatedEvent {
    
    public static final int backRights_SecureSCADA_id = 8034;		//## ignore 
    
    public int right;
    
    // Constructors
    
    public  backRights() {
        lId = backRights_SecureSCADA_id;
    }
    public  backRights(int p_right) {
        lId = backRights_SecureSCADA_id;
        right = p_right;
    }
    
    public boolean isTypeOf(long id) {
        return (backRights_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.backRights");
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
          msg.add("right", right);
    }
    public String toString() {
          String s="backRights(";      
          s += "right=" + AnimInstance.animToString(right) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/backRights.java
*********************************************************************/


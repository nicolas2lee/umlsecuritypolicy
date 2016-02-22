/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: queryData
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/queryData.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// SecureSCADA/queryData.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## event queryData(int) 
public class queryData extends RiJEvent implements AnimatedEvent {
    
    public static final int queryData_SecureSCADA_id = 8016;		//## ignore 
    
    public int task;
    
    // Constructors
    
    public  queryData() {
        lId = queryData_SecureSCADA_id;
    }
    public  queryData(int p_task) {
        lId = queryData_SecureSCADA_id;
        task = p_task;
    }
    
    public boolean isTypeOf(long id) {
        return (queryData_SecureSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("SecureSCADA.queryData");
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
          msg.add("task", task);
    }
    public String toString() {
          String s="queryData(";      
          s += "task=" + AnimInstance.animToString(task) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/queryData.java
*********************************************************************/


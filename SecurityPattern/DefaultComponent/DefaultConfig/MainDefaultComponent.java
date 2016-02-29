/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DefaultConfig
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import SecureSCADA.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainDefaultComponent.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainDefaultComponent {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("SecureSCADA.access");
            Class.forName("SecureSCADA.allow");
            Class.forName("SecureSCADA.approved");
            Class.forName("SecureSCADA.approvedTask");
            Class.forName("SecureSCADA.backRights");
            Class.forName("SecureSCADA.checkingRights");
            Class.forName("SecureSCADA.checkLogin");
            Class.forName("SecureSCADA.checkPolicy");
            Class.forName("SecureSCADA.checkRight");
            Class.forName("SecureSCADA.connecttoNet");
            Class.forName("SecureSCADA.doneS");
            Class.forName("SecureSCADA.doneService");
            Class.forName("SecureSCADA.login");
            Class.forName("SecureSCADA.notAllow");
            Class.forName("SecureSCADA.notOk");
            Class.forName("SecureSCADA.ok");
            Class.forName("SecureSCADA.queryData");
            Class.forName("SecureSCADA.refusedTask");
            Class.forName("SecureSCADA.rejected");
            Class.forName("SecureSCADA.rejectedRights");
            Class.forName("SecureSCADA.requestService");
            Class.forName("SecureSCADA.requestTask");
            Class.forName("SecureSCADA.sendTask");
            Class.forName("SecureSCADA.sendTaskToDataserver");
            Class.forName("SecureSCADA.sendTaskToField");
            Class.forName("SecureSCADA.sendToField");
            Class.forName("SecureSCADA.sendtoSingleLogin");
            Class.forName("SecureSCADA.signin");
            Class.forName("SecureSCADA.toLogin");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    private SecureSCADA_pkgClass initializer_SecureSCADA = new SecureSCADA_pkgClass(RiJMainThread.instance());
    
    //## configuration DefaultComponent::DefaultConfig 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainDefaultComponent initializer_DefaultComponent = new MainDefaultComponent();
        //#[ configuration DefaultComponent::DefaultConfig 
        //#]
        RiJOXF.Start();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/


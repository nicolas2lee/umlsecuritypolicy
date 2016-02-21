/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DefaultConfig
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import SCADA.*;
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
        
            Class.forName("SCADA.access");
            Class.forName("SCADA.allow");
            Class.forName("SCADA.approved");
            Class.forName("SCADA.checkingRights");
            Class.forName("SCADA.checkLogin");
            Class.forName("SCADA.checkPolicy");
            Class.forName("SCADA.checkRight");
            Class.forName("SCADA.login");
            Class.forName("SCADA.notAllow");
            Class.forName("SCADA.notOk");
            Class.forName("SCADA.ok");
            Class.forName("SCADA.queryData");
            Class.forName("SCADA.rejected");
            Class.forName("SCADA.sendTask");
            Class.forName("SCADA.sendToField");
            Class.forName("SCADA.sendtoSingleLogin");
            Class.forName("SCADA.signin");
            Class.forName("SCADA.toLogin");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    private SCADA_pkgClass initializer_SCADA = new SCADA_pkgClass(RiJMainThread.instance());
    
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


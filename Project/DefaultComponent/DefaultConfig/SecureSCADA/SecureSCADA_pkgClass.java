/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SecureSCADA
//!	Generated Date	: Mon, 22, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/SecureSCADA_pkgClass.java
*********************************************************************/

package SecureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// SecureSCADA/SecureSCADA_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package SecureSCADA 


//## ignore 
public class SecureSCADA_pkgClass {
    
    public static CenterController itsCenterController;		//## classInstance itsCenterController 
    
    public static FieldUnit itsFieldUnit;		//## classInstance itsFieldUnit 
    
    public static Network itsNetwork;		//## classInstance itsNetwork 
    
    
    // Constructors
    
    //## auto_generated 
    public  SecureSCADA_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(itsCenterController != null)
            {
                AnimServices.setInstanceName(itsCenterController, "itsCenterController");
            }
        if(itsNetwork != null)
            {
                AnimServices.setInstanceName(itsNetwork, "itsNetwork");
            }
        if(itsFieldUnit != null)
            {
                AnimServices.setInstanceName(itsFieldUnit, "itsFieldUnit");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCenterController = new CenterController(p_thread);
        itsFieldUnit = new FieldUnit(p_thread);
        itsNetwork = new Network(p_thread);
        {
            
            itsNetwork.getP_net_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsCenterController.getP_cen_net().setItsDefaultRequiredInterface(itsNetwork.getP_net_cen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsNetwork.getP_net_field().setItsDefaultRequiredInterface(itsFieldUnit.getP_field_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldUnit.getP_field_net().setItsDefaultRequiredInterface(itsNetwork.getP_net_field().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCenterController.startBehavior();
        done &= itsFieldUnit.startBehavior();
        done &= itsNetwork.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SecureSCADA/SecureSCADA_pkgClass.java
*********************************************************************/


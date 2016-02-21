/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SCADA
//!	Generated Date	: Sun, 21, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/SCADA/SCADA_pkgClass.java
*********************************************************************/

package SCADA;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// SCADA/SCADA_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package SCADA 


//## ignore 
public class SCADA_pkgClass {
    
    public static CenterController itsCenterController;		//## classInstance itsCenterController 
    
    public static FieldUnit itsFieldUnit;		//## classInstance itsFieldUnit 
    
    public static Network itsNetwork;		//## classInstance itsNetwork 
    
    
    // Constructors
    
    //## auto_generated 
    public  SCADA_pkgClass(RiJThread p_thread) {
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
        itsFieldUnit = new FieldUnit();
        itsNetwork = new Network();
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
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/SCADA/SCADA_pkgClass.java
*********************************************************************/


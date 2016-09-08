
package com.ctl.it.qa.omnivue.tools.pages.common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;



public class OVCreateService_MEFEVC extends OmniVuePage {

	
	
	UserSteps enduser;
	
	
	@FindBy(id = "NAME")
	public WebElementFacade tbx_name;
	
	@FindBy(id = "ALIAS1")
	public WebElementFacade tbx_alias1;

	@FindBy(id = "ALIAS2")
	public WebElementFacade tbx_alias2;
	
	@FindBy(id = "SERVICE2PROVISIONSTATUS")
	public WebElementFacade tbx_provisionstatus;
	
	@FindBy(id = "subscriberName")
	public WebElementFacade tbx_subscribername;
	
	@FindBy(xpath = "//*[@ng-click='openSubscriberLookUp(field.name)']")
	public WebElementFacade img_subscriberlookupicon;
	
	@FindBy(id = "DESCRIPTION")
	public WebElementFacade tbx_note;	
	
	
	
	
	
	@FindBy(id = "EVCOVCNC")
	public WebElementFacade ddl_evcnccode;	
	
	@FindBy(id = "CEVLANIDPRESERVATION")
	public WebElementFacade ddl_cevlanidpreservation;
	
	@FindBy(id ="CEVLANCOSPRESERVATION")
	public WebElementFacade ddl_cevlancospreservation;
	
	@FindBy(id = "UNICASTFRAMEDELIVERY")
	public WebElementFacade ddl_unicastframedelivery;
	
	@FindBy(id = "MULTICASTFRAMEDELIVERY")
	public WebElementFacade ddl_multicastframedelivery;	
	
	@FindBy(id = "BROADCASTFRAMEDELIVERY")
	public WebElementFacade ddl_broadcastframedelivery;	
	
	@FindBy(id ="STI")
	public WebElementFacade ddl_servicetypeindicator;	
	
	@FindBy(id = "GROUPNUMBER")
	public WebElementFacade tbx_groupnumber;
	
	
	@FindBy(id ="USAGE")
	public WebElementFacade ddl_usagetype;	
	
	@FindBy(id ="COS_ID")
	public WebElementFacade ddl_cosid;		
	
	@FindBy(id = "ASN")
	public WebElementFacade tbx_asn;
	
	@FindBy(id = "ISMEETPOINTEVC")
	public WebElementFacade ddl_ismeetpointevc;
	
	@FindBy(id = "CONTROLLINGCOMPANY")
	public WebElementFacade tbx_controllingcompany;
	
	
	@FindBy(id = "REQUESTING_AFFILIATE")
	public WebElementFacade ddl_requestingaffiliate;
	
	@FindBy(id = "SERVICE2FUNCTIONALSTATUS")
	public WebElementFacade ddl_functionalstatus;	
	
	@FindBy(id = "MCO")
	public WebElementFacade ddl_mco;		
	
	@FindBy(xpath ="//*[@ng-click='createActivateClick(createActivate)']")
	public WebElementFacade cbx_manualtask;
	
	
	
	
	
	// Subscriber section
		
	@FindBy(xpath = "//*[@ng-model='invSubscriber.subscriberName']")
	public WebElementFacade tbx_subcriber_name_window ;
	
	@FindBy(xpath = "//*[@value='LookUp']")
	public WebElementFacade btn_lookup ;
	
	@FindBy(xpath = ".//*[@id='subscriber_lookup_0']/tbody/tr/td[1]/a/span")
	public WebElementFacade lnk_subcribername ;
	
	
	
	// Create service button
	
	@FindBy(xpath ="//*[@ng-click ='createService();']")
	public WebElementFacade btn_create ;
	
	
	// Related tab Task
	
	@FindBy(xpath = "//*[@id='right-content']/div/div[1]/ul/li[12]/a")
	public WebElementFacade tab_Tasksrelatedtab;
	
	
	@FindBy(xpath = ".//*[@id='row0taskGrid_1']/div[5]/div")
	public WebElementFacade txt_taskid;
	
	@FindBy(xpath  = ".//*[@id='row0taskGrid_1']/div[7]/div")
	//@FindBy(xpath  = "//div[contains(text(),'11/EVC1/012345//AUTO')]")
	public WebElementFacade txt_circuitid;
	
	
	//	Create form 
	
	@FindBy(xpath = "//*[@id='mainTab']/div/ul/li[1]/a/tab-heading")
	public WebElementFacade tab_createserviceform;

	
	// Create form to pick success message
	
	@FindBy(xpath = "//*[@ng-show='showAlert' and @class='ng-binding alert alert-success']")
	public WebElementFacade txt_message;
	
	
	
	@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_service360view;
	
	

	
	
	// Data for HOST Service
	
	@FindBy(id = "FID_NAME")
	public WebElementFacade tbx_FID_NAME;
	
	@FindBy(id = "HOST_ACCEPTANCE_STATUS")
	public WebElementFacade ddl_HOST_ACCEPTANCE_STATUS;
	
	@FindBy(id = "CUSTOMER_ACCEPTANCE_STATUS")
	public WebElementFacade ddl_CUSTOMER_ACCEPTANCE_STATUS;
	
	
	@FindBy(id = "ACCEPTS_PREMIUM_SERVICES")
	public WebElementFacade ddl_ACCEPTS_PREMIUM_SERVICES;
	
	@FindBy(id = "ACCEPTS_CVOIP")
	public WebElementFacade ddl_ACCEPTS_CVOIP;
	
	
	@FindBy(id = "HOSTIPVERSION")
	public WebElementFacade cbx_HOSTIPVERSION;
	
	@FindBy(id = "NWPROTOCOLTYPE")
	public WebElementFacade cbx_NWPROTOCOLTYPE;
	
	@FindBy(id = "SERVICECAPABILITY")
	public WebElementFacade cbx_SERVICECAPABILITY;
	
	
	//End of Data for HOST Service
	
	
	
	
	
	
	// Related to MEF OVC Service Create Page
	
	@FindBy(id = "COLORFORWARDING")
	public WebElementFacade ddl_colorforwarding ;
	
	
	@FindBy(id = "SVLANIDPRESERVATION")
	public WebElementFacade ddl_svlanidpreservation ;
	
	
	@FindBy(id = "SVLANCOSPRESERVATION")
	public WebElementFacade ddl_svlancospreservation ;
	
	
	@FindBy( id = "EVCOVCREFERENCE")
	public WebElementFacade tbx_EvcOvcReference ;
	
		
	@FindBy(id = "VPNID")
	public WebElementFacade ddl_VPNid ;
	
	
		
	// End of MEF OVC Create Page
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@ng-show='errorMessageForTasks']")
	public WebElementFacade txt_norelatedtaskmessage ;
	
	
	
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.ctl.it.qa.omnivue.tools.pages.common;


import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;



public class OVLocationSearchPage extends OmniVuePage {


	UserSteps enduser;

/*
 * <field name="tbx_InvLocSrch_LowStreet" value="wait-2:700" type="mandatory"></field>
               		<field name="tbx_InvLocSrch_HighStreet" value="wait-1:800" type="mandatory"></field>
               		<field name="tbx_InvLocSrch_StreetName" value="wait-1:PARAMOUNT" type="mandatory"></field>
					<field name="tbx_InvLocSrch_CityName" value="wait-1:OAKLAND" type="mandatory"></field>
					<field name="ddl_InvLocSrch_StateName" value="wait-1:OR-Oregon" type="mandatory"></field>
 * 
 */
	
	
	@FindBy(xpath = "//input[@ng-model='invLocSrch.rlowStreet']")
	public WebElementFacade tbx_InvLocSrch_LowStreet;
	
	@FindBy(xpath = "//input[@ng-model='invLocSrch.rhighStreet']")
	public WebElementFacade tbx_InvLocSrch_HighStreet;

	@FindBy(xpath = "//input[@ng-model='invLocSrch.rstreetName']")
	public WebElementFacade tbx_InvLocSrch_StreetName;
	
	@FindBy(xpath = "//input[@ng-model='invLocSrch.rcity']")
	public WebElementFacade tbx_InvLocSrch_CityName;
	
	@FindBy(xpath = "//select[@ng-model='invLocSrch.rstate']")
	public WebElementFacade ddl_InvLocSrch_StateName;
	
	@FindBy(xpath = "//input[@ng-click='rangeAdvncSearch()']")
	public WebElementFacade btn_Search;
	
	
	
	//
	@FindBy(xpath = ".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading")
	public WebElementFacade txt_addressTabTtitle;
	
	
	@FindBy(xpath = "//input[@value='Add Individual Addresses']")
	public WebElementFacade btn_AddIndividualLocation;
	
	
	
	
	
	
	
	

	
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}










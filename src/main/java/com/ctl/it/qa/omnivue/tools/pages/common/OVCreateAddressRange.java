package com.ctl.it.qa.omnivue.tools.pages.common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateAddressRange extends OmniVuePage {



		
		UserSteps enduser;
	
		/*
		// Select the Create Type
		
		@FindBy(xpath="//label[text()='Create Type']/following-sibling::select")
		public WebElementFacade ddl_createType;
		
		
		// Select the Inventory Type
		
		@FindBy(xpath="//*[@ng-show='showInventoryType']/select")
		public WebElementFacade ddl_invntryTypeCreate ;
		
		
		// Select the Location Type
		
		@FindBy(xpath=".//*[@ng-show='showLocationType']/select")
		public WebElementFacade ddl_locationType;
		
		
		// Click on Launch Address Range Create Form
		@FindBy(xpath="html/body/form/div/div[1]/div/div[2]/div[2]/ng-include/div/div/div[3]/div/div[3]/button[1]")
		public WebElementFacade btn_LaunchCreateForm;
		
		*/
		
		@FindBy(id="lowstreet")
		public WebElementFacade tbx_low_street;
		
		
		@FindBy(id="highstreet")
		public WebElementFacade tbx_high_street;
		
		
		@FindBy(id="street")
		public WebElementFacade tbx_street_name;
		
		@FindBy(id="streetType")
		public WebElementFacade ddl_streettype;
		
		@FindBy(id="indicator")
		public WebElementFacade ddl_indicator;
		
		
		@FindBy(xpath=".//*[@id='state' and @ng-show='field.display']")
		public WebElementFacade ddl_State;
		
		@FindBy(id="city")
		public WebElementFacade ddl_City;
		
		@FindBy(id="zip")
		public WebElementFacade tbx_zip;

		
		
		@FindBy(id="NewConstructionIndicator")
		public WebElementFacade ddl_NewConstructionIndicator;
		
		@FindBy(id="LegacyCompanyArea")
		public WebElementFacade ddl_LegacyCompanyArea;
		
		
		@FindBy(id="WireCenterRemarks")
		public WebElementFacade tbx_WireCenterRemarks;
		
		@FindBy(id="WireCenterCLLI")
		public WebElementFacade tbx_WireCenterCLLI;
		
		@FindBy(id="TaxCode")
		public WebElementFacade tbx_TaxCodeTAR;

		@FindBy(id="RateZone")
		public WebElementFacade tbx_RateZone;
		
		@FindBy(id="WireCenterID")
		public WebElementFacade tbx_WireCenterID;
		
		
		@FindBy(id="TTA")
		public WebElementFacade tbx_TTA;
		
		
		@FindBy(id="CALA")
		public WebElementFacade tbx_CALA;
		
		
		/*
		
		// Click on Create location button
		@FindBy(id=".//*[@id='0']/ng-include/div/div[3]/div/span/input[1]")
		public WebElementFacade btn_CreateButtonLocation;
		
		*/
		
		
		@Override
		public WebElementFacade getUniqueElementInPage() {
			// TODO Auto-generated method stub
			return null;
		}
		
	
		
		
		
		
		
		
	 
}

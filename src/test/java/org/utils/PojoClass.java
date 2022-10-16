package org.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement txtsign;
	@FindBy(xpath="(//a[text()='Sign in'])[1]")
	private WebElement txtsign1;
	@FindBy(id="loginFormEmailInput")
	private WebElement txtuser;
	@FindBy(id="loginFormPasswordInput")
	private WebElement txtpass;
	@FindBy(id="loginFormSubmitButton")
	private WebElement txtsubmit;
	@FindBy(id="loginFormForgoPwdLink")
	private WebElement txtfor;
	@FindBy(id="reset-pwd-email")
	private WebElement txtemail;
	@FindBy(id="reset-pwd-email-submit")
	private WebElement txtser;
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement txtcligoa;
	@FindBy(xpath="//input[@placeholder='Going to']")
	private WebElement txtgoapass;
	@FindBy(xpath="//button[@aria-label='Goa India']")
	private WebElement txtgoaclick;
	@FindBy(id="date_form_field-btn")
	private WebElement txtdateclick;
	@FindBy(xpath="(//button[@type='button'])[34]")
	private WebElement txtdatesear;
	@FindBy(xpath="//button[@data-stid='apply-date-picker']")
	private WebElement txtdatedone;
	@FindBy(xpath="(//button[@aria-expanded='false'])[3]")
	private WebElement txttraclick;
	@FindBy(xpath="(//span[@class='uitk-step-input-button'])[2]")
	private WebElement txttraadu;
	@FindBy(id="traveler_selector_done_button")
	private WebElement txttradone;
	@FindBy(id="submit_button")
	private WebElement txttrasub;
	public WebElement getTxtsign() {
		return txtsign;
	}
	public WebElement getTxtsign1() {
		return txtsign1;
	}
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getTxtsubmit() {
		return txtsubmit;
	}
	public WebElement getTxtfor() {
		return txtfor;
	}
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getTxtser() {
		return txtser;
	}
	public WebElement getTxtcligoa() {
		return txtcligoa;
	}
	public WebElement getTxtgoapass() {
		return txtgoapass;
	}
	public WebElement getTxtgoaclick() {
		return txtgoaclick;
	}
	public WebElement getTxtdateclick() {
		return txtdateclick;
	}
	public WebElement getTxtdatesear() {
		return txtdatesear;
	}
	public WebElement getTxtdatedone() {
		return txtdatedone;
	}
	public WebElement getTxttraclick() {
		return txttraclick;
	}
	public WebElement getTxttraadu() {
		return txttraadu;
	}
	public WebElement getTxttradone() {
		return txttradone;
	}
	public WebElement getTxttrasub() {
		return txttrasub;
	}
	

}

Feature: Validate the  functionality of hotels.com
Background:
Given User should launch the chrome and load the url and maximize the window
When User should click the Sign in link

 @jp
Scenario Outline: Validate the login functionality with invalid username and invalid password
    And User should input invalid username "<jai>" and invalid password "<surya>" in the textbox
    And User should click the sign in button
    Then User should navigate to incorrect credential page

    Examples: 
      | jai             | surya       |
      | jai@gmail.com   | surya@12345 |
      


 
 
  
@jai
Scenario: Validate the login functionality with valid username and valid password

And User should input valid username and valid password in the textbox
And User should click the sign in button
And User should print the current title of the page
Then user should navigate to home page

@surya
Scenario: Validate the login functionality with forgot password

And User should click the forgot password link
And User should enter valid email address
#1D LIST
|surya@123|priyamoorthy1410@gmail.com|jai@gmail.com|
And User should click send request link
Then User should navigate to Reset password page

@priya
Scenario: validate the location booking functionality

And User should input valid username and valid password in the textbox
And User should click the sign in button
And user should navigate to home page
And User should click the location  text box
And User should enter the  valid location in the text box
And User should  select appropriate date
And User should click done button
And User should select no of travellers and no of rooms
And User should click done button
And User should click search button
Then User should navigate hotels availability page


 
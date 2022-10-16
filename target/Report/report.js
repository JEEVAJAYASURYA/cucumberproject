$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/hotels.feature");
formatter.feature({
  "name": "Validate the  functionality of hotels.com",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load the url and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_launch_the_chrome_and_load_the_url_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Sign in link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_Sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login functionality with forgot password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@surya"
    }
  ]
});
formatter.step({
  "name": "User should click the forgot password link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_forgot_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter valid email address",
  "rows": [
    {
      "cells": [
        "surya@123",
        "priyamoorthy1410@gmail.com",
        "jai@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userShouldEnterValidEmailAddress(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click send request link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_send_request_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to Reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_navigate_to_Reset_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
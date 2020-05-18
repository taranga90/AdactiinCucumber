$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/loginTest.feature");
formatter.feature({
  "name": "adactin Login page Test",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user intialize the brower",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_intialize_the_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Login verification with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_verify_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the brower",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_close_the_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user intialize the brower",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_intialize_the_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Login verification with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "user enter the valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_enter_the_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_verify_the_home_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Incorrect username or password\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat adactin.stepdefination.StepDefinationLoginPage.user_verify_the_home_page(StepDefinationLoginPage.java:47)\r\n\tat ✽.user verify the home page(file:src/test/resources/features/loginTest.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user close the brower",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinationLoginPage.user_close_the_brower()"
});
formatter.result({
  "status": "skipped"
});
});
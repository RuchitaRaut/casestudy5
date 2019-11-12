$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Login Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid test data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open application",
  "keyword": "Given "
});
formatter.match({
  "location": "loginvalidation.user_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters user as \"mercury\" in username field",
  "keyword": "When "
});
formatter.match({
  "location": "loginvalidation.user_enters_user_as_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"mercury\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "loginvalidation.user_enters_password_as_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "And "
});
formatter.match({
  "location": "loginvalidation.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validates login success",
  "keyword": "Then "
});
formatter.match({
  "location": "loginvalidation.validates_login_success()"
});
formatter.result({
  "status": "passed"
});
});
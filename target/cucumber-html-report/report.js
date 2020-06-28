$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("iceland.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "User want to Registar on website.",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9521254700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Registar",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User fill up all the details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should create account",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 207015500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_click_on_Registar()"
});
formatter.result({
  "duration": 1615904900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_fill_up_all_the_details()"
});
formatter.result({
  "duration": 521926700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_should_create_account()"
});
formatter.result({
  "duration": 64000,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/Iceland/src/test/resources/product.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "User can put product in basket",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8828391500,
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
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User search for the product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "select the required product",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should put selected products in basket",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 131572000,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDef.user_search_for_the_product()"
});
formatter.result({
  "duration": 2204665101,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDef.select_the_required_product()"
});
formatter.result({
  "duration": 894171200,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDef.user_should_put_selected_products_in_basket()"
});
formatter.result({
  "duration": 1876999600,
  "status": "passed"
});
});
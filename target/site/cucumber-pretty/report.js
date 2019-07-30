$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/documentationLinkValidation.feature");
formatter.feature({
  "name": "Documentation Links Validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "Check whether Documentation links loads angular js on redirection",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "I am in here Documentation page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintions.i_am_in_here_Documentation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the documentation Links , it should have loaded properly",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefintions.i_click_on_the_documentation_Links_it_should_have_loaded_properly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the redirected links should be valid",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintions.the_redirected_links_should_be_valid()"
});
formatter.result({
  "status": "passed"
});
});
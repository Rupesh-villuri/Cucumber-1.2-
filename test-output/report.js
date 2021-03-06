$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("B:/Eclipse/Workspace/Frameworks/Cucumber_BDD_Framework/src/main/java/Features/TagsInCucumber.feature");
formatter.feature({
  "line": 1,
  "name": "Understand the concept of Tags in Cucumber",
  "description": "",
  "id": "understand-the-concept-of-tags-in-cucumber",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 62,
  "name": "verify cases page",
  "description": "",
  "id": "understand-the-concept-of-tags-in-cucumber;verify-cases-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 61,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 63,
  "name": ":cases page link is available on home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": ": navigate to cases page",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsDemo.cases_page_link_is_available_on_home_screen()"
});
formatter.result({
  "duration": 299554300,
  "status": "passed"
});
formatter.match({
  "location": "TagsDemo.navigate_to_cases_page()"
});
formatter.result({
  "duration": 42400,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "Verify Forms page",
  "description": "",
  "id": "understand-the-concept-of-tags-in-cucumber;verify-forms-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 76,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 78,
  "name": ": Forms link is avialble on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 79,
  "name": ": Click on Forms page",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsDemo.forms_link_is_avialble_on_Home_page()"
});
formatter.result({
  "duration": 55700,
  "status": "passed"
});
formatter.match({
  "location": "TagsDemo.click_on_Forms_page()"
});
formatter.result({
  "duration": 31400,
  "status": "passed"
});
formatter.scenario({
  "line": 87,
  "name": "verify user can create multiple forms",
  "description": "",
  "id": "understand-the-concept-of-tags-in-cucumber;verify-user-can-create-multiple-forms",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 86,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 88,
  "name": ":user is able to create a single form",
  "keyword": "Given "
});
formatter.step({
  "line": 89,
  "name": ": Create multiple forms",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsDemo.user_is_able_to_create_a_single_form()"
});
formatter.result({
  "duration": 47900,
  "status": "passed"
});
formatter.match({
  "location": "TagsDemo.create_multiple_forms()"
});
formatter.result({
  "duration": 32900,
  "status": "passed"
});
});
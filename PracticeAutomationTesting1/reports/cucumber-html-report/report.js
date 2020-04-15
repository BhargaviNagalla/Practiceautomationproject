$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Practice_Automation_Testing website",
  "description": "",
  "id": "practice-automation-testing-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Practice.AutomationTesting.in"
    }
  ]
});
formatter.scenario({
  "line": 32,
  "name": "Demosite - register",
  "description": "",
  "id": "practice-automation-testing-website;demosite---register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@TS_04_Demosite_Valid_Register"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "open the url in the browser06",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "click demosite- register menu",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "fill all the valid details",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "click submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "06",
      "offset": 27
    }
  ],
  "location": "DemoValidRegstepdefination.open_the_url_in_the_browser(int)"
});
formatter.result({
  "duration": 22424089100,
  "status": "passed"
});
formatter.match({
  "location": "DemoValidRegstepdefination.click_demosite_register_menu()"
});
formatter.result({
  "duration": 2105073900,
  "status": "passed"
});
formatter.match({
  "location": "DemoValidRegstepdefination.fill_all_the_valid_details()"
});
formatter.result({
  "duration": 17813720200,
  "status": "passed"
});
formatter.match({
  "location": "DemoValidRegstepdefination.click_submit_button()"
});
formatter.result({
  "duration": 154266100,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/Featurefiles/HomePage.feature");
formatter.feature({
  "name": "Verify HomePage",
  "description": "\tAs auser\n \tI should be able to navigate through homapage\n\tSo that I can see what\u0027s on offer",
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
formatter.step({
  "name": "I am on amazon homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage.i_am_on_amazon_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Selenium Explicit Wait Statements",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@skip"
    }
  ]
});
formatter.step({
  "name": "I wait for search field to be present",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});
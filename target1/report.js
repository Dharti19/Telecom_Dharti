$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddTarrifPlan.feature");
formatter.feature({
  "name": "To test customer can add tarrif plan",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To test add tarrif plan",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be on add tarrif plan page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user fil in the valid plan detail detail\"\u003cMonthRent\u003e\",\"\u003cFreeLocMinuts\u003e\",\"\u003cFreeIntMinuts\u003e\",\"\u003cFreeSMS\u003e\",\"\u003clocalCharges\u003e\",\"\u003cIntCharges\u003e\",\"\u003cSMSCharges\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user click on submit button",
  "keyword": "When "
});
formatter.step({
  "name": "The user shuld see the success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MonthRent",
        "FreeLocMinuts",
        "FreeIntMinuts",
        "FreeSMS",
        "localCharges",
        "IntCharges",
        "SMSCharges"
      ]
    },
    {
      "cells": [
        "100",
        "200",
        "300",
        "400",
        "500",
        "600",
        "700"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test add tarrif plan",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be on add tarrif plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcust.the_user_should_be_on_add_tarrif_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fil in the valid plan detail detail\"100\",\"200\",\"300\",\"400\",\"500\",\"600\",\"700\"",
  "keyword": "When "
});
formatter.match({
  "location": "Addcust.the_user_fil_in_the_valid_plan_detail_detail(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on submit button",
  "keyword": "When "
});
formatter.match({
  "location": "Addcust.the_user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user shuld see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcust.the_user_shuld_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
});
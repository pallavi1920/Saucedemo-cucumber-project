$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("removeitemstest.feature");
formatter.feature({
  "line": 2,
  "name": "To remove items from cart",
  "description": "",
  "id": "to-remove-items-from-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@removeitems"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To add and remove the items from cart",
  "description": "",
  "id": "to-remove-items-from-cart;to-add-and-remove-the-items-from-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"\u003cusernameNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user selects multiple items to add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user opens cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user removes items from the cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "to-remove-items-from-cart;to-add-and-remove-the-items-from-cart;",
  "rows": [
    {
      "cells": [
        "usernameNumber"
      ],
      "line": 15,
      "id": "to-remove-items-from-cart;to-add-and-remove-the-items-from-cart;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 16,
      "id": "to-remove-items-from-cart;to-add-and-remove-the-items-from-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "To add and remove the items from cart",
  "description": "",
  "id": "to-remove-items-from-cart;to-add-and-remove-the-items-from-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@removeitems"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user selects multiple items to add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user opens cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user removes items from the cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPage.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 15637687100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "LoginTestPage.i_enter_valid(String)"
});
formatter.result({
  "duration": 238733700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 7166831200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.user_selects_multiple_items_to_add_to_cart()"
});
formatter.result({
  "duration": 409478200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.user_opens_cart()"
});
formatter.result({
  "duration": 1793571300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.user_removes_items_from_the_cart()"
});
formatter.result({
  "duration": 197197800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.application_should_be_closed()"
});
formatter.result({
  "duration": 6619145500,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Placing an order for costliest and cheapest items",
  "description": "As a valid user, \r\nI want to place an order for costliest and cheapest item",
  "id": "placing-an-order-for-costliest-and-cheapest-items",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Ordering a costliest and cheapest item from product catalogue",
  "description": "",
  "id": "placing-an-order-for-costliest-and-cheapest-items;ordering-a-costliest-and-cheapest-item-from-product-catalogue",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I logged into the application \"\u003curl\u003e\" using the valid user credentials \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I have sorted the producs by price option \"\u003csortType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I add to cart the costliest and cheapest items from the product list",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the checkout details \"\u003cfirstname\u003e\", \"\u003clastname\u003e\" and \"\u003cpostalcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to see the success \"\u003cmessage\u003e\" on the confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "placing-an-order-for-costliest-and-cheapest-items;ordering-a-costliest-and-cheapest-item-from-product-catalogue;",
  "rows": [
    {
      "cells": [
        "url",
        "username",
        "password",
        "sortType",
        "firstname",
        "lastname",
        "postalcode",
        "message"
      ],
      "line": 12,
      "id": "placing-an-order-for-costliest-and-cheapest-items;ordering-a-costliest-and-cheapest-item-from-product-catalogue;;1"
    },
    {
      "cells": [
        "https://www.saucedemo.com",
        "standard_user",
        "secret_sauce",
        "high to low",
        "First Name 1",
        "Last Name 1",
        "SW1A 2AA",
        "THANK YOU FOR YOUR ORDER"
      ],
      "line": 13,
      "id": "placing-an-order-for-costliest-and-cheapest-items;ordering-a-costliest-and-cheapest-item-from-product-catalogue;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2349483900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Ordering a costliest and cheapest item from product catalogue",
  "description": "",
  "id": "placing-an-order-for-costliest-and-cheapest-items;ordering-a-costliest-and-cheapest-item-from-product-catalogue;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I logged into the application \"https://www.saucedemo.com\" using the valid user credentials \"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I have sorted the producs by price option \"high to low\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I add to cart the costliest and cheapest items from the product list",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the checkout details \"First Name 1\", \"Last Name 1\" and \"SW1A 2AA\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to see the success \"THANK YOU FOR YOUR ORDER\" on the confirmation page",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com",
      "offset": 31
    },
    {
      "val": "standard_user",
      "offset": 92
    },
    {
      "val": "secret_sauce",
      "offset": 112
    }
  ],
  "location": "PurchaseSteps.loggedIntoApplication(String,String,String)"
});
formatter.result({
  "duration": 1554391600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "high to low",
      "offset": 43
    }
  ],
  "location": "PurchaseSteps.sortedProducsByPriceOption(String)"
});
formatter.result({
  "duration": 221877500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.addItemsToCart()"
});
formatter.result({
  "duration": 530097700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First Name 1",
      "offset": 30
    },
    {
      "val": "Last Name 1",
      "offset": 46
    },
    {
      "val": "SW1A 2AA",
      "offset": 64
    }
  ],
  "location": "PurchaseSteps.enterCheckoutDetails(String,String,String)"
});
formatter.result({
  "duration": 1728648400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 37
    }
  ],
  "location": "PurchaseSteps.validationOnConfirmationPage(String)"
});
formatter.result({
  "duration": 132390100,
  "status": "passed"
});
formatter.after({
  "duration": 678063300,
  "status": "passed"
});
});
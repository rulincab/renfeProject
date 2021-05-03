$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BuyTicket.feature");
formatter.feature({
  "line": 3,
  "name": "Buy Ticket",
  "description": "This feature allows searching cities with specific name\nset date and different options to buy",
  "id": "buy-ticket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@buyTicket"
    }
  ]
});
formatter.before({
  "duration": 1550036364,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "The User is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearhFlightSteps.the_User_is_on_the_home_page()"
});
formatter.result({
  "duration": 3275118379,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Get error message wieh the fields are not correcly",
  "description": "This scenario consists of doing a validation about\nthe error message when de files are wrong",
  "id": "buy-ticket;get-error-message-wieh-the-fields-are-not-correcly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@story1"
    },
    {
      "line": 10,
      "name": "@case1"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "The user types wrong words in the fields \"a\" and \"a\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "it shows the error message \"Seleccione una estación válida\" when the fields text are incorrect",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "a",
      "offset": 42
    },
    {
      "val": "a",
      "offset": 50
    }
  ],
  "location": "SearhFlightSteps.the_user_types_wrong_words_in_the_fields_and(String,String)"
});
formatter.result({
  "duration": 1435793879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Seleccione una estación válida",
      "offset": 28
    }
  ],
  "location": "SearhFlightSteps.it_shows_the_error_message_when_the_fields_text_are_incorrect(String)"
});
formatter.result({
  "duration": 56978028,
  "status": "passed"
});
});
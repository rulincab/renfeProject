@buyTicket

  Feature: Buy Ticket
    This feature allows searching cities with specific name
    set date and different options to buy

  Background:
    Given The User is on the home page
    @story1
    @case1
    Scenario: Get error message wieh the fields are not correcly
    This scenario consists of doing a validation about
      the error message when de files are wrong
      When The user types wrong words in the fields "a" and "a"
      Then  it shows the error message "Seleccione una estación válida" when the fields text are incorrect
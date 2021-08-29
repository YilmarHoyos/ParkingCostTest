Feature: CP-002 PARKING COST CALCULATOR Short parking
  As a user of PARKING COST CALCULATOR,
  I want to calculate the parking price at different times and verify that the price is correct.


  Scenario Outline: <Stage> <TimeIn>
    Given I am on the PARKING COST CALCULATOR page with the url <Url>
    When I add the time, to be calculated <TimeIn> in the box
    Then I will be able, to see the expected price <Price>

    Examples:
      | Stage                      | TimeIn | Url                            |  | Price   |
      | Validate the parking price | 12:00  | https://www.shino.de/parkcalc/ |  | $ 24.00 |

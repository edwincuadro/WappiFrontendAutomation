Feature: Make a order with coupon
  As QAA
  I want to make an order
  To use promotional coupon

  Background: Log in

    Scenario: Make an order with a valid coupon
      Given user open the page
      When user input correct credential
        | username | password |
        | edwin02  | 85697412 |
      When user get coupon order a product
      And  use the coupon to pay
      Then user can see order confirmation
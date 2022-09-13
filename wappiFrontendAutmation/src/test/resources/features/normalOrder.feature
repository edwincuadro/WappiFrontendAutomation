Feature: Make a normal order without coupon
  As QAA
  I want to make a order
  To buy something without coupon

  Background: Log in
    Given user open the site
    When user input correct credentials
      | username | password |
      | edwin02  | 85697412 |

  Scenario: Make a order without coupon
    When user click choose a product and confirm the order
    Then user can see order's confirmation Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
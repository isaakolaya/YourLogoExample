#Autor: Isaak Olaya
@HU001
Feature: your logo
  As a user, I wan to buy some items on the page  your logo

  @Test
  Scenario Outline: Shopping items
    Given Isaak wants to visit YourLogo website
    And he log in to the YourLogo website
      | email   | password   |
      | <email> | <password> |
    When he goes to a shopping section on the website to find an item and add it to the shopping cart to proceed with payment
    And he modifies the quantity of the item to buy and clicks on the Proceed to checkout button
    And he clicks the Add a new address button to then fill out the form with the new data and clicks the Save button
      | name   | lastName   | address   | city   | postalCode   | homePhone   | mobilePhone   | addressTitle   |
      | <name> | <lastName> | <address> | <city> | <postalCode> | <homePhone> | <mobilePhone> | <addressTitle> |
    And he selects the new address in the DDL and clicks the Proceed to checkout button
    And he agrees to the terms of service by clicking the checkbox and then clicking the Proceed to checkout button
    And he selects a payment method and clicks the I confirm my order button
    Then he validates the order confirmation
      | validation   |
      | <validation> |

    Examples:
      | email               | password  | name   | lastName | address        | city  | postalCode | homePhone | mobilePhone | addressTitle | validation                          |
      | isaak0119@gmail.com | hola12345 | Gloria | Hurtado  | Cra 49A #66-91 | Bello | 05105      | 3876001   | 3015747157  | Casa 4       | Your order on My Store is complete. |

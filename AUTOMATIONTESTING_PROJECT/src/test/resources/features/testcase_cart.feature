@AutomationPracticeSite
Feature: Testing the cart features for Automation  website


@tc_01_login
Scenario: Validate the login fuctionality
Given Launch the browser and enter the url
When Login page is opened
When Enter the "<username>" and "<password>"
Then Click the login button

@tc_02_verifytitle
Scenario: verify the title

 Given launch the automation appliction
Then get the title name 
And compare with expected title

@tc_03_stockandcart
Scenario: To know the stock and add to the cart

Given launch the automation page
Then open the product
Then verify whether product is in stock or not
And add product to the cart

@tc_04_deleteitem
Scenario: To remove item from cart
Given launch the automation practice page
Then add item to the cart
Then  open the cart
And delete the item from cart

@tc_05_checkout
Scenario: To checkout the cart
Given launch the automation practice website
Then open cart
Then click on proceed
Then enter delivery details and payment type
Then place order

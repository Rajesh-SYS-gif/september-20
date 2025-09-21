@headphones
Feature: validating the headphones

Background: validating the headphones
Given Launch the application flipkart "https://www.flipkart.com/"
Then validate the home page
When enter headphone in search box
When click the search button



Scenario Outline: validate the headphones

Then click the product one
#Then move to parent window
When user click on sorting "<sort>"

Examples:
|sort                 |column1|
|Popularity           |column2|
| Price -- Low to High|column3|
|Price -- High to Low |column4|
|Newest First         |column5|
#Then user selects the headings with one dim list
#Then user selects the headings with one dim map
#|value1|Electronics|
#|value2|TVs & Appliances|
#|value3|Men|
#|value4|Women|
#|value5|Baby & Kids|
#Scenario: validate the headphones
#Then click the product two
#Scenario: validate the headphones
#Then click the product three
#Scenario: validate the headphones
#Then click the product four
#Scenario: validate the headphones
#Then click the product five

#Scenario: Quit the browser
#Then Quit the browser



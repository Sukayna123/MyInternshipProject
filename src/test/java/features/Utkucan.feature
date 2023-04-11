Feature: School Location

  Scenario: Validate Add New School Location
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Add School Location button
    And Fill name short name capacity location type
    Then Click save button

  Scenario:Validate Add New School Location Without School Location Name
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Add School Location button
    And Fill except school location name
    Then Click save

  Scenario:Validate Add New School Location Without School Location Capacity
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Add School Location button
    And Fill all of them except location capacity area
    And Click save button
    Then See success message

  Scenario:Validate Delete School Location From System
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Delete School Locations button
    And Click Delete
    Then See success message for delete location

  Scenario:Validate Edit School Location for Capacity
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Edit School Locations button
    And Change capacity of school location
    Then Click save for capacity

  Scenario:Validate Edit School Location for Name
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Edit School Location button
    And Change Name of school location
    Then Click save for name

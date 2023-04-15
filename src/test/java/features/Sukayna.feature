Feature: Sukayna

  Scenario:PR_01_Add Validate add discount from parameters without description field.
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And click add sign
    And input integration code and priority only without description
    And  click save tab
    Then check red message under description, get text and attribute color.

  Scenario:PR_02_add Validate add discount from parameters with all fields filled twice with the same info .
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And input Description,integration code and priority using apache poi
    And click save tab
    And click add sign
    And input Description,integration code and priority with the same data as previous one using apache poi
    And click save tab
    Then check error message, verify is displayed and get text

  Scenario:PR_03_add Validate add discount without integration code.
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And click add sign
    And leave integration empty and fill out the rest
    And click save
    Then get text of red message under integration, check is displayed

  Scenario:PR_04_add Validate add discount from parameters with all fields fill.
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And click add sign
    And input Description,integration code and priority
    And click save tab
    Then check message verify is displayed

  Scenario: PR_01_edit Validate edit discount from parameters changing Description.
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And search discount
    And click edit sign
    And change the description
    And click save
    Then verify success message is displayed

  Scenario: PR_02_edit Validate edit discount changing priority field to only spaces .
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And click edit sign
    And change the priority to only spaces
    Then assert update

  Scenario:PR_01_delete Validate delete discount from parameters on the left-hand column
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And click delete button
    And click delete
    Then check success message after delete and verify is displayed

  Scenario:PR_02_delete Validate delete discount from parameters on the left-hand column
    Given navigate to campus
    When Login
    And click setup
    And click parameters
    And click discount
    And fill description, integration and click search button
    And click delete button
    And click cancel
    Then check success message after delete and verify is displayed

  Scenario: HR_01_add validate add under attestations human recourses from left hand column.
    Given navigate to campus
    When Login
    And click human resources
    And click setup under Human resources
    And click attestations
    And click add sign
    And input name
    And click save
    And check success message one is displayed

  Scenario: HR_02_add validate add under attestations human recourses from left hand column.
    Given navigate to campus
    When Login
    And click human resources
    And click setup under Human resources
    And click attestations
    And click add sign
    And click save
    Then check red message under name is displayed and get text

  Scenario: HR_01_edit validate edit under attestations human recourses from left hand column.
    Given navigate to campus
    When Login
    And click human resources
    And click setup
    And click attestations
    And click edit sign
    And change name
    And click save
    Then get success message and check if displayed


  Scenario: HR_02_edit validate edit under attestations human recourses from left hand column.
    Given navigate to campus
    When Login
    And click human resources
    And click setup
    And click attestations
    And click edit sign
    And leave name empty
    And click save
    Then check error message id displayed and get attribute color.

  Scenario: HR_01_delete validate delete under attestations human recourses from left hand column.
    Given navigate to campus
    When Login
    And click human resources
    And click setup
    And click attestations
    And click add sign
    And input name
    And click save
    And click delete button
    Then check success message is displayed

  Scenario: HR_02_delete validate delete under attestations human recourses from left hand column.
    Given navigate to campus
    When Login
    And click human resources
    And click setup
    And click attestations
    And click add sign
    And input name
    And click save
    And click delete button
    And click cancel
    Then check if delete success message is displayed


Feature: Tours Module
Scenario: Verify the India tour products results details

Given User Access STATravel URL
When Select country “India” from the AJAX
And Click on “Find a Tour” button
Then Change the sort order on the search results on price Low to High
And Click on “View More” button on the page to display more results
Then Verify if the “X matches found” text is equal to the actual number of results displayed
And Send the Report

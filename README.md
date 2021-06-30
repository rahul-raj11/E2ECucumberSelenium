# E2ECucumberSelenium

For the best practices, you have to use these keywords for the creating the scenario with the following guidelines:

Given: Preconditions are mentioned in the Given keyword. The Steps of the Given keyword put the system in to a known state, which is necessary for the user action. Avoid talking about user interaction in Given Steps.

When: The purpose of the When Steps is to describe the user action.

Then: The purpose of Then Steps is to observe the expected output. The observations should be related to the business value/benefit of your Feature description.

 And: This is used for statements that are an addition to the previous Steps and represent positives statements.

But: This is used for statements that are an addition to previous Steps and represent negative statements.
 
In a Step Definitions file, And and But are listed as Given/When/Then, the keyword that they appear after. There are no And and But keywords in Step Definitions.

*For TestNG we are creating a separate package/ folder with name parallel.

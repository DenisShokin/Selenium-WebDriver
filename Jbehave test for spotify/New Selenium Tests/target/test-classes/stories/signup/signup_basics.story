Narrarive:
This story covers basic tests of sign up

Scenario: Type invalid year
Given I open_signup_page
When I set month "December"
And I set day "20"
And I set year "21"
And I check share
Then I see error "Please enter a valid year."
And I don't see error "When were you born?"

Scenario: Type invalid email
Given I open_signup_page
When I type email "test_email@mail.ru"
And I type confirmation email "wrong_email@mail.r"
And I type name "test_name"
And I click signup
Then I see error "Email address doesn't match."

Scenario: Sign up with empty password
Given I open_signup_page
When I type email "test_email@mail.ru"
And I type confirmation email "test_email@mail.ru"
And I click signup
Then I see error "Please choose a password."

Scenario: Type invalid values
Given I open_signup_page
When I type email "test_email@mail.ru.qwerty"
And I type confirmation email "test_email@mail.ru"
And I type password "qwerty"
And I type name "name"
And I set gender "Male"
And I uncheck share
And I click signup
Then I don't see error "When were you born?"


# Refactoring Date Assignment
Click to access files quickly:
<br>
[Date.java](Refactoring-Java/src/myPackage/Date.java)
<br>
[Test File](Refactoring-Java/test/myPackage/DateTest.java) 
## Notes on Testing
1) Private methods were made Protected so they could be accessed by the Test File
2) Tests were made for major methods, and even for methods we had to alter
3)  Tests in Order: 
- tested a valid date
- tested a valid date, with month as a string
- using a loop, tested (for each month) to see if correct month was returned as an int
- using a loop, tested (for each month) to see if correct month was returned as a string
- using a loop, tested to see if method correctly checks months (also used an invalid to check if it correctly identifies it)
4) The first 2 tests basically cover alost all methods. As they utilize them mainly, them working is proof enough that the others also work. I made the last 3 just as extra tests.
5)   Testing for values was done mostly with Valid values (values which should work properly). I could'nt test with Invalid values as the appropriate response in the program is system.exit(0), and there isn't a nice way to check for it (assert for it).
## Notes on Refactoring
Method and variable names changed:
- dateOK() -> checkDateValidity()  (there are 2 occurunces of this method)
- monthOk() -> checkMonthValidity()
- monthNumber variables in monthString() and setMonth() (so there is consistency across the program)
I didn't change anything else because the program is already in its simplest, most clear form. There is no variable used once, so no need for inline. The methods are in their simplest possible form and are directly related to THIS class (extracting them would be of no good). There was also no need to extract any local variable.
<br>
<br>
* Note: the 4 main methods that were asked to be edited are towards the end of the document, right below a comment with a few details. 
<br>
To get to there quickly,
<br>
[Click here](Refactoring-Java/src/myPackage/Date.java) 

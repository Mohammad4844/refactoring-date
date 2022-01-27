# Refactoring Date Assignment
Click to access files quickly:
<br>
[Date.java](refactoring-date/Refactoring-Java/src/myPackage/Date.java)
<br>
[Test File](refactoring-date/Refactoring-Java/test/myPackage/DateTest.java) 
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



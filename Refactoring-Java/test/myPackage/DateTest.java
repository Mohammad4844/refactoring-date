package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

  /*
   * Declared a default Date object to use in all test methods. With this, we dont have to make a
   * new object in each test case. To set specific dates/months etc, we can use their respective
   * setters
   */
  Date date = new Date();

  // Test Case 1 values (Normal values that should work properly)
  int testYear1 = 2005;
  int testDay1 = 21;
  int testMonth1 = 3;

  // Test Case 2 values (Normal values that should work properly)
  int testYear2 = 2000;
  int testDay2 = 21;
  String testMonth2 = "May";

  /*
   * An array of strings that contains all months in order. Used to check later methods for each
   * month.
   */
  String[] testingContainerOfMonths = {"January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December"};


  @Test
  public void testForNormalValuesWithMonthAsInt() {
    date.setDate(testMonth1, testDay1, testYear1);
    assertEquals("Month is not returned correctly", date.getMonth(), testMonth1);
    assertEquals("Day is not returned correctly", date.getDay(), testDay1);
    assertEquals("Year is not returned correctly", date.getYear(), testYear1);
  }

  @Test
  public void testForNormalValuesWithMonthAsString() {
    date.setDate(testMonth2, testDay2, testYear2);
    assertEquals("Month is not returned correctly", date.getMonth(), 5);
    assertEquals("Day is not returned correctly", date.getDay(), testDay2);
    assertEquals("Year is not returned correctly", date.getYear(), testYear2);
  }

  @Test
  public void testGetMonth() {
    for (int i = 1; i <= 12; i++) {
      date.setMonth(i);
      assertEquals("getMonth doesnt work when month is " + i, date.getMonth(), i);
    }
  }

  @Test
  public void testMonthString() {
    for (int i = 1; i <= 12; i++) {
      assertEquals("testMonthString doesnt work when month is " + i, date.monthString(i),
          testingContainerOfMonths[i - 1]);
    }
  }

  @Test
  public void testMonthOK() {
    for (int i = 1; i <= 12; i++) {
      assertTrue(date.checkMonthValidity(testingContainerOfMonths[i - 1]));
    }
    assertFalse(date.checkMonthValidity("abcd"));
  }
}

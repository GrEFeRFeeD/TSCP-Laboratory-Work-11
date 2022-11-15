/**
 * Some info about package.
 */
package com.nuop.tscp;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class.
 */
public class LiteratureIdTest {

  private static int basicTestCaseNumber = 1;
  private static Integer minLiteratureId = 0;
  private static Integer maxLiteratureId = 1000000000;
  private static List<Integer> testValues = new ArrayList<>(List.of(
      1, 12, 123, 12345125, 21564354, 999999999
  ));

  /**
   * Private constructor.
   */
  private LiteratureIdTest() {

  }

  /**
   * Method to perform check literature id.
   *
   * @param literatureId literature id
   * @return true if literature id is correct, else false
   */
  public static boolean isLiteratureIdCorrect(final Integer literatureId) {
    return literatureId > minLiteratureId && literatureId < maxLiteratureId;
  }

  /**
   * Method to perform testcase.
   *
   * @param testCaseNumber number of current testcase
   * @param literatureId id of literature to check
   */
  public static void doTestCase(final int testCaseNumber, final int literatureId) {
    System.out.print("TC" + (basicTestCaseNumber + testCaseNumber) + ": ");
    if (isLiteratureIdCorrect(literatureId)) {
      System.out.println("PASSED");
    } else {
      System.out.println("FAILED");
    }
  }

  /**
   * Main class.
   *
   * @param args String array args argument
   */
  public static void main(final String[] args) {

    testValues.forEach((id) -> doTestCase(testValues.indexOf(id), id));
  }
}

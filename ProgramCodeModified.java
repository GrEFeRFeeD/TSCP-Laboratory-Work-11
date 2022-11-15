/**
 * Some info about package.
 */
package com.nuop.tscp;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class.
 */
public final class LiteratureIdTest {

  /**
   * Some information about basicTestCaseNumber.
   */
  private static final int basicTestCaseNumber = 1;
  /**
   * Some information about minLiteratureId.
   */
  private static final Integer minLiteratureId = 0;
  /**
   * Some information about maxLiteratureId.
   */
  private static final Integer maxLiteratureId = 1000000000;
  /**
   * Some information about testValues.
   */
  private static final List<Integer> testValues = new ArrayList<>(List.of(
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
  public static void doTestCase(final int testCaseNumber,
                                final int literatureId) {
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

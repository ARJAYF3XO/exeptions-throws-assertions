/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Rosalie
 */
public class Custom_assert {
    //custom assertions naman tayo 
    public static void assertNotNull(Object obj, String message) {
          if (obj == null) {
              throw new AssertionError("Assertion failed: " + message);
          }
      }

    //check positive
    public static void assertPositive(int number, String message) {
        if (number <= 0) {
            throw new AssertionError("Assertion failed: " + message);
        }
    }

    // assert not empty
    public static void assertNotEmpty(String text, String message) {
        if (text == null || text.trim().isEmpty()) {
            throw new AssertionError("Assertion failed: " + message);
        }
    }
    public static void assertNotEmptykupal(String text, String message) {
        if (text.equals("wala")) {
            throw new AssertionError("Assertion failed: " + message);
        }
    }
}

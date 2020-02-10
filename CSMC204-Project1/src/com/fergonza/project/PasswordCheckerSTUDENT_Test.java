package com.fergonza.project;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * STUDENT tests for the methods of PasswordChecker
 * 
 * @author
 *
 */
public class PasswordCheckerSTUDENT_Test {
  ArrayList<String> passwords;
  String password1, password2;

  @Before
  public void setUp() throws Exception {
    String[] p = {"458899YU", "MyToolisGR8", "morning4MEEE", "be42night", "morpheus666", "El5deMayo",
        "february29", "zyxwvu", "Caesaii", "uu99v", "camelCharacter", "myLastName", "myFirstName2"};
    passwords = new ArrayList<String>();
    passwords.addAll(Arrays.asList(p)); // puts strings into the ArrayList

  }

  @After
  public void tearDown() throws Exception {
    passwords = null;
  }

  /**
   * Test if the password is less than 8 characters long. This test should throw a LengthException
   * for second case.
   */
  @Test
  public void testIsValidPasswordTooShort() {
    try {
      assertTrue(PasswordCheckerUtility.isValidPassword("123Abc"));
      PasswordCheckerUtility.isValidPassword("123ab");
      assertTrue("Did not throw lengthException", false);
    } catch (LengthException e) {
      assertTrue("Successfully threw a lengthExcepetion", true);
    } catch (Exception e) {
      assertTrue("Threw some other exception besides lengthException", false);
    }
  }

  /**
   * Test if the password has at least one uppercase alpha character This test should throw a
   * NoUpperAlphaException for second case
   */
  @Test
  public void testIsValidPasswordNoUpperAlpha() {
    try {
      assertTrue(PasswordCheckerUtility.isValidPassword("Z208539z"));
      PasswordCheckerUtility.isValidPassword("208539z");
      assertTrue("Did not throw NoUpperAlphaException", false);
    } catch (NoUpperAlphaException e) {
      assertTrue("Successfully threw a NoUpperAlphaExcepetion", true);
    } catch (Exception e) {
      assertTrue("Threw some other exception besides NoUpperAlphaException", false);
    }
  }

  /**
   * Test if the password has at least one lowercase alpha character This test should throw a
   * NoLowerAlphaException for second case
   */
  @Test
  public void testIsValidPasswordNoLowerAlpha() {
    try {
      assertTrue(PasswordCheckerUtility.isValidPassword("Z208539z"));
      PasswordCheckerUtility.isValidPassword("Z208539");
      assertTrue("Did not throw NoLowerAlphaException", false);
    } catch (NoLowerAlphaException e) {
      assertTrue("Successfully threw a NoLowerAlphaExcepetion", true);
    } catch (Exception e) {
      assertTrue("Threw some other exception besides NoLowerAlphaException", false);
    }
  }

  /**
   * Test if the password has more than 2 of the same character in sequence This test should throw a
   * InvalidSequenceException for second case
   */
  @Test
  public void testIsWeakPassword() {
    try {
      assertEquals(true, PasswordCheckerUtility.isValidPassword("tt311llMM"));
      boolean weakPwd = PasswordCheckerUtility.isWeakPassword("tt311llMM");
      assertTrue(weakPwd);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      assertTrue("Threw some incorrect exception", false);
    }
  }

  /**
   * Test if the password has more than 2 of the same character in sequence This test should throw a
   * InvalidSequenceException for second case
   */
  @Test
  public void testIsValidPasswordInvalidSequence() {
    try {
      assertEquals(true, PasswordCheckerUtility.isValidPassword("tt311llMM"));
      PasswordCheckerUtility.isValidPassword("tt311llMMM");
      assertTrue("Did not throw an InvalidSequenceException", false);
    } catch (InvalidSequenceException e) {
      assertTrue("Successfully threw an InvalidSequenceExcepetion", true);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      assertTrue("Threw some other exception besides an InvalidSequenceException", false);
    }
  }

  /**
   * Test if the password has at least one digit One test should throw a NoDigitException
   */
  @Test
  public void testIsValidPasswordNoDigit() {
    try {
      assertTrue(PasswordCheckerUtility.isValidPassword("abcdEFGH"));
      PasswordCheckerUtility.isValidPassword("abcdEFGH");
      assertTrue("Did not throw NoLowerAlphaException", false);
    } catch (NoDigitException e) {
      assertTrue("Successfully threw a NoDigitExcepetion", true);
    } catch (Exception e) {
      assertTrue("Threw some other exception besides NoDigitException", false);
    }
  }

  /**
   * Test correct passwords This test should not throw an exception
   */
  @Test
  public void testIsValidPasswordSuccessful() {
    try {
      assertEquals(true, PasswordCheckerUtility.isValidPassword("ZZ7mnopqq"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
      assertTrue("Threw some incorrect exception", false);
    }
  }

  /**
   * Test the validPasswords method Check the results of the ArrayList of Strings returned by the
   * validPasswords method
   */
  @Test
  public void testValidPasswords() {
    ArrayList<String> results;
    results = PasswordCheckerUtility.invalidPasswords(passwords);
    
    Scanner scan = new Scanner(results.get(0)); //
    assertEquals("458899YU", scan.next());
    String nextResults = scan.nextLine().toLowerCase();
    assertTrue(nextResults.contains("lowercase"));

    scan = new Scanner(results.get(1)); //
    assertEquals(scan.next(), "morning4MEEE");
    nextResults = scan.nextLine().toLowerCase();
    assertTrue(nextResults.contains("more than two"));

    scan = new Scanner(results.get(3)); //
    assertEquals(scan.next(), "morpheus666");
    nextResults = scan.nextLine().toLowerCase();
    assertTrue(nextResults.contains("uppercase"));

    scan = new Scanner(results.get(5)); //
    assertEquals(scan.next(), "zyxwvu");
    nextResults = scan.nextLine().toLowerCase();
    assertTrue(nextResults.contains("uppercase")); 
    
    scan = new Scanner(results.get(6)); // a
    assertEquals(scan.next(), "Caesaii");
    nextResults = scan.nextLine().toLowerCase();
    assertTrue(nextResults.contains("digit"));
  }

}

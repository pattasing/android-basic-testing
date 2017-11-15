package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Controller.EmailValidation;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class EmailValidationFailTest {

    @Test
    public void emailIsNull(){
        EmailValidation emailValidation = new EmailValidation();
        String email = null;
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is null", stringResult);
    }

    @Test
    public void emailIsEmpty(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is empty", stringResult);
    }

    @Test
    public void emailHaveSpecialSymbol(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "Toto=!@yoyo.com";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is not pattern", stringResult);
    }

    @Test
    public void emailNotAddSymbol(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "Totoyoyo.com";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is not pattern", stringResult);
    }

    @Test
    public void emailNotDotSymbol(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "Toto@yoyocom";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is not pattern", stringResult);
    }

    @Test
    public void emailNotAlphabetBeforeAdd(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "@yoyo.com";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is not pattern", stringResult);
    }

    @Test
    public void emailNotAlphabetBetweenAddAndDot(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "Toto@.com";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is not pattern", stringResult);
    }

    @Test
    public void emailNotAlphabetBehindDot(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "Toto@yoyo.";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is not pattern", stringResult);
    }

    @Test
    public void emailHaveNumberBehindDot(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "Toto@yoyo.com5";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Email is not pattern", stringResult);
    }
}

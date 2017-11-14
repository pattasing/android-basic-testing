package cc.somkiat.basicunittesting;

import org.junit.Test;

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

}

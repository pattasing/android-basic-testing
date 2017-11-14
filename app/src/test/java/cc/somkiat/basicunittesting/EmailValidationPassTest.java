package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class EmailValidationPassTest {
    @Test
    public void emailDotCom(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "popo@koko.com";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertFalse ("ต้องผ่าน", result);
        assertEquals("Email Validation Success", stringResult);
    }

    @Test
    public void emailDotCoDotTh(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "popo@koko.co.th";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertFalse ("ต้องผ่าน", result);
        assertEquals("Email Validation Success", stringResult);
    }

    @Test
    public void emailWithNumber(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "popo123@koko555.co.th";
        boolean result = emailValidation.isEmailValidation(email).getValidation();
        String stringResult = emailValidation.isEmailValidation(email).getStringValidation();
        assertFalse ("ต้องผ่าน", result);
        assertEquals("Email Validation Success", stringResult);
    }
}

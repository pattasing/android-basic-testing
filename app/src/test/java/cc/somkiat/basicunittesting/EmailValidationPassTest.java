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

    
}

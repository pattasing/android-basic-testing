package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class NameValidationPassTest {

    @Test
    public void nameNotEmpty(){
        NameValidation nameValidation = new NameValidation();
        String name = "popo bobo";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertFalse ("ต้องผ่าน", result);
        assertEquals("Name Validation Success", stringResult);
    }

    @Test
    public void nameInLength(){
        NameValidation nameValidation = new NameValidation();
        String name = "po";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertFalse ("ต้องผ่าน", result);
        assertEquals("Name Validation Success", stringResult);
    }

}

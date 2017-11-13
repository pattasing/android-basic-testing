package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void nameIsNull(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNameValidation(null).getValidation();
        assertTrue("ต้องไม่ผ่าน", result);
    }

    @Test
    public void nameIsEmpty(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNameValidation("").getValidation();
        assertTrue("ต้องไม่ผ่าน", result);
    }


}

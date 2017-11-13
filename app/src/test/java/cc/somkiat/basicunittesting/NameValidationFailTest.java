package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void nameIsNull(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNull(null);
//        assertFalse("ต้องไม่ผ่าน", result);
        assertTrue("ต้องไม่ผ่าน", result);
    }

}

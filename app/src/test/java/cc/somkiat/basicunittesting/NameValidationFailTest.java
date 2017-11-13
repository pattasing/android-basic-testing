package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void nameIsNull(){
        NameValidation nameValidation = new NameValidation();
        String name = null;
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Name is null", stringResult);
    }

    @Test
    public void nameIsEmpty(){
        NameValidation nameValidation = new NameValidation();
        String name = "";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Name is empty", stringResult);
    }

    @Test
    public void nameNotInLengthLessThenTwo(){
        NameValidation nameValidation = new NameValidation();
        String name = "w";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Name not in length", stringResult);
    }

    @Test
    public void nameNotInLengthMoreThenTwenty(){
        NameValidation nameValidation = new NameValidation();
        String name = "Pattarawadee Singhakul";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Name not in length", stringResult);
    }

    

}

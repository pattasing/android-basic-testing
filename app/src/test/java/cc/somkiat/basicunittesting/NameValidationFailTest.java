package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Controller.NameValidation;

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

    @Test
    public void nameHaveNumber(){
        NameValidation nameValidation = new NameValidation();
        String name = "Nutty123";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Name is not pattern", stringResult);
    }

    @Test
    public void nameHaveSymbol(){
        NameValidation nameValidation = new NameValidation();
        String name = "Nutty@#";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Name is not pattern", stringResult);
    }

    @Test
    public void nameHaveNumberAndSymbol(){
        NameValidation nameValidation = new NameValidation();
        String name = "N3utty1@#";
        boolean result = nameValidation.isNameValidation(name).getValidation();
        String stringResult = nameValidation.isNameValidation(name).getStringValidation();
        assertTrue("ต้องไม่ผ่าน", result);
        assertEquals("Name is not pattern", stringResult);
    }

}

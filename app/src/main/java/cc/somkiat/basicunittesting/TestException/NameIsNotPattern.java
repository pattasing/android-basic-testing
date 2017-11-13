package cc.somkiat.basicunittesting.TestException;

/**
 * Created by patta on 14/11/2560.
 */

public class NameIsNotPattern extends Exception {
    public void checkName(String name) throws NameIsNotPattern {
        if(!name.matches("[ A-Za-z]"))
        throw new NameIsNotPattern();
    }
}

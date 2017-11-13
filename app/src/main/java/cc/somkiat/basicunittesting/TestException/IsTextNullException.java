package cc.somkiat.basicunittesting.TestException;

/**
 * Created by patta on 13/11/2560.
 */

public class IsTextNullException extends Exception{
    public void checkText(String text) throws IsTextNullException {
        if(text == null) {
            throw new IsTextNullException();
        }
    }
}

package cc.somkiat.basicunittesting.TestException;

public class IsTextNullException extends Exception{
    public void checkText(String text) throws IsTextNullException {
        if(text == null) {
            throw new IsTextNullException();
        }
    }
}

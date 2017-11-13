package cc.somkiat.basicunittesting.TestException;

public class IsTextEmptyException extends Exception {
    public void checkText(String text) throws IsTextEmptyException {
        System.out.println("text: " + text);
        if(text.equals("")) {
            throw new IsTextEmptyException();
        }
    }
}

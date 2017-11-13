package cc.somkiat.basicunittesting.TestException;

public class NameNotInLength extends Exception{
    public void checkNameLength (String name) throws NameNotInLength {
        if(name.length() < 2 || name.length() > 20) {
            throw new NameNotInLength();
        }
    }
}

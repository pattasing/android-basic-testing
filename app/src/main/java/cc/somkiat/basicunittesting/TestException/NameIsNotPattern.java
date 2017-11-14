package cc.somkiat.basicunittesting.TestException;

public class NameIsNotPattern extends Exception {
    public void checkName(String name) throws NameIsNotPattern {
        if(!(name.matches("^[ A-Za-z]+$"))){
            throw new NameIsNotPattern();
        }
    }
}

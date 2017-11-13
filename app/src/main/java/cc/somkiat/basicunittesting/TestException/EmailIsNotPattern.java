package cc.somkiat.basicunittesting.TestException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIsNotPattern extends Exception {
    public void checkEmialPattern(String email) throws EmailIsNotPattern {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if(!(matcher.matches())){
            throw new EmailIsNotPattern();
        }
    }
}
package cc.somkiat.basicunittesting;

import android.content.Context;

import cc.somkiat.basicunittesting.TestException.EmailIsNotPattern;
import cc.somkiat.basicunittesting.TestException.IsTextEmptyException;
import cc.somkiat.basicunittesting.TestException.IsTextNullException;

public class EmailValidation {

    Context context;

    public EmailValidation() {
    }
    public EmailValidation(Context context) {
        this.context = context;
    }


    public Result isEmailValidation (String email){
        IsTextNullException isTextNullException = new IsTextNullException();
        IsTextEmptyException isTextEmptyException = new IsTextEmptyException();
        EmailIsNotPattern emailIsNotPattern = new EmailIsNotPattern();

        try {
            isTextNullException.checkText(email);
            isTextEmptyException.checkText(email);
            emailIsNotPattern.checkEmialPattern(email);
        } catch (IsTextNullException e) {
            return new Result(true, "Email is null");
        } catch (IsTextEmptyException e) {
            return new Result(true, "Email is empty");
        } catch (EmailIsNotPattern e) {
            return new Result(true, "Email is not pattern");
        }
        return new Result(false, "Email Validation Success");
    }
}

package cc.somkiat.basicunittesting;

import android.content.Context;
import android.widget.Toast;

import cc.somkiat.basicunittesting.TestException.EmailIsNotPattern;
import cc.somkiat.basicunittesting.TestException.IsTextEmptyException;
import cc.somkiat.basicunittesting.TestException.IsTextNullException;
import cc.somkiat.basicunittesting.TestException.NameNotInLength;

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
//            Toast.makeText(context, "Email is null", Toast.LENGTH_LONG).show();
//            return true;
            return new Result(true, "Email is null");
        } catch (IsTextEmptyException e) {
//            Toast.makeText(context, "Email is empty", Toast.LENGTH_LONG).show();
//            return true;
            return new Result(true, "Email is empty");
        } catch (EmailIsNotPattern e) {
//            Toast.makeText(context, "Email is not pattern", Toast.LENGTH_LONG).show();
//            return true;
            return new Result(true, "Email is not pattern");
        }
//        return false;
//        Toast.makeText(context, "Save success", Toast.LENGTH_LONG).show();
        return new Result(false, "Email Validation Success");
    }
}

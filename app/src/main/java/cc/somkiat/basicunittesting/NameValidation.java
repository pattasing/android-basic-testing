package cc.somkiat.basicunittesting;

import cc.somkiat.basicunittesting.TestException.IsTextNullException;

/**
 * Created by patta on 10/11/2560.
 */

class NameValidation {
    public boolean isNull(String name) {
        IsTextNullException isTextNullException = new IsTextNullException();
        try {
            isTextNullException.checkText(name);
        }
        catch (IsTextNullException e) {
            return true;
        }
        return false;
    }
}

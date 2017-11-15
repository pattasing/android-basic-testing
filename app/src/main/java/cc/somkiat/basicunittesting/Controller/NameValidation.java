package cc.somkiat.basicunittesting.Controller;

import cc.somkiat.basicunittesting.Model.Result;
import cc.somkiat.basicunittesting.TestException.IsTextEmptyException;
import cc.somkiat.basicunittesting.TestException.IsTextNullException;
import cc.somkiat.basicunittesting.TestException.NameIsNotPattern;
import cc.somkiat.basicunittesting.TestException.NameNotInLength;

public class NameValidation {

    public NameValidation() {
    }

    public Result isNameValidation (String name){
        IsTextNullException isTextNullException = new IsTextNullException();
        IsTextEmptyException isTextEmptyException = new IsTextEmptyException();
        NameNotInLength nameNotInLength = new NameNotInLength();
        NameIsNotPattern nameIsNotPattern = new NameIsNotPattern();
        try {
            isTextNullException.checkText(name);
            isTextEmptyException.checkText(name);
            nameNotInLength.checkNameLength(name);
            nameIsNotPattern.checkName(name);
        } catch (IsTextNullException e) {
            return new Result(true, "Name is null");
        } catch (IsTextEmptyException e) {
            return new Result(true, "Name is empty");
        } catch (NameNotInLength e) {
            return new Result(true, "Name not in length");
        } catch (NameIsNotPattern e) {
            return new Result(true, "Name is not pattern");
        }
        return new Result(false, "Name Validation Success");
    }
}

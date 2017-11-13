package cc.somkiat.basicunittesting;

/**
 * Created by patta on 14/11/2560.
 */

public class Result {
    private boolean validation;
    private String stringValidation;

    public Result(boolean validation, String stringValidation) {
        this.validation = validation;
        this.stringValidation = stringValidation;
    }

    public boolean getValidation() {
        return validation;
    }

    public String getStringValidation() {
        return stringValidation;
    }
}

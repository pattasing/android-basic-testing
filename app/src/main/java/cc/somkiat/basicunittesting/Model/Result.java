package cc.somkiat.basicunittesting.Model;

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

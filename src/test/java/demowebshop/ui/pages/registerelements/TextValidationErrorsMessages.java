package demowebshop.ui.pages.registerelements;

import lombok.Getter;

public class TextValidationErrorsMessages {
    @Getter
    private static String validationErrorFirstNameText = "First name is required.";
    @Getter
    private static String validationErrorLastNameText = "Last name is required.";
    @Getter
    private static String validationErrorRequiredEmailText = "Email is required.";
    @Getter
    private static String validationErrorWrongEmailText = "Wrong email";
    @Getter
    private static String validationErrorPasswordText = "Password is required.";
    @Getter
    private static String validationErrorConfirmPasswordText = "Password is required.";
    @Getter
    private static String validationErrorSmallPasswordText = "The password should have at least 6 characters.";
    @Getter
    private static String validationErrorDoNotMatchConfirmPasswordText =
            "The password and confirmation password do not match.";
}

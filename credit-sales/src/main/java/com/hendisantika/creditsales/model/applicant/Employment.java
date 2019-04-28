package com.hendisantika.creditsales.model.applicant;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-29
 * Time: 04:13
 */
public enum Employment {
    EMPLOYEE("Employee"), OFFICIAL("Official"),
    PENSIONER("Pensioner"),
    STUDENT("Student"),
    TRAINEE("Trainee"),
    FREELANCER("Freelancer"),
    UNEMPLOYED("Unemployed"),
    OTHER("Other");

    private final String displayName;

    Employment(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
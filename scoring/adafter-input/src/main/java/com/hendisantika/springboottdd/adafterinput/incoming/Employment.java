package com.hendisantika.springboottdd.adafterinput.incoming;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-14
 * Time: 05:42
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
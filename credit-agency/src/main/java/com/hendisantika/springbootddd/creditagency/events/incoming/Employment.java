package com.hendisantika.springbootddd.creditagency.events.incoming;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-02
 * Time: 06:30
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
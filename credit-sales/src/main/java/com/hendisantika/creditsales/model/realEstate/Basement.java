package com.hendisantika.creditsales.model.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-30
 * Time: 06:36
 */

public enum Basement {
    NOT_PRESENT("Not present"),
    PARTLY_DEVELOPED("Partly developed"),
    FULLY_DEVELOPED("Fully developed");

    private final String displayName;

    Basement(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
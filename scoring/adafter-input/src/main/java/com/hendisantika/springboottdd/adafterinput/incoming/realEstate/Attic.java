package com.hendisantika.springboottdd.adafterinput.incoming.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-15
 * Time: 04:32
 */
public enum Attic {
    NOT_PRESENT("Not present"),
    PARTLY_DEVELOPED("Partly developed"),
    FULLY_DEVELOPED("Fully developed");

    private final String displayName;

    Attic(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

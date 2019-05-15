package com.hendisantika.springboottdd.adafterinput.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:30
 */
public enum Interior {
    STANDARD("Standard"),
    LUXURY("Luxury"),
    SIMPLE("Simple");

    private final String displayName;

    Interior(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
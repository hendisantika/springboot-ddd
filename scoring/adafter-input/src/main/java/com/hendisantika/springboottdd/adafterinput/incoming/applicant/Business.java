package com.hendisantika.springboottdd.adafterinput.incoming.applicant;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-14
 * Time: 05:43
 */
public enum Business {
    BANKING("Banking"),
    ENERGY("Energy"),
    INSURANCE("Insurance"),
    CONSTRUCTION("Construction"),
    AGRICULTURE("Agriculture"),
    INDUSTRY("Industry"),
    PUBLIC_SERVICE("Public service"),
    OTHER("Other");

    private final String displayName;

    Business(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
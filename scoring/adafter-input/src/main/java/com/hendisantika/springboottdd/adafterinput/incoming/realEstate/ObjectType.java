package com.hendisantika.springboottdd.adafterinput.incoming.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:31
 */
public enum ObjectType {
    SEMI_DETACHED_HOUSE("Semi detached house"),
    ROW_HOUSE("Row house"),
    DETACHED_HOUSE("Detached house"),
    APARTMENT("Apartment");

    private final String displayName;

    ObjectType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
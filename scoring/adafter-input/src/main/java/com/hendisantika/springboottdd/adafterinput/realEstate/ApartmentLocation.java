package com.hendisantika.springboottdd.adafterinput.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-15
 * Time: 04:31
 */
public enum ApartmentLocation {
    BASEMENT_FLOOR("Basement floor"),
    GROUND_FLOOR("Ground floor"),
    UPPER_FLOOR("Upper floor"),
    PENTHOUSE("Penthouse");

    private final String displayName;

    ApartmentLocation(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

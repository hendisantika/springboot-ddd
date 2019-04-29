package com.hendisantika.creditsales.model.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-30
 * Time: 06:35
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
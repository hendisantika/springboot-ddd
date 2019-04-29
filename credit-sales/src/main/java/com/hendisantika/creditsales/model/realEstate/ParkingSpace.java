package com.hendisantika.creditsales.model.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-30
 * Time: 06:39
 */
public enum ParkingSpace {
    NOT_PRESENT("Not present"),
    CARPORT("Carport"),
    GARAGE("Garage");

    private final String displayName;

    ParkingSpace(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
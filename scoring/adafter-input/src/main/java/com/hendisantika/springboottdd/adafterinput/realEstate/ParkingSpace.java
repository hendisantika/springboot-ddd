package com.hendisantika.springboottdd.adafterinput.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:31
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
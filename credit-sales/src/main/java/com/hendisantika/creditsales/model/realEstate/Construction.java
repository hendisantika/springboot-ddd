package com.hendisantika.creditsales.model.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-30
 * Time: 06:37
 */
public enum Construction {
    PREFABRICATED_HOUSE("Prefabricated house"),
    WOOD("Wood"),
    STONE("Stone");

    private final String displayName;

    Construction(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
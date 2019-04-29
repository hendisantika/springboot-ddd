package com.hendisantika.creditsales.model.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-30
 * Time: 06:40
 */
public enum TypeOfUse {
    FOR_LEASE("For lease"),
    SELF_OCCUPIED("Self occupied"),
    COMMERCIAL("Commercial");

    private final String displayName;

    TypeOfUse(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}


package com.hendisantika.springboottdd.adafterinput.realEstate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:33
 */
public enum UsageOfLoan {
    PURCHASE("Purchase"),
    CONSTRUCTION("Construction"),
    MODERNIZATION("Modernization"),
    OTHER("Other");

    private final String displayName;

    UsageOfLoan(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

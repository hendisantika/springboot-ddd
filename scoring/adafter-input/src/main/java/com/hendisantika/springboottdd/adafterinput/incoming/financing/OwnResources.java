package com.hendisantika.springboottdd.adafterinput.incoming.financing;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-14
 * Time: 05:48
 */
public class OwnResources implements Serializable {
    private int liquidAssets;
    private int balanceFromBuildingSociety;
    private int ownManpower;

    public int sum() {
        return liquidAssets + balanceFromBuildingSociety + ownManpower;
    }

    public int getLiquidAssets() {
        return liquidAssets;
    }

    public void setLiquidAssets(int liquidAssets) {
        this.liquidAssets = liquidAssets;
    }

    public int getBalanceFromBuildingSociety() {
        return balanceFromBuildingSociety;
    }

    public void setBalanceFromBuildingSociety(int balanceFromBuildingSociety) {
        this.balanceFromBuildingSociety = balanceFromBuildingSociety;
    }

    public int getOwnManpower() {
        return ownManpower;
    }

    public void setOwnManpower(int ownManpower) {
        this.ownManpower = ownManpower;
    }
}
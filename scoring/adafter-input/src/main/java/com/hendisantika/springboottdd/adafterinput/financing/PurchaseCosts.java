package com.hendisantika.springboottdd.adafterinput.financing;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-15
 * Time: 04:28
 */
public class PurchaseCosts implements Serializable {
    private int priceOfLand;
    private int purchasePrice;
    private int reconstructionCosts;
    private int additionalPurchaseCharges;

    public int sum() {
        return priceOfLand + purchasePrice + reconstructionCosts + additionalPurchaseCharges;
    }

    public int getPriceOfLand() {
        return priceOfLand;
    }

    public void setPriceOfLand(int priceOfLand) {
        this.priceOfLand = priceOfLand;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getReconstructionCosts() {
        return reconstructionCosts;
    }

    public void setReconstructionCosts(int reconstructionCosts) {
        this.reconstructionCosts = reconstructionCosts;
    }

    public int getAdditionalPurchaseCharges() {
        return additionalPurchaseCharges;
    }

    public void setAdditionalPurchaseCharges(int additionalPurchaseCharges) {
        this.additionalPurchaseCharges = additionalPurchaseCharges;
    }
}
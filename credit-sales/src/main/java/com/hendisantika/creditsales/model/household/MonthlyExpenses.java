package com.hendisantika.creditsales.model.household;

import com.hendisantika.creditsales.model.validation.ApplicationSubmissionGroup;

import javax.persistence.Embeddable;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-29
 * Time: 04:19
 */
@Embeddable
public class MonthlyExpenses implements Serializable {
    private int healthInsuranceFirstApplicant;
    private int healthInsuranceSecondApplicant;
    private int otherLoansRemainderOfDebt;
    private int otherLoansMonthlyRepayments;
    @Min(value = 1, groups = ApplicationSubmissionGroup.class)
    private int costOfLiving;
    private int rent;
    private boolean rentNotApplicableInFuture;

    public int getHealthInsuranceFirstApplicant() {
        return healthInsuranceFirstApplicant;
    }

    public void setHealthInsuranceFirstApplicant(int healthInsuranceFirstApplicant) {
        this.healthInsuranceFirstApplicant = healthInsuranceFirstApplicant;
    }

    public int getHealthInsuranceSecondApplicant() {
        return healthInsuranceSecondApplicant;
    }

    public void setHealthInsuranceSecondApplicant(int healthInsuranceSecondApplicant) {
        this.healthInsuranceSecondApplicant = healthInsuranceSecondApplicant;
    }

    public int getOtherLoansRemainderOfDebt() {
        return otherLoansRemainderOfDebt;
    }

    public void setOtherLoansRemainderOfDebt(int otherLoansRemainderOfDebt) {
        this.otherLoansRemainderOfDebt = otherLoansRemainderOfDebt;
    }

    public int getOtherLoansMonthlyRepayments() {
        return otherLoansMonthlyRepayments;
    }

    public void setOtherLoansMonthlyRepayments(int otherLoansMonthlyRepayments) {
        this.otherLoansMonthlyRepayments = otherLoansMonthlyRepayments;
    }

    public int getCostOfLiving() {
        return costOfLiving;
    }

    public void setCostOfLiving(int costOfLiving) {
        this.costOfLiving = costOfLiving;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public boolean isRentNotApplicableInFuture() {
        return rentNotApplicableInFuture;
    }

    public void setRentNotApplicableInFuture(boolean rentNotApplicableInFuture) {
        this.rentNotApplicableInFuture = rentNotApplicableInFuture;
    }
}
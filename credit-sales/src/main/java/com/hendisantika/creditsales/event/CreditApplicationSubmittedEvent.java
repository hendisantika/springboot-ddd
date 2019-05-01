package com.hendisantika.creditsales.event;

import com.hendisantika.creditsales.model.applicant.Applicant;
import com.hendisantika.creditsales.model.financing.Financing;
import com.hendisantika.creditsales.model.household.Household;
import com.hendisantika.creditsales.model.realEstate.RealEstateProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-01
 * Time: 18:25
 */
public class CreditApplicationSubmittedEvent implements Serializable {
    private String applicationNumber;
    private Date timestamp;
    private Applicant firstApplicant;
    private Applicant secondApplicant;
    private Household household;
    private RealEstateProperty realEstateProperty;
    private Financing financing;


    public CreditApplicationSubmittedEvent() {
        this.timestamp = new Date();
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Applicant getFirstApplicant() {
        return firstApplicant;
    }

    public void setFirstApplicant(Applicant firstApplicant) {
        this.firstApplicant = firstApplicant;
    }

    public Applicant getSecondApplicant() {
        return secondApplicant;
    }

    public void setSecondApplicant(Applicant secondApplicant) {
        this.secondApplicant = secondApplicant;
    }

    public Household getHousehold() {
        return household;
    }

    public void setHousehold(Household household) {
        this.household = household;
    }

    public RealEstateProperty getRealEstateProperty() {
        return realEstateProperty;
    }

    public void setRealEstateProperty(RealEstateProperty realEstateProperty) {
        this.realEstateProperty = realEstateProperty;
    }

    public Financing getFinancing() {
        return financing;
    }

    public void setFinancing(Financing financing) {
        this.financing = financing;
    }
}

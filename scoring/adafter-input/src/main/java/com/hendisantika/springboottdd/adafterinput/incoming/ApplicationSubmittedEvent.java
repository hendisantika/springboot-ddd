package com.hendisantika.springboottdd.adafterinput.incoming;

import com.hendisantika.springboottdd.adafterinput.financing.Financing;
import com.hendisantika.springboottdd.adafterinput.household.Household;
import com.hendisantika.springboottdd.adafterinput.incoming.applicant.Applicant;
import com.hendisantika.springboottdd.adafterinput.incoming.realEstate.RealEstateProperty;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:37
 */
public class ApplicationSubmittedEvent {
    private String applicationNumber;
    private Date timestamp;
    private Applicant firstApplicant;
    private Applicant secondApplicant;
    private Household household;
    private RealEstateProperty realEstateProperty;
    private Financing financing;

    public ApplicationSubmittedEvent() {
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

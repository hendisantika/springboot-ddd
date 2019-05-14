package com.hendisantika.springboottdd.adafterinput.realEstate;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-15
 * Time: 04:31
 */
public class ApartmentInformation implements Serializable {
    private int numberOfApartmentsInHouse;

    private String nameOfApartment;

    private ApartmentLocation apartmentLocation;

    public int getNumberOfApartmentsInHouse() {
        return numberOfApartmentsInHouse;
    }

    public void setNumberOfApartmentsInHouse(int numberOfApartmentsInHouse) {
        this.numberOfApartmentsInHouse = numberOfApartmentsInHouse;
    }

    public String getNameOfApartment() {
        return nameOfApartment;
    }

    public void setNameOfApartment(String nameOfApartment) {
        this.nameOfApartment = nameOfApartment;
    }

    public ApartmentLocation getApartmentLocation() {
        return apartmentLocation;
    }

    public void setApartmentLocation(ApartmentLocation apartmentLocation) {
        this.apartmentLocation = apartmentLocation;
    }
}
package com.hendisantika.creditsales.model;

import com.hendisantika.creditsales.model.validation.ApplicationSubmissionGroup;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-29
 * Time: 04:09
 */
@Embeddable
public class Address implements Serializable {
    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String street;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String postCode;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
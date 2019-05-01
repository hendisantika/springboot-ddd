package com.hendisantika.springbootddd.creditagency.events;

import com.hendisantika.springbootddd.creditagency.events.incoming.Applicant;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-02
 * Time: 06:28
 */
public class ApplicationSubmittedEvent {
    private String applicationNumber;
    private Applicant firstApplicant;

    public ApplicationSubmittedEvent() {
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Applicant getFirstApplicant() {
        return firstApplicant;
    }

    public void setFirstApplicant(Applicant firstApplicant) {
        this.firstApplicant = firstApplicant;
    }
}

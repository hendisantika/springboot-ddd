package com.hendisantika.springbootddd.scoring.adaptersoutput.agencyResult;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : adapters-output
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-24
 * Time: 05:30
 */
@Entity
public class AgencyResultProjection {
    @Id
    @GeneratedValue
    private Long id;
    private String personId;
    private int points;
    private boolean noGoPresent;

    private Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isNoGoPresent() {
        return noGoPresent;
    }

    public void setNoGoPresent(boolean noGoPresent) {
        this.noGoPresent = noGoPresent;
    }
}



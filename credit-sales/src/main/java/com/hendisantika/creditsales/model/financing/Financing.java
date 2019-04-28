package com.hendisantika.creditsales.model.financing;

import com.hendisantika.creditsales.model.validation.ApplicationSubmissionGroup;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-29
 * Time: 04:16
 */
@Entity
public class Financing implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long databaseId;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String applicationNumber;

    @Min(1000)
    private int financingNeeds;

    @Embedded
    @Valid
    @NotNull(groups = ApplicationSubmissionGroup.class)
    private OwnResources ownResources;

    @Embedded
    @Valid
    @NotNull(groups = ApplicationSubmissionGroup.class)
    private PurchaseCosts purchaseCosts;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Loan> loans;

    public Financing(String applicationNumber) {
        this.applicationNumber = applicationNumber;
        this.ownResources = new OwnResources();
        this.purchaseCosts = new PurchaseCosts();
        this.loans = new ArrayList<Loan>(4);
        loans.add(new Loan());
        loans.add(new Loan());
        loans.add(new Loan());
        loans.add(new Loan());
    }

    public Financing() {
        this.ownResources = new OwnResources();
        this.purchaseCosts = new PurchaseCosts();
        this.loans = new ArrayList<Loan>(4);
        loans.add(new Loan());
        loans.add(new Loan());
        loans.add(new Loan());
        loans.add(new Loan());
    }

    public Long getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Long databaseId) {
        this.databaseId = databaseId;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public int getFinancingNeeds() {
        return financingNeeds;
    }

    public void setFinancingNeeds(int financingNeeds) {
        this.financingNeeds = financingNeeds;
    }

    public OwnResources getOwnResources() {
        return ownResources;
    }

    public void setOwnResources(OwnResources ownResources) {
        this.ownResources = ownResources;
    }

    public PurchaseCosts getPurchaseCosts() {
        return purchaseCosts;
    }

    public void setPurchaseCosts(PurchaseCosts purchaseCosts) {
        this.purchaseCosts = purchaseCosts;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}


package com.example.wizeline.mvn.WizelineMvn.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.wizeline.mvn.WizelineMvn.enums.AccountType;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Document("bankAccountCollection")
public class BankAccountDTO {

    @Id
    private long accountNumber;
    private String accountName;
    private String user;
    private double accountBalance;
    private AccountType accountType;
    private String country;
    private boolean accountActive;

    private LocalDateTime creationDate;

    private LocalDateTime lastUsage;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUsage() {
        return LocalDateTime.now();
    }
}
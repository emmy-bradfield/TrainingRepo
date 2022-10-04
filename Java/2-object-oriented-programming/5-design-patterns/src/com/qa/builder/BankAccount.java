package com.qa.builder;

public class BankAccount {
    public static class Builder{

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
    
        public Builder(long accountNumber){
            this.accountNumber = accountNumber;
        }
    
        public Builder owner(String passedOwner){
            this.owner = passedOwner;
        return this;
        }
    
        public Builder branch(String passedBranch){
            this.branch = passedBranch;
        return this;
        }
    
        public Builder balance(double passedBalance){
            this.balance = passedBalance;
        return this;
        }
    
        public Builder interestRate(double passedInterestRate){
            this.interestRate = passedInterestRate;
        return this;
        }
        
        public BankAccount build(){
        BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }
    private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        private BankAccount(){
        }

        public long getAccountNumber(){
            return accountNumber;
        }
        
        public String getOwner(){
            return owner;
        }
        
        public String getBranch(){
            return branch;
        }
        
        public Double getBalance(){
            return balance;
        }
        
        public Double getInterestRate(){
            return interestRate;
        }
        
        public void setAccountNumber(Long accountNumber){
            this.accountNumber = accountNumber;
        }
        
        public void setOwner(String owner){
            this.owner = owner;
        }
        
        public void setBranch(String branch){
            this.branch = branch;
        }
        
        public void setBalance(Double balance){
            this.balance = balance;
        }
        
        public void setInterestRate(Double interestRate){
            this.interestRate = interestRate;
        }
        
    }
package assignment2MA;
public class Account {
    private String accountName;
    private int accountNumber;
    private double accountBalance;

    public Account() {}
    public Account(String accountName, int accountNumber, double accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public String getAccountName() {
        return accountName;
    }
    public boolean setAccountName(String accountName) {
        if (accountName.matches("^[a-zA-Z0-9\\-' ]*$")) {
            this.accountName = accountName;
            return true;
        }
        return false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public boolean setAccountNumber(int accountNumber) {
        if (String.valueOf(accountNumber).length() >= 6) {
            this.accountNumber = accountNumber;
            return true;
        }
        return false;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public boolean setAccountBalance(double value) {
        if (value < 0) return false;
        this.accountBalance = value;
        return true;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;

        int defaultNumber = 0;

        if (accountName == null) {
            if(account.accountName != null) {
                return false;
            }
        } else {
            if(!accountName.equals(account.accountName)) {
                return false;
            }
        }

        if(accountNumber != account.accountNumber && (accountNumber != defaultNumber || account.accountNumber != defaultNumber)) {
            return false;
        }

        if(Math.abs(accountBalance - account.accountBalance) > 0.00001) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account Name: " + accountName + ", Account Number: " + accountNumber + ", Balance: " + accountBalance;
    }
}

package assignment2MA;

import java.util.*;

public class Bank {
    private static final String DEFAULT_NAME = "DefaultBank";
    public static enum BranchLocations {
        BRANCH1, BRANCH2, BRANCH3;
    };

    private String bankName;
    private BranchLocations branchLocation;
    private List<Account> accounts;

    public Bank() {
        this.bankName = DEFAULT_NAME;
        accounts = new ArrayList<>();
    }

    public Bank(String bankName, BranchLocations branchLocation) {
        this.bankName = ensureNameLength(bankName);
        this.branchLocation = branchLocation;
        accounts = new ArrayList<>();
    }

    public Bank(String bankName, String branchLocation) {
        this.bankName = ensureNameLength(bankName);
        try {
            this.branchLocation = BranchLocations.valueOf(branchLocation.toUpperCase());
        } catch (IllegalArgumentException ex) {
            this.branchLocation = null;
        }
        accounts = new ArrayList<>();
    }

    private String ensureNameLength(String name) {
        if (name.length() < 8) {
            return DEFAULT_NAME;
        }
        return name;
    }
    public String getBankName() {
        return bankName;
    }
    public boolean setBankName(String bankName) {
        if (bankName.length() >= 8) {
            this.bankName = bankName;
            return true;
        }
        return false;
    }
    public BranchLocations getBranchLocation() {
        return branchLocation;
    }
    public boolean setBranchLocation(String newBranchLocation) {
        for (BranchLocations location : BranchLocations.values()) {
            if (location.toString().equals(newBranchLocation)) {
                this.branchLocation = location;
                return true;
            }
        }
        return false;
    }

    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return new Account();
    }

    public boolean addAccount(Account account) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == account.getAccountNumber()) {
                return false;
            }
        }
        return accounts.add(account);
    }
    public boolean addAccount(String accountName, int accountNumber, double accountBalance) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return false;
            }
        }
        return accounts.add(new Account(accountName, accountNumber, accountBalance));
    }
    public Account viewAccount(int accountNumber) {
        Account account = getAccountByNumber(accountNumber);
        return account != null ? account : new Account();
    }
    public Account viewAccount(byte index) {
        if (index >= accounts.size() || index < 0) {
            return new Account();
        }
        return accounts.get(index);
    }

    public boolean modifyAccount(int accountNumber, String accountName) {
        Account account = getAccountByNumber(accountNumber);
        if(account != null) {
            account.setAccountName(accountName);
            return true;
        }
        return false;
    }
    public boolean modifyAccount(int accountNumber, double accountBalance) {
        Account account = getAccountByNumber(accountNumber);
        if(account != null) {
            return account.setAccountBalance(accountBalance);
        }
        return false;
    }
    public boolean modifyAccount(int accountNumber, String accountName, double accountBalance) {
        Account account = getAccountByNumber(accountNumber);
        if(account != null) {
            account.setAccountName(accountName);
            account.setAccountBalance(accountBalance);
            return true;
        }
        return false;
    }

    public boolean modifyAccount(byte index, String accountName) {
        Account account = viewAccount(index);
        if(account != null) {
            account.setAccountName(accountName);
            return true;
        }
        return false;
    }
    public boolean modifyAccount(byte index, double accountBalance) {
        Account account = viewAccount(index);
        if(account != null) {
            return account.setAccountBalance(accountBalance);
        }
        return false;
    }
    public boolean modifyAccount(byte index, String accountName, double accountBalance) {
        Account account = viewAccount(index);
        if(account != null) {
            account.setAccountName(accountName);
            account.setAccountBalance(accountBalance);
            return true;
        }
        return false;
    }
    public boolean deleteAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getAccountNumber() == accountNumber) {
                accounts.set(i, new Account());
                accounts.remove(account);
                return true;
            }
        }
        return false;
    }

    public boolean deleteAccount(byte index) {
        if (index >= 0 && index < accounts.size()) {
            accounts.remove(index);
            return true;
        }
        return false;
    }

}

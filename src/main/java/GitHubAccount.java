import java.util.HashMap;
import java.util.Map;

public class GitHubAccount {

    private String userName;
    private String accountName;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String userName, String accountName){
        this.userName = userName;
        this.accountName = accountName;
        this.repositories = new HashMap<String, Repository>();
        this.accountType = AccountType.FREE;
    }


    public String getAccountUserName() {
        return this.userName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }
}

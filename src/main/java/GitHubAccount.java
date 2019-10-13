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

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public int getRepositoryCount() {
        return repositories.size();
    }

    public void addRepositoryToAccount(Repository repository) {
        repositories.put(repository.getRepositoryName(), repository);
    }

    public Repository getAccountRepositoryByName(String repoName){
        return repositories.get(repoName);
    }


    public Repository getRepositoryWithMostCommits() {
        int currentMax = -1;
        Repository returnValue = null;
        for(HashMap.Entry<String, Repository> repository : repositories.entrySet()){
            if(repository.getValue().repositoryCommitCount() > currentMax){
                currentMax = repository.getValue().repositoryCommitCount();
                    returnValue = repository.getValue();
                }
            }
            return returnValue;
        }
    }


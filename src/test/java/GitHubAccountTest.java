import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    public GitHubAccount account1;
    public Repository repository1;
    public Repository repository2;
    public Commit commit1;
    public Commit commit2;
    public Commit commit3;

    @Before
    public void before(){
        account1 = new GitHubAccount("Username 1 Here", "Account name here");
        repository1 = new Repository("Repo 1 name here", "Repo 1 desc here", RepositoryType.PUBLIC);
        repository2 = new Repository("Repo 2 name here", "Repo 2 desc here", RepositoryType.PRIVATE);
        commit1 = new Commit("Commit 1 desc", CommitType.FEATURE, 1);
        commit2 = new Commit("Commit 2 desc", CommitType.FEATURE, 2);
        commit3 = new Commit("Commit 3 desc", CommitType.BUGFIX, 3);
    }

    @Test
    public void canGetAccountUserName(){
        assertEquals("Username 1 Here", account1.getAccountUserName());
    }

    @Test
    public void canGetAccountName(){
        assertEquals("Account name here", account1.getAccountName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals(AccountType.FREE, account1.getAccountType());
    }

    @Test
    public void canSetAccountType(){
        assertEquals(AccountType.FREE, account1.getAccountType());
        account1.setAccountType(AccountType.PRO);
        assertEquals(AccountType.PRO, account1.getAccountType());
    }

    @Test
    public void canAddRepositoryToAccount(){
        assertEquals(0, account1.getRepositoryCount());
        account1.addRepositoryToAccount(repository1);
        assertEquals(1, account1.getRepositoryCount());
        account1.addRepositoryToAccount(repository2);
        assertEquals(2, account1.getRepositoryCount());
    }


}

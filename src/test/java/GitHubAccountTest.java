import org.junit.Before;

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

    
}

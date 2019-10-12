import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    public Repository repository1;
    public Commit commit1;
    public Commit commit2;
    public Commit commit3;


    @Before
    public void before(){
        repository1 = new Repository("Repo 1 name here", "Repo 1 description here", RepositoryType.PUBLIC);
        commit1 = new Commit("commit 1 description", CommitType.FEATURE, 1);
        commit2 = new Commit("commit 2 description", CommitType.FEATURE, 2);
        commit3 = new Commit("commit 3 description", CommitType.BUGFIX, 3);
    }


    @Test
    public void canGetRepositoryName(){
        assertEquals("Repo 1 name here", repository1.getRepositoryName());
    }

    @Test
    public void canGetRepositoryDescription(){
        assertEquals("Repo 1 description here", repository1.getRepositoryDescription());
    }

    @Test
    public void canGetRepositoryType(){
        assertEquals(RepositoryType.PUBLIC, repository1.getRepositorytype());
    }

    @Test
    public void canAddCommitToRepository(){
        assertEquals(0, repository1.repositoryCommitCount());
        repository1.addCommitToRepository(commit1);
        assertEquals(1, repository1.repositoryCommitCount());
        repository1.addCommitToRepository(commit2);
        assertEquals(2, repository1.repositoryCommitCount());
    }

    @Test
    public void canGetRepositoryCommitById(){
        repository1.addCommitToRepository(commit2);
        repository1.addCommitToRepository(commit3);
        Commit commit = repository1.getRepositoryCommitById(2);
        assertEquals(2, commit.getCommitUniqueId());
    }

}

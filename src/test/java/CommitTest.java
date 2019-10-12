import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    public Commit commit;

    @Before
    public void before(){
        commit = new Commit("Commit 1 description here", CommitType.FEATURE, 1);
    }

    @Test
    public void canGetCommitDescription(){
        assertEquals("Commit 1 description here", commit.getCommitDescription());
    }

    @Test
    public void canGetCommitType(){
        assertEquals(CommitType.FEATURE, commit.getCommitType());
    }



}

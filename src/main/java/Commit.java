public class Commit {

    private String description;
    private CommitType commit;
    private int uniqueId;

    public Commit (String description, CommitType commit, int uniqueId ){
        this.description = description;
        this.commit = commit;
        this.uniqueId = uniqueId;
    }


    public String getCommitDescription() {
        return this.description;
    }

    public CommitType getCommitType() {
        return this.commit;
    }

    public int getCommitId() {
        return this.uniqueId;
    }
}

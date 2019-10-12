public class Commit {

    private String description;
    private CommitType commit;
    private int uniqueId;

    public Commit (String description, CommitType commit, int uniqueId ){
        this.description = description;
        this.commit = commit;
        this.uniqueId = uniqueId;
    }
}

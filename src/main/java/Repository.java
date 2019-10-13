import java.util.ArrayList;

public class Repository {

    private String repositoryName;
    private String repositoryDescription;
    private RepositoryType repositoryType;
    private ArrayList<Commit> commits;


public Repository (String repositoryName, String repositoryDescription, RepositoryType repositoryType){
    this.repositoryName = repositoryName;
    this.repositoryDescription = repositoryDescription;
    this.repositoryType = repositoryType;
    this.commits = new ArrayList<Commit>();
}

    public String getRepositoryName() {
    return this.repositoryName;
    }

    public String getRepositoryDescription() {
    return this.repositoryDescription;
    }

    public RepositoryType getRepositorytype() {
    return this.repositoryType;
    }

    public void addCommitToRepository(Commit commit){
    commits.add(commit);
    }

    public int repositoryCommitCount(){
    return commits.size();
    }

    public Commit getRepositoryCommitById(int Id) {
        for (Commit commit : this.commits) {
            if (commit.getCommitUniqueId() == Id) {
                return commit;
            }
        }
        throw new IllegalArgumentException("Id not found");
    }

    public ArrayList<Commit> getAllRepositoryCommitsByType(CommitType type) {
    ArrayList<Commit> returnValue = new ArrayList<Commit>();
    for(Commit commit : this.commits){
        if(commit.getCommitType() == type){
            returnValue.add(commit);
        }
    }
    return returnValue;
    }
}

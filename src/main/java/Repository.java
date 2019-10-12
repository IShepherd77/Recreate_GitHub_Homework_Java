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
}

class GitHubReferenceExecutor {
    public static void main(String[] args) {

        Repository repo = new Repository();
        repo.repoId = 102;
        repo.repoName = "MusicApp";
        repo.owner = "Nilav";
        repo.language = "Node.js";
        repo.stars = 80;
        repo.forks = 20;
        repo.isPrivate = true;
        repo.createdDate = "2025-03-15";

        GitHub github = new GitHub();
        github.repository = repo;
        github.getDetails();
    }
}
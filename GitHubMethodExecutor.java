class GitHubMethodExecutor {
    public static void main(String[] args) {

        Repository repo = new Repository();
        repo.repoId = 101;
        repo.repoName = "TrafficAnalysisApp";
        repo.owner = "Nilav";
        repo.language = "Java";
        repo.stars = 50;
        repo.forks = 10;
        repo.isPrivate = false;
        repo.createdDate = "2025-01-10";

        GitHub github = new GitHub();
        github.addRepository(repo);
        github.getDetails();
    }
}
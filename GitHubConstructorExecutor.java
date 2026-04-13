class GitHubConstructorExecutor {
    public static void main(String[] args) {

        Repository repo = new Repository();
        repo.repoId = 103;
        repo.repoName = "Sleepscope";
        repo.owner = "Nilav";
        repo.language = "Python";
        repo.stars = 120;
        repo.forks = 30;
        repo.isPrivate = false;
        repo.createdDate = "2025-06-01";

        GitHub github = new GitHub(repo);
        github.getDetails();
    }
}
class GitHub {

    Repository repository;

    public boolean addRepository(Repository repository) {
        this.repository = repository;
        return true;
    }

    public GitHub(Repository repository) {
        this.repository = repository;
    }

    public GitHub() {
    }

    public void getDetails() {
        System.out.println(this.repository.repoId);
        System.out.println(this.repository.repoName);
        System.out.println(this.repository.owner);
        System.out.println(this.repository.language);
        System.out.println(this.repository.stars);
        System.out.println(this.repository.forks);
        System.out.println(this.repository.isPrivate);
        System.out.println(this.repository.createdDate);
    }
}
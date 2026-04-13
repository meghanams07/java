class LinkedIn {

    LinkedInProfile profile;

    public boolean createProfile(LinkedInProfile profile) {

        if (profile.getId() > 0 && profile.getName() != null && !profile.getName().isEmpty() &&
            profile.getSkill() != null && !profile.getSkill().isEmpty()) {

            this.profile = profile;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (profile != null) {
            System.out.println(profile.getId());
            System.out.println(profile.getName());
            System.out.println(profile.getSkill());
        }
    }
}
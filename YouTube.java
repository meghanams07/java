class YouTube {
    Channel c;

    public boolean createChannel(Channel c) {
        if (c.getId() > 0 &&
            c.getName() != null && !c.getName().isEmpty() &&
            c.getSubscribers() >= 0) {

            this.c = c;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (c != null) {
            System.out.println(c.getId());
            System.out.println(c.getName());
            System.out.println(c.getSubscribers());
        }
    }
}
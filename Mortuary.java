class Mortuary {

    DeadBody deadBody;

    public boolean addDeadBody(DeadBody deadBody) {
        this.deadBody = deadBody;
        return true;
    }

    public Mortuary(DeadBody deadBody) {
        this.deadBody = deadBody;
    }

    public Mortuary() {
    }

    public void getDetails() {
        System.out.println(this.deadBody.bodyId);
        System.out.println(this.deadBody.name);
        System.out.println(this.deadBody.age);
        System.out.println(this.deadBody.gender);
        System.out.println(this.deadBody.causeOfDeath);
        System.out.println(this.deadBody.dateOfDeath);
        System.out.println(this.deadBody.identificationMark);
        System.out.println(this.deadBody.isIdentified);
    }
}
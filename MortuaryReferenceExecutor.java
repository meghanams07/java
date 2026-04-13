class MortuaryReferenceExecutor {
    public static void main(String[] args) {

        DeadBody db = new DeadBody();
        db.bodyId = 2;
        db.name = "Ravi";
        db.age = 45;
        db.gender = "Male";
        db.causeOfDeath = "Heart Attack";
        db.dateOfDeath = "09-04-2026";
        db.identificationMark = "Tattoo";
        db.isIdentified = true;

        Mortuary mortuary = new Mortuary();
        mortuary.deadBody = db;
        mortuary.getDetails();
    }
}
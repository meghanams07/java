class MortuaryConstructorExecutor {
    public static void main(String[] args) {

        DeadBody db = new DeadBody();
        db.bodyId = 3;
        db.name = "Sita";
        db.age = 60;
        db.gender = "Female";
        db.causeOfDeath = "Natural";
        db.dateOfDeath = "08-04-2026";
        db.identificationMark = "Mole on face";
        db.isIdentified = true;

        Mortuary mortuary = new Mortuary(db);
        mortuary.getDetails();
    }
}
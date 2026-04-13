class MortuaryMethodExecutor {
    public static void main(String[] args) {

        DeadBody db = new DeadBody();
        db.bodyId = 1;
        db.name = "Unknown";
        db.age = 50;
        db.gender = "Male";
        db.causeOfDeath = "Accident";
        db.dateOfDeath = "10-04-2026";
        db.identificationMark = "Scar on hand";
        db.isIdentified = false;

        Mortuary mortuary = new Mortuary();
        mortuary.addDeadBody(db);
        mortuary.getDetails();
    }
}
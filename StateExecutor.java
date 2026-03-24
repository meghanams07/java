class StateExecutor {
    public static void main(String[] args) {

        StateManager manager = new StateManager();

        manager.addHighway("NH 44");
        manager.addHighway("NH 48");
        manager.addHighway("NH 75");
        manager.addHighway("NH 275");
        manager.addHighway("NH 169");
        manager.addHighway("NH 766");
        manager.addHighway("NH 150A");
        manager.addHighway("NH 367");
        manager.addHighway("NH 373");

        manager.getHighways();
    }
}
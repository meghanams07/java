class ArchitectExecutor {
    public static void main(String[] args) {

        ArchitectManager manager = new ArchitectManager();

        manager.addDesign("Modern Design");
        manager.addDesign("Contemporary Design");
        manager.addDesign("Minimalist Design");
        manager.addDesign("Industrial Design");
        manager.addDesign("Scandinavian Design");
        manager.addDesign("Traditional Design");
        manager.addDesign("Bohemian Design");
        manager.addDesign("Rustic Design");
        manager.addDesign("Art Deco Design");
        manager.addDesign("Mid-Century Modern");
        manager.addDesign("Eclectic Design");

        manager.getDesigns();
    }
}
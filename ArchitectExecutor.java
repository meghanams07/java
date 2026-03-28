class ArchitectExecutor {
    public static void main(String[] args) {

        Architect architect = new Architect();

        architect.addInteriorDesign("Modern Design");
        architect.addInteriorDesign("Minimalist Design");
        architect.addInteriorDesign("Contemporary Design");
        architect.addInteriorDesign("Industrial Design");
        architect.addInteriorDesign("Traditional Design");
        architect.addInteriorDesign("Bohemian Design");
        architect.addInteriorDesign("Scandinavian Design");
        architect.addInteriorDesign("Rustic Design");
        architect.addInteriorDesign("Art Deco");
        architect.addInteriorDesign("Vintage Design");
        architect.addInteriorDesign("Eclectic Design");

        architect.getInteriorDesigns();

        System.out.println();

        int index = 4;
        String design = architect.getInteriorDesignByIndex(index);
        if (design != null) {
            System.out.println("The design at index " + index + " is " + design);
        }

        String designName = "Modern Design";
        int i = architect.getIndexByInteriorDesignName(designName);
        System.out.println("The design " + designName + " is at index " + i);
    }
}
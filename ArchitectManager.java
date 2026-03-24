class ArchitectManager {
    private String[] interiorDesignNames = new String[11];
    int index = 0;

    public boolean addDesign(String designName) {
        boolean isAdded = false;

        if (designName != null && !designName.isEmpty()) {
            if (index < interiorDesignNames.length) {
                interiorDesignNames[index] = designName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Design list is full");
            }
        } else {
            System.out.println("Invalid design name");
        }

        return isAdded;
    }

    public void getDesigns() {
        for (String design : interiorDesignNames) {
            if (design != null) {
                System.out.println(design);
            }
        }
    }
}


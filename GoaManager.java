class GoaManager {
    private String[] beachNames = new String[19];
    int index = 0;

    public boolean addBeach(String beachName) {
        boolean isAdded = false;

        if (beachName != null && !beachName.isEmpty()) {
            if (index < beachNames.length) {
                beachNames[index] = beachName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Beach list is full");
            }
        } else {
            System.out.println("Invalid beach name");
        }

        return isAdded;
    }

    public void getBeaches() {
        for (String beach : beachNames) {
            if (beach != null) {
                System.out.println(beach);
            }
        }
    }
}


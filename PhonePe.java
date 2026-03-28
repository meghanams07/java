class PhonePe {
    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String insurance) {
        boolean isAdded = false;

        if (insurance != null && !insurance.isEmpty()) {
            if (index < insuranceNames.length) {
                insuranceNames[index++] = insurance;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(insurance + " is invalid insurance");
        }
        return isAdded;
    }

    public void getInsuranceNames() {
        for (String ins : insuranceNames) {
            if (ins != null) {
                System.out.println(ins);
            }
        }
    }

    public String getInsuranceByIndex(int index) {
        if (index < insuranceNames.length && insuranceNames[index] != null) {
            return insuranceNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByInsuranceName(String insuranceName) {
        for (int i = 0; i < insuranceNames.length; i++) {
            if (insuranceNames[i] != null && insuranceNames[i].equals(insuranceName)) {
                return i;
            }
        }
        System.out.println("invalid insurance " + insuranceName);
        return -1;
    }
}
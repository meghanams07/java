class AadharUser {

    static void register(String num,String name,String gender,String dob,String mobile,String email,String address,String state,String pin){
        System.out.println(num);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(dob);
        System.out.println(mobile);
        System.out.println(email);
        System.out.println(address);
        System.out.println(state);
        System.out.println(pin);
    }

    public static void main(String[] args){
        register("1234 5678 9012","Meghana","Female","06/11/2003","6363845591","meghams6363@gmail.com","Davanagere","Karnataka","577004");
    }
}

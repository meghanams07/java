class PassportUser {

    static void register(String location,String email,boolean emailSame,
                         String name,String password,String auth,String token,String userId){
        System.out.println(location);
        System.out.println(email);
        System.out.println(emailSame);
        System.out.println(name);
        System.out.println(password);
        System.out.println(auth);
        System.out.println(token);
        System.out.println(userId);
    }

    public static void main(String[] args){
        register("5","meghams6363@gmail.com",true,
                "Meghana","meghana@06112003MS",
                "PASSWORD","TOKEN123","4BD22CS080");
    }
}

class PowerExecutor{
public static void main(String[] args){
PowerBank pb1  = new PowerBank("Mi");
PowerBank pb2  = new PowerBank("Mi","PB20000");
PowerBank pb3  = new PowerBank("Mi","PB20000",20000);
PowerBank pb4  = new PowerBank("Mi","PB20000",20000,"Black");
PowerBank pb5  = new PowerBank("Mi","PB20000",20000,"Black",1800);
PowerBank pb6  = new PowerBank("Mi","PB20000",20000,"Black",1800,2);
PowerBank pb7  = new PowerBank("Mi","PB20000",20000,"Black",1800,2,true);
PowerBank pb8  = new PowerBank("Mi","PB20000",20000,"Black",1800,2,true,false);
PowerBank pb9  = new PowerBank("Mi","PB20000",20000,"Black",1800,2,true,false,18);
PowerBank pb10 = new PowerBank("Mi","PB20000",20000,"Black",1800,2,true,false,18,0.45);
PowerBank pb11 = new PowerBank("Mi","PB20000",20000,"Black",1800,2,true,false,18,0.45,true);
PowerBank pb12 = new PowerBank("Mi","PB20000",20000,"Black",1800,2,true,false,18,0.45,true,true);
}
}
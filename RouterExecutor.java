class RouterExecutor{
public static void main(String[] args){
Router r1  = new Router("TP-Link");
Router r2  = new Router("TP-Link","Archer C6");
Router r3  = new Router("TP-Link","Archer C6","Wireless");
Router r4  = new Router("TP-Link","Archer C6","Wireless",1200);
Router r5  = new Router("TP-Link","Archer C6","Wireless",1200,3500);
Router r6  = new Router("TP-Link","Archer C6","Wireless",1200,3500,4);
Router r7  = new Router("TP-Link","Archer C6","Wireless",1200,3500,4,true);
Router r8  = new Router("TP-Link","Archer C6","Wireless",1200,3500,4,true,true);
Router r9  = new Router("TP-Link","Archer C6","Wireless",1200,3500,4,true,true,5);
Router r10 = new Router("TP-Link","Archer C6","Wireless",1200,3500,4,true,true,5,0.7);
Router r11 = new Router("TP-Link","Archer C6","Wireless",1200,3500,4,true,true,5,0.7,true);
Router r12 = new Router("TP-Link","Archer C6","Wireless",1200,3500,4,true,true,5,0.7,true,true);
}
}
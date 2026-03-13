class PrinterExecutor{
public static void main(String[] args){
Printer pr1  = new Printer("HP");
Printer pr2  = new Printer("HP","LaserJet");
Printer pr3  = new Printer("HP","LaserJet","Laser");
Printer pr4  = new Printer("HP","LaserJet","Laser","White");
Printer pr5  = new Printer("HP","LaserJet","Laser","White",15000);
Printer pr6  = new Printer("HP","LaserJet","Laser","White",15000,true);
Printer pr7  = new Printer("HP","LaserJet","Laser","White",15000,true,true);
Printer pr8  = new Printer("HP","LaserJet","Laser","White",15000,true,true,25);
Printer pr9  = new Printer("HP","LaserJet","Laser","White",15000,true,true,25,"USB/WiFi");
Printer pr10 = new Printer("HP","LaserJet","Laser","White",15000,true,true,25,"USB/WiFi",6.5);
Printer pr11 = new Printer("HP","LaserJet","Laser","White",15000,true,true,25,"USB/WiFi",6.5,true);
Printer pr12 = new Printer("HP","LaserJet","Laser","White",15000,true,true,25,"USB/WiFi",6.5,true,true);
}
}
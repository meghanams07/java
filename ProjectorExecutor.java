class ProjectorExecutor{
public static void main(String[] args){
Projector pj1  = new Projector("Epson");
Projector pj2  = new Projector("Epson","EB-X41");
Projector pj3  = new Projector("Epson","EB-X41","LCD");
Projector pj4  = new Projector("Epson","EB-X41","LCD",3600);
Projector pj5  = new Projector("Epson","EB-X41","LCD",3600,"XGA");
Projector pj6  = new Projector("Epson","EB-X41","LCD",3600,"XGA",42000);
Projector pj7  = new Projector("Epson","EB-X41","LCD",3600,"XGA",42000,true);
Projector pj8  = new Projector("Epson","EB-X41","LCD",3600,"XGA",42000,true,true);
Projector pj9  = new Projector("Epson","EB-X41","LCD",3600,"XGA",42000,true,true,12000);
Projector pj10 = new Projector("Epson","EB-X41","LCD",3600,"XGA",42000,true,true,12000,3.5);
Projector pj11 = new Projector("Epson","EB-X41","LCD",3600,"XGA",42000,true,true,12000,3.5,true);
Projector pj12 = new Projector("Epson","EB-X41","LCD",3600,"XGA",42000,true,true,12000,3.5,true,true);
}
}
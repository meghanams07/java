class MonitorExecutor{
public static void main(String[] args){
Monitor mo1  = new Monitor("Dell");
Monitor mo2  = new Monitor("Dell","UltraSharp");
Monitor mo3  = new Monitor("Dell","UltraSharp",27);
Monitor mo4  = new Monitor("Dell","UltraSharp",27,"4K");
Monitor mo5  = new Monitor("Dell","UltraSharp",27,"4K",45000);
Monitor mo6  = new Monitor("Dell","UltraSharp",27,"4K",45000,"IPS");
Monitor mo7  = new Monitor("Dell","UltraSharp",27,"4K",45000,"IPS",144);
Monitor mo8  = new Monitor("Dell","UltraSharp",27,"4K",45000,"IPS",144,true);
Monitor mo9  = new Monitor("Dell","UltraSharp",27,"4K",45000,"IPS",144,true,true);
Monitor mo10 = new Monitor("Dell","UltraSharp",27,"4K",45000,"IPS",144,true,true,6.5);
Monitor mo11 = new Monitor("Dell","UltraSharp",27,"4K",45000,"IPS",144,true,true,6.5,true);
Monitor mo12 = new Monitor("Dell","UltraSharp",27,"4K",45000,"IPS",144,true,true,6.5,true,true);
}
}
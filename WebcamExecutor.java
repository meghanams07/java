class WebcamExecutor {

    public static void main(String[] args) {

        Webcam wc1  = new Webcam("Logitech");
        Webcam wc2  = new Webcam("Logitech","C920");
        Webcam wc3  = new Webcam("Logitech","C920","1080p");
        Webcam wc4  = new Webcam("Logitech","C920","1080p",30);
        Webcam wc5  = new Webcam("Logitech","C920","1080p",30,7500);
        Webcam wc6  = new Webcam("Logitech","C920","1080p",30,7500,true);
        Webcam wc7  = new Webcam("Logitech","C920","1080p",30,7500,true,true);
        Webcam wc8  = new Webcam("Logitech","C920","1080p",30,7500,true,true,"USB");
        Webcam wc9  = new Webcam("Logitech","C920","1080p",30,7500,true,true,"USB",0.18);
        Webcam wc10 = new Webcam("Logitech","C920","1080p",30,7500,true,true,"USB",0.18,true);
        Webcam wc11 = new Webcam("Logitech","C920","1080p",30,7500,true,true,"USB",0.18,true,true);
        Webcam wc12 = new Webcam("Logitech","C920","1080p",30,7500,true,true,"USB",0.18,true,true,true);

    }
}
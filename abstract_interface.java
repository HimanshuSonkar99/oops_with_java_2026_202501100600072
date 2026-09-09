public class abstract_interface {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
        obj.turnOn();
        obj.takePhoto();
        obj.playMusic();
        obj.showBrand();
        obj.cameraInfo();
        obj.musicInfo();
    }
}
//We can not create object of abstract class but we can create reference variable of abstract class. Abstract class 
// cannot be instantiated but can be inherited by other classes.
abstract class Device{
    String brand = "Samsung";
    abstract void turnOn();
    void showBrand(){
        System.out.println("Brand is " + brand);
    } 
}
interface Camera{
    int maxZooom = 10;
    void takePhoto();
    default void cameraInfo(){
        System.out.println("Camera is of " + maxZooom + "x zoom");
    }
}
interface MusicPlayer{
    String Type = "Digital";
    void playMusic();
    default void musicInfo(){
        System.out.println("Music player is available");
    }
}
//child class can inherit only one abstract class but can implement multiple interfaces.
class Smartphone extends Device implements Camera, MusicPlayer{
    //multiple inheritance is not possible in java but we can achieve multiple inheritance using interfaces.
    void turnOn(){
        System.out.println("Smartphone is turned on");
    }
    public void takePhoto(){
        System.out.println("Photo is taken");
    }
    public void playMusic(){
        System.out.println("Music is playing");
    }
}
package calssroom;

public class Constructor {
    int a;
    float b;
    String c;

    Constructor(){
        System.out.println("Default");
    }
    Constructor(int a){
        this.a = a;
    }
    Constructor(int a,float b){
        this.a = a;
        this.b = b;
    }
    Constructor(int a,float b,String c){
        this.a = a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(10);
        System.out.println("inside object2" + "a: " +obj1. a + "b: " +obj1.b + "c: " + obj2.c);
    }
    
}

public class Car {
    String name;
    int milege;
    int max_speed;
    Car(String name, int milege, int max_speed){
        this.name=name;
        this.milege=milege;
        this.max_speed=max_speed;
        System.out.println(name+" "+milege+" "+max_speed);
    }

    public static void main(String[] args) {
        Car obj = new Car("BMW", 10, 200);
    }
}
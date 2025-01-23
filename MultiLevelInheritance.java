import java.util.Scanner;
class Animal{
    void NotHuman(){
        System.out.println("Cannot Talk");
    }
}
class Carnivores extends Animal{
    void food(){
        System.out.println("Non-Vegetarian");
    }
}
class Tiger extends Carnivores{
    void status(){
        System.out.println("National Animal");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Tiger T1 = new Tiger();
        T1.NotHuman();
    }
}
abstract class Animal {
    abstract void sound();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
          Dog d = new Dog();
          d.sound();
          d.sleep();
    }
}

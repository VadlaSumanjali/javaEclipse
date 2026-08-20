package day9;
class AnimalSound {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogSound extends AnimalSound {
    @Override
    void sound() {
        System.out.println("Sound: Bark");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        DogSound d = new DogSound();
        d.sound();
    }
}

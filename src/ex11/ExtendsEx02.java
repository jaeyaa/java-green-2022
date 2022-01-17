package ex11;

class 애완동물 {
    String name;

    void sound() {
    }

    void printName() {

    }

    void changeName(String 애완동물) {

    }

}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }

    void printName() {
        System.out.println(name);
    }

    void changeName(String 송아지) {
        송아지 = "망아지";
        System.out.println(송아지);
    }
}

class 고양이 extends 애완동물 {
    String name = "고양이";

    void sound() {
        System.out.println("야옹");
    }

    void printName() {
        System.out.println(name);
    }

    void changeName(String a) {
        name = a;

        System.out.println(name);
    }

}

public class ExtendsEx02 {

    static void start(애완동물 u1) {
        u1.sound();
        u1.printName();
        u1.changeName("말");

    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이();
        강아지 dog = new 강아지();
        start(cat);
        start(dog);

    }
}

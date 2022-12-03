package Tregulov;

public class Test {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Ferb");
        System.out.println(m1.name);
        m1.eat();
        m1.sleep();
        m1.swim();

        Speakable s1 = new Pingvin("Bork");
        s1.speak();

        Animal a1 = new Lev("Mufasa");
        System.out.println(a1.name);
        a1.eat();
        a1.sleep();

        Mammal m2 = new Lev("Korol");
        System.out.println(m2.name);
        m2.eat();
        m2.sleep();
        m2.run();
        m2.speak();
    }
}

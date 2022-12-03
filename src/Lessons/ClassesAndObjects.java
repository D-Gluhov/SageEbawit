package Lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("Barsik");
        cat.setWeight(0);
        System.out.println(cat.getName());
        System.out.println(cat.getWeight());
    }
}

class Animal {
    private int weight;
    private String name;

    public void setWeight(int animalWeigth) {
        if (animalWeigth <= 0) {
            System.out.println("Cat is dead");
        } else {
            weight = animalWeigth;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String animalName) {
        if (animalName.isEmpty()) {
            System.out.println("Name is void");
        } else {
            name = animalName;
        }
    }
    public String getName() {
        return name;
    }
}
//    public String sentence(String str1, String str2) {
//        return str1 + str2;
//    }
//
//    public boolean cel(int a) {
//        return (a % 2 == 0);
//    }


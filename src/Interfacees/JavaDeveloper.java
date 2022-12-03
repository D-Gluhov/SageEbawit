package Interfacees;

public class JavaDeveloper implements Developer {
    @Override
    public void makeJob() {
        System.out.println("Writing Java code...");
    }

    public void eat(){
        System.out.println("Dev. is eating...");
    }
}



public class Animal {
    protected String name;
    protected int age;
    protected String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }


    public void showDetails() {
        System.out.println("Nume: " + name);
        System.out.println("Varsta: " + age + " ani");
        System.out.println("Tip alimentare: " + type);
    }
}
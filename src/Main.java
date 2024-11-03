//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Ellie", 14,"ierbivor");
        Elephant elephant2 = new Elephant("Ellias",20,"ierbivor");
        Wolf wolf = new Wolf("Wolfie", 7,"carnivor");
        Lion lion = new Lion("Lionel", 10,"carnivor");
        Lion lion2 = new Lion("Lionella", 6,"carnivor");
        Zebra zebra = new Zebra("Zephyr", 23,"ierbivor");

        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.addAnimal(elephant2);
        zoo.addAnimal(wolf);
        zoo.addAnimal(lion);
        zoo.addAnimal(lion2);
        zoo.addAnimal(zebra);



        zoo.ShowAllAnimalsFromZOO();



    }
}
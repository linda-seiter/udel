package pets;

public class Fish {

    //Field declarations
    int age;
    boolean isAggressive;
    String species;

    public static void main(String[] args) {

        // Instantiate 2 Fish objects
        // Each variable stores an object reference
        Fish goldie = new Fish();
        Fish jaws = new Fish();

        //Print initial object state
        System.out.printf("goldie: %s %d %b%n", goldie.species, goldie.age, goldie.isAggressive);
        System.out.printf("jaws: %s %d %b%n", jaws.species, jaws.age, jaws.isAggressive);

        //Update object state
        goldie.age = 15;
        goldie.species = "Goldfish";

        jaws.age = 8;
        jaws.species= "Red Tail Shark";
        jaws.isAggressive = true;

        //Print updated object state
        System.out.printf("goldie: %s %d %b%n", goldie.species, goldie.age, goldie.isAggressive);
        System.out.printf("jaws: %s %d %b%n", jaws.species, jaws.age, jaws.isAggressive);
    }
}
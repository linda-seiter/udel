package pets;

public class Hamster {

    String name;
    float ounces;
    boolean isFriendly;

    public static void main(String[] args) {
        Hamster hamster1 = new Hamster();
        Hamster hamster2 = new Hamster();

        hamster1.name = "Hammie";
        hamster1.ounces = 0.9f;
        hamster1.isFriendly = true;

        hamster2.name = "Nibbles";
        hamster2.ounces = 5.2f;

        Hamster hamster3 = hamster1;
        hamster3.name = "Sweet Hammie";
        hamster3.ounces = 1.2f;

    }
}

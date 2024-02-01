package pets;

public class Dog {

    //Field declarations
    private String name;
    private boolean isWaggingTail, likesBaths;

    //Method declarations
    public void treat(int quantity) { this.isWaggingTail = quantity > 2; }
    public void bathe() {
        this.isWaggingTail = this.likesBaths;
    }
    public void scold() {this.isWaggingTail = false;}

    @Override
    public String toString() {
        return String.format("name:%s wagging:%b likes baths:%b",
                this.name, this.isWaggingTail, this.likesBaths);
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        //Update object fields
        dog1.name = "Bella";
        dog2.name = "Pepper";
        dog2.likesBaths = true;

        //Call instance methods
        System.out.println(dog1);  //calls toString()
        dog1.treat(5); //name:Bella wagging:false likes baths false

        System.out.println(dog1);
        dog1.bathe();
        System.out.println(dog1);

        System.out.println(dog2);
        dog2.bathe();
        System.out.println(dog2);
        dog2.treat(1);
        System.out.println(dog2);
        dog2.treat(3);
        System.out.println(dog2);
    }

}
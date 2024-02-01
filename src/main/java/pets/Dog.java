package pets;

public class Dog {

    //Field declarations
    private String name;
    private boolean isWaggingTail, likesBaths;

    //Method declarations
    public void scold() {this.isWaggingTail = false;}
    public void treat(int quantity) { this.isWaggingTail = quantity > 2; }
    public void bathe() {this.isWaggingTail = this.likesBaths;}

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Bella";
        dog2.name = "Pepper";
        dog2.likesBaths = true;

        //Call instance methods
        dog1.treat(5); //wagging true
        dog1.bathe();  //wagging false
        dog2.bathe();  //wagging true
        dog2.treat(1); //wagging false
        dog2.treat(3); //wagging true
        dog2.scold(); //wagging false
    }
}
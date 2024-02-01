package pets;

public class Cat {

    //Field declarations
    String name;
    boolean isPurring;

    public static void main(String[] args) {

        //How many Cat objects in the heap?
        Cat calico = new Cat();
        Cat tabby = new Cat();
        Cat favorite = calico;

        tabby.name = "Maru";
        calico.name= "Chestnut";
        favorite.isPurring = true;

        //What is printed?
        System.out.println(calico.name + "," + calico.isPurring);
        System.out.println(tabby.name + "," + tabby.isPurring);
        System.out.println(favorite.name + "," + favorite.isPurring);

    }

}
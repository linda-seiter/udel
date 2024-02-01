package oo_warmup;

import java.util.ArrayList;

public class GroceryList {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<String>();
        ArrayList<String> veggieList = new ArrayList<String>();

        fruitList.add("apple");
        fruitList.add("banana");

        veggieList.add("carrot");
        veggieList.add("celery");
        veggieList.add("cucumber");

        System.out.println(fruitList);                    //[apple, banana]
        System.out.println(fruitList.size());             //2
        System.out.println(fruitList.contains("apple"));  //true
        System.out.println(fruitList.indexOf("banana"));  //1
        System.out.println(fruitList.get(0));             //apple

        System.out.println(veggieList);                   //[carrot, celery, cucumber]
        System.out.println(veggieList.size());            //3
        System.out.println(fruitList.contains("apple"));  //false
        System.out.println(veggieList.indexOf("banana")); //-1
        System.out.println(veggieList.get(0));            //carrot

    }
}

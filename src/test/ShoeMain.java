package test;

import static test.Shoe.*;

public class ShoeMain {

    public static void main(String[] args) {
        Shoe[] closet = new Shoe[3];
        Shoe s1 = new Shoe("Nike", "Red");
        Shoe s2 = new Shoe("Puma", "Black");
        Shoe s3 = new Shoe("Adidas", "White");
        Shoe s4 = new Shoe("New Balance", "Silver");
        Shoe s5 = new Shoe("Adidas", "Blue");

        insertNewShoe(closet, s1);
        insertNewShoe(closet, s2);

        insertNewShoe(closet, s3);
        printAllIndexes(closet);
        Shoe[] expandedCloset = expandClosetToASpecificSize(closet, 4);
        insertNewShoe(expandedCloset, s4);
        printAllIndexes(expandedCloset);
        System.out.println("----------updating a slot---------");
        updateIndexToANewShoe(expandedCloset, s2, s5);
        printAllIndexes(expandedCloset);
        String brand = "Nike";
        System.out.println("-------printing out all shoes with " + brand);
        Shoe[] shoesWithAdidas = getAllShoesWithSpecificBrand(expandedCloset, brand);
        printAllIndexes(shoesWithAdidas);
        Shoe[] shoesWithBlue = getAllShoesWithColor(expandedCloset, "Blue");
        printAllIndexes(shoesWithBlue);

    }

}

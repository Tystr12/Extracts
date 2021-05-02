package test;

public class Shoe {
    String brand;
    String color;

    public Shoe() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Shoe(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public static boolean checkForEmptySlot(Shoe[] closet) {
        boolean isSlotEmpty = false;
        for (Shoe shoe : closet) {
            if (shoe == null) {
                isSlotEmpty = true;
                break;
            }
        }
        return isSlotEmpty;
    }

    public static int getEmptySlotIndex(Shoe[] closet) {
        int indexOfEmptySlot = 0;
        if (checkForEmptySlot(closet)) {
            for (int i = 0; i < closet.length; i++) {
                if (closet[i] == null) {
                    indexOfEmptySlot = i;
                }
            }
        }
        return indexOfEmptySlot;
    }

    public static void insertNewShoe(Shoe[] closet, Shoe s) {
        if (checkForEmptySlot(closet)) {
            for (int i = 0; i < closet.length; i++) {
                if (closet[i] == null) {
                    closet[i] = s;
                    break;
                }
            }
        } else {
            Shoe[] expanded = expandClosetToASpecificSize(closet, closet.length + 1);
            insertNewShoe(expanded, s);
        }
    }

    public static Shoe[] expandClosetToASpecificSize(Shoe[] closet, int size) {
        Shoe[] expanded = new Shoe[size];
        for (int i = 0; i < closet.length; i++) {
            expanded[i] = closet[i];
        }
        return expanded;
    }

    public static void printAllIndexes(Shoe[] closet) {
        for (Shoe shoe : closet) {
            System.out.println(shoe);
        }
    }

    public static void removeShoe(Shoe[] collection, Shoe s) {
        if (searchForShoe(collection, s)) {
            int index = getIndexOfShoe(collection, s);
            collection[index] = null;
        }
    }

    public static boolean searchForShoe(Shoe[] collection, Shoe s) {
        boolean shoeIsInCollection = false;
        for (Shoe shoe : collection) {
            if (shoe == s) {
                shoeIsInCollection = true;
                break;
            }
        }
        return shoeIsInCollection;
    }

    public static int getIndexOfShoe(Shoe[] collection, Shoe s) {
        int indexOfShoe = 0;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == s) {
                indexOfShoe = i;
            }
        }
        return indexOfShoe;
    }

    public static void updateIndexToANewShoe(Shoe[] collection, Shoe oldShoe, Shoe newShoe) {
        if (searchForShoe(collection, oldShoe)) {
            removeShoe(collection, oldShoe);
            insertNewShoe(collection, newShoe);
        }
    }

    public static boolean searchForBrand(Shoe[] collection, String brand) {
        boolean hasParameterBrand = false;
        for (Shoe shoe : collection) {
            if (shoe.getBrand().equals(brand)) {
                hasParameterBrand = true;
                break;
            }
        }
        return hasParameterBrand;
    }

    public static Shoe[] getAllShoesWithSpecificBrand(Shoe[] collection, String brand) {
        int size = collection.length;
        Shoe[] sameBrand = new Shoe[size];
        if (searchForBrand(collection, brand)) {
            for (int i = 0; i < collection.length; i++) {
                if (collection[i].getBrand().equals(brand)) {
                    insertNewShoe(sameBrand, getShoeAtIndex(collection, i));
                }
            }
        }
        Shoe[] sameBrandTrim = trimCollectionLength(sameBrand);
        return sameBrandTrim;
    }

    public static Shoe getShoeAtIndex(Shoe[] collection, int index) {
        if (index <= collection.length) {
            return collection[index];
        }
        return null;
    }

    public static Shoe[] trimCollectionLength(Shoe[] collection) {
        int emptySlots = 0;
        int index = 0;
        for (Shoe shoe : collection) {
            if (shoe == null) {
                emptySlots++;
            }
        }
        int newLength = collection.length - emptySlots;
        Shoe[] trimmed = new Shoe[newLength];
        for (Shoe shoe : collection) {
            if (shoe == null) {

            } else {
                trimmed[index] = shoe;
                index++;
            }
        }
        return trimmed;
    }

    public static Shoe[] getAllShoesWithColor(Shoe[] collection, String color) {
        int size = collection.length;
        Shoe[] sameColor = new Shoe[size];
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].getColor().equals(color)) {
                insertNewShoe(sameColor, getShoeAtIndex(collection, i));
            }
        }
        Shoe[] sameColorTrimmed = trimCollectionLength(sameColor);
        return sameColorTrimmed;
    }
}

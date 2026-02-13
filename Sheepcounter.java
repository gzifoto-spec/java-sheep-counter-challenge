package org.main;

public class Sheepcounter {
    static void main() {
        main(null);
    }

    static void main(String[] args) {

        boolean[] list1 = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false, false, true, true};
        boolean[] list2 = {false, false, false};

        System.out.println("=== Test Case 1 ===");
        int sheepCount1 = 0;
        for (int index = 0; index < list1.length; index++){
            sheepCount1 += list1[index] ? 1 : 0;
        }
        System.out.println(sheepCount1 > 0 ? "There are " + sheepCount1 + " sheep in total" : "UPS!!! Wolves have eaten the sheep");

        System.out.println("\n=== Test Case 2 ===");
        int sheepCount2 = 0;
        for (int index = 0; index < list2.length; index++){
            sheepCount2 += list2[index] ? 1 : 0;
        }
        System.out.println(sheepCount2 > 0 ? "There are " + sheepCount2 + " sheep in total" : "UPS!!! Wolves have eaten the sheep");
    }
}
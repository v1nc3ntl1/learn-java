package com.learning;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println(result);
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult= " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result+=2;
        System.out.println(result);
        result *=10;
        System.out.println(result);
        result /= 4;
        System.out.println(result);

        int topscore = 80;
        if (topscore <= 100 && topscore >= 80){
            System.out.println("you have top score!");
        }

        int secondTopScore = 84;
        if ((topscore > 90) || (secondTopScore >= 85)){
            System.out.println("you have high score!");
        }

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;

        if (wasCar)
            System.out.println("wasCar is " +wasCar);
    }
}

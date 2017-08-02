package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int []array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = s.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number is " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number is " + max);

            int five = 5;
            int coun = 0;
            for( int x : array){
                if(five == x){
                    coun++;
                }
            }
        System.out.println(coun);

            Arrays.sort(array);
            for(int x : array){
                System.out.println(x);
            }

            int max1 = 0;

            for (int i = 0; i < array.length; i++) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }

                if (count > max1 && count > 1)
                    max1 = count;
            }
        System.out.println(max1);

        int min1 = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                        }
            }

            if (count > 1 && min == 0) {
                min1 = count;
            }

            else if (count > 1 && count < min){
                min1 = count;
            }
        }
        System.out.println(min1);

        ArrayList<Integer> arrays = new ArrayList<>();
            while (s.hasNextInt()){
                arrays.add(s.nextInt());
            }

            System.out.println(arrays.size());
            }
        }


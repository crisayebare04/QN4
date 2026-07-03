/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Random;

public class Rainfall {

    public static void main(String[] args) {

        Random random = new Random();

        int[] rainfall = new int[30];

        int total = 0;

        int wetDays = 0;

        System.out.println("Daily Rainfall Readings");

        for (int i = 0; i < rainfall.length; i++) {

            rainfall[i] = random.nextInt(61);

            System.out.println("Day " + (i + 1) + ": " + rainfall[i] + " mm");

            total += rainfall[i];

            if (rainfall[i] > 30) {
                wetDays++;
            }
        }

        double average = (double) total / rainfall.length;

        System.out.println();

        System.out.println("Total Rainfall = " + total + " mm");

        System.out.println("Average Rainfall = " + average + " mm");

        System.out.println("Wet Days = " + wetDays);

        if (total <= 300) {

            System.out.println("Classification: Dry");

        } else if (total < 600) {

            System.out.println("Classification: Normal");

        } else {

            System.out.println("Classification: Flood-risk");

        }

    }

}
    

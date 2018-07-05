/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_assignment_1;

/**
 *
 * @author JIN
 */
import java.util.Random;
import java.util.Scanner;

public class RandomWalk {
    
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    public void move(int dx, int dy) {
        // TODO you need to implement this
        x = x + dx;
        y = y + dy;

    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++)
            randomMove();
    }

    private void randomMove() {
        // TODO you need to implement this
        int a = random.nextInt(4);
        if(a == 0) move(1,0);
        if(a == 1) move(-1,0);
        if(a == 2) move(0,1);
        if(a == 3) move(0,-1);
    }

    public double distance() {
        
        // TODO you need to implement this

        double z;
        z = Math.sqrt((x * x) + (y * y));
//        double d;
//        d = Math.sqrt(z);

        return z; // TODO you need to implement this
    }

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] n = new int[6];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            System.out.print("Please enter value of n["+ (i+1) +"]: ");
            n[i] = scan.nextInt();
        }
        System.out.println("===============================================");
        for(int i = 0; i < 6; i++){
            double sum = 0.0;
            double avg;
            for(int p = 0; p < 5; p++){
                RandomWalk walk = new RandomWalk();
                walk.randomWalk(n[i]);
                System.out.println(" Steps: "+ n[i] + "  " + "Distance: " + walk.distance());
                sum = sum + walk.distance();
            }
            avg = sum / 5;
            System.out.println("++++++++++++++++The Average of the distance: "+avg);
        }
    }

  
    
}




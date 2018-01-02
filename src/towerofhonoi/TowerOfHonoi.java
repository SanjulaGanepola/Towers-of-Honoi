/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhonoi;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author 348676487
 */
public class TowerOfHonoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(in);
        //Get intput for how many disks to use
        System.out.println("Enter number of disks:");
        //Output instructions to solve the problem
        moveTower(s.nextInt(), 1, 3);
    }

    public static void moveTower(int height, int start, int finish) {
        //The helper peg
        int intermediate;
        //Height of the disk is 1
        if (height == 1) {
            //Output the instruction
            System.out.println("Move disk " + height + " from " + start + " to " + finish + ".");
        } 
        //Height of the disk is greater than 1
        else {
            //Determine the helper peg
            intermediate = 6 - (start + finish);
            //Move all but one disk from start to intermediate
            moveTower(height - 1, start, intermediate);
            //Output the instruction
            System.out.println("Move disk " + height + " from " + start + " to " + finish + ".");
            //Move the remaining disks from intermediate to finish
            moveTower(height - 1, intermediate, finish);
        }
    }
}

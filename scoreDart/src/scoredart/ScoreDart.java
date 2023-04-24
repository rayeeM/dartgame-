/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoredart;

/**
 *
 * @author ray
 */
public class ScoreDart {
  public static void main(String[] args) {
        // TODO code application logic here
       int x = 0;
        int y = 10;
        int result = score(x, y);
        System.out.println("Score for (" + x + ", " + y + "): " + result);
    }
    public static int score(int x, int y) {
        // Calculate the distance from the origin (0,0) using the formula sqrt(x^2 + y^2)
        double distance = Math.sqrt(x * x + y * y);

        // Check the distance against the radius of each circle to determine the score
        if (distance <= 1) {
            // Inner circle with radius 1
            return 10;
        } else if (distance <= 5) {
            // Middle circle with radius 5
            return 5;
        } else if (distance <= 10) {
            // Outer circle with radius 10
            return 1;
        } else {
            // Outside of the target
            return 0;
        }
    }
}

    /**
     * @param args the command line arguments
     */
  
    


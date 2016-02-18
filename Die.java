import java.util.Random;

public class Die {
    private Random random = new Random();
    private int dieValue, dieFaces;
    
    public Die(int faces) {
        dieFaces = faces;
        dieValue = roll();
        
    }

    public int roll() {
        // TO DO
        // Randomly generate a legitimate roll of the die,
        // set that roll as the face value, and return the
        // roll.
        int myInt = getNumFaces();
        dieValue = random.nextInt(myInt) + 1; 
        return dieValue;
    }

    public int getFaceValue() {
        return dieValue;
    }
    
    public int getNumFaces() {
        // TO DO
        // Return the number of faces on the die.
        return dieFaces;
    }
    
    public String toString() {
        // TO DO
        // Return the string version of the current face value.
        String s = Integer.toString(dieValue);
        return s;
    }
}

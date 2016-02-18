import java.util.Random;

public class Die {
    private Random random = new Random();
    private int dieValue, dieFaces;
    
    public Die(int faces) {
        dieFaces = faces;
        dieValue = roll();
        
    }

    public int roll() {
        int myInt = getNumFaces();
        dieValue = random.nextInt(myInt) + 1; 
        return dieValue;
    }

    public int getFaceValue() {
        return dieValue;
    }
    
    public int getNumFaces() {
        return dieFaces;
    }
    
    public String toString() {
        String s = Integer.toString(dieValue);
        return s;
    }
}

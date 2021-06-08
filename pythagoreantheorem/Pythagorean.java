import java.util.*;
public class Pythagorean {
    public Double calculateHypotenuse(int legA, int legB) {
        Double hypot = Math.sqrt((legA * legA) + (legB * legB));
        return hypot;
    }
}
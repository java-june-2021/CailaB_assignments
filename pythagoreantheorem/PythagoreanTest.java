public class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean iD = new Pythagorean();
        Double hypot = iD.calculateHypotenuse(2, 16);
        System.out.println("The Hypotenuse is " + hypot);
    }
}
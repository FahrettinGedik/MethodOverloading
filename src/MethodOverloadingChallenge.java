public class MethodOverloadingChallenge {

    public static void main(String[] args) {

        System.out.println("68 inches = " + convertToCentimeters(68) + " centimeters");
        System.out.println("5 feet, 8 inches = " + convertToCentimeters(5, 8) + " centimeters");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        double result;
        result = feet * 30.48 + inches * 2.54;
        return result;
    }
}

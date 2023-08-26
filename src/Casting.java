public class Casting {
    public static void main(String[] args) {
        // En un ano ubique 30 perritos en hogares, cunatos ubique al mes

        double montlyDogs = 30.0/12.0;
        System.out.println(montlyDogs);

        // ESTIMACION
        int estimatedMonthlyDogs = (int) montlyDogs;
        System.out.println(estimatedMonthlyDogs);
    }
}
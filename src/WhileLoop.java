public class WhileLoop {
    static  boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int count = 1;
        while (isTurnOnLight && count <= 10) {
            printSOS();
            count++;
        }
    }
    public static void printSOS() {
        System.out.println("... ___ ...");
    }

    public static  boolean turnOnOffLight() {
        isTurnOnLight = !isTurnOnLight;
        return isTurnOnLight;
    }
}

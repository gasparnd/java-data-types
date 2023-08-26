public class ForLoop {
    static  boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        for (int i = 0; i <= 10; i++) {
            if(i ==  5) {
                break;
            }
            printSOS();
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

public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println("a = b? -> " + (a == b));

        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Light mode selected");
                break;
            case "Night":
                System.out.println("Dark mode selected");
                break;
            case "Blue Dark":
                System.out.println("Blue Dark mode selected");
                break;
            case "Dark":
                System.out.println("Dark mode selected");
                break;
            default:
                System.out.println(":P");
                break;
        }
    }
}

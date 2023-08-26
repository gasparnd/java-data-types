public class MathOperations {
    public static void main(String[] args) {
        var x = 2.1;
        var y = 3;

        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.pow(x, y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.sqrt(y));
        System.out.println(Math.PI * Math.pow(y, 2));
        System.out.println(4 * Math.PI * Math.pow(y, 2));
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}

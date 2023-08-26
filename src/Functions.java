public class Functions {
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);
        System.out.println(converToDolar(1000, "MXN"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * This function convert to dollar a specific currency
     *
     * @param quantity Amount of money
     * @param currency Type of currency (Only accept MXN or COP)
     * @return quantity (Amount updated of dollars)
     * */
    public static  double converToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17]; // Definimos el array de stirngs con un tamaño de 17
        String days[] = new String[7];

        String[][] cities = new String[4][2]; // 4 * 2 = 8

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        // Una dimension
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i <= androidVersions.length - 1; i++) {
            String version = androidVersions[i];
            if(version != null) {
                System.out.println(androidVersions[i]);
            }
        }


        System.out.println();

        for (String androidVersion: androidVersions) {
            if (androidVersion != null) {
                System.out.println(androidVersion);
            }
        }

        System.out.println();

        /*
          ____________________________
          |Country    |  City        |
          |-----------|--------------|
        *3|Mexico     |  CDMX        |
        *2|Mexico     |  Guadalajara |
        *1|Colombia   |  Bogota      |
        *0|Colombia   |  Medellin    |
        * |___________|______________|
            0               1
        * */
        //Dos dimensiones
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println();

        for (String[] pair: cities) {
            for (String name: pair) {
                System.out.println(name);
            }
        }

        // Cuantro dimensiones
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println();
//        System.out.println(animals[1][0][0][1]);
//        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }

        }
    }
}

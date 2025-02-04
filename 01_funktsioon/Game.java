import java.util.Scanner;

public class Game {
    // main --> pakub
    public static void main(String[] args) {
        // sout --> pakub
        System.out.println("Hello World");
        // String -- sõnaline muutuja
        // char -- üks täht
        // int -- täiskohaline number 2.1mlj
        // double -- 15kohaline komaga number
        // float -- 7kohaline komaga number
        // byte -- 128 kohta
        // short -- 32000 kohta
        // Long -- 9,223,372,036,854,775,897
        // boolean -- kahendväärtus true/false
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() -- 0 .. 0.9999 - 0 ... 4.9999 -- 0..2 .. 1..3
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        System.out.println(playerCoordinateX);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX =  generateRandomCoordinate(worldWidth);

        printMap(worldHeight,worldWidth,playerCoordinateY,playerCoordinateX,enemyCoordinateY,enemyCoordinateX);
        // klasside tegemine
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            // erineb if'ist - kontrollib yhte muutujat mingite väärtuste vastu
            switch (input) {
                case "a":
                    playerCoordinateX--;
                     break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }
            printMap(worldHeight,worldWidth,playerCoordinateY,playerCoordinateX,enemyCoordinateY,enemyCoordinateX);
            input = scanner.nextLine();
        }
    }
    //funktsioonid, int -- sama tüüp, mis peab olema funktsiooni  sees return järgi
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public static void printMap(int worldHeight, int worldWidth,
                                int playerCoordinateY, int playerCoordinateX,
                                int enemyCoordinateY, int enemyCoordinateX) {
        // fori --> pakub
        char symbol; //deklareerib ük kord muutuja, mitte iga kord deklareerib selle muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if(playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if(enemyCoordinateY == y && enemyCoordinateX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

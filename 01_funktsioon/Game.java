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
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

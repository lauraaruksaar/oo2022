import java.util.List;

public class World_06 {
    int height;
    int width;
    List<Item> items;


    public World_06(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordinateX) {
        // fori --> pakub
        char symbol; //deklareerib ük kord muutuja, mitte iga kord deklareerib selle muutuja
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height -1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == width -1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).coordinateY == y && items.get(i).coordinateX == x) {
                        symbol = 'I';
                        break;
                    }
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
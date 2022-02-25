public class Player2 {
    int coordinateY;
    int coordinateX;
    Direction2 direction = Direction2.UP;
    Item item;

    //Constructor
    public Player2(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction2.UP;
    }

    public void addItem(Item item) {
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        // erineb if'ist - kontrollib yhte muutujat mingite väärtuste vastu
        switch (input) {
            case "a":
                direction = Direction2.LEFT;
                break;
            case "s":
                direction = Direction2.DOWN;
                break;
            case "d":
                direction = Direction2.RIGHT;
                break;
            case "w":
                direction = Direction2.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (coordinateX > 1) {
                    coordinateX--;
                }
                break;
            case DOWN:
                if (coordinateY < worldHeight-2) {
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateX < worldWidth-2) {
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateY > 1) {
                    coordinateY--;
                }
                break;
                /*if(direction == Direction.LEFT) {
                playerCoordinateX--;
            } else if (direction == Direction.DOWN) {
                playerCoordinateY++;
            } else if (direction == Direction.RIGHT) {
                playerCoordinateX++;
            } else if (direction == Direction.UP) {
                playerCoordinateY--;
            }*/
        }

    }
}
// Kus teha klasse- tellimuse (id, toode, kasutaja, aeg), kasutaja(frontendis registreerumise järgselt, ühe toote, kategooria
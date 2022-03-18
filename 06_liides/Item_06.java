public class Item_06 implements WorldObject {
    int coordinateY;
    int coordinateX;
    double strenght;
    ItemType itemType;

    //constructor
    public Item_06(int worldHeight, int worldWidth, ItemType itemType) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.itemType = itemType;
        determineStrenght(itemType);
    }

    private void determineStrenght(ItemType itemType) {
        switch (itemType) {
            case SWORD:
                this.strenght = 3;
                break;
            case HAMMER:
                this.strenght = 2;
                break;
            case DAGGER:
                this.strenght = 1;
                break;
        }
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}

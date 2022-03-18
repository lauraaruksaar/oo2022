public class Enemy_06 implements WorldObject {
    // (muutja aktiivne) parem klõps -> refactor -> rename
    int coordinateY;
    int coordinateX;
    // new Enemy(1,6)
    public Enemy_06(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX =  generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}

import java.util.Scanner;
// parem klõps -> reftactor -> rename
public class Game2 {
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

        // Math.random() -- 0 .. 0.9999 - 0 ... 4.9999 -- 0..2 .. 1..3

        World world = new World(5,10);
        Player mangja1 = new Player(world.worldHeight,world.worldWidth);
        Player mangja2 = new Player(world.worldHeight, world.worldWidth);

        //uue instatsi loomine --- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused mis on defineeritud klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangja1.coordinateY,mangja1.coordinateX
                ,vaenlane1.coordinateY,vaenlane1.coordinateX);
        // klasside tegemine
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")) {
           mangja1.movePlayer(input,world.worldHeight,world.worldWidth);
            world.printMap(mangja1.coordinateY,
                    mangja1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }
}

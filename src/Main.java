import utils.Utils;

import javax.rmi.CORBA.Util;

public class Main {

    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.gameLoop();
//        System.out.println(Utils.readTextFile("resources/Map/MAP TLU.json"));
    }
}

package battleships;

import java.util.LinkedList;

public class BattleshipsImpl implements Battleships {

    private Player player1;
    private Player player2;

    public BattleshipsImpl() throws AllShipsAlreadyPlacedException, ShipsOverlapException, OutOfFieldException {
        player1 = new Player("Laura");
        player2 = new Player("Max");
        placeShips(player1.name, player1.getShipsList());
        placeShips(player2.name, player2.getShipsList());
    }

    @Override
    public void placeShips(String username, LinkedList<Ships> ships) throws AllShipsAlreadyPlacedException, ShipsOverlapException, OutOfFieldException {
        if (ships.isEmpty()) {
            throw new AllShipsAlreadyPlacedException("! Alle Schiffe wurden bereits gesetzt !");
        }

        for (Ships ship : ships) {
            placeShip(username, ship);
        }
    }

    private void placeShip(String userName, Ships ship) throws OutOfFieldException, ShipsOverlapException{

    }

    @Override
    public boolean shoot(String userName, Position pos) throws OutOfFieldException {
        return false;
    }
}

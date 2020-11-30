package battleships;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsageTest {

    private Battleships getBattleships() throws AllShipsAlreadyPlacedException, ShipsOverlapException, OutOfFieldException {
        return new BattleshipsImpl();
    }

    private Player getPlayer() {
        return new Player("Mustermann");
    }

    @Test
    public void testPlaceShips() throws AllShipsAlreadyPlacedException, OutOfFieldException, ShipsOverlapException {
        Battleships battleships = getBattleships();
        Player player = getPlayer();

        battleships.placeShips(player.name, player.getShipsList());
    }

    @Test
    public void testPlaceShipsMargin() throws AllShipsAlreadyPlacedException, OutOfFieldException, ShipsOverlapException {
        Battleships battleships = getBattleships();
        Player player = getPlayer();

        battleships.placeShips(player.name, player.getShipsList());
    }

    @Test(expected = OutOfFieldException.class)
    public void testPlaceShipsOutOfField() throws AllShipsAlreadyPlacedException, OutOfFieldException, ShipsOverlapException {
        Battleships battleships = getBattleships();
        Player player = getPlayer();

        battleships.placeShips(player.name, player.getShipsList());
    }

    @Test(expected = AllShipsAlreadyPlacedException.class)
    public void testPlaceShipsAllShipsPlaced() throws AllShipsAlreadyPlacedException, OutOfFieldException, ShipsOverlapException {
        Battleships battleships = getBattleships();
        Player player = getPlayer();

        battleships.placeShips(player.name, player.getShipsList());
    }

    @Test(expected = ShipsOverlapException.class)
    public void testPlaceShipsOverlap() throws AllShipsAlreadyPlacedException, OutOfFieldException, ShipsOverlapException {
        Battleships battleships = getBattleships();
        Player player = getPlayer();

        battleships.placeShips(player.name, player.getShipsList());
    }

    @Test
    public void testShootHit() throws OutOfFieldException, ShipsOverlapException, AllShipsAlreadyPlacedException {
        Battleships battleships = this.getBattleships();
        Player player = getPlayer();

        int x = 1;
        char y = 'A';
        Position pos = new Position(x, y);

        assertEquals(1, pos.getX());
        assertEquals('A', pos.getY());

        battleships.placeShips(player.name, player.getShipsList());

        boolean hit = battleships.shoot("Laura", pos);
        assertTrue(hit);
    }

    @Test
    public void testShootMiss() throws OutOfFieldException, ShipsOverlapException, AllShipsAlreadyPlacedException {
        Battleships battleships = this.getBattleships();
        Player player = getPlayer();

        int x = 2;
        char y = 'A';
        Position pos = new Position(x, y);

        assertEquals(2, pos.getX());
        assertEquals('A', pos.getY());

        boolean miss = battleships.shoot("Laura", pos);
        assertFalse(miss);
    }

    @Test
    public void testShootMargin() throws OutOfFieldException, ShipsOverlapException, AllShipsAlreadyPlacedException {
        Battleships battleships = this.getBattleships();
        Player player = getPlayer();

        int x = 1;
        char y = 'A';
        Position pos1 = new Position(x, y);
        x = 10;
        y = 'J';
        Position pos2 = new Position(x, y);

        assertEquals(1, pos1.getX());
        assertEquals('A', pos1.getY());
        assertEquals(10, pos2.getX());
        assertEquals('J', pos2.getY());

        battleships.shoot("Laura", pos1);
        battleships.shoot("Laura", pos2);
    }

    @Test(expected = OutOfFieldException.class)
    public void testShootOutOfField() throws OutOfFieldException, ShipsOverlapException, AllShipsAlreadyPlacedException {
        Battleships battleships = this.getBattleships();
        Player player = getPlayer();

        int x = 100;
        char y = 'Z';
        Position pos = new Position(x, y);

        assertEquals(100, pos.getX());
        assertEquals('Z', pos.getY());

        battleships.shoot("Laura", pos);
    }
}

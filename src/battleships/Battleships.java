package battleships;

import java.util.LinkedList;

public interface Battleships {

    /**
     * Phase, in der ein Spieler alle seine Boote auf dem Spielfeld setzt.
     * @param ships Liste der Schiffe, die gesetzt werden müssen
     * @throws AllShipsAlreadyPlacedException wenn alle Boote bereits gesetzt worden sind
     * @throws OutOfFieldException wenn ein Schiff so gesetzt wurde, dass nicht komplett in dem Spielfeld liegt
     */
    void placeShips(String username, LinkedList<Ships> ships) throws AllShipsAlreadyPlacedException, OutOfFieldException, ShipsOverlapException;

    /**
     * Ein User schießt auf eine Position in dem Spielfeld
     * @param userName der Name des Users, der schießt
     * @param pos die Position, auf die geschossen wird
     * @return true, wenn ein Schiff getroffen wurde, sonst false
     * @throws OutOfFieldException wenn die Position ausserhalb des Spielfeldes ist
     */
    boolean shoot(String userName, Position pos) throws OutOfFieldException;
}

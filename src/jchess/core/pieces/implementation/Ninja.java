
package jchess.core.pieces.implementation;

import jchess.core.pieces.Piece;
import jchess.core.Chessboard;
import jchess.core.Player;
import jchess.core.pieces.traits.behaviors.implementation.NinjaBehavior;

/**
 * Class to represent a chess pawn Ninja
 * Ninja can't move across the chessboard
 *
|_|_|_|_|_|_|_|_|7
|_|_|_|_|_|_|_|_|6
|_|_|_|_|_ |_|_|_|5
|_|_|X|_|X|_|_|_|4
|_|_|_|B|_|_|_|_|3
|_| |X|_|X|_|_|_|2
|_|_|_|_|_|_|_|_|1
|_|_|_|_|_|_|_|_|0
0 1 2 3 4 5 6 7
 */
public class Ninja extends Piece
{
    protected static final short value = 3;

    public Ninja(Chessboard chessboard, Player player)
    {
        super(chessboard, player); //call initializer of super type: Piece
        this.symbol = "N";
        this.addBehavior(new NinjaBehavior(this));
    }
}


package jchess.core.pieces.traits.behaviors.implementation;

import java.util.HashSet;
import java.util.Set;

import jchess.core.Square;
import jchess.core.pieces.Piece;



public class NinjaBehavior extends LongRangePieceBehavior
{
    
    public NinjaBehavior(Piece piece)
    {
        super(piece);
    }
    
    /**
     *  Annotation to superclass Piece changing pawns location
     * @return  ArrayList with new position of piece
     */
    @Override
    public Set<Square> getSquaresInRange()
    {
        Set<Square> list   = new HashSet<>();
        Square[][] squares = piece.getChessboard().getSquares();
        
        int pozX = piece.getSquare().getPozX();
        int pozY = piece.getSquare().getPozY();
        
        int[][] squaresInRange = {
            {pozX +1, pozY + 1}, //1
            {pozX - 1, pozY + 1}, //2
            {pozX +1, pozY -1}, //3
            {pozX +-1, pozY - 1}, //4

        };
        
        for(int[] squareCoordinates : squaresInRange)
        {
            int x = squareCoordinates[0];
            int y = squareCoordinates[1];
            if (!piece.isOut(x, y))
            {
                list.add(squares[x][y]);
            }
        }
		return list;
    }
    
}
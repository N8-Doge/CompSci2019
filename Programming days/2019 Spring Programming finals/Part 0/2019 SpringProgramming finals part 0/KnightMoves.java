import java.util.*;

public class KnightMoves
{
    private ChessLocation loc;

    public KnightMoves(ChessLocation cl)
    {
        loc = cl;
    }
/*
 *   precondition: ChessLocation is a valid
 *   
 *   returns a value greater tahn or equal to 0 which represents
 *           the minimum number of moves for the knight to move from its curernt location to destination
 */
    public int minimumNumMovesTo(ChessLocation destination)
    {
       return (int)(Math.random()*999);
    }

    public static ChessLocation forwardTwoThenRight(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation forwardTwoThenLeft(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation forwardOneThenRightTwo(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation forwardOneThenLeftTwo(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardTwoThenRight(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardTwoThenLeft(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardOneThenRightTwo(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardOneThenLeftTwo(ChessLocation chLoc)
    {
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }
}
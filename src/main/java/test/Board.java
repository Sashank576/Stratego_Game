package test;

import test.figures.Piece;


public class Board
{
    public static final int NUMBER_OF_ROWS = 10;
    private final Tile[][] boardTiles = new Tile[NUMBER_OF_ROWS][NUMBER_OF_ROWS];

    public void putTileAt(int row, int column, Tile tile)
    {
        this.boardTiles[NUMBER_OF_ROWS - row][column - 1] = tile;
    }


    public Tile getTileAt(final int row, final int column)
    {
        try
        {
            return this.boardTiles[NUMBER_OF_ROWS - row][column - 1];
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public Piece getFigureAt(final int row, final int column)
    {
        try
        {
            //return piece
            return null;
        }
        catch (Exception e)
        {

            return null;
        }
    }

    public Tile putFigureAtTile(int row, int column, Piece piece)
    {
        //set it
        this.boardTiles[NUMBER_OF_ROWS - row][column - 1].setFigure(piece);
        return this.boardTiles[NUMBER_OF_ROWS - row][column - 1];
    }



}

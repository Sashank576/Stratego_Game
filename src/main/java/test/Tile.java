package test;


import javafx.scene.shape.Rectangle;
import test.figures.Piece;


public class Tile
{
    private final String name;
    public static final int TILE_SIZE = 60;
    public static final int NUMBER_OF_ROWS = 10;

    private final int row;
    private final int column;

    private final Rectangle rectangle;

    private Piece piece;

    public Tile(String name, int row, int column)
    {
        this.name = name;
        this.row = row;
        this.column = column;

        this.rectangle = new Rectangle(column * TILE_SIZE - TILE_SIZE, NUMBER_OF_ROWS * TILE_SIZE - (row * TILE_SIZE), TILE_SIZE, TILE_SIZE);
    }

    public String getName()
    {
        return name;
    }

    public int getRow()
    {
        return this.row;
    }

    public int getColumn()
    {
        return this.column;
    }

    public Piece getFigure()
    {
        return this.piece;
    }

    public void setFigure(Piece piece)
    {
        this.piece = piece;
    }

    
    public String toString()
    {
        return "Tile{" +
                "name='" + name + '\'' +
                ", row=" + row +
                ", column=" + column +
                ", rectangle=" + rectangle +
                ", chessPiece=" + piece +
                '}';
    }
}

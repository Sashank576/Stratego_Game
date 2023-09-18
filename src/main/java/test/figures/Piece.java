package test.figures;

import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import test.Tile;

public abstract class Piece
{
    private Tile tile;
    private Side side;

    private Rectangle rectangle;
    private Image image;

    private double lastX;
    private double lastY;

    protected Piece(final Side side, final Tile position, final String imageUrl)
    {



    }

    private void setupDragEvents(Piece chessPiece)
    {

    }

    public Rectangle getRectangle()
    {
        return this.rectangle;
    }

    public Image getImage()
    {
        return image;
    }

    public Side getSide()
    {
        return side;
    }

    public Tile getTile()
    {
        return this.tile;
    }

    public void moveTo(Tile newTile)
    {

    }

    protected abstract boolean canMoveTo(Tile tile);


    @Override
    public String toString()
    {
        return "Piece{" +
                "side=" + side +
                ", rectangle=" + rectangle +
                ", image=" + image +
                ", lastX=" + lastX +
                ", lastY=" + lastY +
                '}';
    }
}

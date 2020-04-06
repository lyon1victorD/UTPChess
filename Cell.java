/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author victordaumas
 */
public class Cell
{
    private boolean isEmpty;
    
    private Piece piece;
    
    private int posX;
    private int posY;

    public void changeState()
    {
        isEmpty = !isEmpty;
    }

    public boolean getIsEmpty()
    {
        return isEmpty;
    }

    public void setEmpty(boolean empty)
    {
        isEmpty = empty;
    }

    public Piece getPiece()
    {
        return piece;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }

    public int getPosX()
    {
        return posX;
    }

    public void setPosX(int posX)
    {
        this.posX = posX;
    }

    public int getPosY()
    {
        return posY;
    }

    public void setPosY(int posY)
    {
        this.posY = posY;
    }
}

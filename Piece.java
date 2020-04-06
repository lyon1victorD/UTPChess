/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Observable;

/**
 *
 * @author victordaumas
 */
public abstract class Piece extends Observable
{
    protected Player player;
    
    protected Cell cell;
    
    protected boolean isTaken;
    
    public abstract boolean move(Cell destination);

    public void attack(Cell destination)
    {
        destination.getPiece().setCell(null);
        destination.setPiece(this);
        this.cell.changeState();
        this.cell.setPiece(null);
        this.cell = destination;
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public Cell getCell()
    {
        return cell;
    }

    public void setCell(Cell cell)
    {
        this.cell = cell;
    }

    public boolean isTaken()
    {
        return isTaken;
    }

    public void setTaken(boolean taken)
    {
        isTaken = taken;
    }
}

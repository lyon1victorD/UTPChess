/**
 * @author Victor DAUMAS
 */
public class Pawn extends Piece
{
    private boolean isfirstMoveDone = false;

    @Override
    public boolean move(Cell destination)
    {
        int tempY = destination.getPosY()-this.cell.getPosY();
        int tempX = destination.getPosX()-this.cell.getPosX();

        if (!isfirstMoveDone && destination.getIsEmpty())
        {
            if (tempY == 0 && tempX <= 2)
            {
                this.cell.changeState();
                this.cell = destination;
                destination.changeState();
                isfirstMoveDone = !isfirstMoveDone;
                return true;
            }
        }
        else
        {
            if (!destination.getIsEmpty() || tempX > 1 || tempY != 0)
            {
                System.out.println("Move impossible");
                return false;
            }
            if (destination.getIsEmpty() && tempX == 1 && tempY == 0)
            {
                this.cell.changeState();
                this.cell = destination;
                destination.changeState();
                return true;
            }
            if(!destination.getIsEmpty() && (tempY ==  1 || tempY == -1))
            {
                this.attack(destination);
            }
        }
        System.out.println("Something went wrong, move was not done");
        return false;
    }
}

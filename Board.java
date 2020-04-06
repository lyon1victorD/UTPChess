/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author victordaumas
 */
public class Board extends Observable
{
    private Player player_one;
    private Player player_two;
    
    private ArrayList<Piece> blackPieceList;
    private ArrayList<Piece> whitePieceList;
    
    private ArrayList<Cell> cellList;
}

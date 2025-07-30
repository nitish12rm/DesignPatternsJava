package LLD.TicTacToe.Model.Player;

import LLD.TicTacToe.Model.Piece.PieceType;
import LLD.TicTacToe.Model.Piece.PlayingPiece;

public class Player {
    /// name and playing piece-- getter and setter
    public String name;
    public PlayingPiece playingPiece;
    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    /// NAME
    public void setPlayerName(String name){
        this.name = name;
    }
    public String getPlayerName(){
        return  this.name;
    }
    /// PLAYING PIECE
    public void setPieceType(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
    public PlayingPiece getPieceType() {
       return this.playingPiece ;
    }

}

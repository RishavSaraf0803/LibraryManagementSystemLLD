package Chess;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
//Queue is a Interface
public class Chess extends BoardGame {
	
	private final ChessPlayer player1, player2;
    private final ChessBoard chessBoard;
	
	public Chess(ChessBoard chessBoard, ChessPlayer player1, ChessPlayer player2) {
		super(chessBoard, new ArrayDeque<Player>(Arrays.asList(player1,player2)));
		this.player1 = player1;
		this.player2 = player2;
		this.chessBoard = chessBoard;
	}


	@Override
	public boolean isOver() {
		// TODO Auto-generated method stub
		return player1.getPiece(PieceName.KING).isDead() || player2.getPiece(PieceName.KING).isDead();
	}
	

}

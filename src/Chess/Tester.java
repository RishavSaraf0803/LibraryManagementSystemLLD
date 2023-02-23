package Chess;

import java.util.HashMap;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessBoard chessBoard = new ChessBoard();
		ChessPlayer firstPlayer = new HumanChessPlayer("Vivek", getPieces(Color.WHITE), chessBoard);

		ChessPlayer secondPlayer = new HumanChessPlayer("Rishav",getPieces(Color.BLACK), chessBoard);
		
		BoardGame chessBoardGame = new Chess(chessBoard,  firstPlayer, secondPlayer);
		chessBoardGame.startGame();

	}
	private static Map<PieceName, ChessPiece> getPieces(Color color){
		
		Map<PieceName, ChessPiece> map = new HashMap<>();
		map.put(PieceName.BISHOP1, new Bishop(PieceName.BISHOP1,color, false));

		map.put(PieceName.BISHOP2, new Bishop(PieceName.BISHOP2,color, false));
		
		map.put(PieceName.KNIGHT1, new Bishop(PieceName.KNIGHT1,color, false));

		map.put(PieceName.KNIGHT2, new Bishop(PieceName.KNIGHT2,color, false));
		
		map.put(PieceName.ROOK1, new Bishop(PieceName.ROOK1,color, false));

		map.put(PieceName.ROOK2, new Bishop(PieceName.ROOK2,color, false));
		
		map.put(PieceName.KING, new Bishop(PieceName.KING, color, false));

		map.put(PieceName.QUEEN, new Bishop(PieceName.QUEEN ,color, false));

		map.put(PieceName.PAWN1, new Bishop(PieceName.PAWN1,color, false));
		map.put(PieceName.PAWN2, new Bishop(PieceName.PAWN2,color, false));
		map.put(PieceName.PAWN3, new Bishop(PieceName.PAWN3,color, false));
		map.put(PieceName.PAWN4, new Bishop(PieceName.PAWN4,color, false));
		map.put(PieceName.PAWN5, new Bishop(PieceName.PAWN5,color, false));
		map.put(PieceName.PAWN6, new Bishop(PieceName.PAWN6,color, false));
		map.put(PieceName.PAWN7, new Bishop(PieceName.PAWN7,color, false));
		map.put(PieceName.PAWN8, new Bishop(PieceName.PAWN8,color, false));
		return map; 

		
		
	}

}

package Chess;

public class Pawn implements ChessPiece{
	

	private final PieceName pieceName;
	private final Color color;
	private  boolean isDead;

	

	public Pawn(PieceName pieceName, Color color, boolean isDead) {
		super();
		this.pieceName = pieceName;
		this.color = color;
		this.isDead = isDead;
	}

	public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {
		// TODO Auto-generated method stub
		return;
	}

	//@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return this.isDead;
	}
 
	//@Override
	public void setDead(boolean isDead) {
		// TODO Auto-generated method stub
		  this.isDead = isDead;
		
	}

	//@Override
	public PieceName getName() {
		// TODO Auto-generated method stub
		return this.pieceName;
	}

}

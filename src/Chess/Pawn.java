package Chess;

public class Pawn implements ChessPiece{
	
	private final Color color;
	private final PieceName name;
	private  boolean isDead;
	

	public Pawn(Color color, PieceName name, boolean isDead) {
		super();
		this.color = color;
		this.name = name;
		this.isDead = isDead;
	}

	public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {
		// TODO Auto-generated method stub
		return;
	}

	//@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return isDead;
	}
 
	//@Override
	public void setDead(boolean isDead) {
		// TODO Auto-generated method stub
		  isDead = isDead;
		
	}

	//@Override
	public PieceName getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}

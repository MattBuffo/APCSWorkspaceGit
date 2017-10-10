
public class player {
	private boolean computer;
	private int playerScore;
	private int roundScore;
	/**
	 * Constructs a new player object with the player score and round score zero and computer status
	 * @param comp true if the player is a computer, false if player is human
	 * 
	 */
	public player(boolean comp){
		computer = comp;
		playerScore = 0;
		roundScore = 0;
	}
	/**Determines if player is a computer
	 * 
	 * @return boolean true if computer. false if human
	 */
	public boolean isComp() {
		return computer;
	}
	/**Gets the player's current score
	 * 
	 * @return integer player's current score
	 */
	public int getPlayerScore() {
		return playerScore;
	}
	/**Gets the player's current score for the round
	 * 
	 * @return integer round score 
	 */
	public int getRoundScore() {
		return roundScore;
	}
	/** Sets the player's score to a number
	 * 
	 * @param score integer number to set score to
	 * 
	 */
	public void setPlayerScore(int score) {
		playerScore = score;
	}
	/** Sets the player's round score to a number
	 * 
	 * @param score integer number to set score to
	 * 
	 */
	public void setRoundScore(int score) {
		roundScore = score;
	}
	/**
	 * @return player's score
	 */
	public String toString() {
		return Integer.toString(playerScore);
	}
}

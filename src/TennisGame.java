public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points=0;
		this.player2Points=0;
	}

	public void player1Scored() throws TennisGameException 
	{
		if(player2Points == 4){
			player2Points--;
		}
		else
			player1Points++;
	}

	public void player2Scored() throws TennisGameException 
	{
		if(player1Points == 4){
			player1Points--;
		}
		else
			player2Points++;
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
	}

	private String getScore(int points) 
	{
		if(points == 1){
			return "15";
		}
		else if(points == 2){
			return "30";
		}
		else if(points == 3){
			return "40";
		}
		else if(points == 4)
			return "advantage";
		else if(points ==0)
		{
			return "0";
		}
		else
			return " ";
	}
	
	public String getScore() 
	{
		// Scores format: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		String prvi = getScore(player1Points);
		String drugi = getScore(player2Points);
		if((prvi =="40"&&drugi=="40")||(prvi=="30" && drugi=="30")){
			return "Rezultat: deuce";
		}
		else if(prvi == "adventage"){
			return "Rezultat: adventage igrac1";
		}
		else if(drugi == "adventage"){
			return "Rezultat: adventage igrac2";
		}
		else if(prvi==" "){
			return "Rezultat: pobedjuje igrac1";
		}
		else if(drugi==" "){
			return "Rezultat: pobedjuje igrac2";
		}
		else 
			return prvi + " - " + drugi;
	}
}

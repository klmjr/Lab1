import java.util.LinkedList;

public class Round {


	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	private boolean gameOver = false;
	private int rollCount = 1;

	public Round() {
		
		rolls.add(new Roll());
		
		if (isNatural(rolls.getLast().getScore())) {
			eGameResult = eGameResult.NATURAL;
		}
		
		else if (isCraps(rolls.getLast().getScore())) {
			eGameResult = eGameResult.CRAPS;
			
		}
		
		else
		{ 
			do
			{
				
			} while (((rolls.getLast().getScore() != 7)) &&
			(rolls.getLast().getScore() != (rolls.getFirst().getScore())));
			
			
		}
		
		if (rolls.getLast().getScore() == 7) {
			eGameResult = eGameResult.SEVEN_OUT;
		}
		
		else if (rolls.getLast().getScore()))
		
		}

	public int RollCount() {
		return rolls.size();
	}
	
	public static boolean isNatural(int iScore) {
		return ((iScore == 7) || (iScore == 11));
	}
	private static boolean isCraps(int iScore) {
		return ((iScore == 2) || (iScore == 3) || (iScore == 12));
	}
	
	public String ListRolls() {
		String strRolls = new String();
		for (Roll r: rolls) { //for roll r in rolls
			strRolls = strRolls + r.getScore() + "-";
		}
		return strRolls;
	}
}
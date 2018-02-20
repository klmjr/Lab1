
public class Die {
	private byte iMax = 6;
	private byte DieValue;
	
	public Die() {
		this.DieValue = (byte)(Math.random() * 6);
		// TODO: Determine DieVaue.. a random number between 1 and 6
	}

	public int getDieValue() {
		return DieValue;
	}
}

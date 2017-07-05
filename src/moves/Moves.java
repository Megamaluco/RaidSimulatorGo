package moves;

public abstract class Moves {
	
	private String name;
	private int power;
	private int cooldown;
	private String type;
	
		
	
	public Moves(String name, int power, int cooldown, String type) {
		this.name = name;
		this.power = power;
		this.cooldown = cooldown;
		this.type = type;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}

	/**
	 * @return the cooldown
	 */
	public int getCooldown() {
		return cooldown;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


}

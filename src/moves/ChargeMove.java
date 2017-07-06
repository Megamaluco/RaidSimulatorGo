package moves;


	public class ChargeMove extends Moves{
		
		private int energyLost;
		private int timeUntilDodge;

		public ChargeMove(String name, int power, int cooldown,int energyLost, int type, int timeUntilDodge) {
			super(name, power, cooldown, type);
			// TODO Auto-generated constructor stub
			this.energyLost = energyLost;
			this.timeUntilDodge = timeUntilDodge;
		}

		/**
		 * @return the energyLost
		 */
		public int getEnergyLost() {
			return energyLost;
		}

		/**
		 * @return the timeUntilDodge
		 */
		protected int getTimeUntilDodge() {
		
			return timeUntilDodge;
		}		
		
		
	}
	
	
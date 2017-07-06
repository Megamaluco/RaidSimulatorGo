package moves;
public class QuickMove extends Moves{
		
		private int energyGain;

		public QuickMove(String name, int power, int cooldown, int energyGain, int type) {
			super(name, power, cooldown, type);
			this.energyGain = energyGain;
		}

		/**
		 * @return the energyGain
		 */
		public int getEnergyGain() {
			return energyGain;
		}
		
		
		
		
	}

package battle;


import moves.ChargeMove;
import moves.QuickMove;
import pokemons.RaidBoss;

public class Defender extends BattleMon {
	private RaidBoss defender;


	public Defender(RaidBoss defender, QuickMove quickMove, ChargeMove chargeMove) {
		super(quickMove, chargeMove);
		this.defender = defender;
		setHp(defender.getHp());


	}
	
	
	public void resetHp(){
		setHp(defender.getHp());
	}



}
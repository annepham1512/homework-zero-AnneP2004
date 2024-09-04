package hw0;

/**
 * Objects that implement the ZapsWithSlime interface are capable of using
 * a special zapping machine to cover humans with slime. They also possess
 * a Slime Star Weapon that is capable of covering the entire earth with
 * slime.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version January 2024
 *
 */

public interface ZapsWithSlime {
    /**
	 * Zap the given number of humans, covering them with slime,
	 * returning the sound effect made by zapper as a String. For
	 * example, the slime zapper could make the sound "blech" when
	 * covering just one human with slime, but "BLECHHHH" when
	 * covering two or more humans.
	 * 
	 * @param numHumans The number of humans covered with slime
	 * @return the sound effect made by zapper
	 */
    String doSlimeZap(int numHumans);
    
    /**
	 * Use the secret Slime Star Weapon to cover the entire earth with
	 * slime, returning the sound effect made by the weapon.
	 * 
	 * @return the sound effect made by the Slime Star 
	 */
    String slimeWholeEarth();
}

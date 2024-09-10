package hw0;

public class SlimeAlien extends SpaceAlien implements ZapsWithSlime{
  private int alienSize;


  public SlimeAlien(String homePlanet, double distanceFromEarth, int alienSize) {
    super(homePlanet, distanceFromEarth);
    this.alienSize = alienSize;
  }

  
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
  @Override
  public String doSlimeZap(int numHumans) {
    if (numHumans == 1) {
            String sound = "blech";
            sound.repeat(alienSize);
            return sound; 
        } else {
            String sound = "blech";
            sound.repeat(alienSize);
            return sound;
        }
  }

   /**
	 * Use the secret Slime Star Weapon to cover the entire earth with
	 * slime, returning the sound effect made by the weapon.
	 * 
	 * @return the sound effect made by the Slime Star 
	 */
  @Override
  public String slimeWholeEarth() {
    String slimeStarSound = "Brrrrrrrrrrrrrr";
    return slimeStarSound;
  }

  @Override
  public void doGreeting() {
        System.out.println("Greetings form slime alien with the size of " + alienSize);
    }
}

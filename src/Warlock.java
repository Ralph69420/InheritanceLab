public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
    public void hellStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Hellstorm (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }

}


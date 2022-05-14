public class Character {
    public String characterName;
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name){
        characterName = name;
    }

    public void showName(){
        System.out.println("Character Initialized: "+ characterName);
        System.out.println("");
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println(enemyCharacter.characterName +" HP remaining = " + enemyCharacter.healthPoints);
        System.out.println("");
        if(enemyCharacter.healthPoints<=0){
            System.out.println("");
            System.out.println(enemyCharacter.characterName +" has been defeated.");
        }
    }

    public void healTarget(Character character,int healPoints){
        character.healthPoints += healPoints;
        System.out.println("Character's current HP = " + character.healthPoints);
        System.out.println("");
    }

}
public class FightDefMain {
    public static void main(String[] args) {
        //instance of Fighter and Defender
        Fighter fighter = new Fighter();
        Fighter fighter2 = new Fighter();
        Defender defender = new Defender();
        Defender defender2 = new Defender();
        
        //set the hp
        fighter.hp = 32;
        fighter2.hp = 50;
        defender.hp = 50;
        defender2.hp = 32;
        
        //penggunaan overloading
        //method implementation
        fighter.attack(fighter2);
        fighter.attack(defender2);
        defender2.defend(fighter2);
        fighter2.attack(fighter);
        defender.defend(fighter);
    }
}

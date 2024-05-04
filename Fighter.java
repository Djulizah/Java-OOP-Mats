public class Fighter {
    int hp, attackPower;

    //attack(fighter): HP lawan - HP sendiri, lawan adalah parameter
    void attack(Fighter fighter) {
        fighter.hp -= hp;
        System.out.println("hp = " + hp);
    }

    //attack(defend): HP lawan - 1/2 HP sendiri, lawan adalah parameter
    void attack(Defender defender) {
        defender.hp -= (1/2 * hp);
        System.out.println("hp = " + hp);
    }
}

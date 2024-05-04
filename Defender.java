public class Defender {
    int hp, attackPower;

    // defend(fighter): HP sendiri + 1/2 HP lawan, lawan adalah parameter
    void defend(Fighter fighter) {
        hp += (1/2 * fighter.hp);
        System.out.println("hp = " + hp);
    }

    // defend(defend): HP sendiri + HP lawan, lawan adalah parameter
    void defend(Defender defender) {
        hp += defender.hp;
        System.out.println("hp = " + hp);
    }
}

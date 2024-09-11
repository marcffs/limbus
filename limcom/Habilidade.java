package limcom;

import limcom.Identidade;
import java.util.Random;

public class Habilidade {
    private String name;
    private int rank;
    private int basePower;
    private int coinPower;
    private int coins;
    private int offenselvl;
    private String description;

    public Habilidade(String name, int rank, int basePower, int coinPower, int coins, int offenselvl, String description) {
        // nome
        this.name = name;

        // rank
        if (this.rank != 1 || this.rank != 2 || this.rank != 3 || this.rank != 4) {
            throw new IllegalArgumentException("[INVALID] rank must be [1;2;3;4]");
        } else this.rank = rank;

        // power
        if (basePower > 0) {
            this.basePower = basePower;
        } else throw new IllegalArgumentException("[INVALID] natural numbers only");
        
        // bonus
        if (coinPower > 0) {
            this.coinPower = coinPower;
        } else throw new IllegalArgumentException("[INVALID] natural numbers only");

        // coins
        if (coins > 0) {
            this.coins = coins;
        } else throw new IllegalArgumentException("[INVALID] natural numbers only");
        
        // offense
        if (offenselvl > 0) {
            this.offenselvl = offenselvl;
        } else throw new IllegalArgumentException("[INVALID] natural numbers only");
        
        // description
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getBasePower() {
        return basePower;
    }

    public int getCoinPower() {
        return coinPower;
    }

    public int getCoins() {
        return coins;
    }

    public int getOffenselvl() {
        return offenselvl;
    }

    public String getDescription() {
        return description;
    }

    public Habilidade Clashing(Habilidade skill) {
        if (this.rank == 4 || skill.rank == 4) {
            
        }

        int roll1;
        for (int i = 0; i < this.coins; i++) {
            roll1 = coinPower*Math.random();
        }

        int roll2 = skill.coinPower*skill.coins;

        if (roll1 > roll2) {
            return this;
        } else return skill;
    }
}

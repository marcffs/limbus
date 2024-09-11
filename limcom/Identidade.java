package limcom;

public class Identidade {
    private String name;
    private int maxHP;
    private int hp;
    private int level;
    private int defenselvl;
    private int speedRange[];
    private int staggerThresholds[];

    Identidade(String name, int maxHP, int level, int defenselvl, int speedRange[], int staggerThresholds[]){
        // name
        this.name = name;
        
        // hp
        if (maxHP < 0) {
            throw new IllegalArgumentException("[INVALID] HP must be [0;200]");
        } else {
            this.maxHP = maxHP;
            this.hp = maxHP;
        }

        // identity level
        if (level < 0 || level > 30) {
            throw new IllegalArgumentException("[INVALID] Level must be [1;30]");
        } else this.level = level;
        
        // defense level
        if (defenselvl < 0 || defenselvl > 10) {
            throw new IllegalArgumentException("[INVALID] Defense level must a natural number lower than 10.");
        } else this.defenselvl = defenselvl + level;
        
        // speed
        if (speedRange.length > 2) {
            throw new IllegalArgumentException("[INVALID] Speed range must be only two values.");
        } else this.speedRange = speedRange;

        // stagger
        if (staggerThresholds.length > 3) {
            throw new IllegalArgumentException("[INVALID] Stagger thresholds must be only three values.");
        } else{
            if (staggerThresholds[0] > 0 && staggerThresholds[2] < maxHP) {
                this.staggerThresholds = staggerThresholds;
            } else throw new IllegalArgumentException("[INVALID] Stagger thresholds must be within HP range.");
        }
    }

    public void setHp(int hp){
        if (hp > this.maxHP || hp < 0) {
            throw new IllegalArgumentException(String.format("[INVALID] HP must be a natural number lower than maximum HP %d.", this.maxHP));
        }
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public int getDefenselvl() {
        return defenselvl;
    }

    public int[] getSpeedRange() {
        return speedRange;
    }

    public int[] getStaggerThresholds() {
        return staggerThresholds;
    }

}
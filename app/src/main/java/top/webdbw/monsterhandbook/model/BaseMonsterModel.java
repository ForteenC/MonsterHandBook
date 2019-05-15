package top.webdbw.monsterhandbook.model;

/**
 * 怪物基础信息，包括属性、能力值
 */
public class BaseMonsterModel {

    public Attribute attribute; //属性

    public Age age;             //年纪

    private long strength;      //力量

    private long speed;         //速度

    private long intellect;     //智慧

    private long charity;       //魅力

    private long luck;          //幸运

    private long skill;         //技巧

    protected BaseMonsterModel() {

    }

    public long getStrength() {
        return strength;
    }
    public void setStrength(long strength) {
        this.strength = strength;
    }
    public long getIntellect() {
        return intellect;
    }
    public void setIntellect(long intellect) {
        this.intellect = intellect;
    }
    public long getSkill() {
        return skill;
    }
    public void setSkill(long skill) {
        this.skill = skill;
    }
    public long getLuck() {
        return luck;
    }
    public void setLuck(long luck) {
        this.luck = luck;
    }
    public long getSpeed() {
        return speed;
    }
    public void setSpeed(long speed) {
        this.speed = speed;
    }
    public long getCharity() {
        return charity;
    }
    public void setCharity(long charity) {
        this.charity = charity;
    }
}

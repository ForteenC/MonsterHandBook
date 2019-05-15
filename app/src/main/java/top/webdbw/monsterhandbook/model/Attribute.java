package top.webdbw.monsterhandbook.model;

/**
 * 妖怪属性
 */
public enum Attribute {

    LIGHT("光"),DARK("暗"),
    WOOD("木"),FIRE("火"),
    WATER("水"),DUST("土");

    private String name;

    Attribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

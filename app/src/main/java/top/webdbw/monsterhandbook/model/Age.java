package top.webdbw.monsterhandbook.model;

/**
 * 怪兽的生命周期，代表怪兽的成长状态
 */
public enum Age {
    CHILD("幼年"), YOUNG("青年"), ADULT("成年"), PRIME("壮年"), SUPER("超");

    private String age;

    Age(String age) {
        this.age = age;
    }
}

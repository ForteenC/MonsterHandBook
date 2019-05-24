package top.webdbw.monsterhandbook.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * 怪物基础信息，包括属性、能力值
 */
public class Monster extends RealmObject {

    @PrimaryKey
    private long id;

    public String name;         //名称

    public int attribute;       //属性  目前有1、光；2、暗；3、木；4、土；5、火；6、水

    public int age;             //年纪  目前有1、幼年；2、青年；3、成年；4、壮年；5、超

    public long strength;       //力量

    public long speed;          //速度

    public long intellect;      //智慧

    public long charity;        //魅力

    public long luck;           //幸运

    public long skill;          //技巧

    public RealmList<Halo> halos;                   //光环

    public RealmList<Instrument> instruments;       //法器

    public RealmList<Feature> features;             //特征

    public RealmList<Decent> decents;               //血统
}

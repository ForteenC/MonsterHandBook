package top.webdbw.monsterhandbook.model;

import io.realm.RealmObject;

/**
 * 光环
 */
public class Halo extends RealmObject {

    public int type;            //光环类型,目前有 1、加固定数值；2、加百分比数值

    public int attribute;       //光环增益的属性

    public float value;         //光环增益的数值,固定值为具体的数值，百分比为 x.x

}

package top.webdbw.monsterhandbook.application;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //  初始化Realm数据库
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);
    }
}

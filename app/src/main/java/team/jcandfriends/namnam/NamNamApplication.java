package team.jcandfriends.namnam;

import android.app.Application;

import com.facebook.FacebookSdk;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class NamNamApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RealmConfiguration configuration = new RealmConfiguration.Builder(this).build();
        Realm.setDefaultConfiguration(configuration);

        FacebookSdk.sdkInitialize(this);
    }
}

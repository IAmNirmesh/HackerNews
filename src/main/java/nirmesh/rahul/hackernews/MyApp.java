package nirmesh.rahul.hackernews;

import android.app.Application;

/**
 * Created by NIRMESH on 1/1/2017.
 */
public class MyApp extends Application {
    
	@Override
    public void onCreate() {
        super.onCreate();
        Utls.Init(this);
    }
}

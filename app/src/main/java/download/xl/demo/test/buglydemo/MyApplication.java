package download.xl.demo.test.buglydemo;

import android.app.Application;

import com.tencent.bugly.Bugly;

/**
 * *
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//  |      CrashReport.initCrashReport(getApplicationContext(), "8e148b58d7", false);

        Bugly.init(getApplicationContext(), "8e148b58d7", true);
    }

}

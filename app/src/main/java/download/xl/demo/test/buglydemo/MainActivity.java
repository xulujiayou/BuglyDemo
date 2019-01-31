package download.xl.demo.test.buglydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tencent.bugly.beta.Beta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_test = findViewById(R.id.btn_test);
        btn_test.setText("热修复-更新");
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                CrashReport.testJavaCrash();
                Beta.checkUpgrade();//检查版本号
                Toast.makeText(MainActivity.this, "按了检查版本号的按钮", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

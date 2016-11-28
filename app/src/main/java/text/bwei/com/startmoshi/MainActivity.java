package text.bwei.com.startmoshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("****************", "onCreate()");
    }

    /**
     * 开启Activity
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("****************", "onStart()");
    }

    /**
     * 获得焦点Activity
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("****************", "onResume()");
    }

    /**
     * 重启Activity
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("****************", "onRestart()");
    }

    /**
     * 暂停Activity
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("****************", "onPause()");
    }

    /**
     * 停止Activity
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("****************", "onStop()");
    }

    /**
     * 销毁Activity
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("****************", "onDestroy()");
    }

    public void tiaozhuan(View v) {
        startActivity(new Intent(MainActivity.this, BActivity.class));
    }
}

package text.bwei.com.startmoshi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class SingleTaskActivity extends Activity {

    private TextView singleTaskView;

    /**
     * 创建Activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singletask);
        singleTaskView = (TextView) this.findViewById(R.id.singleTaskView);
        singleTaskView.setText(this.toString());
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

    public void openSingleTask(View v) {
        startActivity(new Intent(this, BActivity.class));
    }

    //得到每次重用的意图对象
    @Override
    protected void onNewIntent(Intent intent) {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(), new Date().toString(), Toast.LENGTH_SHORT).show();
        super.onNewIntent(intent);
    }

}

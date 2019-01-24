package fast.campus.fast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lifeCycle", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d("lifeCycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifeCycle", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifeCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lifeCycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifeCycle", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("lifeCycle", "onRestart");
        super.onRestart();
    }

}

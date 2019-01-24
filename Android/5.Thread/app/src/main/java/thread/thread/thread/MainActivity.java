package thread.thread.thread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Thread 만드는 방법 1
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();


        // Thread 만드는 방법 2
        new Thread(new Runnable() {
            @Override
            public void run() {
//                Log.d("runnable", "1");
//                Toast.makeText(MainActivity.this, "토스트", Toast.LENGTH_LONG).show();
            }
        }).start();


        // UI Thread 만드는 방법
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "토스트", Toast.LENGTH_LONG).show();
            }
        });
    }


}

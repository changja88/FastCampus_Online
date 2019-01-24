package fast.campus.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int REQUEST_CODE = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lifecycle", "1 : onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 명시적 Intent
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("INTENT_KEY", 5);
        intent.putExtra("INTENT_KEY_STRING", "STRING");
        startActivityForResult(intent, REQUEST_CODE);

        // 암시적 Intent
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:google.com"));
//        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == 200) {
                String result = data.getStringExtra("RESULT");
                Log.d("onActivityResult", "result : " + result);
            } else if (resultCode == 300) {
                Log.d("onActivityResult", "실패");
            }
        }
    }

    @Override
    protected void onStart() {
        Log.d("lifecycle", "1 : onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifecycle", "1 : onResume");

        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifecycle", "1 : onPause");

        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lifecycle", "1 : onStop");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifecycle", "1 : onDestroy");

        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("lifecycle", "1 : onRestart");
        super.onRestart();
    }


}

package fragment.fragment.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public static final String BUNDLE_KEY = "bundel_key";

    FragmentManager fragmentManager;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lifeCycle", "Activty : onCreate");


        Fragment fragmentOne = new FragmentOne();
        Bundle bundle = new Bundle();
        bundle.putInt(BUNDLE_KEY, 10);
        fragmentOne.setArguments(bundle);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, fragmentOne); // 작업1
        fragmentTransaction.commit(); // 확인


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, new FragmentTwo());
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("lifeCycle", "Activty : onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifeCycle", "Activty : onResume");

        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifeCycle", "Activty : onPause");

        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifeCycle", "Activty : onDestroy");

        super.onDestroy();
    }
}

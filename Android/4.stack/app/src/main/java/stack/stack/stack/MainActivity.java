package stack.stack.stack;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent comingIntent = getIntent();
        boolean again = comingIntent.getBooleanExtra("AGAIN", true);

//        if (again == true) {
//            Intent intent = new Intent(this, SecondActivity.class);
//            startActivity(intent);
//        }
        // Stack

        // Main
        // Thrid
        // Second
        // Main

    }


}

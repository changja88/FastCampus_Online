package addview.addview.addview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> stringList;
    LayoutInflater layoutInflater;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stringList = new ArrayList();
        stringList.add("가");
        stringList.add("나");
        stringList.add("다");
        stringList.add("라");
        stringList.add("마");
        stringList.add("바");
        stringList.add("사");
        stringList.add("아");

        container = findViewById(R.id.container);

        layoutInflater = LayoutInflater.from(MainActivity.this);

        for (int i = 0; i < stringList.size(); i++) {

            View view = layoutInflater.inflate(R.layout.list_itme_view, null, false);
            TextView itemText = view.findViewById(R.id.item_view_text);
            itemText.setText(stringList.get(i));

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("test", "CLICK");
                }
            });

            container.addView(view);
        }


    }


}

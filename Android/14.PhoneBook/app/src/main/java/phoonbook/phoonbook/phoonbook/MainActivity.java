package phoonbook.phoonbook.phoonbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<PhoneBook> phoneBookList;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        PhoneBook phoneBook1 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동1", "010" +
                "-0000-0001"
        );

        PhoneBook phoneBook2 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동2", "010" +
                "-0000-0002"
        );


        PhoneBook phoneBook3 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동3", "010" +
                "-0000-0003"
        );


        PhoneBook phoneBook4 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동4", "010" +
                "-0000-0004"
        );


        PhoneBook phoneBook5 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동5", "010" +
                "-0000-0005"
        );


        PhoneBook phoneBook6 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동6", "010" +
                "-0000-0006"
        );


        PhoneBook phoneBook7 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동7", "010" +
                "-0000-0007"
        );

        PhoneBook phoneBook8 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동8", "010" +
                "-0000-0008"
        );


        phoneBookList = new ArrayList<>();
        phoneBookList.add(phoneBook1);
        phoneBookList.add(phoneBook2);
        phoneBookList.add(phoneBook3);
        phoneBookList.add(phoneBook4);
        phoneBookList.add(phoneBook5);
        phoneBookList.add(phoneBook6);
        phoneBookList.add(phoneBook7);
        phoneBookList.add(phoneBook8);


        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        for (int i = 0; i < phoneBookList.size(); i++) {
            Log.d("test", "inflate");

            View view = layoutInflater.inflate(R.layout.phone_book_item_view, null, false);
            TextView name = view.findViewById(R.id.name);
            TextView number = view.findViewById(R.id.number);
            ImageView imageView = view.findViewById(R.id.imageView);

            name.setText(phoneBookList.get(i).name);
            number.setText(phoneBookList.get(i).number);
            RequestOptions circleOption = new RequestOptions().circleCrop();
            Glide.with(MainActivity.this)
                    .load(phoneBookList.get(i).image)
                    .apply(circleOption)
                    .into(imageView);


            final int finalI = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("test", "number : " + phoneBookList.get(finalI).number);
                }
            });


            container.addView(view);
        }

        ///
        Log.d("test", "inflate completed");
        Log.d("test", "inflate completed");
        Log.d("test", "inflate completed");
        Log.d("test", "inflate completed");
        Log.d("test", "inflate completed");
        Log.d("test", "inflate completed");


    }
}

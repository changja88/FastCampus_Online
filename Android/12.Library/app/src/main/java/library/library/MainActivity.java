package library.library;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {


    ImageView imageViewOne;
    ImageView imageViewTwo;
    ImageView imageViewThree;
    ImageView imageViewFour;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        imageViewOne = findViewById(R.id.image_one);
        imageViewTwo = findViewById(R.id.image_two);
        imageViewThree = findViewById(R.id.image_three);
        imageViewFour = findViewById(R.id.image_four);


        // 웹 이미지를 넣는 방법
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .into(imageViewOne);

        // option을 사용 방법
        RequestOptions cropOption = new RequestOptions().centerCrop();
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .apply(cropOption)
                .into(imageViewTwo);

        // option을 사용 방법
        RequestOptions circleCrop = new RequestOptions().circleCrop();
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .apply(circleCrop)
                .into(imageViewThree);


        // 로컬 이미지 불러오는 방법
        Glide.with(context)
                .load(R.drawable.ic_launcher_background)
                .into(imageViewFour);



    }
}

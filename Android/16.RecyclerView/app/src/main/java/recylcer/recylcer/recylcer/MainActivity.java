package recylcer.recylcer.recylcer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        itemList = new ArrayList<>();
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");
        itemList.add("가");


//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL, false);


//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3,
                LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyAdapter(itemList));

    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        private ArrayList<String> itemList;

        public MyAdapter(ArrayList<String> itemList) {
            this.itemList = itemList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.item_view, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
            viewHolder.textView.setText(itemList.get(position));
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }


        class ViewHolder extends RecyclerView.ViewHolder {
            TextView textView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.item_text);
            }
        }
    }


}

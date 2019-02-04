package fragment.fragment.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static fragment.fragment.myapplication.MainActivity.BUNDLE_KEY;

public class FragmentOne extends Fragment {

    @Override
    public void onAttach(Context context) {
        Log.d("lifeCycle", "Fragment one : onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment one : onCreate");

        super.onCreate(savedInstanceState);
    }


    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment one : onCreateView");

        view = inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment one : onActivityCreated");

        int number = getArguments().getInt(BUNDLE_KEY);
        Log.d("test", "number : " + number);

        Button button = view.findViewById(R.id.fragment_one_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test", "CLICK !");
            }
        });

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("lifeCycle", "Fragment one : onStart");

        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("lifeCycle", "Fragment one : onPause");

        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.d("lifeCycle", "Fragment one : onDestroyView");

        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("lifeCycle", "Fragment one : onDestroy");

        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("lifeCycle", "Fragment one : onDetach");

        super.onDetach();
    }
}

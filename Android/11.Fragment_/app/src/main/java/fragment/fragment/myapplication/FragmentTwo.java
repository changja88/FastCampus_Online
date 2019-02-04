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

public class FragmentTwo extends Fragment {

    @Override
    public void onAttach(Context context) {
        Log.d("lifeCycle", "Fragment two : onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment two : onCreate");

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment two : onCreateView");
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onStart() {
        Log.d("lifeCycle", "Fragment two : onStart");

        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("lifeCycle", "Fragment two : onPause");

        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.d("lifeCycle", "Fragment two : onDestroyView");

        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("lifeCycle", "Fragment two : onDestroy");

        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("lifeCycle", "Fragment two : onDetach");

        super.onDetach();
    }
}

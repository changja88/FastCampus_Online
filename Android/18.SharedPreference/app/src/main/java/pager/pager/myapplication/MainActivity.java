package pager.pager.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String sharedPreferenceName = "SAVE_1";
        String sharedPreferenceKey = "KEY";


        // SharedPreference 에 데이터 저장하는 방법
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPreferenceName,
                MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(sharedPreferenceKey, "안녕하세요");
        editor.putString("sharedPreferenceKey2", "안녕히가세요");
        editor.commit();


        // SharedPreference 의 데이터 삭제 하는 방법
        editor.remove(sharedPreferenceKey);
        editor.clear();
        editor.commit();


        // SharedPreference 에 데이터 불러오는 방법
//        String value = sharedPreferences.getString(sharedPreferenceKey, "실패");
        String value = sharedPreferences.getString(sharedPreferenceKey, "실패");
        Log.d("testt", " value : " + value);


        Person person = new Person("홍길동", 20);
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        Log.d("testt", " value : " + personJson);
        String sharedPreferencePersonKey = "person_key";
        editor.putString(sharedPreferencePersonKey, personJson);
        editor.commit();


        String personString = sharedPreferences.getString(sharedPreferencePersonKey, "실패 2");
        Person loadedPerson = gson.fromJson(personString, Person.class);

        Log.d("testt", "person age : " + loadedPerson.age);
    }
}

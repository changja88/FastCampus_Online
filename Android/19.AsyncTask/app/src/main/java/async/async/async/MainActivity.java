package async.async.async;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("testt", "PRE !!");
        BackgroundTask backgroundTask = new BackgroundTask();
        backgroundTask.execute();
        Log.d("testt", "POST !!");
    }


    class BackgroundTask extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected void onPreExecute() {
            Log.d("testt", "onPreExecute");
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            int result = 0;
            for (int i = 0; i < 100; i++) {
                result++;
                if (i % 10 == 0) {
                    publishProgress(i);
                }
            }
            return result;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            Log.d("testt", "Progress : " + values[0] + "%");
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Integer integer) {
            Log.d("testt", "Result : " + integer);
            super.onPostExecute(integer);
        }
    }


}

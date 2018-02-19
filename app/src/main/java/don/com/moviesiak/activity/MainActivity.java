package don.com.moviesiak.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

import java.util.Calendar;
import java.util.List;

import don.com.moviesiak.Constants;
import don.com.moviesiak.R;
import don.com.moviesiak.adapter.MainAdapter;
import don.com.moviesiak.model.MainModel;
import don.com.moviesiak.model.ResultsItem;
import don.com.moviesiak.services.ApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private String MY_TAG = MainActivity.class.getSimpleName();

    RecyclerView recyclerView;

    MainAdapter adapter;

    ApiClient apiClient;

    List<ResultsItem> resultsItems;

    String myApiKey;

    String languange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        myApiKey = getString(R.string.api_key);
        languange = "en-US";
        Log.d(MY_TAG, myApiKey);


        getMyMovies();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }


    private void getMyMovies() {
        apiClient = new ApiClient();
        Call<MainModel> call = apiClient.getApiInterface().getNowPlayingMovies(myApiKey, 1);
        call.enqueue(new Callback<MainModel>() {
            @Override
            public void onResponse(Call<MainModel> call, Response<MainModel> response) {
                if (response.isSuccessful()) {
                    Log.d(MY_TAG, "SUKSES");

                    MainModel mainModel = response.body();
                    resultsItems = mainModel.getResults();

                    //ini gunanya untuk membuat smooth scroll
                    recyclerView.setHasFixedSize(true);

                    //kita set layout manager untuk recyclerview
                    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

                    //ngambil data adapter
                    adapter = new MainAdapter(resultsItems, getApplicationContext());

                    //set data dari adapter ke recyclerview
                    recyclerView.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<MainModel> call, Throwable t) {
                Log.d(MY_TAG, t.getMessage());
                Log.d(MY_TAG, "GAGAL-2");

            }
        });


        //nih salah wkwkkw ga ngerti lagi gua btw ini dah w import apiny dari gson tinggal eksekusi
       Call<MainModel> call2 = apiClient.getApiInterface().getPopularMovies(myApiKey, languange , 1);
       call2.enqueue(new Callback<MainModel>() {
           @Override
           public void onResponse(Call<MainModel> call, Response<MainModel> response) {
               if (response.isSuccessful()){
                   Log.d(MY_TAG, "SUKSES");

                   MainModel mainModel = response.body();
                   resultsItems = mainModel.getResults();

                   recyclerView.setHasFixedSize(true);

                   recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

                   adapter = new MainAdapter(resultsItems,getApplicationContext());

                   recyclerView.setAdapter(adapter);
               }
           }

           @Override
           public void onFailure(Call<MainModel> call, Throwable t) {
               Log.d(MY_TAG, "GAGAL-3");
           }
       });

    }

//    private void getMyPopular(){
//
//        apiClient = new ApiClient();
//        Call<MainModel> call = apiClient.getApiInterface().getPopularMovies(myApiKey,1);
//        call.enqueue(new Callback<MainModel>() {
//            @Override
//            public void onResponse(Call<MainModel> call, Response<MainModel> response) {
//                if (response.isSuccessful()) {
//                    Log.d(MY_TAG, "SUKSES");
//
//                    MainModel mainModel = response.body();
//                    resultsItems = mainModel.getResults();
//
//                    //ini gunanya untuk membuat smooth scroll
//                    recyclerView.setHasFixedSize(true);
//
//                    //kita set layout manager untuk recyclerview
//                    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
//
//                    //ngambil data adapter
//                    adapter = new MainAdapter(resultsItems, getApplicationContext());
//
//                    //set data dari adapter ke recyclerview
//                    recyclerView.setAdapter(adapter);
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<MainModel> call, Throwable t) {
//                Log.d(MY_TAG, t.getMessage());
//                Log.d(MY_TAG, "GAGAL-2");
//
//            }
//        });
        }




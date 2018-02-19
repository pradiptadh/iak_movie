package don.com.moviesiak.services;

import don.com.moviesiak.model.MainModel;
import don.com.moviesiak.model.ResultsItem;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by gideon on 11/02/18.
 */

public interface ApiInterface {


    /**
     * API CALL UNTUK MENGAMBIL NOW PLAYING MOVIE..
     * DENGAN END POINT "MOVIE/NOW_PLAYING"
     * @param apiKey (Api Key kita)
     * @param pageNumber (Page Number, example -> 1);
     * @return
     *
     */
    @GET("movie/now_playing")
    Call<MainModel> getNowPlayingMovies(
            @Query("api_key") String  apiKey,
            @Query("page") int pageNumber);

    @GET("movie/popular")
    Call<ResultsItem> getPopularMovies(
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );
    //
//    @GET("movie/popular")
//    Call<MainModel> getPopularMovies(
//            @Query("api_key") String apiKey),
//
//    https://api.themoviedb.org/3/movie/popular?api_key=8f7e1ef0c68c48deed3e5017fb549e95&language=en-US&page=1
}

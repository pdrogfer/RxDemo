package com.example.pedro.rxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.GsonBuilder;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.File;
import java.sql.Time;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        // Rx Hello World
//        Observable.just("Hello World") // emite esto solamente una vez
//                .doOnNext(x -> System.out.println(x))
//                .subscribe();
//
//        System.out.println("--------------");
//
//        // emite numeros rango 1 - 10 y FIN al acabar
//        Observable.range(1, 10)
//                .doOnNext(x -> System.out.println(x))
//                .doOnComplete(() -> System.out.println("FIN"))
//                .subscribe();
//
//        System.out.println("--------------");
//
//        // imprimir la hora cada 2 segundos, solo los 10 primeros
//        Observable.interval(2, TimeUnit.SECONDS)
//                .map(x -> new Date())
//                .doOnNext(x -> System.out.println(x))
//                // .doOnNext(x -> System.out.println(x + " - " + new Date()))  alternativa a map (que recibe el ordinal y emite la fecha en su lugar)
//                .take(10)
//                .subscribe();
//
//        System.out.println("--------------");
//
//        // flatmap recibe cada evento y devuelve un nuevo observable
//        Observable.range(1, 5)
//                .flatMap(x -> Observable.range(0, x))
//                .subscribe(System.out::println);  // notacion alternativa a 'x -> System.out.println(x)'
//
//        System.out.println("--------------");
//
//        // concatenar varios observables secuencialmente. Este ejercicion en IntellijIdea necesita
//        // 'blockingLast()' porque 'interval' emite en un hilo secundario
//        Observable obs1 = Observable.interval(2, TimeUnit.SECONDS)
//                .take(5)
//                .map(x -> Calendar.getInstance().getTime())
//                .doOnNext(System.out::println);
//
//        Observable obs2 = Observable.range(1, 5)
//                .map(x -> x * x)
//                .doOnNext(System.out::println);
//
//        Observable.concat(obs1, obs2)
//                .subscribe();
//
//        System.out.println("--------------");
//
//        // obtener los factoriales de 1 a 10, con un delay entre ellos
//        Observable.range(1, 10)
//                .flatMap(n -> Observable.range(1, n)
//                        .reduce((x, y) -> x * y)
//                        .toObservable())
//                // para separar la salida de los elementos un segundo
//                .concatMap(n -> Observable.just(n).delay(1, TimeUnit.SECONDS))
//                .subscribe(System.out::println);

//        System.out.println("--------------");
//
//        // hacer una llamada a retrofit en segundo plano con RxJava
//
//        MovieService movieService = new Retrofit.Builder()
//                .baseUrl("http://www.omdbapi.com/")
//                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .client(new OkHttpClient.Builder().build())
//                .build()
//                .create(MovieService.class);
//
//        Observable<Movie> movieObservable = movieService.searchMovie("Star Wars");
//
//        TextView textView = (TextView)findViewById(R.id.my_text_view);
//
//        movieObservable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(movie -> {
//                    textView.setText(movie.getTitle());
//                    Log.i(TAG, "Movie: " + movie.getPlot());
//                });
    }
}

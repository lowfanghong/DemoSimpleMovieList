package sg.edu.rp.c346.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvMovies;
    ArrayList<String> movieList;
    ArrayAdapter<String> aaMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovies = findViewById(R.id.listViewMovie);
         movieList = new ArrayList<>();
         movieList.add("Avengers Infinity War Release Date: 2018.04 ");
        movieList.add("Justice League Release Date: 2017.11 ");

        aaMovie = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,movieList);

        lvMovies.setAdapter(aaMovie);









    }
}
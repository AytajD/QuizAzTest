package android.tutorial.curvedbottombar.Activities;

import android.os.Bundle;
import android.tutorial.curvedbottombar.RecyclerView.ThemeAdapter;
import android.tutorial.curvedbottombar.RecyclerView.ThemeModel;
import android.tutorial.curvedbottombar.R;
import android.tutorial.curvedbottombar.BottomNavView.CurvedBottomNavigationView;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private RecyclerView recyclerView;
    private ArrayList<ThemeModel> imageModelArrayList;
    private ThemeAdapter adapter;

    private int[] myImageList = new int[]{R.drawable.man,
            R.drawable.brain,
            R.drawable.id_card,
            R.drawable.man,
            R.drawable.brain,
            R.drawable.add_favorite_star_interface_symbol};
    private String[] myImageNameList = new String[]
            {
                    "Random",
                    "Tələbə",
                    "Dövlət Qulluğu",
                    "Tələbə",
                    "Dövlət Qulluğu",
                    "Yeni Əlavə et"
            };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CurvedBottomNavigationView mView = findViewById(R.id.customBottomBar);
        mView.inflateMenu(R.menu.bottom_menu);
        mView.setSelectedItemId(R.id.action_profile);

        //getting bottom navigation view and attaching the listener
        mView.setOnNavigationItemSelectedListener(MainActivity.this);

        //setting recyclerView
        recyclerView = findViewById(R.id.recycler);
        imageModelArrayList = setRecyc();
        adapter = new ThemeAdapter(this, imageModelArrayList);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,
                false));


    }

    private ArrayList<ThemeModel> setRecyc() {

        ArrayList<ThemeModel> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            ThemeModel fruitModel = new ThemeModel();
            fruitModel.setName(myImageNameList[i]);
            fruitModel.setImage_drawable(myImageList[i]);
            list.add(fruitModel);
        }

        return list;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_chempions:
                //if chosen qalibler
                break;
            case R.id.action_profile:
                //if chosen profile
                break;
            case R.id.action_themes:
                //if chosen movzular
                break;
        }
        return true;
    }

}

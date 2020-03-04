package loan.louise.exercice.controler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import loan.louise.exercice.R;

public class SecActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.pikachu,R.drawable.salameche,R.drawable.reptincelle,R.drawable.dracofeu,
                    R.drawable.carapuce,R.drawable.carabaffe,R.drawable.tortank,
                    R.drawable.bulbizare,R.drawable.herbizare,R.drawable.florizare};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.pokemon);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

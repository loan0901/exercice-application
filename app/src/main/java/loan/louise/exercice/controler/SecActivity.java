package loan.louise.exercice.controler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import loan.louise.exercice.R;

public class SecActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView secTextView;
    private Button secButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        secTextView = (TextView) findViewById(R.id.secTextView1);
        secButton = (Button) findViewById(R.id.secButton1);
        secButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent mainActivityIntent = new Intent(SecActivity.this,MainActivity.class);
        startActivity(mainActivityIntent);
    }
}

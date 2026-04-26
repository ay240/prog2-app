package jp.ac.gifu_u.ando;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView resultText;
    Button fortuneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        fortuneButton = findViewById(R.id.fortuneButton);

        fortuneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] fortunes = {
                        "大吉 🎉",
                        "中吉 😊",
                        "小吉 🙂",
                        "吉 😌",
                        "凶 😢"
                };

                Random rand = new Random();
                int index = rand.nextInt(fortunes.length);

                resultText.setText(fortunes[index]);
            }
        });
    }
}
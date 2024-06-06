package john.smith.menuactionbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewSecondScreen;
    private TextView textViewUserData;
    private ImageView imageView;
    private int[] images = {R.drawable.cat1, R.drawable.cat2, R.drawable.cat3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textViewSecondScreen = findViewById(R.id.textViewSecond);
        textViewUserData = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView2);

        long data = getIntent().getLongExtra("data", -1);
        textViewUserData.setText("Number: " + data);

        int imageResource = getRandomImageResource();
        imageView.setImageResource(imageResource);
    }

    private int getRandomImageResource() {
        Random random = new Random();
        return images[random.nextInt(images.length)];
    }
}

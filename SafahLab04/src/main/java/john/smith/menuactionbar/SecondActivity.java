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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textViewSecondScreen = findViewById(R.id.textViewSecond);
        textViewUserData = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView2);
        // Set the text for TextViews
        textViewSecondScreen.setText(getString(R.string.second_screen_text));
        long data = getIntent().getLongExtra("data", -1);
        textViewUserData.setText("Number: " + data);

        // Set the image for ImageView
        int imageResource = getRandomImageResource();
        imageView.setImageResource(imageResource);
    }

    private int getRandomImageResource() {
        // Implement this method to return a random image resource ID
        // For example:
        int[] images = {R.drawable.cat1, R.drawable.cat2, R.drawable.cat3};
        Random random = new Random();
        return images[random.nextInt(images.length)];
    }

}
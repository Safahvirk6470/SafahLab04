package john.smith.menuactionbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewSecondScreen;
    private TextView textViewUserData;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSecondScreen = findViewById(R.id.editText);
        textViewUserData = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageButton);

        // Set the text for TextViews
        textViewSecondScreen.setText("My Second Screen - Safah Virk (N01596470)");
        textViewUserData.setText("Number: " + getIntent().getLongExtra("userData", -1));

        // Set the image for ImageView
        int imageResource = getRandomImageResource(); // Define this method to get a random image resource
        imageView.setImageResource(imageResource);
    }

    private int getRandomImageResource() {
        // Implement this method to return a random image resource ID
        // For example:
        // int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
        // Random random = new Random();
        // return images[random.nextInt(images.length)];
        return R.drawable.cat1; // Placeholder for demonstration
    }
}

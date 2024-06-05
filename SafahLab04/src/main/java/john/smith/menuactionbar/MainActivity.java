package john.smith.menuactionbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        ImageButton button = findViewById(R.id.imageButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                long data = input.isEmpty()? -2000 : Long.parseLong(input);

                // Show snackbar with indefinite duration
                Snackbar snackbar = Snackbar.make(v, getString(R.string.snackbar_message), Snackbar.LENGTH_INDEFINITE)
                        .setAction(getString(R.string.snackbar_action), new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Navigate to second activity
                                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                intent.putExtra("data", data);
                                startActivity(intent);

                                // Clear input
                                editText.setText("");
                            }
                        });
                snackbar.show();
            }
        });
    }
    ImageButton button = findViewById(R.id.imageButton);
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("data", 123); // Pass some data to the second activity
            startActivity(intent);
        }
    };


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "App resumed - Full Name: Safah Virk, Student ID: N01596470");
    }
}
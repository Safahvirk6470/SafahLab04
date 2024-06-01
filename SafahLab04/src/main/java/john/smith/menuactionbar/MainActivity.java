import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import john.smith.menuactionbar.R;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        ImageButton button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                long data = input.isEmpty() ? -2000 : Long.parseLong(input);

                // Show snackbar with indefinite duration
                Snackbar snackbar = Snackbar.make(v, "John Smith", Snackbar.LENGTH_INDEFINITE)
                        .setAction("START", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Navigate to second activity
                               // Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                //intent.putExtra("data", data);
                                //startActivity(intent);

                                // Clear input
                                editText.setText("");
                            }
                        });
                snackbar.show();
            }
        });
    }
}

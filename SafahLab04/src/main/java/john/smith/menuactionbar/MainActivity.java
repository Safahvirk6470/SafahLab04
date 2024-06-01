package john.smith.menuactionbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int featureId;
    private MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the tools bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.start) {
            //displayTextView.setText("You selected start!");
            Toast.makeText(this, "You selected start!", Toast.LENGTH_LONG).show();
        }

        if (item.getItemId() == R.id.accel) {

            //displayTextView.setText("You selected start!");
            Toast.makeText(this, "You selected Speed up!!", Toast.LENGTH_LONG).show();
        }

        if (item.getItemId() == R.id.stop) {

            //displayTextView.setText("You selected start!");
            Toast.makeText(this, "You selected stop!", Toast.LENGTH_LONG).show();
        }

        if (item.getItemId() == R.id.decel) {

            //displayTextView.setText("You selected start!");
            Toast.makeText(this, "You selected Slow Down!", Toast.LENGTH_LONG).show();
        }

        return false;
    }


}
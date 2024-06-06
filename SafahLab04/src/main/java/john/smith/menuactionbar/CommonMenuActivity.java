package john.smith.menuactionbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import john.smith.menuactionbar.R;


public class CommonMenuActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.dial) {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:1234567890")); // Replace with your phone number
            startActivity(dialIntent);
            return true;
        } else if (id == R.id.exit) {
            finishAffinity();
            return true;
        } else if (id == R.id.help) {
            Intent helpIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.example.com")); // Replace with your URL
            startActivity(helpIntent);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    protected void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
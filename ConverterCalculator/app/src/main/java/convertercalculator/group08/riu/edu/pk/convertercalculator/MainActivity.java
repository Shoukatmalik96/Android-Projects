package convertercalculator.group08.riu.edu.pk.convertercalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lengthClick(View view)
    {
        Intent intent1 = new Intent(MainActivity.this, LengthAct.class);
        startActivity(intent1);
    }

    public void WeightClick(View view)
    {
       Intent intent2 = new Intent(MainActivity.this, weight.class);
       startActivity(intent2);
    }

    public void ClickCurrency(View view)
    {
        Intent intent3 = new Intent(MainActivity.this, ConvertMoney.class);
        startActivity(intent3);

    }

    public void clickRateApp(View view)
    {
        Intent intent4 = new Intent(MainActivity.this, RatingAct.class);
        startActivity(intent4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
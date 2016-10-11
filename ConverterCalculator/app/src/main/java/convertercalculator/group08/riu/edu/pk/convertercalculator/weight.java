package convertercalculator.group08.riu.edu.pk.convertercalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.*;


public class weight extends ActionBarActivity {

        CheckBox checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
    }

    public void WeightChecked(View view)
    {
        checkbox = (CheckBox) findViewById(R.id.checkBox12);
        TextView uni = (TextView) findViewById(R.id.unitss);
        uni.setText("NULL");
    }

    public void clickKG(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox12);

        if(check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 0.001;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("kg");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 0.001;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }

    }

    public void clickOunce(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox12);

        if(check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 0.035274;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("Oz");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 0.035274;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }
    }

    public void clickMiliGrams(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox12);

        if(check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 1000;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("mg");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 1000;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }
    }

    public void clickMGrams(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox12);

        if(check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 1000000;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("µg");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.weight_editText);
            double ans = Double.parseDouble(txt.getText().toString());
            double convert = ans * 1000000;

            TextView dis = (TextView) findViewById(R.id.display);
            dis.setText(valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_weight, menu);
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

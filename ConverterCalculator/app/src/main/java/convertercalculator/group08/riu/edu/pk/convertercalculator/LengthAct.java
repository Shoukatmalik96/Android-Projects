package convertercalculator.group08.riu.edu.pk.convertercalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class LengthAct extends ActionBarActivity {

    CheckBox checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
    }

    public void lengthChecked(View view)
    {
        checkbox = (CheckBox) findViewById(R.id.checkBox13);
        TextView uni = (TextView) findViewById(R.id.unitss);
        uni.setText("NULL");
    }
    public void clickInch(View view) {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox13);
        if (check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 0.393701;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("in");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 0.393701;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }

    }

    public void clickMeters(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox13);
        if (check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 0.01;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("m");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 0.01;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }
    }

    public void clickFeet(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox13);
        if (check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 0.0328084;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("ft");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 0.0328084;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }
    }

    public void clickMilli(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox13);
        if (check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 10;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("mm");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans * 10;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }
    }


    public void clickYards(View view)
    {
        CheckBox check = (CheckBox) findViewById(R.id.checkBox13);
        if (check.isChecked())
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans *  0.0109361;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("yd");
        }
        else
        {
            EditText txt = (EditText) findViewById(R.id.lenght_EditText);
            double ans = Double.parseDouble(txt.getText().toString());

            double convert = ans *  0.0109361;

            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText(String.valueOf(convert));

            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("NULL");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_length, menu);
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

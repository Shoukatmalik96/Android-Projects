package convertercalculator.group08.riu.edu.pk.convertercalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class ConvertMoney extends ActionBarActivity {
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_money);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_convert_money, menu);
        return true;
    }
    public void clickPound(View view)
    {
        CheckBox check;
        check = (CheckBox) findViewById(R.id.checkBox01);

        if(check.isChecked()) {
            TextView scr = (TextView) findViewById(R.id.display);
            scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 152.19;
            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("£");
            scr.setText(String.valueOf(convert));
        }
        else
        {
            TextView scr = (TextView) findViewById(R.id.display);
            scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 152.19;
            TextView uni = (TextView) findViewById(R.id.unitss);

            uni.setText("NULL");
            scr.setText(String.valueOf(convert));
        }
    }
    public void ToEuro(View view)
    {
        CheckBox check;
        check = (CheckBox) findViewById(R.id.checkBox01);

        if(check.isChecked()) {
            TextView scr = (TextView) findViewById(R.id.display);
            scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 0.0089;
            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("€");
            scr.setText(String.valueOf(convert));
        }
        else
        {
            TextView scr = (TextView) findViewById(R.id.display);
            scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 0.0089;
            TextView uni = (TextView) findViewById(R.id.unitss);

            uni.setText("NULL");
            scr.setText(String.valueOf(convert));
        }
    }

    public void ToDinar(View view)
    {
        CheckBox check;
        check = (CheckBox) findViewById(R.id.checkBox01);

        if(check.isChecked()) {
            TextView scr = (TextView) findViewById(R.id.display);
            scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 339.05;
            TextView uni = (TextView) findViewById(R.id.unitss);
            uni.setText("KWD");
            scr.setText(String.valueOf(convert));
        }
        else
        {
            TextView scr = (TextView) findViewById(R.id.display);
            scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 339.05;
            TextView uni = (TextView) findViewById(R.id.unitss);

            uni.setText("NULL");
            scr.setText(String.valueOf(convert));
        }
    }
    public void SaveData(View view)
    {
        TextView scr = (TextView) findViewById(R.id.display);
        EditText txt = (EditText) findViewById(R.id.editText);
        TextView tv = (TextView) findViewById(R.id.unitss);
        Intent i = new Intent(this,SavedData.class);
        i.putExtra("val1",scr.getText().toString());
        i.putExtra("val2",tv.getText().toString());
        i.putExtra("val3",txt.getText().toString());
        startActivity(i);
    }
    public void ClickedCheck(View view)
    {
        check = (CheckBox) findViewById(R.id.checkBox01);
        if(!check.isChecked())
        {
            TextView uni = (TextView) findViewById(R.id.unitss);
            //       TextView uni1 = (TextView) findViewById(R.id.unit_iss);
            //   uni1.setVisibility(view.GONE);
            // uni.setVisibility(view.GONE);
            // uni.setText("");
            uni.setText("NULL");
        }
    }
    public void clickDollar(View view)
    {
        CheckBox check;
        check = (CheckBox) findViewById(R.id.checkBox01);

        if(check.isChecked())
        {
            TextView scr = (TextView) findViewById(R.id.display);
            // scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 101.88;
            scr.setText(String.valueOf(convert));
            TextView uni = (TextView) findViewById(R.id.unitss);
            //     TextView uni1 = (TextView) findViewById(R.id.unit_iss);
            //uni1.setText("");
            uni.setText("$");
        }
        else
        {
            TextView scr = (TextView) findViewById(R.id.display);
            //  scr.setText("");
            EditText txt = (EditText) findViewById(R.id.editText);
            float ans = Float.parseFloat(txt.getText().toString());
            double convert = ans * 101.88;
            scr.setText(String.valueOf(convert));
            TextView uni = (TextView) findViewById(R.id.unitss);
            //   TextView uni1 = (TextView) findViewById(R.id.unit_iss);
            //     uni1.setVisibility(view.GONE);
            //   uni.setVisibility(view.GONE);
            uni.setText("NULL");

        }

        //  Toast.makeText(getApplicationContext(),  "checked", Toast.LENGTH_LONG).show(); //genymotin wala emulator on kryn
        //if(check.isChecked())
        //{

        //TextView uni = (TextView) findViewById(R.id.unitss);
        //uni.setText("$");
        //}
        //else
        //{

        //}


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

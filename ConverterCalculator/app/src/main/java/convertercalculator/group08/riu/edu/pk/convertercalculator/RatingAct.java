package convertercalculator.group08.riu.edu.pk.convertercalculator;

import android.app.AlertDialog;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class RatingAct extends ActionBarActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        final SeekBar seekbar = (SeekBar) findViewById(R.id.seekBar01);
        final TextView scr = (TextView) findViewById(R.id.textView7);


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int pro=0;
                pro = seekBar.getProgress();

                scr.setText(String.valueOf(pro));
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void RadioClick(View view)
    {
    RadioButton b1 = (RadioButton) findViewById(R.id.RatingRadio);
        //RadioButton b2 = (RadioButton) findViewById(R.id.RatingSeekBar);
        SeekBar sb = (SeekBar) findViewById(R.id.seekBar01);
        //RadioGroup rd = (RadioGroup) findViewById(R.id.radioGroup1);
        RadioGroup rd1 = (RadioGroup) findViewById(R.id.rdGroup);
        if(b1.isChecked())
        {
            sb.setVisibility(View.INVISIBLE);
            rd1.setVisibility(View.VISIBLE);
        }
        else
        {
            rd1.setVisibility(View.INVISIBLE);
        }

    }

    public void SeekClick(View view)
    {
       // RadioButton b1 = (RadioButton) findViewById(R.id.RatingRadio);
        RadioButton b2 = (RadioButton) findViewById(R.id.RatingSeekBar);
        SeekBar sb = (SeekBar) findViewById(R.id.seekBar01);
       // RadioGroup rd = (RadioGroup) findViewById(R.id.radioGroup1);
        RadioGroup rd1 = (RadioGroup) findViewById(R.id.rdGroup);
        if(b2.isChecked())
        {
            rd1.setVisibility(View.INVISIBLE);
            sb.setVisibility(View.VISIBLE);
        }
        else
        {
            sb.setVisibility(View.INVISIBLE);
        }
    }

    public void onSubmit(View view)
    {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage("Thankyou for your rating!");
        dlgAlert.setTitle("Conversion Calculator");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }





    public void clickBar(View view)
    {
       // initialize();

   //     SeekBar sb=(SeekBar) findViewById(R.id.seekBar1);
     //   int v, max;
       // v = sb.getProgress();
        //max = sb.getMax();
        //TextView tv=(TextView) findViewById(R.id.ratescr);
        //tv.setText(String.valueOf(v));
    }
//    public void initialize()
  //  {

    //}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rating, menu);
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

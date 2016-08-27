package com.example.android.justjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_add=(Button)findViewById(R.id.btn_add);
        Button btn_sub=(Button)findViewById(R.id.btn_subtract);
        Button btn_order=(Button)findViewById(R.id.btn_order);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incremtnt(view);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrement(view);
            }
        });

        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SubmitValue(view);
            }
        });
    }

    private void incremtnt(View view){

        quantity=quantity+1;
        display(quantity);

    }
    private void decrement(View view){
        quantity=quantity-1;
        display(quantity);

    }
    /**
     * This is called when Order Button is Clicked
     */
    public void SubmitValue(View view){

        TextView tbx_quantity=(TextView)findViewById(R.id.quantity_text_view);
        displayPrice(Integer.parseInt(tbx_quantity.getText().toString())*5);

    }
    public void displayMessage(String message){
        TextView priceTextView=(TextView)findViewById(R.id.price);
        priceTextView.setText(message);

    }

    /*
     * This method display the given quantiy value on the screen.
     */
    public void display(int number) {
        TextView quantityTextView=(TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText(Integer.toString(number));

    }
    private void displayPrice(int number){
       TextView priceTextView=(TextView)findViewById(R.id.price);
       priceTextView.setText(Integer.toString(number));
    }
}

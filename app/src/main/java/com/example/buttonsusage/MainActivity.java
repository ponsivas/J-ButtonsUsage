package com.example.buttonsusage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button BT1,BT2,BT3,BT4,BT5;
    ToggleButton TB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BT1  = (Button) findViewById(R.id.BTN1);
        BT2  = (Button) findViewById(R.id.BTN2);
        BT3  = (Button) findViewById(R.id.BTN3);
        BT4  = (Button) findViewById(R.id.BTN4);
        BT5  = (Button) findViewById(R.id.BTN5);
        TB  = (ToggleButton) findViewById(R.id.toggleButton);

        BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Button 3 was clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TB.isChecked();
                if (!TB.isChecked()){
                    Toast.makeText(getBaseContext(), "Toggle mode is OFF", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getBaseContext(), "Toggle mode is ON", Toast.LENGTH_SHORT).show();
                }

            }
        });

        BT1.setOnClickListener(button1Special);
        BT2.setOnClickListener(button2Special);
        BT4.setOnClickListener(btn4Listener);
        BT5.setOnClickListener(btn5Listener);
    }

    private View.OnClickListener button1Special = new View.OnClickListener() {
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),((Button) view).getText() + " was clicked!", Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener button2Special = new View.OnClickListener() {
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),((Button) view).getText() + " was clicked!", Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener btn4Listener = new View.OnClickListener() {
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),((Button) view).getText() + " was clicked!", Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener btn5Listener = new View.OnClickListener() {
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),((Button) view).getText() + " was clicked!", Toast.LENGTH_LONG).show();
        }
    };
}
package mm.ua.shopclient;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button btnLOTR;
    Button btnHP;
    Button btnAC;
    Button btnOk;
    TextView tv;
    int totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLOTR = (Button) findViewById(R.id.buttonLOTR);
        btnLOTR.setOnClickListener(this);
        btnHP = (Button) findViewById(R.id.buttonHP);
        btnHP.setOnClickListener(this);
        btnAC = (Button) findViewById(R.id.buttonAC);
        btnAC.setOnClickListener(this);
        btnOk = (Button) findViewById(R.id.buttonOK);
        btnAC.setOnClickListener(this);
        tv = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLOTR:
                Toast toast = Toast.makeText(this, "LOTR", Toast.LENGTH_SHORT);
                toast.show();
                totalPrice += 5;
                tv.setText("Total price: "+(totalPrice));
                break;
            case R.id.buttonHP:
                toast = Toast.makeText(this, "HP", Toast.LENGTH_SHORT);
                toast.show();
                totalPrice+= 3;
                tv.setText("Total price: "+(totalPrice));
                break;
            case R.id.buttonAC:
                toast = Toast.makeText(this, "AC", Toast.LENGTH_SHORT);
                toast.show();
                totalPrice+= 8;
                tv.setText("Total price: "+(totalPrice));
                break;
        }
    }
}
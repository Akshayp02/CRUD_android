package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1,textView2;
    private double first ,second,result;
    private String operation , ans ;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnClear,btnDelete,btnPercentage,btnDiv,btnDot,btnAdd,btnsub,btnMultiply,btnEquals,btnzero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FIRST_APPLICATION_WINDOW);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.TextView1);
        textView2=findViewById(R.id.TextView2);
        btn1=findViewById(R.id.btnOne);
        btn2=findViewById(R.id.btnTwo);
        btn3=findViewById(R.id.btnTree);
        btn4=findViewById(R.id.btnFour);
        btn5=findViewById(R.id.btnFive);
        btn6=findViewById(R.id.btnSix);
        btn7=findViewById(R.id.btnSeven);
        btn8=findViewById(R.id.btnEight);
        btn9=findViewById(R.id.btnNine);
        btnzero=findViewById(R.id.btnZero);
        btnDot=findViewById(R.id.btnDot);

        btnClear=findViewById(R.id.btnClear);
        btnDelete=findViewById(R.id.btnDel);
        btnPercentage=findViewById(R.id.btnPercentage);
        btnDiv=findViewById(R.id.btnDiv);
        btnAdd=findViewById(R.id.btnAdd);
        btnsub=findViewById(R.id.btnSub);
        btnMultiply=findViewById(R.id.btnMulti);
        btnEquals=findViewById(R.id.btnEquals);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(null);
                textView2.setText(null);
            }
        });

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btnzero.getText().toString();
                textView2.setText(text);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn1.getText().toString();
                textView2.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn2.getText().toString();
                textView2.setText(text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn3.getText().toString();
                textView2.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn4.getText().toString();
                textView2.setText(text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn5.getText().toString();
                textView2.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn6.getText().toString();
                textView2.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn7.getText().toString();
                textView2.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn8.getText().toString();
                textView2.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btn9.getText().toString();
                textView2.setText(text);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView2.getText().toString()+btnDot.getText().toString();
                textView2.setText(text);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Delete = null;
                if(textView2.getText().toString().length()>0){
                    StringBuilder stringBuilder=new StringBuilder(textView2.getText());
                    stringBuilder.deleteCharAt(textView2.getText().length()-1);
                    Delete= stringBuilder.toString();
                    textView2.setText(Delete);
                }
            }
        });






        // code for Oparaters
        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first=Double.parseDouble((String) textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText(" ");
                operation="%";
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first=Double.parseDouble((String) textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText(" ");
                operation="/";
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first=Double.parseDouble((String) textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText(" ");
                operation="-";
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first=Double.parseDouble((String) textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText(" ");
                operation="*";
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first=Double.parseDouble((String) textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText(" ");
                operation="+";
            }
        });

        //// Equal start from hare

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second=Double.parseDouble((String) textView2.getText());
                if(operation=="+"){
                    result=first+second;
                    ans=String.format("%.2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }
                if(operation=="-"){
                    result=first-second;
                    ans=String.format("%.2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }
                if(operation=="/"){
                    result=first/second;
                    ans=String.format("%.2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }
                if(operation=="*"){
                    result=first*second;
                    ans=String.format("%.2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }
                if(operation=="%"){
                    result=first%second;
                    ans=String.format("%.2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }
            }
        });












    }
}
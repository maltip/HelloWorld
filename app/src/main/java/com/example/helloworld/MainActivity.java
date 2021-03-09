package com.example.helloworld;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private boolean clicked;
    private Button colorChanger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorChanger=findViewById(R.id.button2ChangeText);
        clicked = false;
    }
/** Called when the button is clicked **/

public void changeColor(View view){

    if(!clicked) {
        colorChanger.setText(getResources().getText(R.string.button2_clicked));
        colorChanger.setBackgroundColor(getResources().getColor(R.color.colorRed,getResources().newTheme()));
        clicked=true;
    }else{
            colorChanger.setText(getResources().getText(R.string.button2_not_clicked));
            colorChanger.setBackgroundColor(getResources().getColor(R.color.colorGray, getResources().newTheme()));
            clicked = false;
        }
    }

}

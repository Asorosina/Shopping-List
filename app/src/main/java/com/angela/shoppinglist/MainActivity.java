package com.angela.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.angela.shoppinglist.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    private static final String DATA_ID = "data_preferences";
    private ActivityMainBinding binding;

    DatabaseController db = new DatabaseController(MainActivity.this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        SharedPreferences sharedPreferences = getSharedPreferences(DATA_ID, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.apply();
        boolean flag = sharedPreferences.getBoolean("flagData",false);


        if (!flag) {
            setDefaultData();
        }
        readData();

        //set flag to true
        editor.putBoolean("flagData", true);
        editor.apply();


        //set checked
       if (sharedPreferences.getBoolean("1",false)) {
           binding.checkBox1.setChecked(true);
       }
       if (sharedPreferences.getBoolean("2",false)) {
            binding.checkBox2.setChecked(true);
        }
        if (sharedPreferences.getBoolean("3",false)) {
            binding.checkBox3.setChecked(true);
        }
        if (sharedPreferences.getBoolean("4",false)) {
            binding.checkBox4.setChecked(true);
        }
        if (sharedPreferences.getBoolean("5",false)) {
            binding.checkBox5.setChecked(true);
        }
        if (sharedPreferences.getBoolean("6",false)) {
            binding.checkBox6.setChecked(true);
        }
        if (sharedPreferences.getBoolean("7",false)) {
            binding.checkBox7.setChecked(true);
        }
        if (sharedPreferences.getBoolean("8",false)) {
            binding.checkBox8.setChecked(true);
        }
        if (sharedPreferences.getBoolean("9",false)) {
            binding.checkBox9.setChecked(true);
        }
        if (sharedPreferences.getBoolean("10",false)) {
            binding.checkBox10.setChecked(true);
        }
        if (sharedPreferences.getBoolean("11",false)) {
            binding.checkBox11.setChecked(true);
        }
        if (sharedPreferences.getBoolean("12",false)) {
            binding.checkBox13.setChecked(true);
        }
        if (sharedPreferences.getBoolean("13",false)) {
            binding.checkBox13.setChecked(true);
        }
        if (sharedPreferences.getBoolean("14",false)) {
            binding.checkBox14.setChecked(true);
        }
        if (sharedPreferences.getBoolean("15",false)) {
            binding.checkBox15.setChecked(true);
        }
        if (sharedPreferences.getBoolean("16",false)) {
            binding.checkBox16.setChecked(true);
        }
        if (sharedPreferences.getBoolean("17",false)) {
            binding.checkBox17.setChecked(true);
        }



        //set listeners checkBox
        binding.checkBox1.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("1",false)) {
                editor.putBoolean("1", false);
            }else {
                editor.putBoolean("1", true);
            }
            editor.apply();
        });
        binding.checkBox2.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("2",false)) {
                editor.putBoolean("2", false);
            }else {
                editor.putBoolean("2", true);
            }
            editor.apply();

        });
        binding.checkBox3.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("3",false)) {
                editor.putBoolean("3", false);
            }else {
                editor.putBoolean("3", true);
            }
            editor.apply();
        });
        binding.checkBox4.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("4",false)) {
                editor.putBoolean("4", false);
            }else {
                editor.putBoolean("4", true);
            }
            editor.apply();
        });
        binding.checkBox5.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("5",false)) {
                editor.putBoolean("5", false);
            }else {
                editor.putBoolean("5", true);
            }
            editor.apply();
        });
        binding.checkBox6.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("6",false)) {
                editor.putBoolean("6", false);
            }else {
                editor.putBoolean("6", true);
            }
            editor.apply();
        });
        binding.checkBox7.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("7",false)) {
                editor.putBoolean("7", false);
            }else {
                editor.putBoolean("7", true);
            }
            editor.apply();
        });
        binding.checkBox8.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("8",false)) {
                editor.putBoolean("8", false);
            }else {
                editor.putBoolean("8", true);
            }
            editor.apply();
        });
        binding.checkBox9.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("9",false)) {
                editor.putBoolean("9", false);
            }else {
                editor.putBoolean("9", true);
            }
            editor.apply();
        });
        binding.checkBox10.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("10",false)) {
                editor.putBoolean("10", false);
            }else {
                editor.putBoolean("10", true);
            }
            editor.apply();
        });
        binding.checkBox11.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("11",false)) {
                editor.putBoolean("11", false);
            }else {
                editor.putBoolean("11", true);
            }
            editor.apply();
        });
        binding.checkBox12.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("12",false)) {
                editor.putBoolean("12", false);
            }else {
                editor.putBoolean("12", true);
            }
            editor.apply();
        });
        binding.checkBox13.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("13",false)) {
                editor.putBoolean("13", false);
            }else {
                editor.putBoolean("13", true);
            }
            editor.apply();
        });
        binding.checkBox14.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("14",false)) {
                editor.putBoolean("14", false);
            }else {
                editor.putBoolean("14", true);
            }
            editor.apply();
        });
        binding.checkBox15.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("15",false)) {
                editor.putBoolean("15", false);
            }else {
                editor.putBoolean("15", true);
            }
            editor.apply();
        });
        binding.checkBox16.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("16",false)) {
                editor.putBoolean("16", false);
            }else {
                editor.putBoolean("16", true);
            }
            editor.apply();
        });
        binding.checkBox17.setOnClickListener(v -> {
            if (sharedPreferences.getBoolean("17",false)) {
                editor.putBoolean("17", false);
            }else {
                editor.putBoolean("17", true);
            }
            editor.apply();
        });

        //set listeners deleteButton
        binding.imageButton1.setOnClickListener(v -> {
            binding.editText1.setText("");


        });
        binding.imageButton2.setOnClickListener(v -> {
            binding.editText2.setText("");

        });
        binding.imageButton3.setOnClickListener(v -> {
            binding.editText3.setText("");

        });
        binding.imageButton4.setOnClickListener(v -> {
            binding.editText4.setText("");

        });
        binding.imageButton5.setOnClickListener(v -> {
            binding.editText5.setText("");

        });
        binding.imageButton6.setOnClickListener(v -> {
            binding.editText6.setText("");

        });
        binding.imageButton7.setOnClickListener(v -> {
            binding.editText7.setText("");

        });
        binding.imageButton8.setOnClickListener(v -> {
            binding.editText8.setText("");

        });
        binding.imageButton9.setOnClickListener(v -> {
            binding.editText9.setText("");
           ;
        });
        binding.imageButton10.setOnClickListener(v -> {
            binding.editText10.setText("");

        });
        binding.imageButton11.setOnClickListener(v -> {
            binding.editText11.setText("");

        });
        binding.imageButton12.setOnClickListener(v -> {
            binding.editText12.setText("");

        });
        binding.imageButton13.setOnClickListener(v -> {
            binding.editText13.setText("");

        });
        binding.imageButton14.setOnClickListener(v -> {
            binding.editText14.setText("");

        });
        binding.imageButton15.setOnClickListener(v -> {
            binding.editText15.setText("");

        });
        binding.imageButton16.setOnClickListener(v -> {
            binding.editText16.setText("");

        });
        binding.imageButton17.setOnClickListener(v -> {
            binding.editText17.setText("");

        });


    }
public void setDefaultData(){
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");
    db.addItem(" ");


}
    public void readData() {

        binding.editText1.setText(db.getItem(1));
        binding.editText2.setText(db.getItem(2));
        binding.editText3.setText(db.getItem(3));
        binding.editText4.setText(db.getItem(4));
        binding.editText5.setText(db.getItem(5));
        binding.editText6.setText(db.getItem(6));
        binding.editText7.setText(db.getItem(7));
        binding.editText8.setText(db.getItem(8));
        binding.editText9.setText(db.getItem(9));
        binding.editText10.setText(db.getItem(10));
        binding.editText11.setText(db.getItem(11));
        binding.editText12.setText(db.getItem(12));
        binding.editText13.setText(db.getItem(13));
        binding.editText14.setText(db.getItem(14));
        binding.editText15.setText(db.getItem(15));
        binding.editText16.setText(db.getItem(16));
        binding.editText17.setText(db.getItem(17));

    }


    ////save data to table
    public void onPause() {
        super.onPause();

        db.updateItem(1, binding.editText1.getText().toString());
        db.updateItem(2, binding.editText2.getText().toString());
        db.updateItem(3, binding.editText3.getText().toString());
        db.updateItem(4, binding.editText4.getText().toString());
        db.updateItem(5, binding.editText5.getText().toString());
        db.updateItem(6, binding.editText6.getText().toString());
        db.updateItem(7, binding.editText7.getText().toString());
        db.updateItem(8, binding.editText8.getText().toString());
        db.updateItem(9, binding.editText9.getText().toString());
        db.updateItem(10, binding.editText10.getText().toString());
        db.updateItem(11, binding.editText11.getText().toString());
        db.updateItem(12, binding.editText12.getText().toString());
        db.updateItem(13, binding.editText13.getText().toString());
        db.updateItem(14, binding.editText14.getText().toString());
        db.updateItem(15, binding.editText15.getText().toString());
        db.updateItem(16, binding.editText16.getText().toString());
        db.updateItem(17, binding.editText17.getText().toString());


    }



}
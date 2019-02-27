package edu.cs.birzeit.moreviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swtOnClick(View view) {
        Switch swt = (Switch)findViewById(R.id.swt);
        boolean flag = swt.isChecked();
        if(flag){
            Toast.makeText(this, "Switch is On", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Switch is Off", Toast.LENGTH_SHORT).show();
        }


    }

    public void btnSendOnClick(View view) {
        String str = "";
        CheckBox chkMilk = (CheckBox)findViewById(R.id.chkMilk);
        CheckBox chkBread = (CheckBox)findViewById(R.id.chkBread);

        if(chkMilk.isChecked()){
            str+="Milk is checked";
        }
        if(chkBread.isChecked()){
            str+="\nBread is Checked";
        }


        RadioGroup group = (RadioGroup)findViewById(R.id.rdoGroup);
        int id  = group.getCheckedRadioButtonId();
        if(id == R.id.rdoFemale){
            str+="\nFemale";
        }
        else if(id == R.id.rdoMale){
            str+="\nMale";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void chkOnClick(View view) {
        CheckBox chk = (CheckBox)view;
        int id = chk.getId();
        switch(id){
            case R.id.chkMilk:
                Toast.makeText(this, "Milk is Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chkBread:
                Toast.makeText(this, "Bread is Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chkMeat:
                Toast.makeText(this, "Meat is Checked", Toast.LENGTH_SHORT).show();
        }
    }
}

package br.com.etecia.tecnoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionFour_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four_layout);
    }

    public void nextQ(View view) {

        RadioButton correta = (RadioButton) findViewById(R.id.btnCorreta);





        if (correta.isChecked()) {

            Toast.makeText(getApplicationContext(),"Congratulations, you're right!!!",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuestionFour_Activity.this, QuestionFive_Activity.class);
            startActivity(intent);
            finish();

        }else{
            Toast.makeText(getApplicationContext(),"You're wrong, try again",Toast.LENGTH_SHORT).show();
        }

    }
}

package br.com.etecia.tecnoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionEleven_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questioneleven_layout);
    }

    public void nextQ(View view) {

        RadioButton correta = (RadioButton) findViewById(R.id.btnCorreta);





        if (correta.isChecked()) {

            Toast.makeText(getApplicationContext(),"Congratilations, you're right!!!",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuestionEleven_Activity.this, QuestionTwelve_Activity.class);
            startActivity(intent);


        }else{
            Toast.makeText(getApplicationContext(),"You're wrong, try again",Toast.LENGTH_SHORT).show();
        }
    }
}

package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Android;
    TextView iPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Android=findViewById(R.id.textView);
        iPad=findViewById(R.id.textView2);

        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name","Android Programming");
                intent.putExtra("year","2018");
                intent.putExtra("Semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W66M");
                startActivity(intent);

            }
        });

        iPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);
                intent.putExtra("code", "C349");
                intent.putExtra("name","iPad Programming");
                intent.putExtra("year","2019");
                intent.putExtra("Semester", "2");
                intent.putExtra("credit", "100");
                intent.putExtra("venue", "W66H");
                startActivity(intent);
            }
        });
    }
}

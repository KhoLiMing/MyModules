package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView Code;
    TextView Name;
    TextView Year;
    TextView Semester;
    TextView Credit;
    TextView Venue;
    Button Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Code=findViewById(R.id.textViewCode);
        Name=findViewById(R.id.textViewName);
        Year=findViewById(R.id.textViewYear);
        Semester=findViewById(R.id.textViewSemester);
        Credit=findViewById(R.id.textViewCredit);
        Venue=findViewById(R.id.textViewVenue);
        Return=findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        Code.setText("Module Code: " + code);

        String name = intentReceived.getStringExtra("name");
        Name.setText("Module Name: " + name);

        String year = intentReceived.getStringExtra("year");
        Year.setText("Academic Year: " + year);

        String sem = intentReceived.getStringExtra("Semester");
        Semester.setText("Semester: " + sem);

        String credit = intentReceived.getStringExtra("credit");
        Credit.setText("Module Credit: " + credit);

        String venue = intentReceived.getStringExtra("venue");
        Venue.setText("Venue: " + venue);

        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });



    }
}

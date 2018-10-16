package my.edu.tarc.skthello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main()function
        super.onCreate(savedInstanceState);
        //To display UI
        //R = resource class
        //layout = folder
        setContentView(R.layout.activity_main);
        //Linking UI to program
        textViewMsg=findViewById(R.id.textViewMessage);
    }
    //View is a class
    //v is an instance of a class
    public void showMessage(View v)
    {
        textViewMsg.setText("Hello,hihihi");
    }
    public void clearScreen(View v)
    {
        textViewMsg.setText("");
    }
}

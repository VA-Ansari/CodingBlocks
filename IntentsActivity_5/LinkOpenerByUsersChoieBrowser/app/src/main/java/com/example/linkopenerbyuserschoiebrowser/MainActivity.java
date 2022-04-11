package com.example.linkopenerbyuserschoiebrowser;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText etweburl;
    ImageButton btnbrowse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etweburl = findViewById(R.id.etWebUrl);
        btnbrowse = findViewById(R.id.btnbrowse);

        btnbrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = etweburl.getText().toString();

                //we have to take Strings and make them into Uri, so that we can perform some http actions
                //this call will take a String and converts it into Uri
                Uri uri = Uri.parse(url);

                //ACTION_VIEW are used to open things, whether it is a Url or open a file
                //so, all of these actions are inside Action_View
                //and then we pass that Uri into another parameter of that intent action view
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(i);
                } catch (ActivityNotFoundException anfe){
                    Log.e(TAG, "Could not open activity with given URL", anfe);
                    Toast.makeText(MainActivity.this, "could not find any app to open this linl", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
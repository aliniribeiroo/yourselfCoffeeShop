package yourself.aliniribeiro.com.yourself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Coffee extends AppCompatActivity {

    private ImageView coffee1;
    private ImageView coffee2;
    private ImageView coffee3;
    private ImageView coffee4;
    private ImageView coffee5;
    private ImageView coffee6;
    private ImageView coffee7;
    private ImageView coffee8;
    private ImageView coffee9;
    private ImageView coffee10;
    private ImageView coffee11;
    private ImageView coffee12;

    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        description = getResources().getString(R.string.description);

        coffee1 = (ImageView) findViewById(R.id.coffee1);
        coffee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });

        coffee2 = (ImageView) findViewById(R.id.coffee2);
        coffee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });

        coffee3 = (ImageView) findViewById(R.id.coffee3);
        coffee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee4 = (ImageView) findViewById(R.id.coffee4);
        coffee4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee5 = (ImageView) findViewById(R.id.coffee5);
        coffee5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee6 = (ImageView) findViewById(R.id.coffee6);
        coffee6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee7 = (ImageView) findViewById(R.id.coffee7);
        coffee7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee8 = (ImageView) findViewById(R.id.coffee8);
        coffee8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee9 = (ImageView) findViewById(R.id.coffee9);
        coffee9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee10 = (ImageView) findViewById(R.id.coffee10);
        coffee10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee11 = (ImageView) findViewById(R.id.coffee11);
        coffee11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
        coffee12 = (ImageView) findViewById(R.id.coffee12);
        coffee12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, description, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

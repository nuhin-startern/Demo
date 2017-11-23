package xyz.sheba.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

public class Second extends AppCompatActivity {

    Button txtNewOrdersRejecttButton;
    Button txtNewOrdersAcceptButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_order);

        txtNewOrdersRejecttButton = (Button) findViewById(R.id.txtNewOrdersRejecttButton);
        txtNewOrdersAcceptButton = (Button) findViewById(R.id.txtNewOrdersAcceptButton);
        txtNewOrdersRejecttButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Second.this, Third.class);
                startActivity(in);
            }
        });
        txtNewOrdersAcceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Second.this, Fourth.class);
                startActivity(in);
            }
        });
    }
}

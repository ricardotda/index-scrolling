package ricardotda.indexscrolling.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import ricardotda.indexscrolling.R;

public class Home extends ActionBarActivity implements View.OnClickListener {

    Button scrool1;
    Button scrool2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);

        scrool1 = (Button) findViewById(R.id.scrool1);
        scrool1.setOnClickListener(this);

        scrool2 = (Button) findViewById(R.id.scrool2);
        scrool2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.scrool1 :
                startActivity(new Intent(this, QuicklyScrollListViewActivity.class));
                break;
            case R.id.scrool2 :
                startActivity(new Intent(this, AlphabetIndexer.class));
                break;
        }
    }
}

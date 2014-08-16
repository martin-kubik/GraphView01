package cz.app;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 setContentView(R.layout.activity_main);

	        ((Button) findViewById(R.id.btn_simple)).setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
	                startGraphActivity(SimpleGraph.class);
	            }
	        });
	        
	        ((Button) findViewById(R.id.btn_realtime)).setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
	                startGraphActivity(RealtimeGraph.class);
	            }
	        });
		
	}
	
	 private void startGraphActivity(Class<? extends Activity> activity) {
	        Intent intent = new Intent(MainActivity.this, activity);
	        
	            intent.putExtra("type", "line");
	        
	        startActivity(intent);
	    }
	}

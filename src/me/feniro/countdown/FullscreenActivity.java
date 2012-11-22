package me.feniro.countdown;

import me.feniro.countdown.util.SystemUiHider;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {
    /*
     * Count value, can be seen on button1.
     */
    private int count = 0;
    
    /*
     * Main button of the application. Count number of clicks on itself.
     */
    private Button button1;

    /*
     * (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				count++;
				button1.setText(count + " ");
			}
        	
        });
        button1.setText(count + " ");
    }

}

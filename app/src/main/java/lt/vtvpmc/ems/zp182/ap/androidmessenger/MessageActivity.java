package lt.vtvpmc.ems.zp182.ap.androidmessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    private TextView receivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        receivedMessage = (TextView) findViewById(R.id.receivedMessage);
        Intent intent = getIntent();
        String message = intent.getStringExtra("msg");

        receivedMessage.setText(message);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MessageCreateActivity.class);
        intent.putExtra("msg", this.receivedMessage.getText().toString() + " - android");
        startActivity(intent);
    }
}

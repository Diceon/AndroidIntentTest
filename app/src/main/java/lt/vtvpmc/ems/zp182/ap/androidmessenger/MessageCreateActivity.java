package lt.vtvpmc.ems.zp182.ap.androidmessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MessageCreateActivity extends AppCompatActivity {

    private EditText messageToSend;
    private TextView backMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        messageToSend = (EditText) findViewById(R.id.messageToSend);
        backMessage = (TextView) findViewById(R.id.receivedBackMessage);

        Intent intent = getIntent();

        if (intent.hasExtra("msg")) {
            backMessage.setText(intent.getStringExtra("msg"));
        }

    }

    public void sendMessage(View view) {
        String message = messageToSend.getText().toString();

        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra("msg", message);
        startActivity(intent);
    }
}

package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    EditText editEmail;
    NameValidation nameValidation;
    EmailValidation emailValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.userNameInput);
        editEmail = findViewById(R.id.emailInput);

        nameValidation = new NameValidation(this);
        emailValidation = new EmailValidation(this);
    }

    public void onSaveClick(View view) {
        //TODO
        String name = editName.getText().toString();
        String email = editEmail.getText().toString();
        Toast.makeText(this, nameValidation.isNameValidation(name).getStringValidation()
                + " and " + emailValidation.isEmailValidation(email).getStringValidation(),
                Toast.LENGTH_LONG).show();
    }

    public void onRevertClick(View view) {
        //TODO
        editName.setText("");
        editEmail.setText("");
        Toast.makeText(this, "Clear!", Toast.LENGTH_LONG).show();
    }
}

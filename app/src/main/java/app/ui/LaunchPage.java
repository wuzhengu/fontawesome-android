package app.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LaunchPage extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle bundle){
        super.onCreate(bundle);

        startActivity(new Intent(this, DemoPage.class));
        finish();
    }
}

package app.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import app.builtin.R;

public class DemoPage extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle bundle){
        super.onCreate(bundle);

        setContentView(R.layout.demo_page);

        Typeface font = ResourcesCompat.getFont(this, R.font.fa_regular);
        CharSequence text = getText(R.string.fa_user);

        TextView textView = findViewById(R.id.textView);
        textView.setTypeface(font);
        textView.setText(text);
    }
}

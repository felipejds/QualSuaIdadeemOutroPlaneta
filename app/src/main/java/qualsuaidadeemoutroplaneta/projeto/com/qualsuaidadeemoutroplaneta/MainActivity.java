package qualsuaidadeemoutroplaneta.projeto.com.qualsuaidadeemoutroplaneta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoDescobrirIdade;
    NumberPicker noPickerDay    = null;
    NumberPicker noPickerMonth  = null;
    NumberPicker noPickerYear   = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoDescobrirIdade = (ImageView) findViewById(R.id.descobrirIdadeId);

        String dataini = Planets_Activity.getDateTime();
        String[] parts = dataini.split("/");
        String part1 = parts[0]; // DD
        String part2 = parts[1]; // MM
        String part3 = parts[2]; // AAAA

        noPickerDay = (NumberPicker) findViewById(R.id.numberPickerDId);
        noPickerDay.setMaxValue(31);
        noPickerDay.setMinValue(01);
        noPickerDay.setValue(Integer.parseInt(part1));
        //noPickerDay.setWrapSelectorWheel(true);

        noPickerMonth = (NumberPicker) findViewById(R.id.numberPickerMId);
        noPickerMonth.setMaxValue(12);
        noPickerMonth.setMinValue(01);
        noPickerMonth.setValue(Integer.parseInt(part2));
        //noPickerMonth.setWrapSelectorWheel(false);

        noPickerYear = (NumberPicker) findViewById(R.id.numberPickerYId);
        noPickerYear.setMaxValue(2017);
        noPickerYear.setMinValue(1900);
        //noPickerYear.setWrapSelectorWheel(false);
        noPickerYear.setValue(Integer.parseInt(part3));

        botaoDescobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int noPickerDigDay      = noPickerDay.getValue();
                int noPickerDigMonth    = noPickerMonth.getValue();
                int noPickerDigYear     = noPickerYear.getValue();
                String idadeDigitada    = Integer.toString(noPickerDigDay)   + "/" +
                        Integer.toString(noPickerDigMonth) + "/" +
                        Integer.toString(noPickerDigYear);

                Intent intent = new Intent(MainActivity.this, Planets_Activity.class);
                intent.putExtra("idade", idadeDigitada);

                startActivity( intent );
            }
        });

    }
}

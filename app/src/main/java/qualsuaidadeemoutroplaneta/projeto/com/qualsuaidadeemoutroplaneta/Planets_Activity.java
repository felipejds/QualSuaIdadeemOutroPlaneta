package qualsuaidadeemoutroplaneta.projeto.com.qualsuaidadeemoutroplaneta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Planets_Activity extends AppCompatActivity {

    private TextView resultadoMercurio;
    private TextView resultadoVenus;
    private TextView resultadoTerra;
    private TextView resultadoMarte;
    private TextView resultadoJupiter;
    private TextView resultadoSaturno;
    private TextView resultadoUrano;
    private TextView resultadoNetuno;
    private TextView resultadoPlutao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets_);

        resultadoMercurio   = (TextView)    findViewById(R.id.resultadoMercurioId);
        resultadoVenus      = (TextView)    findViewById(R.id.resultadoVenusId);
        resultadoTerra      = (TextView)    findViewById(R.id.resultadoTerraId);
        resultadoMarte      = (TextView)    findViewById(R.id.resultadoMarteId);
        resultadoJupiter    = (TextView)    findViewById(R.id.resultadoJupiterId);
        resultadoSaturno    = (TextView)    findViewById(R.id.resultadoSaturnoId);
        resultadoUrano      = (TextView)    findViewById(R.id.resultadoUranoId);
        resultadoNetuno     = (TextView)    findViewById(R.id.resultadoNetunoId);
        resultadoPlutao     = (TextView)    findViewById(R.id.resultadoPlutaoId);

        Bundle extra = getIntent().getExtras();
        String textoPassado = extra.getString("idade");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataBase = null;
        Date vencimento = null;
        String data = getDateTime();

        try {
            dataBase = sdf.parse(textoPassado);
            vencimento = sdf.parse(data);
        } catch (java.text.ParseException e) { return; }

        long diferencaMS = vencimento.getTime() - dataBase.getTime();
        long diferencaSegundos = diferencaMS / 1000;
        long diferencaMinutos = diferencaSegundos / 60;

        oldMercurio(diferencaMinutos);
        oldVenus(diferencaMinutos);
        oldTerra(diferencaMinutos);
        oldMarte(diferencaMinutos);
        oldJupiter(diferencaMinutos);
        oldSaturno(diferencaMinutos);
        oldUrano(diferencaMinutos);
        oldNetuno(diferencaMinutos);
        oldPlutao(diferencaMinutos);
    }

    //MERCURIO
    private void oldMercurio(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.0");
        long diferencaHoras = (long) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 1409);
        float diferencaAnos = (float) (diferencaDias / 1.498);
        resultadoMercurio.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Mercúrio");
    }

    //VENUS
    private void oldVenus(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.00");
        long diferencaHoras = (long) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 5780);
        float diferencaAnos = (float) (diferencaDias / 0.922);
        resultadoVenus.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Vênus");
    }

    //TERRA
    public void oldTerra(long diferencaMinutos) {

        long diferencaHoras = diferencaMinutos / 60;
        long diferencaDias = diferencaHoras / 24;
        int  diferencaAnos = (int) (diferencaDias / 365);
        resultadoTerra.setText("Sua idade é: " + diferencaAnos + " anos, " + diferencaDias + " dias na Terra");
    }

    //MARTE
    private void oldMarte(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.0");
        long diferencaHoras = (long) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 24.7201);
        float diferencaAnos = (float) (diferencaDias / 667.9);
        resultadoMarte.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Marte");
    }

    //JUPITER
    private void oldJupiter(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.0");
        float diferencaHoras = (float) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 9.83999);
        float  diferencaAnos = (float) (diferencaDias / 10570);
        resultadoJupiter.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Júpiter");
    }

    //SATURNO
    private void oldSaturno(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.0");
        float diferencaHoras = (float) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 10.7994);
        float diferencaAnos = (float) (diferencaDias / 23561);

        resultadoSaturno.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Saturno");
    }

    //URANO
    private void oldUrano(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.00");
        float diferencaHoras = (float) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 17.27903);
        float diferencaAnos = (float) (diferencaDias / 43700);
        resultadoUrano.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Urano");

    }

    //NETUNO
    private void oldNetuno(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.00");
        float diferencaHoras = (float) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 16.0791);
        float diferencaAnos = (float) (diferencaDias / 91700);
        resultadoNetuno.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Netuno");

    }

    //PLUTÃO
    private void oldPlutao(long diferencaMinutos) {

        DecimalFormat df =  new DecimalFormat("0.00");
        float diferencaHoras = (float) (diferencaMinutos / 60);
        float diferencaDias = (float) (diferencaHoras / 153.352);
        float diferencaAnos = (float) (diferencaDias / 14569);
        resultadoPlutao.setText("Sua idade é: " + df.format(diferencaAnos) + " anos, " + df.format(diferencaDias) + " dias em Plutão");

    }

    //Metodo data do dia corrente e formatando para "dd/MM/yyyy"
    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

}

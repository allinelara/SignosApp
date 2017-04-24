package br.com.signos.cursoandroid.allinedelara.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
                               "Libra", "Escorpião", "Sagitário", "Capricornio", "Áquario"};

    private String[] perfis = {"Arianos são animados", "Taurionos são positivos", "Geminianos são mutaveis", "Cancerianos são dramaticos",
            "Leoninos são vaidosos", "Virginianos são perfeccionistas",
            "Librianos são desconfiados", "Escorpianos são intensos", "Sagitarianos são palhaços", "Capricornianos são bagunceiros", "Aquarianos são determinados"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, signos
        );

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), perfis[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}

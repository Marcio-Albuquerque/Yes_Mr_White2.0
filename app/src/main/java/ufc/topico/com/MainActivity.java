//Classe principal para chama os subaplicativos
//Equipe: Jonh, Abdenago e Márcio
package ufc.topico.com;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    // Declara variavel
    private Button buttom1;
    private Button buttom2;
    private Intent intent1;
    private Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Faz a ligação do aplicatvo com o layout
        buttom1 = (Button)findViewById(R.id.jogo1Button);
        buttom2 = (Button)findViewById(R.id.jogo2Button);
        intent1 = new Intent(this, MainActivityQuiz.class); // Uma intent para Classa do Quiz Química
        intent2 = new Intent(this, MainActivityCanhao.class); // Uma intent para Classa o Canhão Química

        //Evento para chama o primeiro buttom
        buttom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

        //Evento chama para o segundo buttom
        buttom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }


}

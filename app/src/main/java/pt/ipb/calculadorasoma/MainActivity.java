package pt.ipb.calculadorasoma;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends Activity {
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    @Override protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.editNumero1);
        numero2 = findViewById(R.id.editNumero2);
        resultado = findViewById(R.id.textResultado);
    }
    public void calcular(View view) {
        String a = numero1.getText().toString();
        String b = numero2.getText().toString();
        double valor;

        try {
            if (view.getId() == R.id.buttonSomar) {
                valor = Calculadora.somar(a, b);
            } else if (view.getId() == R.id.buttonSubtrair) {
                valor = Calculadora.subtrair(a, b);
            } else if (view.getId() == R.id.buttonMultiplicar) {
                valor = Calculadora.multiplicar(a, b);
            } else if (view.getId() == R.id.buttonDividir) {
                valor = Calculadora.dividir(a, b);
            } else {
                return;
            }

            resultado.setText(String.valueOf(valor));

        } catch (IllegalArgumentException |
                 ArithmeticException erro) {
            resultado.setText(erro.getMessage());
        }
    }
}

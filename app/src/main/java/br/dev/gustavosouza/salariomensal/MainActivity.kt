package br.dev.gustavosouza.salariomensal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {

            var valorHoraTrabalhada = txtValorHoraTrabalhada.text.toString().toFloat()
            var qtdDiasTrabalhados = txtDiasTrabalhados.text.toString().toInt()
            var qtdHorasTrabalhadas = txtHorasTrabalhadas.text.toString().toInt()

            var iss = 0.05
            var fgts = 0.08

            var salarioBruto = qtdDiasTrabalhados * qtdHorasTrabalhadas * valorHoraTrabalhada
            var descontoiss = salarioBruto * iss
            var descontoFGTS = salarioBruto * fgts
            var salarioLiquido = salarioBruto - (descontoiss + descontoFGTS)

            lblSalarioBruto.text = "Salário Bruto: ${salarioBruto}"
            lblDescISS.text = "Desc. ISS: ${descontoiss}"
            lblDescFGTS.text = "Desc. FTGS: ${descontoFGTS}"
            lblSalarioLiquido.text = "Salário Líquido: ${salarioLiquido}"

        }


    }
}
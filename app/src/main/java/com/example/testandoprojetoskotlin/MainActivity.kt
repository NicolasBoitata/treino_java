package com.example.testandoprojetoskotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testandoprojetoskotlin.databinding.ActivityMainBinding
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPagSeg.setOnClickListener() {

            //nada
            binding.button.setOnClickListener() {
                Toast.makeText(this, "testando, 1 , 2, 3...", Toast.LENGTH_SHORT).show();
            }
            //nada


            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show();
    IrParaSegundaTela()
    }
}

private fun IrParaSegundaTela() {
    val mainActivity2 = Intent(this, MainActivity2::class.java)
    startActivity(mainActivity2)
    }


}

//Toast.makeText(this, "olá pai", Toast.LENGTH_LONG).show();

//tv_resultado.setText("Valor total: R$" + vtotal);
////Toast.makeText(this, "Valor da locação calculado", Toast.LENGTH_LONG).show();
//AlertDialog.Builder cxMsg = new AlertDialog.Builder(context: this);
//cxMsg.setMessage("Valor da locação calculado");
//cxMsg.setNeutralButton("OK", null);
//cxMsg.show();
//Toast.makeText(this, "a", Toast.LENGTH_LONG).show();


//binding.btnPagSeg.setOnClickListener(
//@Override
//public void onClick(View view) {
//    showSuccesDialog();
//}
//)


//
//binding.btnPagSeg.setText();
//AlertDialog.Builder cxMsg = new AlertDialog.Builder(this);
//cxMsg.setMessage("");
//cxMsg.setNeutralButton("OK", null);
//cxMsg.show();
//Toast.makeText(this, "a", Toast.LENGTH_LONG).show();

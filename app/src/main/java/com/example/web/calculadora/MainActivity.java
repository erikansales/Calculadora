package com.example.web.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView   txtVisor;
    private Button      btnC, btnM, btnP,btnSete,   btnOito, btnNove, btnDiv, btnQuatro,
                        btnCinco, btnSeis,btnX,btnUm,btnDois,btnTres, btnMen, btnZero, btnVir,btnIgual,btnMa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVisor = (TextView) findViewById(R.id.txtVisor);

        //pega o botão Clear


        btnX = (Button) findViewById(R.id.btnX);
        btnUm = (Button) findViewById(R.id.btnUm);
        btnDois = (Button) findViewById(R.id.btnDois);
        btnTres = (Button) findViewById(R.id.btnTres);
        btnQuatro = (Button) findViewById(R.id.btnQuatro);
        btnCinco = (Button) findViewById(R.id.btnCinco);
        btnSeis = (Button) findViewById(R.id.btnSeis);
        btnSete = (Button) findViewById(R.id.btnSete);
        btnOito= (Button) findViewById(R.id.btnOito);
        btnNove = (Button) findViewById(R.id.btnNove);
        btnZero = (Button) findViewById(R.id.btnZero);

        btnMen = (Button) findViewById(R.id.btnMen);
      //  btnC = (Button) findViewById(R.id.btnC);
        btnM = (Button) findViewById(R.id.btnM);
        btnP = (Button) findViewById(R.id.btnP);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnVir = (Button) findViewById(R.id.btnVir);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnMa = (Button) findViewById(R.id.btnMa);





        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nmbtnUm = btnUm.getText().toString();
                txtVisor.setText(nmbtnUm);
            }

        });

        btnDois .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnDois = btnDois.getText().toString();
                txtVisor.setText(nmbtnDois);
            }

        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnTres = btnTres.getText().toString();
                txtVisor.setText(nmbtnTres);
            }

        });
        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnQuatro = btnQuatro.getText().toString();
                txtVisor.setText(nmbtnQuatro);
            }

        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnCinco = btnCinco.getText().toString();
                txtVisor.setText(nmbtnCinco);
            }

        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnSeis = btnSeis.getText().toString();
                txtVisor.setText(nmbtnSeis);
            }

        });
        btnSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnSete = btnSete.getText().toString();
                txtVisor.setText(nmbtnSete);
            }

        });
        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnOito = btnOito.getText().toString();
                txtVisor.setText(nmbtnOito);
            }

        });
        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmbtnNove = btnNove.getText().toString();
                txtVisor.setText(nmbtnNove);
            }

        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nmtxtVisor = txtVisor.getText().toString();
                String nmbtnZero = btnZero.getText().toString();
               if (nmtxtVisor.contains(",")) {
                   String txt = nmtxtVisor += nmbtnZero;
                   txtVisor.setText(nmbtnZero);
                }

                //nao entra nesse else
               else{
                    txtVisor.setText(nmbtnZero);
                }
            }

        });

    }


    public void limparVisor(View view) {
        txtVisor.setText("0");
       // String nmNome= idNome.getEditableText().toString();
       // Log.d("Debug","Passou pelo metodo limpar" );
    }

      /*  private EditText idNome, idEmail, idEndereco, idTelefone;
        private Button btnSalvar;
        // private Button btnMedia;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //pega os campos do layout
            idNome = (EditText) findViewById(R.id.idNome);
            idEmail = (EditText) findViewById(R.id.idEmail);
            idEndereco = (EditText) findViewById(R.id.idEndereco);
            idTelefone = (EditText) findViewById(R.id.idTelefone);

            //pega o botão
            btnSalvar =(Button) findViewById(R.id.btnSalvar);

            btnSalvar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    salvar();
                }

            });




        }
    private void salvar (){

        String txt ="";



        // Esse metodo define a ação do botão Salvar. Ao Clicar em Salvar loga os dados digitados
        String nmNome= idNome.getEditableText().toString();
        String nmEmail= idEmail.getEditableText().toString();
        String nmEndereco= idEndereco.getEditableText().toString();
        String nmTelefone= idTelefone.getEditableText().toString();


        Log.d("Debug","Nome digitado:" + nmNome);
        Log.d("Debug","Email digitado:" + nmEmail);
        Log.d("Debug","Endereco digitado:" + nmEndereco);
        Log.d("Debug","Telefone digitado:" + nmTelefone);

        txt = "Nome: "     + nmNome + "\n";
        txt+= "E-mail: "   + nmEmail +"\n";
        txt+= "Endereço: " + nmEndereco  +"\n";
        txt+= "Telefone: " + nmTelefone  +"\n";

        Toast.makeText(getBaseContext(),txt, Toast.LENGTH_LONG).show();*/

     // private EditText txtVisor,
    }



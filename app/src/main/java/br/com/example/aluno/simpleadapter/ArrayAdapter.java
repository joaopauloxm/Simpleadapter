package br.com.example.aluno.simpleadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.example.aluno.simpleadapter.activity.HomeActivity;
import br.com.example.aluno.simpleadapter.entidade.Pedido;

public class ArrayAdapter extends DefaultAtctivit {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);
    }

    public void Exibir(View view) {

        txtid = findViewById(R.id.txtid);
        txtcliente = findViewById(R.id.txtcliente);
        txtdata = findViewById(R.id.txtdata);
        txtvalor = findViewById(R.id.txtvalor);

        String cliente, data;

        long id;
        BigDecimal valor;

        id = Long.parseLong(txtid.getText().toString());
        cliente = txtcliente.getText().toString();
        data = txtdata.getText().toString();
        valor = BigDecimal.valueOf(Long.parseLong(txtvalor.getText().toString()));

        String dados = String.format("Os dados do pedido foram: \n %s \n %s \n %s \n %s", id, cliente,data, valor);

        Toast.makeText(this,dados, Toast.LENGTH_SHORT).show();

        Pedido pedido = new Pedido (id, cliente, data, valor);

        lista.add(pedido);

        List<String> meuArray = new ArrayList<>();

        List<HashMap<String, String>> colecao = new ArrayList<>();

        for (Pedido p : lista) {
            HashMap<String, String> mapas = new HashMap<>();
            mapas.put("id", String.valueOf(p.getId()));
            mapas.put("cliente", p.getCliente());
            mapas.put("data", p.getData());
            mapas.put("valor", String.valueOf(p.getValor()));

            colecao.add(mapas);
            meuArray.add(String.valueOf(p.getId()));

            String[] from = {"id", "cliente", "data", "valor"};
            int[] to = {R.id.txtid, R.id.txtcliente, R.id.txtdata, R.id.txtvalor};

            minhalista = findViewById(R.id.minhalista);

            android.widget.ArrayAdapter<Pedido> arrayAdapter =
                    new android.widget.ArrayAdapter<Pedido>(this,
                            android.R.layout.simple_list_item_1, lista);
            minhalista.setAdapter(arrayAdapter);


        }
    }

    public void voltar(View view) {

        startActivity(new Intent(this,HomeActivity.class));
    }
}

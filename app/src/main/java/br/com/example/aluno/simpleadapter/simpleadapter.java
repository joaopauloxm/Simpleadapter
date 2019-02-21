package br.com.example.aluno.simpleadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.example.aluno.simpleadapter.entidade.Pedido;

public class simpleadapter extends DefaultAtctivit {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleadapter);
    }

    public void Exibir(View view) {
        // Capturar Dados

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

            SimpleAdapter adapter =
                    new SimpleAdapter(this,colecao,
                            R.layout.item,from,to);

            minhalista.setAdapter(adapter);


        }
    }
}

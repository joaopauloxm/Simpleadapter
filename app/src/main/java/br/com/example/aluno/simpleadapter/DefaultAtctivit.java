package br.com.example.aluno.simpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.example.aluno.simpleadapter.entidade.Pedido;

public class DefaultAtctivit extends AppCompatActivity {

    public EditText txtid;
    public EditText txtcliente;
    public EditText txtdata;
    public EditText txtvalor;
    public ListView minhalista;
    public List<Pedido> lista = new ArrayList<>();
}

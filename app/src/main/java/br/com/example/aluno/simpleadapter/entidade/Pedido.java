package br.com.example.aluno.simpleadapter.entidade;

import java.math.BigDecimal;

public class Pedido {

    protected Long id;
    protected String cliente;
    protected String data;
    protected BigDecimal valor;

    public Pedido(final Long id,
                  final String cliente,
                  final String data,
                  final BigDecimal valor) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", cliente='" + cliente + '\'' +
                ", data='" + data + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }

    public Long getId() {
        return Long.valueOf(id);
    }
}
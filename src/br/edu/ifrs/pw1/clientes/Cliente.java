package br.edu.ifrs.pw1.clientes;

import br.edu.ifrs.pw1.contatos.Endereco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String telefone;
    private List<Endereco> enderecos= new ArrayList<Endereco>();

    public Cliente(String telefone ) {
        this.telefone = telefone;

    }
    public Cliente(){

    };

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void adicionaEndereco(Endereco e){
        this.enderecos.add(e);
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void test(){
        System.out.println("Test");
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "telefone='" + telefone +
                ", enderecos=" + enderecos +
                '}';
    }
}

package br.edu.ifrs.pw1.clientes;

import br.edu.ifrs.pw1.contatos.Endereco;

import java.util.List;

public class Cliente {
    private String telefone;
    private List<Endereco> enderecos;

    public Cliente(String telefone, List<Endereco> enderecos) {
        this.telefone = telefone;
        this.enderecos = enderecos;
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

    public void adicionaEndereco(Endereco end){
        this.enderecos.add(end);
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }




    @Override
    public String toString() {
        return "Cliente{" +
                "telefone='" + telefone +
                ", enderecos=" + enderecos +
                '}';
    }
}

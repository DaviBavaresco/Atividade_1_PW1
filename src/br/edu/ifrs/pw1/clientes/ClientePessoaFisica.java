package br.edu.ifrs.pw1.clientes;

import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.util.List;

public class ClientePessoaFisica extends Cliente {

   private String nome;
   private Cpf cpf;

    public ClientePessoaFisica(String telefone, String nome, Cpf cpf) {
        super(telefone);
        this.nome=nome;
        this.cpf=cpf;
    }

    public ClientePessoaFisica() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "ClientePessoaFisica" +
                " Nome= " + nome + "\n" +
                " CPF " + cpf +"\n" +
                " Telefone= "+getTelefone()+"\n" +
                " Endereco= "+getEnderecos()+"\n" +
                '}';
    }
}

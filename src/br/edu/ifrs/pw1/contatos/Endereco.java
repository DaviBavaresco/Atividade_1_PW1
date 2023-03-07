package br.edu.ifrs.pw1.contatos;

import java.util.Scanner;

public class Endereco {
    private String logradouro;
    private String complemento;
    private long cep;

    public Endereco(String logradouro, String complemento, long cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Endereco() {

    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }
    public void adicionaEnd(String log, String compl, long cep){
    this.cep=cep;
    this.complemento=compl;
    this.logradouro= log;
    }



    @Override
    public String toString() {
        return
                " Logradouro='" + logradouro + '\'' +
                " Complemento='" + complemento + '\'' +
                " CEP=" + cep
                ;
    }
}

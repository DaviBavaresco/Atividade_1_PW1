import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.clientes.ClientePessoaFisica;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TESTE {
    public static void main(String[] args) {
        List<Endereco> enderecos = new ArrayList<Endereco>();


        List<Cpf> CPFs = new ArrayList<Cpf>();

        List<Cliente> clientes = new ArrayList<Cliente>();

        List<ClientePessoaFisica> CliPF = new ArrayList<ClientePessoaFisica>();

        Endereco a = new Endereco("a", "a", 1);
        enderecos.add(a);
        Endereco b = new Endereco("b", "b", 2);
        enderecos.add(b);

        Cpf c= new Cpf(1,1);
        CPFs.add(c);
        Cpf d= new Cpf(2,2);
        CPFs.add(d);

        ClientePessoaFisica f= new ClientePessoaFisica("joao","123",CPFs.get(0));
        CliPF.add(f);
        ClientePessoaFisica g= new ClientePessoaFisica("davi","321",CPFs.get(1));
        CliPF.add(g);
        f.adicionaEndereco(enderecos.get(0));
        f.adicionaEndereco(enderecos.get(1));

        System.out.println(CliPF.get(0).toString());




    }
}

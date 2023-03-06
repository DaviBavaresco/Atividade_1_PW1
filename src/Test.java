import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.clientes.ClientePessoaFisica;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        List<Endereco> enderecos= new ArrayList<Endereco>();
        Scanner sc= new Scanner(System.in);

        Endereco a= new Endereco("asd","casa",12234);
        enderecos.add(a);
       //Endereco b = new Endereco("ads","apartamento",12222);
        //enderecos.add(b);

        Cliente Cli = new Cliente("11123232",enderecos);

        Cpf cpf= new Cpf(1121,1212);

        ClientePessoaFisica CPF= new ClientePessoaFisica("1221",enderecos,"Carlos",cpf);
        System.out.println(CPF.toString());





    }

}

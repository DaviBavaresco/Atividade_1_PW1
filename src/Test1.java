import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.clientes.ClientePessoaFisica;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        List<Endereco> enderecos= new ArrayList<Endereco>();
        Cpf cpf= new Cpf();
        ClientePessoaFisica cliPF= new ClientePessoaFisica();
        Scanner sc= new Scanner(System.in);
        System.out.println("Bem vindo.");
        System.out.println("Oque deseja fazer?");
        System.out.println("1-Cadastras Cliente");
        System.out.println("2-Pesquisar cliente pelo nome");
        System.out.println("3-Pesquisar cliene pelo CPF");
        System.out.println("4-Pesquisar cliente pessoa fisica pelo Endereço");
        System.out.println("5-Listar todos os clientes");
        System.out.println("6-Sair");
        int decisao = sc.nextInt();
        switch(decisao){
            case 1:
                System.out.println("Para fazer o cadastros precisamos de algumas informações");
                System.out.println("Sobre o endereço");
                System.out.println("Qual o logradouro?");
                String log;
                sc.nextLine();
                log= sc.nextLine();

                System.out.println("Qual o complemento");
                String compl;
                compl= sc.nextLine();

                System.out.println("Qual seu cep");
                long cep;
                cep=sc.nextLong();

                Endereco ed= new Endereco(log,compl,cep);
                enderecos.add(ed);
                //endereco finalizado


                System.out.println("Agora sobre o cliente");
                System.out.println("Qual o nome?");
                String nome;
                sc.nextLine();
                nome=sc.nextLine();

                System.out.println("Qual o telefone");
                String telefone;
                telefone=sc.nextLine();
                //ss





                System.out.println("Agora sobre os dados");
                System.out.println("Qual o numero do CPF");
                long num;
                num=sc.nextLong();

                System.out.println("Qual o digito do CPF");
                int dig;
                dig=sc.nextInt();

                cpf.setNumero(num);
                cpf.setDigito(dig);
                cli.adicionaEndereco(ed);
                cliPF.setNome(nome);

                cliPF.setCpf(cpf);

                System.out.println(cliPF.toString());






                //terminar
                break;



        }
    }
}
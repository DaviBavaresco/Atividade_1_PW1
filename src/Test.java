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


        List<Cpf> CPFs= new ArrayList<Cpf>();

        List<Cliente> clientes= new ArrayList<Cliente>();
        Cliente cl= new Cliente();

        Endereco ed= new Endereco();

        List<ClientePessoaFisica> CliPF= new ArrayList<ClientePessoaFisica>();
        ClientePessoaFisica cpf= new ClientePessoaFisica();
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

        do {

            System.out.println("Bem vindo.");
            System.out.println("Oque deseja fazer?");
            System.out.println("1-Cadastras Cliente");
            System.out.println("2-Pesquisar cliente pelo nome");
            System.out.println("3-Pesquisar cliene pelo CPF");
            System.out.println("4-Pesquisar cliente pessoa fisica pelo Endereço");
            System.out.println("5-Listar todos os clientes");
            System.out.println("6-Sair");
            int decisaoo = sc.nextInt();
            switch (decisaoo) {
                case 1:
                    Endereco e;

                    System.out.println("Para fazer o cadastros precisamos de algumas informações");
                    System.out.println("Deseja adicionar quantos endereços ao cliente?");
                    int resp;
                    resp= sc.nextInt();
                    for(int i=0;i<resp;i++){
                        System.out.println("Para fazer o cadastros precisamos de algumas informações");
                        System.out.println("Sobre o endereço");
                        System.out.println("Qual o logradouro?");
                        String loog;
                        sc.nextLine();
                        loog = sc.nextLine();

                        System.out.println("Qual o complemento");
                        String complo;
                        complo = sc.nextLine();

                        System.out.println("Qual seu cep");
                        long cepo;
                        cepo = sc.nextLong();



                        e=new Endereco(loog,complo,cepo);
                        enderecos.add(e);

                    }



                    System.out.println("Agora sobre o cliente");
                    System.out.println("Qual o nome?");
                    String nome;
                    sc.nextLine();
                    nome = sc.nextLine();

                    System.out.println("Qual o telefone");
                    String telefone;
                    telefone = sc.nextLine();





                    System.out.println("Agora sobre os dados");
                    System.out.println("Qual o numero do CPF");
                    long num;
                    num = sc.nextLong();

                    System.out.println("Qual o digito do CPF");
                    int dig;
                    dig = sc.nextInt();
                    Cpf c= new Cpf(num,dig);
                    CPFs.add(c);





                    cpf= new ClientePessoaFisica();
                    cpf.setCpf(c);
                    cpf.setNome(nome);
                    cpf.setTelefone(telefone);
                    if(resp!=0){
                    for(int i=0; i< enderecos.size();i++){
                        cpf.adicionaEndereco(enderecos.get(i));
                    }}


                    CliPF.add(cpf);








                    System.out.println(cpf);


                    break;

                case 3:
                    System.out.println("Qual o numero do CPF do cliente para a busca?");
                    long n=sc.nextLong();
                    System.out.println("Qual o digito?");
                    int di=sc.nextInt();
                    Cpf cp= new Cpf(n,di);


                    for(int i=0;i< CliPF.size();i++){
                        if(cpf.getCpf().getDigito()==di && cpf.getCpf().getNumero()==n){
                            System.out.println("Cliente Encontrado");
                            System.out.println(cpf.toString());
                            break;

                        }
                        else{

                        }
                    }



                    break;

                case 4:
                    System.out.println("Qual o nome?");
                    sc.nextLine();
                    String no=sc.nextLine();
                    for(int i=0;i<CliPF.size();i++){
                        if(cpf.getNome().equals(no)){
                            System.out.println("Cliente encontrado");
                            System.out.println(cpf.toString());
                            break;
                        }
                        else{

                        }
                    }
                    break;

                case 5:
                   // for(int i =0; i<CliPF.size(); i++){
                        System.out.println(CliPF.toString());
                   // }
                    break;
                case 6:
                    System.out.println("Qual o logradouro?");
                    String log;
                    sc.nextLine();
                    log = sc.nextLine();

                    System.out.println("Qual o complemento");
                    String compl;
                    compl = sc.nextLine();

                    System.out.println("Qual seu cep");
                    long cep;
                    cep = sc.nextLong();
                    Endereco ee= new Endereco(log,compl,cep);

                    for(int i=0; i<CliPF.size();i++){
                        if(cpf.getEnderecos().equals(ee)){
                            System.out.println("Cliente encontrado");
                            System.out.println(cpf.toString());
                            break;
                        }
                        else{

                        }
                        System.out.println(cpf.getEnderecos().toString());
                        System.out.println(ee.toString());
                    }

                    break;
            }








    }while(decisao!=0);


}

}

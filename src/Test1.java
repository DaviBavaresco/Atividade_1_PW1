import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.clientes.ClientePessoaFisica;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        List<Endereco> enderecos= new ArrayList<Endereco>();
        Endereco ed= new Endereco();
        Cpf cpf= new Cpf();
        Cliente cli= new Cliente();
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
                    System.out.println("Para fazer o cadastros precisamos de algumas informações");
                    System.out.println("Sobre o endereço");
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

                    ed.setLogradouro(log);
                    ed.setComplemento(compl);
                    ed.setCep(cep);
                    enderecos.add(ed);


                    cpf.setNumero(num);
                    cpf.setDigito(dig);
                    cliPF.setTelefone(telefone);
                    cliPF.setEnderecos(enderecos);
                    cliPF.setNome(nome);


                    cliPF.setCpf(cpf);


                    System.out.println(cliPF);


                    break;

                case 2:
                    System.out.println("Qual o nome do cliente");
                    sc.nextLine();
                    String nomeB = sc.nextLine();
                    if (cliPF.getNome().equals(nomeB)) {
                        System.out.println("Cliente encontrado");
                    } else {
                        System.out.println("Cliente nao encontrado");
                    }

                    break;

                case 3:
                    System.out.println("Qual o CPF o=do cliente para a busca?");
                    sc.nextLine();
                    String cPf=sc.nextLine();
                    if(cliPF.getCpf().equals(cPf)){
                        System.out.println("Cliente Encontrado");
                    }
                    else{
                        System.out.println("Cliente nao encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Digite qual o endereco para procurarmos ");
                    System.out.println("Primeiro o logradouro");
                    sc.nextLine();
                    String loog =sc.nextLine();
                    System.out.println("Qual o complemento?");
                    sc.nextLine();
                    String com=sc.nextLine();
                    System.out.println("Qual o CEP");
                    ;
                    long cp=sc.nextLong();
                    Endereco end=new Endereco(loog,com,cp);

                   // if(cliPF.getEnderecos()==)
                    // a fazer a comparação de dados
                    break;

                case 5:
                    for(int i =0; i<3; i++){
                        System.out.println(cliPF.toString());
                    }



            }
        }while(decisao!=0);







        }
    }

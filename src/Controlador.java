import br.edu.ifrs.pw1.contatos.Endereco;

import java.util.Scanner;

public class Controlador {
    Endereco endereco;
    Scanner sc= new Scanner(System.in);
    public void AdicionarEnd(){
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

    }
}

package Mes1.prova;

import java.util.Scanner;

public class ValidaocaoDeSenha {
    public static void main(String[] args) {
        // Peça para o usuário cadastrar uma senha.
        //Depois, peça que ele digite a senha novamente até acertar.
        //Exiba mensagens:
        //	•	“Senha correta”
        //	•	ou “Senha incorreta, tente novamente”

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastra uma senha: ");
        String senha = scanner.nextLine();
        boolean acessoAutorizado = false;

        do {
            System.out.println("Digite a senha: ");
            String senhaTentativas = scanner.nextLine();

            if (!senhaTentativas.equals(senha)){
                System.out.println("Senha incorreta, tente novamente");
            }else {
                System.out.println("Senha correta");
                acessoAutorizado = true;
            }
        }while (!acessoAutorizado);

        scanner.close();
    }
}

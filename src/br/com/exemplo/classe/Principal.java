package br.com.exemplo.classe;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        int matricula,i;
        String nome;
        String buscar;

        Aluno[] alunos = new Aluno[10];
        Scanner ler = new Scanner(System.in);

        for ( i = 0; i < 2; i++){


    System.out.println("Digite matricula");
        matricula=ler.nextInt();
    System.out.println("Digite nome");
        nome=ler.nextLine();
        nome=ler.nextLine();
        alunos[i]=new Aluno(nome,matricula);
        System.out.println(alunos[i].mostrar());


        }

        // digitar um nome para buscar nos objetos
        System.out.println("Digite um nome para buscar");
        buscar=ler.nextLine();
        for (i=0;i<2;i++){
            if(alunos[i].getNome().equals(buscar))
                System.out.println("Nome encontrado com sucesso");
        }
    }
}

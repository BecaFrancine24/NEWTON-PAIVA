package exemploclassearraylist;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList <> ();
        Pessoa p1;
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1>Cadastrar\n<2>visualizar\n<3>Sair"));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o Nome");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
                    String cpf = JOptionPane.showInputDialog("Digite o CPF");
                    p1 = new Pessoa(nome, idade, cpf);
                    pessoas.add(p1);
                    break;

                case 2:
                    int i = 0;
                    for (Pessoa contato : pessoas) {
                        System.out.printf("Posi��o %d- %s %s %d\n", i, contato.getNome(), contato.getCpf(), contato.getIdade());
                        i++;
                    }
                    break;

                case 3:
                    break;
            }
        }while(opcao!=3);


            }
        }


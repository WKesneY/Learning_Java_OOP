import java.util.*;

public class Notas {
    public static void main(String[] args) {
        int quantAlunos;
        double notaAluno, mediaTurmas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------ MEDIA TURMA ------------------");
        System.out.printf("\n\nInforme a quantidade de alunos da turma:\t");
        quantAlunos = scanner.nextInt();

        double soma = 0;
        for(int i = 0; i < quantAlunos; soma +=notaAluno, i++){
            System.out.print("\nInforme a nota do " + ++i + "º aluno:\t");
            --i;
            notaAluno = scanner.nextDouble();
        }

        double media = soma/quantAlunos;
        System.out.println("\n\n-> A MEDIA DA TURMA É [" + media + "] <-");
    }
    
}

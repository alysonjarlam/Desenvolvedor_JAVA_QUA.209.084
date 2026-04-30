import java.util.Scanner;
import com.metodos.models.*;



public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(Sysout.in);
      Professor prof = new Professor();
      Aluno = new Aluno();

      double x;
      double y;
            
      System.out.println("Informe o nome do aluno:");
            aluno.nome = sc.nextLine();

            System.out.println(aluno.apresentar());


      prof.nome = "Alyson";
      prof.materia = "Matematica";


        System.out.println(prof.darBoasVindas());   
        System.out.println("informe o valor da base: ");
        x = sc.nextDouble();
        System.out.println("informe o valor da altura: ");
        y = sc.nextDouble();
    
    System.out.println("A area do quadrilatero é " + prof.areaQuadrilatero(x, y));

    sc.close();

    }
        
    
    }


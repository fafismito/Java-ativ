import java.util.Scanner; 
public class CalculaAreaQuadrado { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite o valor do lado do quadrado: "); 
        double lado = sc.nextDouble(); 
        double area = lado * lado; 
        System.out.println("A área do quadrado é: " + area); 
        sc.close(); 
    }
 }

 import java.util.Scanner; 
 public class CadastroFuncionario { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite o nome do funcionário: "); 
        String nome = sc.nextLine(); 
        System.out.print("Digite o endereço do funcionário: "); 
        String endereco = sc.nextLine(); 
        System.out.print("Digite a idade do funcionário: "); 
        int idade = sc.nextInt(); 
        System.out.print("Digite o telefone do funcionário: "); 
        String telefone = sc.next(); 
        System.out.print("Digite a quantidade de horas trabalhadas: "); 
        int horasTrabalhadas = sc.nextInt(); 
        System.out.print("Digite o valor da hora de trabalho: "); 
        double valorHora = sc.nextDouble(); 
        double salario = horasTrabalhadas * valorHora; 
        System.out.println("Nome do funcionário: " + nome); 
        System.out.println("Salário do funcionário: " + salario); 
        sc.close(); 
    } 
}
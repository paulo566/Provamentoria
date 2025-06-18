import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis para as notas
        double nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8;

        // Receber as notas
        System.out.println("Digite a 1ª nota: ");
        nota1 = scanner.nextDouble();
        // ... (repetir para as outras notas)
        
        System.out.println("Digite a 2ª nota: ");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite a 3ª nota: ");
        nota3= scanner.nextDouble();
        
        System.out.println("Digite a 4ª nota: ");
        nota4 = scanner.nextDouble();
        
        System.out.println("Digite a 5ª nota: ");
        nota5 = scanner.nextDouble();
        
        System.out.println("Digite a 6ª nota: ");
        nota6 = scanner.nextDouble();
        
        System.out.println("Digite a 7ª nota: ");
        nota7 = scanner.nextDouble();
        
        System.out.println("Digite a 8ª nota: ");
        nota8 = scanner.nextDouble();

        // Calcular médias bimestrais
        double media1Bimestre = (nota1 + nota2) / 2;
        
        double media2Bimestre = (nota3+ nota4)/2;
        // ... (calcular as outras médias bimestrais)

        // Calcular médias semestrais
        double media1Semestre = (media1Bimestre + media2Bimestre) / 2;
        // ... (calcular a outra média semestral)

        // Calcular média final
        double mediaFinal = (media1Semestre + media2Bimestre) / 2;

        // Apresentar os resultados
        System.out.println("1º Bimestre: " + media1Bimestre);
        // ... (apresentar os outros resultados)

        scanner.close();
    }
}


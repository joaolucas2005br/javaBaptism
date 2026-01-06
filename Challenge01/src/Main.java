
public class Main {
    public static void main(String [] args) {

        // Ninja 01:
            String nome = "João Bobão";
            int idade = 14;
            String nomeMissao = "Derrotar o mais bobo da terra";
            char nivelDificuldade = 'C';
            String statusMissao = "Em andamento";

            // Imprimindo Info Ninja 01
            System.out.println("Ninja 01");
            System.out.println("Nome: " + nome);
            System.out.println("idade: " + idade);
            System.out.println("Nome da Missão: " + nomeMissao);
            System.out.println("Nível de Dificuldade da Missão: " + nivelDificuldade);
            System.out.println("Status da Missão: " + statusMissao);

        // Ninja 02:
            String nome2 = "Super John Bobão";
            int idade2 = 15;
            String nomeMissao2 = "Guerra infinita dos mares";
            char nivelDificuldade2 = 'A';
            String statusMissao2 = "Em andamento";

            // Imprimindo Info Ninja 02
            System.out.println("\nNinja 02");
            System.out.println("Nome: " + nome2);
            System.out.println("idade: " + idade2);
            System.out.println("Nome da Missão: " + nomeMissao2);
            System.out.println("Nível de Dificuldade da Missão: " + nivelDificuldade2);
            System.out.println("Status da Missão: " + statusMissao2);

        // Ninja 03:
            String nome3 = "Strong Bier";
            int idade3 = 12;
            String nomeMissao3 = "Mais forte que o filme coração de ferro";
            char nivelDificuldade3 = 'J';
            String statusMissao3 = "Em andamento";

            // Imprimindo Info Ninja 03
            System.out.println("\nNinja 03");
            System.out.println("Nome: " + nome3);
            System.out.println("idade: " + idade3);
            System.out.println("Nome da Missão: " + nomeMissao3);
            System.out.println("Nível de Dificuldade da Missão: " + nivelDificuldade3);
            System.out.println("Status da Missão: " + statusMissao3);


        // Verificar o portencial do NINJA 01 para as missões:
        System.out.println("\nAvaliação Ninja 01:");
            if(idade < 15) {
                if(nivelDificuldade == 'C' || nivelDificuldade == 'D') {
                    statusMissao = "Concluída";
                    System.out.println("Status da Missão: " + statusMissao);
                } else {
                    statusMissao = "Não Concluída";
                    System.out.println("Status da Missão: " + statusMissao);
                }
            } else {
                statusMissao = "Concluída";
                System.out.println("Status da Missão: " + statusMissao);
            }


        // Verificar o portencial do NINJA 02 para as missões:
        System.out.println("\nAvaliação Ninja 02:");
            if(idade2 < 15) {
                if(nivelDificuldade2 == 'C' || nivelDificuldade2 == 'D') {
                    statusMissao2 = "Concluída";
                    System.out.println("Status da Missão: " + statusMissao2);
                } else {
                    statusMissao2 = "Não Concluída";
                    System.out.println("Status da Missão: " + statusMissao2);
                }
            } else {
                statusMissao2 = "Concluída";
                System.out.println("Status da Missão: " + statusMissao2);
            }


        // Verificar o portencial do NINJA 03 para as missões:
        System.out.println("\nAvaliação Ninja 03:");
            if(idade3 < 15) {
                if(nivelDificuldade3 == 'C' || nivelDificuldade3 == 'D') {
                    statusMissao3 = "Concluída";
                    System.out.println("Status da Missão: " + statusMissao3);
                } else {
                    statusMissao3 = "Não Concluída";
                    System.out.println("Status da Missão: " + statusMissao3);
                }
            } else {
                statusMissao3 = "Concluída";
                System.out.println("Status da Missão: " + statusMissao3);
            }
    }
}

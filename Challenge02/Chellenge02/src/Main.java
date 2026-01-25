import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cadastrar os sobreviventes do left4dead 2

        Scanner scanner = new Scanner(System.in);
        int loop = 1;

        System.out.println("PRIMEIRAMENTE - Digite o tamanho da quantidade de personagens que irá cadastrar:");
        int tamArray = scanner.nextInt();

        String[] arraySobreviventes = new String[tamArray];

        while(loop!=0) {

            System.out.println("\n=======================  MENU PRINCIPAL =======================");
            System.out.println("01 - Casdastrar sobriviventes");
            System.out.println("02 - Listar sobriviventes cadastrados");
            System.out.println("03 - Consultar sobrivivente pele nome");
            System.out.println("04 - Consultar sobrivivente pela posição");
            System.out.println("05 - Excluir sobrivivente pelo nome");
            System.out.println("06 - Excluir sobrivivente pela posição");
            System.out.println("07 - FINALIZAR EXECUÇÃO");
            System.out.print("Selecione uma opcão: ");

            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    scanner.nextLine();
                    int quantCadastrada = 0;
                    int quantSendoOcupada = 0;

                    for (int i = 0; i < arraySobreviventes.length; i++) {
                        if(arraySobreviventes[i] != null) { // Se for diferente de null, não cadastra
                            quantCadastrada++; // Conta a quantidade que está cadastrada/ posição ocupada/ representa estado anterior
                        } else {
                            System.out.println("\nDigite o nome do sobrivivente " + i);
                            String nomeSobrevivente = scanner.nextLine();

                            if(!nomeSobrevivente.trim().isEmpty()) {
                                arraySobreviventes[i] = nomeSobrevivente;
                                quantSendoOcupada++; // Conta a quantidade que está sendo cadastrada/ representa mudança de estado
                            }
                        }
                    }

                    int contNull = 0;

                    if(quantSendoOcupada > 0 && quantSendoOcupada <= arraySobreviventes.length ) {
                        System.out.println("\nCadastro realizado com sucesso!");

                        for (int i = 0; i < arraySobreviventes.length; i++) {
                            if(arraySobreviventes[i] == null) {
                                contNull++;
                            }
                        }

                        if(contNull == 0) {
                            System.out.println("\nTodos os cadastros realizados com sucesso!");
                        } else {
                            System.out.println("\nAinda faltam " + contNull + " cadastro(s)!");
                        }

                    } else if(quantCadastrada == arraySobreviventes.length) {
                        System.out.println("\nNão há mais espaço para mais cadastros...tente novamente mais tarde!");
                    }

                    break;

                case 2:
                    System.out.println("\nCadastros realizados:");
                    for (int i = 0; i < arraySobreviventes.length; i++) {
                        System.out.println(i + " - " + arraySobreviventes[i]);
                    }
                    break;

                case 3:
                    scanner.nextLine();

                    boolean existe = false;

                    System.out.println("\nDigite o nome do sobrevivente cadastrado: ");
                    String consultaNome = scanner.nextLine().trim();

                    for (int i = 0; i < arraySobreviventes.length; i++) {
                        if(consultaNome.equals(arraySobreviventes[i])) {
                            System.out.println("\nExiste o sobrevivente: " + consultaNome);
                            existe = true;
                            break;
                        }
                    }

                    if(!existe) {
                        System.out.println("\nNão existe o sobrevivente: " + consultaNome);
                        break;
                    }

                    break;

                case 4:
                    System.out.println("\nDigite a posição do sobrevivente cadastrado: ");
                    int index = scanner.nextInt();

                    if(index >= 0 && index < arraySobreviventes.length) {
                        if(arraySobreviventes[index] != null && !arraySobreviventes[index].isBlank()) {
                            String nomeSobrevivente = arraySobreviventes[index];
                            System.out.println("\nExiste sobrevivente na posicação - " + index + " - chamado: " + nomeSobrevivente);
                            break;
                        } else {
                            System.out.println("A posição - " + index + " - está vazia, portanto, igual a NULL");
                            break;
                        }
                    } else {
                        System.out.println("\nNão existe nenhum sobrevivente na posicação " + index);
                        break;
                    }

                case 5:
                    scanner.nextLine();
                    boolean existeSobreviventeParaRemover = false;

                    System.out.println("\nDigite o nome do sobrevivente que deseja excluir: ");
                    String nomeSobreviventeRemovido = scanner.nextLine().trim();

                    for (int i = 0; i < arraySobreviventes.length; i++) {
                        if(nomeSobreviventeRemovido.equals(arraySobreviventes[i])) {
                            arraySobreviventes[i] = null;
                            existeSobreviventeParaRemover = true;
                            break;
                        }
                    }

                    if(!existeSobreviventeParaRemover) {
                        System.out.println("\nNão existe o sobrevivente " + nomeSobreviventeRemovido + " para remover!");
                        break;
                    } else {
                        System.out.println("\nRemoção do sobrevivente " + nomeSobreviventeRemovido + " com sucesso!");
                    }

                    break;

                case 6:
                    boolean existeSobreviventeRemoverIndex = false;

                    System.out.println("\nDigite a posição do sobrevivente que deseja excluir: ");
                    int indexRemover = scanner.nextInt();

                    if(indexRemover >= 0 && indexRemover <= arraySobreviventes.length) {
                        for (int i = 0; i < arraySobreviventes.length; i++) {
                            if(arraySobreviventes[indexRemover] != null && !arraySobreviventes[indexRemover].isBlank()) {
                                arraySobreviventes[indexRemover] = null;
                                existeSobreviventeRemoverIndex = true;
                            }
                        }
                    } else {
                        System.out.println("\nNão existe nenhum sobrevivente na posicação " + indexRemover);
                        break;
                    }

                    if(!existeSobreviventeRemoverIndex) {
                        System.out.println("\nNão existe o sobrevivente na posição " + indexRemover + " para remover!");
                        break;
                    } else {
                        System.out.println("\nRemoção do sobrevivente na posição " + indexRemover + " com sucesso!");
                    }

                    break;

                case 7:
                    System.out.println("\nPrograma finalizado com sucesso...!");
                    break;

                default:
                    System.out.println("\nOpção incorreta, escolha uma das opções válidas acima.");
            }
            
            System.out.println("\nDigite 0 para finalizar o programa ou qualquer outro número para repetir");
            loop = scanner.nextInt();
        }

        scanner.close();
    }
}

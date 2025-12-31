package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Boolean running = true;
    List<HeroiModel> herois = new ArrayList<>();

    public void exibirMenu() {
        System.out.println("===== Menu do Jogo =====");
        System.out.println("1. Criar Herói");
        System.out.println("2. Categorias de Heróis");
        System.out.println("3. Herói info");
        System.out.println("4. Atacar");
        System.out.println("5. Defender");
        System.out.println("6. Listar Heróis");
        System.out.println("7. Sair");
        System.out.println("========================");
        while (running) {

            try {
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                
                if (opcao == 1) {
                    System.out.println("Digite o nome do herói: ");
                    String nome = scanner.next().replace(" ","_");
                    System.out.println("Dígite a idade do Herói: ");
                    int idade = scanner.nextInt();
                    if (idade < 10 || idade < 0) {
                        System.out.println("Idade inválida. Deve ser maior que 10.");
                        return;
                    }
                System.out.println("Escolha o tipo do herói: ");
                for (TipoEnum tipo : TipoEnum.values()) {
                    System.out.println(tipo.ordinal() + 1 + ". " + tipo);
                }
                int tipoEscolhido = scanner.nextInt();
                if (tipoEscolhido < 1 || tipoEscolhido > TipoEnum.values().length) {
                    System.out.println("Tipo inválido.");
                    return;
                }
                
                TipoEnum tipo = TipoEnum.values()[tipoEscolhido - 1];
                HeroiModel heroi = new HeroiModel(nome, idade, tipo);
                System.out.println("Herói criado com sucesso: " + heroi.getNome() + ", Idade: " + heroi.getIdade() + ", Tipo: " + heroi.getTipo());
                herois.add(heroi);
                
            } else if (opcao == 2) {
                System.out.println("Categorias de Heróis:");
                for (TipoEnum tipo : TipoEnum.values()) {
                    System.out.println("- " + tipo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o nome do herói para ver as informações: ");
                String nomeBusca = scanner.next().replace(" ","_");
                for (HeroiModel heroi : herois) {
                    if (heroi.getNome().equalsIgnoreCase(nomeBusca)) {
                        System.out.println("Nome: " + heroi.getNome() + ", Idade: " + heroi.getIdade() + ", Tipo: " + heroi.getTipo() + ", Vida: " + heroi.getVida() + ", Ataque: " + heroi.getAtaque());
                        return;
                    }
                }
                System.out.println("Herói não encontrado.");
            } else if (opcao == 4) {
                System.out.println("Digite o nome do herói que vai atacar: ");
                String nomeAtacante = scanner.next().replace(" ","_");
                for (HeroiModel heroi : herois) {
                    if (heroi.getNome().equalsIgnoreCase(nomeAtacante)) {
                        heroi.atacar();
                    }
                }
                System.out.println("Herói não encontrado.");
            } else if (opcao == 5) {
                System.out.println("Defender função ainda não implementada.");
            } else if (opcao == 6) {
                System.out.println("Lista de Heróis:");
                if (herois.isEmpty()) {
                    System.out.println("Nenhum herói criado ainda.");
                    return;
                }
                for (HeroiModel heroi : herois) {
                    System.out.println("- " + heroi.getNome() + " (" + heroi.getTipo() + ")");
                }
            } else if (opcao == 7) {
                System.out.println("Saindo do jogo. Até mais!");
                running = !running;
                return;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
            
        } catch (Exception e) {
            System.out.println("Opção inválida. Por favor, tente novamente.");
            scanner.nextLine();
        }
    }
}}
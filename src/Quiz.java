import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Pergunta {
    private String questao;
    private List<String> alternativas;
    private String respostaCorreta;

    public Pergunta(String questao, List<String> alternativas, String respostaCorreta) {
        this.questao = questao;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getQuestao() {
        return questao;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
}

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Apresentação do Quiz
        System.out.println("CENTRO UNIVERSITARIO ALFREDO NASSER");
        System.out.println();
        System.out.println("ALUNO: GABRIEL HENRIQUE ALVES SANTIAGO E SILVA");
        System.out.println();
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println();
        System.out.println("ATIVIDADE AVALIATIVA DE CONHECIMENTO HISTÓRICO GERAIS");
        System.out.println();
        System.out.println("NESTE QUESTIONÁRIO VOCÊ IRÁ RESPONDER 15 PERGUNTAS. É NECESSÁRIO DIGITAR O NÚMERO CORRESPONDENTE À ALTERNATIVA.");
        System.out.println();

        // Lista para armazenar as perguntas
        List<Pergunta> perguntas = new ArrayList<>();
        List<Pergunta> acertadas = new ArrayList<>();
        List<Pergunta> erradas = new ArrayList<>();


        perguntas.add(new Pergunta(
                "Qual foi o primeiro console da Sony lançado no mercado?",
                List.of("PlayStation", "PlayStation 2", "PlayStation 3", "PlayStation Portable", "PlayStation Vita"),
                "PlayStation"
        ));

        perguntas.add(new Pergunta(
                "Em qual jogo o personagem Mario faz sua estreia?",
                List.of(" Donkey Kong", "Super Mario Bros.", "Mario Kart", "Super Mario 64", "Super Mario Odyssey"),
                "Donkey Kong"
        ));

        perguntas.add(new Pergunta(
                "Qual jogo da série The Legend of Zelda foi lançado para o Nintendo Switch em 2017?",
                List.of(" The Legend of Zelda: Wind Waker", "The Legend of Zelda: Twilight Princess", "The Legend of Zelda: Breath of the Wild", "The Legend of Zelda: Ocarina of Time", "The Legend of Zelda: Skyward Sword"),
                "The Legend of Zelda: Breath of the Wild"
        ));
        perguntas.add(new Pergunta(
                "Quem é o desenvolvedor do jogo The Witcher 3: Wild Hunt",
                List.of("Ubisoft", "Blizzard Entertainment", "CD Projekt Red ", "Rockstar Games", "Bethesda Softworks"),
                "CD Projekt Red "
        ));

        perguntas.add(new Pergunta(
                "Qual desses jogos pertence à franquia Halo",
                List.of("Halo: Reach", "Gears of War", "Destiny", "Call of Duty", "Half-Life"),
                "Halo: Reach"
        ));

        perguntas.add(new Pergunta(
                "Em Minecraft, qual é o nome do mob que explode quando se aproxima do jogador?",
                List.of("Creeper", "Enderman", "Zumbi", " Esqueleto", " Slime"),
                "Creeper"
        ));

        perguntas.add(new Pergunta(
                "Em qual cidade fictícia se passa o jogo Grand Theft Auto V",
                List.of("Vice City", "Liberty City", "Los Santos ", "San Fierro", "Rapture"),
                "Los Santos "
        ));

        perguntas.add(new Pergunta(
                "Qual é o nome do protagonista de God of War",
                List.of("Kratos", "Atreus", "Thor", "Ares", "Zeus"),
                "Kratos"
        ));

        perguntas.add(new Pergunta(
                "Qual é o gênero principal do jogo League of Legends",
                List.of("MOBA (Multiplayer Online Battle Arena)", "RPG", " FPS ", "Ação e Aventura", "Simulação"),
                "MOBA (Multiplayer Online Battle Arena)"
        ));

        perguntas.add(new Pergunta(
                "Qual foi o nome do primeiro jogo da série Final Fantasy",
                List.of("Final Fantasy VII", "Final Fantasy XV", "Final Fantasy IX", " Final Fantasy X", "Final Fantasy"),
                "Final Fantasy"
        ));

        perguntas.add(new Pergunta(
                "Qual é o nome do famoso zumbi em Resident Evil",
                List.of("Nemesis", "Mr. X", " Leon", "Jill", "Tyrant"),
                "Tyrant"
        ));

        perguntas.add(new Pergunta(
                "Qual jogo é famoso pela frase \"It's-a me, Mario!\"",
                List.of("Super Mario 64", "Super Mario Odyssey", "Super Mario Galaxy", "Super Mario Bros.", "Mario Kart 8 Deluxe"),
                "Super Mario 64"
        ));

        perguntas.add(new Pergunta(
                "Qual é o nome da ilha em que o jogo \"Fortnite\" se passa?",
                List.of("Battle Island", "Tilted Towers", "Fortnite Island", " Island Royale", "Apollo Island"),
                "Apollo Island"
        ));

        perguntas.add(new Pergunta(
                "Qual é o objetivo principal de \"Among Us\"",
                List.of("Construir uma nave", "Caçar monstros", "Identificar o impostor ", " Completar missões de resgate", "Capturar a bandeira"),
                "Identificar o impostor "
        ));

        perguntas.add(new Pergunta(
                "Em \"Overwatch\", qual personagem é conhecido por sua habilidade de ressuscitar os outros jogadores?",
                List.of("Mercy", "Tracer", "Reinhardt", "Widowmaker", "Genji"),
                "Mercy"
        ));


        // Contador de acertos
        int acertos = 0;

        // Iterar sobre as perguntas
        for (Pergunta pergunta : perguntas) {
            boolean respostaRegistrada = false;
            while (!respostaRegistrada) {

                System.out.println(pergunta.getQuestao());

                // Embaralhar alternativas
                List<String> alternativas = new ArrayList<>(pergunta.getAlternativas());
                Collections.shuffle(alternativas);

                // Exibir alternativas
                for (int i = 0; i < alternativas.size(); i++) {
                    System.out.println("[" + i + "] " + alternativas.get(i));
                }


                System.out.print("Digite o número da sua resposta: ");
                String resposta = scanner.nextLine();

                try {
                    // Verificar a resposta
                    int respostaInt = Integer.parseInt(resposta);
                    if (respostaInt < 0 || respostaInt >= alternativas.size()) {
                        System.out.println("Número inválido. Tente novamente.");
                    } else {
                        String valorDaResposta = alternativas.get(respostaInt);
                        if (valorDaResposta.equals(pergunta.getRespostaCorreta())) {
                            System.out.println("Resposta correta!");
                            acertos++;
                            acertadas.add(pergunta);
                        } else {
                            System.out.println("Resposta errada! A resposta correta era: " + pergunta.getRespostaCorreta());
                            erradas.add(pergunta);
                        }
                        respostaRegistrada = true; // Passar para a próxima pergunta
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número correspondente à alternativa.");
                }
            }
        }

        // Exibir resultados
        System.out.println("\nRESULTADOS DO QUIZ:");
        System.out.println("Você acertou " + acertos + " de " + perguntas.size() + " perguntas.");
        double porcentagem = (acertos / (double) perguntas.size()) * 100;
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagem) + "%");


        System.out.println("\nPerguntas Acertadas:");
        for (Pergunta pergunta : acertadas) {
            System.out.println("- " + pergunta.getQuestao() + " (Resposta correta: " + pergunta.getRespostaCorreta() + ")");
        }


        System.out.println("\nPerguntas Erradas:");
        for (Pergunta pergunta : erradas) {
            System.out.println("- " + pergunta.getQuestao() + " (Resposta correta: " + pergunta.getRespostaCorreta() + ")");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrigido a instância do Scanner
        String resp;
        int cont = 0; // Contador de acertos

        Questao q1 = new Questao();
        q1.pergunta = "Qual é o primeiro jogo da série 'The Legend of Zelda'?";
        q1.opcaoA = " a) Ocarina of Tim";
        q1.opcaoB = " b) Breath of the Wild";
        q1.opcaoC = " c) Link's Awakening";
        q1.opcaoD = " d) The Legend of Zelda";
        q1.opcaoE = " e) Majora's Mask";
        q1.correta = "d";
        q1.escrevaQuestao();
        resp = q1.leiaResposta();
        if (q1.isCorreta(resp)) cont++;

        Questao q2 = new Questao();
        q2.pergunta = "Em qual jogo o personagem Mario foi criado?";
        q2.opcaoA = " a) Donkey Kong";
        q2.opcaoB = " b) Super Mario Bros.";
        q2.opcaoC = " c) Mario Kart";
        q2.opcaoD = " d) The Legend of Zelda";
        q2.opcaoE = " e) Metroid";
        q2.correta = "a";
        q2.escrevaQuestao();
        resp = q2.leiaResposta();
        if (q2.isCorreta(resp)) cont++;

        Questao q3 = new Questao();
        q3.pergunta = "Qual é o nome do vilão principal em 'Final Fantasy VII'?";
        q3.opcaoA = " a) Sephiroth";
        q3.opcaoB = " b) Kefka";
        q3.opcaoC = " c) Exdeath";
        q3.opcaoD = " d) Kuja";
        q3.opcaoE = " e) Golbez";
        q3.correta = "a";
        q3.escrevaQuestao();
        resp = q3.leiaResposta();
        if (q3.isCorreta(resp)) cont++;

        Questao q4 = new Questao();
        q4.pergunta = "Em 'Minecraft', qual bloco é usado para fazer uma picareta?";
        q4.opcaoA = " a) Pedra";
        q4.opcaoB = " b) Ferro";
        q4.opcaoC = " c) Madeira";
        q4.opcaoD = " d) Diamante";
        q4.opcaoE = " e) Ouro";
        q4.correta = "c";
        q4.escrevaQuestao();
        resp = q4.leiaResposta();
        if (q4.isCorreta(resp)) cont++;

        Questao q5 = new Questao();
        q5.pergunta = "Qual é o nome do personagem principal em 'The Witcher 3'?";
        q5.opcaoA = " a) Geralt de Rivia";
        q5.opcaoB = " b) Ciri";
        q5.opcaoC = " c) Yennefer";
        q5.opcaoD = " d) Dandelion";
        q5.opcaoE = " e) Triss Merigold";
        q5.correta = "a";
        q5.escrevaQuestao();
        resp = q5.leiaResposta();
        if (q5.isCorreta(resp)) cont++;

        Questao q6 = new Questao();
        q6.pergunta = "Qual é o nome do mundo em 'Dark Souls'?";
        q6.opcaoA = " a) Lordran";
        q6.opcaoB = " b) Tamriel";
        q6.opcaoC = " c) Gielinor";
        q6.opcaoD = " d) Hyrule";
        q6.opcaoE = " e) Midgard";
        q6.correta = "a";
        q6.escrevaQuestao();
        resp = q6.leiaResposta();
        if (q6.isCorreta(resp)) cont++;

        Questao q7 = new Questao();
        q7.pergunta = "Qual jogo é conhecido por sua famosa frase 'It's dangerous to go alone! Take this.'?";
        q7.opcaoA = " a) The Legend of Zelda";
        q7.opcaoB = " b) Super Mario Bros.";
        q7.opcaoC = " c) Metroid";
        q7.opcaoD = " d) Castlevania";
        q7.opcaoE = " e) EarthBound";
        q7.correta = "a";
        q7.escrevaQuestao();
        resp = q7.leiaResposta();
        if (q7.isCorreta(resp)) cont++;

        Questao q8 = new Questao();
        q8.pergunta = "Em 'Overwatch', qual herói é conhecido por ser o tanque que usa uma armadura mecânica?";
        q8.opcaoA = " a) Winston";
        q8.opcaoB = " b) Roadhog";
        q8.opcaoC = " c) Zarya";
        q8.opcaoD = " d) Reaper";
        q8.opcaoE = " e) D.Va";
        q8.correta = "e";
        q8.escrevaQuestao();
        resp = q8.leiaResposta();
        if (q8.isCorreta(resp)) cont++;

        Questao q9 = new Questao();
        q9.pergunta = "Qual é o nome do jogo onde você deve coletar e treinar criaturas chamadas 'Pokémon'?";
        q9.opcaoA = " a) Animal Crossing";
        q9.opcaoB = " b) The Elder Scrolls";
        q9.opcaoC = " c) Pokémon";
        q9.opcaoD = " d) Digimon";
        q9.opcaoE = " e) Final Fantasy";
        q9.correta = "c";
        q9.escrevaQuestao();
        resp = q9.leiaResposta();
        if (q9.isCorreta(resp)) cont++;

        Questao q10 = new Questao();
        q10.pergunta = "Qual é o nome do personagem principal em 'Halo'?";
        q10.opcaoA = " a) Master Chief";
        q10.opcaoB = " b) Marcus Fenix";
        q10.opcaoC = " c) Samus Aran";
        q10.opcaoD = " d) Kratos";
        q10.opcaoE = " e) Commander Shepard";
        q10.correta = "a";
        q10.escrevaQuestao();
        resp = q10.leiaResposta();
        if (q10.isCorreta(resp)) cont++;

        Questao q11 = new Questao();
        q11.pergunta = "Qual é o nome do estúdio que criou 'The Elder Scrolls V: Skyrim'?";
        q11.opcaoA = " a) BioWare";
        q11.opcaoB = " b) Bethesda";
        q11.opcaoC = " c) Square Enix";
        q11.opcaoD = " d) Blizzard";
        q11.opcaoE = " e) Ubisoft";
        q11.correta = "b";
        q11.escrevaQuestao();
        resp = q11.leiaResposta();
        if (q11.isCorreta(resp)) cont++;

        Questao q12 = new Questao();
        q12.pergunta = "Qual é o nome da cidade onde ocorre a maioria das missões de 'Grand Theft Auto V'?";
        q12.opcaoA = " a) Liberty City";
        q12.opcaoB = " b) Los Santos";
        q12.opcaoC = " c) Vice City";
        q12.opcaoD = " d) San Fierro";
        q12.opcaoE = " e) Las Venturas";
        q12.correta = "b";
        q12.escrevaQuestao();
        resp = q12.leiaResposta();
        if (q12.isCorreta(resp)) cont++;

        Questao q13 = new Questao();
        q13.pergunta = "Qual é o nome do jogo que possui a mecânica de sobrevivência em um apocalipse zumbi chamado 'DayZ'?";
        q13.opcaoA = " a) Left 4 Dead";
        q13.opcaoB = " b) State of Decay";
        q13.opcaoC = " c) DayZ";
        q13.opcaoD = " d) 7 Days to Die";
        q13.opcaoE = " e) The Walking Dead";
        q13.correta = "c";
        q13.escrevaQuestao();
        resp = q13.leiaResposta();
        if (q13.isCorreta(resp)) cont++;

        Questao q14 = new Questao();
        q14.pergunta = "Qual é o nome do protagonista de 'Assassin's Creed'?";
        q14.opcaoA = " a) Ezio Auditore";
        q14.opcaoB = " b) Altair Ibn-La'Ahad";
        q14.opcaoC = " c) Connor Kenway";
        q14.opcaoD = " d) Desmond Miles";
        q14.opcaoE = " e) Edward Kenway";
        q14.correta = "d";
        q14.escrevaQuestao();
        resp = q14.leiaResposta();
        if (q14.isCorreta(resp)) cont++;

        Questao q15 = new Questao();
        q15.pergunta = "Em 'The Last of Us', qual é o nome do personagem principal?";
        q15.opcaoA = " a) Nathan Drake";
        q15.opcaoB = " b) Joel";
        q15.opcaoC = " c) Kratos";
        q15.opcaoD = " d) Leon Kennedy";
        q15.opcaoE = " e) Arthur Morgan";
        q15.correta = "b";
        q15.escrevaQuestao();
        resp = q15.leiaResposta();
        if (q15.isCorreta(resp)) cont++;

        System.out.println("\nRESULTADOS DO QUIZ:");
        System.out.println("Você acertou " + cont + " de 15 perguntas."); // Exibe o número de acertos
        System.out.println("Você acertou " + (15-cont) + " de 15 perguntas.");
        double porcentagem = (cont / 15.0) * 100;
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagem) + "%");
    }
}


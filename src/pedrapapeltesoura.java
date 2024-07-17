import java.util.Random;
import java.util.Scanner;

public class pedrapapeltesoura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int pontos_pc = 0;
        int pontos_jogador = 0;
        String pedrapapel = "";

        while (pontos_pc<3 && pontos_jogador<3){
            int papel_tesoura = aleatorio.nextInt(3);

            if (papel_tesoura==0){
                pedrapapel="tesoura";

            } else if (papel_tesoura==1) {
                pedrapapel = "pedra";

            }else {
                pedrapapel="papel";
            }

            System.out.println("Digite pedra , papel ou tesoura");
            String escolhadojogador = entrada.next();

            System.out.println("O jogador escolheu "+escolhadojogador);
            System.out.println("A maquina escolheu " + pedrapapel);

            if (escolhadojogador.equals(pedrapapel)){
                System.out.println("Empate");

            } else if ((escolhadojogador.equals("pedra") && pedrapapel.equals("tesoura")) ||
                    (escolhadojogador.equals("papel") && pedrapapel.equals("pedra")) ||
                    (escolhadojogador.equals("tesoura") && pedrapapel.equals("papel"))) {
                System.out.println("Usuario venceu a rodada!!");
                pontos_jogador++;


            }
            else {
                System.out.println("A maquina venceu a rodada");
                pontos_pc++;
            }
            System.out.println("Placar : Jogador  = "+pontos_jogador+" vs  Maquina = "+pontos_pc);

        }

        if(pontos_jogador==3){
            System.out.println("usuario campeao");
        }else {
            System.out.println("Maquina campeã");
        }
    entrada.close();
    }
}
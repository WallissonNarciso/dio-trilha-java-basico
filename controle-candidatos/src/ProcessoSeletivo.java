import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato:candidatos);
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;

            else
            System.out.println("Contato realizado com sucesso.");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        
        else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato +", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    
    // método auxíliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
}

static void imprimirSelecionados(){
    String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    // Forma através de interação com array(indice)
    for(int indice=0; indice < candidatos.length; indice++){
        System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
    }
    // Forma abreviada via for each
    for(String candidato:candidatos){
        System.out.println("O candidato selecionado foi " + candidato);
    }
}

    static void selecaoCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou um salário de ");
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

        }
        
    }

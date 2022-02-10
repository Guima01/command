public class DefesaJogador implements Tarefa{

    private Jogador jogador;

    public DefesaJogador(Jogador jogador){
        this.jogador = jogador;
    }

    public void executar(){
        this.jogador.defender();
    }

    public void cancelar(){
        this.jogador.atacar();
    }
}
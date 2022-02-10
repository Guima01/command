public class AtaqueJogador implements Tarefa{

    private Jogador jogador;

    public AtaqueJogador(Jogador jogador){
        this.jogador = jogador;
    }

    public void executar(){
        this.jogador.atacar();
    }

    public void cancelar(){
        this.jogador.defender();
    }
}

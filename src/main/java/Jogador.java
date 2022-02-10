public class Jogador {

    private String nome;
    private int level;
    private String acao;

    public Jogador(String nome, int level){
        this.nome = nome;
        this.level = level;
    }

    public String getAcao(){
        return this.acao;
    }

    public void atacar(){
        this.acao = "O usuário está Atacando";
    }

    public void defender(){
        this.acao = "O usuário está Defendendo";
    }
}

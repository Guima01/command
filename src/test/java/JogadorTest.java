import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {

    Jogador jogador;
    Usuario usuario;

    @BeforeEach
    void setUp(){
        jogador = new Jogador("Guima", 50);
        usuario = new Usuario();
    }

    @Test
    void deveAtacar() {
        Tarefa ataque = new AtaqueJogador(jogador);
        usuario.executarTarefa(ataque);

        assertEquals("O usuário está Atacando", jogador.getAcao());
    }

    @Test
    void deveDefender() {
        Tarefa defesa = new DefesaJogador(jogador);
        usuario.executarTarefa(defesa);

        assertEquals("O usuário está Defendendo", jogador.getAcao());
    }


    @Test
    void deveCancelarAtaque() {
        Tarefa defesa = new DefesaJogador(jogador);
        Tarefa ataque = new AtaqueJogador(jogador);

        usuario.executarTarefa(defesa);
        usuario.executarTarefa(ataque);

        usuario.cancelarUltimaTarefa();

        assertEquals("O usuário está Defendendo", jogador.getAcao());
    }

    @Test
    void deveCancelarDefesa() {
        Tarefa defesa = new DefesaJogador(jogador);
        Tarefa ataque = new AtaqueJogador(jogador);

        usuario.executarTarefa(ataque);
        usuario.executarTarefa(defesa);

        usuario.cancelarUltimaTarefa();

        assertEquals("O usuário está Atacando", jogador.getAcao());
    }
}

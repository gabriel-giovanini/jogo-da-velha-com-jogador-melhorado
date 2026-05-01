import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JogoDaVelhaTest {

    @Test
    void verificarJogador() {
        Jogador jogador = new JogadorHumano('X');
        assertEquals('X', jogador.getSimbolo());
    }

    @Test
    void verificarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertFalse(tabuleiro.acabouOJogo());
    }
}

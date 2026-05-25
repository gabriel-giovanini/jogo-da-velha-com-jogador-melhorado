<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> 3d55c702592b9f451f3b907fb979b2474aa7ea99
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
<<<<<<< HEAD
}
=======
}
>>>>>>> 3d55c702592b9f451f3b907fb979b2474aa7ea99

package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BishopBlackTest {
    /**
     * Создали объект слона
     * вызвали у него метод position.
     * проверили, что он занимает ту же ячейку, что и при создании объекта.
     */
    @Test
    public void whenCorrectPosition() {
        Cell start = Cell.A1;
        BishopBlack bishopBlack = new BishopBlack(start);
        assertThat(bishopBlack.position(), is(start));
    }

    /**
     * Создаем объект слона, вызываем  у него метод copy.
     * проверяем, что, возвращенный объект имеет правильную позицию.
     */
    @Test
    public void whenCorrectCopy() {
        Cell step = Cell.A2;
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertThat(bishopBlack.copy(step).position(), is(step));
    }
}
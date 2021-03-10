package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionTrue(){
        Cell cell = Cell.B2;
        BishopBlack b = new BishopBlack(cell);
        assertThat(b.position(),is(cell));
    }

    @Test
    public void whenCopyTrue(){
        Cell cell = Cell.B2;
        BishopBlack b = new BishopBlack(Cell.B6);
        assertThat(b.copy(cell).position(), is(cell));
    }

    @Test
    public void whenWayTrue(){
        BishopBlack b = new BishopBlack(Cell.C1);
        Cell [] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(b.way(Cell.G5), is(expected));
    }



}
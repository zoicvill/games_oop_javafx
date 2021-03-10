package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void whenLogicMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H5);

    }

    @Test
    public void whenImpossibleMoveExpTestTry()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        try {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.move(Cell.C1, Cell.H5);
        } catch (ImpossibleMoveException e) {
            Assert.assertEquals(String.format(
                    "Could not way by diagonal from %s to %s", Cell.C1, Cell.H5),
                    e.getMessage());
        }
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellExp()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void whenOccupiedCellExpTestTry()
            throws FigureNotFoundException, OccupiedCellException {
        try {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.add(new BishopBlack(Cell.E3));
            logic.move(Cell.C1, Cell.H6);
        } catch (OccupiedCellException o) {
            Assert.assertEquals("Ячейка занята",
                    o.getMessage());
        }

    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundExp()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.D2, Cell.H6);
    }

    @Test
    public void whenFigureNotFoundExpTestTry()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        try {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.move(Cell.D2, Cell.H6);
        }
        catch (FigureNotFoundException f){
            Assert.assertEquals("Фигуры нет на клетке.",f.getMessage());
        }

    }

}
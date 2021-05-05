package com.emtvoinos.studentwork.androidslotmachine;

import com.emtvoinos.studentwork.StMachine;
import com.emtvoinos.studentwork.Symbols;
import com.emtvoinos.studentwork.Wheel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by studentwork on 10/11/2017.
 */

public class TestStMachine {

    private Symbols lion;
    private Symbols alligator;
    private StMachine stMachine;

    @Before
    public void setUp() throws Exception {
        lion = Symbols.LION;
        alligator = Symbols.ALLIGATOR;
        stMachine = new StMachine(3);
    }

    @Test
    public void canGenerate3Wheels() throws Exception {
        assertEquals(3, stMachine.countSlots());
    }

    @Test
    public void canGenerate5Wheels() throws Exception {
        StMachine fiveStMachine = new StMachine(5);
        assertEquals(5, fiveStMachine.countSlots());
    }

    @Test
    public void playerCanAddMoreMoney() throws Exception {
        stMachine.setPlayerFunds(10);
        stMachine.addPlayerFunds(20);
        assertEquals(30, stMachine.checkPlayerFunds());
    }

    @Test
    public void spinGetsArrayList() throws Exception {
        ArrayList<Symbols> line = stMachine.spin();
        assertEquals(3, line.size());
    }

    @Test
    public void playFundsDecreaseAfterSpin() throws Exception {
        stMachine.setPlayerFunds(10);
        stMachine.spin();
        assertEquals(9, stMachine.checkPlayerFunds());
    }

    @Test
    public void canGetLineImages() {
        ArrayList<Symbols> line = new ArrayList<>();
        line.add(lion);
        line.add(alligator);
        ArrayList<String> images = stMachine.getLineImages(line);
        assertEquals("@drawable/lion", images.get(0));
    }

    @Test
    public void canCheckWinTrue() throws Exception {
        ArrayList<Symbols> line = new ArrayList<>();
        line.add(Symbols.RHINO);
        line.add(Symbols.RHINO);
        line.add(Symbols.RHINO);
        assertEquals(true, stMachine.checkWin(line));
    }

    @Test
    public void canCheckWinFalse() throws Exception {
        ArrayList<Symbols> line = new ArrayList<>();
        line.add(Symbols.RHINO);
        line.add(Symbols.RHINO);
        line.add(Symbols.LION);
        assertEquals(false, stMachine.checkWin(line));
    }

    @Test
    public void canGetWinValue() throws Exception {
        ArrayList<Symbols> line = new ArrayList<>();
        line.add(Symbols.RHINO);
        line.add(Symbols.RHINO);
        line.add(Symbols.RHINO);
        assertEquals(80, stMachine.getWinValue(line));
    }

    @Test
    public void canUpdateFundsFromWin() throws Exception {
        stMachine.setPlayerFunds(5);
        ArrayList<Symbols> line = new ArrayList<>();
        line.add(Symbols.RHINO);
        line.add(Symbols.RHINO);
        line.add(Symbols.RHINO);
        int value = stMachine.getWinValue(line);
        stMachine.addPlayerFunds(value);
        assertEquals(85, stMachine.checkPlayerFunds());
    }

    @Test
    public void canHold() throws Exception {
        stMachine.getSlots().get(0).setCurrentSymbol(Symbols.LION);
        stMachine.getSlots().get(0).setPlayerHasHeld(true);
        stMachine.spin();
        assertEquals(Symbols.LION, stMachine.getSlots().get(0).getCurrentSymbol());
    }

    @Test
    public void canGetCurrentSymbols() throws Exception {
        for(Wheel wheel : stMachine.getSlots()){
            wheel.setCurrentSymbol(Symbols.BUFFALO);
        }
        ArrayList<Symbols> line = stMachine.getCurrentSymbols();
        assertEquals(Symbols.BUFFALO, line.get(0));
        assertEquals(Symbols.BUFFALO, line.get(1));
        assertEquals(Symbols.BUFFALO, line.get(2));

    }
}

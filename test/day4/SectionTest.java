package day4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import day4.model.Section;

public class SectionTest {

    @Test
    public void testTextLineConstructor() {
        Section secion = new Section("7-8");
        assertEquals(7, secion.getFrom());
        assertEquals(8, secion.getTo());
    }

    @Test
    public void testIsAnyContainsOtherNoOverlap() {
        Section sectionA = new Section("0-1");
        Section sectionB = new Section("2-3");
        assertEquals(false, sectionA.isAnyContainsOther(sectionB));
        assertEquals(false, sectionB.isAnyContainsOther(sectionA));
    }

    @Test
    public void testIsAnyContainsOtherNoOverlapButTouch() {
        Section sectionA = new Section("0-2");
        Section sectionB = new Section("2-3");
        assertEquals(false, sectionA.isAnyContainsOther(sectionB));
        assertEquals(false, sectionB.isAnyContainsOther(sectionA));
    }

    @Test
    public void testIsAnyContainsOtherOverlap() {
        Section sectionA = new Section("0-5");
        Section sectionB = new Section("4-8");
        assertEquals(false, sectionA.isAnyContainsOther(sectionB));
        assertEquals(false, sectionB.isAnyContainsOther(sectionA));
    }

    @Test
    public void testIsAnyContainsOtherFullyContainsWithTouchAtTo() {
        Section sectionA = new Section("0-8");
        Section sectionB = new Section("4-8");
        assertEquals(true, sectionA.isAnyContainsOther(sectionB));
        assertEquals(true, sectionB.isAnyContainsOther(sectionA));
    }

    @Test
    public void testIsAnyContainsOtherFullyContainsWithTouchAtFrom() {
        Section sectionA = new Section("2-8");
        Section sectionB = new Section("2-10");
        assertEquals(true, sectionA.isAnyContainsOther(sectionB));
        assertEquals(true, sectionB.isAnyContainsOther(sectionA));
    }

    @Test
    public void testIsAnyContainsOtherFullyContainsFully() {
        Section sectionA = new Section("2-8");
        Section sectionB = new Section("3-5");
        assertEquals(true, sectionA.isAnyContainsOther(sectionB));
        assertEquals(true, sectionB.isAnyContainsOther(sectionA));
    }

    @Test
    public void testIsOverlappedNoOverlap() {
        Section sectionA = new Section("2-8");
        Section sectionB = new Section("9-11");
        assertEquals(false, sectionA.isOverlapped(sectionB));
        assertEquals(false, sectionB.isOverlapped(sectionA));
    }

    @Test
    public void testIsOverlappedFromOneSide() {
        Section sectionA = new Section("2-8");
        Section sectionB = new Section("6-11");
        assertEquals(true, sectionA.isOverlapped(sectionB));
        assertEquals(true, sectionB.isOverlapped(sectionA));
    }

    @Test
    public void testIsOverlappedFromOneSideTouch() {
        Section sectionA = new Section("2-8");
        Section sectionB = new Section("8-11");
        assertEquals(true, sectionA.isOverlapped(sectionB));
        assertEquals(true, sectionB.isOverlapped(sectionA));
    }

    @Test
    public void testIsOverlappedFromBothSide() {
        Section sectionA = new Section("2-8");
        Section sectionB = new Section("6-7");
        assertEquals(true, sectionA.isOverlapped(sectionB));
        assertEquals(true, sectionB.isOverlapped(sectionA));
    }

}

package test.grade;

import org.junit.jupiter.api.Test;

import grade.FinalGrade;

import static org.junit.jupiter.api.Assertions.*;


class FinalGradeTest {

    @Test
    public void testGetFinalGrade(){
        FinalGrade finalGrade = new FinalGrade();
        String grade = finalGrade.getFinalGrade(90);
        assertEquals("A", grade);
    }
}
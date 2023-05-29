package com.kodilla.optional.homework;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class ApplicationTest {
    @Test
    public void testApplicationOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        Application.main(new String[]{});

        System.out.flush();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        String[] lines = output.split("\n");

        Assert.assertEquals(4, lines.length);
        Assert.assertTrue(lines[0].contains("Uczeń: Jan Kowalski, nauczyciel: Tomasz Nowak"));
        Assert.assertTrue(lines[1].contains("Uczeń: Anna Nowak, nauczyciel: <undefined>"));
        Assert.assertTrue(lines[2].contains("Uczeń: Piotr Wiśniewski, nauczyciel: Marta Lewandowska"));
        Assert.assertTrue(lines[3].contains("Uczeń: Maria Kowalczyk, nauczyciel: <undefined>"));
    }

    @Test
    public void testCreateStudentList() {
        List<Student> students = Application.createStudentList();
        Assert.assertEquals(4, students.size());
    }
}

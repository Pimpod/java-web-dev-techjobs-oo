package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {

    @Test
    public void testSettingJobId(){
        Job test1 = new Job();
        Job test2 = new Job();

        assertEquals(test2.getId() - test1.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertEquals(test3.getName(), "Product tester");
        assertEquals(test3.getEmployer().toString(), "ACME");
        assertEquals(test3.getLocation().toString(), "Desert");
        assertEquals(test3.getPositionType().toString(), "Quality control");
        assertEquals(test3.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job test4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(test4.getId(), test5.getId());

    }
    @Test
    public void toStringTest(){
        Job test6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertEquals("ID: " + test6.getId() + "\nName: Product tester" +
                "\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control" +
                "\nCore Competency: Persistence\n\n", test6.toString());

    }

    @Test
    public void emptyFieldTest(){
        Job test7 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("ID: " + test7.getId() + "\nName: Data not available" +
                "\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control" +
                "\nCore Competency: Persistence\n\n", test7.toString());
    }

}

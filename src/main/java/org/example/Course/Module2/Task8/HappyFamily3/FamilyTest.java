package org.example.Course.Module2.Task8.HappyFamily3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {

    private Family family;
    private Human father;
    private Human mother;
    private Human child1;
    private Human child2;

    @BeforeEach
    void setUp() {
        father = new Human("Vito", "Corleone", 1920);
        mother = new Human("Carmela", "Corleone", 1925);
        family = new Family(father, mother);
        child1 = new Human("Sonny", "Corleone", 1946);
        child2 = new Human("Michael", "Corleone", 1950);
    }

    @Test
    void testToString() {
        String expectedString = "\nFamily ->{ Father: Vito Corleone | Mother: Carmela Corleone\n\t | Children: []\n\t\t | Pet: null }";
        assertEquals(expectedString, family.toString());
    }

    @Test
    void addChild_shouldIncreaseArraySizeAndAddChild() {
        assertEquals(2, family.countFamily());
        family.addChild(child1);
        assertEquals(3, family.countFamily());
        assertEquals(child1, family.getChildren()[0]);
        assertEquals(family, child1.getFamily());
    }

    @Test
    void deleteChildByObject_shouldDecreaseArraySizeOnSuccess() {
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(4, family.countFamily());

        boolean result = family.deleteChild(child1);

        assertTrue(result);
        assertEquals(3, family.countFamily());
        assertEquals(child2, family.getChildren()[0]); // Sonny is deleted, Michael is now at index 0
        assertNull(child1.getFamily()); // Check if the link is broken
    }

    @Test
    void deleteChildByObject_shouldNotChangeArrayOnFailure() {
        family.addChild(child1);
        Human stranger = new Human("Fredo", "Corleone", 1948);
        assertEquals(3, family.countFamily());

        boolean result = family.deleteChild(stranger);

        assertFalse(result);
        assertEquals(3, family.countFamily());
    }

    @Test
    void deleteChildByIndex_shouldDecreaseArraySizeOnSuccess() {
        family.addChild(child1);
        assertEquals(3, family.countFamily());

        boolean result = family.deleteChild(0);

        assertTrue(result);
        assertEquals(2, family.countFamily());
        assertEquals(0, family.getChildren().length);
    }

    @Test
    void deleteChildByIndex_shouldNotChangeArrayOnInvalidIndex() {
        family.addChild(child1);
        assertEquals(3, family.countFamily());

        boolean result = family.deleteChild(5); // Index out of bounds

        assertFalse(result);
        assertEquals(3, family.countFamily());
    }

    @Test
    void countFamily_shouldReturnCorrectMemberCount() {
        assertEquals(2, family.countFamily());
        family.addChild(child1);
        assertEquals(3, family.countFamily());
        family.addChild(child2);
        assertEquals(4, family.countFamily());
    }
}


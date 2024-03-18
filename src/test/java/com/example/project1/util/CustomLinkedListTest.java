package com.example.project1.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {

    @Test
    @DisplayName("Add a new node to the linked list")
    void add() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        Iterator<Integer> iterator = linkedList.iterator();
        assertTrue(iterator.hasNext(), "The list should have at least one element");
        assertEquals(1, iterator.next(), "The list should have an element with value equals to 1");
        assertFalse(iterator.hasNext(), "The list should not have the second element");
    }


    @Test
    @DisplayName("Reverse nodes` links directions")
    void reverseNodesLinksDirections() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.reverseNodesLinksDirections();
        int[] expectedValues = new int[] {4, 3, 2, 1};
        int index = 0;
        for (int node : linkedList) {
            assertEquals(node, expectedValues[index], "Expected values should be 4 3 2 1");
            index++;
        }
    }

    @Test
    @DisplayName("Get size of the linked list")
    void getSize() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        assertEquals(1, linkedList.getSize(), "Size must be equal to 1");
        linkedList.add(2);
        assertEquals(2, linkedList.getSize(), "Size must be equal to 2");
    }
}
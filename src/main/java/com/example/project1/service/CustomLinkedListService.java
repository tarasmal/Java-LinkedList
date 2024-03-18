package com.example.project1.service;


import com.example.project1.util.CustomLinkedList;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class CustomLinkedListService {

    @PostConstruct
    public void printAndReverseLinkedList() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        CustomLinkedList.printAllNodesOf(linkedList);
        linkedList.reverseNodesLinksDirections();
        CustomLinkedList.printAllNodesOf(linkedList);
    }
}

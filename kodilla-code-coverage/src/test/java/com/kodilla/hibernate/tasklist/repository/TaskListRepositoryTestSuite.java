package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Testing: find task lists by list name";

    @AfterEach
    private  void  cleanUpByDescription(){
        List<TaskList> allAddedTaskLists = taskListRepository.findByDescription(DESCRIPTION);
        for (TaskList taskList : allAddedTaskLists) {
            int id = taskList.getId();
            taskListRepository.deleteById(id);
        }
    }
    @Test
    void testTaskListRepositoryFindByListNameFromOneList() {
        //Given
        TaskList taskList = new TaskList("Test list 1", DESCRIPTION);
        taskListRepository.save(taskList);

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(taskList.getListName());

        //Then
        Assertions.assertEquals(1, readTaskLists.size());

        //CleanUp
        cleanUpByDescription();
    }

    @Test
    void testTaskListRepositoryFindByListNameFromThreeDifferentLists() {
        //Given
        TaskList taskListFirst = new TaskList("Test list 1", DESCRIPTION);
        taskListRepository.save(taskListFirst);
        TaskList taskListSecond = new TaskList("Test list 2", DESCRIPTION);
        taskListRepository.save(taskListSecond);
        TaskList taskListThird = new TaskList("Test list 3", DESCRIPTION);
        taskListRepository.save(taskListThird);
        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(taskListSecond.getListName());

        //Then
        Assertions.assertEquals(1, readTaskLists.size());

        //CleanUp
        cleanUpByDescription();
    }

    @Test
    void testTaskListRepositoryFindByListNameFromThreeListsWhereTwoHaveTheSameNames() {
        //Given
        TaskList taskListFirst = new TaskList("Test list 1", DESCRIPTION);
        taskListRepository.save(taskListFirst);
        TaskList taskListSecond = new TaskList("Test list 1", DESCRIPTION);
        taskListRepository.save(taskListSecond);
        TaskList taskListThird = new TaskList("Test list 3", DESCRIPTION);
        taskListRepository.save(taskListThird);
        //When
        String listName = taskListSecond.getListName();
        List<TaskList> readTaskLists = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals(2, readTaskLists.size());

        //CleanUp
        cleanUpByDescription();
    }
}
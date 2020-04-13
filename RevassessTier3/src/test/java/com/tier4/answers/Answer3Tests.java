package com.tier4.answers;

import static org.junit.Assert.assertEquals;

import com.rev.dao.UserRepository;

import org.junit.Test;
import static com.tier4.answers.PointsTests.addPoints;
/**
 * 
 * prompt:
 * Implement only the CrudRepository 
 * interface methods within UserRepository 
 * class using the provided class diagram
 * 
 */
public class Answer3Tests {

    @Test
    public void testImplementation(){
        Class[] interfaces = UserRepository.class.getInterfaces();
        System.out.println(interfaces[0]);
        assertEquals(com.rev.dao.CrudRepository.class, interfaces[0]);
        addPoints(30);
    }
}
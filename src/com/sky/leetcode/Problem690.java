package com.sky.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Problem690 {
    public int getImportance(List<Employee> employees, int id) {
    	if (employees.isEmpty()) return 0;
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
        	map.put(e.id, e);
        }
        int result = 0;
        Queue<Employee> queue = new LinkedList<Employee>();
        queue.add(map.get(id));
        while (!queue.isEmpty()) {
        	Employee e = queue.poll();
        	result += e.importance;
        	List<Integer> employeeId = e.subordinates;
        	for (Integer eId : employeeId) {
        		queue.add(map.get(eId));
        	}
        }
        return result;
    }
    
    public static void main(String[] args) {
    	
    	List<Employee> employees = new ArrayList<Employee>();
    	Employee e1 = new Employee();
    	e1.id = 1;
    	e1.importance = 5;
    	List<Integer> list1 = new ArrayList<>();
    	list1.add(2);
    	list1.add(3);
    	e1.subordinates = list1;
    	
    	Employee e2 = new Employee();
    	e2.id = 2;
    	e2.importance = 3;
    	List<Integer> list2 = new ArrayList<>();
//    	list1.add(2);
//    	list1.add(3);
    	e2.subordinates = list2;
    	
    	Employee e3 = new Employee();
    	e3.id = 3;
    	e3.importance = 3;
    	List<Integer> list3 = new ArrayList<>();
//    	list1.add(2);
//    	list1.add(3);
    	e3.subordinates = list3;
    	employees.add(e1);
    	employees.add(e2);
    	employees.add(e3);
    	
		System.out.println(new Problem690().getImportance(employees, 1));
	}
    
}

package org.codeforcause.jdsa.lecture28;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQClient {
    class Employee implements Comparable<Employee>{
        int empId;
        int salary;

        @Override
        public int compareTo(Employee e) {
            return this.salary - e.salary;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}

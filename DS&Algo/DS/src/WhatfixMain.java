import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * function List<Employee>
 *     Employee - id, name, companyName
 *     function groupByCompanyName
 *
 *     //1,"Karthik","Honeywell"
 *     //2,"Foo","Honeywell"
 *     //3,"John","whatfix"
 *
 *     //Honeywell, "Karthik","Foo"
 *     //Whatfix, "John"
 *
 *
 *     //JPA
 *     List<Employee> findAllEmployeesIn(@Param String department)
 *
 *     groupbyCompanyName(List<Employee> empList)
 */

/**
 * exposed as library and used by developers
 * function is taking too long to execute
 * wrapper function to wrapper
 * memcache or redis cache
 *
 * mc.get(
 *
 * public Employee fetchUserDetails(String userName){
 *
 *     postgre// select * from postgres.user=username
 *
 *     return ;
 *
 * }
 */

public class WhatfixMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Karthik", "Honeywell");
        Employee e2 = new Employee(2, "Foo", "Honeywell");
        Employee e3 = new Employee(3, "John", "whatfix");
        //Employee e1 = new Employee(1, "Karthik", "Honeywell");
        //Employee e1 = new Employee(1, "Karthik", "Honeywell");


        List<Employee> employeeList = Arrays.asList(e1,e2,e3);
        Map<String,String> hm = new HashMap<>();
        for (Employee e: employeeList) {
            String s = hm.get(e.getCompanyName());
            if(s == null)
                hm.put(e.getCompanyName(),e.geteName());
            else{
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("-->");
                sb.append(e.geteName());
                hm.put(e.getCompanyName(),sb.toString());
            }
        }
        System.out.println(hm);
        //employeeList.stream().collect(gr)

        //function/method List<Integers> and returns uniqueArray
        //4,5,6,3,4,1
        //4,5,6,3,1
       // List<Integer> integerList = Arrays.asList(4,5,6,3,4,1,1,1);
        //System.out.println(uniqueList(integerList));

    }


    public static int[] uniqueList(int[]  inputList){

        //List<Integer> tempList = new ArrayList<>();
        /*for (Integer i: inputList) {
            //TC: O(n^2)
            //SC: O(n)
            if(!tempList.contains(i))//O(n)
                tempList.add(i);
        }
        return tempList;*/

        return new int[0];
    }

    public static List<Integer> uniqueList(List<Integer> inputList){
        List<Integer> tempList = new ArrayList<>();
        for (Integer i: inputList) {
            //TC: O(n^2)
            //SC: O(n)
            if(!tempList.contains(i))//O(n)
                tempList.add(i);
        }
        return tempList;
    }
}

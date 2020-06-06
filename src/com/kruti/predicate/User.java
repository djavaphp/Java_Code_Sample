package com.kruti.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class User {
	String name, role; 
    User(String a, String b) { 
        name = a; 
        role = b; 
    } 
    String getRole() { return role; } 
    String getName() { return name; }     
    public String toString() { 
       return "User Name : " + name + ", Role :" + role; 
    } 
  
    public static void main(String args[]) 
    {       
        List<User> users = new ArrayList<User>(); 
        users.add(new User("Kruti", "admin")); 
        users.add(new User("Dhaval", "admin")); 
        users.add(new User("Panth", "user")); 
        users.add(new User("Navish", "member")); 
        List admins = process(users, (User u) -> u.getRole().equals("admin")); 
        System.out.println(admins);
        List admin1 = process(users, (User u) -> u.getRole().equals("member"));
        System.out.println(admin1);
        
        List<User> users1 = new ArrayList<User>(); 
        users1.add(new User("Kruti", "admin")); 
        users1.add(new User("Dhaval", "admin")); 
        users1.add(new User("Panth", "user")); 
        users1.add(new User("Navish", "member"));
        
        List user2 = users1.stream().filter((u) -> u.getRole().equals("user")).collect(Collectors.toList());
        System.out.println(user2);
    } 
  
    public static List<User> process(List<User> users,  
                            Predicate<User> predicat) 
    { 
        List<User> result = new ArrayList<User>(); 
        for (User user: users)         
            if (predicat.test(user))             
                result.add(user); 
        return result; 
    } 
}

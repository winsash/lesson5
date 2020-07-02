package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan 0", "Engineer 0", "ivivan0@mailbox.com", 892312000, 30000.65, 23);
        empArray[1] = new Employee("Ivanov Ivan 1", "Engineer 1", "ivivan1@mailbox.com", 892312001, 40000.34, 20);
        empArray[2] = new Employee("Ivanov Ivan 2", "Engineer 2", "ivivan2@mailbox.com", 892312002, 70000.53, 55);
        empArray[3] = new Employee("Ivanov Ivan 3", "Engineer 3", "ivivan3@mailbox.com", 892312003, 98000.65, 27);
        empArray[4] = new Employee("Ivanov Ivan 4", "Engineer 4", "ivivan4@mailbox.com", 892312004, 90000.54, 42);
        for (int i=0; i<5; i++)
        {
            if (empArray[i].getAge()>40)
            {
                empArray[i].getInfo();
            }
        }

    }
}

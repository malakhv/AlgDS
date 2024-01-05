/* *
 * Copyright (C) 1996-2012 Mikhail Malakhov <malakhv@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.
 *
 * See the License for the specific language governing permissions
 * and limitations under the License.
 * */

package me.mikhan.algds;

import me.mikhan.algds.list.SinglyLinkedList;
import me.mikhan.algds.number.Fibonacci;
import me.mikhan.algds.number.PrimeNumbers;
import me.mikhan.algds.utils.Console;

import java.util.List;

/**
 * The main class of this application.
 *
 * @author Mikhail.Malakhov
 * */
public final class App {


    /** The name of this app. */
    private static final String APP_NAME = "AlgDS";

    /**
     * The main task block of this app.
     * */
    public static void main(String[] args) {
        // LinkedList
        if (true) testList();

        // Fibonacci
        if (false) testFibonacci();

        // Prime Numbers
        if (false) testPrimeNumbers();

    }

    private static void testList() {
        Console.head("Singly Linked List");
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        // Fill list
        for (int i = 0; i < 17; i++) list.add(i);
        Console.println(list);

        // Remove element
        Console.println("Remove:");
        list.remove(0); Console.println(list);
        list.remove(1); Console.println(list);
        list.remove(-5); Console.println(list);
        list.remove(14); Console.println(list);

        // Insert element
        Console.println("Insert:");
        list.add(0,0); Console.println(list);
        list.add(2,2); Console.println(list);
        list.add(2,-1); Console.println(list);
        list.add(16,16); Console.println(list);

        // Revert list
        Console.println("Revert:");
        list.invert();
        Console.println(list);
        SinglyLinkedList.invert(list);
        Console.println(list);
        Console.line();
    }

    private static void testFibonacci() {
        Console.head("Fibonacci");
        int fib = 0;
        for (int i = 0; i < 20; i++) {
            fib = Fibonacci.getByRecursion(i);
            Console.print(fib); Console.print(" ");
        }
        Console.line();
        for (int i = 0; i < 20; i++) {
            fib = Fibonacci.getByLoop(i);
            Console.print(fib); Console.print(" ");
        }
        Console.line();
    }

    private static void testPrimeNumbers() {
        Console.head("Prime Numbers");
        List list = PrimeNumbers.get(100);
        Console.println(list);
    }

}

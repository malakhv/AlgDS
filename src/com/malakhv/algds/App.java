/* *
 * Copyright (C) 2012 Mikhail Malakhov <malakhv@live.ru>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */

package com.malakhv.algds;

import com.malakhv.algds.list.SinglyLinkedList;
import com.malakhv.algds.utils.Console;

/**
 * The main class of this application.
 * @author Mikhail.Malakhov [malakhv@live.ru|https://github.com/malakhv]
 * */
public final class App {


    /** The name of this app. */
    private static final String APP_NAME = "AlgDS";

    /**
     * The main task block of this app.
     * */
    public static void main(String[] args) {

        /*
         * Single Linked List
         * */
        Console.head("Singly Linked List");
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        /* Add several elements and print it */
        for (int i = 0; i < 10; i++) list.add(i);
        Console.println(list);

        Console.print("{");
        Integer element;
        for (int i = 0; i < 10; i++) {
            element = list.get(i);
            Console.print(element);
            if (i < 9) Console.print(",");
        }
        Console.println("}");

        /* Remove element */
        Console.println("Remove:"); Console.println(list);
        list.remove(0); Console.println(list);
        list.remove(1); Console.println(list);
        list.remove(-5); Console.println(list);
        list.remove(15); Console.println(list);

        /* Insert element */
        Console.println("Insert:"); Console.println(list);
        list.add(0,0); Console.println(list);
        list.add(2,2); Console.println(list);
        list.add(2,-1); Console.println(list);
        list.add(2,12); Console.println(list);

        /* Revert list */
        Console.println("Revert:"); Console.println(list);
        list.invert(); Console.println(list);
        SinglyLinkedList.invert(list); Console.println(list);
    }
}
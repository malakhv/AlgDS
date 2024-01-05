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

package me.mikhan.algds.utils;

/**
 * Class contains methods for print an information to system out.
 * @author Mikhail.Malakhov [malakhv@live.ru|https://github.com/malakhv]
 * */
public class Console {

    /** The empty string. */
    private static final String STR_EMPTY = "";

    /** The space (' ') string. */
    private static final String STR_SPACE = " ";

    /** The '#' string. */
    private static final String STR_OCTOTHORPE = "#";

    /** The string that used as separator. */
    private static final String STR_SEP =
            "--------------------------------------------------------------------------------";

    /**
     * Prints the empty line.
     * */
    public static void line() { println(STR_EMPTY); }

    /**
     * Prints the header with specified {@code title}.
     * */
    public static void head(String title) {
        sep();
        print("- "); println(title);
        sep();
    }

    /**
     * Prints the separator.
     * */
    public static void sep() { println(STR_SEP); }

    /**
     * Prints an object.
     * */
    public static void print(Object o) { System.out.print(o); }

    /**
     * Prints an Object and then terminate the line.
     * */
    public static void println(Object o) { System.out.println(o); }

    /** This class has only static data, not need to create instance. */
    private Console() { /* Empty */ }

}
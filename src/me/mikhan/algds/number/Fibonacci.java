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

package me.mikhan.algds.number;

/**
 * Class contains some methods for working with Fibonacci numbers.
 * @author Mikhail.Malakhov [malakhv@live.ru|https://github.com/malakhv]
 * */
public class Fibonacci {

    /**
     * @return The n-member of a Fibonacci sequence.
     * */
    public static int getByRecursion(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        return getByRecursion(n - 2) + getByRecursion(n - 1);
    }

    /**
     * @return The n-member of a Fibonacci sequence.
     * */
    public static int getByLoop(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        int n1 = 0, n2 = 1, fib = 1; // for n = 2
        for (int i = 3; i <= n; i++) {
            n1 = n2;
            n2 = fib;
            fib = n1 + n2;
        }
        return fib;
    }
}
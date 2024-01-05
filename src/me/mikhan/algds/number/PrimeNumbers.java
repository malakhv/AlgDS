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

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains some algorithms for working with prime numbers.
 * @author Mikhail.Malakhov [malakhv@live.ru|https://github.com/malakhv]
 * */
public class PrimeNumbers {

    public static List<Integer> get(int max) {
        final List<Integer> list = new ArrayList<>(max / 2);
        if (max <= 0) return list;
        if (max <= 2) { // 1 - is a prime number
            list.add(1); return list;
        }

        // Define boolean array where index is number (all
        // elements except 0 are true, by default)
        final boolean[] prime = new boolean[max];
        prime[0] = false;
        for (int i = 1; i < prime.length; i++) prime[i] = true;

        // Main algorithm (Sieve of Eratosthenes)
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) continue;
            for (int j = i+i; j < prime.length; j = j + i) {
                prime[j] = false;
            }
        }

        // Fill list
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) list.add(i);
        }
        return list;
    }
}
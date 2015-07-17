/**
 * Copyright 2014 Nikita Koksharov, Nickolay Borbit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.core;

import io.netty.util.concurrent.Future;

import java.util.Collection;
import java.util.List;

/**
 * Async list functions
 *
 * @author Nikita Koksharov
 *
 * @param <V> the type of elements held in this collection
 */
public interface RListAsync<V> extends RExpirableAsync {

    Future<Integer> lastIndexOfAsync(Object o);

    Future<Integer> indexOfAsync(Object o);

    Future<Void> fastSetAsync(int index, V element);

    Future<V> setAsync(int index, V element);

    Future<Boolean> retainAllAsync(Collection<?> c);

    Future<Boolean> removeAllAsync(Collection<?> c);

    Future<Boolean> containsAllAsync(Collection<?> c);

    Future<Boolean> removeAsync(Object o);

    Future<List<V>> readAllAsync();

    Future<Integer> sizeAsync();

    Future<V> getAsync(int index);

    Future<Boolean> addAsync(V e);

    Future<Boolean> addAllAsync(Collection<? extends V> c);

}
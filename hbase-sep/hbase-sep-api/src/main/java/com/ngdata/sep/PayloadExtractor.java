/*
 * Copyright 2013 NGDATA nv
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ngdata.sep;

/**
 * Used to extract payloads when constructing {@link SepEvent}s.
 */
public interface PayloadExtractor {
    
    /**
     * Extract the payload data from a KeyValue.
     * <p>
     * Data should only be extracted if it matches the configured table, column family, and column qualifiers. If no
     * payload data can be extracted, null should be returned.
     * @param <T>
     * 
     * @param tableName table to which the {@code KeyValue} is being applied
     * @param keyValue contains a (partial) row mutation which may include payload data
     * @return the extracted payload data, or null if no payload data is included in the supplied {@code KeyValue}
     */
    public <T> byte[] extractPayload(byte[] tableName, T keyValue);

}

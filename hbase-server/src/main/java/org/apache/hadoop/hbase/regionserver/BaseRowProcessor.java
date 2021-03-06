/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver;

import java.io.IOException;
import java.util.UUID;

import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.regionserver.wal.WALEdit;

/**
 * Base class for RowProcessor with some default implementations.
 */
public abstract class BaseRowProcessor<T> implements RowProcessor<T> {

  @Override
  public T getResult() {
    return null;
  }

  @Override
  public void preProcess(HRegion region, WALEdit walEdit) throws IOException {
  }

  @Override
  public void postProcess(HRegion region, WALEdit walEdit) throws IOException {
  }

  @Override
  public UUID getClusterId() {
    return HConstants.DEFAULT_CLUSTER_ID;
  }

  @Override
  public String getName() {
    return this.getClass().getSimpleName().toLowerCase();
  }
}

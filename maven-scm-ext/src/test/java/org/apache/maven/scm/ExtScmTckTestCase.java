/*
 * Copyright (C) 2010 Evgeny Mandrikov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.maven.scm;

import org.apache.maven.scm.manager.ExtScmManager;
import org.apache.maven.scm.manager.ExtScmManagerFactory;

/**
 * @author Evgeny Mandrikov
 */
public abstract class ExtScmTckTestCase extends ScmTckTestCase {
  protected abstract boolean isPureJava();

  @Override
  protected ExtScmManager getScmManager() throws Exception {
    return ExtScmManagerFactory.getScmManager(isPureJava());
  }
}
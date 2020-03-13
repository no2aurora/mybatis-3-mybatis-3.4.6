/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.disallowdotsonnames;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class DisallowDotsOnNamesTest {
        
    @Test(expected=PersistenceException.class)
    public void testShouldNotAllowMappedStatementsWithDots() throws IOException {
        Reader reader = Resources.getResourceAsReader("org/apache/ibatis/submitted/disallowdotsonnames/ibatisConfig.xml");
        new SqlSessionFactoryBuilder().build(reader);
    }

}

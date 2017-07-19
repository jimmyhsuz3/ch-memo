/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
// START SNIPPET: service
package demo.spring.service;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	@javax.jws.WebMethod(operationName="sayHi", action="tns:HelloWorld/sayHi")
    String sayHi(@javax.jws.WebParam(name = "text") String text);
	@javax.jws.WebMethod(operationName="get", action="tns:HelloWorld/get")
    XRayType get(@javax.jws.WebParam(name = "filePath") String filePath);
}
// END SNIPPET: service

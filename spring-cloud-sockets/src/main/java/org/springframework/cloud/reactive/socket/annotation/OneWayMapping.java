/*
 *  Copyright 2017 original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.cloud.reactive.socket.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.cloud.reactive.socket.ExchangeMode;
import org.springframework.core.annotation.AliasFor;

/**
 * Annotates a method to be exposed via a fire and forget exchange type on reactive sockets.
 *
 * @see io.rsocket.RSocket
 * @author Vinicius Carvalho
 */
@ReactiveSocket(exchangeMode = ExchangeMode.ONE_WAY)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OneWayMapping {

	@AliasFor(annotation = ReactiveSocket.class)
	String value();

	@AliasFor(annotation = ReactiveSocket.class)
	String mimeType() default "application/java-serialized-object";
}

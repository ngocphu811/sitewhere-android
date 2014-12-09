/*
 * Copyright (c) Reveal Technologies, LLC. All rights reserved. http://www.reveal-tech.com
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
package com.sitewhere.android.messaging;

/**
 * Constants for interacting with SiteWhere messaging services.
 * 
 * @author Derek
 */
public interface ISiteWhereMessaging {

	/** Identifier for extra that holds configuration data */
	public static final String EXTRA_CONFIGURATION = "configuration";

	/** Marker for service to be used for SiteWhere messaging */
	public static final String MESSAGING_SERVICE = "com.sitewhere.messaging.MESSAGING_SERVICE";
}
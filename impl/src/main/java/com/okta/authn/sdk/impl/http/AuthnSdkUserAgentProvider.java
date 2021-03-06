/*
 * Copyright 2018 Okta, Inc.
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
package com.okta.authn.sdk.impl.http;

import com.okta.sdk.http.UserAgentProvider;
import com.okta.sdk.impl.http.support.Version;

public class AuthnSdkUserAgentProvider implements UserAgentProvider {

    private static final String OKTA_AUTHN_STRING = "okta-auth-java";
    private static final String VERSION_SEPARATOR = "/";
    static final String VERSION_FILE = "/com/okta/authn/sdk/version.properties";

    @Override
    public String getUserAgent() {
        return OKTA_AUTHN_STRING + VERSION_SEPARATOR + Version.getClientVersion(VERSION_FILE);
    }
}

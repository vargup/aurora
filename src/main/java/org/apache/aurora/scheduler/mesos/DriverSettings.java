/**
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
package org.apache.aurora.scheduler.mesos;

import java.util.Optional;

import com.google.common.annotations.VisibleForTesting;

import org.apache.mesos.v1.Protos;

import static java.util.Objects.requireNonNull;

/**
 * Settings required to create a scheduler driver.
 */
@VisibleForTesting
public class DriverSettings {
  private final String masterUri;
  private final Optional<Protos.Credential> credentials;

  public DriverSettings(
      String masterUri,
      Optional<Protos.Credential> credentials) {

    this.masterUri = requireNonNull(masterUri);
    this.credentials = requireNonNull(credentials);
  }

  public String getMasterUri() {
    return masterUri;
  }

  public Optional<Protos.Credential> getCredentials() {
    return credentials;
  }
}

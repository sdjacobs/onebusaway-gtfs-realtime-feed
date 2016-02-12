/**
 * Copyright (C) 2016 Brian Ferris <bdferris@onebusaway.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.realtime.soundtransit.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class TripInfoList {
  @JsonProperty("environment")
  private String envMessage;
  @JsonProperty("Trip")
  private List<TripInfo> trips;

  public String getEnvMessage() {
    return envMessage;
  }

  public void setEnvMessage(String envMessage) {
    this.envMessage = envMessage;
  }

  public List<TripInfo> getTrips() {
    return trips;
  }

  public void setTrips(List<TripInfo> trips) {
    this.trips = trips;
  }
}

/*-
 * <<
 * wormhole
 * ==
 * Copyright (C) 2016 - 2017 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */


package edp.wormhole.sinks

import edp.wormhole.common.ConnectionConfig
import edp.wormhole.ums.UmsFieldType.UmsFieldType
import edp.wormhole.ums.UmsProtocolType.UmsProtocolType

trait SinkProcessor {

  def process(protocolType:UmsProtocolType,
              sourceNamespace:String,
              sinkNamespace:String,
              sinkProcessConfig:SinkProcessConfig,
              schemaMap: collection.Map[String, (Int, UmsFieldType, Boolean)],
              tupleList: Seq[Seq[String]],
              connectionConfig:ConnectionConfig)


}

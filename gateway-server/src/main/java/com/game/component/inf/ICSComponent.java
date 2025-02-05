/*
 * Copyright 2016-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.game.component.inf;

import com.game.component.IComponent;
import com.game.net.CommonMessage;
import com.google.protobuf.ByteString;

/**
 * @author leesin
 */
public interface ICSComponent extends IComponent
{
    String NAME = "CSComponent";

    void ping();

    void sendToAll(CommonMessage message);

    void forwardMessage(int toServer, byte[] packet, short code);

    void forwardMessage(int toServer, ByteString packet, short code);

    void msgToUser(int toServer, ByteString packet);
}

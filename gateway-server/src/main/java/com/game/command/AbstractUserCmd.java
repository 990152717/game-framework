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

package com.game.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.game.component.ComponentManager;
import com.game.net.IClientConnection;
import com.game.object.ProxyPlayer;
import com.google.protobuf.ByteString;

/**
 * @author leesin
 *
 */
public abstract class AbstractUserCmd implements ICommand
{
    protected final Logger LOGGER = LoggerFactory.getLogger(getClass().getName());

    /**
     * 用户任务的调度分配， Handler调用
     */
    @Override
    public void execute(IClientConnection client, ByteString packet, short code) throws Exception
    {
        if (client == null)
        {
            LOGGER.error("client null error!");
            return;
        }
        ProxyPlayer player = (ProxyPlayer) client.getHolder();
        if (player == null)
        {
            // 没有创建ProxyPlayer对象前的客户端请求
            ServerCmdTask task = new ServerCmdTask(this, packet, client);
            ComponentManager.getInstance().getUserCmdThreadPool().submit(task);
        }
        else
        {
            UserCmdTask task = new UserCmdTask(this, packet, player, code);
            player.addCommandTask(task);
        }
    }

    /**
     * (non-Javadoc)
     * 
     * @see com.game.command.ICommand#execute(com.game.net.IClientConnection, byte[])
     */
    @Override
    public void execute(IClientConnection client, byte[] packet) throws Exception
    {

    }

    public void execute(ProxyPlayer player, ByteString packet)
    {

    }

    public void execute(ProxyPlayer player, ByteString packet, short code)
    {
        execute(player, packet);
    }

    /**
     * server executeConnect(还没有玩家的)
     * 
     * @param conn
     *            client connection
     * 
     * @param packet
     *            packet
     */
    public void executeConnect(IClientConnection conn, ByteString packet)
    {

    }

}

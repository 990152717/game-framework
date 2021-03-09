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

import com.game.object.ProxyPlayer;
import com.game.util.StackMessagePrint;
import com.google.protobuf.ByteString;

/**
 * @author leesin
 *
 */
public class UserCmdTask extends AbstractTask
{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCmdTask.class);

    protected ProxyPlayer player;

    protected short code;

    /**
     * @param cmd
     *            command
     * @param message
     *            message
     * @param player
     *            player
     * @param code
     *            protocol code
     */
    public UserCmdTask(AbstractUserCmd cmd, ByteString message, ProxyPlayer player, short code)
    {
        super(cmd, message);
        this.player = player;
        this.code = code;
    }

    /**
     * (non-Javadoc)
     * 
     * @see com.game.command.AbstractTask#execute()
     */
    @Override
    protected void execute()
    {
        try
        {
            // this.cmd.execute(this.player, this.message);
            this.cmd.execute(player, message, code);
        }
        catch (Throwable e)
        {
            LOGGER.error(StackMessagePrint.printErrorTrace(e));
        }
        finally
        {
            player.finishOneCommandTask();
        }
    }

}

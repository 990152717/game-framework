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

package com.game.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.game.GateWayServer;
import com.game.cs.CSServerConn;
import com.game.type.ServerStateType;

/**
 * @author leesin
 *
 */
public class CSReconnectJob implements Job
{

    /**
     * (non-Javadoc)
     * 
     * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
     */
    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException
    {
        if (GateWayServer.getInstance().getStatus() == ServerStateType.RUNNING.getValue())
        {
            CSServerConn conn = (CSServerConn) arg0.getMergedJobDataMap().get("object");
            conn.reconnect();
        }
    }
}

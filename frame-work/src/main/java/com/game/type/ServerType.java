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

package com.game.type;

/**
 * @date 2020年03月31日 18:03
 * @author leesin
 */
public enum ServerType
{
    GAME(1),      		 // 游戏服务器
    CENTER(2),         	 // 中央服务器
    GATE(3),  			 // 网关
    LOGIN(4),  			 // 登录
    RESOURCE(5);		 // 资源服务器

    private final int type;

    ServerType(int type)
    {
        this.type = type;
    }

    public int getValue()
    {
        return type;
    }
}

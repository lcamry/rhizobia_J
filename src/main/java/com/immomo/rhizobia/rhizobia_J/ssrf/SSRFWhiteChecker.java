/**
 * MOMOSEC Security SDK(MSS)
 *
 * This file is part of the Open MSS Project
 *
 * Copyright (c) 2019 - V0ld1ron
 *
 * The MSS is published by V0ld1ron under the BSD license. You should read and accept the
 * LICENSE before you use, modify, and/or redistribute this software.
 *
 * @author V0ld1ron (projectone .at. immomo.com)
 * @created 2019
 */
package com.immomo.rhizobia.rhizobia_J.ssrf;

import com.immomo.rhizobia.rhizobia_J.base.WhiteChecker;

/**
 * @program: java安全编码实践
 *
 * @description: 避免ssrf问题的白名单校验工具
 *
 * @author: V0ld1ron
 *
 **/
public class SSRFWhiteChecker extends WhiteChecker {
    private static SSRFWhiteChecker instance = null;

    public SSRFWhiteChecker(){

    }

    public static SSRFWhiteChecker getInstance() {
        if (null == instance) {
            synchronized (SSRFWhiteChecker.class) {
                if (null == instance) {
                    instance = new SSRFWhiteChecker();
                }
            }
        }
        return instance;
    }

    /**
     * @Description: 校验url是否在白名单内
     * @Param: url 网络地址
     * @return: boolean true 在白名单内；false 不在白名单内
     */
    public boolean verifyURL(String url){
        return super.verifyURL(url);
    }
}

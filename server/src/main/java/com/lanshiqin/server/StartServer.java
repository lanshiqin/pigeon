package com.lanshiqin.server;

import com.lanshiqin.server.config.ServerConfig;

/**
 * 服务端启动引导服务
 * @author 蓝士钦
 */
public class StartServer {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        // 初始化配置
        ServerConfig config = new ServerConfig();
        config.setListenPort(9999);
        // 启动服务
        IMService service = new IMServer(config);
        service.start();
    }
}

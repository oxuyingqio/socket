package cn.xuyingqi.socket.tcp.server;

import java.io.IOException;

import cn.xuyingqi.socket.tcp.protocol.TestNioTCPProtocol;
import cn.xuyingqi.socket.tcp.server.impl.nio.NioTCPServer;

/**
 * 非阻塞式TCP服务测试
 * 
 * @author XuYQ
 *
 */
public class NioTCPServerTest {

	public static void main(String[] args) {

		// TCP服务器
		TCPServer tcpServer = new NioTCPServer(new TestNioTCPProtocol(1024));
		// 注册,激活服务
		try {
			tcpServer.init();
			tcpServer.activate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

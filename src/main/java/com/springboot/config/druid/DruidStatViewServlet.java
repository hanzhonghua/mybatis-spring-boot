package com.springboot.config.druid;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * Druid数据源状态监控
 * <p>Title: DruidStatViewServlet</p>
 * @author hanzhonghua
 * @2017年2月20日 下午10:52:11
 */
@WebServlet(urlPatterns = "/druid/*",
		initParams = {
				//IP白名单，没有配置或者为空，允许所有访问
				@WebInitParam(name = "allow", value = "192.168.56.11,127.0.0.1" ),
				//IP黑名单，共存是，deny优先于allow
				@WebInitParam(name = "deny", value = "192.168.56.12"),
				//
				@WebInitParam(name = "loginUsername", value = "root"),
				@WebInitParam(name = "loginPassword", value = "root"),
				//禁用HTML页面的Reset All功能
				@WebInitParam(name = "resetEnable", value = "false")
		})
public class DruidStatViewServlet extends StatViewServlet {

	private static final long serialVersionUID = 1L;

}

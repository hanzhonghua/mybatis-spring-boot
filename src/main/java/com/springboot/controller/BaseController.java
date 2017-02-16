package com.springboot.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.druid.support.json.JSONUtils;
import com.springboot.util.Contents;
import com.springboot.util.Contents.llmjMsg;

public class BaseController {
	@Resource
	protected HttpServletRequest request;

	public static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
	
	/**
	 * 返回Ajax响应字符串，将成功处理结果返回
	 */
	public void sendAjaxResponseOK(HttpServletResponse res, Object data) {
		JSONObject msg = new JSONObject();
		PrintWriter out = null;
		try {
			msg.put(Contents.CODE, llmjMsg.L_0000.getCode());
			msg.put(Contents.MSG, llmjMsg.L_0000.getMsg());
			msg.put(Contents.DATA, data);
			if (res != null) {
				res.setCharacterEncoding("UTF-8");
				res.setContentType("application/json;charset=utf-8");
				// res.setContentType("text/json");
				out = res.getWriter();
				String result = JSONUtils.toJSONString(msg);
				LOGGER.info(result);
				out.print(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}

	/**
	 * 返回Ajax响应字符串，失败处理结果
	 */
	public void sendAjaxResponseError(HttpServletResponse res, String code,
	        String msg) {
		JSONObject object = new JSONObject();
		PrintWriter out = null;
		try {
			object.put(Contents.CODE, code);
			object.put(Contents.MSG, msg);
			if (res != null) {
				res.setCharacterEncoding("UTF-8");
				res.setContentType("application/json;charset=utf-8");
				out = res.getWriter();
				LOGGER.info(JSONUtils.toJSONString(object));
				out.print(object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}

	/**
	 * 返回Ajax响应字符串，将处理结果返回
	 */
	public void sendAjaxResponse(HttpServletResponse res, String strMsg) {
		PrintWriter out = null;
		try {
			if (res != null) {
				res.setCharacterEncoding("UTF-8");
				res.setContentType("text/json");
				out = res.getWriter();
				out.print(strMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}
	
	
}

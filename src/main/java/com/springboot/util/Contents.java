package com.springboot.util;

public class Contents {

	public static final String CODE = "code";
	
	public static final String MSG = "msg";
	
	public static final String DATA = "data";
	
	public static final String OK_CODE = "ok";
	
	public static final String _91_PAY_Y = "Y";
	
	public static final String _91_PAY_N = "N";
	
	public static final String ENCRYPTION="encryption"; //sign编码串
	
	public static final String CERTIFICATES = "certificates";//认证证件照片访问前缀
	
	public static final int BANK_CARD_BIND_TYPE_KJ = 1;//快捷绑定银行卡
	
	public static final int BANK_CARD_BIND_TYPE_KJ_MAX = 10;//快捷绑定银行卡最大数量
	
	public static final int BANK_CARD_BIND_TYPE_TX = 2;//提现绑定银行卡
	
	public static final String PAY_SIGN = "ZJ";//ZJ or YC
	
	/**
	 * 未认证
	 */
	public static final String UN_AUTH = "0";
	/**
	 * 个人认证
	 */
	public static final String AUTH_PERSON = "1";
	
	/**
	 * 企业认证
	 */
	public static final String AUTH_ENTERPRISE = "2";
	
	/**
	 * 车找货订单编号前缀
	 */
	public static final String CAR_GOODS_ORDER_NO_PREFIX = "CG";
	/**
	 * 货找车订单编号前缀
	 */
	public static final String GOODS_CAR_ORDER_NO_PREFIX = "GC";
	/**
	 * 仓库找货订单编号前缀
	 */
	public static final String WAREHOUSE_GOODS_ORDER_NO_PREFIX = "WG";
	/**
	 * 货找仓库订单编号前缀
	 */
	public static final String GOODS_WAREHOUSE_ORDER_NO_PREFIX = "GW";
	
	/**
	 * 订单交易时充值订单号前缀（快捷支付专用）
	 */
	public static final String RECHARGE_ORDER_NO_KJ_PREFIX = "CZO";
	/**
	 * 订单交易时充值订单号前缀（网银支付专用）
	 */
	public static final String RECHARGE_ORDER_NO_EB_PREFIX = "CZE";
	/**
	 * 订单交易时充值订单号前缀
	 */
	public static final String RECHARGE_ORDER_NO_PREFIX = "CZP";
	/**
	 * 消费订单号前缀
	 */
	public static final String CONSUME_ORDER_NO_PREFIX = "XF";

	/**
	 * 登录状态缓存前缀
	 */
	public static final String USER_LOGIN_REDIS = "login_";
	/**
	 * 校验姓名和身份证前缀
	 */
	public static final String CHECK_IDCARD = "checkIdcard_";
	
	public static final String CAPTCHA_CODE_SESSION_KEY = "captchaCode";// 验证码session_key

	public static final String TASK_SYSTEM_SOURCE = "1";//调度系统标记

	public static final String MANAGE_SYSTEM_SOURCE = "2";//运营后台调度
	
	public enum llmjMsg
	{
		L_0000("0000", "操作成功"),
		L_0001("0001", "操作失败"),
		L_0002("0002", "参数错误"),
		L_0003("0003", "服务器请求异常"),
		L_0004("0004", "不能超过10个常用地址"),
		L_0005("0005", "绑定处理中"),
		L_0006("0006", "用户未登录"),
		L_0007("0007", "图片验证码为空"),
		L_0008("0008", "有大量未接订单,请先进行电话联系。"),
		L_0009("0009", "正在进行重复操作,请刷新页面后再操作!"),
		L_0010("0010", "未设置支付密码"),
		L_0011("0011", "认证次数过多,请明天再试!"),
		L_0012("0012", "姓名和身份证号不匹配!"),
		L_0013("0013", "新密码不能和原始密码一样!");
		
		private String code;
		private String msg;
		llmjMsg(String code, String msg)
		{
			this.code=code;
			this.msg=msg;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
	}
	
	/**
	 * 短信类型
	 * <P>File name : Contents.java </P>
	 * <P>Author : zhuzhou </P> 
	 * <P>Date : 2015-9-16 </P>
	 */
	public enum shortMsgType
	{
		MSG_TYPE_0001("1", "RG_"),
		MSG_TYPE_0002("2", "PWD_"),
		MSG_TYPE_0003("3", "ZFPWD_"),
		MSG_TYPE_0004("4", "BANKCARD_"),
		MSG_TYPE_0005("5", "ORDERPAY_");
		
		private String code;
		private String value;
		shortMsgType(String code, String value)
		{
			this.code=code;
			this.value=value;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
		
	}
	
	/**
	 * 模板编号
	 * <P>File name : Contents.java </P>
	 * <P>Author : zhuzhou </P> 
	 * <P>Date : 2015-9-16 </P>
	 */
	public enum smsNumber
	{
		SMS_NUMBER_0001("161477367108927", "用户手机注册"),
		SMS_NUMBER_0002("161477367587109", "注册成功"),
		SMS_NUMBER_0003("161477367655020", "认证成功"),
		SMS_NUMBER_0004("161477367691117", "认证失败"),
		SMS_NUMBER_0005("161477374559851", "货主抢路线"),
		SMS_NUMBER_0006("161477374853211", "承运方抢货源"),
		SMS_NUMBER_0007("161477374977584", "货主接受抢单"),
		SMS_NUMBER_0008("161477375051854", "承运方接受抢单"),
		SMS_NUMBER_0009("161477375177561", "货主付款成功。给承运方发短信"),
		SMS_NUMBER_0010("161477375243182", "待付款状态下，货主修改运费价格，提醒承运方去确认"),
		SMS_NUMBER_0011("161477375289764", "订单已完成状态下，司机点击确认送达，提醒货主去确认收货"),
		SMS_NUMBER_0012("161477375417696", "货主确认收货后，提醒车主账户余额的变动"),
		SMS_NUMBER_0013("161477376012632", "冻结会员账户"),
		SMS_NUMBER_0014("161477376104438", "解冻会员账户"),
		SMS_NUMBER_0015("161477376137794", "平台实地认证通过"),
		SMS_NUMBER_0016("161477376192397", "平台派遣“实地认证员”，通知用户该认证员信息"),
		SMS_NUMBER_0017("161477376250260", "平台实地认证被驳回"),
		SMS_NUMBER_0018("161477376279369", "个人主页认证通过"),
		SMS_NUMBER_0019("161477376313971", "个人主页认证驳回"),
		SMS_NUMBER_0020("161458287553696", "订单确认后给对方发送短信"),
		SMS_NUMBER_0021("161478161949988", "用户取消订单"),
		SMS_NUMBER_0022("161479714662804", "找回支付密码"),
		SMS_NUMBER_0023("161479718717391", "找回登录密码"),
		SMS_NUMBER_0024("161481017340210", "货主确认收货后，提醒库主账户余额的变动");
		private String code;
		private String value;
		smsNumber(String code, String value)
		{
			this.code=code;
			this.value=value;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	//认证图片类型
	public enum imgType
	{
		IMG_TYPE_1("1", "身份证"),
		IMG_TYPE_2("2", "行驶证"),
		IMG_TYPE_3("3", "营运证"),
		IMG_TYPE_4("4", "营业执照/名片"),
		IMG_TYPE_5("5", "道路运输许可证"),
		IMG_TYPE_6("6", "门头照片"),
		IMG_TYPE_7("7", "平台认证图片"),
		IMG_TYPE_8("8", "个体经营许可证");
		
		private String key;
		private String value;
		imgType(String key, String value)
		{
			this.key=key;
			this.value=value;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
		//仓库类型：1 仓库增值服务：2 仓库面积：3 价格 ：4
		public enum WarehouseProperty
		{
			TYPE_1("1", "仓库类型"),
			TYPE_2("2", "配套服务"),
			TYPE_3("3", "仓库面积"),
			TYPE_4("4", "价格"),
			TYPE_5("5", "可用库容"),
			
			TYPE_1_ATTRIBUTE_1("1", "平堆库"),
			TYPE_1_ATTRIBUTE_2("2", "货架库"),
			TYPE_1_ATTRIBUTE_3("3", "自动化库"),
			TYPE_1_ATTRIBUTE_4("4", "保税库"),
			
			TYPE_2_ATTRIBUTE_1("1", "提供拖车"),
			TYPE_2_ATTRIBUTE_2("2", "提供装卸"),
			
			TYPE_3_ATTRIBUTE_1("1", "常温"),
			TYPE_3_ATTRIBUTE_2("2", "冷藏"),
			TYPE_3_ATTRIBUTE_3("3", "冷冻"),
			TYPE_3_ATTRIBUTE_4("4", "急冻"),
			TYPE_3_ATTRIBUTE_5("5", "深冷"),
			
			TYPE_4_ATTRIBUTE_1("1", "/元/天/平"),
			TYPE_4_ATTRIBUTE_2("2", "/元/天/托"),
			TYPE_4_ATTRIBUTE_3("3", "/元/天/吨"),
			TYPE_4_ATTRIBUTE_4("4", "/元/天/方");
			
			private String key;
			private String value;
			WarehouseProperty(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		//订单状态 1:洽谈中 2:待付款 3:已付款 4:待评价 5:已取消
		public enum OrderState
		{
			ORDER_STATE_1("1", "洽谈中 "),
			ORDER_STATE_2("2", "待付款/待上传回单图片"),
			ORDER_STATE_3("3", "已付款/待收货/待确认"),
			ORDER_STATE_4("4", "已完成"),
			ORDER_STATE_5("5", "已取消");
			
			private String key;
			private String value;
			OrderState(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		
		public enum TransferState
		{
			State_TYPE_0("0", "发起申请提现"),
			State_TYPE_1("1", "提现成功"),
			State_TYPE_2("2", "提现中"),
			State_TYPE_3("3", "提现失败");
			
			private String key;
			private String value;
			TransferState(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		
		//车的状态：车辆状态1：空闲中，2：求货中，3：运输中
		public enum CarStatus
		{
			State_TYPE_1("1", "空闲中"),
			State_TYPE_2("2", "求货中"),
			State_TYPE_3("3", "运输中");
			
			private String key;
			private String value;
			CarStatus(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		
		public enum CarResourceStatus
		{
			State_TYPE_1("1", "求货中"),
			State_TYPE_2("2", "运输中");
			
			private String key;
			private String value;
			CarResourceStatus(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		
		//货源状态：1：求车（库）中:2：有人响应:3：已成交
		public enum GoodsStatus
		{
			State_TYPE_1("1", "求车(库)中"),
			State_TYPE_2("2", "有人响应"),
			State_TYPE_3("3", "已成交");
			
			private String key;
			private String value;
			GoodsStatus(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		
		public enum llmjCMStype
		{
			LLMJCMSTYPE_1("1", "货路线源"),
			LLMJCMSTYPE_2("2", "货库源"),
			LLMJCMSTYPE_3("3", "车源"),
			LLMJCMSTYPE_4("4", "库源"),
			LLMJCMSTYPE_5("5", "路线");
			
			private String key;
			private String value;
			llmjCMStype(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		
		public enum llmjUserBankStatus
		{
			llmjUserBankStatus_1("1", "绑定成功"),
			llmjUserBankStatus_2("2", "绑定处理中"),
			llmjUserBankStatus_3("3", "绑定失败");
			
			private String key;
			private String value;
			llmjUserBankStatus(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		//用户角色认证状态
		public enum roleStatus
		{
			ROLE_STATUS_1("0", "未认证"),
			ROLE_STATUS_2("1", "认证中"),
			ROLE_STATUS_3("2", "已通过"),
			ROLE_STATUS_4("3", "未通过");
			
			private String key;
			private String value;
			roleStatus(String key, String value)
			{
				this.key=key;
				this.value=value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		
		//用户角色认证类型
		public enum roleType
		{
			ROLE_TYPE_1("1", "物流公司"),
			ROLE_TYPE_2("2", "信息部"),
			ROLE_TYPE_3("3", "个体司机"),
			ROLE_TYPE_4("4", "个体货主"),
			ROLE_TYPE_5("5", "公司货主"),
			ROLE_TYPE_6("6", "公司库主");
			
			private String key;
			private String value;
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
			private roleType(String key, String value) {
				this.key = key;
				this.value = value;
			}
		}
		public enum PlatformStstus{
			PLATFORM_STATUS_1("0", "未认证"),
			PLATFORM_STATUS_2("1", "认证中"),
			PLATFORM_STATUS_3("2", "已认证"),
			PLATFORM_STATUS_4("3", "认证未通过");
			private String key;
			private String value;
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
			private PlatformStstus(String key, String value) {
				this.key = key;
				this.value = value;
			}
		}
}
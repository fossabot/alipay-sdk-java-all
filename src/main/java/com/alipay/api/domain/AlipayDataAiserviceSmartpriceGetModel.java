package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * hellobike月卡智能定价
 *
 * @author auto create
 * @since 1.0, 2019-04-18 21:00:35
 */
public class AlipayDataAiserviceSmartpriceGetModel extends AlipayObject {

	private static final long serialVersionUID = 5866651612572716937L;

	/**
	 * 兼容V1.0。月卡售卖原价，单位为分，该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("base_price_cent")
	private Long basePriceCent;

	/**
	 * 用户购买hellobike月卡的渠道，目前有两种：alipay_tinyapp:小程序, hellobike_app:hellobike客户端，该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码，国标码，hellobike定位到的用户当前所在城市，该参数由hellobike调用方定位用户当前所在城市得到。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 价格限定条件，用于不同优惠卡之间的价格不等式约束
	 */
	@ApiListField("conditions")
	@ApiField("hello_bike_price_condition")
	private List<HelloBikePriceCondition> conditions;

	/**
	 * 请求约束条件，用于约束优惠卡的出价区间等信息
	 */
	@ApiListField("constraints")
	@ApiField("hello_bike_price_constraint")
	private List<HelloBikePriceConstraint> constraints;

	/**
	 * 兼容V1.0。用户参与月卡打折活动时，默认的折扣价格，单位为分，该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("default_promo_price_cent")
	private Long defaultPromoPriceCent;

	/**
	 * 活动页面来源，即用户跳转到活动页面的前一个页面。CARD:月卡购买页面跳转，OTHER：其他场景页面跳转，该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("from")
	private String from;

	/**
	 * 兼容V1.0。月卡售价区间范围的上限，单位为分，该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("high_price_cent")
	private Long highPriceCent;

	/**
	 * 兼容V1.0。月卡售价区间范围的下限，单位为分，该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("lower_price_cent")
	private Long lowerPriceCent;

	/**
	 * 场景码，目前用于区分「单车」和「电单车」两种场景，其中，单车对应 bike， 电单车对应 ebike。不传该字段，默认为单车。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户参与一次月卡打折活动的业务标识，需要唯一。通过该业务标识串联用户在一次月卡打折活动中的涉及的关键业务流程（调用alipay.data.aiservice.smartprice.get接口获取用户购买月卡的活动价格、领取折扣券、购买月卡3个业务流程），该参数由hellobike业务端生成该id并在上述3个业务流程推进过程中存储记录该id。
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 蚂蚁统一会员ID，作为用户标识，该参数可通过alipay.user.info.share接口获取。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getBasePriceCent() {
		return this.basePriceCent;
	}
	public void setBasePriceCent(Long basePriceCent) {
		this.basePriceCent = basePriceCent;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<HelloBikePriceCondition> getConditions() {
		return this.conditions;
	}
	public void setConditions(List<HelloBikePriceCondition> conditions) {
		this.conditions = conditions;
	}

	public List<HelloBikePriceConstraint> getConstraints() {
		return this.constraints;
	}
	public void setConstraints(List<HelloBikePriceConstraint> constraints) {
		this.constraints = constraints;
	}

	public Long getDefaultPromoPriceCent() {
		return this.defaultPromoPriceCent;
	}
	public void setDefaultPromoPriceCent(Long defaultPromoPriceCent) {
		this.defaultPromoPriceCent = defaultPromoPriceCent;
	}

	public String getFrom() {
		return this.from;
	}
	public void setFrom(String from) {
		this.from = from;
	}

	public Long getHighPriceCent() {
		return this.highPriceCent;
	}
	public void setHighPriceCent(Long highPriceCent) {
		this.highPriceCent = highPriceCent;
	}

	public Long getLowerPriceCent() {
		return this.lowerPriceCent;
	}
	public void setLowerPriceCent(Long lowerPriceCent) {
		this.lowerPriceCent = lowerPriceCent;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-05 19:18:54
 */
public class KoubeiCateringDishGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5116429256166684918L;

	/** 
	 * 项目列表
	 */
	@ApiListField("kb_dish_group_list")
	@ApiField("kbdish_group_info")
	private List<KbdishGroupInfo> kbDishGroupList;

	public void setKbDishGroupList(List<KbdishGroupInfo> kbDishGroupList) {
		this.kbDishGroupList = kbDishGroupList;
	}
	public List<KbdishGroupInfo> getKbDishGroupList( ) {
		return this.kbDishGroupList;
	}

}

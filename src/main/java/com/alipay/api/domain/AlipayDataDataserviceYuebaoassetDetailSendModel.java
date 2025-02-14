package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 余额宝资产端数据录入
 *
 * @author auto create
 * @since 1.0, 2018-08-24 10:54:36
 */
public class AlipayDataDataserviceYuebaoassetDetailSendModel extends AlipayObject {

	private static final long serialVersionUID = 2384716738448797295L;

	/**
	 * 资产负债报表数据列表
	 */
	@ApiListField("alm_report_data")
	@ApiField("alm_report_data")
	private List<AlmReportData> almReportData;

	public List<AlmReportData> getAlmReportData() {
		return this.almReportData;
	}
	public void setAlmReportData(List<AlmReportData> almReportData) {
		this.almReportData = almReportData;
	}

}

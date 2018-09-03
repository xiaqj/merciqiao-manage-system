package com.carloan.apimodel.order;

import lombok.Getter;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 *@Description:car_loan_survey_info
 *@author root
 *@version 1.0,
 *@date 2018-07-27 13:52:04
 */
@Getter
@Setter
public class CarLoanSurveyInfoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	@ApiModelProperty(value="主键id")
	private Long id;

	/**订单编号*/
	@ApiModelProperty(value="订单编号")
	private String orderNumber;

	/**电核列表联系人ID*/
	@ApiModelProperty(value="电核列表联系人ID")
	private String surveyContactsId;

	/**电核备注*/
	@ApiModelProperty(value="电核备注")
	private String otherRemark;

	/**CREATE_TIME*/
	@ApiModelProperty(value="CREATE_TIME")
	private java.util.Date createTime;

	/**UPDATE_TIME*/
	@ApiModelProperty(value="UPDATE_TIME")
	private java.util.Date updateTime;

}
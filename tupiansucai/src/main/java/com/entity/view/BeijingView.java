package com.entity.view;

import com.entity.BeijingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 高清背景
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("beijing")
public class BeijingView extends BeijingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 高清背景分类的值
		*/
		private String beijingValue;
		/**
		* 高清背景格式的值
		*/
		private String beijingGeshiValue;
		/**
		* 板式的值
		*/
		private String beijingBanshiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户照片
			*/
			private String yonghuPhoto;
			/**
			* 是否是会员
			*/
			private Integer huiyuanTypes;
				/**
				* 是否是会员的值
				*/
				private String huiyuanValue;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public BeijingView() {

	}

	public BeijingView(BeijingEntity beijingEntity) {
		try {
			BeanUtils.copyProperties(this, beijingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 高清背景分类的值
			*/
			public String getBeijingValue() {
				return beijingValue;
			}
			/**
			* 设置： 高清背景分类的值
			*/
			public void setBeijingValue(String beijingValue) {
				this.beijingValue = beijingValue;
			}
			/**
			* 获取： 高清背景格式的值
			*/
			public String getBeijingGeshiValue() {
				return beijingGeshiValue;
			}
			/**
			* 设置： 高清背景格式的值
			*/
			public void setBeijingGeshiValue(String beijingGeshiValue) {
				this.beijingGeshiValue = beijingGeshiValue;
			}
			/**
			* 获取： 板式的值
			*/
			public String getBeijingBanshiValue() {
				return beijingBanshiValue;
			}
			/**
			* 设置： 板式的值
			*/
			public void setBeijingBanshiValue(String beijingBanshiValue) {
				this.beijingBanshiValue = beijingBanshiValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 是否是会员
					*/
					public Integer getHuiyuanTypes() {
						return huiyuanTypes;
					}
					/**
					* 设置： 是否是会员
					*/
					public void setHuiyuanTypes(Integer huiyuanTypes) {
						this.huiyuanTypes = huiyuanTypes;
					}


						/**
						* 获取： 是否是会员的值
						*/
						public String getHuiyuanValue() {
							return huiyuanValue;
						}
						/**
						* 设置： 是否是会员的值
						*/
						public void setHuiyuanValue(String huiyuanValue) {
							this.huiyuanValue = huiyuanValue;
						}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}








}

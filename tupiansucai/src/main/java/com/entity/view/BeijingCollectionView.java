package com.entity.view;

import com.entity.BeijingCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 高清背景收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("beijing_collection")
public class BeijingCollectionView extends BeijingCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 beijing
			/**
			* 用户
			*/
			private Integer yonghuId;
			/**
			* 高清背景名称
			*/
			private String beijingName;
			/**
			* 高清背景照片
			*/
			private String beijingPhoto;
			/**
			* 高清背景分类
			*/
			private Integer beijingTypes;
				/**
				* 高清背景分类的值
				*/
				private String beijingValue;
			/**
			* 高清背景格式
			*/
			private Integer beijingGeshiTypes;
				/**
				* 高清背景格式的值
				*/
				private String beijingGeshiValue;
			/**
			* 板式
			*/
			private Integer beijingBanshiTypes;
				/**
				* 板式的值
				*/
				private String beijingBanshiValue;
			/**
			* 压缩包
			*/
			private String beijingFile;
			/**
			* 高清背景介绍
			*/
			private String beijingContent;

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

	public BeijingCollectionView() {

	}

	public BeijingCollectionView(BeijingCollectionEntity beijingCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, beijingCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set beijing
					/**
					* 获取： 用户
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 用户
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 高清背景名称
					*/
					public String getBeijingName() {
						return beijingName;
					}
					/**
					* 设置： 高清背景名称
					*/
					public void setBeijingName(String beijingName) {
						this.beijingName = beijingName;
					}
					/**
					* 获取： 高清背景照片
					*/
					public String getBeijingPhoto() {
						return beijingPhoto;
					}
					/**
					* 设置： 高清背景照片
					*/
					public void setBeijingPhoto(String beijingPhoto) {
						this.beijingPhoto = beijingPhoto;
					}
					/**
					* 获取： 高清背景分类
					*/
					public Integer getBeijingTypes() {
						return beijingTypes;
					}
					/**
					* 设置： 高清背景分类
					*/
					public void setBeijingTypes(Integer beijingTypes) {
						this.beijingTypes = beijingTypes;
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
					* 获取： 高清背景格式
					*/
					public Integer getBeijingGeshiTypes() {
						return beijingGeshiTypes;
					}
					/**
					* 设置： 高清背景格式
					*/
					public void setBeijingGeshiTypes(Integer beijingGeshiTypes) {
						this.beijingGeshiTypes = beijingGeshiTypes;
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
					* 获取： 板式
					*/
					public Integer getBeijingBanshiTypes() {
						return beijingBanshiTypes;
					}
					/**
					* 设置： 板式
					*/
					public void setBeijingBanshiTypes(Integer beijingBanshiTypes) {
						this.beijingBanshiTypes = beijingBanshiTypes;
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
					* 获取： 压缩包
					*/
					public String getBeijingFile() {
						return beijingFile;
					}
					/**
					* 设置： 压缩包
					*/
					public void setBeijingFile(String beijingFile) {
						this.beijingFile = beijingFile;
					}
					/**
					* 获取： 高清背景介绍
					*/
					public String getBeijingContent() {
						return beijingContent;
					}
					/**
					* 设置： 高清背景介绍
					*/
					public void setBeijingContent(String beijingContent) {
						this.beijingContent = beijingContent;
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

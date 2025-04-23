package com.entity.view;

import com.entity.YuansuXiazaijiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 免扣元素下载记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yuansu_xiazaijilu")
public class YuansuXiazaijiluView extends YuansuXiazaijiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;




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

		//级联表 yuansu
			/**
			* 用户
			*/
			private Integer yonghuId;
			/**
			* 免扣元素名称
			*/
			private String yuansuName;
			/**
			* 免扣元素照片
			*/
			private String yuansuPhoto;
			/**
			* 元素分类
			*/
			private Integer yuansuTypes;
				/**
				* 元素分类的值
				*/
				private String yuansuValue;
			/**
			* 元素格式
			*/
			private Integer yuansuGeshiTypes;
				/**
				* 元素格式的值
				*/
				private String yuansuGeshiValue;
			/**
			* 压缩包
			*/
			private String yuansuFile;
			/**
			* 免扣元素介绍
			*/
			private String yuansuContent;

	public YuansuXiazaijiluView() {

	}

	public YuansuXiazaijiluView(YuansuXiazaijiluEntity yuansuXiazaijiluEntity) {
		try {
			BeanUtils.copyProperties(this, yuansuXiazaijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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


				//级联表的get和set yuansu
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
					* 获取： 免扣元素名称
					*/
					public String getYuansuName() {
						return yuansuName;
					}
					/**
					* 设置： 免扣元素名称
					*/
					public void setYuansuName(String yuansuName) {
						this.yuansuName = yuansuName;
					}
					/**
					* 获取： 免扣元素照片
					*/
					public String getYuansuPhoto() {
						return yuansuPhoto;
					}
					/**
					* 设置： 免扣元素照片
					*/
					public void setYuansuPhoto(String yuansuPhoto) {
						this.yuansuPhoto = yuansuPhoto;
					}
					/**
					* 获取： 元素分类
					*/
					public Integer getYuansuTypes() {
						return yuansuTypes;
					}
					/**
					* 设置： 元素分类
					*/
					public void setYuansuTypes(Integer yuansuTypes) {
						this.yuansuTypes = yuansuTypes;
					}


						/**
						* 获取： 元素分类的值
						*/
						public String getYuansuValue() {
							return yuansuValue;
						}
						/**
						* 设置： 元素分类的值
						*/
						public void setYuansuValue(String yuansuValue) {
							this.yuansuValue = yuansuValue;
						}
					/**
					* 获取： 元素格式
					*/
					public Integer getYuansuGeshiTypes() {
						return yuansuGeshiTypes;
					}
					/**
					* 设置： 元素格式
					*/
					public void setYuansuGeshiTypes(Integer yuansuGeshiTypes) {
						this.yuansuGeshiTypes = yuansuGeshiTypes;
					}


						/**
						* 获取： 元素格式的值
						*/
						public String getYuansuGeshiValue() {
							return yuansuGeshiValue;
						}
						/**
						* 设置： 元素格式的值
						*/
						public void setYuansuGeshiValue(String yuansuGeshiValue) {
							this.yuansuGeshiValue = yuansuGeshiValue;
						}
					/**
					* 获取： 压缩包
					*/
					public String getYuansuFile() {
						return yuansuFile;
					}
					/**
					* 设置： 压缩包
					*/
					public void setYuansuFile(String yuansuFile) {
						this.yuansuFile = yuansuFile;
					}
					/**
					* 获取： 免扣元素介绍
					*/
					public String getYuansuContent() {
						return yuansuContent;
					}
					/**
					* 设置： 免扣元素介绍
					*/
					public void setYuansuContent(String yuansuContent) {
						this.yuansuContent = yuansuContent;
					}










}

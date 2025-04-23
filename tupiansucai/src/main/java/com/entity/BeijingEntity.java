package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 高清背景
 *
 * @author 
 * @email
 */
@TableName("beijing")
public class BeijingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BeijingEntity() {

	}

	public BeijingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 高清背景名称
     */
    @TableField(value = "beijing_name")

    private String beijingName;


    /**
     * 高清背景照片
     */
    @TableField(value = "beijing_photo")

    private String beijingPhoto;


    /**
     * 高清背景分类
     */
    @TableField(value = "beijing_types")

    private Integer beijingTypes;


    /**
     * 高清背景格式
     */
    @TableField(value = "beijing_geshi_types")

    private Integer beijingGeshiTypes;


    /**
     * 板式
     */
    @TableField(value = "beijing_banshi_types")

    private Integer beijingBanshiTypes;


    /**
     * 压缩包
     */
    @TableField(value = "beijing_file")

    private String beijingFile;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "beijing_delete")

    private Integer beijingDelete;


    /**
     * 高清背景介绍
     */
    @TableField(value = "beijing_content")

    private String beijingContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：高清背景名称
	 */
    public String getBeijingName() {
        return beijingName;
    }


    /**
	 * 获取：高清背景名称
	 */

    public void setBeijingName(String beijingName) {
        this.beijingName = beijingName;
    }
    /**
	 * 设置：高清背景照片
	 */
    public String getBeijingPhoto() {
        return beijingPhoto;
    }


    /**
	 * 获取：高清背景照片
	 */

    public void setBeijingPhoto(String beijingPhoto) {
        this.beijingPhoto = beijingPhoto;
    }
    /**
	 * 设置：高清背景分类
	 */
    public Integer getBeijingTypes() {
        return beijingTypes;
    }


    /**
	 * 获取：高清背景分类
	 */

    public void setBeijingTypes(Integer beijingTypes) {
        this.beijingTypes = beijingTypes;
    }
    /**
	 * 设置：高清背景格式
	 */
    public Integer getBeijingGeshiTypes() {
        return beijingGeshiTypes;
    }


    /**
	 * 获取：高清背景格式
	 */

    public void setBeijingGeshiTypes(Integer beijingGeshiTypes) {
        this.beijingGeshiTypes = beijingGeshiTypes;
    }
    /**
	 * 设置：板式
	 */
    public Integer getBeijingBanshiTypes() {
        return beijingBanshiTypes;
    }


    /**
	 * 获取：板式
	 */

    public void setBeijingBanshiTypes(Integer beijingBanshiTypes) {
        this.beijingBanshiTypes = beijingBanshiTypes;
    }
    /**
	 * 设置：压缩包
	 */
    public String getBeijingFile() {
        return beijingFile;
    }


    /**
	 * 获取：压缩包
	 */

    public void setBeijingFile(String beijingFile) {
        this.beijingFile = beijingFile;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getBeijingDelete() {
        return beijingDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setBeijingDelete(Integer beijingDelete) {
        this.beijingDelete = beijingDelete;
    }
    /**
	 * 设置：高清背景介绍
	 */
    public String getBeijingContent() {
        return beijingContent;
    }


    /**
	 * 获取：高清背景介绍
	 */

    public void setBeijingContent(String beijingContent) {
        this.beijingContent = beijingContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Beijing{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", beijingName=" + beijingName +
            ", beijingPhoto=" + beijingPhoto +
            ", beijingTypes=" + beijingTypes +
            ", beijingGeshiTypes=" + beijingGeshiTypes +
            ", beijingBanshiTypes=" + beijingBanshiTypes +
            ", beijingFile=" + beijingFile +
            ", shangxiaTypes=" + shangxiaTypes +
            ", beijingDelete=" + beijingDelete +
            ", beijingContent=" + beijingContent +
            ", createTime=" + createTime +
        "}";
    }
}

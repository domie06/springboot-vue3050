package com.entity.model;

import com.entity.YuansuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 免扣元素
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuansuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 元素格式
     */
    private Integer yuansuGeshiTypes;


    /**
     * 压缩包
     */
    private String yuansuFile;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer yuansuDelete;


    /**
     * 免扣元素介绍
     */
    private String yuansuContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：免扣元素名称
	 */
    public String getYuansuName() {
        return yuansuName;
    }


    /**
	 * 设置：免扣元素名称
	 */
    public void setYuansuName(String yuansuName) {
        this.yuansuName = yuansuName;
    }
    /**
	 * 获取：免扣元素照片
	 */
    public String getYuansuPhoto() {
        return yuansuPhoto;
    }


    /**
	 * 设置：免扣元素照片
	 */
    public void setYuansuPhoto(String yuansuPhoto) {
        this.yuansuPhoto = yuansuPhoto;
    }
    /**
	 * 获取：元素分类
	 */
    public Integer getYuansuTypes() {
        return yuansuTypes;
    }


    /**
	 * 设置：元素分类
	 */
    public void setYuansuTypes(Integer yuansuTypes) {
        this.yuansuTypes = yuansuTypes;
    }
    /**
	 * 获取：元素格式
	 */
    public Integer getYuansuGeshiTypes() {
        return yuansuGeshiTypes;
    }


    /**
	 * 设置：元素格式
	 */
    public void setYuansuGeshiTypes(Integer yuansuGeshiTypes) {
        this.yuansuGeshiTypes = yuansuGeshiTypes;
    }
    /**
	 * 获取：压缩包
	 */
    public String getYuansuFile() {
        return yuansuFile;
    }


    /**
	 * 设置：压缩包
	 */
    public void setYuansuFile(String yuansuFile) {
        this.yuansuFile = yuansuFile;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getYuansuDelete() {
        return yuansuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYuansuDelete(Integer yuansuDelete) {
        this.yuansuDelete = yuansuDelete;
    }
    /**
	 * 获取：免扣元素介绍
	 */
    public String getYuansuContent() {
        return yuansuContent;
    }


    /**
	 * 设置：免扣元素介绍
	 */
    public void setYuansuContent(String yuansuContent) {
        this.yuansuContent = yuansuContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

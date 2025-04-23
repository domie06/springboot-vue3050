package com.entity.vo;

import com.entity.YuansuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 免扣元素
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuansu")
public class YuansuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 免扣元素名称
     */

    @TableField(value = "yuansu_name")
    private String yuansuName;


    /**
     * 免扣元素照片
     */

    @TableField(value = "yuansu_photo")
    private String yuansuPhoto;


    /**
     * 元素分类
     */

    @TableField(value = "yuansu_types")
    private Integer yuansuTypes;


    /**
     * 元素格式
     */

    @TableField(value = "yuansu_geshi_types")
    private Integer yuansuGeshiTypes;


    /**
     * 压缩包
     */

    @TableField(value = "yuansu_file")
    private String yuansuFile;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "yuansu_delete")
    private Integer yuansuDelete;


    /**
     * 免扣元素介绍
     */

    @TableField(value = "yuansu_content")
    private String yuansuContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：免扣元素名称
	 */
    public String getYuansuName() {
        return yuansuName;
    }


    /**
	 * 获取：免扣元素名称
	 */

    public void setYuansuName(String yuansuName) {
        this.yuansuName = yuansuName;
    }
    /**
	 * 设置：免扣元素照片
	 */
    public String getYuansuPhoto() {
        return yuansuPhoto;
    }


    /**
	 * 获取：免扣元素照片
	 */

    public void setYuansuPhoto(String yuansuPhoto) {
        this.yuansuPhoto = yuansuPhoto;
    }
    /**
	 * 设置：元素分类
	 */
    public Integer getYuansuTypes() {
        return yuansuTypes;
    }


    /**
	 * 获取：元素分类
	 */

    public void setYuansuTypes(Integer yuansuTypes) {
        this.yuansuTypes = yuansuTypes;
    }
    /**
	 * 设置：元素格式
	 */
    public Integer getYuansuGeshiTypes() {
        return yuansuGeshiTypes;
    }


    /**
	 * 获取：元素格式
	 */

    public void setYuansuGeshiTypes(Integer yuansuGeshiTypes) {
        this.yuansuGeshiTypes = yuansuGeshiTypes;
    }
    /**
	 * 设置：压缩包
	 */
    public String getYuansuFile() {
        return yuansuFile;
    }


    /**
	 * 获取：压缩包
	 */

    public void setYuansuFile(String yuansuFile) {
        this.yuansuFile = yuansuFile;
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
    public Integer getYuansuDelete() {
        return yuansuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setYuansuDelete(Integer yuansuDelete) {
        this.yuansuDelete = yuansuDelete;
    }
    /**
	 * 设置：免扣元素介绍
	 */
    public String getYuansuContent() {
        return yuansuContent;
    }


    /**
	 * 获取：免扣元素介绍
	 */

    public void setYuansuContent(String yuansuContent) {
        this.yuansuContent = yuansuContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

package com.isprint.jslx.dateutils;

import java.io.File;

/**
* @ClassName: Constants 
* @Description: (静态常量) 
* @author ydw
* @date 2017年4月6日 上午9:33:07 
*
*/
public class Constants {
	

	// 日期时间格式
	public static final String DEFAULT_YEAR_DATETIME_FORMAT = "yyyy";
	public static final String DEFAULT_MONTH_DATETIME_FORMAT = "MM";
	public static final String DEFAULT_FULL_DATETIME_FORMAT = "yyyy-MM-dd";
	public static final String DEFAULT_FULL_DATETIME_FORMAT1 = "yyyy-MM";
	public static final String DEFAULT_SIMPLE_DATE_FORMAT = "yyyy-MM-dd HH24:mi:ss";
	public static final String DEFAULT_SIMPLE_DATE_FORMATJAVA = "yyyy-MM-dd HH:mm:ss";
	public static final String DEFAULT_ERROR_DATETIME = "0000-00-00";

	//系统状态变量
	/**
	 * 可用
	 */
	public static final String ENABLED = "0";
	/**
	 * 不可用
	 */
	public static final String UNENABLED = "1";
	/**
	 * 新增
	 */
	public static final String CREATE = "0";
	/**
	 * 修改
	 */
	public static final String UPDATE = "1";
	/**
	 * 删除
	 */
	public static final String DELETE = "2";


	//编码
	public static final String SYS_ENCODE = "utf-8"; 
	//ajax编码
	public static final String SYS_CONTECTTYPE_JSON = "text/json;charset=UTF-8";
	public static final String SYS_CONTECTTYPE_HTML = "text/html;charset=UTF-8";
		
	public static final String SYS_LINE = File.separator;
	//SVG文件存放路径
	public static final String FILE_SAVE_PATH_SVG = "upload"+SYS_LINE+"svg"+SYS_LINE+"save";
	//SVG临时文件存放路径
    public static final String FILE_TEM_PATH_SVG = "upload"+SYS_LINE+"svg"+SYS_LINE+"tem";
    //图片文件存放路径
	public static final String FILE_SAVE_PATH_PIC="upload"+SYS_LINE+"pic"+SYS_LINE+"save";
	//图片临时文件存放路径
	public static final String FILE_TEM_PATH_PIC="upload"+SYS_LINE+"pic"+ SYS_LINE+"tem";
	//word文件存放路径
	public static final String FILE_SAVE_PATH_DOC="upload"+SYS_LINE+"doc"+SYS_LINE+"save";
	//word临时文件存放路径
	public static final String FILE_TEM_PATH_DOC="upload"+SYS_LINE+"doc"+SYS_LINE+"tem";
	//其他文件的存放目录
	public static final String FILE_SAVE_PATH_FILE="upload"+SYS_LINE+"file"+SYS_LINE+"save";
	//意见反馈图片存放目录
	public static final String FILE_FEED_BACK_PATH_FILE="upload"+SYS_LINE+"feedback";
	

	public static final String TITLE_BUILD="组卷";


}
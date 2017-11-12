package com.isprint.jslx.lccfd.utils;

/**
 * Created by ydw on 2017/7/27.
 */
public class Regex {
    //KBD
//    public static final String KBD = "<kbd>(\\[\\s\\S]*?)</kbd>";
    public static final String KBD = "<kbd></kbd>";


    public static final String KBD2HTML = "<div class='underline'></>";

    //img
    public static final String IMG = "\\[img=(\\d+),(\\d+)\\](.*?)\\[/img\\]";

    //img_haed
    public static final String IMG_FIRST = "\\[img=(\\d+),(\\d+)\\]";

    //img_end
    public static final String IMG_SECOND = "\\[/img\\]";


    //</br>
    public static final String NEXT_LINE = "/r";

    //公式一
    public static final String FOMULAR_FIRST = "`(.*?)`";

    //公式二
    public static final String FOMULAR_SECOND = "\\$(.*?)\\sqrt(.*?)\\$|\\$(.*?)\\frac(.*?)\\$";
    //公式三
    public static final String FOMULAR_THIRD = "$(.*?)$";
    //中文的标点符号
    public static final String CHART="，";
    //换标签
    public static final String BR="<br />";
}

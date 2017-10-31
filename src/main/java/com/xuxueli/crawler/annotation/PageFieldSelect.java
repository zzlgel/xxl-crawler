package com.xuxueli.crawler.annotation;

import com.xuxueli.crawler.conf.XxlCrawlerConf;

import java.lang.annotation.*;

/**
 * page vo field annotation
 *
 * 页面数据对象的属性信息 （支持基础数据类型 T ，包括 List<T>）
 *
 * @author xuxueli 2017-10-17 20:28:11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface PageFieldSelect {

    /**
     * CSS-like query, like "#title"
     *
     * CSS选择器, 如 "#title"
     *
     * @return
     */
    public String cssQuery() default "";

    /**
     * jquery data-extraction-type，like ".html()/.text()/.val()/.attr()"
     *
     * jquery 数据抽取方式，如 ".html()/.text()/.val()/.attr()"等
     *
     * @see com.xuxueli.crawler.conf.XxlCrawlerConf.SelectType
     *
     * @return
     */
    public XxlCrawlerConf.SelectType selectType() default XxlCrawlerConf.SelectType.TEXT;

    /**
     * jquery data-extraction-param, valid when SelectType=ATTR, like "abs:src / .attr("attributeKey")"
     *
     * jquery 数据抽取参数，SelectType=ATTR 时有效，如 "abs:src / .attr("attributeKey")"
     *
     * @return
     */
    public String attributeKey() default "";

    /**
     * data patttern, valid when date data
     *
     * 时间格式化，日期类型数据有效
     *
     * @return
     */
    String datePattern() default "yyyy-MM-dd HH:mm:ss";

}

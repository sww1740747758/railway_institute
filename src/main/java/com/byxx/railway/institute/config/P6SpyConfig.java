package com.byxx.railway.institute.config;


import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import lombok.extern.slf4j.Slf4j;


/**
 * @author Sangww
 */
@Slf4j
public class P6SpyConfig implements MessageFormattingStrategy {

    /**
     * <p>输出执行sql信息</p >
     *
     * @param connectionId
     * @param now          执行时间
     * @param elapsed      耗时多少毫秒
     * @param category
     * @param prepared     准备执行的sql脚本
     * @param sql          执行的sql脚本
     * @param url          数据源连接地址
     */
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        if (log.isInfoEnabled()) {
            log.info("执行时间： {}", now);
            log.info("完整sql：\n {}", sql.replaceAll("[\\s]", " "));
            log.info("耗时：{} 毫秒", elapsed);
        }
        return "";
    }
}
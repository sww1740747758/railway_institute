package com.byxx.railway.institute.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.stereotype.Component;

/**
 * Integer 数组类型转换 json
 * <a href="https://www.jianshu.com/p/ab832f3fe81c">https://www.jianshu.com/p/ab832f3fe81c</a>
 *
 * @author sangww
 * @since 2022/10/14 15:19
 */
@Slf4j
@Component
@MappedTypes(value = {Integer[].class})
@MappedJdbcTypes(value = {JdbcType.VARCHAR}, includeNullJdbcType = true)
public class IntegerArrayJsonTypeHandler extends ArrayObjectJsonTypeHandler<Integer> {
    public IntegerArrayJsonTypeHandler() {
        super(Integer[].class);
    }
}

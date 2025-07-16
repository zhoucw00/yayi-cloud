package com.yayi.cloud.module.infra.dal.mysql.db;

import com.yayi.cloud.framework.mybatis.core.mapper.BaseMapperX;
import com.yayi.cloud.module.infra.dal.dataobject.db.DataSourceConfigDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源配置 Mapper
 *
 * @author yayi
 */
@Mapper
public interface DataSourceConfigMapper extends BaseMapperX<DataSourceConfigDO> {
}

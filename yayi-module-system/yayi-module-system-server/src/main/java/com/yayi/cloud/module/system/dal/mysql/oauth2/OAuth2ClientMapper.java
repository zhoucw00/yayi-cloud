package com.yayi.cloud.module.system.dal.mysql.oauth2;

import com.yayi.cloud.framework.common.pojo.PageResult;
import com.yayi.cloud.framework.mybatis.core.mapper.BaseMapperX;
import com.yayi.cloud.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.yayi.cloud.module.system.controller.admin.oauth2.vo.client.OAuth2ClientPageReqVO;
import com.yayi.cloud.module.system.dal.dataobject.oauth2.OAuth2ClientDO;
import org.apache.ibatis.annotations.Mapper;


/**
 * OAuth2 客户端 Mapper
 *
 * @author yayi
 */
@Mapper
public interface OAuth2ClientMapper extends BaseMapperX<OAuth2ClientDO> {

    default PageResult<OAuth2ClientDO> selectPage(OAuth2ClientPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<OAuth2ClientDO>()
                .likeIfPresent(OAuth2ClientDO::getName, reqVO.getName())
                .eqIfPresent(OAuth2ClientDO::getStatus, reqVO.getStatus())
                .orderByDesc(OAuth2ClientDO::getId));
    }

    default OAuth2ClientDO selectByClientId(String clientId) {
        return selectOne(OAuth2ClientDO::getClientId, clientId);
    }

}

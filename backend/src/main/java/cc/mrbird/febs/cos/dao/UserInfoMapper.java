package cc.mrbird.febs.cos.dao;

import cc.mrbird.febs.cos.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    /**
     * 获取用户信息
     *
     * @param userInfo 用户信息
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> selectUserList(@Param("userInfo") UserInfo userInfo);
}

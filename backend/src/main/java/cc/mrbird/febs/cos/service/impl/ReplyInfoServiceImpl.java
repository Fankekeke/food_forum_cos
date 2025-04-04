package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.entity.ReplyInfo;
import cc.mrbird.febs.cos.dao.ReplyInfoMapper;
import cc.mrbird.febs.cos.service.IReplyInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
@Service
public class ReplyInfoServiceImpl extends ServiceImpl<ReplyInfoMapper, ReplyInfo> implements IReplyInfoService {

    @Override
    public IPage<LinkedHashMap<String, Object>> replyInfoByPage(Page page, ReplyInfo replyInfo) {
        return baseMapper.replyInfoByPage(page, replyInfo);
    }

    @Override
    public List<LinkedHashMap<String, Object>> replyListByPostId(Integer postId) {
        return baseMapper.replyListByPostId(postId);
    }

    /**
     * 获取用户回复信息
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> replyListByUserId(Integer userId) {
        return baseMapper.replyListByUserId(userId);
    }
}

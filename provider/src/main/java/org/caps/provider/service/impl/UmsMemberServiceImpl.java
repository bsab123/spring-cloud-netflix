package org.caps.provider.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.caps.provider.domain.UmsMember;
import org.caps.provider.mapper.UmsMemberMapper;
import org.caps.provider.service.UmsMemberService;
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService{
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    /*@Override
    public IPage<UmsMember> page(IPage<UmsMember> page) {
        return umsMemberMapper.selectPage(page,null);
    }*/
}

package com.blog.service.impl;

import com.blog.entity.TBlog;
import com.blog.mapper.TBlogMapper;
import com.blog.service.TBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李昶
 * @since 2022-05-31
 */
@Service
public class TBlogServiceImpl extends ServiceImpl<TBlogMapper, TBlog> implements TBlogService {

}

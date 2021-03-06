package com.fanxuankai.boot.canal.rabbit;

import com.fanxuankai.boot.canal.mq.common.domain.User;
import com.fanxuankai.boot.canal.mq.common.service.UserService;
import com.fanxuankai.commons.util.MockUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.stream.Collectors;

/**
 * @author fanxuankai
 */
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserService userService;

    @Test
    public void saveAll() {
        userService.saveBatch(MockUtils.mock(0, 100000, User.class)
                .stream()
                .peek(user -> {
                    user.setId(null);
                    user.setDeleted(false);
                    user.setCreateDate(null);
                    user.setLastModifiedDate(null);
                })
                .collect(Collectors.toList()));
    }
}

package top.zyz.boot.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.zyz.boot.mp.entity.UserDO;


/**
 * @author JXS
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}

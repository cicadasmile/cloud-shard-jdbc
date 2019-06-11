package cloud.shard.provider.mapper;

import org.apache.ibatis.annotations.Param;
import shard.jdbc.common.entity.TableTwo;
import shard.jdbc.common.entity.TableTwoExample;

import java.util.List;

public interface TableTwoMapper {

    TableTwo selectTwoByPhone(@Param("phone") String phone) ;

    int countByExample(TableTwoExample example);

    int deleteByExample(TableTwoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableTwo record);

    int insertSelective(TableTwo record);

    List<TableTwo> selectByExample(TableTwoExample example);

    TableTwo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableTwo record, @Param("example") TableTwoExample example);

    int updateByExample(@Param("record") TableTwo record, @Param("example") TableTwoExample example);

    int updateByPrimaryKeySelective(TableTwo record);

    int updateByPrimaryKey(TableTwo record);
}
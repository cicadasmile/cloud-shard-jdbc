package cloud.shard.provider.mapper;

import shard.jdbc.common.entity.TableThree;
import shard.jdbc.common.entity.TableThreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableThreeMapper {
    int countByExample(TableThreeExample example);

    int deleteByExample(TableThreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableThree record);

    int insertSelective(TableThree record);

    List<TableThree> selectByExample(TableThreeExample example);

    TableThree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableThree record, @Param("example") TableThreeExample example);

    int updateByExample(@Param("record") TableThree record, @Param("example") TableThreeExample example);

    int updateByPrimaryKeySelective(TableThree record);

    int updateByPrimaryKey(TableThree record);
}
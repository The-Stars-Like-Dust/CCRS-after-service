package top.TheStarsLikeDust.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.theStarsLikeDust.generator.entity.Alarm;

/**
 * @author 86175
 * @description 针对表【alarm】的数据库操作Service
 * @createDate 2024-03-05 17:03:54
 */
public interface AlarmService extends IService<Alarm> {

    /**
     * 添加报警信息
     */
    void addAlarm(Alarm alarm);

    /**
     * 删除报警信息
     */
    void delAlarm(Integer id);

    /**
     * 更新报警信息
     */
    void updateAlarm(Alarm alarm);

    /**
     * 根据ID进行查询报警信息
     */
    Alarm findAlarmById(Integer id);

    /**
     * 查询所有报警信息
     */
    Iterable<Alarm> findAllAlarms();
}

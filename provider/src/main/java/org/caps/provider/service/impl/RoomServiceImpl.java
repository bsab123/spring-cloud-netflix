package org.caps.provider.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.caps.provider.domain.Room;
import org.caps.provider.mapper.RoomMapper;
import org.caps.provider.service.RoomService;
@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService{

}

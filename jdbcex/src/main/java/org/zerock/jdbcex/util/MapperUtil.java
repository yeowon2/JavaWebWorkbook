package org.zerock.jdbcex.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;

public enum MapperUtil {
    // ModelMapper의 설정을 변경하고 쉽게 사용할 수 있는 MapperUtil을 enum으로 생성함
    // ModelMapper 설정을 변경하려면 getConfiguration()을 이용해서 private로 선언된 필드도 접근 가능하도록
    // 설정을 변경하고 get()을 이용해서 ModelMapper를 사용할 수 있도록 구성함
    INSTANCE;

    private ModelMapper modelMapper;

    MapperUtil(){
        this.modelMapper = new ModelMapper();
        this.modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies. STRICT);
    }

    public ModelMapper get(){
        return modelMapper;
    }
}

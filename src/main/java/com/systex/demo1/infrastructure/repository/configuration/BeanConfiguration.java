package com.systex.demo1.infrastructure.repository.configuration;


import com.systex.demo1.domain.common.repository.PointTypeRepository;
import com.systex.demo1.domain.common.service.PointTypeService;
import com.systex.demo1.domain.common.service.PointTypeServiceImpl;
import com.systex.demo1.infrastructure.repository.PointTypeMemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    PointTypeService pointTypeService(PointTypeRepository repository) {
        return new PointTypeServiceImpl(repository);
    }
    @Bean
    PointTypeRepository pointTypeRepository() {
        return new PointTypeMemRepository();
    }


}
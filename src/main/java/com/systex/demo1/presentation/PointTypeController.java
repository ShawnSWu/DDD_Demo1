package com.systex.demo1.presentation;

import com.systex.demo1.application.rest.request.CreatePointTypeRequest;
import com.systex.demo1.application.rest.response.CreatePointTypeResponse;
import com.systex.demo1.application.rest.response.ListPointTypeResponse;
import com.systex.demo1.domain.PointType;
import com.systex.demo1.domain.common.service.PointTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/points")
@Slf4j
public class PointTypeController {
    @Autowired
    private PointTypeService pointTypeService;
    @PostMapping
    CreatePointTypeResponse createPointType(@RequestBody CreatePointTypeRequest request) {
        log.info("body {}",request);
        PointType type = new PointType(request.getType(), request.getDescription());
        UUID id = pointTypeService.createPointType(type);
        return new CreatePointTypeResponse(id);
    }

    @GetMapping("/list")
    ListPointTypeResponse listPointType() {
        ListPointTypeResponse response = new ListPointTypeResponse();
        response.setPointTypes(pointTypeService.allTypes());
        return response;
    }
}

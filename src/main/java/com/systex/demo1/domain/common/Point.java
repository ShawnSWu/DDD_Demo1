package com.systex.demo1.domain.common;

import com.systex.demo1.domain.PointStatus;
import com.systex.demo1.domain.PointType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Point {
    PointType type;
    PointStatus status;
    float value;
}
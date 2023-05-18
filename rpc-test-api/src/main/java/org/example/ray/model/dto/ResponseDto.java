package org.example.ray.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhoulei
 * @create 2023/5/18
 * @description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResponseDto implements Serializable {

    private static final long serialVersionUID = -4647269513385969640L;

    public String addResult;

    public String multipleResult;
}

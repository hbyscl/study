package org.cheng.study.es.web.controller;


import org.cheng.study.es.web.controller.dto.JsonRetDto;
import org.cheng.study.es.web.controller.dto.JsonRetPageDto;
import org.cheng.study.es.web.controller.dto.PageInfoDto;

public class BaseController {

    private JsonRetDto dto;

    protected JsonRetDto setData(Object data) {
        dto = new JsonRetDto();
        dto.setData(data);
        return dto;
    }

    protected JsonRetPageDto setPage(int page, int size, long totalCount, Object data){
        JsonRetPageDto dto = new JsonRetPageDto();
        dto.setData(data);
        PageInfoDto pageInfoDto = new PageInfoDto();
        pageInfoDto.setSize(size);
        pageInfoDto.setPage(page);
        pageInfoDto.setTotalCount(totalCount);
        pageInfoDto.setTotalPage(totalCount % size == 0 ? totalCount/size : (totalCount/size+1));
        dto.setPage(pageInfoDto);
        return dto;
    }

    protected JsonRetDto setErr(int code, String msg) {
        dto = new JsonRetDto();
        dto.setCode(code);
        dto.setMsg(msg);
        dto.setData("");
        return dto;
    }


}

package io.github.nnkwrik.imservice.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import io.github.nnkwrik.common.dto.SimpleGoods;
import io.github.nnkwrik.common.dto.SimpleUser;
import io.github.nnkwrik.imservice.model.po.History;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 聊天框页面
 *
 * @author nnkwrik
 * @date 18/12/07 22:33
 */
@Data
public class ChatForm {

    /*对方用户信息*/
    private SimpleUser otherSide;

    /*与本次聊天相关的商品的信息*/
    private SimpleGoods goods;

    /*当前用户是否时u1*/
    private Boolean isU1;

    /*聊天记录*/
    private List<History> historyList;

    /*本次展示的聊天记录中最早一条的发送时间,用于上拉获取更早之前的聊天记录时使用.设置为ISO8601能传递更准确的时间*/
    @JsonFormat(pattern = StdDateFormat.DATE_FORMAT_STR_ISO8601)
    private Date offsetTime;
}

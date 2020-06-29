package com.cmpay.ozy.enums;

import com.cmpay.lemon.common.AlertCapable;


/**
 * @author lihuiquan
 */
public enum MsgEnum implements AlertCapable {
    /**
     * 成功
     */
    SUCCESS("MON00000", "交易成功"),
    /**
     * 成功
     */
    FAIL("MON40000", "交易失败");

    /**
     *msgCd
     */
    private String msgCd;
    /**
     * msgInfo
     */
    private String msgInfo;

    MsgEnum(String msgCd, String msgInfo) {
        this.msgCd = msgCd;
        this.msgInfo = msgInfo;
    }

    /**
     * @return
     */
    @Override
    public String getMsgCd() {
        return msgCd;
    }

    /**
     * @return
     */
    @Override
    public String getMsgInfo() {
        return msgInfo;
    }
}

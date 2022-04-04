package com.smartfrank.pattern.factory.method.model;

/**
 * Description: 返回结果
 * <br/>
 * TaoBaoCouponResult
 *
 * @author laiql
 * @date 2021/3/5 4:16 下午
 */
public class TaoBaoCouponResult {

    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String info;

    public TaoBaoCouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

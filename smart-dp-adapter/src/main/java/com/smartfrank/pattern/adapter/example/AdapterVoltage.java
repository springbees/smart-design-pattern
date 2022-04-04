package com.smartfrank.pattern.adapter.example;

/**
 * Description: 适配电压
 * <br/>
 * AdapterVoltage
 *
 * @author laiql
 * @date 2021/10/25 19:19
 */
public class AdapterVoltage implements TargetVoltage {

    private static final Integer adapterVoltage = 110;
    /**
     * 关联适配的类
     */
    private SourceVoltage sourceVoltage;

    public AdapterVoltage(SourceVoltage sourceVoltage) {
        this.sourceVoltage = sourceVoltage;
    }

    @Override
    public Integer convert() {
        //源电压
        Integer source = this.sourceVoltage.outVoltage();
        //目标电压
        Integer target = source - adapterVoltage;
        return target;
    }
}

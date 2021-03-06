package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author:ALi
 * @Description:
 * @Date:
 */
public class SupPriceBySeriesGetRequest extends AbstractRequest {
    private static final long serialVersionUID = -3101956261800131597L;
    @NotNull(message = "行号不能为空！")
    private String series;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}

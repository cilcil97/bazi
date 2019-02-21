package com.EsportLeagueStats.ESLS.web.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CreateLigaSezonaRequest {

    private Integer sezonaId;
    private List<Integer> ligi;

    @JsonCreator
    public CreateLigaSezonaRequest(@JsonProperty("ligi") List<Integer> ligi,
                                   @JsonProperty("sezonaId") Integer sezonaId) {
        this.ligi = ligi;
        this.sezonaId = sezonaId;
    }

    public Integer getSezonaId() {
        return sezonaId;
    }

    public void setSezonaId(Integer sezonaId) {
        this.sezonaId = sezonaId;
    }

    public List<Integer> getLigi() {
        return ligi;
    }

    public void setLigi(List<Integer> ligi) {
        this.ligi = ligi;
    }
}

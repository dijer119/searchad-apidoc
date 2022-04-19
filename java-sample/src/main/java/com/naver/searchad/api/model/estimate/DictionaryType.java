package com.naver.searchad.api.model.estimate;

public enum DictionaryType {
    SCHEDULE("SD"), // 요일/시간
    GENDER("GN"), // 성별
    AGE("AG"), // 연령대
    REGIONAL("RL"), // 지역
    PROXIMITY("RP"), // 반경
    ALL_REGIONAL("ALL_REGIONAL"); // 지역 +  반경

    private final String type;

    private DictionaryType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}

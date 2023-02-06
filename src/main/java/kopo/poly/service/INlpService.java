package kopo.poly.service;

import java.util.List;

public interface INlpService {

    /**
     * 분석할 문장의 형태소별 품사 분석 결과 가져오기
     *
     * @param text 분석할 문장
     */
    String getPlainText(String text);

    /**
     * 분석할 문장의 형태소 중 명사만 가져오기
     *
     * @param text 분석할 문장
     * @return 명사 결과는 여러 개가 추출되기에 1차원 배열 구조인 List 사용
     */
    List<String> getNouns(String text);

}

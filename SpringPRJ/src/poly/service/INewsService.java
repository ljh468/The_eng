package poly.service;


import java.util.List;

import poly.dto.MongoNewsDTO;
import poly.dto.NewsDTO;

public interface INewsService {
	

	// 저장된 뉴스 DB에서 가져오기
	List<NewsDTO> getNewsInfoFromDB();
	
	// 웹크롤링한 뉴스 DB에 저장하기
	int SaveNews(String title, String inputText, String newsUrl, String newsname) throws Exception;
	// 웹크롤링 스케쥴링
	void scheduleCrawl() throws Exception;



	
}
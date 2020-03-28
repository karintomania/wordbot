package com.example.wordbot;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WordMapper{

	@Select("SELECT * FROM word_master WHERE id = #{id}")
	public Word findOneById(int id);

	@Select("SELECT COUNT(*) FROM word_master")
	public int countRecordNum();
}
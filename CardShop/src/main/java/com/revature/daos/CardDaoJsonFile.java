package com.revature.daos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.revature.models.Card;

public class CardDaoJsonFile implements CardDao {

	@Override
	public void save(Card c) {
		ObjectMapper om = new ObjectMapper();
		ObjectWriter writer = om.writer(new DefaultPrettyPrinter());
		List<Card> cards = findAll();
		cards.add(c);
		try {
			writer.writeValue(new File("data.txt"), cards);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Card c) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Card> findAll() {
		ObjectMapper om = new ObjectMapper();
		try {
			List<Card> cards = om.readValue(new File("data.txt"), new TypeReference<List<Card>>() {
			});
			return cards;
		} catch (IOException e) {
			return new ArrayList<>();
		}

	}

	@Override
	public List<Card> findByGame(String game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Card> findByValue(double minimum, double maximum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Card> findByNameContains(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

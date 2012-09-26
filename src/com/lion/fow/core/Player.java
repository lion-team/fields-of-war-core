package com.lion.fow.core;

import java.util.ArrayList;
import java.util.List;

public class Player {
	/**
	 * \brief Players colors
	 */
	public enum E_Color {
		BLUE,
		RED,
		GREEN,
		YELLOW
	};
	
	private static final int	START_GOLD = 500;
	
	private String				name;		///< \brief Name
	private E_Color				color;		///< \brief Color
	private int					gold;		///< \brief Current gold stock
	private AUnit				king;		///< \brief King
	private List<AUnit>			units;		///< \brief List of units
	private List<ABuilding>		buildings;	///< \brief List of buildings
	
	public Player(String name, E_Color color) {
		this.name = name;
		this.color = color;
		this.gold = START_GOLD;
		this.king = null;
		this.units = new ArrayList<AUnit>();
		this.buildings = new ArrayList<ABuilding>();
	}
	
	public void earnGold(int amount) {
		gold += amount;
	}
	
	public boolean spendGold(int amount) {
		if (amount > gold)
			return false;

		gold -= amount;
		return true;
	}
	
	public void onTurnBegan(Player current) {
		// TODO : iterate over buildings and earn gold
	}
	
	public void onTurnEnded(Player current) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public E_Color getColor() {
		return color;
	}
	public void setColor(E_Color color) {
		this.color = color;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public AUnit getKing() {
		return king;
	}
	public void setKing(AUnit king) {
		this.king = king;
	}
	public List<AUnit> getUnits() {
		return units;
	}
	public void setUnits(List<AUnit> units) {
		this.units = units;
	}
	public List<ABuilding> getBuildings() {
		return buildings;
	}
	public void setBuildings(List<ABuilding> buildings) {
		this.buildings = buildings;
	}
}

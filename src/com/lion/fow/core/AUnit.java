package com.lion.fow.core;

public abstract class AUnit {
	private Player	owner;		///< \brief Owner
	private int		hp;			///< \brief Health points
	private int		hpMax;		///< \brief Maximum health points
	private int		level;		///< \brief Level
	private int		ap;			///< \brief Action points
	
	/**
	 * \brief Creates a new unit
	 *
	 * \param owner Unit's owner
	 * \param hp Unit's health points
	 */
	public AUnit(Player owner, int hp) {
		this.owner = owner;
		this.hp = hp;
		this.hpMax = hp;
		this.ap = 0;
		this.level = 0;
	}
	
	public void onTurnBegan(Player current) {
		if (current.equals(owner))
			ap = getApMax();
	}
	
	public void onTurnEnded(Player current) {
		
	}
	
	public abstract int getApMax();
	
	public void heal(int amount) {
		hp = hp + amount > hpMax ? hpMax : hp + amount;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}
}

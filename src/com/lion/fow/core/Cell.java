package com.lion.fow.core;

public class Cell {
		/**
		 * \brief Terrain type
		 */
		public enum E_TerrainType {
			GRASS,
			ROCK,
			CASTLE,
			TOWER,
			HOUSE,
			WATER,
			WOOD,
			ROAD_H,
			ROAD_V,
			BRIDGE_H,
			BRIDGE_V
		}

		private int				x;			///< \brief X coordinate
		private int				y;			///< \brief Y coordinate
		private E_TerrainType	type;		///< \brief Terrain type
		private ABuilding		building;	///< \brief Building, if any
		private AUnit			unit;		///< \brief Current unit on the cell. \c null if no unit.

		/**
		 * \brief Creates an empty cell
		 *
		 * \param x		X coordinate
		 * \param y		Y coordinate
		 * \param type	Terrain type
		 */
		public Cell(int x, int y, E_TerrainType type) {
			this.x = x;
			this.y = y;
			this.type = type;
			this.building = null;
			this.unit = null;
		}
		
		/**
		 * \brief Indicates if the cell is busy
		 *
		 * \return \c true if there is a unit on the cell, \c false otherwise
		 */
		public boolean busy() {
			return unit != null;
		}
		
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public E_TerrainType getType() {
			return type;
		}

		public void setType(E_TerrainType type) {
			this.type = type;
		}

		public ABuilding getBuilding() {
			return building;
		}

		public void setBuilding(ABuilding building) {
			this.building = building;
		}

		public AUnit getUnit() {
			return unit;
		}

		public void setUnit(AUnit unit) {
			this.unit = unit;
		}
}
